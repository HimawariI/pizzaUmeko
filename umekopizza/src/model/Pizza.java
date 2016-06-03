package model;

import java.io.Serializable;

public class Pizza implements Serializable{
	private int pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, sum ;

    public Pizza(){
        
    }

    public int getPizza1() {
        return pizza1;
    }

    public int getPizza2() {
        return pizza2;
    }

    public int getPizza3() {
        return pizza3;
    }
    public int getPizza4() {
        return pizza4;
    }
    public int getPizza5() {
        return pizza5;
    }
    public int getPizza6() {
        return pizza6;
    }
    public int getSum() {
        return sum;
    }

 

    

    public void setPizza1(int pizza1) {
        this.pizza1 = pizza1;
    }

    public void setPizza2(int pizza2) {
        this.pizza2 = pizza2;
    }
    public void setPizza3(int pizza3) {
        this.pizza3 = pizza3;
    }

    
    public void setPizza4(int pizza4) {
        this.pizza4 = pizza4;
    }
    public void setPizza5(int pizza5) {
        this.pizza5 = pizza5;
    }
    public void setPizza6(int pizza6) {
        this.pizza6 = pizza6;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
