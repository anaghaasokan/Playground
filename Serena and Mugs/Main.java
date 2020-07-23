#include<iostream>
using namespace std;
int main()
{
  int n,s,i,t=0;
  std::cin>>n>>s;
  int v[n];
  for(i=0;i<n;i++)
    std::cin>>v[i];
  for(i=0;i<n;i++)
    t=t+v[i];
  if(t<=s)
  std::cout<<"YES";
  else
    std::cout<<"NO";
  
}