
package com.itaces.sizl.mobileAppManager.repository;

import com.itaces.sizl.mobileAppManager.entity.AppVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppVersionRepository extends JpaRepository<AppVersion, Long> {
}
