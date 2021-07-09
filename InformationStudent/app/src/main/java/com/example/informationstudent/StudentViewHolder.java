package com.example.informationstudent;

import android.view.VerifiedInputEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private ImageView mtvStudentImg;
    private TextView mtvName;
    private TextView mtvAge;
    private TextView mtvDob;
    private TextView mtvAddress;
    private RelativeLayout relativeLayout;
    private ItemClickListener itemClickListener;

    public StudentViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvStudentImg = itemView.findViewById(R.id.ivStudentImg);
        mtvName = itemView.findViewById(R.id.tvName);
        mtvAge = itemView.findViewById(R.id.tvAge);
        mtvAddress=itemView.findViewById(R.id.tvAddress);
        mtvDob = itemView.findViewById(R.id.tvDob);
        relativeLayout = itemView.findViewById(R.id.relativeLayout);

    }
    public  void setData(StudentModel studentModel){
        mtvStudentImg.setImageResource(studentModel.getImageId());
        mtvName.setText(studentModel.getName());
        mtvAge.setText(studentModel.getAge()+" ");
        mtvAddress.setText(studentModel.getAddress());
        mtvDob.setText(studentModel.getDob());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.OnItemClick(studentModel,getAdapterPosition());
            }
        });
    }
}
