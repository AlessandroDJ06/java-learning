package week4;

public class VanRechtsNaarLinks {
    public static void main(String[] args) {
        String arabicText = "مرحبا بك في عالم البرمجة"; // "Welkom in de wereld van programmeren"
        String englishText = "Learning Java with Arabic text.";
        String combined1 = arabicText + " " + englishText;
        System.out.println("Arabisch + Engels: " + combined1);

        String combined2 = englishText + " " + arabicText;
        System.out.println("Engels + Arabisch: " + combined2);

        String subArabic = arabicText.substring(0, 7);
        System.out.println("Substring: " + subArabic);

        System.out.println("Lengte van arabicText: " + arabicText.length());
        System.out.println("Lengte van englishText: " + englishText.length());


        System.out.println("\nArabische karakters:");
        for (int i = 0; i < arabicText.length(); i++) {
            System.out.println(arabicText.charAt(i));
        }

        System.out.println("\nEngelse karakters:");
        for (int i = 0; i < englishText.length(); i++) {
            System.out.println(englishText.charAt(i));
        }
    }
}
