class Farm 
{     
   private Animal[] aBunchOfAnimals;    
   public Farm()     {       
      aBunchOfAnimals = new Animal[3];
      aBunchOfAnimals[0] = new NamedCow("cow","Andy","moo");           
      aBunchOfAnimals[1] = new Chick("chick","cluck","cheep");       
      aBunchOfAnimals[2] = new Pig("pig","All animals are equal but some are more equal than others.");    
   }         
   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
     }    
     System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() );    
   } 
} 