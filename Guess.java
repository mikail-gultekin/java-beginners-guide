// guess the letter game
class Guess
{
	public static void main(String args[])
		throws java.io.IOException
	{
		char ch, ignore, answer = 'K';
		
		do {
			System.out.println("I'm thinking of a letter between A and Z");
			System.out.println("Can you guess it: ");
			
			ch = (char) System.in.read();
			
			// discard any other characters in the input buffer
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
			
			if(ch == answer) System.out.println("** Right **");
			else System.out.println("Sorry wrong guess");
		} while(ch != answer);
	}
}