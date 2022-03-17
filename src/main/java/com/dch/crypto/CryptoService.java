package com.dch.crypto;

public interface CryptoService {
    String decode(String message);

    String encode(String message);
}
