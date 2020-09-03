#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b,c, d,e,f;
  cin>>a>>b>>c;
  d = c%b;
  
  if(d==1 || c<b || d==0)
    cout<<"Yes";
  else
    cout<<"No";
}