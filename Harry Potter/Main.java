#include<iostream>
using namespace std;
int main()
{
  int n,first,last,sum;

   cin >> n;

   first = n;

last=n % 10;

first=first/1000;

sum=first+last;

  std::cout<<sum;

}