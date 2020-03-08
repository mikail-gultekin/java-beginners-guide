// lists the prime numbers between 2 and 100
class PrimeNums
{
	public static void main(String args [])
	{
		int low = 2, high = 100;
		boolean flag;
		
        while (low < high) 
		{
            flag = false;

            for(int i = 2; i <= low/2; ++i) 
			{
                if(low % i == 0) 
				{
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(low + " is prime");

            ++low;
        }
	}
}