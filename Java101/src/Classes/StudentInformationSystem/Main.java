package Classes.StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Fatih Karaoğlu", "05545144295", "static");
        Teacher t2 = new Teacher("Batuhan Karaoğlu", "05346401433", "fluid");
        Teacher t3 = new Teacher("Gökberk Karaoğlu", "05412965553", "chemistry");

        Course statics = new Course("Engineering Mechanics I", "221", "static");
        statics.addTeacher(t1);

        Course fluidMach = new Course("Fluid Mechanics", "272", "fluid");
        fluidMach.addTeacher(t2);

        Course chemistry = new Course("Organic Chemistry", "145","chemistry");
        chemistry.addTeacher(t3);

        Student student1 = new Student("İnek Şaban", "123456", "4", fluidMach, statics, chemistry);
        student1.addBulkExamNote(100, 30, 50, 70, 70, 80);
        student1.isPass();
        student1.printAverage();
    }
}
