package com.forum.Services;

import com.forum.PojoClasses.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

@Service
public class RegisterService
{
    private static CollectionReference getCollection(String name)
    {
        Firestore db = FirestoreClient.getFirestore();
        return db.collection(name);
    }

    public ArrayList<User> getAllUsers() throws InterruptedException, ExecutionException
    {
        ArrayList<User> usersList = new ArrayList<>();

        CollectionReference users = getCollection("USERS");

        ApiFuture<QuerySnapshot> querySnapshot = users.get();

        for(DocumentSnapshot document : querySnapshot.get().getDocuments())
        {
            usersList.add(document.toObject(User.class));
        }
        return usersList;
    }
    public String addUser(User user) throws ExecutionException, InterruptedException
    {
        CollectionReference users = getCollection("USERS");

        ApiFuture<WriteResult> userRef = users.document(user.getEmail()).set(user);

        return userRef.get().getUpdateTime().toString();
    }
}

