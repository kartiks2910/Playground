#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,x,b,y,p,q;
  cin>>a>>x>>b>>y;
p= a+b;
  q= x+y;
  while(q>=100)
  {
q= q-100;
    p=p+1;
   break;
  }
  cout<<p<<"\n"<<q;
    
}