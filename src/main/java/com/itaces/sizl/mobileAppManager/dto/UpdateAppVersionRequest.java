
package com.itaces.sizl.mobileAppManager.dto;

import com.itaces.sizl.mobileAppManager.entity.Platform;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DTO для обновления существующей версии приложения")
public record UpdateAppVersionRequest(
    @Schema(description = "Платформа приложения", example = "ANDROID")
    Platform platform,
    
    @Schema(description = "Номер версии приложения", example = "1.2.3")
    String versionNumber,
    
    @Schema(description = "Флаг, указывающий, находится ли версия на проверке", example = "false")
    boolean inReview
) {}
