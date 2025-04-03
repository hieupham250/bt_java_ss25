package validator.presentation;

import validator.util.Validator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Validator.validateInputInteger("Nhập số nguyên: ",sc);
        float b = Validator.validateInputFloat("Nhập số thực: ",sc);
        double c = Validator.validateInputDouble("Nhập số nguyên double: ",sc);
        boolean check = Validator.validateInputBoolean("Nhập kiểu boolean: ",sc);
        String str = Validator.validateInputString("Nhập chuỗi: ",sc,5,10);
        String email = Validator.validateInputEmail("Nhập Email: ",sc);
        String phone = Validator.validateInputPhoneNumber("Nhập số điện thoại: ",sc);
    }
}
