
package com.itaces.sizl.mobileAppManager.dto;

import com.itaces.sizl.mobileAppManager.entity.Platform;

public class AppVersionResponseDTO {
    private Long id;
    private Platform platform;
    private String versionNumber;
    private boolean inReview;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
