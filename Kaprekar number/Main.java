#include<iostream>

using namespace std;

int main()

{

 int k,n,r,s,sum1,sum2,c,temp,l,sum,a;

 a=1;

 cin>>k;

 n = 0;

 sum1 = 0;

 sum2 = 0;

 temp = k;

 s = k*k;

 do{

++n;

temp /= 10;

 }while(temp>0);

 

 for(c = 0; c < n; c++){

  r = s % 10;

  s = s/10;//8    

sum1 = sum1 + r*a;

a*=10;

 }

 a=1;

 while(s>0){

  r = s %10;

  s = s/10;

sum2 = sum2 +r*a;

a*=10;

 }

 sum  = sum1 + sum2;

 if(sum == k){

  cout<<"Kaprekar Number";  

 }

 else{

  cout<<"Not a Kaprekar Number";

 }  

}