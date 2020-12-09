package com.savytskyy.Lesson5;

public class CaesarSymbolCrypter implements SymbolCrypter{
    int key;

    public CaesarSymbolCrypter(int key) {
        this.key = key;
    }

    @Override
    public char crypt(char c) {
        return (char)((int)c+key);
    }

    @Override
    public char decrypt(char c) {
        return (char)((int)c-key);
    }
}
