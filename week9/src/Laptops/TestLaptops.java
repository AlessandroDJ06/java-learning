package Laptops;
import static Laptops.Brand.*;
import static Laptops.CpuType.*;
import static Laptops.CpuGeneration.*;


public class TestLaptops {
    public static void main(String[] args) {
        Laptops laptops = new Laptops();
        laptops.addLaptop(new Laptop("Kris", IVY_BRIDGE, I7, 16, 256, APPLE));
        laptops.addLaptop(new Laptop("Paulien", HASWELL, I3, 8, 128, TOSHIBA));
        laptops.addLaptop(new Laptop("Kay", BROADWELL, I5, 16, 512, ACER));
        laptops.addLaptop(new Laptop("Divine", KABYLAKE, I5, 32, 1024, DELL));
        laptops.addLaptop(new Laptop("Mohamed", KABYLAKE, null, 16, 512, null));

        System.out.println("er zijn " + laptops.getAmount() + " Laptops.");

        for (int i = 0 ; i < laptops.getAmount(); i++ ){
            System.out.println(laptops.getLaptop(i));
        }
    }


}