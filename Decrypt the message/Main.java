#include <iostream>
using namespace std;

int main() 
{
   int x,y,div,sum=0, i;
  cin>>x>>y;
  div = x+y;
  for(i=1; i<div; i++)
  {
    if(div%i==0)
sum=sum+i;}
  if(sum==div)
  cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  
   return 0;

}