package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class zzgpp extends zzgok {
    private S1.y zza;
    private ScheduledFuture zzb;

    private zzgpp(S1.y yVar) {
        yVar.getClass();
        this.zza = yVar;
    }

    public static S1.y zze(S1.y yVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgpp zzgppVar = new zzgpp(yVar);
        zzgpn zzgpnVar = new zzgpn(zzgppVar);
        zzgppVar.zzb = scheduledExecutorService.schedule(zzgpnVar, j, timeUnit);
        yVar.addListener(zzgpnVar, zzgoi.INSTANCE);
        return zzgppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final void zzc() {
        zzm(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final String zzd() {
        S1.y yVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (yVar == null) {
            return null;
        }
        String string = yVar.toString();
        String strQ = We.s.q(new StringBuilder(string.length() + 14), "inputFuture=[", string, "]");
        if (scheduledFuture == null) {
            return strQ;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strQ;
        }
        int length = strQ.length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb2.append(strQ);
        sb2.append(", remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    public final /* synthetic */ S1.y zzf() {
        return this.zza;
    }

    public final /* synthetic */ ScheduledFuture zzx() {
        return this.zzb;
    }

    public final /* synthetic */ void zzy(ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }
}
