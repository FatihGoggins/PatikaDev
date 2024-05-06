package Classes.SalaryCalculator;
import java.time.Year;

public class Employee {
    String name;
    int salary;
    int workHours;
    int yearHired;

    public Employee (String name, int salary, int workHours, int yearHired) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.yearHired = yearHired;
    }

    public double tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        } else {
            return  0;
        }
    }

    public int bonus () {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double salaryRaise() {
        Year currentYear = Year.now();
        int howLongWorked = currentYear.getValue() - this.yearHired;
        double raisePercent = 0;
        if (howLongWorked >= 20) {
            raisePercent = 0.15;
        } else if (howLongWorked >= 10) {
            raisePercent = 0.1;
        } else {
            raisePercent = 0.05;
        }
        return  raisePercent * this.salary;
    }

    public void employeeInfo() {

        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.yearHired);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + salaryRaise());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş: " + (this.salary + salaryRaise() + bonus() - tax()));
    }
}
