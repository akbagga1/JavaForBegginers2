import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);
    }
}
