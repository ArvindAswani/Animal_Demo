/**
 * 
 */

/**
 * @author AAASWANI
 *
 */
public abstract class Canine  extends Animal implements IAnimalTemp {
	private int _bodyTemp;
    @Override
    public void callSound() {
        System.out.println("howl");
    }
    
     public int currentBodyTemperature() {
        return _bodyTemp;
    }

    public boolean isOverheated() {
        return _bodyTemp > 100; 
    }
}
