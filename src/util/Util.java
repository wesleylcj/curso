package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
    public static String lerTextoUsuario() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static int letNumeroInteiroUsuario() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static float lerNumeroComVirgulaUsuario() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            return Float.parseFloat(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
