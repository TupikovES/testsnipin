package snipin.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "student")
public class Student implements Serializable{

    private static final long serialVersionUID = 7915869521905121105L;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 30)
    @Column(name = "last_name")
    private String lastName;

    @NotEmpty
    @Size(min = 2, max = 30)
    @Column(name = "first_name")
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 30)
    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "phone")
    private String phone;

    @NotEmpty
    @Size(min = 2, max = 256)
    @Column(name = "address")
    private String address;

    @NotNull
    @Size(min = 1900)
    @Column(name = "year")
    private Integer year;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "speciality_id")
    private Specialty specialty;

    public Student() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!id.equals(student.id)) return false;
        if (!lastName.equals(student.lastName)) return false;
        if (!firstName.equals(student.firstName)) return false;
        if (!middleName.equals(student.middleName)) return false;
        if (!phone.equals(student.phone)) return false;
        if (!address.equals(student.address)) return false;
        if (!year.equals(student.year)) return false;
        return specialty.equals(student.specialty);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + middleName.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + year.hashCode();
        result = 31 * result + specialty.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("id=").append(id);
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", middleName='").append(middleName).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", year=").append(year);
        sb.append(", specialty=").append(specialty);
        sb.append('}');
        return sb.toString();
    }
}
