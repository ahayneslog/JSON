/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distrib.javax.json.examples;

import java.io.StringWriter;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

/**
 *
 * @author Bernd
 */
public class JSON2 {

    public static void main(String[] atgs) {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        JsonObject o = builder.add("firstName", "Duke")
                .add("lastName", "Java")
                .add("age", 18)
                .add("streetAddress", "100 Internet Dr")
                .add("city", "JavaTown")
                .add("state", "JA")
                .add("postalCode", "12345")
                .build();
        StringWriter stWriter = new StringWriter();
        JsonWriter jsonWriter = Json.createWriter(stWriter);
        jsonWriter.writeObject(o);
        jsonWriter.close();

        String jsonData = stWriter.toString();
        System.out.println(jsonData);
    }
}
