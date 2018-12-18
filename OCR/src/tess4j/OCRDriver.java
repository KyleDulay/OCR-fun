package tess4j;

import java.io.File;
import java.io.*;
import net.sourceforge.tess4j.*;
 
public class OCRDriver{
    
    public static void main(String[] args) throws IOException{
        //Creating a file instance and referencing the file in this location
        File imageFile = new File("C:\\Users\\KD\\Documents\\Java_Workspace\\OCR\\images\\eurotext.png");
        //Creating an instance of Tesseract and setting the data path
        //That contains trained data and the English language library
        ITesseract instance = new Tesseract();
        instance.setDatapath("C:\\Users\\KD\\Documents\\Java_Workspace\\OCR\\tessdata");
     
    try {
     
        String result = instance.doOCR(imageFile);
        System.out.println(result);
     
    } catch (TesseractException e) {
        
    }
  }
}