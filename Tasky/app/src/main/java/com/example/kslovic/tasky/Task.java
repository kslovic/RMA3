package com.example.kslovic.tasky;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

public class Task {
    private String tTitle, tContent;
    int tPriority;

    public Task(String tTitle, String tContent, int tPriority) {
        this.tTitle = tTitle;
        this.tContent = tContent;
        this.tPriority = tPriority;
    }

    public String gettTitle() {
        return tTitle;
    }

    public String gettContent() {
        return tContent;
    }

    public int gettPriority() {
        return tPriority;
    }
}
