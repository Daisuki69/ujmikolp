package com.google.android.gms.ads.internal.client;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbot;
import com.google.android.gms.internal.ads.zzbox;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class LiteSdkInfo extends zzcx {
    public LiteSdkInfo(@NonNull Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public zzbox getAdapterCreator() {
        return new zzbot();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public zzfc getLiteSdkVersion() {
        return new zzfc(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "24.6.0");
    }
}
