if(input1<0) input1=input1*-1;
if(input1<=0 && input1>=9)
  return 0;
for(int i =0;i<2;i++)
{
  int a = input1%10;
  input1=input1/10;
}
return a;
