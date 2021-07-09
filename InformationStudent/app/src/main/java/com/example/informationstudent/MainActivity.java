package com.example.informationstudent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.shape.RelativeCornerSize;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{
    private RecyclerView recyclerView;
    protected ArrayList<StudentModel> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleView);
        initViews();
        buildList();
        setRecyclerViewAdapter();
    }
    private void setRecyclerViewAdapter(){
       StudentAdapter studentAdapter =new StudentAdapter(studentList,this);
       LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
       recyclerView.setLayoutManager(linearLayoutManager);
       recyclerView.setAdapter(studentAdapter);
    }

    private void buildList() {
        for(int i=0;i<50;i++){
            StudentModel studentModel = new StudentModel("XYZ"+i ,21,"karawal nagar","25.05.1999",R.drawable.jezz);
            studentList.add(studentModel);
        }
    }

    private void initViews() {

        recyclerView = findViewById(R.id.recycleView);
    }

    @Override
    public void OnItemClick(StudentModel model, int position) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Hey this is the Data")
                .setMessage(
                        model.getName() + "\n"
                                + model.getAge() + "\n"
                                + model.getDob() + "\n"
                                + model.getAddress()
                ).
                        setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        show();
    }

}