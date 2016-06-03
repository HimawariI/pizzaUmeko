package model;

public class KeisanLogic {
	 public void execute(Pizza pizza){
	        //pizzaの合計の計算
	        int pizza1 = pizza.getPizza1();
	        int pizza2 = pizza.getPizza2();
	        int pizza3 = pizza.getPizza3();
	        int pizza4 = pizza.getPizza4();
	        int pizza5 = pizza.getPizza5();
	        int pizza6 = pizza.getPizza6();
	        int sum = pizza1*1500 + pizza2*2300 + pizza3*2700 + pizza4*3000 + pizza5*3500 + pizza6*3200 ;
	        pizza.setSum(sum);
	    }
}
