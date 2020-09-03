#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fs,sa,ss,aa,as,a,b,c;
  float fd,sd,ad;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  fd=fa*(fd/100);
  sd=sa*(sd/100);
  ad=aa*(ad/100);
  a= (fa+fs)-fd;
  cout<<"In Flipkart Rs."<<a;
b= (sa+ss)-sd;
  cout<<"\nIn Snapdeal Rs."<<b;
c= (aa+as)-ad;
  cout<<"\nIn Amazon Rs."<<c;
  {
    if(a<b&&c)
      cout<<"\nHe will prefer Flipkart";
    else if(b<a&&c)
      cout<<"\nHe will prefer Snapdeal";
    else if(c<a&&b)
      cout<<"\nHe will prefer Amazon";
  else

if(a==b||b==c||a==c)
{
if(fd>sd&&ad)
 cout<<"\nHe will prefer Flipkart";
{
if(sd>fd&&ad)
cout<<"\nHe will prefer Snapdeal";
{
if(ad>sd&&fd)
cout<<"\nHe will prefer Amazon";}
}
}
  }
}