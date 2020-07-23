#include<iostream>
//int fact(int );
int fact(int a)
{
  int f;
  if(a==1)
  {
    f=1;
    return f;
  }
  else if(a>1)
  {
    f=a*fact(a-1);
    return f;
  }
  
}
int main()
{
  int n1;
  std::cin>>n1;
  fact(n1);
  std::cout<<"The factorial of "<<n1<<" is "<<fact(n1);
}