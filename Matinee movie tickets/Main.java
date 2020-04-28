#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float time,a;
  std::cin>>age>>time;
  if(age>13)
  {
    a=13.30;
    if(time==a)
      std::cout<<"$5.00";
    else
      std::cout<<"$8.00";
  }
  else
  {
    a=13.30;
    if(time==a)
      std::cout<<"$2.00";
    else
      std::cout<<"$4.00";
  }
}