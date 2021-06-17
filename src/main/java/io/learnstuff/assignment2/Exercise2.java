package io.learnstuff.assignment2;

import io.learnstuff.assignment2.exercise2utils.Janitor;
import io.learnstuff.assignment2.exercise2utils.Professor;
import io.learnstuff.assignment2.exercise2utils.SecurityGuard;
import io.learnstuff.assignment2.exercise2utils.Student;

/**
    Write a class that represents an abstract person.
    Extend that class for particular types of people: professor, student, janitor, security guard,
    each with job specific methods, and common methods that they override, in their specific way.
    **/


public class Exercise2 {
        public static void main(String[] args){

            var professor = new Professor("Gil Dobrică");
            var student = new Student("Damian Ionut");
            var janitor = new Janitor("John McCleaner");
            var securityGuard = new SecurityGuard("Spartacus");

            System.out.println("-----------PROFESSOR-------------");
            professor.getName();
            professor.introduceYourself();
            professor.nameYourJob();
            professor.professorMethod(11);

            System.out.println("-----------STUDENT-------------");
            student.introduceYourself();
            student.nameYourJob();
            student.studentMethod(1000);

            System.out.println();
            System.out.println("-----------JANITOR-------------");
            janitor.introduceYourself();
            janitor.nameYourJob();
            janitor.janitorMethod(10, "odd");

            System.out.println();
            System.out.println("-----------SEC GUARD-------------");
            securityGuard.securityGuardEncryptionMethod("password", 2);
            securityGuard.securityGuardDecryptionMethod("rcuuyqtf", 2);
        }

}
