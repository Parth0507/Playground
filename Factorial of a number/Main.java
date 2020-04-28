#include<iostream>
int main(){
  // Type your code here
  int fact=1,n,i;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  std::cout<<fact;
}