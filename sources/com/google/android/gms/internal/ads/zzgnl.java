package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgnl extends zzgok implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    S1.y zza;
    Class zzb;
    Object zzc;

    public zzgnl(S1.y yVar, Class cls, Object obj) {
        yVar.getClass();
        this.zza = yVar;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        S1.y yVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((yVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = yVar instanceof zzgpv ? ((zzgpv) yVar).zzl() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(yVar.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                androidx.media3.datasource.cache.c.A(sb2, "Future type ", strValueOf, " threw ", strValueOf2);
                sb2.append(" without a cause");
                cause = new NullPointerException(sb2.toString());
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        Object objZzr = th == null ? zzgot.zzr(yVar) : null;
        if (th == null) {
            zza(objZzr);
            return;
        }
        if (!cls.isInstance(th)) {
            zzk(yVar);
            return;
        }
        try {
            Object objZzf = zzf(obj, th);
            this.zzb = null;
            this.zzc = null;
            zze(objZzf);
        } catch (Throwable th3) {
            try {
                zzgpl.zza(th3);
                zzb(th3);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final String zzd() {
        String strQ;
        S1.y yVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String strZzd = super.zzd();
        if (yVar != null) {
            String string = yVar.toString();
            strQ = We.s.q(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strQ = "";
        }
        if (cls == null || obj == null) {
            if (strZzd != null) {
                return strQ.concat(strZzd);
            }
            return null;
        }
        int length = strQ.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        androidx.media3.datasource.cache.c.A(sb2, strQ, "exceptionType=[", string2, "], fallback=[");
        return We.s.p(sb2, string3, "]");
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Throwable th2) throws Exception;
}
