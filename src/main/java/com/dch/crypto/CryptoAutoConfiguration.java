package com.dch.crypto;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CryptoPropertiesDchImpl.class)
@ConditionalOnProperty(prefix = "dch.crypto", name = {"group-key", "person-key"})
public class CryptoAutoConfiguration {

    private final CryptoProperties cryptoProperties;

    public CryptoAutoConfiguration(CryptoProperties cryptoProperties) {
        this.cryptoProperties = cryptoProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    public CryptoService getCryptoServiceBean() {
        return new CryptoServiceDchImpl(cryptoProperties);
    }
}
