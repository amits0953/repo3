package learn;

public class Nokia extends Mobile {

	@Override
	public boolean pressCentreButton() {
		System.out.println("open menu");
		return true;
	}

}
