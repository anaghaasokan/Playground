#include<iostream>
int main()
{
  int n;std::cin>>n;
  int i=0,k,j=6;
  //std::cout<<j;
  while(i<n)
  {
    j=j+5*i;
    std::cout<<j<<" ";
    i++;
  }
}