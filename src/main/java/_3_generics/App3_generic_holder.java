package _3_generics;

public class App3_generic_holder {
    public static void main(String[] args) {
        GenericHolder<Integer> integerHolder = new GenericHolder<>();
//        GenericHolder<int> intHolder = new GenericHolder<>();

        integerHolder.setData(15);
        Integer data = integerHolder.getData();
    }
}


class GenericHolder<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
