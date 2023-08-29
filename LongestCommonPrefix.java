package dsa_problems;

public class LongestCommonPrefix {
	private Object strs;




	public static String longestCommonPrefix(String[] strs)
	{
		if(strs == null || strs.length==0)
		{
			return "";
		}
		
		String prefix=strs[0];
		for(int i=1;i<strs.length;i++)
		{
			while(strs[i].indexOf(prefix)!=0)
			{
				prefix=prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty())
				{
					return "";
				}
			}
		}
		return prefix;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs1= {"flower","flow","flight"};
		System.out.println("Longest common prefix: "+longestCommonPrefix(strs1));
	}

}
