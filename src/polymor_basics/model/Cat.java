package polymor_basics.model;

public class Cat extends Animal{
    private boolean isHungry;

    public void setIsHungry(Boolean isHungry){
        this.isHungry = isHungry;
    }
    public boolean getIsHungry() {
        return isHungry;
    }
}
