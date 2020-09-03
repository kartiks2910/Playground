#include <iostream>
using namespace std;

int main() 
{
  int x=1, y, z, a=1, b, c;
 cin>>z>>y>>b;
  do{
    x++;
    a= a*z;
  }while(x<=y);
  if(b<=a)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}