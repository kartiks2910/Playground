#include <iostream>


int main() 
{
   int integer1, integer2;
 std::cin>>integer1>>integer2;
  if(integer1<integer2)
  {
    std::cout<<integer1<<" is smallest number";
  }
  else
  {
    std::cout<<integer2<<" is smallest number";
  }
}