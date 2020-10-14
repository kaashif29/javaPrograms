interface ShapeX {
 public String base = "This is Shape1";
 public void display1();
}

interface ShapeY extends ShapeX {
 public String base = "This is Shape2";
 public void display2();
}

class ShapeG implements ShapeY {
 public String base = "This is Shape3";
 public void display1() {
  System.out.println("Circle: " + ShapeX.base);
 }

 public void display2() {
  System.out.print("Circle: " + ShapeY.base);
 }
 public void display3() {
  System.out.print("Circle: " + ShapeY.base + ShapeX.base);
 }
}
