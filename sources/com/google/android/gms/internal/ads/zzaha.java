package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzaha {
    private final zzef zza = new zzef(8);
    private int zzb;

    private final long zzb(zzacv zzacvVar) throws IOException {
        int i;
        zzef zzefVar = this.zza;
        zzacl zzaclVar = (zzacl) zzacvVar;
        int i4 = 0;
        zzaclVar.zzh(zzefVar.zzi(), 0, 1, false);
        int i6 = zzefVar.zzi()[0] & 255;
        if (i6 == 0) {
            return Long.MIN_VALUE;
        }
        int i10 = 128;
        int i11 = 0;
        while (true) {
            i = i11 + 1;
            if ((i6 & i10) != 0) {
                break;
            }
            i10 >>= 1;
            i11 = i;
        }
        int i12 = i6 & (~i10);
        zzaclVar.zzh(zzefVar.zzi(), 1, i11, false);
        while (i4 < i11) {
            i4++;
            i12 = (zzefVar.zzi()[i4] & 255) + (i12 << 8);
        }
        this.zzb += i;
        return i12;
    }

    public final boolean zza(zzacv zzacvVar) throws IOException {
        long jZzo = zzacvVar.zzo();
        long j = 1024;
        if (jZzo != -1 && jZzo <= 1024) {
            j = jZzo;
        }
        zzef zzefVar = this.zza;
        zzacl zzaclVar = (zzacl) zzacvVar;
        zzaclVar.zzh(zzefVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long jZzz = zzefVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | ((long) (zzefVar.zzi()[0] & 255))) {
            int i = (int) j;
            int i4 = this.zzb + 1;
            this.zzb = i4;
            if (i4 == i) {
                return false;
            }
            zzaclVar.zzh(zzefVar.zzi(), 0, 1, false);
        }
        long jZzb = zzb(zzacvVar);
        long j6 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j7 = j6 + jZzb;
            if (jZzo == -1 || j7 < jZzo) {
                while (true) {
                    long j9 = this.zzb;
                    if (j9 < j7) {
                        if (zzb(zzacvVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzacvVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i6 = (int) jZzb2;
                            zzaclVar.zzj(i6, false);
                            this.zzb += i6;
                        }
                    } else if (j9 == j7) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
