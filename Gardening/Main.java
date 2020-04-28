#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t;
  std::cin>>r>>c>>t;
  if(c%2!=0)
  {
    if(t>=(r+1)&&t<=(r*2))
      std::cout<<"It is a mango tree";
    else if(t<=(r*(c-1))&&t>(r*(c-1)-r))
      std::cout<<"It is a mango tree";
    else
        std::cout<<"It is not a mango tree";
  }
  else
  {
   if(t>=(r+1)&&t<=(r*2))
      std::cout<<"It is a mango tree";
    else if(t<=(r*(c-1))&&t>(r*(c-1)-r))
      std::cout<<"It is a mango tree";
    else
        std::cout<<"It is not a mango tree"; 
  }
}