package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Autenticacion();
    }

    public static void Autenticacion() {
        Scanner scanner = new Scanner(System.in);

        String usuario = "educlic@gmail.com";
        String password = "t4nia";

        while (true) {
        System.out.println("Ingresa tu correo electronico ");
        usuario = scanner.nextLine();

        System.out.println("Ingresa tu contraseña ");
        password = scanner.nextLine();

        if (usuario.equals("educlic@gmail.com") && password.equals("t4nia")) {
          
          System.out.println("Sesion iniciada");
          break;
          
          
          } else {
          System.out.println("Usuario o contraseña incorrecta");
          }  
        }
    }
}
    
