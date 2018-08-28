import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.*;
public class 实验四 {
	public static void main(String[] args){
		  // TODO Auto-generated method stub
		  FileInputStream fin=null;
		  DataInputStream in=null;
		  
		  try{
		   File f=new File("20171101.DAD");
		   
		   //long fileength=f.length();
		   byte[] buf=new byte[64];
		   
		  //DataInputStream in = new DataInputStream(new FileInputStream("c:\\000498.day"));
		   //DataOutputStream out=new DataOutputStream(new FileOutputStream("C:\\Users\\lenovo\\Desktop\\20171101\\20171101.txt"));  
		  
		  fin = new FileInputStream(f); 
		   in = new DataInputStream(fin);
		   ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("20171101.txt",true));
		  int num=0;
		  fin.read(buf, 0, 20);
		  long totalsize=0;
		  long filelength=f.length();
		  
		  ArrayList list=new ArrayList();
		  
		  int inI=fin.read(buf);
		  
		  while(inI==64){
		   
		   实验四 gps=new 实验四();
		   
		   totalsize+=64;
		   
		   if(totalsize>filelength){
			   

		String stockCode = new String(buf, 0, 8);
        System.out.print(stockCode+",");
        out.writeUTF(stockCode+",");
        String stockName = new String(buf, 16, 8,"GB2312");
        System.out.print(stockName+",");
        out.writeUTF(stockName+",");
        System.out.print("20171101,");
        out.writeChars("20171101,");
		long tlongBits = (long) (((buf[35] & 0xff) << 24)
				| ((buf[34] & 0xff) << 16) | ((buf[33] & 0xff) << 8) | ((buf[32] & 0xff) << 0));
		float open = Float.intBitsToFloat((int) tlongBits);
		System.out.print(open+",");
		out.writeChars(open+",");
		tlongBits = (long) (((buf[39] & 0xff) << 24) | ((buf[38] & 0xff) << 16)
				| ((buf[37] & 0xff) << 8) | ((buf[36] & 0xff) << 0));
		float high = Float.intBitsToFloat((int) tlongBits);
		System.out.print(high+",");
		out.writeChars(high+",");
		tlongBits = (long) (((buf[43] & 0xff) << 24) | ((buf[42] & 0xff) << 16)
				| ((buf[41] & 0xff) << 8) | ((buf[40] & 0xff) << 0));
		float low = Float.intBitsToFloat((int) tlongBits);
		System.out.print(low+",");
		out.writeChars(low+",");
		tlongBits = (long) (((buf[47] & 0xff) << 24) | ((buf[46] & 0xff) << 16)
				| ((buf[45] & 0xff) << 8) | ((buf[44] & 0xff) << 0));
		float close = Float.intBitsToFloat((int) tlongBits);
		System.out.print(close+",");
		out.writeChars(close+",");
		tlongBits = (long) (((buf[51] & 0xff) << 24) | ((buf[50] & 0xff) << 16)
				| ((buf[49] & 0xff) << 8) | ((buf[48] & 0xff) << 0));
		float vol = Float.intBitsToFloat((int) tlongBits);
		System.out.print(vol+",");
		out.writeChars(vol+",");
		tlongBits = (long) (((buf[55] & 0xff) << 24) | ((buf[54] & 0xff) << 16)
				| ((buf[53] & 0xff) << 8) | ((buf[52] & 0xff) << 0));
		float amount = Float.intBitsToFloat((int) tlongBits);
		System.out.println(amount);
		out.writeFloat(amount);
		out.writeChars("\n");
		//write into file - one line
		//这儿不会！！！！！
		BufferedWriter c=new BufferedWriter(new FileWriter("20171101.txt"));
	    //c.write(stockCode);
	    //c.write(stockName);
	    //c.write("20171101");
	   //out.write(fin.read(buf, 0, inI));
		
	
		inI=fin.read(buf);
		}
		  }
		  in.close();
		  out.close();
		  }
		   
		   
		  catch(Exception ex){
		   
		   ex.printStackTrace();
		   
		  }finally{
		  
		   try{
		    if(in!=null)in.close();
		    if(fin!=null)fin.close();
		   }catch(Exception ex){
		    
		    ex.printStackTrace();
		   }
		  }
		   
		 
 }
	
		  }
