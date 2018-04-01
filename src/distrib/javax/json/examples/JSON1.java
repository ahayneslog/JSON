package distrib.javax.json.examples;


import javax.json.Json;
import javax.json.Json;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonGeneratorFactory;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bernd
 */
public class JSON1 {

    public static void main(String[] args) {
        JsonGeneratorFactory factory = Json.createGeneratorFactory(null);
        JsonGenerator generator = factory.createGenerator(System.out);

        generator.writeStartArray().
                writeStartObject().
                write("type", "home").
                write("number", "(800) 111-1111").writeEnd().
                writeStartObject().
                write("type", "cell").
                write("number", "(800) 222-2222").writeEnd().
                writeEnd().close();
    }
}
