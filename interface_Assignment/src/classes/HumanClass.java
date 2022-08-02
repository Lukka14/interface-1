package classes;

import extra.Entity;
import interfaces.Animal;
import interfaces.Human;

import java.util.Objects;

public class HumanClass extends Entity implements Human, Animal {
    private GEL money;
    private int birthYear;
    private String humanName;
    public HumanClass(){
        money=new GEL();
        setEntityType("Human");
    }

    public HumanClass(String humanName, int birthYear,double mass,GEL money){
        super(mass,"Human");
        this.humanName=humanName;
        this.birthYear=birthYear;
        this.money=new GEL(money.getMoney());
    }

    public void giveMoney(GEL money){
        this.money.setMoney(this.money.getMoney()+money.getMoney());
        money.setMoney(0);
    }

    public GEL takeMoney(double amount){
        if(money.getMoney()>=amount){
            money.setMoney(money.getMoney()-amount);
            return new GEL(amount);
        }
        return new GEL(0);
    }

    @Override
    public String getHumanName(){
        return this.humanName;
    }

    public void setNationality(String humanName) {
        this.humanName = humanName;
    }

    @Override
    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public boolean hasMoney(){
        return money.getMoney()>0;
    }

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
        System.out.println("Human is running!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HumanClass that = (HumanClass) o;
        return birthYear == that.birthYear && Objects.equals(money, that.money) && Objects.equals(humanName, that.humanName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), money, birthYear, humanName);
    }

    @Override
    public String toString() {
        return  "EntityType " + super.getEntityType()+ "\n" +
                "name: "+ humanName +"\n" +
                "birthYear: " + birthYear +"\n" +
                "mass: "+ super.getMass()+"\n" +
                "money: " + money + " GEL";
    }
}
