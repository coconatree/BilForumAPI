package com.forum.Services;

import com.forum.PojoClasses.Forum;
import com.forum.PojoClasses.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;


@Service
public class LoginService
{
    @Autowired
    RegisterService rs;

    private static CollectionReference getCollection(String name)
    {
        Firestore db = FirestoreClient.getFirestore();
        return db.collection(name);
    }

    public User getUser(String username, String passwordHashed) throws ExecutionException, InterruptedException
    {
        ArrayList<User> userList = rs.getAllUsers();

        for (User user : userList)
        {
            if(user.getUsername().equals(username) && user.getPasswordHashed().equals(passwordHashed));
            {
                System.out.println("DONE");
                return user;
            }
        }
        return null;
    }
}