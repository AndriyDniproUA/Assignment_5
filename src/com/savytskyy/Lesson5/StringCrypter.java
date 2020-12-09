package com.savytskyy.Lesson5;

public class StringCrypter {
    SymbolCrypter symbolCrypter;
    char [] chars;

    public StringCrypter(SymbolCrypter symbolCrypter) {
        this.symbolCrypter = symbolCrypter;
    }

    public String crypt (String s) {
        chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = symbolCrypter.crypt(chars[i]);
        }
        return new String(chars);
    }

    public String decrypt (String s) {
        chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = symbolCrypter.decrypt(chars[i]);
        }
        return new String(chars);
    }
}
