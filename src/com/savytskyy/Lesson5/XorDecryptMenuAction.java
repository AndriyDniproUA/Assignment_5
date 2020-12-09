package com.savytskyy.Lesson5;

import java.util.Scanner;

public class XorDecryptMenuAction implements MenuAction {
   Scanner sc;

    public XorDecryptMenuAction(Scanner sc) {
        this.sc = sc;
    }


    @Override
    public void doAction() {
        System.out.println("Please enter the string to decrypt: ");
        String s = sc.next();
        sc.nextLine();

        System.out.println("Please enter the key: ");
        int key = sc.nextInt();
        sc.nextLine();

        SymbolCrypter symbolCrypter = new XorSymbolCrypter(key);
        StringCrypter stringCrypter = new StringCrypter(symbolCrypter);

        System.out.println("The decrypted string by XOR method is: ");
        System.out.println(stringCrypter.decrypt(s));
        System.out.println();
    }

    @Override
    public String getName() {
        return "XOR decrypt action";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }


}
