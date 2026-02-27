package com.dynatrace.android.agent.conf;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigurationFactory {
    public static Configuration getConfiguration() {
        return ConfigurationPreset.generateImproperConfiguration();
    }

    public static boolean isUserInteractionEnabled() {
        return true;
    }
}
