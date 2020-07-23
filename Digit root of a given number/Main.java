#include<iostream>
int sum(int a)
{
  int s=0,r;
  if(a<=9)
    return a;
  else
    while(a>0)
    {
      r=a%10;
      s=s+r;
      a=a/10;
    }
  sum(s);
}

int main()
{
  int n;
  std::cin>>n;
  std::cout<<sum(n);
}