package commons;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DemoLogging {
    private static Log log = LogFactory.getLog(DemoLogging.class);

    public static void main(String[] args) {
        log.fatal("FATAL");
        log.error("ERROR");
        log.warn("WARN");
        log.info("INFO");
        log.debug("DEBUG");
        log.trace("TRACE");
    }
}
