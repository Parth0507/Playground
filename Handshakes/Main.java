#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0;
  std::cin>>n;
  while(n>0)
  {
    sum+=(--n);
  }
  std::cout<<sum;
}