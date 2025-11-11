package Letterfrequenties;

public class CharacterFrequencies {
    private final int LENGTE_ALFABET_ARRAY = 26;
    private final char[] ALFABET = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private final int ROW_LENGHT = 6;
    private int[] frequentie = new int[LENGTE_ALFABET_ARRAY];


    public void adaptFrequencies(String sentence){
        sentence = sentence.toLowerCase();
        for (int i = 0 ; i < LENGTE_ALFABET_ARRAY;i++){
            for (int j = 0; j < sentence.length();j++){
                if (ALFABET[i] == sentence.charAt(j)){
                    frequentie[i] ++;
                }
            }
        }

    }

    public void printFrequencies(){
        StringBuilder sb = new StringBuilder();
        int currentPosition = 0;

        for (int i = 0; i < LENGTE_ALFABET_ARRAY; i++){
            if (currentPosition < ROW_LENGHT){
                sb.append(ALFABET[i]).append(" --> ").append(frequentie[i]).append("x ");
                currentPosition++;
            } else {
                sb.append("\n");
                currentPosition = 0;
            }
        }
        System.out.println(sb);
    }
}
