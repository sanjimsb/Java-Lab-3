public class DieGame extends Die{

    public static void main(String[] args) {
        Die getDieObject = new Die();
        Die getDieObjectSecond = new Die(20);
        Die getDieObjectThird = new Die(10,"percentile");

        // Creates the dice using the constructors
        getDieObject.createDices(getDieObject);
        getDieObjectSecond.createDices(getDieObjectSecond);
        getDieObjectThird.createDices(getDieObjectThird);

        // prints the current side up for all the dices
        getDieObject.getCurrentSideUp(getDieObject);
        getDieObjectSecond.getCurrentSideUp(getDieObjectSecond);
        getDieObjectThird.getCurrentSideUp(getDieObjectThird);

        System.out.println("\nTesting the roll method\n");
        
        // prints the value of the dice in the final roll
        getDieObject.getMainRoll(getDieObject);
        getDieObjectSecond.getMainRoll(getDieObjectSecond);
        getDieObjectThird.getMainRoll(getDieObjectThird);

        // get the highest value of the dice using the roll method
        getDieObject.rollToHighestValue(getDieObjectSecond);


        Die d1 = new Die(6,"d6");
        Die d2 = new Die(6,"d6");
        Die d3 = new Die(6,"d6");
        Die d4 = new Die(6,"d6");
        Die d5 = new Die(6,"d6");

        // prints the number of roll it took to have a same value for 5 dices using the roll method
        String bonusString = "\n-----\nBONUS\n-----";
        System.out.println(bonusString);
        System.out.println(getDieObject.fiveSidedDieRoll( d1, d2, d3, d4, d5));
    }
    
}
