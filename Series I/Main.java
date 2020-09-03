#include <iostream>
using namespace std;

int main() 
{
int x, y=1, z=1;
  cin>>x;
  float i =0.5;
  do
  {
    cout<<i<<" ";
    i = i+y;
    y= y*3;
     z++;
  }while(z<=x);
  return 0;
}