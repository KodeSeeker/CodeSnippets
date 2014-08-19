/**

User ID  Page ID
A          1
A          2
A          3
B          2
B          3
C          1
B          4
A          4

Output should return (2,3,4)
**/


/**
 * Approach using hashmaps: Build hashmap of  user and sequences and then a hashmap of sequences and their counts.\
 * */
 
public String findMostCommon(File logFile)
{
    InputStream in= new InputStream(logFile);
    Map<User,List<Page>> map = new HashMap<User,List<Page>>();
    while (in.hasNext())
    {
        // entry comprises of user page and the page number
        Entry a =in.getNext();
         List<Page> pg= new ArrayList<Page>();
        if map.contains(a.getUser())
        {
            pg= map.get(a.getUser());
           
        }
         pg.append(a.getPage());
         
         //update back to map
         map.put(a.getUser(),pg);
    }
    


//Key is to retrieve the values from the map. The values() method returns a Collection <Not a list!>, so it needs to be 
//cast to an ArrayList because it has a constructor that accepts a Collection!

List<List<Page>> pgList= new ArrayList(map.values());

Map<List<Page>,Integer> countMap= new HashMap<List<Page>,Integer>();

for (List<Page> p:pgList)
{
    int c;
    if(countMap.contains(p))
    {
         c= countMap.get(p);
    }
    countMap.put(p,++c);
}

//Now iterate over this map to find the max occuring sequence

int maxCount=0;
List<Page> mostFrequent= new ArrayList<Page>();
for(Map.Entry<List<Page>,Integer>> e:countMap.entrySet())
{
    if(e.getValue()>maxCount)
    {
     maxCount=e.getValue();
     mostFrequent=e.getKey();
    }
}
//finally return the most frequent!
StringBuilder sb= new StringBuilder();
for(Page p: mostFrequent)
{
    sb.append(p.getValue()+" ");
}

return sb.toString();
}


//Another way would be to sort first by User and then by Page (each of the users.). 
//After this the most common pattern can be extracted by creating a Map<User,List<Page>>

