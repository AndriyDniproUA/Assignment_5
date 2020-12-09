package com.savytskyy.Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    private MenuAction[] actions = new MenuAction[0];

    public void run() {
        int choice;
        boolean mustQuit = false;

        buildMenu();
        System.out.println("This is your Crypter :");
        System.out.println("You can choose between Caesar and XOR methods");
        System.out.println();

        do {
            System.out.println("You have the following options:");
            showMenu();
            System.out.println("Please enter the number of your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            int index = choice - 1;
            if (index >= 0 && index < actions.length) {
                actions[index].doAction();
                mustQuit = actions[index].closeAfter();
            }
        } while (!mustQuit);
    }


    private void addAction(MenuAction action) {
        actions = Arrays.copyOf(actions, actions.length + 1);
       actions[actions.length - 1] = action;
    }

    public void buildMenu(){
        addAction(new CaesarCryptMenuAction(sc));
        addAction(new CaesarDecryptMenuAction(sc));
        addAction(new XorCryptMenuAction(sc));
        addAction(new XorDecryptMenuAction(sc));
        addAction(new QuitMenuAction());
    }

    public void showMenu(){
        for (int i = 0; i < actions.length; i++) {
            System.out.println(i + 1 + "-" + actions[i].getName());
        }
    }
}
