#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,n,hops;
  std::cin>>x;
  std::cin>>y;
  n=((x-3)*(x-3))+((y-4)*(y-4));
  hops=pow(n,0.5);
  std::cout<<hops;
}