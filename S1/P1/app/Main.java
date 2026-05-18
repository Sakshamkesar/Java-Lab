package app;

import university.Result;
import university.Admin;

public class Main {
    public static void main(String[] args) {

        Result r = new Result(75);


        System.out.println("Marks: " + r.getMarks());

        Admin admin = new Admin();
        admin.modifyResult(r, 90);

        System.out.println("Updated Marks: " + r.getMarks());

    }
}
