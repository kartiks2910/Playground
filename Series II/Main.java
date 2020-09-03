#include <iostream>
using namespace std;

int main() 
{
int x, y, z=1;
  int i= 121;
  int j =104;
  cin>>x;
  do
  {
    cout<<i<<" ";
    i = i+j;
    j = j+32;
    z++;
  }while(z<=x);
  return 0;
}