package _2_oop._3_inheritance;

/**
 * Overriding.
 *
 * toString, equals, hashCode, finalize, clone, getClass - относятся к ООП
 * wait, notify, notifyAll - относятся к многопоточной части
 */
public class App_2_13 extends Object{

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
