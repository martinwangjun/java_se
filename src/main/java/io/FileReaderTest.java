package io;

import java.io.FileReader;
import org.apache.log4j.Logger;

/**
 * 读取一个文本文件
 * 
 * @author martin.wang
 *
 */
public class FileReaderTest {
    private static final Logger logger = Logger.getLogger(FileReaderTest.class); 
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        try(FileReader fr = new FileReader("src/main/java/io/test.txt")){
            char[] cBuff = new char[BUFFER_SIZE];
            int hasRead = 0;
            while ((hasRead = fr.read(cBuff)) > 0) {
                System.out.println(new String(cBuff, 0, hasRead));
                logger.info("读取成功");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
