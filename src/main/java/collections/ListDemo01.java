package collections;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListDemo01 {
    private static final Logger logger = LoggerFactory.getLogger(ListDemo01.class);
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        logger.debug("test");
    }
}
