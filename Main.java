import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Aplle Air UltraMegaMax Pro", "Golden", "MacOS", 8, 512));
        laptops.add(new Laptop("Gigabyte G5", "Black", "Windows 10", 16, 512));
        laptops.add(new Laptop("Asus a515", "White", "Ubuntu 20.04.4", 4, 256));

        System.out.println(laptops);
    }
}