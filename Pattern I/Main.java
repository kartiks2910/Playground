#include <iostream>
using namespace std;

int main() 
{
int x, y, z=4;
  cin>>x;
  
  for(int i=1; i<=z; i++)
  {
    for(int j=1; j<=i; j++)
      cout<<x;
    x++;
    cout<<"\n";
  }
  x--;
  for(int i=z; i>=1; i--)
  {
    for(int j=1; j<=i; j++)
          cout<<x;
    x--;
    cout<<"\n";
  }
  return 0;
}