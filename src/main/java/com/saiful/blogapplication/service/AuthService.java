package com.saiful.blogapplication.service;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.saiful.blogapplication.viewmodel.Result;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public Result<UserRecord> createUser(String email, String password, String displayName) {
        UserRecord.CreateRequest request = new UserRecord.CreateRequest()
                .setEmail(email)
                .setEmailVerified(false)
                .setPassword(password)
                .setDisplayName(displayName)
                .setDisabled(false);

        try {
            UserRecord record = FirebaseAuth.getInstance().createUser(request);
            return new Result<>(record, true);

        } catch (FirebaseAuthException e) {
            return new Result<>(e.getLocalizedMessage(), false);
        }
    }
}
