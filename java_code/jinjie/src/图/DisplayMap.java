package ͼ;
import javax.swing.*;
public class DisplayMap extends JApplet{
	
	private Person[] persons={
			new Person("liuxv",75,50),new Person("xiaomengmeng~",50,210),new Person("limi",75,275),
			new Person("yueyue",275,175),new Person("liuyimeng",400,245)
	};
	
	private int[][] edges={
			{0,1},{0,3},
			{1,0},{1,2},{1,3},
			{2,1},{2,3},{2,4},
			{3,0},{3,1},{3,2},
			{4,2},{4,3},
	};
	
	private Graph<Person> graph=new UnweightedGraph<Person>(edges,persons);
	
	public DisplayMap(){
		add(new GraphView(graph));
	}
	
	
	
	static class Person implements Displayable{
		private String name;
		private int x,y;
		
		Person(String name,int x,int y){
			this.name=name;
			this.x=x;
			this.y=y;
		}
		
		public int getX(){
			return x;
		}
		
		public int getY(){
			return y;
		}
		
		public String getName(){
			return name;
		}
		
		
	}
}
