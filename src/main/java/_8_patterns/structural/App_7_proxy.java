package _8_patterns.structural;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.logging.Logger;

/**
 * https://refactoring.guru/ru/design-patterns/proxy
 */
public class App_7_proxy {

    public static void main(String[] args) {
        Map proxyInstance = (Map) Proxy.newProxyInstance(
                App_7_proxy.class.getClassLoader(),
                new Class[]{Map.class},
                new DynamicInvocationHandler());
        proxyInstance.put("", "");
    }

    private static class DynamicInvocationHandler implements InvocationHandler {

        private static Logger LOGGER = Logger.getLogger(DynamicInvocationHandler.class.getName());

        @Override
        public Object invoke(Object proxy, Method method, Object[] args)
                throws Throwable {
            LOGGER.info("Invoked method: " + method.getName());

            return 42;
        }
    }
}
