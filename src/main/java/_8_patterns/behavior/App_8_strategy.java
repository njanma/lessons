package _8_patterns.behavior;

import java.util.logging.Logger;

/**
 * https://refactoring.guru/ru/design-patterns/strategy
 */
public class App_8_strategy {
    private static final Logger LOGGER = Logger.getLogger(App_8_strategy.class.getName());

    public static void main(String[] args) {
        // GoF Strategy pattern
        LOGGER.info("Green dragon spotted ahead!");
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        LOGGER.info("Red dragon emerges.");
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        LOGGER.info("Black dragon lands before you.");
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        // Java 8 Strategy pattern
        LOGGER.info("Green dragon spotted ahead!");
        dragonSlayer = new DragonSlayer(
                () -> LOGGER.info("With your Excalibur you severe the dragon's head!"));
        dragonSlayer.goToBattle();
        LOGGER.info("Red dragon emerges.");
        dragonSlayer.changeStrategy(() -> LOGGER.info(
                "You shoot the dragon with the magical crossbow and it falls dead on the ground!"));
        dragonSlayer.goToBattle();
        LOGGER.info("Black dragon lands before you.");
        dragonSlayer.changeStrategy(() -> LOGGER.info(
                "You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"));
        dragonSlayer.goToBattle();
    }
}

class DragonSlayer {

    private DragonSlayingStrategy strategy;

    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void goToBattle() {
        strategy.execute();
    }
}

@FunctionalInterface
interface DragonSlayingStrategy {
    void execute();
}

class MeleeStrategy implements DragonSlayingStrategy {

    private static final Logger LOGGER = Logger.getLogger(MeleeStrategy.class.getName());

    @Override
    public void execute() {
        LOGGER.info("With your Excalibur you sever the dragon's head!");
    }
}

class ProjectileStrategy implements DragonSlayingStrategy {

    private static final Logger LOGGER = Logger.getLogger(ProjectileStrategy.class.getName());

    @Override
    public void execute() {
        LOGGER.info("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
    }
}

class SpellStrategy implements DragonSlayingStrategy {

    private static final Logger LOGGER = Logger.getLogger(SpellStrategy.class.getName());

    @Override
    public void execute() {
        LOGGER.info("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }
}