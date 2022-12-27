public class Veterinar {
    public static void treatAnimal(Animal animal){
        String next = "|";
        System.out.printf("Еда: %s", animal.getFood());
        System.out.printf("Место обитания: %s %s", animal.getLocation(), next);
    }
}
