package _3_generics;

public class App_9_erasure {

    public static void main(String[] args) {
        D<Integer> anInt = null;
        Integer elem = anInt.getElem();
        C<String> stringC = anInt.aString();

        D erasure= null;
        erasure.getElem();
        erasure.aString();
    }
}

interface C<E> {

}

interface D<E> {
    E getElem();
    C<String> aString();
}