package src;

import src.model.FamilyTree;
import src.model.Human;
import src.presenter.Presenter;
import src.ui.Console;
import src.ui.View;
import src.model.IO;
import src.model.comporator.HumanComporatorByAge;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree<Human> familyTree = new FamilyTree<>();
        familyTree.addFamilyTree(new Human("Алекс", "муж", 27));
        familyTree.addFamilyTree(new Human("Владимир Владимирович Путин", "муж", 70));
        familyTree.getByName("алекс");
        View view = new Console();
        IO serialize = new IO();
        HumanComporatorByAge sortAge =  new HumanComporatorByAge();
        new Presenter(view, familyTree, serialize, sortAge);
        view.start();
    }
}
