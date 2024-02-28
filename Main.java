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

class Laptop {
    private String model;
    private String color;
    private String os;
    private int ram;
    private int hdd;

    public Laptop(String model, String color, String os, int ram, int hdd){
        this.model = model;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public String getOs(){
        return os;
    }

    public int getRam(){
        return ram;
    }

    public int getHdd(){
        return hdd;
    }
}