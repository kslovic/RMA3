package com.example.kslovic.tasky;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {
    ArrayList<Task> Tasks;
    public TaskAdapter(ArrayList<Task> tasks) { Tasks = tasks; }
    @Override
    public TaskAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View taskView = inflater.inflate(R.layout.item_task, parent, false);
        ViewHolder taskViewHolder = new ViewHolder(taskView);
        return taskViewHolder;
    }
    @Override
    public void onBindViewHolder(TaskAdapter.ViewHolder holder, int position) {
        Task task = this.Tasks.get(position);
        holder.tvTaskTitle.setText(task.gettTitle());
        holder.tvTaskContent.setText(task.gettContent());
        holder.ivTaskPriority.setBackgroundColor(task.gettPriority());
    }
    @Override
    public int getItemCount() {
        return this.Tasks.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTaskTitle, tvTaskContent;
        ImageView ivTaskPriority;
        public ViewHolder(View itemView) {
            super(itemView);
            this.tvTaskTitle = (TextView) itemView.findViewById(R.id.tvTaskTitle);
            this.tvTaskContent = (TextView) itemView.findViewById(R.id.tvTaskContent);
            this.ivTaskPriority = (ImageView) itemView.findViewById(R.id.ivTaskPrirority);
        }

    }

}
