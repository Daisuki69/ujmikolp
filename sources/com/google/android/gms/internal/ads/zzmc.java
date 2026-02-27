package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class zzmc {
    private boolean zza;

    public zzmc(Context context, Looper looper, zzdb zzdbVar) {
        context.getApplicationContext();
        zzdbVar.zzd(looper, null);
    }

    public final void zza(boolean z4) {
        if (this.zza == z4) {
            return;
        }
        this.zza = z4;
    }
}
