#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x, z=1;
  int i = 121;
  int y= 104;
  cin>>x;
  do{
    cout<<i<<" ";
    i = i+y;
    y = y+32;
    z++;
  }while(z<=x);
}