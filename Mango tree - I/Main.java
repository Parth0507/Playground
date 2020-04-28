#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t;
  std::cin>>r>>c>>t;
  if(c%2!=0)
  {
    if(t>=1&&t<=r)
      std::cout<<"Yes";
    else if(t<=(r*r)&&t>=(r*r-(r-1)))
      std::cout<<"Yes";
    else if(t==r+1 || t==(2*r+1) || t==(3*r+1))
        std::cout<<"Yes";
    else
      std::cout<<"No";
  }
  else
  {
   if(t>=(r+1)&&t<=(r*2))
      std::cout<<"Yes";
    else if(t<=(r*(c-1))&&t>(r*(c-1)-r))
      std::cout<<"Yes";
    else if(t==r+1 || t==(2*r+1) || t==(3*r+1))
        std::cout<<"Yes";
    else
        std::cout<<"No"; 
  }
}