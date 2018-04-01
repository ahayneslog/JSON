package distrib.org.json.examples;


import org.json.JSONException;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONObject;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bernd
 */
public class JSON1 {

    public static void main(String[] args) throws JSONException {
        JSONObject o = new JSONObject();
        System.out.println(o);
        o.put("name", "Bernd OK");
        System.out.println(o);

        JSONObject office = new JSONObject();
        office.put("building", 4);
        office.put("room", 435);

        o.put("office", office);
        System.out.println(o);
    }
}
