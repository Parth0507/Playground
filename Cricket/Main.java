#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int balls,runs,scored,bowled;
  float crr,rrr,overs,finished;
  std::cin>>balls>>runs>>scored>>bowled;
  overs=float(balls/6)+float(balls%6)/10;
  std::cout<<overs<<"\n";
  finished=float(bowled/6)+float(bowled%6)/10;
  std::cout<<finished<<"\n";
  crr=float(scored)/finished;
  std::cout<<fixed;
  std::cout<<setprecision(1)<<crr<<"\n";
  rrr=float(runs)/overs;
  std::cout<<rrr<<"\n";
  if(crr>=rrr)
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
}