public class Polynomial{
    double[] arrCoefficient = {};//field to represent the polynomial via coefficients

    public Polynomial(){// No-Arg constructor
        double[] temp = {0};
        arrCoefficient = temp;
    }
    public Polynomial(double[] arrPol){// ArrDouble-Arg constructor with the argument that will be used to represent a non-zero Polynomial
        arrCoefficient = arrPol;
    }

    public Polynomial add(Polynomial toAdd){//this method adds two polynomial objects
        int lengthA = this.arrCoefficient.length;
        int lengthB = toAdd.arrCoefficient.length;
        int returnLength=0;
        if(lengthA>lengthB){
            returnLength = lengthA;
        }
        else{
            returnLength = lengthB;
        }
        for(int i=0; i<returnLength; i++){
            this.arrCoefficient[i] = this.arrCoefficient[i]+toAdd.arrCoefficient[i];
        }
        return this;
    }

    public int evaluate(double insertVal){

    }

}