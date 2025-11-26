public class Oefening1 {
    public static void main(String[] args) {
        String zin = "Java leer je niet in een twee drie";
        String[] lijst = zin.split(" ");

        for (String s : lijst){
            System.out.println(s);
        }
    }
}
