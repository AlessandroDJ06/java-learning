package week4;
import java.util.Scanner;
public class Lamp {
    private String lampAan;

    public void setLampAan(){
        this.lampAan = "aan";
    }
    public void setLampUit(){
        this.lampAan = "uit";
    }
    public String getLampStatus(){
        return this.lampAan;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lamp keukenLamp = new Lamp();
        Lamp livingLamp = new Lamp();
        Lamp slaapKamerLamp = new Lamp();
        int keuze = 0;

        while(keuze != 5){
            System.out.print("\n\nwat wil je doen?\n1 alle lampen aan\2 alle lampen uit\n3  Living en keuken aan (slaapkamer gaat uit)\n4  Slaapkamer aan (living en keuken gaan uit)\n5  Stoppen\njouw keuze: ");
            keuze = scanner.nextInt();

            if(keuze > 5){
                System.out.println("Keuze niet in lijst, geef nieuwe keuze: ");
                keuze = scanner.nextInt();

            } else {
                switch (keuze){
                    case 1 ->{
                        keukenLamp.setLampAan();
                        livingLamp.setLampAan();
                        slaapKamerLamp.setLampAan();
                        System.out.println("-lamp living: "+ livingLamp.getLampStatus() +"\n-lamp keuken: "+keukenLamp.getLampStatus() + "\n-lamp slaapkamer: "+ slaapKamerLamp.getLampStatus());
                    }
                    case 2 ->{
                        keukenLamp.setLampUit();
                        livingLamp.setLampUit();
                        slaapKamerLamp.setLampUit();
                        System.out.println("-lamp living: "+ livingLamp.getLampStatus() +"\n-lamp keuken: "+keukenLamp.getLampStatus() + "\n-lamp slaapkamer: "+ slaapKamerLamp.getLampStatus());
                    }
                    case 3 ->{
                        keukenLamp.setLampAan();
                        livingLamp.setLampAan();
                        slaapKamerLamp.setLampUit();
                        System.out.println("-lamp living: "+ livingLamp.getLampStatus() +"\n-lamp keuken: "+keukenLamp.getLampStatus() + "\n-lamp slaapkamer: "+ slaapKamerLamp.getLampStatus());
                    }
                    case 4 ->{
                        keukenLamp.setLampUit();
                        livingLamp.setLampUit();
                        slaapKamerLamp.setLampAan();
                        System.out.println("-lamp living: "+ livingLamp.getLampStatus() +"\n-lamp keuken: "+keukenLamp.getLampStatus() + "\n-lamp slaapkamer: "+ slaapKamerLamp.getLampStatus());
                    }
                }
            }



        }





    }
}
