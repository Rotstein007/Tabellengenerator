import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {
        String temp;

        String[][] tabelle = new String[5][10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            temp = br.readLine();
            String[] eingabe = temp.split(",");
            tabelle[i] = eingabe;
        }

        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(tabelle[i][j] + "\t");
            }
            System.out.println();
        }
    }
}