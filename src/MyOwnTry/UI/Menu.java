package MyOwnTry.UI;

import MyOwnTry.Core.Model.Presenter;

import java.util.Scanner;

public class Menu {
    public void menu() {
        String enter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Включение системы");
        System.out.println("Прописать кнопки");
        Presenter presenter = new Presenter(new ConsoleView());
        while (true) {
            try {
                enter = scanner.next();
                switch (enter) {
                    case "a": // Create user.
                        presenter.createUserMenu();
                        enter = scanner.next();
                        switch (enter) {
                            case "user":
                                presenter.createUser();
                                break;
                            case "premUser":
                                presenter.createPremiumUser();
                                break;
                            case "admin":
                                presenter.createAdmin();
                                break;
                            case "god":
                                presenter.createGod();
                                break;
                        }
                        break;
                    case "show": // Показать всех пользователей.
                        presenter.showAllUsers();
                        break;
                    case "agroup":
                        presenter.createGroup();
                        break;
                    case "groupu": // Отправить юзера в группу.
                        // presenter.sendUserInGroup();
                        break;
                    default:
                        System.out.println("Нет такой команды");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
