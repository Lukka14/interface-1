package classes;

import interfaces.Animal;

public class Dog implements Animal {
    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public void run() {
        System.out.println("Dog is running!");
    }
}
