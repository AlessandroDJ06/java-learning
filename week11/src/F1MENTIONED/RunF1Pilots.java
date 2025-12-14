package F1MENTIONED;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RunF1Pilots {
    public static void main(String[] args) {
        F1Pilots pilots = new F1Pilots();

        F1Pilot[] champions = {
                new F1Pilot("Duits", "Michael Schumacher", 7),
                new F1Pilot("Brits", "Lewis Hamilton", 7),
                new F1Pilot("Argentijns", "Juan Manuel Fangio", 5),
                new F1Pilot("Frans", "Alain Prost", 4),
                new F1Pilot("Duits", "Sebastian Vettel", 4),
                new F1Pilot("Nederlands", "Max Verstappen", 4),
                new F1Pilot("Australisch", "Jack Brabham", 3),
                new F1Pilot("Brits", "Jackie Stewart", 3),
                new F1Pilot("Oostenrijks", "Niki Lauda", 3),
                new F1Pilot("Braziliaans", "Nelson Piquet", 3),
                new F1Pilot("Braziliaans", "Ayrton Senna", 3)
        };


        int[][] seasons = {
                {1994, 1995, 2000, 2001, 2002, 2003, 2004},
                {2008, 2014, 2015, 2017, 2018, 2019, 2020},
                {1951, 1954, 1955, 1956, 1957},
                {1985, 1986, 1989, 1993},
                {2010, 2011, 2012, 2013},
                {2021, 2022, 2023, 2024},
                {1959, 1960, 1966},
                {1969, 1971, 1973},
                {1975, 1977, 1984},
                {1981, 1983, 1987},
                {1988, 1990, 1991}
        };


        for (int i = 0 ; i < champions.length;i++){
            for (int j = 0; j < seasons[i].length; j++) {
                champions[i].addSeason(seasons[i][j]);
            }
        }

        List<F1Pilot> pilotsList = new ArrayList<>(Arrays.asList(champions));


        pilotsList.sort(Comparator.comparing(pL -> {
            String fullName = pL.getName();
            String[] parts = fullName.trim().split(" ");
            return parts[1];
        }
        ));

        for (F1Pilot pilot : pilotsList){
            pilots.fillMap(pilot.getName(),pilot);
        }

        System.out.println(pilots);
    }
}
