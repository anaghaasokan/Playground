#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int a[n],i;
  for(i=0;i<n;i++)
  std::cin>>a[i];
  int e=0,o=0;
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      e=e+a[i];
    else
      o=o+a[i];
  }
  std::cout<<"The sum of the even numbers in the array is "<<e<<"\n";
    std::cout<<"The sum of the odd numbers in the array is "<<o;
}