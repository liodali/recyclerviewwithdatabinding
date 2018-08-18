package dali.hamza.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

import dali.hamza.myapplication.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    String[] data={"TUNISIA","ITALIE","GERMANY","ENGLAND"};
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        adapter=new CustomAdapter(new ArrayList<>(Arrays.asList(data)));
        binding.setAdpt(adapter);
    }
}
