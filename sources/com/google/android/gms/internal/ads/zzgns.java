package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgns extends zzgok implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    S1.y zza;
    Object zzb;

    public zzgns(S1.y yVar, Object obj) {
        yVar.getClass();
        this.zza = yVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S1.y yVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (yVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (yVar.isCancelled()) {
            zzk(yVar);
            return;
        }
        try {
            try {
                Object objZzf = zzf(obj, zzgot.zzr(yVar));
                this.zzb = null;
                zze(objZzf);
            } catch (Throwable th2) {
                try {
                    zzgpl.zza(th2);
                    zzb(th2);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzb(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e7) {
            zzb(e7.getCause());
        } catch (Exception e10) {
            zzb(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final String zzd() {
        String strQ;
        S1.y yVar = this.zza;
        Object obj = this.zzb;
        String strZzd = super.zzd();
        if (yVar != null) {
            String string = yVar.toString();
            strQ = We.s.q(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strQ = "";
        }
        if (obj == null) {
            if (strZzd != null) {
                return strQ.concat(strZzd);
            }
            return null;
        }
        int length = strQ.length();
        String string2 = obj.toString();
        return androidx.camera.core.impl.a.p(new StringBuilder(string2.length() + length + 10 + 1), strQ, "function=[", string2, "]");
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Object obj2) throws Exception;
}
