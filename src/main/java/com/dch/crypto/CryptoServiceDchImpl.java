package com.dch.crypto;

public class CryptoServiceDchImpl implements CryptoService {

    private final CryptoProperties cryptoProperties;

    public CryptoServiceDchImpl(CryptoProperties cryptoProperties) {
        this.cryptoProperties = cryptoProperties;
    }

    @Override
    public String decode(String message) {
        return message
                .replace(cryptoProperties.getGroupKey(), "")
                .replace(cryptoProperties.getPersonKey(), "");
    }

    @Override
    public String encode(String message) {
        return String.format("%s%s%s", cryptoProperties.getGroupKey(), message, cryptoProperties.getPersonKey());
    }
}
