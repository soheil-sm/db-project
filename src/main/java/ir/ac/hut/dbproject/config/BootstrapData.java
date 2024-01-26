package ir.ac.hut.dbproject.config;

import ir.ac.hut.dbproject.model.*;
import ir.ac.hut.dbproject.repositories.*;
import ir.ac.hut.dbproject.services.ProfessorService;
import ir.ac.hut.dbproject.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final ProfessorRepository professorRepository;
    private final LanguageCourseRepository languageCourseRepository;
    private final AdminRepository adminRepository;
    private final StudentCourseRepository studentCourseRepository;
    private final AttendanceRepository attendanceRepository;
    private final UserRepository userRepository;
    private final UserService userService;
    private final ProfessorService professorService;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static User USER;
    private static Student STUDENT;
    private static Professor PROFESSOR;
    private static Admin ADMIN;
    class Lonin {
        public User longin() throws Exception {


            System.out.println("please enter your username:");
            USER.setUsername(SCANNER.next());
            USER.setPassword(SCANNER.next());
            return userService.login(USER);

        }
    }
    public void run(String... args) throws Exception {
//
//            int n;
//
//            while (true) {
//                try {
//                    if (USER == null) {
//                        USER = new Lonin().longin();
//                    } else {
//                        System.out.println("Print -1 for log out or any number to continue");
//                        n = SCANNER.nextInt();
//                        if (n == -1) {
//                            USER = null;
//                        }
//                    }
//
//                    if (USER instanceof Professor) {
//                        PROFESSOR = (Professor) USER;
//                        System.out.println(
//                                """
//                                        What do you want to do?
//                                        1.Grading.
//                                        2.List of your classes.
//                                        3.Take attendance.
//                                        4.Exit"""
//                        );
//                        n  = SCANNER.nextInt();
//                        switch (n) {
//                            case 1: {
//                            }
//
//                            case 2: {
//
//                            }
//
//                            case 3 : {
//
//                            }
//
//                            case 4 : break;
//
//                        }
//                    }
//
//                    if (USER instanceof Student) {
//                        STUDENT = (Student) USER;
//                        System.out.println(
//                                """
//                                        What do you want to do?
//                                        1.List of your classes.
//                                        2.Your grades.
//                                        3.Exit"""
//                        );
//                        n = SCANNER.nextInt();
//                        switch (n) {
//                            case 1 :
//
//                            case 2 :
//
//                            case 3 : break;
//                        }
//
//                    }
//
//                    if (USER instanceof Admin) {
//                        ADMIN = (Admin) USER;
//                        System.out.println(
//                                """
//                                        What do you want to do?
//                                        1.Create class.
//                                        2.Add professor.
//                                        3.Add student
//                                        4.List of all classes.
//                                        5.List of all students.
//                                        6.List of all professors.
//                                        7.Exit"""
//                        );
//                        n = SCANNER.nextInt();
//                        switch (n) {
//                            case 1 :
//
//                            case 2 :
//
//                            case 3 : break;
//                        }
//
//                    }
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }
//            }

        LocalDateTime l = LocalDateTime.now();

        Professor u = Professor
                .builder()
                .fistName("majid")
                .lastName("esfanani")
                .username("mmjj")
                .password("hihihihih")
                .userType(UserType.PROFESSOR)
                .build();
        userService.signup(u);

        Attendance attendance = Attendance
                .builder()
                .present(true)
                .date(LocalDateTime.now())
                .build();

        List<Attendance> attendances = new ArrayList<>();

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

        attendance.setStudent(u2);
        attendance.setLanguageCourse(course);

        StudentCourseKey studentCourseKey = new StudentCourseKey();
        studentCourseKey.setCourseId(course.getId());
        studentCourseKey.setStudentId(u2.getId());
        studentCourse.setId(studentCourseKey);

        userService.signup(u2);
        languageCourseRepository.save(course);

        studentCourseRepository.save(studentCourse);


        attendanceRepository.save(attendance);


    }
}
