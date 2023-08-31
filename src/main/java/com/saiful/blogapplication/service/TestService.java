package com.saiful.blogapplication.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.saiful.blogapplication.model.Test;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private static final String COLLECTION_NAME = "Test";

    public Test getTest() {
        try {
            Firestore firestore = FirestoreClient.getFirestore();
            ApiFuture<DocumentSnapshot> result = firestore.collection(COLLECTION_NAME).document("test").get();
            DocumentSnapshot future = result.get();

            if (future.exists()) {
                return future.toObject(Test.class);
            } else return null;
        } catch (Exception exception) {
            return null;
        }
    }
}
