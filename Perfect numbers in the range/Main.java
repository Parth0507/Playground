#include<iostream>
int main()
{
  int a,b,i,j,per;
  std::cin>>a>>b;
  for(i=a;i<=b;i++)
  {
    per=0;
    for(j=1;j<i;j++)
    {
      if(i%j==0)
        per+=j;
    }
    
    if(per==i)
      std::cout<<i<<" ";
  }
}