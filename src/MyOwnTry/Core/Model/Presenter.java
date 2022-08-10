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
        model.createUser(view.enterName());
    }

    public void createPremiumUser() {
        model.createPremiumUser(view.enterName());
    }

    public void createAdmin() {
        model.createAdmin(view.enterName());
    }

    public void createGod() {
        model.createGod(view.enterName());
    }

    public void showAllUsers() {
        //model.showAllUsers();
        view.showAllUsers(model.showAllUsers());
    }

    //#region append user in group
    public void sendUserInGroup() {
        // Check number.
        String beNumber = "";
        int count = 0;
        do {
            beNumber = view.enterNumber();
            count++;
        } while (!model.isDigitString(beNumber));

        if (count > 1) {
            view.itIsNumber();
        }

        int num = model.getNumber(beNumber);

        // Check id.
        model.getEverythingUsers(num);
    }
    //#endregion
}
