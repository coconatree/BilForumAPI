package com.forum.Services;

import com.forum.PojoClasses.Forum;
import com.forum.PojoClasses.Post;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class PostService
{
    private static CollectionReference getCollection(String name)
    {
        Firestore db = FirestoreClient.getFirestore();
        return db.collection(name);
    }

    public ArrayList<Post> getAllPosts() throws InterruptedException, ExecutionException
    {
        ArrayList<Post> postList = new ArrayList<>();

        CollectionReference posts = getCollection("POSTS");

        ApiFuture<QuerySnapshot> querySnapshot = posts.get();

        for(DocumentSnapshot document : querySnapshot.get().getDocuments())
        {
            postList.add(document.toObject(Post.class));
        }
        return postList;
    }

    public ArrayList<Post> getAllPostsForum(String FORUM) throws InterruptedException, ExecutionException
    {
        ArrayList<Post> postList = new ArrayList<>();

        CollectionReference posts = getCollection(String.format("%sPostList", FORUM));

        ApiFuture<QuerySnapshot> querySnapshot = posts.get();

        for(DocumentSnapshot document : querySnapshot.get().getDocuments())
        {
            postList.add(document.toObject(Post.class));
        }
        return postList;
    }

    public Post getPost(String id) throws ExecutionException, InterruptedException
    {
        CollectionReference posts = getCollection("POSTS");

        ApiFuture<QuerySnapshot> querySnapshot = posts.get();

        for(DocumentSnapshot document : querySnapshot.get().getDocuments())
        {
            if(document.toObject(Post.class).getId().equals(id))
            {
                return document.toObject(Post.class);
            }
        }
        return null;
    }

    public String putPostToForum(Post post, String FORUM) throws ExecutionException, InterruptedException
    {
        CollectionReference posts = getCollection(String.format("%sPostList", FORUM));

        ApiFuture<WriteResult> postRef = posts.document(post.getId()).set(post);

        return postRef.get().getUpdateTime().toString();
    }


    public void deletePost(int id){}
}
