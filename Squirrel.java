package Ques1;

public class Squirrel extends Pet {
	
	public int fpoint;
	public int cpoint;
	public int clpoint;
	public int Total;
	
	public String command;
	
	public Squirrel(String command) {
		
		this.command = command;
		
	}


	public void feed() {
		
		System.out.println("Feeding the Squirrel");
		fpoint = 5;
		
	}


	public void cuddle() {
		
		System.out.println("Cuddling the Squirrel");
		cpoint = 10;
	}

	
	public void clean() {
		
		System.out.println("Cleaning the Squirrel");
		clpoint = 15;
		
	}


	public void GetTotalPoints() {
		
		try {
			if(command.equals("Run5")) {
				
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
