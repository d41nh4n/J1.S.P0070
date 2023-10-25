/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import model.User;
import view.Menu;

/**
 *
 * @author Dai Nhan
 */
public class Users extends Menu<String> {

    private ArrayList<User> dataUser;
    private Utils util;

    public Users() {
        super("== MENU LOGIN ==", new String[]{
            "VietNamese", "EngLish", "Exit.."});
        dataUser = new ArrayList<>();
        util = new Utils();
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        Locale vietnam = new Locale("MessageBundle_vn_ID");
        Locale english = new Locale("MessageBundle_en_US");
        dispplay();
        String choice;
        do {
            System.out.println("Enter choice: ");
            choice = sc.nextLine();
            if (!choice.matches("[1-3]")) {
                System.out.println("Wrong choice!");
            }
        } while (!choice.matches("[1-3]"));
        switch (choice) {
            case "1":
                util.logIn(dataUser, vietnam);
                break;
            case "2":
                util.logIn(dataUser, english);
                break;
            case "3":
                break;
            default:
                System.out.println("Wrong input!");
        }
    }
}
