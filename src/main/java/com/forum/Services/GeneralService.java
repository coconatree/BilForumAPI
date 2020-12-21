package com.forum.Services;

import com.forum.PojoClasses.ID;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

@Service
public class GeneralService
{
    public static String createID(String name) throws ExecutionException, InterruptedException
    {
        ArrayList<ID> IDList = new ArrayList<>();

        CollectionReference ID =  FirestoreClient.getFirestore().collection("NUMBER");;

        ApiFuture<QuerySnapshot> querySnapshot = ID.get();

        for(DocumentSnapshot document : querySnapshot.get().getDocuments())
        {
            IDList.add(document.toObject(ID.class));
        }

        int befNum = IDList.get(0).getData();

        String ret = String.format("%s%d", name, befNum);

        DocumentReference up = ID.document("init");

        up.update("data", (befNum + 1));

        return ret;
    }
}
