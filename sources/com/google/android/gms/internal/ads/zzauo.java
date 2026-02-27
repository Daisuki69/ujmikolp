package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import androidx.annotation.VisibleForTesting;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes3.dex */
public final class zzauo {

    @VisibleForTesting
    protected volatile Boolean zzb;
    private final zzavx zzc;
    private static final ConditionVariable zzd = new ConditionVariable();

    @VisibleForTesting
    protected static volatile zzfqd zza = null;
    private static volatile Random zze = null;

    public zzauo(zzavx zzavxVar) {
        this.zzc = zzavxVar;
        zzavxVar.zzd().execute(new zzaun(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zze == null) {
                synchronized (zzauo.class) {
                    try {
                        if (zze == null) {
                            zze = new Random();
                        }
                    } finally {
                    }
                }
            }
            return zze.nextInt();
        }
    }

    public final void zza(int i, int i4, long j, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzarc zzarcVarZza = zzarg.zza();
            zzarcVarZza.zza(this.zzc.zza.getPackageName());
            zzarcVarZza.zzb(j);
            if (str != null) {
                zzarcVarZza.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzarcVarZza.zzc(stringWriter.toString());
                zzarcVarZza.zzd(exc.getClass().getName());
            }
            zzfqc zzfqcVarZza = zza.zza(((zzarg) zzarcVarZza.zzbu()).zzaN());
            zzfqcVarZza.zzc(i);
            if (i4 != -1) {
                zzfqcVarZza.zzb(i4);
            }
            zzfqcVarZza.zza();
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ zzavx zzb() {
        return this.zzc;
    }
}
