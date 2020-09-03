#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x;
  float y;
  cin>>x>>y;
  switch(x)
  {
    case 1:
      break;
    case 2:
      y= (y*0.5)+y;
      cout<<y;
      break;
    case 3:
      y= y*2;
      cout<<y;
      break;
    default: 
      cout<<"Number of items is more";
      break;
  }
}