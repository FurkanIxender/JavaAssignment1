public class Task3
{
    public static void main(String[] args)
    {
    	
    	String text = "To be or not to be, that is the question;"
    	+"Whether `tis nobler in the mind to suffer"
    	+" the slings and arrows of outrageous fortune,"
    	+" or to take arms against a sea of troubles,"
    	+" and by opposing end them?";
    	
    	int spaces = 0,
    	vowels = 0,
    	letters = 0;
    	
    	char[] chArr = text.toCharArray();
    	
    	
    	
    	for(char c: chArr)
    	{
    		if(Character.isWhitespace(c))
    		{
    			spaces++;
    		}
    		
    		if(Character.isLetter(c))
    		{
    			letters++;
    			
    			
    			if(Character.toLowerCase(c) == 'a' ||  Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' 
    					|| Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u')
    			{
    				vowels++;
    			}
    			
    			
    		}
    		
    	}
    	
    	
    	System.out.println("The text contained vowels: " + vowels + "\n"
    	+ "consonants: " +   (letters - vowels)   + "\n" + "spaces: " + spaces);
    	
        
    	
    }
}
