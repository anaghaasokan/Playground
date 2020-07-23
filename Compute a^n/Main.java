#include<iostream>
int power(int a,int n)
{
  int p=1;
  while(n>0){
  p= p*a;
  n--;}
  return p;
}
int main()
{
  int a,n;
  std::cout<<"Enter the value of a\n";
  std::cin>>a;
  std::cout<<"Enter the value of n \n";;
  std::cin>>n;
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
}