package Manager;

import org.apache.log4j.*;

public class IOExceptionManager extends Exception {
    private final Logger log = Logger.getLogger(getClass());
    private String str1;

    public IOExceptionManager(String str2) {
        log.error(str2);
    }

    public String toString() {
        return str1;
    }

}
