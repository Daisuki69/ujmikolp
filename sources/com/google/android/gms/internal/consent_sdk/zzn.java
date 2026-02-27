package com.google.android.gms.internal.consent_sdk;

import F.i;
import L1.a;
import L1.h;
import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
final class zzn {
    private final Application zza;
    private final zzaq zzb;

    public zzn(Application application, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzaqVar;
    }

    public final zzcj zzc(Activity activity, h hVar) throws zzg {
        a aVarD = hVar.f2804b;
        if (aVarD == null) {
            aVarD = new i(this.zza).d();
        }
        return zzp.zza(new zzp(this, activity, aVarD, hVar, null));
    }
}
