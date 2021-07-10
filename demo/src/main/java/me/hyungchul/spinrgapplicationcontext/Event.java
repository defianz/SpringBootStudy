package me.hyungchul.spinrgapplicationcontext;

import org.springframework.stereotype.Component;


public class Event {


    public Event(Integer id) {
        this.id = id;
    }

    Integer id;

    String title;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
