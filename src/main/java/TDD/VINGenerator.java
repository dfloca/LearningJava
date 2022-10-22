package TDD;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

public class VINGenerator {
    private static final Random RANDOM = new Random();
    private static final String VIN_FILE = "vin-prefixes.txt";
    private static final String ALLOWED_CHARS = "0123456789ABCDEFGHJKLMNPRSTUVWXYZ";
    private static final int LINES_IN_FILE = 62177;

    private static final int[] VIN_POSITION_WEIGHT = {8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2};
    private static final int[] VIN_LETTER_VALUE = {1, 2, 3, 4, 5, 6, 7, 8, 0, 1, 2, 3, 4, 5, 0, 7, 0, 9, 2, 3, 4, 5, 6, 7, 8, 9};


    public static String getRandomVin() throws URISyntaxException {
        final Vin vinYear = getRandomVinStart();
        final StringBuilder vinBuilder = new StringBuilder();

        vinBuilder.append(vinYear.getWmi());
        vinBuilder.append(vinYear.getVds());
        vinBuilder.append(getRandomVinChar());
        vinBuilder.append(vinYear.getYear());

        for (int i = 0; i < 7; i++) {
            vinBuilder.append(getRandomVinChar());
        }

        final String vin = vinBuilder.toString();

        try {
            final char checkSumChar = getVinCheckSumChar(vin);

            return vin.substring(0, 8) + Character.toString(checkSumChar) + vin.substring(9);
        } catch (InvalidObjectException ignored) {
            return null;
        }
    }

    private static Vin getRandomVinStart() throws URISyntaxException {
        final int lineToRead = RANDOM.nextInt(LINES_IN_FILE) + 1;

        try (final Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource(VIN_FILE).toURI()))){
            final String line = stream.skip(lineToRead)
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Problem occurred while reading line " + lineToRead + " from " + VIN_FILE));

            final String[] fields = line.split(" {3}");

            return new Vin(fields[0].trim(), fields[1].trim(), fields[2].trim());
        } catch (URISyntaxException | IOException | SecurityException e) {
            throw new RuntimeException("Problem occurred while reading " + VIN_FILE, e);
        }
    }

    private static char getRandomVinChar() {
        return ALLOWED_CHARS.charAt(RANDOM.nextInt(ALLOWED_CHARS.length()));
    }

    private static char getVinCheckSumChar(String vin) throws InvalidObjectException {
        final int checkSum = getVinCheckSum(vin);

        if (checkSum == 10) {
            return 'X';
        }
        else {
            return (char) (checkSum + '0');
        }
    }

    private static int getVinCheckSum(String vin) throws InvalidObjectException {
        final String normalized = normalizeVin(vin);

        int sum = 0;

        for (int i = 0; i < 17; i++) {
            char key = normalized.charAt(i);

            int value = 0;
            if (key >= 'A' && key <= 'Z') {
                value = VIN_LETTER_VALUE[key - 'A'];

                if (value == 0) {
                    throw new InvalidObjectException(String.format("Illegal character '%s' in VIN '%s' at position %d", key, normalized, i));
                }
            }
            else if (key >= '0' && key <= '9') {
                value = Character.getNumericValue(key);
            }
            else {
                throw new InvalidObjectException(String.format("Illegal character '%s' in VIN '%s' at position %d", key, normalized, i));
            }

            sum += value * VIN_POSITION_WEIGHT[i];
        }

        return sum % 11;
    }

    private static String normalizeVin(String vin) throws InvalidObjectException {
        if (vin == null) {
            throw new InvalidObjectException("VIN should not be null");
        }

        final String normalized = vin.toUpperCase().replaceAll("[^A-Z0-9]", "");

        if (normalized.length() != 17) {
            throw new InvalidObjectException("Length of VIN (without possible additional characters) should equal 17");
        }

        return normalized;
    }

    private static class Vin {
        private final String wmi;
        private final String vds;
        private final String year;

        Vin(String wmi, String vds, String year){
            this.wmi = wmi;
            this.vds = vds;
            this.year = year;
        }

        public String getWmi() {
            return wmi;
        }

        public String getVds() {
            return vds;
        }

        public String getYear() {
            return year;
        }
    }
}
