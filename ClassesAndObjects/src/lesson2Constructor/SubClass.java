package lesson2Constructor;

public class SubClass {

		//Member Variables
		int length;
		int bredth;
		int height;
		
		//Member Method
		public int getCubeVolume() {
			return (length*bredth*height);
		}
		
		//Constructor
		SubClass(){
		 length = 10;
		 bredth = 10;
		 height = 10;
		}
		
		//Constructor Overloading
		SubClass(int l,int b,int h){
			length = l;
			bredth = b;
			height = h;
		}
}
