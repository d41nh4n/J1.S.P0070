/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Random;

/**
 *
 * @author Dai Nhan
 */
class Validation {

    public boolean checkUserName(String userName) {
        if (userName.matches("\\d{10}")) {
            return true; // It's a valid account number
        }
        return false; // It's not a valid account number
    }

 public static boolean checkPassword(String string) {
    // Kiểm tra độ dài của chuỗi
    if (string.length() < 8 || string.length() > 31) {
        return false;
    }

    // Sử dụng biểu thức chính quy để kiểm tra sự tồn tại của chữ số và chữ cái
    if (string.matches(".*\\d.*") && string.matches(".*[a-zA-Z].*")) {
        return true;
    }

    return false;
}

    public String randomCaptcha() {
        // Tạo một chuỗi các ký tự được phép xuất hiện trong captcha
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        int length = 6;

        // Tạo một chuỗi captcha ngẫu nhiên
        Random random = new Random();
        StringBuilder captcha = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            captcha.append(characters.charAt(index));
        }

        return captcha.toString();
    }
}
