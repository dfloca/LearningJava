package TDD;

import java.time.LocalDate;

public class CarOrder {
    private String year;
    private String vin;
    private LocalDate orderDate;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}