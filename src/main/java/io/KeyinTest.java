package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

public class KeyinTest {
    private static final Logger logger = Logger.getLogger(KeyinTest.class);

    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr)){
            String line = null;
            while((line = br.readLine()) != null) {
                if(line.equals("exit")) {
                    System.exit(1);
                }
                System.out.println(line);
                logger.debug(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
