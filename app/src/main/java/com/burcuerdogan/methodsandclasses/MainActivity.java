package com.burcuerdogan.methodsandclasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("on create called");
        testMethod();
        System.out.println(math(3,5));
        System.out.println(newMethod("Burcu"));
        username = "";
        makeMusicians();
        makeSimpsons();
    }


    public void makeSimpsons(){
        Simpsons homer = new Simpsons("Homer",50,"Nuclear");
        homer.age = 51;
        System.out.println(homer.age);
    }

    public void makeMusicians(){

        //Instance

        Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.age);
    }


    public void testMethod(){
        username = "Lars";
        int x = 4 + 4;
        x = 9;
        System.out.println("value of x: " +x);
    }

    public int math(int a, int b){
        username = "Kirk";
        int x = 11;
        System.out.println("value of x in math: " +x);
        return a + b;
    }

    public String newMethod(String string){
        username = "Rob";
        return string + " new Method";
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }

}