package Woordenboek;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String,String> words;

    public Dictionary(){
        this.words = new HashMap<>();
    }

    public void addWord(String word,String translation){
        words.put(word,translation);
    }

    public String translate(String word){
        return words.getOrDefault(word,"Woord niet in woordenboek");
    }

    public int numberOfWords(){
        return words.size();
    }
}
