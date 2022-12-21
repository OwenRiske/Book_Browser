package com.company;

import java.util.ArrayList;

public class sort {

    public static ArrayList sortWithNum(ArrayList<Integer> num){
        System.out.println(num);
        ArrayList<Integer> output = new ArrayList();
        if (num.size()==0){
            output.add(0);
            return output;
        }
        output.add(num.get(0));

        for (int i = 0; i < num.size(); i++) {
            for (int j = 0; j < output.size(); j++) {
                if (num.get(i)>output.get(j)){
                    output.add(j,num.get(i));
                    break;
                }
                else if(j+1==output.size()){
                    output.add(j+1,num.get(i));
                    break;
                }
            }

        }
        output.remove(num.get(0));


        return output;
    }
}
