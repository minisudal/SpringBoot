package kr.ac.hnu.itup.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;


@Slf4j
class RecursiveFunctionTest {
//    private static final Logger log = LoggerFactory.getLogger(RecursiveFunctionTest.class);

    @Test
    void factorial() {
        RecursiveFunction recursiveFunction = new RecursiveFunction();
        long factorial = recursiveFunction.factorial(5);
        System.out.println(factorial);
        log.info("factorial: {}", factorial);
    }
}