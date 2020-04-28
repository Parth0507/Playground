#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int items;
  float time,htime;
  std::cin>>items>>time;
  if(items==2)
  {
    htime=time+(time*50/100);
    std::cout<<fixed;
    std::cout<<setprecision(2)<<htime;
  }
  else if(items==3)
  {
    htime=2*time;
    std::cout<<fixed;
    std::cout<<setprecision(2)<<htime;
  }
  else if(items>3)
    std::cout<<"Number of items is more";
}