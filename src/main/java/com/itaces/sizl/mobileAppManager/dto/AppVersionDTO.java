
package com.itaces.sizl.mobileAppManager.dto;

import com.itaces.sizl.mobileAppManager.entity.Platform;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DTO для возврата данных о версии приложения")
public record AppVersionDTO(
    @Schema(description = "Идентификатор версии приложения", example = "1")
    Long id,
    
    @Schema(description = "Платформа приложения", example = "ANDROID")
    Platform platform,
    
    @Schema(description = "Номер версии приложения", example = "1.0.0")
    String versionNumber,
    
    @Schema(description = "Флаг, указывающий, находится ли версия на проверке", example = "false")
    boolean inReview
) {}
