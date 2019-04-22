package _10_patterns.creational;

/**
 * https://refactoring.guru/ru/design-patterns/abstract-factory
 */
public class App_2_abstract_factory {
    public static void main(String[] args) {
        javax.xml.parsers.DocumentBuilderFactory.newInstance();
        javax.xml.transform.TransformerFactory.newInstance();
        javax.xml.xpath.XPathFactory.newInstance();
    }
}
