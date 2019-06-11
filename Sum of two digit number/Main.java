#include<stdio.h>
int main()
{
  //Type your code here
  int n,r1,r2,sum=0;
  scanf("%d",&n);
  r1=n%10;
  n=n/10;
  r2=n%10;
  sum=r1+r2;
  printf("%d",sum);
  return 0;
}