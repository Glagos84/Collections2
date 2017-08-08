package cl.mind.collections;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog puppy1 = new Dog("Firulais", true);
        Dog puppy2 = new Dog("Charly", true);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(puppy1);
        dogs.add(puppy2);

        Log.d("SIZE", String.valueOf(dogs.size()));

        for (int i = 0; i < dogs.size(); i++) {

            Dog dog = dogs.get(i);

            Log.d("PUPPY",dog.getName());
            Log.d("PUPPY", String.valueOf(dog.isPuppy()));

        }

        for (Dog puppy : dogs){

            Log.d("PUPPY",puppy.getName());
            Log.d("PUPPY", String.valueOf(puppy.isPuppy()));

        }

        for (Dog puppy : puppies()){

            Log.d("PUPPY", puppy.getName());

        }

    }


    // method list :D
    private List<Dog> puppies(){

        Dog puppy1 = new Dog("Firu", true);
        Dog puppy2 = new Dog("Char", true);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(puppy1);
        dogs.add(puppy2);

        return dogs;

    }


}
