

public class Task4
{
    public static void main(String[] args)
    {
    	
    	String texts = "Programming languages like Java, "
    			+ "C++, and Python are widely used in modern software development. "
    			+ "They provide powerful tools for solving complex problems, but "
    			+ "mastering them requires dedication, practice, and a bit of "
    			+ "patience!";

    	String textSplitted[] = texts.split("[',. !]+");
    	

    	
    	for(int i = 0 ; i < textSplitted.length - 1; i++)
    	{
    		for(int j = 0; j < textSplitted.length -i  - 1; j++)
    		{
    			if(textSplitted[j].compareToIgnoreCase(textSplitted[j+1]) > 0)
    			{
    				
    				String temp = textSplitted[j+1];
    				textSplitted[j+1] = textSplitted[j];
    				textSplitted[j] = temp;
    			}
    		}
    	}
    	
    	
    	for(String s: textSplitted)
    	{
    		System.out.println(s);
    	}
    	
    	
    	
        
    	
    }
}
