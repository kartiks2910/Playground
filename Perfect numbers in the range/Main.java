#include <iostream>
using namespace std;

bool A(int a)
{
	int i = 0;
	int sum = 0;

	while(i++<a)
	{
		if (a%i == 0 && i<a)
		{
			sum+=i;
		}
	}
	return sum == a;
}

int main()
{
int x,y;
	 cin>>x>>y;
  for (int i=x; i<=y; i++)
	{
		if (A(i))
		{
			cout<<i<<" ";
		}
	}

	return 0;
}