// Java program to find maximum length even word
class jpmorgan
{
	
// Function to find maximum length even word
static String findMaxLenEven(String str)
{
	int n = str.length();

	int i = 0;

	// To store length of current word.
	int currlen = 0;

	// To store length of maximum length word.
	int maxlen = 0;

	// To store starting index of maximum
	// length word.
	int st = -1;

	while (i < n)
	{

		// If current character is space then
		// word has ended. Check if it is even
		// length word or not. If yes then
		// compare length with maximum length
		// found so far.
		if (str.charAt(i) == ' ')
		{
			if (currlen % 2 == 0)
			{
				if (maxlen < currlen)
				{
					maxlen = currlen;
					st = i - currlen;
				}
			}

			// Set currlen to zero for next word.
			currlen = 0;
		}
		else
		{
			// Update length of current word.
			currlen++;
		}

		i++;
	}

	// Check length of last word.
	if (currlen % 2 == 0)
	{
		if (maxlen < currlen)
		{
			maxlen = currlen;
			st = i - currlen;
		}
	}

	// If no even length word is present
	// then return -1.
	if (st == -1)
		return "-1";

	return str.substring(st, st + maxlen);
}

// Driver code
public static void main(String args[])
{
	String str = "hey";

	System.out.println( findMaxLenEven(str));
}
}

// This code is contributed by Arnab Kundu
