import java.util.Scanner;
public class ArrayStack {
int MAX=10;
int stack[]=new int[MAX];
int top=-1;
void push(int data)
{
if(top==MAX-1)
{
System.out.println("stack overflow");
}
else
{
top++;
stack[top]=data;
}
}
void pop()
{
if(top==-1)
{
System.out.println("stack underflow");
}
else
{
System.out.println(stack[top]+" is deleted from the stack");
top--;
}
}
void disp()
{
if(top==-1)
{
System.out.println("stack is empty");
}
else
{
for(int i=top;i>=0;i--)
{
System.out.print(stack[i]+" \t");
}
System.out.println();
}}
void peek()
{
if(top==-1)
{
System.out.println("stack is empty");
}
else
{
System.out.println(stack[top]+" is the top of the stack");
}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayStack s=new ArrayStack();
Scanner sc=new Scanner(System.in);
System.out.println("1.push\t 2.pop \t3.disp \t4.peek \t5.exit");
int ch;
do
{
System.out.println("enter your choice");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("enter data");
int data=sc.nextInt();
s.push(data);
break;
case 2:
s.pop();
break;
case 3:
s.disp();
break;
case 4:
s.peek();
break;
}
}while(ch<=4);
}
}
