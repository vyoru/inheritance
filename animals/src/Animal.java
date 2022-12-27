public class Animal {
    int food;
    String location;
    String characteristics;
    boolean sleep;
    boolean eat;
    Animal(int food, String location, boolean sleep,boolean eat, String characteristics){
        this.food = food;
        this.location = location;
        this.sleep = sleep;
        this.eat = eat;
        this.characteristics = characteristics;
    }
    public void makeNoise(){
        if(sleep = true) {
            System.out.println("Сон");
        }    else{
            System.out.println("Шум");
        }
    }
    public void eat(){
        if(eat = true){
            System.out.println("Ест");
        } else {
            System.out.println("Не ест");
        }
    }
    public void sleep(){
        this.sleep = true;
    }
    public int getFood(){
        return food;
    }
    public String getLocation(){
        return location;
    }
}
