package MyOwnTry.UI;

import java.util.Scanner;

public class App {
    public void app() {
        String enter;
        Scanner scanner = new Scanner(System.in);
        while (true)
            try {
                System.out.println("Нажмите 'a' для запуска программы");
                enter = scanner.next();
                if (enter.equals("a")) {
                    Menu menu = new Menu();
                    menu.menu();
                } else {
                    System.out.println("Приложение не запущено");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }
}
