#include <iostream>
int main() 
{
	// Type your code here
  int x;
 std:: cin>>x;
  while(x>0)
  {
   int i=x%10;
    {if(i>0)
    std::cout<<i;}
   x/=10;
  }
	return 0;
}