package Acteur;

import java.util.*;

public class TestActor {
    private static final Actor[] testdata = {
            new Actor("Cameron Diaz", 1972),
            new Actor("Anna Faris", 1976),
            new Actor("Angelina Jolie", 1975),
            new Actor("Jennifer Lopez", 1970),
            new Actor("Reese Witherspoon", 1976),
            new Actor("Neve Campbell", 1973),
            new Actor("Catherine Zeta-Jones", 1969),
            new Actor("Kirsten Dunst", 1982),
            new Actor("Kate Winslet", 1975),
            new Actor("Gina Philips", 1975),
            new Actor("Shannon Elisabeth", 1973),
            new Actor("Carmen Electra", 1972),
            new Actor("Drew Barrymore", 1975),
            new Actor("Elisabeth Hurley", 1965),
            new Actor("Tara Reid", 1975),
            new Actor("Katie Holmes", 1978),
            new Actor("Anna Faris", 1976)
    };

    public static void main(String[] args) {
        Actor reese = new Actor("Reese Witherspoon", 1976);
        Actor drew = new Actor("Drew Barrymore", 1975);
        Actor anna = new Actor("Anna Faris", 1976);
        Actor thandie = new Actor("Thandie Newton", 1972);

        List<Actor> actors = new ArrayList<>();
        actors.addAll(Arrays.asList(testdata));
        actors.add(reese);
        actors.add(drew);
        actors.add(anna);
        actors.add(thandie);

        // Toon de inhoud van de collection (zonder iterator)
        for (Actor actor : actors){
            System.out.println(actor);
        }

        // Verwijder de objecten reese en thandie
        Iterator<Actor> it = actors.iterator();

        while(it.hasNext()){
            Actor actor = it.next();
            if (actor.equals(reese) || actor.equals(thandie)){
                it.remove();
            }
        }

        // Verwijder alle acteurs geboren in 1975 (met iterator)
        it = actors.iterator();
        while(it.hasNext()){
            Actor actor = it.next();
            if (actor.getBirthYear() == 1975){
                it.remove();
            }
        }

        // Verwijder alle dubbele acteurs in de lijst (doe dit bijvoorbeeld door een
        // nieuwe lijst te maken zonder dubbels.  Je kan “contains” gebruiken om te
        // kijken of een element al in de lijst zit)
        List<Actor> uniqueList = new ArrayList<>();
        for (Actor actor : actors){
            if (!uniqueList.contains(actor)){
                uniqueList.add(actor);
            }
        }

        // Sorteer volgens geboortejaar (oudste eerst) en dan volgens voornaam
        Collections.sort(uniqueList);

        System.out.println("\n Uiteindelijke inhoud:\n");

        it = actors.iterator();
        while(it.hasNext()){
            Actor actor = it.next();
            System.out.println(actor);
        }
    }
}
