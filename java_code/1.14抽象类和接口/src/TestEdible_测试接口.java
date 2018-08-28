
public class TestEdible_测试接口 {
	public static void main(String[] args){
		Object[] objects={new tiger(),new Chicken(),new Apple()};
		for(int i=0;i<objects.length;i++){
			if(objects[i] instanceof Edible_接口文件){
				System.out.println(((Edible_接口文件)objects[i]).howToEat());
			}
		}
	}
}

class Animal{
	
}

class Chicken extends Animal implements Edible_接口文件{
	public String howToEat(){
		return "Chiken: fry it.";
	}
}

class tiger extends Animal{
	
}

abstract class Fruit implements Edible_接口文件{
	
}

class Apple extends Fruit{
	public String howToEat(){
		return "Apple: Make apple cider.";
	}
	
}

class Orange extends Fruit{
	public String howToEat(){
		return "Orange: Make orange juice.";
	}
}