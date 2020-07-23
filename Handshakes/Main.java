#include<iostream>
using namespace std;
int main()
{
  int n,i,c=0;
  std::cin>>n;
  for(i=1;i<n;i++)
    c=c+i;
  std::cout<<c;
}