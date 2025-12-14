package Woordenboek;

public class DictionaryCreator {
    public static Dictionary createFinnishDictionary() {
        Dictionary finnish = new Dictionary();
        finnish.addWord("een", "yksi");
        finnish.addWord("twee", "kaksi");
        finnish.addWord("drie", "kolme");
        finnish.addWord("vier", "neljä");
        finnish.addWord("vijf", "viisi");
        finnish.addWord("zes", "kuusi");
        finnish.addWord("zeven", "seitsemän");
        finnish.addWord("acht", "kahdeksan");
        finnish.addWord("negen", "yhdeksän");
        finnish.addWord("tien", "kymmenen");
        return finnish;
    }
}