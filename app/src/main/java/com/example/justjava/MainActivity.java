package com.example.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/** clickme method is made because of whe we click the botton the this will call*/

    public void clickme(View view) {
        int price=quantity*5;
      String massage= orderSummery(price);
        displayMassage(massage);
    }

    private void displayMassage(String name) {
        TextView price=(TextView)findViewById(R.id.price_tag);
        price.setText(name);
    }
    public String orderSummery(int price)
    {
        String massage="Name:"+"Rishi Raj";
        massage+="\nnumber of coffee:"+quantity;
        massage+="\nprice: $"+ price;
        massage+="\nThank you sir!";
        return massage;
    }

    /** new method is made for UI*/

    private void displayPrice(int i) {
        TextView Price_show=(TextView)findViewById(R.id.price_tag);
        Price_show.setText(NumberFormat.getCurrencyInstance().format(i));
    }

    private void display(int i) {
        TextView quantity_show=(TextView) findViewById(R.id.kickass);
                quantity_show.setText(""+i);
    }

    public void increment(View view) {
        quantity=quantity+1;
        display(quantity);
    }
    public void decrement(View view){
        quantity=quantity-1;
        display(quantity);
    }
}
