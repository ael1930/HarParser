package parser;

import com.google.gson.Gson;

public class HarParser {

    public <T> T parseHar(String harFile, T object) {

        return (T) new Gson().fromJson(harFile, Har.class);
    }
}
