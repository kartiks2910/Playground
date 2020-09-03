#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n, f=1;
  cin>>n;
  for(n; n>=1; n--)
  {
    f*=n;}
  cout<<f;
}