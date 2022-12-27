public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иван","Иванов","1",4);
        Aspirant aspirant = new Aspirant("Пётр","Петров", "2",5,"work1" );
        Student aspirant2 = new Aspirant("Никита","Сидоров","2",4.5,"Work2");
        Student[] students ={student,aspirant,aspirant2};
        for (Student s:students) {
            System.out.println(s.getScholarship());

        }
    }
}
