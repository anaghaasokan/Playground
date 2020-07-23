#include<iostream>
int main()
{
  int n,large,i;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  large=a[0];
  for(i=1;i<n;i++)
  {
    if(a[i]>large)
    {
      large=a[i];}
  }
  std::cout<<large;
       
}