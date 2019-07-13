package AccessModifier;

public class SubClass {
//member variables + methods + classes
	//public - accessed by (class + package + subclass + world)
	//protected - accessed by (class + package + subclass) and not accessed by world
	//default - accessed by (class + package) and not accessed by subclass + world
	//private - accessed by (class only) and not accessed by package + subclass + world
  private int a=10;
}
