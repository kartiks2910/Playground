#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  cin>>age;
  int a;
  cin>>a;
  switch(a)
  {
    case 10.15:
        if (age<=10)
      cout<<"$4.00";
      else
        cout<<"$8.00";
      break;
    case 13.30:
      if(age<=10)
        cout<<"$2.00";
      else
        cout<<"$5.00";
      break;
    default:
      if(age<=10)
      cout<<"$4.00";
      else
        cout<<"$8.00";
      break;
  }
}