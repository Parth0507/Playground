#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,min,d=1;
  std::cin>>a>>b>>c;
  min=a;
  if(b<a && b<c)
    min=b;
  else if(c<a && c<b)
    min=c;
  else
    min=a;
  if((a>b && a<c) || (a<b && a>c))
  {
    std::cout<<"The treasure is in box which has number "<<a<<"\n";
    if(a%min == 0 && b%min == 0 && c%min == 0)
      std::cout<<"The code to open the box is "<<min;
    else
      std::cout<<"The code to open the box is "<<d;
  }
    if((b>a && b<c) || (b<a && b>c))
  {
    std::cout<<"The treasure is in box which has number "<<b<<"\n";
    if(a%min == 0 && b%min == 0 && c%min == 0)
      std::cout<<"The code to open the box is "<<min;
    else
      std::cout<<"The code to open the box is "<<d;
  }
    if((c>b && c<a) || (c<b && c>a))
  {
    std::cout<<"The treasure is in box which has number "<<c<<"\n";
    if(a%min == 0 && b%min == 0 && c%min == 0)
      std::cout<<"The code to open the box is "<<min;
    else
      std::cout<<"The code to open the box is "<<d;
  }
}