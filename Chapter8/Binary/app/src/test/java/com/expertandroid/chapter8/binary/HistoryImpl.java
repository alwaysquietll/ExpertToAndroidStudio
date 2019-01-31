package com.expertandroid.chapter8.binary;

import com.expertandroid.chapter8.binary.logic.History;

import java.util.Stack;

public class HistoryImpl implements History{
    private Stack<String> cache=new Stack<>();

    public void add(String item){
        cache.push(item);
    }

    public String get(){
        cache.pop();
        return "";
    }
}
