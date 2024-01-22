package ir.ac.hut.dbproject.config;

import ir.ac.hut.dbproject.model.*;
import ir.ac.hut.dbproject.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
public class BootstrapData implements CommandLineRunner {

    private final UserRepository userRepository;
    private final StudentRepository studentRepository;
    private final ProfessorRepository professorRepository;
    private final LanguageCourseRepository languageCourseRepository;
    private final AdminRepository adminRepository;

    public BootstrapData(UserRepository userRepository, StudentRepository studentRepository,
                         ProfessorRepository professorRepository, LanguageCourseRepository languageCourseRepository,
                         AdminRepository adminRepository) {
        this.userRepository = userRepository;
        this.studentRepository = studentRepository;
        this.professorRepository = professorRepository;
        this.languageCourseRepository = languageCourseRepository;
        this.adminRepository = adminRepository;
    }

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

        Set<LanguageCourse> s = new HashSet<>();
        Set<Student> set = new HashSet<>();

        Student u2 = Student
                .builder()
                .fistName("soheil")
                .lastName("mahmoodi")
                .username("sshh")
                .password("hhhhh")
                .userType(UserType.STUDENT)
                .courses(s)
                .build();

        LanguageCourse course = LanguageCourse
                .builder()
                .language(Language.ENGLISH)
                .startDate(LocalDateTime.now())
                .professor(u)
                .students(set)
                .build();

        s.add(course);
        set.add(u2);

        studentRepository.save(u2);
        languageCourseRepository.save(course);







    }
}
