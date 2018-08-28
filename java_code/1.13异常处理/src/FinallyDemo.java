
public class FinallyDemo {
	public static void main(String[] args){
	java.io.PrintWriter output=null; //初始化文件变量
	
	try{
		output=new java.io.PrintWriter("txst.txt");//创建文件
		output.println("welcome to liuxv and wuyue ");//写入内容
	}
	catch(java.io.IOException ex){
		ex.printStackTrace();
	}
	
	finally{
		if(output!=null)
			output.close();
	}
	
	System.out.println("End of pragram.");
	}
}
