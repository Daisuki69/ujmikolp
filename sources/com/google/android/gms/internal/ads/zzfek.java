package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfek implements zzcvv {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzbyz zzc;

    public zzfek(Context context, zzbyz zzbyzVar) {
        this.zzb = context;
        this.zzc = zzbyzVar;
    }

    public final synchronized void zzb(HashSet hashSet) {
        HashSet hashSet2 = this.zza;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    public final Bundle zzc() {
        return this.zzc.zzn(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final synchronized void zzdN(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.zzc.zzc(this.zza);
        }
    }
}
