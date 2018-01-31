package snipin.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "speciality")
@NamedQueries({
        @NamedQuery(name = "getAllSpeciality", query = "from Speciality")
})
public class Speciality implements Serializable{

    private static final long serialVersionUID = 6486000961572560840L;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 60)
    @Column(name = "speciality_name")
    private String name;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Speciality() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartament(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Speciality speciality = (Speciality) o;

        if (!id.equals(speciality.id)) return false;
        if (!name.equals(speciality.name)) return false;
        return department.equals(speciality.department);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + department.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Speciality{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", department=").append(department);
        sb.append('}');
        return sb.toString();
    }
}
