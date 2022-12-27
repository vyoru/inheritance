public class Student {
    String firstname, lastname, group;
    double avgMark, payment;


    public Student(String firstname, String lastname, String group, double avgMark) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.group = group;
        this.avgMark = avgMark;
    }

    public double getScholarship() {
        return avgMark == 5 ? 10000 : 8000;
    }


}
