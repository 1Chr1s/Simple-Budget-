package nerdyrocks.com.simplebudget;

/**
 * Created by Christian on 11/18/17.
 */

public class calculate {
    // Variables:
    private float needsPercentage = 50;
    private float wantsPercentage = 30;
    private float investmentsPercentage = 20;

    /**
     * Default constructor
     */
    public calculate(){

    }

    /**
     * Constructor with predefined interest rates:
     * @param needsPercentage - Percentage of needs.
     * @param wantsPercentage - Percentage of wants.
     * @param investmentsPercentage - Percentage of investments.
     */
    public calculate(float needsPercentage, float wantsPercentage, float investmentsPercentage){
        this.needsPercentage = needsPercentage;
        this.wantsPercentage = wantsPercentage;
        this.investmentsPercentage = investmentsPercentage;
    }

    public void setNeedsPercentage(float x){
        this.needsPercentage = x;
    }

    public void setWantsPercentage(float y){
        this.wantsPercentage = y;
    }

    public void setInvestmentsPercentage(float z){
        this.investmentsPercentage = z;
    }

    public float getNeedsPercentage(){
        return needsPercentage;
    }

    public float getWantsPercentage(){
        return wantsPercentage;
    }
    public float getInvestmentsPercentage(){
        return investmentsPercentage;
    }

    /**
     * Calculates needs, wants, and investments.
     * @param income - A float which is the total income made:
     * @return An array of floats 0 = needs, 1 = wants, and 2 = investments
     */
    public float[] doCalculations(float income){
        // Variables:
        float calcArray[] = new float[3];

        for(int x = 0; x < calcArray.length; x++) {
            switch(x) {
                case 0:
                    calcArray[x] = income * needsPercentage;
                    break;
                case 1:
                    calcArray[x] = income * wantsPercentage;
                    break;
                case 2:
                    calcArray[x] = income * investmentsPercentage;
                    break;
            } // End of switch statement
        }

        return calcArray;
    }
}
