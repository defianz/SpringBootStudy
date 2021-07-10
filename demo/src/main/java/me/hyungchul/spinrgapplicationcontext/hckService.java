package me.hyungchul.spinrgapplicationcontext;


import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class hckService {

    @NonNull
    public  String createEvent(@NonNull String name){
        return "Hello "+name;
    }
}
