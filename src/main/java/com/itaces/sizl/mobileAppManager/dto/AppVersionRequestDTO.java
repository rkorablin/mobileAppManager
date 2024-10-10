
package com.itaces.sizl.mobileAppManager.dto;

import com.itaces.sizl.mobileAppManager.entity.Platform;

public class AppVersionRequestDTO {
    private Platform platform;
    private String versionNumber;
    private boolean inReview;

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public boolean isInReview() {
        return inReview;
    }

    public void setInReview(boolean inReview) {
        this.inReview = inReview;
    }
}
