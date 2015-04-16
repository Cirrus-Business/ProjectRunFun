package com.example.lizzy.runningapp_02.GameCode;

import java.util.ArrayList;

/**
 * Created by Lizzy on 23/01/2015.
 */
//temporary thing, will be changed to Quest which holds multiple Tasks
// which wrap around Actions adding a completed or number thing.
// should also hold the reward for the quest
public class Quest {
    String title = "";
    //later add actual sub tasks that can be checked off
    String details = "";
    ArrayList<Task> tasks = new ArrayList<Task>();
    ArrayList<Item> rewards = new ArrayList<Item>();
    int rewardCash = 0;

    public Quest(String title, String details, int progress){
        this.details = details;
        this.title = title;
    }

    public float getProgress() {
        float total = 0.0f;
        int counter = 0;
        for (Task task : tasks){
            total += task.getProgress();
            counter ++;
        }
        return (total / counter);
    }

    public String getDetails() {
        return details;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void addTask(Action action, int actionsNeeded){
        tasks.add(new Task(action, actionsNeeded));
    }

    public int getRewardCash() {
        return rewardCash;
    }

    public void setRewardCash(int rewardCash) {
        this.rewardCash = rewardCash;
    }

    public ArrayList<Item> getRewards() {
        return rewards;
    }

    public void setRewards(ArrayList<Item> rewards) {
        this.rewards = rewards;
    }
}
