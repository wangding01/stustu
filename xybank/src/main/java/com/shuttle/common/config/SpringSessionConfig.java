package com.shuttle.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(prefix = "jiesong", name = "spring-session-open", havingValue = "true")
public class SpringSessionConfig {

}
