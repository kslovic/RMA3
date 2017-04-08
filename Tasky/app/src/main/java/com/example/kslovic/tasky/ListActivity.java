package com.example.kslovic.tasky;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

public class ListActivity extends Activity {
    RecyclerView rvTasksList;
    TaskAdapter tAdapter;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.ItemDecoration mItemDecoration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setUpUI();
    }
    private void setUpUI() {
        Context context = getApplicationContext();
        this.rvTasksList = (RecyclerView) this.findViewById(R.id.rvTaskList);
        this.tAdapter = new TaskAdapter(this.loadTasks());
        this.mLayoutManager = new LinearLayoutManager(context);
        this.mItemDecoration = new DividerItemDecoration(context,DividerItemDecoration.VERTICAL);
        this.rvTasksList.addItemDecoration(this.mItemDecoration);
        this.rvTasksList.setLayoutManager(this.mLayoutManager);
        this.rvTasksList.setAdapter(this.tAdapter);
    }
    private ArrayList<Task> loadTasks() {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("The Hobbit","J.R.R. Tolkien", Color.BLACK));
        tasks.add(new Task("The fellowship of the ring","J.R.R. Tolkien", Color.BLACK));
        return tasks;
    }
}
