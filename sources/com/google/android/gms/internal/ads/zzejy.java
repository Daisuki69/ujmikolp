package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejy {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdqc zzb;

    public zzejy(zzdqc zzdqcVar) {
        this.zzb = zzdqcVar;
    }

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e);
        }
    }

    public final zzbqw zzb(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbqw) concurrentHashMap.get(str);
        }
        return null;
    }
}
