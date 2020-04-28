#include<iostream>
int gcd(int,int,int);
int main()
{
  int a,b,c,d,hcf;
  std::cin>>a>>b>>c>>d;
  hcf=gcd(a,b,c);
  if(hcf != d)
    std::cout<<"Answer is wrong.";
  else
    std::cout<<"Answer is correct.";
}
int gcd(int a,int b,int c)
{
  int small;
  small=a;
  if(b<a && b<c)
    small=b;
  else if(c<a && c<b)
    small=c;
  while(small>=1)
  {
    if(a%small==0 && b%small==0 && c%small==0)
      return small;
    else
      small--;
  }
}