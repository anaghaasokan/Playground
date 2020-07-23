#include<iostream>
int fib(int a)
{
  int f1=0,f2=1,f3;
  int i=2;;
  while(i<a)
  {
    f3=f1+f2;
    f1=f2;
    f2=f3;
    i++;
  }
  return f3;
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n);
}