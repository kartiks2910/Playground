#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  cin>>x>>y>>z;
  {
    if(x=y)
    {
      if(x+y==z || (x+y)*2==z) 
 cout<<"It is a mango tree";
 else
      cout<<"It is not a mango tree";
    }
    else
      cout<<"It is not a mango tree";
  }
}