#include <iostream>
using namespace std;

int main() 
{
   int x, y=0;
  cin>>x;
    do
    {
     x=x/10;
      y++;
    }while(x>0);
  cout<<y;
    return 0;
}