package lesson2Constructor;

public class MainClass {

	public static void main(String[] args) {
		SubClass cube = new SubClass();
		System.out.println(cube.getCubeVolume());
		
		SubClass cube2 = new SubClass(20,20,20);
		System.out.println(cube2.getCubeVolume());
	}

}
