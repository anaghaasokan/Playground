#include<iostream>
using namespace std;
int main()
{
  int n,r,c=0,k;
  std::cin>>n;
  k=n;
  while(n>0)
  {
    r=n%10;
    c=c+r;
    n=n/10;
}
  if(k%c==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}