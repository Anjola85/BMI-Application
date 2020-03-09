package com.example.bmi;

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

    public static void main(String[] args) {
        BMIModel myModel = new BMIModel("100", "1.8");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("45", "1.35");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("80", "1.2");
        System.out.println(myModel.getBMI());
    }
}
