#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x, y;
  cin>>x>>y;
  {
    if(x>y)
    {x+=1900;
      y+=2000;
      cout<<y-x;}
    else
    { x+=2000;
      y+=2000;
      cout<<y-x;}
  }
}