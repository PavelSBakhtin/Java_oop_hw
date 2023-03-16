package src;

import src.model.FamilyTree;
import src.model.Human;
import src.presenter.Presenter;
import src.ui.Console;
import src.ui.View;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Human> familyTree = new FamilyTree<>();
        View view = new Console();
        new Presenter(view, familyTree);
        view.start();
    }
}
