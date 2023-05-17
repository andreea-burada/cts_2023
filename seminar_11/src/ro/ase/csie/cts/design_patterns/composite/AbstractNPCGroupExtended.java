package ro.ase.csie.cts.design_patterns.composite;

public abstract class AbstractNPCGroupExtended extends AbstractNPCGroup implements INPCActions {
    // implement the set of methods/actions that requires the least amount of creativity
    // -> the methods related to the composite story (add node, remove node, get node etc.)
    @Override
    public void addNPC(Object object) {
        if (object instanceof AbstractNPCGroupExtended) {
            this.group.add(object);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void removeNPC(Object object) {
        this.group.remove(object);
    }

    @Override
    public Object getNPC(Object object) {
        return this.group.get(this.group.indexOf(object));
    }
}
