package com.forum.Services;

import com.forum.PojoClasses.Post;
import com.forum.PojoClasses.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class UserService
{
    private static CollectionReference getCollection(String name)
    {
        Firestore db = FirestoreClient.getFirestore();
        return db.collection(name);
    }

    public String updateUser(User user) throws ExecutionException, InterruptedException
    {
        CollectionReference users = getCollection("USERS");

        ApiFuture<WriteResult> collectionsApiFuture = users.document(user.getUserID()).set(user);

        return collectionsApiFuture.get().getUpdateTime().toString();
    }







}
