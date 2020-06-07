int flag=0;
    for(int i = 2;i<input1/2;i++)
    {
        if(input1%i==0)
        {
         flag=1;
         break;
        }
    }
    if(flag==0) return 2;
    if(flag==1) return 1;
