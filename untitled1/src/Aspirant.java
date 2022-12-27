public class Aspirant extends Student {
    String work;

    public Aspirant(String firstname, String lastname, String group, double avgMark, String work) {
        super(firstname, lastname, group, avgMark);
        this.work = work;
    }

    @Override
    public double getScholarship() {
        return avgMark == 5 ? 20000 : 18000;
    }

}