package com.forum;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.InputStream;

@Service
public class FirebaseInitializer
{
    @PostConstruct
    public void initialize()
    {
        try {
            InputStream serviceAccount = this.getClass().getClassLoader().getResourceAsStream("./serviceAccountKey.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://forumapp-7fd4e.firebaseio.com")
                    .build();

            FirebaseApp.initializeApp(options);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}