#include<iostream>
int main()
{
  int a,b,c,n;
  std::cout<<"Enter first number : ";
  std::cin>>a;
  std::cout<<"Enter second number : ";
  std::cin>>b;
  std::cout<<"Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  std::cin>>n;
  switch(n)
  {
    case 1: c=a+b;
      std::cout<<c;
      break;
    case 2: c=a-b;
      std::cout<<c;
      break;
    case 3: c=a*b;
      std::cout<<c;
      break;
    case 4: c=a/b;
      std::cout<<c;
      break;
    case 5: c=a%b;
      std::cout<<c;
      break;
    default: std::cout<<"Invalid operation";
      break;
  }
}