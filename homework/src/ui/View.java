package src.ui;

import src.model.FamilyTree;
import src.model.Human;
import src.presenter.Presenter;

public interface View {
    void setPresenter(Presenter presenter);

    void start();

    void print(String text);

    void print(Human human);

    void print(FamilyTree<Human> FamilyFree);

    String scan();
}
