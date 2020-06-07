int count = 0;
		if(input1<0) input1=input1*-1;
		if(input2<0) input2=input2*-1;
		if(input3<0) input3=input3*-1;
		if(input4<0) input4=input4*-1;
		if(input5<0) input5=input5*-1;
		
      if(input1==0 || input1%2==0)
		    count++;
		  if(input2==0 || input2%2==0)
		    count++;
		  if(input3==0 || input3%2==0)
		    count++;
		  if(input4==0 || input4%2==0)
		    count++;
		  if(input5==0 || input5%2==0)
		    count++;
		
return count;
