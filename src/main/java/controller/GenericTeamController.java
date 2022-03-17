package controller;

import model.generic.*;

public class GenericTeamController {

    public void createTeam() {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        // instead of T I added FootballPlayer as type argument!
        GenericTeam<FootballPlayer> adelaideCrows = new GenericTeam<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        // adelaideCrows.addPlayer(pat);
        // adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        GenericTeam<BaseballPlayer> baseballTeam = new GenericTeam<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
    }
}
