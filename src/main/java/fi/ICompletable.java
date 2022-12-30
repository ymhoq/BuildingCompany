package fi;

import Buildings.Building;

@FunctionalInterface
public interface ICompletable {
    boolean isFinish(Building building);
}
