package com.lawrie.util;

public class Page {
    int start=0;
    int count=5;
    int last=0;

    public void setStart(int start) {
        this.start = start;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public int getStart() {

        return start;
    }

    public int getCount() {
        return count;
    }

    public int getLast() {
        return last;
    }

    public void caculateLast(int total){
        if(total%count==0){
            last=total-count;
        }else{
            last=total-total%count;
        }
    }
}
