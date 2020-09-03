#include<iostream>
using namespace std;
int main()
{
  int X,R,Y;
  float I,D,A,F;
  cin>>X>>R>>Y;
  
  I=(X*R*Y/100);
  A= I+X;
  D=2*I/100;
  F=A-D;
  cout<<I;
  cout<<"\n"<<A;
  cout<<"\n"<<D;
  cout<<"\n"<<F;
}