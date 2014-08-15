//Write the basic interface

/* Basic Idea of Factory Pattern:
You define a base class type (or in this case an interface), 
and then have any number of subclasses which implement the contract defined by the base class.*/
interface Dog
{
  public void speak ();
}


//Concrete Dog classes that implement the interface

class Poodle implements Dog
{
  public void speak()
  {
    System.out.println("The poodle says \"arf\"");
  }
}

class Rottweiler implements Dog
{
  public void speak()
  {
    System.out.println("The Rottweiler says (in a very deep voice) \"WOOF!\"");
  }
}

class SiberianHusky implements Dog
{
  public void speak()
  {
    System.out.println("The husky says \"Dude, what's up?\"");
  }
}



//Implement the factory class


class DogFactory
{
  public static Dog getDog(String criteria)// The factory method returns a dog,based on the criterion provided!
  {
    if ( criteria.equals("small") )
      return new Poodle();
    else if ( criteria.equals("big") )
      return new Rottweiler();
    else if ( criteria.equals("working") )
      return new SiberianHusky();

    return null;
  }
}
