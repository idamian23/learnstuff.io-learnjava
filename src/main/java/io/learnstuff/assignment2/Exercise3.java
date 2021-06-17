package io.learnstuff.assignment2;

import io.learnstuff.assignment2.exercise3utils.MySqlDatabase;
import io.learnstuff.assignment2.exercise3utils.OracleDatabase;
import io.learnstuff.assignment2.exercise3utils.PostGreSqlDatabase;

import java.util.Scanner;


/**
    Considering that the basic database operation usually performed on a database are
    create, read, update, delete (CRUD):
    Model an interface for database operations
    Implement the interface in at least three different ways
    By using a control structure and input provided by the console (using Scanner) use different implementations of
    the interface to perform different operations
    **/

public class Exercise3 {
   public static void main(String[] arg) {
      OracleDatabase oracleSQL = new OracleDatabase();
      PostGreSqlDatabase postgreSQL = new PostGreSqlDatabase();
      MySqlDatabase mySQL = new MySqlDatabase();

      Scanner scanner = new Scanner(System.in);


      System.out.println("Choose your database : \n1) Oracle\n2) MySql\n3) PostGreSql");
      int input = scanner.nextInt();

      if (input == 1){
         oracleSQL.create();
         oracleSQL.read();
         oracleSQL.update();
         oracleSQL.delete();
      } else if (input == 2 ){
         mySQL.create();
         mySQL.read();
         mySQL.update();
         mySQL.delete();
      } else if (input == 3){
         postgreSQL.create();
         postgreSQL.read();
         postgreSQL.update();
         postgreSQL.delete();
      }
   }
}
