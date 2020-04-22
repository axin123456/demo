import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

    @Test
    public void test2() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("使用数组缓冲写文件");
            String[] content = {"来一个数组",
                    "来一个数组",
                    "来一个数组",
                    "来一个数组",
                    "来一个数组",
                    "来一个数组",
                    "来一个数组",
                    "来一个数组",
                    "来一个数组"
            };
            for (int i = 0; i < content.length; i++) {
                char[] array = content[i].toCharArray();
                fileWriter.write(array,0,array.length);
                fileWriter.write('\r');
                fileWriter.write('\n');
            }
        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            }

        }


    @Test
    public void test1() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("FileCopy.java");
            //fileWriter = new FileWriter("FileCopy.java.bak");
            //int ch = fileReader.read();
            char[] buf = new char[100];
            int realCount = fileReader.read(buf);
            while (realCount != -1) {
                /*fileWriter.write(ch);
                ch = fileReader.read();*/
                for (int i = 0; i < realCount; i++) {

                    System.out.print(buf[i]);

                }
                realCount = fileReader.read(buf);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
