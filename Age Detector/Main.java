#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int by,cy,age;
  std::cin>>by>>cy;
  if(cy<by)
  {
    age=(2000+cy-(1900+by));
    std::cout<<age;
  }
  else if(cy>by)
  {
    age=(2000+cy-(2000+by));
    std::cout<<age;
  }
}