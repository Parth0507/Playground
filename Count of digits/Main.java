#include<iostream>
int main()
{
  // Type your code here
  int n,num;
  std::cin>>num;
  do
  {
    num=num/10;
    n++;
  }while(num>0);
  std::cout<<n;
}