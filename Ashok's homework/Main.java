#include<iostream>
int main()
{
    // Type your code here
  int i,j,r,c;
  std::cin>>r>>c;
  int m1[r][c],m2[r][c],m3[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      std::cin>>m1[i][j];
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      std::cin>>m2[i][j];
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      m3[i][j]=m1[i][j]+m2[i][j];
  }
   for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      std::cout<<m3[i][j]<<" ";
     std::cout<<"\n";
  }
}