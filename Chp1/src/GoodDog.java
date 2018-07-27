class GoodDog {

//make the instance variables private
 private int size;
 
//make the getter and setter methods public
 public int getSize() {
  return size;
}

public void setSize(int s) {
  size =s;
}

void bark() {

 if (size > 60) {
   System.out.println("Woof! Wooof! ");
 } else if (size >14 ) {
   System.out.println("Ruff! Ruff! ");
 } else {
   System.out.println("Yip! Yip!");
   }
 }
}
