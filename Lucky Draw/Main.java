#include<iostream>
int main()
{
  int i,num,p=0;
  std::cin>>num;
  for(i=1;i<=num;i++)
  {
    if(num%i==0)
      p++;
  }
  if(p==2)
    std::cout<<"Eligible";
  else
    std::cout<<"Not eligible";
}