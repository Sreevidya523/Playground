#include<stdio.h>
int main()
{
  //Type your code here
  int n,q,r,sum=0;
  scanf("%d",&n);
  
  q=n/100;
  r=n%10;
  sum=q+r;
  printf("%d",sum);
  return 0;
}