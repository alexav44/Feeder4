public class Feeder {
    /**
     * The amount of food, in grams, currently in the bird feeder; initialized
     * in the constructor and always greater than or equal to zero
     */
    private int currentFood;
    public int getcurrentFood(){
        return currentFood;
    }
    public Feeder(int c){
        currentFood = c;
    }
    public Feeder(){
       int random = (int)(Math.random()*(50-10+1)); 
       System.out.println(random);        
       System.out.println(Math.random()< 0.05);        
    }
    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird
     * feeder, as described in part (a) Precondition: numBirds > 0
     */
    public void simulateOneDay(int numBirds)
    {
        if(Math.random() < 0.05) currentFood = 0;
        else{
         int eaten = (int)(Math.random()*41)+10;
         currentFood -= eaten * numBirds;
         if (currentFood < 0) currentFood=0;
        }
    }
    public String toString(){
        return"Current Food:" + currentFood;
    }


    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b) Preconditions:
     * numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays) 
    {
       
        int days = 0;       
        while(numDays > 0 ) {
            if (currentFood == 0);            
            simulateOneDay(numBirds);
            numDays--;
            days++;
                        
        }
        return days;
        
    }

}