// find the square root of a number with sufficient precision.
//O(log N) time. Binary search

public double sqrt(double a){
    
    // edge cases
    if(a<0)
        return -1;//invalid input
    if(a==0||a==1)
        return a;//edge case 2
    // core
    int start = 0;
    int end=a;
    // based on fact that if (a>1) then 0<sqrt(a)<a
    //if(a<1) then 0<a<sqrt(a)
    int precision=0.000001;
    //check for value of a
    if(a<1)
        end=1;
    while(end-start<precision){
        int mid= (start+end)/2;
        int midSqr=mid*mid;
        if(midSqr==a) 
            return mid;// we found the square root and the number was a perfect square
        if(midSqr<a)
            start=mid;
        else if (midSqr>a)
            end =mid;
    }
    // if all else fails
    return (start+end)/2;
}