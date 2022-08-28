package MyOwnTry.Core.Model;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(View view) {
        this.view = view;
        this.model = new Model();
    }

    public void createUserMenu() {
        view.createUserMenu();
    }

    public void createUser() { // Обычный юзер
        view.enterName();
        model.createUser(view.enterInConsole());
    }

    public void createPremiumUser() {
        view.enterName();
        model.createPremiumUser(view.enterInConsole());
    }

    public void createAdmin() {
        view.enterName();
        model.createAdmin(view.enterInConsole());
    }

    public void createGod() {
        view.enterName();
        model.createGod(view.enterInConsole());
    }

    public void showAllUsers() {
        view.showAllUsers(model.showAllUsers());
    }

    public void createGroup() {
        view.createGroup(); // вывод
        int idUser = getNumber();
        if (model.equalsId(idUser)) {
            view.enterNameGroup();
            model.appendGroupInStorage(model.createGroup(view.enterInConsole()));
        } else
            view.suchUserDoNotHave();
    }

    public void appendUserInGroup() {
        int idUser;
        int idGroup;
        boolean u;
        boolean g;
        do {
            view.enterIdGroupWhichPersonWantEnter();
            idUser = getNumber();
            u = model.checkHaveSuchUserOrNot(idUser);
            view.enterIDPersonWhichJoinInGroup();
            idGroup = getNumber();
            g = model.checkHaveSuchGroupOrNot(idGroup);
            System.out.println(u + "\n" + g);
            } while (!u || !g);
        model.appendUserInGroup(idUser, idGroup);

    }

    /** Для ввода и проверки является ли введенное значение числом*/
    public int getNumber() {
        // Check number.
        String beNumber = "";
        int count = 0;
        do {
            view.enterInConsole();
            beNumber = view.enterInConsole();
            count++;
        } while (!model.isDigitString(beNumber));

        if (count > 1) {
            view.itIsNumber();
        }
        return model.getNumber(beNumber);
    }
}
