#include<iostream>
int main(){
  // Type your code here
  int n,b=0,g=0;
  std::cin>>n;
  int *p;
  p=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
    std::cin>>*(p+i);
  for(int i=0;i<n;i++)
  {
    if(*(p+i)%2==0)
      g++;
    else
      b++;
  }
  std::cout<<b<<"\n"<<g;
  return 0;
}