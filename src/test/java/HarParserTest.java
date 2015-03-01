import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.junit.Test;
import parser.Har;
import parser.HarParser;

import java.io.IOException;
import java.net.URL;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HarParserTest {

    @Test
    public void test() throws IOException {
        HarParser parser = new HarParser();
        URL url = Resources.getResource("test.har");
        String text = Resources.toString(url, Charsets.UTF_8);
        final Har har = parser.parseHar(text);
        assertThat(har.getLog().version, is("1.1"));
        assertThat(har.getLog().creator.name, is("WebPagetest"));
        assertThat(har.getLog().pages.get(0)._SpeedIndex, is(4912));
    }

}