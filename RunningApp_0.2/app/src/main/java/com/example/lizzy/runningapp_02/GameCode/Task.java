package com.example.lizzy.runningapp_02.GameCode;

/**
 * Created by Lizzy on 25/01/2015.
 */
public class Task {
    Action action = null;
    float progress = 0.0f; //percentage
    int actionsNeeded = 1;

    public Task(Action action){
        this.action = action;
    }

    public Task(Action action, int actionsNeeded){
        this.action = action;
        this.actionsNeeded = actionsNeeded;
    }

    public void checkOffItem(){
        progress += (1.0 / actionsNeeded);
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public int getActionsNeeded() {
        return actionsNeeded;
    }

    public void setActionsNeeded(int actionsNeeded) {
        this.actionsNeeded = actionsNeeded;
    }

    public float getProgress() {
        return progress;
    }

    public void setProgress(float progress) {
        this.progress = progress;
    }
}
