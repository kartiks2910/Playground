#include<iostream>

#include<iomanip>

using namespace std;

int main()

{

int x,y,z,A;

 std::cin>>x>>y>>z>>A;

 float a = x/6;

 int b = A/6;

 int c = A%6;

 float k = ((float)b + (float)c/10);

 float d = z/k;

 float f = y/a;

 std::cout<<a<<"\n";

 std::cout<<std::fixed<<std::setprecision(1)<<k<<"\n";

 std::cout<<d<<"\n"<<f<<"\n";

 if(d>f)

   std::cout<<"Eligible to Win";

 else

   std::cout<<"Not Eligible to Win";

}