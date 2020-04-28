#include<iostream>
#include<cstdlib>
int main()
{
  int id,marks;
  std::cin>>id;
  std::cin>>marks;
  if(marks>0)
    std::cout<<id<<" is eligible for reward.";
}
