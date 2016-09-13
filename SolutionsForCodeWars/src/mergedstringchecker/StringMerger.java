package mergedstringchecker;

public class StringMerger
{

	public static boolean isMerge(String s, String part1, String part2)
	{
		try
		{
			if (s.length() != part1.length() + part2.length()) return false;

			s.toLowerCase();
			part1.toLowerCase();
			part2.toLowerCase();


			for (int i = 0, j = 0, k = 0; i < s.length(); i++)
			{
				if (j < part1.length() && s.charAt(i) == part1.charAt(j))
				{
					//additional comparison of the next (i + 1) char
					if (k < part2.length() && part1.charAt(j) == part2.charAt(k))
					{
						if (j + 1 < part1.length() && s.charAt(i + 1) == part1.charAt(j + 1))
						{
							j++;
							continue;
						} else if (k + 1 < part2.length() && s.charAt(i + 1) == part2.charAt(k + 1)) {
							k++;
							continue;
						}
					}
					j++;
					continue;
				} else if (k < part2.length() && s.charAt(i) == part2.charAt(k))
				{
					k++;
					continue;
				} else return false;
			}
		} catch (java.lang.Error err) 
		{
			return false;
		}

		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMerge("Can we merge it? Yes, we can!", "n weergeit ean!", "Ca m ? Yes,w c"));

	}

}
