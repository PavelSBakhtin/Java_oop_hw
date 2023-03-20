package src.presenter;

import src.model.FamilyTree;
import src.model.Human;
import src.ui.View;
import src.model.IO;
import src.model.comporator.HumanComporatorByAge;

public class Presenter {
    private View view;
    private IO serialize;
    private FamilyTree<Human> familyConnect;
    private HumanComporatorByAge sortAge;

    public Presenter(View view, FamilyTree<Human> familyConnect, IO serialize,
            HumanComporatorByAge sortAge) {
        this.familyConnect = familyConnect;
        this.view = view;
        this.serialize = serialize;
        this.sortAge = sortAge;
        view.setPresenter(this);
    }

    public void addHumanNew(String name, String sex, int age) {
        familyConnect.addFamilyTree(new Human(name, sex, age));
        view.print("Новый член семьи добавлен !");
    }

    public void familyPrint() {
        String family = familyConnect.toString();
        view.print(family);
    }

    public void humanSearch(String name) {
        Human human = familyConnect.getByName(name);
        if (human == null)
            view.print("Такого человека нет в семье !");
        else {
            String foundHuman = human.toString();
            view.print(foundHuman);
        }
    }

    public void saveFamily() {
        familyConnect.saveObj(serialize);
        view.print("Семейное древо сохранено !");
    }

    public void loadFamily() {
        serialize.load("FreeFamily.data");
    }

    public void sortFamily(int choice) {
        if (choice == 1) {
            familyConnect.getFamilyTree().sort(null);
        } else {
            familyConnect.getFamilyTree().sort(sortAge);
        }
        view.print("Сортировка завершена !");
    }
}
