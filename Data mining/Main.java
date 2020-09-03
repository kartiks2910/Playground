#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x, x2,x3,a,b;
  cin>>x;
  while(x>0)
  {
        a = x%10;
if(a%2==0)
{x2 = x2+a;}
    else
    {x3 = x3+a;}
    x/=10;
  }
if(x2==x3)
  cout<<"Yes";
  else
    cout<<"No";
}