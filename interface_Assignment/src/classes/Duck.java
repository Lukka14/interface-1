package classes;

import interfaces.Animal;

public class Duck implements Animal {

    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public void run() {
        System.out.println("Duck is running!");
    }
}
