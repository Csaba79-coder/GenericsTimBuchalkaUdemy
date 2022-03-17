package bootstrap;

import model.RawTypeArrayList;
import model.TypeParameterArrayList;
import util.Separator;

public class DataLoader {

    public void load() {

        new RawTypeArrayList().test();
        new Separator().print();
        new TypeParameterArrayList().testType();
    }
}
