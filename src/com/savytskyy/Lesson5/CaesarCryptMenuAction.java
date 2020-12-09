package com.savytskyy.Lesson5;

import java.util.Scanner;

public class CaesarCryptMenuAction implements MenuAction{
   Scanner sc;

    public CaesarCryptMenuAction(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void doAction() {

        System.out.println("Please enter the string to encrypt: ");
        String s = sc.next();
        sc.nextLine();

        System.out.println("Please enter the key: ");
        int key = sc.nextInt();
        sc.nextLine();

        SymbolCrypter symbolCrypter = new CaesarSymbolCrypter(key);
        StringCrypter stringCrypter = new StringCrypter(symbolCrypter);

        System.out.println("The encrypted string by Caesar method is: ");
        System.out.println(stringCrypter.crypt(s));
        System.out.println();

    }

    @Override
    public String getName() {
        return "Caesar crypt action";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
