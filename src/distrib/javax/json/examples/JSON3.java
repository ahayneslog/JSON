/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distrib.javax.json.examples;

import java.io.StringWriter;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonWriter;

/**
 *
 * @author Bernd
 */
public class JSON3 {
        public static void main(String[] atgs) {
        JsonObject model = Json.createObjectBuilder()
                .add("firstName", "Duke")
                .add("lastName", "Java")
                .add("age", 18)
                .add("streetAddress", "100 Internet Dr")
                .add("city", "JavaTown")
                .add("state", "JA")
                .add("postalCode", "12345")
                .add("phoneNumbers", Json.createArrayBuilder()
                .add(Json.createObjectBuilder()
                .add("type", "mobile")
                .add("number", "111-111-1111"))
                .add(Json.createObjectBuilder()
                .add("type", "home")
                .add("number", "222-222-2222")))
                .build();
        StringWriter stWriter = new StringWriter();
        JsonWriter jsonWriter = Json.createWriter(stWriter);
        jsonWriter.writeObject(model);
        jsonWriter.close();

        String jsonData = stWriter.toString();
        System.out.println(jsonData);
    }
}
