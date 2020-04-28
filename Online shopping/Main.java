#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fshirt,fdisc,fsc,sshirt,sdisc,ssc,ashirt,adisc,asc,flipkart,snapdeal,amazon;
  std::cin>>fshirt>>fdisc>>fsc>>sshirt>>sdisc>>ssc>>ashirt>>adisc>>asc;
  flipkart=fshirt-(fshirt*fdisc/100)+fsc;
  snapdeal=sshirt-(sshirt*sdisc/100)+ssc;
  amazon=ashirt-(ashirt*adisc/100)+asc;
  std::cout<<"In Flipkart Rs."<<flipkart<<"\n";
  std::cout<<"In Snapdeal Rs."<<snapdeal<<"\n";
  std::cout<<"In Amazon Rs."<<amazon<<"\n";
  if(snapdeal<flipkart && snapdeal<=amazon)
    std::cout<<"He will prefer Snapdeal";
  else if(flipkart<=snapdeal && flipkart<=amazon)
    std::cout<<"He will prefer Flipkart";
  else if(amazon<flipkart && amazon<snapdeal)
    std::cout<<"He will prefer Amazon";
  
}