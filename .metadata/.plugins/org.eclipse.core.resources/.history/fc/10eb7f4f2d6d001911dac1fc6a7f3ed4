package test04;


import com.google.zxing.*;
import com.google.zxing.Reader;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;


import javax.imageio.ImageIO;
public class CutImage {
	
	 public static void main(String[] arg) {
		 
			
			//Provide number of rows and column
			int row = 4;
			int col = 3;
			
			BufferedImage originalImgage = ImageIO.read(new File("C:/Users/OCAD/Desktop/Scan0001.jpg"));
			
			//total width and total height of an image
			int tWidth = originalImgage.getWidth();
			int tHeight = originalImgage.getHeight();

			System.out.println("Image Dimension: " + tWidth + "x" + tHeight);
			
			//width and height of each piece
			int eWidth = tWidth / col;
			int eHeight = tHeight / row;

			int x = 0;
			int y = 0;

			String code ="22155G";
			BufferedImage SubImgagex = originalImgage.getSubimage(1000,2000, 200, 300);
			File outputfilex = new File("C:/test/"+code+".JPG");
			ImageIO.write(SubImgagex, "jpg", outputfilex);
			
	 

	        String pathname = "C:/Users/OCAD/Desktop/Scan0001.jpg";
	

	  
	 

	    private static void writeQR(String text, String pathname) throws WriterException, IOException {

	        int width = 600;
	        int height = 400;

	        String imageFormat = "jpg"; // "jpeg" "gif" "tiff"

	        BitMatrix bitMatrix = new QRCodeWriter().encode(text, BarcodeFormat.QR_CODE, width, height);
	        FileOutputStream outputStream = new FileOutputStream(new File(pathname));
	        MatrixToImageWriter.writeToStream(bitMatrix, imageFormat, outputStream);

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
	



				
			
	 }
		
			
			
		/**
			for (int i = 0; i < row; i++) {
				y = 0;
				for (int j = 0; j < col; j++) {
					try {
						System.out.println("creating piece: "+i+" "+j);
						
						BufferedImage SubImgage = originalImgage.getSubimage(y, x, eWidth, eHeight);
						File outputfile = new File("C:/test/im"+i+j+".JPG");
						ImageIO.write(SubImgage, "jpg", outputfile);
						
						y += eWidth;
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				x += eHeight;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
**/

