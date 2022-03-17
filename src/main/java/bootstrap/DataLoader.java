package bootstrap;

import controller.GenericTeamController;
import controller.GenericTeamRefactorController;
import controller.TeamController;
import model.type.RawTypeArrayList;
import model.type.TypeParameterArrayList;
import util.Separator;

public class DataLoader {

    Separator separator = new Separator();

    public void load() {

        new RawTypeArrayList().test();
        separator.print();
        new TypeParameterArrayList().testType();
        separator.print();
        new TeamController().createTeam();
        separator.print();
        new GenericTeamController().createTeam();
        separator.print();
        new GenericTeamRefactorController().createTeam();
    }
}
