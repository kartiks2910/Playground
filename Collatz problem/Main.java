#include<iostream>
using namespace std;
int main()
{
  int n, y;
  cin>>n;
  cout<<n<<"\n";
  while(n>1)
  {
    if((n%2)==0)
    {
      n=n/2;
    cout<<n<<"\n";
      y++;}
    else
    {
      n= (3*n)+1;
      cout<<n<<"\n";
      y++;}
  }
  cout<<y;
}