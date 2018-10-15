/**
 * 
 */

/**
 * @author AAASWANI
 *
 */
public class Dog extends Canine{

	

	 @Override
	    public void callSound() {
	        System.out.println("woof");
	        super.callSound();
	    }

	    @Override
	    public int run() {
	        return 10;
	    }

		@Override
		public int currentBodyTemp() {
			
			return 0;
		}

		
	
}
