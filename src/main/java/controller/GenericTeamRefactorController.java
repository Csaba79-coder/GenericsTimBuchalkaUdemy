package controller;

import model.generic.*;

public class GenericTeamRefactorController {

    public void createTeam() {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        GenericTeamRefactor<FootballPlayer> adelaideCrows = new GenericTeamRefactor<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        GenericTeamRefactor<BaseballPlayer> baseballTeam = new GenericTeamRefactor<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        GenericTeamRefactor<SoccerPlayer> manchesterUnited = new GenericTeamRefactor<>("Manchester United");
        manchesterUnited.addPlayer(beckham);

        GenericTeamRefactor<FootballPlayer> hawthorn = new GenericTeamRefactor<>("Hawthorn");
        GenericTeamRefactor<FootballPlayer> melbourne = new GenericTeamRefactor<>("Melbourne");

        hawthorn.matchResult(melbourne, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        int hawthornResult = hawthorn.ranking();
        int melbourneResult = melbourne.ranking();
        int adelaideCrowsResult = adelaideCrows.ranking();
        System.out.println(hawthorn.getName() + "\' score: " + hawthornResult);
        System.out.println(melbourne.getName() + " score: " + melbourneResult);
        System.out.println(adelaideCrows.getName() + " score: " + adelaideCrowsResult);
    }
}
