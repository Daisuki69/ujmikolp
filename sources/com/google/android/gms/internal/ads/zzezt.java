package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
final class zzezt implements zzggr {
    final /* synthetic */ zzezx zza;

    public zzezt(zzezx zzezxVar) {
        Objects.requireNonNull(zzezxVar);
        this.zza = zzezxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", (zzdzk) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzezx zzezxVar = this.zza;
        zzezxVar.zzd(new zzezv(null, zzezxVar.zzb(), null));
        return zzezxVar.zzc();
    }
}
