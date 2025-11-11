package KaartSpelletjes;

public class Main {
    public static void main(String[] args) {
        String[] suits = { "Harten", "Schoppen", "Ruiten", "Klaveren" };
        String[] values = {
                "Aas", "Twee", "Drie", "Vier", "Vijf",
                "Zes", "Zeven", "Acht", "Negen", "Tien",
                "Boer", "Dame", "Heer"
        };

        // Vul hier aan
        Card kaarten = new Card();
        kaarten.setSuit(suits);
        kaarten.setValue(values);


        System.out.println(kaarten.showCards(kaarten.createCards(1)));
        System.out.println("\n\n");
        System.out.println(kaarten.showCards(kaarten.createCards(5)));
    }
}
