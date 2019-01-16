
public class Line
{
	private int width;
	private String color;
	private static int P;
	private static int Q;
	public Line()	//DFC
	{
		new Point(0,0);
		new Point(0,0);
		this.color="Black";
		this.width=1;
	}
	public Line(int x, int y, int x2, int y2,int width, String color)	//DvC
	{
		P=x;
		Q=y;
		new Point(x,y);
		new Point(x2,y2);
		this.color=color;
		this.width=width;
		
		
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}	

	
	

	public static boolean validateLine(int x, int y, int width)
	{
		if(x<0 && y>0 && width > 0 )
		{
			System.out.println("Invalid X-intercept");
			return false;
		}
		if(x>0 && y<0 && width > 0 )
		{
			System.out.println("Invalid y-intercept");
			return false;
		}
		if(x>0 && y>0 && width <= 0 )
		{
			System.out.println("Invalid Width");
			return false;
		}
		else
			return true; 
		
		
	}
	
	public String toString(Line Line) 
	{
		return "Hi";
	}
	
	public static int getEndPointX() {
		return P;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + width;
		return result;
	}
	public boolean equals(Line obj) {
		if (Line.getEndPointX() == Line.getEndPointX() && Line.getEndPointY() == Line.getEndPointY() && this.color == obj.color && this.width == obj.width)
			return true;
		else
			return false;
	}
	public static int getEndPointY() {
		return Q;
	}
	public static double getLength(Point point1, Point point2)
	{
		double Length = 0;
		Length =Math.sqrt(Math.pow((point2.getX()-point1.getX()), 2) +  Math.pow((point2.getY()-point1.getY()), 2));
		return Length;
	}

	
	
	

}
