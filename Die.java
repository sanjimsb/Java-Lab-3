public class Die {
    protected String dieType;
    protected int numberOfSides;
    protected int rolledNumber;

    public Die(){
        dieType = "d6";
        numberOfSides = 6;
    }
    
    public Die(int numberOfSides){
        this.numberOfSides = numberOfSides;
        this.dieType = "d20";
    }
    
    public Die(int numberOfSides, String dieType){
        this.numberOfSides = numberOfSides;
        this.dieType = dieType;
    }

    public void roll(){
        int getRolledNumber = (int)Math.floor(Math.random() * (numberOfSides) + 1);
        this.rolledNumber = getRolledNumber;
    }

    public int getRolledNumber(){
        return this.rolledNumber;
    }

    public void createDices(Die DiceObject){
        System.out.println("creating a " + DiceObject.dieType + " dice");
    }
    
    public void getCurrentSideUp(Die DiceObject){
        DiceObject.roll();
        System.out.println("The current side up for a " + DiceObject.dieType + " is " + DiceObject.rolledNumber);
    }

    public void getMainRoll(Die DiceObject){
        DiceObject.roll();
        System.out.println("Rolling dice " + DiceObject.dieType);
        System.out.println("The new value for " + DiceObject.dieType + " is " + DiceObject.rolledNumber);
    }

    public void rollToHighestValue(Die DiceObject){
        System.out.println("\nSetting the " + DiceObject.dieType + " to show " + DiceObject.numberOfSides + "...");

        boolean rolledTheHighValue = false; 
        while (rolledTheHighValue != true) {
            DiceObject.roll();
            if(DiceObject.numberOfSides == DiceObject.rolledNumber) {
                rolledTheHighValue = true;
            }
        }
        System.out.println("The side up is now " + DiceObject.numberOfSides + ". Finally");
    }

    public String fiveSidedDieRoll(Die d1,Die d2,Die d3,Die d4,Die d5){
        boolean match = false;
        int count = 0;
        while (match != true) {
            d1.roll();
            d2.roll();
            d3.roll();
            d4.roll();
            d5.roll();
            if(d1.rolledNumber ==  d2.rolledNumber && 
            d1.rolledNumber == d3.rolledNumber &&
            d1.rolledNumber == d4.rolledNumber &&
            d1.rolledNumber == d5.rolledNumber){
                match = true;
            } 
            count++;
            // Uncommet this line to see the results on each roll
            // System.out.println("d1: " + d1.rolledNumber + " d2: " + d2.rolledNumber + " d3: " + d3.rolledNumber + " d4: " + d4.rolledNumber + " d5: " + d5.rolledNumber );
        }

        return "YAHTZEE! It took " + count + " rolls";
    }
}