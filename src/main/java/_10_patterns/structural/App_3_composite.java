package _10_patterns.structural;

import java.util.ArrayList;
import java.util.List;

/**
 * https://refactoring.guru/ru/design-patterns/composite
 */
public class App_3_composite {

    public static void main(String[] args) {
        Sentence sentence = new Sentence(new Word(new Letter('H'), new Letter('e'), new Letter('l'), new Letter('l'), new Letter('o')));
        sentence.print();
    }
}


abstract class LetterComposite {

    private List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    protected void printThisBefore() {
    }

    protected void printThisAfter() {
    }

    /**
     * Print
     */
    public void print() {
        printThisBefore();
        for (LetterComposite letter : children) {
            letter.print();
        }
        printThisAfter();
    }
}

class Letter extends LetterComposite {

    private char c;

    public Letter(char c) {
        this.c = c;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(c);
    }
}

class Word extends LetterComposite {

    /**
     * Constructor
     */
    public Word(Letter... letters) {
        for (Letter l : letters) {
            this.add(l);
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}

class Sentence extends LetterComposite {

    /**
     * Constructor
     */
    public Sentence(Word... words) {
        for (Word w : words) {
            this.add(w);
        }
    }

    @Override
    protected void printThisAfter() {
        System.out.print(".");
    }
}

