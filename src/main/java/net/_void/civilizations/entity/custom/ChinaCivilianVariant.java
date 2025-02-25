package net._void.civilizations.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum ChinaCivilianVariant {
    CIVILIAN1(1),
    CIVILIAN2(2),
    CIVILIAN3(3),
    CIVILIAN4(4),
    CIVILIAN5(5),
    CIVILIAN6(6),
    CIVILIAN7(7),
    CIVILIAN8(8);

    private static final ChinaCivilianVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ChinaCivilianVariant::getId)).toArray(ChinaCivilianVariant[]::new);
    private final int id;

    ChinaCivilianVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static ChinaCivilianVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}