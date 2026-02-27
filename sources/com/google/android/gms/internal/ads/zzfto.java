package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfto {
    private static zzfto zzb;
    final zzftk zza;

    private zzfto(Context context) {
        this.zza = zzftk.zza(context);
        zzftj.zza(context);
    }

    public static final zzfto zza(Context context) {
        zzfto zzftoVar;
        synchronized (zzfto.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfto(context);
                }
                zzftoVar = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzftoVar;
    }

    public final void zzb(@Nullable zzfti zzftiVar) throws IOException {
        synchronized (zzfto.class) {
            zzftk zzftkVar = this.zza;
            zzftkVar.zzf("vendor_scoped_gpid_v2_id");
            zzftkVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
