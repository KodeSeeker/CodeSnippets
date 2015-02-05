/**
In: Number
Out : Look and Say sequence:
1=>
1
11
21
1211
111221
312211
13112221
1113213211
31131211131221
13211311123113112211

**/
/**
call using 
for (int i=1;i<=10;i++) {
		System.out.println(num);
		num = lookandsay(num);            
}
**/

public String lookandsay(String number) {

String result= new StringBuilder();

char  repeat= number.charAt(0);

//prune num 
number=number.substring(1)+ " "; //additional " " at end to ensure all characters are checked!

int times=1;


for (Character actual: number.tocharArray())

{
	if(actual!=repeat)
	{
		result.append(times+ " " + repeat);
		times=1;//reset times.
		repeat=actual;// update repeat. 
	}
	else
	{
		times++;
	}
}

	return result;

}

