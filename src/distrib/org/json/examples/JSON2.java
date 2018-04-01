package distrib.org.json.examples;


import distrib.models.Office;
import distrib.models.Person;
import org.json.JSONException;
import org.json.JSONObject;

public class JSON2 {

    public static void main(String[] args) throws JSONException {
        Person p = new Person(); 
        p.setName("Gerald Bostock");
        Office o = new Office();
        o.setBuilding(4);
        o.setRoom(435);
        p.setOffice(o);
        
        JSONObject x = new JSONObject(p); // via Bean getters
        System.out.println(x);
    }
}
