package com.company;

public class CodeWordChecker implements StringChecker{
    private int min;
    private int max;
    private String doNotInclude;
    //Constructors
    public CodeWordChecker(int min, int max, String doNotInclude)
    {
        this.min = min;
        this.max = max;
        this.doNotInclude = doNotInclude;
    }

    public CodeWordChecker(String doNotInclude)
    {
        this.min = 6;
        this.max = 20;
        this.doNotInclude = doNotInclude;
    }

    //methods
    public boolean sc1(String str)
    {
        if(str.length() >= min && str.length() <= max)
        {
            if(!str.contains(doNotInclude))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isValid(String str) {
        return false;
    }
}
