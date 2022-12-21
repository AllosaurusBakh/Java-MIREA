import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/*
4) Написать функцию, которая сохранит содержимое каталога в
список и выведет первые 5 элементов на экран.
 */

public class BodyOfSafeCatalog
{

    public static void main(String[] args) throws IOException {

        String pathDir = "/Users/sheeesh/Downloads/text";
        String pathFile = "/Users/sheeesh/Documents/text.txt";
        SafeCatalog ff = new SafeCatalog(pathDir);
        ff.WriteToFileList(pathFile);
        ff.ReadFile(pathFile, 5);
    }

}