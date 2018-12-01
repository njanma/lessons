package _5_exceptions;

/**
 * \                    Object
 * \                      |
 * \               Throwable(CHECKED)
 * \               /            \
 * \     Error(UNCHECKED)    Exception(CHECKED)
 * \                            |
 * \                 RuntimeException(UNCHECKED)
 * \
 */
public class App_19 {
    public static void main(String[] args) {
        throwRuntimeException();
        //Даже если предупреждаем о том, чего нет — все обязаны бояться
//        mentionOnThrowAnException();
    }

    static void throwAnException() throws Exception {   // предупреждаем о Exception
        throw new Exception();                          // и кидаем Exception
    }

    static void throwAnExceptionGrow() throws Throwable { // предупреждаем "целом" Throwable
        throw new Exception();                            // а кидаем только Exception
    }

    static void mentionOnThrowAnException() throws Throwable { // пугаем, но ничего не бросаем

    }

    static void throwRuntimeException() throws RuntimeException { // «указать» на то, что ваш метод может выбросить unchecked исключение
        //example: java.lang.Integer.parseInt(java.lang.String)
    }

}
