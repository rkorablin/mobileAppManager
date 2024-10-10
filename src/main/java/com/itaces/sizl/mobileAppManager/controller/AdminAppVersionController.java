
package com.itaces.sizl.mobileAppManager.controller;

import com.itaces.sizl.mobileAppManager.dto.AppVersionDTO;
import com.itaces.sizl.mobileAppManager.dto.CreateAppVersionRequest;
import com.itaces.sizl.mobileAppManager.dto.UpdateAppVersionRequest;
import com.itaces.sizl.mobileAppManager.exception.AppVersionNotFoundException;
import com.itaces.sizl.mobileAppManager.service.AppVersionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/app-versions")
@Tag(name = "Управление версиями приложений", description = "API для управления версиями приложений (CRUD операции)")
public class AdminAppVersionController {

    @Autowired
    private AppVersionService appVersionService;

    @GetMapping
    @Operation(summary = "Получить все версии приложений", description = "Возвращает список всех версий приложений")
    public List<AppVersionDTO> getAllAppVersions() {
        return appVersionService.getAllAppVersions();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Получить версию приложения по ID", description = "Возвращает версию приложения по заданному идентификатору")
    public ResponseEntity<AppVersionDTO> getAppVersionById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(appVersionService.getAppVersionById(id));
        } catch (AppVersionNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    @Operation(summary = "Создать новую версию приложения", description = "Создает новую версию приложения на основе переданного запроса")
    public AppVersionDTO createAppVersion(@RequestBody CreateAppVersionRequest createAppVersionRequest) {
        return appVersionService.createAppVersion(createAppVersionRequest);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Обновить версию приложения", description = "Обновляет существующую версию приложения по ID на основе переданных данных")
    public ResponseEntity<AppVersionDTO> updateAppVersion(@PathVariable Long id, @RequestBody UpdateAppVersionRequest updateAppVersionRequest) {
        try {
            return ResponseEntity.ok(appVersionService.updateAppVersion(id, updateAppVersionRequest));
        } catch (AppVersionNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Удалить версию приложения", description = "Удаляет версию приложения по ID")
    public ResponseEntity<Void> deleteAppVersion(@PathVariable Long id) {
        try {
            appVersionService.deleteAppVersion(id);
            return ResponseEntity.noContent().build();
        } catch (AppVersionNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
