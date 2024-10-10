
package com.itaces.sizl.mobileAppManager.exception;

public class AppVersionNotFoundException extends RuntimeException {
    public AppVersionNotFoundException(Long id) {
        super("AppVersion not found with id " + id);
    }
}
