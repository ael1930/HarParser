package parser;

import java.util.List;

public class Response {
    public int status;
    public String statusText;
    public int headersSize;
    public int bodySize;
    public List<Headers> headers;
    public String httpVersion;
    public String redirectURL;
    public Content content;
    public List<Cookies> cookies;
}
