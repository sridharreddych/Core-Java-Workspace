package com.sree.singleton;

public class SingletonPatternDemo {
	
	public static void main(String[] args) {
		//illegal construct
		//CompileTim e Error: The constructor SingleObject() is not visible
		//SingleObject object = new SingleObject();
		//Get the only object available
		SingleObject object = SingleObject.getInstance();
		SingleObject object1 = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();
		SingleObject object3 = SingleObject.getInstance();
			
		//show the message
		object.showMessage();
		if(object.equals(object1)){
			System.out.println("Yes Obj equals obj1");
			
		}
		else{System.out.println("Object not equals obj1");} 
			
			
			if(object1.equals(object2)){
			System.out.println("Yes Obj1 equals obj2");
		}		
		else{
			System.out.println("Object1 not equals obj2");
			} 
			
			if(object2.equals(object3)) {
			System.out.println("Yes obj2 equals obj3");
			}
			else
			{
				System.out.println("Object2 not equals obj3");
			} 
			object1.showMessage();
			object2.showMessage();
			object3.showMessage();
}
}