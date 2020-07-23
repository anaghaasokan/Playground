#include<iostream>
int main()
{
  int n,i,k,j=11;
  std::cin>>n;
  i=0;
  while(i<n)
  {
    k=j*j;
    std::cout<<k<<" ";
    j=j+4;
    i++;
  }
}