package homework_2;

import java.util.ArrayList;

public abstract class specification {
    boolean alive;
    ArrayList<specification> children = new ArrayList<>();
    ArrayList<specification> parents = new ArrayList<>();
  
    private specification(boolean alive, specification children, specification parents){
        this.alive = alive;
        this.children.add(children);
        this.parents.add(parents);
    }
    
    private specification(){
        this.alive = true;
    }
}
