package snipin.entity;

public class ReportYear {

    private int year;
    private String departmentName;
    private int coutStudents;

    public ReportYear() {}

    public ReportYear(int year, String departmentName, int coutStudents) {
        this.year = year;
        this.departmentName = departmentName;
        this.coutStudents = coutStudents;
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
        return coutStudents;
    }

    public void setCoutStudents(int coutStudents) {
        this.coutStudents = coutStudents;
    }
}
