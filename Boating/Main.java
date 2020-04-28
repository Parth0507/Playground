#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  std::cin>>a>>b>>c;
  if(a>=((b*75)+(c*30)))
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}