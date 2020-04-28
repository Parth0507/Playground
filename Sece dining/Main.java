#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char door[5];
  int rail;
  std::cin>>door>>rail;
  if(door[0] == 'f')
  {
    if(rail==1)
      std::cout<<"Left Handed";
    else
      std::cout<<"Right Handed";
  }
  else if(door[0] == 'r')
  {
    if(rail==1)
      std::cout<<"Right Handed";
    else
      std::cout<<"Left Handed";
  }
  
}