package parser;

import com.google.gson.Gson;
import model.Har;

public class HarParser {

    public Har parseHar(String harFile) {
        return new Gson().fromJson(harFile, Har.class);
    }
}
