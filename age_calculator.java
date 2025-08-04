import java.util.Scanner ;
class age {
	public static void main(String[]args)
	{Scanner sc = new Scanner(System.in);
	
	System.out.println("===============enter here your birthday dates===============n");
	System.out.println("enter Your born year: ");
	int y = sc.nextInt();
	System.out.println("enter month: ");
	int m = sc.nextInt();
	System.out.println("enter date of the day: ");
	int d = sc.nextInt();
	System.out.println("so your date of birth is " +d+ "/" +m+ "/" +y);
	
	System.out.println("\n=============enter the present dates===========\n");
	
	System.out.println("enter the present year: "
	);
	int a = sc.nextInt();
	System.out.println("enter the present month: ");
	int b = sc.nextInt();
	System.out.println("enter the present day date: ");
	int c= sc.nextInt();
	
	int year = a-y;
	int month = b-m;
	int day = c-d;
	
	System.out.println("\nSo finally you are " +year+ " years plus " +month+ " months and " +day+ " days old.\n");
	}
}