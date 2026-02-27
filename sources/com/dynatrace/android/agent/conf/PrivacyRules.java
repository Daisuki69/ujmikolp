package com.dynatrace.android.agent.conf;

import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.conf.UserPrivacyOptions;

/* JADX INFO: loaded from: classes2.dex */
public class PrivacyRules {
    private final UserPrivacyOptions privacySettings;
    public static final PrivacyRules PRIVACY_MODE_DEACTIVATED = new PrivacyRules(new UserPrivacyOptions.Builder().withDataCollectionLevel(DataCollectionLevel.USER_BEHAVIOR).withCrashReportingOptedIn(true).withCrashReplayOptedIn(false).withScreenRecordOptedIn(null).build());
    public static final UserPrivacyOptions NO_USER_DEFINED_VALUE = new UserPrivacyOptions.Builder().withDataCollectionLevel(DataCollectionLevel.OFF).build();

    public PrivacyRules(UserPrivacyOptions userPrivacyOptions) {
        this.privacySettings = userPrivacyOptions;
    }

    public boolean allowLocationReporting() {
        return this.privacySettings.getDataCollectionLevel() == DataCollectionLevel.USER_BEHAVIOR;
    }

    public boolean allowUserRelatedCookies() {
        return this.privacySettings.getDataCollectionLevel().ordinal() >= DataCollectionLevel.PERFORMANCE.ordinal();
    }

    public UserPrivacyOptions getPrivacySettings() {
        return this.privacySettings;
    }

    public boolean keepVisitorId() {
        return this.privacySettings.getDataCollectionLevel() == DataCollectionLevel.USER_BEHAVIOR;
    }

    public boolean shouldCollectEvent(EventType eventType) {
        return eventType == EventType.CRASH ? this.privacySettings.isCrashReportingOptedIn() : eventType == EventType.ACTION_AUTO_LOADING_APP ? this.privacySettings.getDataCollectionLevel() == DataCollectionLevel.OFF : eventType.getDataCollectionLevel().ordinal() <= this.privacySettings.getDataCollectionLevel().ordinal();
    }
}
