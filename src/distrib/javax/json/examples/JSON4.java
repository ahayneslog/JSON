/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distrib.javax.json.examples;

import java.io.StringWriter;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonString;
import javax.json.JsonValue;
import javax.json.JsonWriter;

/**
 *
 * @author Bernd
 */
public class JSON4 {

    public static void navigateTree(JsonValue tree, String key) {
        if (key != null) {
            System.out.print("Key " + key + ": ");
        }
        switch (tree.getValueType()) {
            case OBJECT:
                System.out.println("OBJECT");
                JsonObject object = (JsonObject) tree;
                for (String name : object.keySet()) {
                    navigateTree(object.get(name), name);
                }
                break;
            case ARRAY:
                System.out.println("ARRAY");
                JsonArray array = (JsonArray) tree;
                for (JsonValue val : array) {
                    navigateTree(val, null);
                }
                break;
            case STRING:
                JsonString st = (JsonString) tree;
                System.out.println("STRING " + st.getString());
                break;
            case NUMBER:
                JsonNumber num = (JsonNumber) tree;
                System.out.println("NUMBER " + num.toString());
                break;
            case TRUE:
            case FALSE:
            case NULL:
                System.out.println(tree.getValueType().toString());
                break;
        }
    }   

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
        
        navigateTree(model, null);
    }
}
