import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        FileReader fileReader=null;
        FileWriter fileWriter=null;
        try {
            fileReader = new FileReader("FileCopy.java");
            fileWriter = new FileWriter("FileCopy.java.bak");
            int ch = fileReader.read();
            while (ch != -1) {
                fileWriter.write(ch);
                ch = fileReader.read();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
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
