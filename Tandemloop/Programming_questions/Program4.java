public class Program4 {
	static void divide(int[] mul,int[] input)
	{
		System.out.print("{");
		for(int i=0;i<mul.length;i++)
		{
			int count=0;
			for(int j=0;j<input.length;j++)
			{
				if(mul[i]>input[j] && input[j]!=1 && input[j]>=mul[i])
				{
					if(mul[i]%input[j]==0)
					{
					count++;
					}
				}
				else if(mul[i]<input[j])
				{
					if(input[j]%mul[i]==0)
					{
						count++;
					}
				}
				else if(mul[i]==input[j])
				{
					count++;
				}
				
			}
			System.out.print(mul[i]+":"+count);
			if(mul[i]<mul.length)
			{
				System.out.print(",");
			}
			count=0;
		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		int[] mul= {1,2,3,4,5,6,7,8,9};
		int[] input= {1,2,8,9,12,46,76,82,15,20,30};
		divide(mul,input);

	}

}
