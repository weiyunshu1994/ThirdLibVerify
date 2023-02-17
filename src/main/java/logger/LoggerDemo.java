package logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LoggerDemo {
    public static final Logger logger= LoggerFactory.getLogger(LoggerDemo.class);

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        String msg = "fucking good";
        logger.info("slf4j print info msg:{}",msg);
        logger.debug("slf4j print debug msg:{}",msg);
    }
}
