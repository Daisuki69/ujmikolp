package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzaoc {
    public final int zza;
    public final long zzb;

    private zzaoc(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzaoc zza(zzacv zzacvVar, zzef zzefVar) throws IOException {
        zzacvVar.zzi(zzefVar.zzi(), 0, 8);
        zzefVar.zzh(0);
        return new zzaoc(zzefVar.zzB(), zzefVar.zzA());
    }
}
