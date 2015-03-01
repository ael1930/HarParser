import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.junit.Test;
import model.Har;
import parser.HarParser;

import java.io.IOException;
import java.net.URL;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HarParserTest {

    @Test
    public void test() throws IOException {
        HarParser parser = new HarParser();
        URL url = Resources.getResource("www.autotrader.co.uk.150213_WQ_13XX.har");
        String text = Resources.toString(url, Charsets.UTF_8);
        final Har har = parser.parseHar(text);
        assertThat(har.log.version, is("1.1"));
        assertThat(har.log.creator.name, is("WebPagetest"));
        assertThat(har.log.pages.get(0)._SpeedIndex, is(1611));
    }

}