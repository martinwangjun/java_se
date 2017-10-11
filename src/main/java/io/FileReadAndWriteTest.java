package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import org.apache.log4j.Logger;

/**
 * 
 * @author martin.wang
 *
 */
public class FileReadAndWriteTest {
    private static final Logger logger = Logger.getLogger(FileReadAndWriteTest.class); 
    private static final int BUFFER_SIZE = 32;
    
    // 不能读取二进制文件
    private static void useFileReader() {
        try(FileReader fr = new FileReader("src/main/java/io/test.txt")){
            char[] cbuf = new char[BUFFER_SIZE];
            int hasRead = 0;
            while((hasRead = fr.read(cbuf)) > 0) {
                System.out.println(new String(cbuf, 0, hasRead));
            }
        }
        catch (Exception e) {
            logger.debug(e.getMessage());
        }
    }
    
    // 读取文本文件会有问题
    private static void useFileInputStream() {
        try(FileInputStream fis = new FileInputStream("src/main/java/io/test.txt")){
            byte[] bBuff = new byte[BUFFER_SIZE];
            int hasRead = 0;
            while((hasRead = fis.read(bBuff)) > 0) {
                System.out.println(new String(bBuff, 0, hasRead));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // 写入文本文件
    private static void useFileWrite() {
        try(FileWriter fw = new FileWriter("src/main/java/io/test.txt")){
            fw.write("这还涉及到一个问题，现代的科技产物往往是各种知识杂交的结果。"
                    + "如果一个很轴的人轴到和自己过不去，那么他的日常生活是进行不下"
                    + "去的，因为他使用的大部分东西都或多或少涉及到他压根不懂的知识，"
                    + "比如车载全球定位仪涉及到相对论。他压根不知道什么叫张量分析，"
                    + "但是他知道要是他不能到女朋友制定的地方接他，他就得跪搓衣板了，"
                    + "所以他还得信任定位仪。 在你知道的日常用品中蕴含了你压根没证明过"
                    + "的知识，你其实每次在用就是在证明一次那个事实。\n");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // 写入文件
    private static void useFileOutputStream() {
        try(FileOutputStream fos = new FileOutputStream("src/main/java/io/test.txt")){
            fos.write(new byte[] {66, 67});
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // 复制二进制文件
    private static void copyFile() {
        try(FileInputStream fis = new FileInputStream("src/main/java/io/01.jpg");
                FileOutputStream fos = new FileOutputStream("src/main/java/io/02.jpg")){
            byte[] bBuffer = new byte[BUFFER_SIZE];
            int hasRead = 0;
            while ((hasRead = fis.read(bBuffer)) > 0) {
                fos.write(bBuffer, 0, hasRead);
                logger.debug(bBuffer);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        copyFile();
        useFileWrite();
        useFileReader();
        useFileOutputStream();
        useFileInputStream();
    }
}
