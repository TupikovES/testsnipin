package snipin.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import snipin.entity.Department;
import snipin.entity.Speciality;
import snipin.entity.Student;
import snipin.service.DataService;

import java.util.List;
import java.util.Random;

@Service("generateData")
public class GenerateData {

    @Autowired
    @Qualifier("studentService")
    private DataService<Student> studentService;

    @Autowired
    @Qualifier("specialityService")
    private DataService<Speciality> specialityService;

    @Autowired
    @Qualifier("departmentService")
    private DataService<Department> departmentService;

    private String[] firstNameList = {"Евгений", "Александр", "Петр", "Николай", "Виктор"};
    private String[] lastNameList = {"Иванов", "Петров", "Сидоров", "Никитин", "Путин"};
    private String[] middleNameList = {"Иванович", "Александрович", "Николаевич", "Викторович", "Степанович"};
    private String[] addressList = {"Самара", "Москва", "Санкт-Петербург", "Ростов", "Тольятти"};
    private String[] departmentNameList = {
            "Автоматики и Информационных технологий",
            "Теплоэнергетический",
            "Инженерно-технологический",
    };

    private Random random;

    public GenerateData() {

        random = new Random(47);

    }

    public void generate(int value) {
        for (String d : departmentNameList) {
            Department department = new Department();
            department.setName(d);
            departmentService.add(department);
            for (int i = 0; i < 3; i ++) {
                Speciality speciality = new Speciality();
                System.out.println(department);
                speciality.setDepartament(department);
                speciality.setName("Speciality_" + department.hashCode() + "_" + i);
                specialityService.add(speciality);
                for (int j = 0; j < value; j++) {
                    Student student = new Student();
                    student.setLastName(lastNameList[random.nextInt(lastNameList.length)]);
                    student.setFirstName(firstNameList[random.nextInt(firstNameList.length)]);
                    student.setMiddleName(middleNameList[random.nextInt(middleNameList.length)]);
                    student.setPhone(generatePhone(9));
                    student.setAddress(addressList[random.nextInt(addressList.length)]);
                    student.setYear(2010 + random.nextInt(9));
                    student.setSpeciality(speciality);
                    studentService.add(student);
                }
            }
        }
    }

    private String generatePhone(int value) {

        StringBuilder sb = new StringBuilder("7");

        for (int i = 0; i < value; i++) {
            sb.append(random.nextInt(10));
        }

        return sb.toString();
    }

}
