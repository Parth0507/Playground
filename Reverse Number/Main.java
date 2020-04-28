#include <iostream>
int main() 
{
	// Type your code here
    int reverse, n;
  std::cin>>n;
  while(n>0)
  {
    reverse=n%10;
    n=n/10;
    std::cout<<reverse;
  }
	return 0;
}