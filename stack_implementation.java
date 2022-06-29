
public class stack_implementation {

	int arr[]=new int[100];
	int top;
	int lim;

	stack_implementation()
	{
		top=-1;
		lim=10;
	}
	stack_implementation(int x)
	{
		top=-1;
		lim=x;
	}
	void push(int x)
	{
		if(top==lim-1)
			System.out.println("Stack Overflow");
		else
		{
			top++;
			arr[top]=x;
		}
	}
	void pop()
	{
		if(top==-1)
			System.out.println("Stack Underflow");
		else
			top--;
	}
	void peek()
	{
		System.out.println("Stack is");
		for(int i=top;i>=0;i--)
			System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stack_implementation s=new stack_implementation();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		
		s.peek();
		
		s.pop();
		s.pop();
		s.peek();
		
		
	}

}
