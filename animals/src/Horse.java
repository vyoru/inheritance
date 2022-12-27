public class Horse extends Animal {
    Horse(int food, String location, boolean sleep, boolean eat, String characteristics) {
        super(food, location, sleep, eat, characteristics);
    }

    @Override
    public void makeNoise() {
        if(sleep = true){
            System.out.println("Лошадь спит");
        } else {
            System.out.println("Лошадь не спит");
        }
    }

    @Override
    public void eat() {
        if(eat= true){
            System.out.println("Лошадь ест");
        }else {
            System.out.println("Лошадь не ест");
        }
    }
}
