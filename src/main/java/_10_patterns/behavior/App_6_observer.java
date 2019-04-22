package _10_patterns.behavior;

import java.util.Observable;
import java.util.Observer;

/**
 * https://refactoring.guru/ru/design-patterns/observer
 */
public class App_6_observer {
    public static void main(String[] args) {
        MovieCritic john = new MovieCritic("John");
        MovieCritic marry = new MovieCritic("Marry");

        MovieObservable observable = new MovieObservable();
        observable.addObserver(john);
        observable.addObserver(marry);

        observable.setMovieName("Aquaman");
    }

    private static class MovieObservable extends Observable {
        private String movieName;

        public void setMovieName(String movieName) {
            this.movieName = movieName;
            setChanged();
            notifyObservers(movieName);
        }
    }

    private static class MovieCritic implements Observer {
        private final String name;

        private MovieCritic(String name) {
            this.name = name;
        }

        @Override
        public void update(Observable o, Object arg) {
            System.out.println(name + " is thinking that " + arg + " is terrible!");
        }
    }
}
