package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class zzgpn implements Runnable {
    zzgpp zza;

    public zzgpn(zzgpp zzgppVar) {
        this.zza = zzgppVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S1.y yVarZzf;
        zzgpp zzgppVar = this.zza;
        if (zzgppVar == null || (yVarZzf = zzgppVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (yVarZzf.isDone()) {
            zzgppVar.zzk(yVarZzf);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzx = zzgppVar.zzx();
            zzgppVar.zzy(null);
            String string = "Timed out";
            if (scheduledFutureZzx != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzx.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb2.append("Timed out (timeout delayed by ");
                        sb2.append(jAbs);
                        sb2.append(" ms after scheduled time)");
                        string = sb2.toString();
                    }
                } catch (Throwable th2) {
                    zzgppVar.zzb(new zzgpo(string, null));
                    throw th2;
                }
            }
            String string2 = yVarZzf.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 2 + string2.length());
            sb3.append(string);
            sb3.append(": ");
            sb3.append(string2);
            zzgppVar.zzb(new zzgpo(sb3.toString(), null));
        } finally {
            yVarZzf.cancel(true);
        }
    }
}
