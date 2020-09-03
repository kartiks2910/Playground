#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, i=0, j=1, x,y;
  cin>>a;

 for(y=2; y<a; y++)
 {
  x= i+j;
   i=j;
   j=x;
 }
  cout<<x;
 
}