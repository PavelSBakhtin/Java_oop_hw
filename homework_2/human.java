package homework_2;

import java.io.Serializable;
import java.util.*;

public class human implements Serializable {
    private boolean alive;
    private String name;
    private String sex;
    private int age;
    private ArrayList<human> children = new ArrayList<>();
    private human[] parents = new human[2];
    private static final long serialVersionUID = 1L;

    public human() {
        this.alive = true;
        this.name = "Новый";
        this.sex = "муж";
        this.age = 1;
    }

    public human(boolean alive, String name, String sex, int age) {
        this.alive = alive;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<human> getChildren() {
        return children;
    }

    public human[] getParents() {
        return parents;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setChildren(ArrayList<human> children) {
        this.children = children;
    }

    public void setParents(human[] parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        if (alive) {
            return "Человек живой" + ", зовут " + name + ", пол " + sex + ", возраст " + age
            + " лет, дети: " + children + ", родители=" + Arrays.toString(parents);
        } else {
            return "Человек умер" + ", звали " + name + ", пол " + sex + ", в возрасте " + age
            + " лет, дети: " + children + ", родители=" + Arrays.toString(parents);
        }
    }
}
