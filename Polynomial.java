

public class Polynomial{

    double[] nonZeroCoeffArr = {};//field to represent the polynomial via coefficients
    int[] expArr = {};//field to represent the exponents

    public Polynomial(){// No-Arg constructor
        double[] tempCoeff = {0};
        int[] tempExp = {0};
        nonZeroCoeffArr = tempCoeff;
        expArr = tempExp;
    }
    public Polynomial(double[] arrCoeff, int[] arrExp){// ArrDouble-Arg constructor with the argument that will be used to represent a non-zero Polynomial
        nonZeroCoeffArr = arrCoeff.clone();
        expArr = arrExp.clone();
    }

    public Polynomial simplify(){

        int polLength = this.nonZeroCoeffArr.length;

        for(int i=0; i<polLength; i++){
            for(int j=i+1; j<polLength; j++){
                if(this.expArr[i]==this.expArr[j]){
                    this.nonZeroCoeffArr[i]+=this.nonZeroCoeffArr[j];
                    this.nonZeroCoeffArr[j]=0;
                    this.expArr[j]=0;
                }
            }
        }
        //at this point, this.nonZeroCoeffArr should have only one array index for each exponents.

        int nonZeroCoeffCount = 0;
        for(int i=0; i< polLength; i++){
            if(this.nonZeroCoeffArr[i]!=0){
                nonZeroCoeffCount+=1;
            }
        }
        double[] newCoeffArr = new double[nonZeroCoeffCount];
        int[] newExpArr = new int[nonZeroCoeffCount];

        for(int i=0; i< polLength; i++){
            if(this.nonZeroCoeffArr[i]!=0){
                newCoeffArr[i]=this.nonZeroCoeffArr[i];
                newExpArr[i] = this.expArr[i];
            }
        }
        //at this point we have a new coeff and exp array to represent the same polynomial we had before.
        this.nonZeroCoeffArr = newCoeffArr.clone();
        this.expArr = newExpArr.clone();

        return this;
    }

    public Polynomial add(Polynomial toAdd){//this method adds two polynomial objects

        Polynomial tempThis = this.simplify();
        Polynomial tempToAdd = toAdd.simplify();

        //left to complete

        int HighestPower=0;

        for(int i=0; i<tempThis.expArr.length; i++){
            if (tempThis.expArr[i]>HighestPower){
                HighestPower = tempThis.expArr[i];
            }
        }
        for(int i=0; i<tempToAdd.expArr.length; i++){
            if (tempThis.expArr[i]>HighestPower){
                HighestPower = tempThis.expArr[i];
            }
        }

        int[] resultingExp = new int[HighestPower];
        double[] resultingCoeff = new double[HighestPower];

        for(int i=0; i< HighestPower; i++){
            double temp=0;
            for(int j=0; j<tempToAdd.expArr.length; j++){
                if (tempThis.expArr[j]==i){
                    temp+=tempThis.nonZeroCoeffArr[j];
                }
                if (tempToAdd.expArr[j]==i){
                    temp+=tempToAdd.nonZeroCoeffArr[j];
                }
            }
            resultingCoeff[i]=temp;
            resultingExp[i]=i;
        }

        this.expArr=resultingExp;
        this.nonZeroCoeffArr=resultingCoeff;

        return this;
    }

    public int evaluate(double insertVal){
        int returnVal=0;

        for(int i=0; i<this.nonZeroCoeffArr.length; i++){
            returnVal+=this.nonZeroCoeffArr[i]*Math.pow(insertVal, this.expArr[i]);
        }
        //at this point we have the evaluation of the polynomial

        return returnVal;
    }

    public boolean hasRoot(double potRoot){

        return (evaluate(potRoot)==0);
    }

    public Polynomial multiply(Polynomial toMultiply){

        Polynomial tempThis=this.add(new Polynomial());
        Polynomial tempToMultiply=toMultiply.add(new Polynomial());

        int HighestPower=tempThis.nonZeroCoeffArr.length+tempToMultiply.nonZeroCoeffArr.length-2;

        

        for(int i=0; i<)

        return this;
    }

}