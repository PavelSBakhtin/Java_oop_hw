package homework_1;

import java.util.ArrayList;

public class specification {
    boolean alive;
    ArrayList<specification> children = new ArrayList<>();
    ArrayList<specification> parents = new ArrayList<>();

    private specification(){
        this.alive = true;
    }

    private specification(boolean alive, specification children, specification parents){
        this.alive = alive;
        this.children.add(children);
        this.parents.add(parents);
    }
}
