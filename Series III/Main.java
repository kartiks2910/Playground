#include <iostream>
using namespace std;

int main() 
{
int x, y=5, z=1;
  cin>>x;
  int i = 6;
  do
  {
    cout<<i<<" ";
    i = i+y;
    y= y+5;
     z++;
  }while(z<=x);
  return 0;
}