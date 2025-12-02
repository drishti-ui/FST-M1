interface BicycleParts{
	
	int tyres ;
	int maxSpeed ;
	
	public void showParts() {
		System.out.println("Number of tyre: " + tyres);
		System.out.println("Max speed: " + maxSpeed);
	}
	
}