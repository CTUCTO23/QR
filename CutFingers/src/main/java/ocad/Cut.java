package ocad;


import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class Cut {
	



	

	private static Image parte1, parte2,parte3,parte4,parte5,parte6,parte7,parte8;


	

	  private static String readQR(String pathname, int i) throws FormatException, ChecksumException, NotFoundException, IOException {
	    	
	    	
		  
		  
		  
	        InputStream qrInputStream = new FileInputStream(pathname);
	        BufferedImage qrBufferedImage = ImageIO.read(qrInputStream);
	        
	
	        
	        LuminanceSource source ;
	        BinaryBitmap bitmap;
	        Reader reader;
	        Result stringBarCode;
	        switch (i) {
			case 1:
				 source = new BufferedImageLuminanceSource( qrBufferedImage.getSubimage(1815,2100,1800,700));
			        bitmap = new BinaryBitmap(new HybridBinarizer(source));
			         reader = new MultiFormatReader();
			        stringBarCode = reader.decode(bitmap);
				  return stringBarCode.getText();
				 
			case 2:
				source = new BufferedImageLuminanceSource( qrBufferedImage.getSubimage(1815,5100,1800,700));
		        bitmap = new BinaryBitmap(new HybridBinarizer(source));
		         reader = new MultiFormatReader();
		        stringBarCode = reader.decode(bitmap);
			  return stringBarCode.getText();
			
			case 3:
				source = new BufferedImageLuminanceSource( qrBufferedImage.getSubimage(1815,8100,1800,700));
		        bitmap = new BinaryBitmap(new HybridBinarizer(source));
		         reader = new MultiFormatReader();
		        stringBarCode = reader.decode(bitmap);
			  return stringBarCode.getText();
		
			case 4:
				source = new BufferedImageLuminanceSource( qrBufferedImage.getSubimage(1815,11100,1800,700));
		        bitmap = new BinaryBitmap(new HybridBinarizer(source));
		         reader = new MultiFormatReader();
		        stringBarCode = reader.decode(bitmap);
			  return stringBarCode.getText();
			  
			  
			case 5:
				 source = new BufferedImageLuminanceSource( qrBufferedImage.getSubimage(6245,2100,1800,700));
			        bitmap = new BinaryBitmap(new HybridBinarizer(source));
			         reader = new MultiFormatReader();
			        stringBarCode = reader.decode(bitmap);
				  return stringBarCode.getText();
				 
			case 6:
				source = new BufferedImageLuminanceSource( qrBufferedImage.getSubimage(6245,5100,1800,700));
		        bitmap = new BinaryBitmap(new HybridBinarizer(source));
		         reader = new MultiFormatReader();
		        stringBarCode = reader.decode(bitmap);
			  return stringBarCode.getText();
			
			case 7:
				source = new BufferedImageLuminanceSource( qrBufferedImage.getSubimage(6245,8100,1800,700));
		        bitmap = new BinaryBitmap(new HybridBinarizer(source));
		         reader = new MultiFormatReader();
		        stringBarCode = reader.decode(bitmap);
			  return stringBarCode.getText();
		
			case 8:
				source = new BufferedImageLuminanceSource( qrBufferedImage.getSubimage(6245,11100,1800,700));
		        bitmap = new BinaryBitmap(new HybridBinarizer(source));
		         reader = new MultiFormatReader();
		        stringBarCode = reader.decode(bitmap);
			  return stringBarCode.getText(); 
			
			
				
			default:
			
			return "error";
			
			}
			
	       
	       
	    }

	public static void main(String[] args) {
		
		
		String filename ="";
		String actual="";
		for (int i = 1; i <= 337; i++) {
			actual = String.format("%04d", i);
			
			filename = "C:/Users/OCAD/Desktop/escaneado 1200 dpp/Scan"+actual+".jpg";
			
			System.out.println(filename);
			
			try {		
		
		    	
	    		BufferedImage originalImgage = ImageIO.read(new File(filename));
	
	    		int tWidth = originalImgage.getWidth();
	    		int tHeight = originalImgage.getHeight();

	    		System.out.println("Image Dimension: " + tWidth + "x" + tHeight);
	    		
	    	
	    		
	    		  String pathname = filename;

	
		
	  		 
		
				String cod1 = readQR(pathname,1);
				parte1 =(BufferedImage) originalImgage.getSubimage(3620,1990,1500,2100);
				File uno = new File("C:/test/"+cod1+".jpg");
				ImageIO.write((RenderedImage) parte1, "jpg",  uno);
				System.out.println(cod1);
				addpppImage(cod1);
				
		
				
				String cod2 = readQR(pathname,2);
				parte2 =(BufferedImage) originalImgage.getSubimage(3620,4990,1500,2100);
				File dos = new File("C:/test/"+cod2+".jpg");
				ImageIO.write((RenderedImage) parte2, "jpg", dos);
				  System.out.println(cod2);
				  addpppImage(cod2);
				  
				  String cod3 = readQR(pathname,3);
	            parte3 =(BufferedImage) originalImgage.getSubimage(3620,7990,1500,2100);
				File tres = new File("C:/test/"+cod3+".jpg");
				ImageIO.write((RenderedImage) parte3, "jpg", tres);
				  System.out.println(cod3);
				  addpppImage(cod3);
				  
				  
				  String cod4 = readQR(pathname,4);
				parte4 =(BufferedImage) originalImgage.getSubimage(3620,10890,1500,2100);
				File cuatro = new File("C:/test/"+cod4+".jpg");
			    ImageIO.write((RenderedImage) parte4, "jpg", cuatro);
				  System.out.println(cod4);
				  addpppImage(cod4);
				  
				  String cod5 = readQR(pathname,5);
				parte5 =(BufferedImage) originalImgage.getSubimage(8050,1990,1500,2100);
				File cinco = new File("C:/test/"+cod5+".jpg");
				ImageIO.write((RenderedImage) parte5, "jpg",cinco);
				  System.out.println(cod5);	
				  addpppImage(cod5);
				  
				  
				  String cod6 = readQR(pathname,6);
				parte6 =(BufferedImage) originalImgage.getSubimage(8050,4990,1500,2100);
				File seis = new File("C:/test/"+cod6+".jpg");
				ImageIO.write((RenderedImage) parte6, "jpg", seis);
	              System.out.println(cod6);
	              addpppImage(cod6);
	              
	              
	              String cod7 = readQR(pathname,7);
	            parte7 =(BufferedImage) originalImgage.getSubimage(8050,7990,1500,2100);
	  			File siete = new File("C:/test/"+cod7+".jpg");
	  			ImageIO.write((RenderedImage) parte7, "jpg", siete);
	                System.out.println(cod7);
	                addpppImage(cod7);
	                
	                String cod8 = readQR(pathname,8);
	            parte8 =(BufferedImage) originalImgage.getSubimage(8050,10890,1500,2100);
	    	    File ocho = new File("C:/test/"+cod8+".jpg");
	    		ImageIO.write((RenderedImage) parte8, "jpg", ocho);
	                System.out.println(cod8);
	                addpppImage(cod8);

	                
	                System.out.println("PAGINA "+ i + "COMPLETA");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    
			
			
		}
	
    

}
	
	
	public static void addpppImage(String codigo ) {
		String pathread = "C:/test/"+codigo+".jpg";
		String pathsave  = "C:/huellas/"+codigo+".jpg";
		
		 BufferedImage image;
		try {
			image = ImageIO.read(new File(pathread));
			 JPEGImageEncoder jpegEncoder = JPEGCodec.createJPEGEncoder(new FileOutputStream(new File(pathsave)));
			 JPEGEncodeParam jpegEncodeParam = jpegEncoder.getDefaultJPEGEncodeParam(image);
			 jpegEncodeParam.setDensityUnit(JPEGEncodeParam.DENSITY_UNIT_DOTS_INCH);
			 jpegEncoder.setJPEGEncodeParam(jpegEncodeParam);
			 jpegEncodeParam.setQuality(0.75f, false);
			 jpegEncodeParam.setXDensity(1200);
			 jpegEncodeParam.setYDensity(1200);
			 jpegEncoder.encode(image, jpegEncodeParam); image.flush();
			 System.out.println("OK PPP: " + codigo);
		} catch (IOException e) {
			System.out.println("ERROR AL CAMBIAR PP" + codigo);
			e.printStackTrace();
		}
		
	}
	
	
}
		
		