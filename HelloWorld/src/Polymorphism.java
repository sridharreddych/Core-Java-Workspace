//client or calling code
double dim = 5.0; //ie 5 meters radius or width
List listShapes = new ArrayList(20);
Shape s = new Circle();
listShapes.add(s); //add circle
s = new Square();
listShapes.add(s); //add square
getTotArea (listShapes,dim); //returns 78.5+25.0=103.5
//Later on, if you decide to add a half circle then define
//a HalfCircle class, which extends Circle and then provide an
//area(). method but your called method getTotArea(...) remains
//same.
s = new HalfCircle();
listShapes.add(s); //add HalfCircle
getTotArea (listShapes,dim); //returns 78.5+25.0+39.25=142.75
/** called method: method which adds up areas of various
** shapes supplied to it.
**/
public double getTotArea(List listShapes, double dim){
Iterator it = listShapes.iterator();
double totalArea = 0.0;
//loop through different shapes
while(it.hasNext()) {
Shape s = (Shape) it.next();
totalArea += s.area(dim); //polymorphic method call
}
return totalArea;

