package com.forum.units;

import java.util.Date;

import com.forum.util.Utility;

public abstract class AbstractEntity{
    private Date created;
    private long id;

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }
    abstract public void autoGenerateId();

    public Date getCreated(){
        return created;
    }

    public void setCreated(){
        this.created= Utility.getCurrentDate();
    }
}