#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  cout<<"Enter first number : Enter second number : Menu\n"
<<"1.Addition\n"
<<"2.Subtraction\n"
<<"3.Multiplication\n"
<<"4.Division\n"
<<"5.Remainder\n";
switch(z)
  {case 1: 
   x+=y;
   cout<<x;
   break;
   case 2:
  x=x-y;
   cout<<x;
   break;
   case 3:
   x*=y;
   cout<<x;
   break;
   case 4:
   x/=y;
   cout<<x;
   break;
   case 5:
   x%=y;
   cout<<x;
     break;
   default:
   cout<<"Invalid operation";
  }
return 0;
}

  