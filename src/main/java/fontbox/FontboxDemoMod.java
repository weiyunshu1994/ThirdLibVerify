package fontbox;
import org.apache.fontbox.EncodedFont;
import org.apache.fontbox.encoding.Encoding;

import java.io.IOException;

public class FontboxDemoMod {

    EncodedFont encodedFont = new EncodedFont() {
        @Override
        public Encoding getEncoding() throws IOException {
            return null;
        }
    };


}
