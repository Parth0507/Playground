#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  std::cin>>a;
  if(a<=200)
  {
    b=a*0.5;
    std::cout<<"Rs."<<b;
  }
  else if(a<=400)
  {
    b=a*0.65+100;
    std::cout<<"Rs."<<b;
  }
  else if(a<=600)
  {
    b=a*0.80+200;
    std::cout<<"Rs."<<b;
  }
  else
  {
    b=a*1.25+425;
    std::cout<<"Rs."<<b;
  }
}