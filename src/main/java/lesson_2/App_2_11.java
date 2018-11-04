package lesson_2;

public class App_2_11 {
}

interface I {}

interface J {}

//Предком может быть только класс, но не интерфейс
//class X_11 extends I {}

class X_11 implements I {}

class Y_11 implements I, J {}