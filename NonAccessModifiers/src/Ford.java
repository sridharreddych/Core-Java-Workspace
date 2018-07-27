public class Ford {
 int maxSpeed;
   public Ford(int maxSpeed) {
	this.maxSpeed=maxSpeed;
}

public void move() {
int speed = 0;
while(speed<maxSpeed) {
 System.out.println("Racing with speed"+speed);
speed++;
 }
}

public void printCarInfo() {
System.out.println("Car name: ford");
System.out.println("Car weight:230");
System.out.println("Engine Capacity: 3000cc");
}
}