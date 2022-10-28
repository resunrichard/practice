class Test_Array{
	public static void main(String args[]){
	int a[]={55,8,79,12,92,41,82,77,65};
	min(a);
	}
	
	static void min(int a[]){
		int minValue=a[0];
		for(int i=0; i<a.length;i++)
		if(minValue>a[i])
		minValue=a[i];
		System.out.println("Min element: "+minValue);}
		}
	