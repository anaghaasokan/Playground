#include<iostream>
using namespace std;
int main()
{
 int n,k;
 std::cin>>n;
 int i=0,j=11;
  while(i<n)
  {
    k=j*j;
    std::cout<<k<<" ";
    j=j+4;
    i++;
  }
}