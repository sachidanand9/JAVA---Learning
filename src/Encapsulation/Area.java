package Encapsulation;

public class Area {
     int length, breadth;
    
    Area(int length, int breadth){
    	this.length = length;
    	this.breadth = breadth;
    }
    
    public void getArea() {
    	int area = length*breadth;
    	System.out.println("Area:" +area);
    }
    
    public static void main(String[] args) {
		Area A = new Area(12,12);
		A.getArea();
	}
}
