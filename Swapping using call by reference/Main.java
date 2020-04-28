#include<iostream>
void swap(int &a,int &b)
{
  int temp;
  temp=b;
  b=a;
  a=temp;
}
int main()
{
  int m,n;
  std::cin>>m>>n;
  std::cout<<"Before swapping a= "<<m<<" and b="<<n<<"\n"; 
  swap(m,n);
  std::cout<<"After swapping a= "<<m<<" and b="<<n;
}