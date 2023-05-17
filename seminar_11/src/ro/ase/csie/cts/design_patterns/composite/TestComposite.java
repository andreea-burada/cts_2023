package ro.ase.csie.cts.design_patterns.composite;

public class TestComposite {
    public static void main(String[] args) {
        AbstractNPCGroupExtended enemies = new NPCGroup();
        enemies.addNPC(new NPCEnemy());
        enemies.addNPC(new NPCEnemy());
        enemies.addNPC(new NPCEnemy());

        AbstractNPCGroupExtended team = new NPCGroup();
        team.addNPC(new NPCEnemy());
        enemies.addNPC(team);

        enemies.attack(13);
    }
}
