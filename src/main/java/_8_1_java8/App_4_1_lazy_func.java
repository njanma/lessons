package _8_1_java8;

import lombok.SneakyThrows;

import java.util.function.Supplier;

public class App_4_1_lazy_func {

    public static void main(String[] args) {
        enrichFilterByValue(workWithRemoteServer());
        enrichFilterByRef(() -> workWithRemoteServer());
    }

    @SneakyThrows
    static int workWithRemoteServer() {
        System.out.println("working... ");
        Thread.sleep(100000000);
        return 1;
    }

    static void enrichFilterByValue(Integer code) {
        if (false) {
            System.out.println(code);
        }
    }

    static void enrichFilterByRef(Supplier<Integer> getCode) {
        if (false) {
            System.out.println(getCode.get());
        }
    }
}
