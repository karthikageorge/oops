package loops;

public class Even_Oddsum {

	public static void main(String[] args) {
	int sumeven=0;
	int sumodd=0;
	for(int i=0;i<=10;i++)
	{
		if(i%2==0) {
			sumeven=sumeven+i;
		}
		else
		{
			sumodd=sumodd+i;
		}
	}
	System.out.println("Sum of even "+sumeven);
	System.out.println("Sum of odd "+sumodd);


	}

}
