#include<iostream>
int main()
{
  // Type your code here
  int n,count=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  int m;
  std::cin>>m;
  for(int i=0;i<n;i++)
  {
    if(m==a[i])
    {
      std::cout<<"She passed her exam";
      count++;
      break;
    }
   }
  if(count==0)
    std::cout<<"She failed";
 }
