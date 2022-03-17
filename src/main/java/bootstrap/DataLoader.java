package bootstrap;

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
    }
}
