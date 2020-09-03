#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,r, A, C;
  cin>>r>>a;
  {  
    A=(a*a);
    C=(r*r);
  
    if(A>C&&(a%r==0))
      cout<<"circle can be inside a square";
    else
      cout<<"circle cannot be inside a square";
  }
}