import java.util.Scanner;

public class LineDriver 
{
	
	public static void main(String[] args)
		{
		int xCord=0, yCord=0,xCord2=0,yCord2=0,width,width2;
		String color,color2;
		
		int uI;
		boolean finished2 = false;
		Point point = new Point(0,0);
		Point point2 = new Point(0,0);
		Point point3 = new Point(0,0);
		Point point4 = new Point(0,0);
		Line lineOne = new Line(0,0,0,0,0, "Black");
		Line lineTwo = new Line(0,0,0,0,0, "Black");
		Scanner Fun = new Scanner(System.in);
		
		while(finished2==false)
		{
		System.out.println("1 - Enter coordinates(One at a time), width and color for first line ");
		System.out.println("2 - Enter coordinates(One at a time), width and color for Second line ");
		System.out.println("3 - Compare the two lines");
		System.out.println("4 - Display coordinates, width, length and color for first line");
		System.out.println("5 - Display coordinates, width, length and color for second line ");
		System.out.println("6 - To quit");
		uI=Fun.nextInt();
		switch(uI)
		{
		case 1:
		{
			System.out.println("Enter First X-Cordinate");
			xCord=Fun.nextInt();
			System.out.println("Enter First Y-Cordinate");
			yCord=Fun.nextInt();
			System.out.println("Enter Second X-Cordinate");
			xCord2=Fun.nextInt();
			System.out.println("Enter Second Y-Cordinate");
			yCord2=Fun.nextInt();
			System.out.println("Enter Width of Line");
			width=Fun.nextInt();
			System.out.println("Enter Color of Line");
			color=Fun.next();
			if (Line.validateLine(xCord,yCord,width) &&  Line.validateLine(xCord2,yCord2,width))
			{
				
					 point = new Point(xCord,yCord);
					 point2=new Point(xCord2,yCord2);
					lineOne = new Line(point.getX(),point.getY(),point2.getX(),point2.getY(),width,color);
					 lineOne.toString();
					 break;
										
			}
			else System.out.println("Please enter valid cordinates");
			
		}
		case 2:
		{
			
			System.out.println("Enter First X-Cordinate");
			xCord=Fun.nextInt();
			System.out.println("Enter First Y-Cordinate");
			yCord=Fun.nextInt();
			System.out.println("Enter Second X-Cordinate");
			xCord2=Fun.nextInt();
			System.out.println("Enter Second Y-Cordinate");
			yCord2=Fun.nextInt();
			System.out.println("Enter Width of Line 2");
			width2=Fun.nextInt();
			System.out.println("Enter Color of Line 2");
			color2=Fun.next();
			
			if (Line.validateLine(xCord,yCord,width2) &&  Line.validateLine(xCord2,yCord2,width2))
			{
				
				
					 point3 = new Point(xCord,yCord);
					 point4=new Point(xCord2,yCord2);
					 lineTwo = new Line(point3.getX(),point3.getY(),point4.getX(),point4.getY(),width2,color2);	 
					 break;
										
			}
			else System.out.println("Please enter valid cordinates");
			
		}
		case 3:
		{
			if((lineOne.equals(lineTwo)))
			{
				System.out.println("The two lines are equal.");
				break;
			}
			else
			{
			System.out.println("The two lines are not equal.");
			break;
			}
			
				
		}
		case 4:
		{
			
				System.out.println("Cordinates of end-Points for line 1: " + point.toString()+ point2.toString() + " Width of Line 1: " + lineOne.getWidth() + " Length of Line 1: "+ Line.getLength(point, point2) +  " color of line 2: " + lineOne.getColor());
				break;
		}
		
		case 5:
		{
			
			System.out.println("Cordinates of end-Points for line 2 " + point3.toString()+ point4.toString() + " Width of Line 2: " + lineTwo.getWidth() + " Length of Line 2: "+ Line.getLength(point3, point4) +  " color of line 2: " + lineTwo.getColor());
			break;	
		}
		case 6:
		{ 
			finished2=true;
			break;
		}
		
		}
		}

		
		
		
		
		
		
	
		
		
		
		
		}
}
