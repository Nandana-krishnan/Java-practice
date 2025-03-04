package myproject;
interface WaterBottleInterface{
	int b=98;
	String color ="Blue";
	void fillUp();
}
public class InterfaceMine implements WaterBottleInterface {

	public static void main(String[] args) {
		System.out.println(color);
		System.out.println(b);
		InterfaceMine ex = new InterfaceMine();
		ex.fillUp();
		}
	public void fillUp() {
		System.out.println("It is filled");
	}
		
}
