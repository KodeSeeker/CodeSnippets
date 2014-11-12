

public void permute ( String s)
{
    if(s==null)
        return;
     int len = s.length();
     char[] sArray= s.tocharArray();
     boolean[]used = new boolean[len-1]; 
     int count =0;  
     StringBuilder out= new StringBuilder();
     perumteHelper(sArray,used,len,count);
}

private void permuteHelper(char[] sArray,boolean[] used, int len, int count,StringBuilder out)
{
    if(count ==len)
    {
        System.out.println(out);
        return;
    }
    
    for(int i=0;i<in.length;i++)
    {
        if(used[i])
            continue;
        out.append(in[i]);
        used[i]=true;
        permuteHelper(sArray,used,len,count+1,out);
        used[i]=false;// to pick up character in next iteration
        out.setLength(out.length()-1);//remove character from out. 
    }
    
}
