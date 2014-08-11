/**
 * Assume that the URL's shortened  by the service is limited by INT_MAX.
 * */
 


public class TinyURL
{
    public static int urlID=0; // max number of URL's  shortened by this service. is limited by INT_MAX 
    public static const int  URL_LENGTH=36;
    //Maps to simulate a database.
    public Map<String,String> map= new HashMap<String,String>(); // maps base36 to URL.
    
    
    public Map< String,Integer> countURL= new HashMap<String,Integer>();
    
    //encode the URL    
    public static String encode(String URL)
    {
        //perform URL sanitization.
        int id;
        if (countURL.contains(URL))
        {
            // we already have a number for this URL.
            id= countURL.get(URL);
        }
        else
        {
            id=++urlID;
        }
        map.put(Integer(i,URL_LENGTH),URL);// this way to help with decode
        
        return Integer(id,URL_LENGTH).toString();// base 36 version of the ID.
    }
    
    public  String decode (String compress)
    {
        
        if (compress==null)
            return null;
        if(map.contains(compress))// compress is the base36 version
        {
            return map.get(compress); //should return the URL.
        }
    }
    
    
}