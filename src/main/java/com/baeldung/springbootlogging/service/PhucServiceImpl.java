package com.baeldung.springbootlogging.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PhucServiceImpl implements PhucService{

//    private static final Logger logger = LogManager.getLogger(PhucServiceImpl.class);

    @Override
    public String welcome() {
        log.debug("welcome");

        return "welcome";
    }
}
