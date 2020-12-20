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

    public Forum getForum(String ID) throws ExecutionException, InterruptedException
    {
        ArrayList<Forum>  forumList =this.getAllForum();

        for (Forum forum : forumList)
        {
            System.out.println("RAN");
            if(forum.getId().equals(ID))
            {
                return forum;
            }
        }
        return null;
    }

    public ArrayList<Forum> getAllForum() throws ExecutionException, InterruptedException
    {
        ArrayList<Forum> forumList = new ArrayList<>();

        CollectionReference forums = getCollection("FORUMS");

        ApiFuture<QuerySnapshot> querySnapshot = forums.get();

        for(DocumentSnapshot document : querySnapshot.get().getDocuments())
        {
            forumList.add(document.toObject(Forum.class));
        }
        return forumList;
    }
}