#include <iostream>
using namespace std;

int main() 
{
int x, y, z;
  cin>>x;
  y= x;
  while(x>0)
  {
  
    z = z + x%10;
    x/=10;
  }

   if(y%z==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  
    return 0;
}