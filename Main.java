import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Set<Laptop> laptops = new HashSet<>();
        
        Laptop lt0 = new Laptop("Aplle Air UltraMegaMax Pro", "Golden", "MacOS", 8, 512);
        Laptop lt1 = new Laptop("Gigabyte G5", "Black", "Windows 10", 16, 512);
        Laptop lt2 = new Laptop("Asus a515", "White", "Ubuntu 20.04.4", 4, 256);

        laptops.add(lt0);
        laptops.add(lt1);
        laptops.add(lt2);

        System.out.println(laptops);
    }
}