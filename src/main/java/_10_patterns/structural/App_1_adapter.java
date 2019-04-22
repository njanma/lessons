package _10_patterns.structural;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

/**
 * https://refactoring.guru/ru/design-patterns/adapter
 */
public class App_1_adapter {
    public static void main(String[] args) {
        java.util.Arrays.asList(1, 2, 3);
        Enumeration<Integer> enumeration = Collections.enumeration(Arrays.asList(1, 2, 3));

        Reader inputStreamReader = new InputStreamReader(new ByteArrayInputStream("bytes".getBytes()));
        Writer outputStreamWriter = new OutputStreamWriter(new ByteArrayOutputStream());
    }
}

interface JsonService {
    Json prepareJson(Json json);
}

interface XmlService {
    Xml getFromDb();
}

interface XmlToJsonAdapter {
    Json mapping(Xml xml);
}

class DataFlowService {
    private XmlService xmlService;
    private JsonService jsonService;
    private XmlToJsonAdapter adapter;

    void flowDataFromDb() {
        Xml fromDb = xmlService.getFromDb();
        Json json = jsonService.prepareJson(adapter.mapping(fromDb));
    }
}

class Xml {
}

class Json {
}