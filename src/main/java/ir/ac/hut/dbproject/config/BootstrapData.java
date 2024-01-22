package ir.ac.hut.dbproject.config;

import ir.ac.hut.dbproject.model.*;
import ir.ac.hut.dbproject.repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Component;

import java.lang.reflect.Executable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final UserRepository userRepository;
    private final StudentRepository studentRepository;
    private final ProfessorRepository professorRepository;
    private final LanguageCourseRepository languageCourseRepository;
    private final AdminRepository adminRepository;
    private final StudentCourseRepository studentCourseRepository;

    @Override
    public void run(String... args) throws Exception {

        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Date and time now is: " + df.format(date.getTime()));

        LocalDateTime l = LocalDateTime.now();

        Professor u = Professor
                .builder()
                .fistName("majid")
                .lastName("esfanani")
                .username("mmjj")
                .password("hihihihih")
                .userType(UserType.PROFESSOR)
                .build();
        professorRepository.save(u);


        Student u2 = Student
                .builder()
                .fistName("soheil")
                .lastName("mahmoodi")
                .username("sshh")
                .password("hhhhh")
                .userType(UserType.STUDENT)
                .build();

        LanguageCourse course = LanguageCourse
                .builder()
                .language(Language.ENGLISH)
                .startDate(LocalDateTime.now())
                .professor(u)
                .build();

        StudentCourse studentCourse = StudentCourse
                .builder()
                .student(u2)
                .course(course)
                .build();

//        Set<StudentCourse> studentCourses = new HashSet<>();
//        studentCourses.add(studentCourse);
//
//        u2.setStudentCourses(studentCourses);
//        course.setStudentCourse(studentCourses);

        StudentCourseKey studentCourseKey = new StudentCourseKey();
        studentCourseKey.setCourseId(course.getId());
        studentCourseKey.setStudentId(u2.getId());
        studentCourse.setId(studentCourseKey);

        studentRepository.save(u2);
        languageCourseRepository.save(course);
//        try {

            studentCourseRepository.save(studentCourse);
//        } catch (JpaSystemException e) {
//            System.out.println("kir");
//        }
    }
}
