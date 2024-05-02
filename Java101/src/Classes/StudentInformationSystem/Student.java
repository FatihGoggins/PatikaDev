package Classes.StudentInformationSystem;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String studentNo;
    String classes;
    double average;
    Student(String name, String studentNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
    }

    void addBulkExamNote (int note1, int note2, int note3, int oralNote1, int oralNote2, int oralNote3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.course3.note = note3;
        }
        if (oralNote1 >=0 && oralNote1 <= 100) {
            this.course1.oralNote = oralNote1;
        }
        if (oralNote2 >=0 && oralNote2 <= 100) {
            this.course2.oralNote = oralNote2;
        }
        if (oralNote3 >=0 && oralNote3 <= 100) {
            this.course3.oralNote = oralNote3;
        }
    }

    void printAverage() {
        System.out.printf("Ortalamanız: %.2f" , this.average);
    }

    void isPass() {
        this.average = ((this.course1.note + this.course2.note + this.course3.note) * 0.8 + (this.course1.oralNote + this.course2.oralNote + this.course3.oralNote) * 0.2) / 3.0;

        if (this.average >= 60) {
            System.out.println("Sınıfı Geçti :)");
        } else {
            System.out.println("Sınıfta Kaldı :(");
        }
    }
}
