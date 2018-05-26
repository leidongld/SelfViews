package com.example.leidong.selfviews.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.leidong.selfviews.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    private static final String TAG = MainActivity.class.getName();

    @BindView(R.id.container)
    RecyclerView mContainer;

    private static String[] mViewsName = {
            "MyTextView",
            "MyAlertDialog"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initWidgets();

        initActions();

    }

    @Override
    public void initWidgets() {
        mContainer.setLayoutManager(new LinearLayoutManager(this));
        mContainer.setAdapter(new ContainerAdapter(MainActivity.this, mViewsName));
    }

    @Override
    public void initActions() {

    }

    class ContainerAdapter extends RecyclerView.Adapter<ContainerAdapter.ViewHolder> {
        private Context context;
        private String[] mViewsName;

        ContainerAdapter(Context context, String[] mViewsName) {
            this.context = context;
            this.mViewsName = mViewsName;
        }

        @NonNull
        @Override
        public ContainerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.container_item, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull final ContainerAdapter.ViewHolder holder, final int position) {
            if(mViewsName.length > 0) {
                holder.tvViewsName.setText(mViewsName[position]);

                holder.tvViewsName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = holder.tvViewsName.getText().toString();
                        if(name.equals("MyTextView")){
                            Intent intent = new Intent(context, MyTextViewActivity.class);
                            context.startActivity(intent);
                        }
                        else if(name.equals("MyAlertDialog")){
                            Intent intent = new Intent(context, MyAlertDialogActivity.class);
                            context.startActivity(intent);
                        }
                        else if(name.equals("")){

                        }
                        else if(name.equals("")){

                        }
                        else if(name.equals("")){

                        }
                        else if(name.equals("")){

                        }
                        else {

                        }
                    }
                });
            }
        }

        @Override
        public int getItemCount() {
            int length = mViewsName.length;
            if(length > 0) {
                return length;
            }
            return 0;
        }

        class ViewHolder extends RecyclerView.ViewHolder{
            @BindView(R.id.tv_view_name)
            TextView tvViewsName;

            ViewHolder(View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
            }
        }
    }
}
