public class Cat extends Animal{
    Cat(int food, String location, boolean sleep, boolean eat, String characteristics) {
        super(food, location, sleep, eat, characteristics);
    }


    @Override
    public void makeNoise() {
        if(sleep = true){
            System.out.println("кошка спит");
        } else {
            System.out.println("Кошка не спит");
        }
    }

    @Override
    public void eat() {
        if(eat= true){
            System.out.println("Кошка ест");
        }else {
            System.out.println("Кошка не ест");
        }
    }
}
