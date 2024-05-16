public class Polynomial{
    double[] arrCoefficient = {};//field to represent the polynomial via coefficients

    public Polynomial(){// No-Arg constructor
        double[] temp = {0};
        arrCoefficient = temp;
    }
    public Polynomial(double[] arrPol){// ArrDouble-Arg constructor with the argument that will be used to represent a non-zero Polynomial
        arrCoefficient = arrPol.clone();
    }

    public Polynomial add(Polynomial toAdd){//this method adds two polynomial objects
        int lengthA = this.arrCoefficient.length;
        int lengthB = toAdd.arrCoefficient.length;
        int returnLength;
        if(lengthA>lengthB){
            returnLength = lengthB;
        }
        else{
            returnLength = lengthA;
        }
        for(int i=0; i<returnLength; i++){
            this.arrCoefficient[i] = this.arrCoefficient[i]+toAdd.arrCoefficient[i];
        }
        return this;
    }

    public int evaluate(double insertVal){
        int returnVal=0;

        int power = arrCoefficient.length-1;

        for(int i=0; i<=power; i++){
            returnVal+=arrCoefficient[i]*Math.pow(insertVal, i);
        }

        return returnVal;
    }

    public boolean hasRoot(double potRoot){

        if(evaluate(potRoot)==0){
            return true;
        }
        return false;
    }

}