package 外部排序;
import java.io.*;
public class OutsideSortLargeFile {
	public static final int MAX_ARRAY_SIZE=100000;
	public static final int BUFFER_SIZE=100000;
	
	public static void main(String[] args) throws Exception{
		sort("largeData.dat","sortFile.dat");
		displayFile("sortFile.dat");
	}
	
	public static void sort(String sourcefile,String targetfile) throws Exception{
		int numberOfSegments=initializeSegments(MAX_ARRAY_SIZE,sourcefile,"f1.dat");
		merge(numberOfSegments,MAX_ARRAY_SIZE,"f1.dat","f2.dat","f3.dat",targetfile);
	}
	
	private static int initializeSegments(int segmentSize,String originalFile,String f1) throws Exception{
		int[] list=new int[segmentSize];
		DataInputStream input=new DataInputStream(new BufferedInputStream(new FileInputStream(originalFile)));
		DataOutputStream output=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f1)));
		
		int numberOfSegments=0;
		while(input.available()>0){
			numberOfSegments++;
			int i=0;
			//注意 这个地方 之所以不使用segmentSize  是有原因的 
			//因为 最后一个 有可能不满足 segmentSize
			for(;input.available()>0&&i<segmentSize;i++){
				list[i]=input.readInt();
			}
			
			java.util.Arrays.sort(list,0,i);
			
			for(int j=0;j<i;j++){
				output.writeInt(list[j]);
			}
			
			
			
		}
		
		input.close();
		output.close();
		return numberOfSegments;
	}
	
	private static void copyHalfToF2(int numberOfSegments,int segmentSize,DataInputStream f1,DataOutputStream f2) throws Exception{
		for(int i=0;i<(numberOfSegments/2)*segmentSize;i++){
			f2.writeInt(f1.readInt());
		}
	}
	
	private static void mergeSegments(int numberOfSegments,int segmentSize,DataInputStream f1,DataInputStream f2,
			DataOutputStream f3)throws Exception{
		for(int i=0;i<numberOfSegments;i++){
			mergeTwoSegments(segmentSize,f1,f2,f3);
		}
		
		while(f1.available()>0){
			f3.writeInt(f1.readInt());
		}
		
	}
	
	private static void mergeTwoSegments(int segmentSize,DataInputStream f1,DataInputStream f2,
			DataOutputStream f3) throws Exception{
		int intFormF1=f1.readInt();
		int intFormF2=f2.readInt();
		int f1Count=1;
		int f2Count=2;
		
		while(true){
			if(intFormF1<intFormF2){
				f3.writeInt(intFormF1);
				if(f1.available()==0||f1Count++>=segmentSize){
					f3.writeInt(intFormF2);
					break;
				}
				else{
					intFormF1=f1.readInt();
				}
			}
			else{
				f3.writeInt(intFormF2);
				if(f2.available()==0||f2Count++ >=segmentSize){
					f3.writeInt(intFormF1);
					break;
				}
				else{
					intFormF2=f2.readInt();
				}	
			}
		}
		
		while(f1.available()>0&&f1Count++<segmentSize){
			f3.writeInt(f1.readInt());
		}
		
		while(f2.available()>0&&f2Count++<segmentSize){
			f3.writeInt(f2.readInt());
		}
		
	}
	
	private static void merge(int numberOfSegments,int segmentSize,String f1,String f2,String f3,String targetfile) throws Exception{
		if(numberOfSegments>1){
			mergeOneStep(numberOfSegments,segmentSize,f1,f2,f3);
			merge((numberOfSegments+1)/2,segmentSize*2,f3,f1,f2,targetfile);
			
		}
		else{
			File sortedFile=new File(targetfile);
			if(sortedFile.exists())
				sortedFile.delete();
			new File(f1).renameTo(sortedFile);
		}
	}
	
	private static void mergeOneStep(int numberOfSegments,int segmentSize,String f1,String f2,String f3) throws Exception{
		DataInputStream f1Input=new DataInputStream(new BufferedInputStream(new FileInputStream(f1),BUFFER_SIZE));
		DataOutputStream f2Output=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f2),BUFFER_SIZE));
		
		copyHalfToF2(numberOfSegments,segmentSize,f1Input,f2Output);
		f2Output.close();
		
		DataInputStream f2Input=new DataInputStream(new BufferedInputStream(new FileInputStream(f2),BUFFER_SIZE));
		DataOutputStream f3Output=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f3),BUFFER_SIZE));
		
		mergeSegments(numberOfSegments/2,segmentSize,f1Input,f2Input,f3Output);
		f1Input.close();
		f2Input.close();
		f3Output.close();
		
		
	}
	
	public static void displayFile(String filename) throws Exception{
		try{
			DataInputStream input=new DataInputStream(new FileInputStream(filename));
			for(int i=0;i<100;i++){
				System.out.print(input.readInt()+"    ");
			}
			input.close();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	
	
	
}


