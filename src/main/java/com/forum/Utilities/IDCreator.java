package com.forum.Utilities;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import com.sun.tools.javac.Main;

import java.util.concurrent.ExecutionException;

public class IDCreator
{
    private static CollectionReference getCollection(String name)
    {
        Firestore db = FirestoreClient.getFirestore();
        return db.collection(name);
    }

    public static Query getIDNum(String id) throws ExecutionException, InterruptedException
    {
        CollectionReference ID = getCollection("ID");

        ApiFuture<QuerySnapshot> querySnapshot = ID.get();

        Query ID_QUERY = ID.whereEqualTo("KEY", "key");

        return ID_QUERY;
    }

    private static String createId(String head)
    {



        return null;
    };

    public static void main(String[] args)
    {
        try
        {
            getIDNum("aaa");
        }
        catch (ExecutionException e)
        {
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }


    }
}
