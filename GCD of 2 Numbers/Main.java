#include<iostream>
int hcf(int n1, int n2) {
    if (n2 != 0)
        return hcf(n2, n1 % n2);
    else
        return n1;}
int main()
{
  int n1,n2;
  std::cin>>n1>>n2;
  std::cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<hcf(n1,n2);
}