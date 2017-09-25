package Manager;

import org.apache.log4j.*;

public class IoExceptionManager extends Exception {
    private String str1;
    private final Logger logger = Logger.getLogger(this.getClass());

    IoExceptionManager(String str) {
        logger.error(str);
    }

    public String toString() {
        return str1;
    }

}