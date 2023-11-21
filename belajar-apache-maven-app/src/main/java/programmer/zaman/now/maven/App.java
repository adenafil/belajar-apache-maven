package programmer.zaman.now.maven;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        User mUser = new User("Petani Kode", "info@petanikode.com", 22);
//
//        // Ubah objek menjadi string json
//        Gson gson = new Gson();
//        String jsonUser = gson.toJson(mUser);
//
//        System.out.println(jsonUser);
//
//        Gson gsonBuilder = new GsonBuilder().create();
//        User myUser = gsonBuilder.fromJson(jsonUser, User.class);
//        System.out.println(myUser.name);

        Gson gson = new Gson();
        Person person = new Person("Ade Nafil Firmansah");

        String json = gson.toJson(person);
        System.out.println(json);
    }
}
