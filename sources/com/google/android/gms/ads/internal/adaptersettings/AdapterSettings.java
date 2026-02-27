package com.google.android.gms.ads.internal.adaptersettings;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbbr;

/* JADX INFO: loaded from: classes2.dex */
class AdapterSettings {

    @Nullable
    private static volatile AdapterSettings instance;
    private final zzbbr adapterSettingsInternal = zzbd.zzd();

    @KeepForSdk
    private boolean getBoolean(String str, boolean z4) {
        return this.adapterSettingsInternal.zzf(str, z4);
    }

    @KeepForSdk
    private float getFloat(String str, float f) {
        return this.adapterSettingsInternal.zze(str, f);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    @KeepForSdk
    private int getInt(String str, int i) {
        return this.adapterSettingsInternal.zzd(str, i);
    }

    @KeepForSdk
    private long getLong(String str, long j) {
        return this.adapterSettingsInternal.zzc(str, j);
    }

    @KeepForSdk
    private String getString(String str, String str2) {
        return this.adapterSettingsInternal.zzb(str, str2);
    }
}
