#include<iostream>
int bacteria(int,int);
int main()
{
  int m,n,req;
  std::cin>>m>>n>>req;
  if(req<=bacteria(m,n))
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}
int bacteria(int a,int b)
{
  int i,bac=1;
  for(i=1;i<=b;i++)
  {
    bac=bac*a;
  }
  return bac;
}