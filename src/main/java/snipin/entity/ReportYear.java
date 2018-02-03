package snipin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReportYear {

    @Id
    private Long id;

    @Column(name = "year")
    private int year;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "count_students")
    private int countStudents;

    public ReportYear() {}

    public ReportYear(int year, String departmentName, int coutStudents) {
        this.year = year;
        this.departmentName = departmentName;
        this.countStudents = coutStudents;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getCoutStudents() {
        return countStudents;
    }

    public void setCoutStudents(int coutStudents) {
        this.countStudents = coutStudents;
    }
}
