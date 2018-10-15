/**
 * 
 */

/**
 * @author AAASWANI
 *
 */
public class Cat extends Feline {

    @Override
    public void callSound() {
        System.out.println("meow");
    }

    @Override
    public int run() {
        return 30;
    }

	@Override
	public int currentBodyTemp() {
		
		return 0;
	}

}
