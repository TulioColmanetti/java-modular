package digital.innovation.one.core;

import digital.innovation.one.utils.Calculator;

import java.sql.Date;
import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(3,6));

//        Included by default for all modules (java.base)
//        new ArrayList<>();
//        Specific libraries need to be required inside "module-info.java" file (e.g. java.sql)
//        new Date();
    }
}
