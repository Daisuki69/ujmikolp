package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbfl;

/* JADX INFO: loaded from: classes2.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {

    @Nullable
    private final zzbfl zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z4, @Nullable Location location, int i, int i4, @Nullable String str2, String str3, @Nullable zzbfl zzbflVar) {
        super(context, str, bundle, bundle2, z4, location, i, i4, str2, str3);
        this.zza = zzbflVar;
    }

    @NonNull
    public NativeAdOptions getNativeAdOptions() {
        return zzbfl.zza(this.zza);
    }
}
