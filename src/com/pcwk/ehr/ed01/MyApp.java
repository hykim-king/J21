/**
 * 파일명:MyApp.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyApp {

    private static final Logger logger = LogManager.getLogger(MyApp.class);

    public static void main(String[] args) {
        logger.info("정보 메시지입니다.");
        logger.error("에러 메시지입니다.");
        logger.debug("디버그 메시지입니다.");
    }
}
