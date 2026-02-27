package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zza {

    @GuardedBy("AppComponent.class")
    private static zza zza;

    public static zza zza(Context context) {
        zza zzaVar;
        synchronized (zza.class) {
            try {
                if (zza == null) {
                    zzai zzaiVar = new zzai(null);
                    zzaiVar.zzb((Application) context.getApplicationContext());
                    zza = zzaiVar.zza();
                }
                zzaVar = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzaVar;
    }

    public abstract zzj zzb();

    public abstract zzbo zzc();
}
