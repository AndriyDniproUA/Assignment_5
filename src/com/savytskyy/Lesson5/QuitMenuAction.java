package com.savytskyy.Lesson5;

public class QuitMenuAction implements MenuAction {
    @Override
    public void doAction() {
        System.out.println("Good Bye!");
        System.out.println("Thank you for using our crypter!");
    }

    @Override
    public String getName() {
        return "Quit menu";
    }

    @Override
    public boolean closeAfter() {
        return true;
    }
}

