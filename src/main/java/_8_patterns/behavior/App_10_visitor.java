package _8_patterns.behavior;

import java.util.logging.Logger;

/**
 * https://refactoring.guru/ru/design-patterns/visitor
 */
public class App_10_visitor {
    public static void main(String[] args) {
        Commander commander = new Commander(new Sergeant(), new Sergeant());
        commander.accept(new SergeantVisitor());
        commander.accept(new CommanderVisitor());
    }
}

abstract class Unit {

    private Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    /**
     * Accept visitor
     */
    public void accept(UnitVisitor visitor) {
        for (Unit child : children) {
            child.accept(visitor);
        }
    }
}

class Commander extends Unit {

    public Commander(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitCommander(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "commander";
    }
}

class Sergeant extends Unit {

    public Sergeant(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitSergeant(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "sergeant";
    }
}

interface UnitVisitor {

    void visitSergeant(Sergeant sergeant);

    void visitCommander(Commander commander);

}

class CommanderVisitor implements UnitVisitor {

    private static final Logger LOGGER = Logger.getLogger(CommanderVisitor.class.getName());

    @Override
    public void visitSergeant(Sergeant sergeant) {
        // Do nothing
    }

    @Override
    public void visitCommander(Commander commander) {
        LOGGER.info("Good to see you " + commander);
    }
}

class SergeantVisitor implements UnitVisitor {

    private static final Logger LOGGER = Logger.getLogger(SergeantVisitor.class.getName());

    @Override
    public void visitSergeant(Sergeant sergeant) {
        LOGGER.info("Hello " + sergeant);
    }

    @Override
    public void visitCommander(Commander commander) {
        // Do nothing
    }
}
