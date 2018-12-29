import History.History;
import History.Joke;
import History.WriteFile;
import History.ReadFile;
import com.google.gson.Gson;
import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import jdk.nashorn.internal.parser.JSONParser;
import net.dongliu.requests.Requests;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Runner {
    public static void main(String[] args) throws UnirestException, IOException {
        String url = "https://api.chucknorris.io/jokes/random";

        Gson gson = new Gson();
//       for (int i = 0;i < 10;i++) {
//           String resp = Requests.get(url).send().readToText();
//           Joke joke = gson.fromJson(resp, Joke.class);
//           System.out.println(joke);
//       }
//        Headers responce = Unirest.get("http://httpbin.org/get").asString().getHeaders();
//        //Joke joke = gson.fromJson(responce,Joke.class);
//        System.out.println(responce);
        String temp = "Sdzsc\n";

        WriteFile.writeByte(temp.getBytes());

        String temp2 = "jklxhvxkbvshdc\n";

        WriteFile.writeByte(temp2.getBytes());

        String temp3 =  ReadFile.readFile("History.txt");

        System.out.println(temp3);

//        Path fileLocation = Paths.get("History.txt");
//        byte[] data = Files.readAllBytes(fileLocation);
//        System.out.println(data.toString());

    }
}
