package _10_patterns.structural;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/**
 * https://refactoring.guru/ru/design-patterns/facade
 */
public class App_5_facade {
    public static void main(String[] args) {
        GoldmineFacade facade = new GoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
    }
}

class GoldmineFacade {

    private final List<MineWorker> workers;

    /**
     * Constructor
     */
    public GoldmineFacade() {
        workers = new ArrayList<>();
        workers.add(new CartOperator());
        workers.add(new TunnelDigger());
    }

    public void startNewDay() {
        makeActions(workers, MineWorker.Action.WAKE_UP, MineWorker.Action.GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(workers, MineWorker.Action.WORK);
    }

    private static void makeActions(Collection<MineWorker> workers,
                                    MineWorker.Action... actions) {
        for (MineWorker worker : workers) {
            worker.action(actions);
        }
    }
}

abstract class MineWorker {

    private static final Logger LOGGER = Logger.getLogger(MineWorker.class.getName());

    public void goToSleep() {
        LOGGER.info(name() + " goes to sleep.");
    }

    public void wakeUp() {
        LOGGER.info(name() + " wakes up.");
    }

    public void goToMine() {
        LOGGER.info(name() + " goes to the mine.");
    }

    private void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WORK:
                work();
                break;
            default:
                break;
        }
    }

    /**
     * Perform actions
     */
    public void action(Action... actions) {
        for (Action action : actions) {
            action(action);
        }
    }

    public abstract void work();

    public abstract String name();

    enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_TO_MINE, WORK
    }
}


class TunnelDigger extends MineWorker {

    private static final Logger LOGGER = Logger.getLogger(TunnelDigger.class.getName());

    @Override
    public void work() {
        LOGGER.info(name() + " creates another promising tunnel.");
    }

    @Override
    public String name() {
        return "Tunnel digger";
    }
}

class CartOperator extends MineWorker {

    private static final Logger LOGGER = Logger.getLogger(CartOperator.class.getName());

    @Override
    public void work() {
        LOGGER.info(name() + " moves gold chunks out of the mine.");
    }

    @Override
    public String name() {
        return "Cart operator";
    }
}
