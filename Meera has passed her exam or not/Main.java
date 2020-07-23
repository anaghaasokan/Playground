#include<iostream>
int main()
{
  int n,reg,f=0,i;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>reg;
  for(i=0;i<n;i++)
  {
    if(a[i]==reg)
    {
      f=1;
      break;
    }
    else
      f=0;
  }
  if(f==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";

}