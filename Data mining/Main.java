#include<iostream>
using namespace std;
int main()
{
  int n,even,odd,r;
  std::cin>>n;
  while(n!=0)
  {
    r=n%10;
    if(r%2==0)
      even=even+r;
    else
      odd=odd+r;
    n=n/10;
  }
  if(even==odd)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}
    
