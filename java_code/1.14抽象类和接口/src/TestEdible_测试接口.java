
public class TestEdible_���Խӿ� {
	public static void main(String[] args){
		Object[] objects={new tiger(),new Chicken(),new Apple()};
		for(int i=0;i<objects.length;i++){
			if(objects[i] instanceof Edible_�ӿ��ļ�){
				System.out.println(((Edible_�ӿ��ļ�)objects[i]).howToEat());
			}
		}
	}
}

class Animal{
	
}

class Chicken extends Animal implements Edible_�ӿ��ļ�{
	public String howToEat(){
		return "Chiken: fry it.";
	}
}

class tiger extends Animal{
	
}

abstract class Fruit implements Edible_�ӿ��ļ�{
	
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