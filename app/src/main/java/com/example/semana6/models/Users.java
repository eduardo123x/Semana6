package com.example.semana6.models;
import java.util.ArrayList;
import java.util.List;

public class Users {
    public  String username;
    public  String password;

    
    public  static  Boolean passwodIsValid(String User,
                                           String Password){

        for (Users b:getUsers())
        {
            if (b.username.equals(User)){
                 if (b.password.equals(Password)){
                     return true;
                 }

            }
        }
        
        
        
        return  false;
    }
    
    public  static  List<Users> getUsers(){
        ArrayList<Users>List=new ArrayList<Users>();
        Users o= new Users();
        o.username = "Bichito";
        o.password = "123456";
        List.add(o);


        Users p= new Users();
        p.username = "Eduardo";
        p.password = "123456";
        List.add(p);

        return  List;
    }
}
