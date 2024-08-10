package entities;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct() {
        super();
    }
    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        this.name = name;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return name + " (used) " + "$ " + String.format("%.2f",price) + " ( Manufacture date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " )";
    }
}
