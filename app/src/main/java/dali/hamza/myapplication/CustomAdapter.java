package dali.hamza.myapplication;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import dali.hamza.myapplication.BR;
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    ArrayList<String> data;

    public CustomAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        ViewDataBinding viewDataBinding= DataBindingUtil.inflate(inflater,R.layout.row,viewGroup,false);
        return new MyViewHolder(viewDataBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int i) {
            String name=data.get(i);
            holder.bind(name);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ViewDataBinding binding;
        public MyViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
        public void bind(String data){
                binding.setVariable(BR.name,data);
        }
    }
}
