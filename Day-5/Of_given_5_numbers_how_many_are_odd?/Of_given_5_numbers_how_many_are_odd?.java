int count = 0;
		if(input1<0) input1=input1*-1;
		if(input2<0) input2=input2*-1;
		if(input3<0) input3=input3*-1;
		if(input4<0) input4=input4*-1;
		if(input5<0) input5=input5*-1;
		  if(input1==0) return 1;
      if(input1%2==1)
		    count++;
      if(input2==0) return 1;
		  if(input2%2==1)
		    count++;
      if(input3==0) return 1;
		  if(input3%2==1)
		    count++;
      if(input4==0) return 1;
		  if(input4%2==1)
		    count++;
      if(input5==0) return 1;
		  if(input5%2==1)
		    count++;
		  
		
return count;
