#include<iostream>
int main()
{
  int sum,n,num,i,j,per=0;
  std::cin>>n>>num;
  sum=n+num;
  for(i=1;i<sum;i++)
  {
    if(sum%i==0)
      per+=i;
  }
  if(per==sum)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}