package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzayz {

    @VisibleForTesting
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final boolean zza(zzayy zzayyVar) {
        synchronized (this.zzb) {
            try {
                return this.zzc.contains(zzayyVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzb(zzayy zzayyVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzayy zzayyVar2 = (zzayy) it.next();
                    if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzc()) {
                        if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zze() && !zzayyVar.equals(zzayyVar2) && zzayyVar2.zzc().equals(zzayyVar.zzc())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzayyVar.equals(zzayyVar2) && zzayyVar2.zzb().equals(zzayyVar.zzb())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(zzayy zzayyVar) {
        synchronized (this.zzb) {
            try {
                List list = this.zzc;
                if (list.size() >= 10) {
                    int size = list.size();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 30);
                    sb2.append("Queue is full, current size = ");
                    sb2.append(size);
                    String string = sb2.toString();
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                    list.remove(0);
                }
                int i4 = this.zza;
                this.zza = i4 + 1;
                zzayyVar.zzk(i4);
                zzayyVar.zzh();
                list.add(zzayyVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
