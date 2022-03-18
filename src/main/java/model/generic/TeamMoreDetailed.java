package model.generic;

// It can extend a single class, but inherit multiple interfaces!
// We use comparable interface here, as to set the type of the team as well, as no need to compare a football team with a baseball team!
public class TeamMoreDetailed<T extends Player & Coach & Manager> implements Comparable<GenericTeamRefactor<T>> {

    @Override
    public int compareTo(GenericTeamRefactor<T> o) {
        return 0;
    }
}
