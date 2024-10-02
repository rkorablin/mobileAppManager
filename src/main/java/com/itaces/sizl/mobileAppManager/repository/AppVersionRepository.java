package com.itaces.sizl.mobileAppManager.repository;

import com.itaces.sizl.mobileAppManager.entity.AppVersion;
import com.itaces.sizl.mobileAppManager.entity.Platform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppVersionRepository extends JpaRepository<AppVersion, Long> {

    Optional<AppVersion> findByVersionNumberAndPlatform(String versionNumber, Platform platform);
}
