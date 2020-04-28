#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int petrol,distance;
  std::cin>>mileage>>petrol>>distance;
  if(distance>(mileage*petrol))
    std::cout<<"Cannot reach";
  else
    std::cout<<"Can reach";
}