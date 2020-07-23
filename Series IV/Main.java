#include<iostream>
using namespace std;
int main()
{
  int n,i=1,k,k1;
  std::cin>>n;
  while(i<=n)
  {
    k=i*i;
    if(k%2==0){
      k1=k-2;
    std::cout<<k1<<" ";
  }
    else{
      k1=k-1;
      std::cout<<k1<<" ";}
    i++;
}
}