import java.util.HashSet;
import java.util.Scanner;
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

        getCriterionUser();
    }

    public static void getCriterionUser(){
        Scanner scanner = new Scanner(System.in);
        try {
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        
        while (true) {
            System.out.println("Введите номер интересующего критерия: \n 1.Модель;\n 2.Цвет;\n 3.Операционная система;\n 4.Объем оперативной памяти;\n 5.Объем жесткого диска;");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Введите номер интересующей модели: \n 1.Aplle Air UltraMegaMax Pro;\n 2.Gigabyte G5;\n 3.Asus a515;\n");
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            break;
                        case 3:
                            System.out.println();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Введите номер интересующего цвета: \n 1.Золотой;\n 2.Черный;\n 3.Белый;\n");
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            break;
                        case 3:
                            System.out.println();
                            break;
                    }
                case 3:
                    System.out.println("Введите номер интересующего цвета: \n 1.Золотой;\n 2.Черный;\n 3.Белый;\n");
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            break;
                        case 3:
                            System.out.println();
                            break;
                    }
                case 4:
                    break;
                case 5:
                    break;
                }
        }

    }
}