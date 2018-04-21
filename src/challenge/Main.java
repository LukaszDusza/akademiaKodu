package challenge;

// ArrayList<Team>;
// Collections.sort (zespoły);
// Utwórz ogólną klasę, aby zaimplementować tabelę ligową dla sportu.
// Klasa powinna zezwalać na dodawanie zespołów do listy i przechowywanie
// lista drużyn należących do ligi.
//
// Twoja klasa powinna mieć metodę wypisywania druzyn w kolejnosci alf. w kolejności,
// Najpierw drukujemy drużynę na szczycie ligi.
//
// Do każdego szczegółu należy dodać tylko zespoły tego samego typu
//  - instancja klasy ligowej - program nie może się skompilować
//  jeśli podjęto próbę dodania niezgodnego zespołu.


public class Main {


    public static void main(String[] args) {

        System.out.println(Thread.currentThread());

        League<Team<FootballPlayer>> footballLeagPoland = new League<>("Liga mistrzów");
        Team<FootballPlayer> lech = new Team<>("Lech");
        Team<FootballPlayer> legia = new Team<>("Legia");

        footballLeagPoland.add(lech);
        footballLeagPoland.add(legia);

        lech.matchResult(legia, 1, 3);
        lech.matchResult(legia, 2, 2);
        legia.matchResult(lech, 1, 0);

        footballLeagPoland.showLeagueTable();

        FootballPlayer roberLeandowski = new FootballPlayer("Robert Lewandowski");
        FootballPlayer kubaBlaszczykowski = new FootballPlayer("Kuba Błaszczykwoski");

        lech.addPlayer(roberLeandowski);
        legia.addPlayer(kubaBlaszczykowski);
        legia.addPlayer(kubaBlaszczykowski);



    }



}


