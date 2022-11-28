package Ques1;

public class Cat extends Pet {
	
	public int fpoint;
	public int cpoint;
	public int clpoint;
	public int Total;
	

	@Override
	public void feed() {
		
		System.out.println("Feeding the Cat");
		fpoint = 5;
		
	}

	@Override
	public void cuddle() {
		
		System.out.println("Cuddling the Cat");
		cpoint = 10;
		
	}

	@Override
	public void clean() {
		
		System.out.println("Cleaning the Cat");
		clpoint = 15;
		
	}

	@Override
	public void GetTotalPoints() {
			
			Total = fpoint + cpoint + clpoint;
			System.out.println("Total points : " +Total);
			
		}	

}
