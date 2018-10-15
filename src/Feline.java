/**
 * 
 */

/**
 * @author AAASWANI
 *
 */
public abstract class Feline extends Animal implements IAnimalTemp{

	
	 private int _bodyTemp;
	    @Override
	    public void callSound() {
	        System.out.println("roar");
	    }
	     public int currentBodyTemperature() {
	        return _bodyTemp;
	    }

	    public boolean isOverheated() {
	        return _bodyTemp > 98; // This can be overridden based on the child class if needed
	    }

}
