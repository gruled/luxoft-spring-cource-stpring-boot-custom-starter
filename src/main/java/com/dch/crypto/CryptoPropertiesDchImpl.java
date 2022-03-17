package com.dch.crypto;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "dch.crypto")
public class CryptoPropertiesDchImpl implements CryptoProperties {
    private String groupKey;
    private String personKey;

    @Override
    public String getGroupKey() {
        return this.groupKey;
    }

    @Override
    public String getPersonKey() {
        return this.personKey;
    }

    @Override
    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    @Override
    public void setPersonKey(String personKey) {
        this.personKey = personKey;
    }
}
