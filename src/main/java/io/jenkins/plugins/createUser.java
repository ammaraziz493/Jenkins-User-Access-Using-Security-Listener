package io.jenkins.plugins;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import hudson.model.User;
import jenkins.security.SecurityListener;

import java.util.logging.Logger;

@Extension
public class createUser extends SecurityListener {

    private static final Logger LOGGER = Logger.getLogger(createUser.class.getName());

    // get user which is logging
    @Override
    protected void loggedIn (String username) {
        // Log the authentication event
        LOGGER.info("User LoggedIn: " + username);
    }

    @Override
    protected void failedToAuthenticate(String username) {
        // Log the failed authentication attempt
        LOGGER.warning("Failed authentication attempt: " + username);
    }

    @Override
    protected void loggedOut(String username) {
        // Log the logout event
        LOGGER.info("User logged out: " + username);
    }


    User user;
    @Override
    protected void userCreated(@NonNull String user1) {
        LOGGER.info("New user created: " + user1 +user.getFullName());
    }



}

