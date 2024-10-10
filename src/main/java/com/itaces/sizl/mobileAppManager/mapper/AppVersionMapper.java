
package com.itaces.sizl.mobileAppManager.mapper;

import com.itaces.sizl.mobileAppManager.dto.AppVersionDTO;
import com.itaces.sizl.mobileAppManager.dto.CreateAppVersionRequest;
import com.itaces.sizl.mobileAppManager.dto.UpdateAppVersionRequest;
import com.itaces.sizl.mobileAppManager.entity.AppVersion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AppVersionMapper {

    // Mapping from AppVersion to AppVersionDTO
    AppVersionDTO toAppVersionDTO(AppVersion appVersion);

    // Mapping from CreateAppVersionRequest to AppVersion
    @Mapping(target = "id", ignore = true)
    AppVersion toAppVersion(CreateAppVersionRequest createAppVersionRequest);

    // Mapping from UpdateAppVersionRequest to AppVersion with existing AppVersion as target
    @Mapping(target = "id", ignore = true)
    void updateAppVersionFromRequest(UpdateAppVersionRequest updateAppVersionRequest, @MappingTarget AppVersion appVersion);
}
