package pl.sda.wyjatki;

import org.w3c.dom.ls.LSOutput;
import pl.sda.wyjatki.exception.EmailException;

import java.nio.channels.ScatteringByteChannel;
import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        User user = new User();
        user.setLogin("login");
       try {
           user.setEmail("adres");
       } catch (EmailException e) {
          e.printStackTrace();
           }

           }
             }

