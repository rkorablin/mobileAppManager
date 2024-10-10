
package com.itaces.sizl.mobileAppManager.service;

import com.itaces.sizl.mobileAppManager.dto.AppVersionDTO;
import com.itaces.sizl.mobileAppManager.dto.CreateAppVersionRequest;
import com.itaces.sizl.mobileAppManager.dto.UpdateAppVersionRequest;
import com.itaces.sizl.mobileAppManager.exception.AppVersionNotFoundException;
import com.itaces.sizl.mobileAppManager.entity.AppVersion;
import com.itaces.sizl.mobileAppManager.repository.AppVersionRepository;
import com.itaces.sizl.mobileAppManager.mapper.AppVersionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AppVersionService {

    @Autowired
    private AppVersionRepository appVersionRepository;

    @Autowired
    private AppVersionMapper appVersionMapper;

    public List<AppVersionDTO> getAllAppVersions() {
        return appVersionRepository.findAll().stream()
                .map(appVersionMapper::toAppVersionDTO)
                .collect(Collectors.toList());
    }

    public AppVersionDTO getAppVersionById(Long id) {
        AppVersion appVersion = appVersionRepository.findById(id)
                .orElseThrow(() -> new AppVersionNotFoundException(id));
        return appVersionMapper.toAppVersionDTO(appVersion);
    }

    public AppVersionDTO createAppVersion(CreateAppVersionRequest createAppVersionRequest) {
        AppVersion appVersion = appVersionMapper.toAppVersion(createAppVersionRequest);
        return appVersionMapper.toAppVersionDTO(appVersionRepository.save(appVersion));
    }

    public AppVersionDTO updateAppVersion(Long id, UpdateAppVersionRequest updateAppVersionRequest) {
        AppVersion appVersion = appVersionRepository.findById(id)
                .orElseThrow(() -> new AppVersionNotFoundException(id));
        appVersionMapper.updateAppVersionFromRequest(updateAppVersionRequest, appVersion);
        return appVersionMapper.toAppVersionDTO(appVersionRepository.save(appVersion));
    }

    public void deleteAppVersion(Long id) {
        AppVersion appVersion = appVersionRepository.findById(id)
                .orElseThrow(() -> new AppVersionNotFoundException(id));
        appVersionRepository.delete(appVersion);
    }
}
