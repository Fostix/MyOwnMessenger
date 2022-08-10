package MyOwnTry.UI;

import MyOwnTry.Core.Model.View;

import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner scanner = new Scanner(System.in);
    public ConsoleView() {
    }

    @Override
    public String enterName() {
        System.out.print("Enter name: ");
        return scanner.next();
    }

    @Override
    public void createUserMenu() {
        System.out.println("user - обычный пользователь минимум прав");
        System.out.println("premUser - премиум пользователь больше прав");
        System.out.println("admin - администратор");
        System.out.println("god - бог может всё");
    }

    @Override
    public String enterNumber() {
        System.out.print("Введите число: ");
        return scanner.next();
    }

    @Override
    public void notNumber() {
        System.out.println("Это не число");
    }

    @Override
    public void itIsNumber() {
        System.out.println("А вот это число. Молодец!");
    }

    @Override
    public void showAllUsers(String info) {
        System.out.println(info);
    }

    @Override
    public void createGroup() {
        System.out.println("Введите id того кто создаёт группу: ");
    }
}
