package Ques1;

public class Parrot extends Pet {
	
	public int fpoint;
	public int cpoint;
	public int clpoint;
	public int Total;
	public String command;
	
	public Parrot(String command) {
		
		this.command = command;
		
	}

	@Override
	public void feed() {
		
		System.out.println("Feeding the Parrot");
		fpoint = 5;
	}

	@Override
	public void cuddle() {
		
		System.out.println("Cuddling the Parrot");
		cpoint = 10;
		
	}

	@Override
	public void clean() {
		
		System.out.println("Cleaning the Parrot");
		clpoint = 15;
		
	}

	@Override
	public void GetTotalPoints() {
			
		try {
			if(command.equals("walk")) {
				
				throw new CaughtException(" : isCaught");
			}
			else {
				
				System.out.println("Did not Caught");
			}
			
		}catch(CaughtException e){
			e.printStackTrace();
			e.getMessage();
			
		}
		finally {
			
			Total = fpoint + cpoint + clpoint;
			System.out.println("Total points : " +Total);
			
		}
		
	}
	
	

}
