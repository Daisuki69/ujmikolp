package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhqo extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzhqo(zzbdj zzbdjVar) {
        this.zza = new WeakReference(zzbdjVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbdj zzbdjVar = (zzbdj) this.zza.get();
        if (zzbdjVar != null) {
            zzbdjVar.zzf(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbdj zzbdjVar = (zzbdj) this.zza.get();
        if (zzbdjVar != null) {
            zzbdjVar.zzg();
        }
    }
}
