package ModelBouwClub;

public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("Kris", 123456);
        Member member2 = new Member("Jan", 123456);
        if (member1.equals(member2)) {
            System.out.printf("De leden %s en %s zijn gelijk%n", member1, member2);
        } else {
            System.out.printf("De leden %s en %s zijn niet gelijk%n", member1, member2);
        }

        Member member3 = new BoardMember("Piet", 456789, "penningmeester");
        Member member4 = new BoardMember("Joris", 456789, "voorzitter");
        if (member3.equals(member4)) {
            System.out.printf("De leden %s en %s zijn gelijk\n", member3, member4);
        } else {
            System.out.printf("De leden %s en %s zijn niet gelijk\n", member3, member4);
        }




        Member member5 = new NormalMember("Joris", 456789, "vliegtuigbouw");
        if (member4.equals(member5)) {
            System.out.printf("De leden %s en %s zijn gelijk\n", member4, member5);
        } else {
            System.out.printf("De leden %s en %s zijn niet gelijk\n", member4, member5);
        }



        Member member6 = new NormalMember("Jan", 123456, "motorbouw");
        if (member6.equals(member1)) {
            System.out.printf("De leden %s en %s zijn gelijk\n", member6, member1);
        } else {
            System.out.printf("De leden %s en %s zijn niet gelijk\n", member6, member1);

    }
}
}
