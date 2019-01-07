package com.pactera.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/9/26.
 */
@Configuration
public class MyBatisConfig {

    public ConfigurationCustomizer getCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };

    }
}
