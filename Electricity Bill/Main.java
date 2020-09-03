#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x;
  cin>>x;
  cout<<"Rs.";
  {
    if(x<=200)
    {x*=0.5;
      cout<<x;}
  else if(200<x<=400)
  {x*=0.65;
    cout<<x+100;}
    else if(400<x<=600)
    {x*=0.80;
    cout<<x+200;}
     if(x>600)
     {
       x*=1.25;
      cout<<x+425;}
  
  }
}