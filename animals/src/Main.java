public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat(10,"Дом", false, true,"Боится воды");
        animals[1] = new Dog(6, "Будка", true, false,"Поддается дрессеровке");
        animals[2] = new Horse(17, "Загон", true,false,"Любит яблоки");

        Veterinar.treatAnimal(animals[0]);
        Veterinar.treatAnimal(animals[1]);
        Veterinar.treatAnimal(animals[2]);
    }
}
