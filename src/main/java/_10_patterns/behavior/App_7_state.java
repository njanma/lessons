package _10_patterns.behavior;

import java.util.logging.Logger;

/**
 * https://refactoring.guru/ru/design-patterns/state
 */
public class App_7_state {
    public static void main(String[] args) {
        Mammoth mammoth = new Mammoth();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
    }
}

interface State {
    void onEnterState();
    void observe();
}


class Mammoth {

    private State state;

    public Mammoth() {
        state = new PeacefulState(this);
    }

    /**
     * Makes time pass for the mammoth
     */
    public void timePasses() {
        if (state.getClass().equals(PeacefulState.class)) {
            changeStateTo(new AngryState(this));
        } else {
            changeStateTo(new PeacefulState(this));
        }
    }

    private void changeStateTo(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    @Override
    public String toString() {
        return "The mammoth";
    }

    public void observe() {
        this.state.observe();
    }
}

class PeacefulState implements State {

    private static final Logger LOGGER = Logger.getLogger(PeacefulState.class.getName());

    private Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void observe() {
        LOGGER.info(mammoth + " is calm and peaceful.");
    }

    @Override
    public void onEnterState() {
        LOGGER.info(mammoth + " calms down.");
    }
}

class AngryState implements State {

    private static final Logger LOGGER = Logger.getLogger(AngryState.class.getName());

    private Mammoth mammoth;

    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void observe() {
        LOGGER.info(mammoth + " is furious!");
    }

    @Override
    public void onEnterState() {
        LOGGER.info(mammoth + " gets angry!");
    }

}


