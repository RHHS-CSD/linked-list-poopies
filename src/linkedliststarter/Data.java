/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class Data implements Comparable{
    private String code = null;
    private String teacher = null;
    private int period = 0;
    
    public Data(String code, String teacher, int period){
        this.code = code;
        this.teacher = teacher;
        this.period = period;
    }
    
    @Override
    public String toString(){
        return null;
    }
    
    @Override
    public boolean equals(Object o){
        //anything not of type Data is false
        if (! (o instanceof Data))
            return false;
        //add code to properly compare
        else{
            Data d = (Data)o;
            if(this.code.equals(d.code)&&this.teacher.equals(d.teacher)&&this.period == d.period)
                return true;
            }
        return true;
        
    }

    @Override
    public int compareTo(Object o) {
        Data d = (Data)o;
        return this.teacher.compareTo(d.teacher);
    }
}
