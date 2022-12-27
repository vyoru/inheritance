public class Dog extends Animal{
    Dog(int food, String location, boolean sleep, boolean eat, String characteristics) {
        super(food, location, sleep, eat, characteristics);
    }

    @Override
    public void makeNoise() {
        if(sleep = true){
            System.out.println("Собака спит");
        } else {
            System.out.println("Собака не спит");
        }
    }

    @Override
    public void eat() {
        if(eat= true){
            System.out.println("Собака ест");
        }else {
            System.out.println("Собака не ест");
        }
    }
}
