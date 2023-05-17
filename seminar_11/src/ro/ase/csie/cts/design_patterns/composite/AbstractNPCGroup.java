package ro.ase.csie.cts.design_patterns.composite;

import java.util.ArrayList;

public abstract class AbstractNPCGroup {
    ArrayList<Object> group = new ArrayList<>();

    public abstract void addNPC(Object object);
    public abstract void removeNPC(Object object);
    public abstract Object getNPC(Object object);
}
