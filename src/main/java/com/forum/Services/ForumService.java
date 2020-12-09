package com.forum.Services;

import com.forum.PojoClasses.Forum;
import com.forum.PojoClasses.Post;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

@Service
public class ForumService
{
    private static CollectionReference getCollection(String name)
    {
        Firestore db = FirestoreClient.getFirestore();
        return db.collection(name);
    }

    public String getForum(String id) throws ExecutionException, InterruptedException
    {
        CollectionReference forums = getCollection("FORUM");

        ApiFuture<QuerySnapshot> querySnapshot = forums.get();

        for(DocumentSnapshot document : querySnapshot.get().getDocuments())
        {
            if(document.toObject(Post.class).getId().equals(id))
            {
                return document.toObject(Forum.class).getPostList().get(0).getId();
            }
        }
        return "Error";
    }

}