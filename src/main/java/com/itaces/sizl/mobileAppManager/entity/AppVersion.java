package com.itaces.sizl.mobileAppManager.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "app_versions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppVersion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_version_seq")
    @SequenceGenerator(name = "app_version_seq", sequenceName = "app_version_seq", allocationSize = 1)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "platform", nullable = false)
    private Platform platform;

    @Column(name = "version_number", nullable = false)
    private String versionNumber;

    @Column(name = "in_review", nullable = false)
    private boolean inReview;
}
