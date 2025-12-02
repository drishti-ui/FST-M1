interface BicycleOperation{
	
	
	public void applyBrake(int decrement) {
		System.out.println("Apply brake by " + decrement);	
	}
	public void speedup(int increment) {
		System.out.println("Speed up by " + increment);	
	}
	
}