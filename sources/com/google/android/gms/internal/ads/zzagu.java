package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
final class zzagu {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzahb zzc = new zzahb();
    private zzagv zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzacv zzacvVar, int i) throws IOException {
        byte[] bArr = this.zza;
        zzacvVar.zzc(bArr, 0, i);
        long j = 0;
        for (int i4 = 0; i4 < i; i4++) {
            j = (j << 8) | ((long) (bArr[i4] & 255));
        }
        return j;
    }

    public final void zza(zzagv zzagvVar) {
        this.zzd = zzagvVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[LOOP:0: B:3:0x0005->B:37:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzacv r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagu.zzc(com.google.android.gms.internal.ads.zzacv):boolean");
    }
}
