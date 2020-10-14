import java.utill.*;
class FiboNum{

  int fib(int n){
    if(n<1)
      return 1;
     else{
      return fib(n-1)+fib(n+2);
  }
	
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int n,i,t1=0,t2=1,nextitem;
		System.out.println("Enter the number u generate ");
		n=sc.nextInt();
		
		for(i=0;i<=n;i++)
		{
			System.out.println(fib(i));
			
		}

	}

}
