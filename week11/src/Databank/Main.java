package Databank;

public class Main {
    public static void main(String[] args) {
        Patiënten patiënten = new Patiënten();
        Huisartsen huisartsen = new Huisartsen();

        Huisarts huisarts = new Huisarts("Paulien Vermeiren");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Haron Verheyen");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Nikolai Van Wouwe");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Matthieu Saleh");
        huisartsen.insert(huisarts);

        Patiënt patiënt  = new Patiënt("Flor Wan");
        patiënt.setHuisartsId(0);
        patiënten.insert(patiënt);
        patiënt  = new Patiënt("Bart Matondo");
        patiënt.setHuisartsId(3);
        patiënten.insert(patiënt);
        patiënt  = new Patiënt("Elias Magnus");
        patiënt.setHuisartsId(2);
        patiënten.insert(patiënt);
        patiënt  = new Patiënt("Kevin Koch");
        patiënt.setHuisartsId(1);
        patiënten.insert(patiënt);
        patiënt  = new Patiënt("Lien Krasnovitski");
        patiënt.setHuisartsId(0);
        patiënten.insert(patiënt);
        patiënt  = new Patiënt("Kay Adib");
        patiënt.setHuisartsId(6);
        patiënten.insert(patiënt);

        for (int key : patiënten.getPatiënten().keySet()){
            if (patiënten.findById(key).getHuisartsId() == -1 || patiënten.findById(key).getHuisartsId() > huisartsen.getArtsen().size()){
                String name = patiënten.findById(key).getName();
                System.out.println((patiënten.delete(key))? String.format("Patient %s is verwijderd aangezien ze geen geldige huisarts heeft",name)
                        :String.format("Patient met naam %s moet verwijderd worden maar verwijderen is mislukt",name));
            }
        }

        System.out.println("Alle Patiënten: ");
        System.out.printf("%-9s| %-21s| %-20s%n","ID","NAAM","HUISARTS");
        System.out.print("-----------------------------------------------------");
        for (int key : patiënten.getPatiënten().keySet()){
            int huisartsKey = patiënten.getPatiënten().get(key).getHuisartsId();
            System.out.printf("\n%9s| %-21s| %-20s",
                    key,
                    patiënten.getPatiënten().get(key).getName(),
                    huisartsen.getArtsen().get(huisartsKey).getName());
        }


        System.out.println("\nAlle Patiënten bij P. Vermeiren: ");
        System.out.printf("%-9s| %-21s| %-20s%n","ID","NAAM","HUISARTS");
        System.out.print("-----------------------------------------------------");
        int huisartsKey = 0;
        for (int key : huisartsen.getArtsen().keySet()){
            if (huisartsen.getArtsen().get(key).getName().equals("Paulien Vermeiren")){
                huisartsKey = key;
                break;
            }
        }

        for (Patiënt patient : patiënten.findByHuisarts(huisartsKey)){
            System.out.printf("\n%9d| %-21s| %-20s",patient.getId(),patient.getName(),huisartsen.getArtsen().get(huisartsKey).getName());
        }


    }
}
