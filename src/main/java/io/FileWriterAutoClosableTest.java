package io;

import java.io.FileWriter;

public class FileWriterAutoClosableTest {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("src/main/java/io/test.txt")){
            fw.write("以这个角度看，石景山区的人都不算北京人，4环以外的人大部分也不能算是北京人。");
            fw.write("反正老北京城里人有这个心结，听到郊区人一口一句自己是北京人，他们就嫌烦。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
