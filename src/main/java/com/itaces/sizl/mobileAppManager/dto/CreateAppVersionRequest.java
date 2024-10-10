
package com.itaces.sizl.mobileAppManager.dto;

import com.itaces.sizl.mobileAppManager.entity.Platform;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DTO для создания новой версии приложения")
public record CreateAppVersionRequest(
    @Schema(description = "Платформа приложения", example = "IOS")
    Platform platform,
    
    @Schema(description = "Номер версии приложения", example = "2.1.0")
    String versionNumber,
    
    @Schema(description = "Флаг, указывающий, находится ли версия на проверке", example = "true")
    boolean inReview
) {}
