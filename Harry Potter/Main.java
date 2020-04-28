#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,n,key;
  std::cin>>n;
  a=n%10;
  n=n/1000;
  key=a+n;
  std::cout<<key;
}