package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzftm extends zzftl {
    private static zzftm zzd;

    private zzftm(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzftm zzh(Context context) {
        zzftm zzftmVar;
        synchronized (zzftm.class) {
            try {
                if (zzd == null) {
                    zzd = new zzftm(context);
                }
                zzftmVar = zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzftmVar;
    }

    public final zzfti zzi(long j, boolean z4) throws IOException {
        zzfti zzftiVarZza;
        synchronized (zzftm.class) {
            zzftiVarZza = zza(null, null, j, z4);
        }
        return zzftiVarZza;
    }

    public final zzfti zzj(String str, String str2, long j, boolean z4) throws IOException {
        zzfti zzftiVarZza;
        synchronized (zzftm.class) {
            zzftiVarZza = zza(str, str2, j, z4);
        }
        return zzftiVarZza;
    }

    public final void zzk() throws IOException {
        synchronized (zzftm.class) {
            zzc(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzftm.class) {
            zzc(true);
        }
    }
}
