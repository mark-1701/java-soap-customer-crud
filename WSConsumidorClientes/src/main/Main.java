package main;

import controller.Controller;
import model.Model;
import view.NewView;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        NewView view = new NewView();
        Controller controller = new Controller(view, model);
        controller.start();
        controller.printInformation();
        view.setVisible(true);
    }
}
