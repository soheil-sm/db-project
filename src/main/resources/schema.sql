CREATE TABLE users (Id int primary key
    ,firstname character(30) ,lastname character(30)
    ,password character(30) ,username character(30)
    ,userType character(30));

CREATE TABLE students (Id int primary key
    ,firstname character(30) ,lastname character(30)
    ,password character(30) ,username character(30)
    ,userType character(30));

CREATE TABLE professors (Id int primary key
    ,firstname character(30) ,lastname character(30)
    ,password character(30) ,username character(30)
    ,userType character(30));

CREATE TABLE admins (Id int primary key
    ,firstname character(30) ,lastname character(30)
    ,password character(30) ,username character(30)
    ,userType character(30));

CREATE TABLE courses (Id int primary key
    ,end_date timestamp without time zone
    ,start_date timestamp without time zone
    ,language character(30) ,professor_id int
    ,foreign key (professor_id) references professors(Id));

CREATE TABLE student_course (student_id int
    ,course_id int ,grade int
    ,foreign key (student_id) references students(Id)
    ,foreign key (course_id) references courses(Id));