package com.dch.crypto;

public interface CryptoProperties {
    String getGroupKey();

    String getPersonKey();

    void setGroupKey(String groupKey);

    void setPersonKey(String personKey);
}
