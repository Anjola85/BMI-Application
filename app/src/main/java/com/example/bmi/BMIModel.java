package com.example.bmi;
import ca.roumani.i2c.Utility;

public class BMIModel {
    private double weight;
    private double height;

    //    constructor
    public BMIModel(String w, String h) {
        this.weight = Double.valueOf(w);
        this.height = Double.valueOf(h);
    }

    //    method
    public String getBMI() {
        double index = this.weight/(Math.pow(this.height, 2));
        String result = String.format("%.1f", index);
        return  result;
    }

    public String toPound() {
        double index = Math.round(this.weight/0.454);
        String result = String.format("%.0f",index);
//        System.out.println(result);
        return result;
    }

    public String toFeetInch() {
        String answer = Utility.m2FtInch(this.height);
//        System.out.println(answer);
        return answer;
    }



//    public static void main(String[] args) {
//        BMIModel myModel = new BMIModel("90", "1.8");
//        System.out.println("Your weight is " + myModel.toPound() + " lb, your height is " + myModel.toFeetInch() + ", and your BMI is " + myModel.getBMI());
//
////        myModel = new BMIModel("45", "1.35");
////        System.out.println(myModel.getBMI());
////
////        myModel = new BMIModel("80", "1.2");
////        System.out.println(myModel.getBMI());
//
////        myModel.toPound("77");
////        myModel.toFeetInch("1.78");
//    }
}
