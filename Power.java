/*
Pow(a,b).. 
First  we use a O(n) solution


pow(a,b)
*/

int power (int a, int b)
{
    if(b==0)
        return 1;
    // case even
    if(b%2==0)
        return power(a,b/2) * power(a,b/2);
    else
        return a*power(a,b/2 )* power(a,b/2);
}

// can be improved to O(logn) by storing pow(a,b/2), rather than computing it each time

int power (int a, int b)
{
    if(b==0)
        return 1;
    // case even
 
    int temp =power(a,b/2);
    
    if(b%2==0) // b is even
            return temp*temp;
        
    else// b is odd
        {
            if(b>0)// not a float
                return a*temp*temp;
            else// float
                return (temp*temp)/a;
        }
}
