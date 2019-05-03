package test04;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;


public class ConvertImageWithDimensionsAndPrint {
  

public static void main(String[] args) {

		

     

        try {
        	
        		BufferedImage originalImgage = ImageIO.read(new File("C:/Users/OCAD/Desktop/Scan0001.jpg"));
        		
        		int tWidth = originalImgage.getWidth();
        		int tHeight = originalImgage.getHeight();

        		System.out.println("Image Dimension: " + tWidth + "x" + tHeight);
        	
        		
        		  String pathname = "C:/Users/OCAD/Desktop/Scan0001.jpg";
        		  String text = readQR(pathname);
                  System.out.print(text);
    	
    		
    			BufferedImage SubImgagex = originalImgage.getSubimage(3620,1990,1500,2100);
    			File outputfilex = new File("C:/test/"+text+".jpg");
    			ImageIO.write(SubImgagex, "jpg", outputfilex);
    			
    		

        } catch (Exception e) {
            e.printStackTrace();
        }
    
try {
	
	BufferedImage originalImgage = ImageIO.read(new File("C:/Users/OCAD/Desktop/Scan0001.jpg"));
	
	int tWidth = originalImgage.getWidth();
	int tHeight = originalImgage.getHeight();

	System.out.println("Image Dimension: " + tWidth + "x" + tHeight);

	
	  String pathname = "C:/Users/OCAD/Desktop/Scan0001.jpg";
	  String text = readQR(pathname);
      System.out.print(text);


	BufferedImage SubImgagex = originalImgage.getSubimage(3620,1990,1500,7100);
	File outputfilex = new File("C:/test/"+text+".jpg");
	ImageIO.write(SubImgagex, "jpg", outputfilex);
	


} catch (Exception e) {
e.printStackTrace();
}
} 


    private static String readQR(String pathname) throws FormatException, ChecksumException, NotFoundException, IOException {
    	
    	
        InputStream qrInputStream = new FileInputStream(pathname);
        BufferedImage qrBufferedImage = ImageIO.read(qrInputStream);
        
  

        LuminanceSource source = new BufferedImageLuminanceSource(qrBufferedImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Reader reader = new MultiFormatReader();
        Result stringBarCode = reader.decode(bitmap);
        
        return stringBarCode.getText();
       
    }
    
    
  /**  
    private static void writeQR(String text, String pathname) throws WriterException, IOException {

        int width = 3;
        int height = 10;

        String imageFormat = "jpg"; // "jpeg" "gif" "tiff"

        BitMatrix bitMatrix = new QRCodeWriter().encode(text, BarcodeFormat.QR_CODE, width, height);
        FileOutputStream outputStream = new FileOutputStream(new File(pathname));
        MatrixToImageWriter.writeToStream(bitMatrix, imageFormat, outputStream);

    }
*/
}