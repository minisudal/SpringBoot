package kr.ac.hnu.itup.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
//import org.junit.platform.commons.logging.LoggerFactory;
//import java.util.logging.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ForLoopTest {
//    private static final Logger log = LoggerFactory.getLogger(ForLoopTest.class);

    @Test
    void factorial() {
        ForLoop forLoop = new ForLoop();
        long factorial = forLoop.factorial(5);
        System.out.println(factorial);
        log.info("factorial: {}", factorial);
    }
}