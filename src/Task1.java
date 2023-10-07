
public class Task1 {

	public static void main(String[] args) {
		int sunsDiameter = 865000;
		int earthsDiameter = 7600;
		
		double earthsVolume;
		double sunsVolume;
		earthsVolume = volumeCalc(earthsDiameter/2);
		sunsVolume= volumeCalc(sunsDiameter/2);
		
		System.out.println("Volume of Sun is: " + sunsVolume + " cubic miles"); 
		System.out.println("Volume of Earth is: " + earthsVolume + " cubic miles");
		System.out.println("Ratio of the volume f the Sun and the volume of Earth is: " + sunsVolume/ earthsVolume); 
	}

	public static double volumeCalc(int miles)
	{
		double output = 0;
		double formulaConst = 4.0 /3.0 ;
		
		output = formulaConst* Math.pow(miles,3) * Math.PI ;
	

		return output;
	}
}
