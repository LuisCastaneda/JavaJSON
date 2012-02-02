/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetdesession;

/**
 *
 * @author fabriceabbey
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public static String loadFileIntoString(String filePath) throws FileNotFoundException, IOException {
        byte[] fullSizeBuffer = new byte[(int) new File(filePath).length()];
        FileInputStream inputStream = new FileInputStream(filePath);
        inputStream.read(fullSizeBuffer);
        return new String(fullSizeBuffer);
    }
}
