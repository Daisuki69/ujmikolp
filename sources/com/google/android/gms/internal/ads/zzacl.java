package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacl implements zzacv {
    private final zzi zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    static {
        zzak.zzb("media3.extractor");
    }

    public zzacl(zzi zziVar, long j, long j6) {
        this.zzb = zziVar;
        this.zzd = j;
        this.zzc = j6;
    }

    private final void zzp(int i) {
        int i4 = this.zzf + i;
        int length = this.zze.length;
        if (i4 > length) {
            String str = zzeo.zza;
            this.zze = Arrays.copyOf(this.zze, Math.max(65536 + i4, Math.min(length + length, i4 + 524288)));
        }
    }

    private final int zzq(int i) {
        int iMin = Math.min(this.zzg, i);
        zzs(iMin);
        return iMin;
    }

    private final int zzr(byte[] bArr, int i, int i4) {
        int i6 = this.zzg;
        if (i6 == 0) {
            return 0;
        }
        int iMin = Math.min(i6, i4);
        System.arraycopy(this.zze, 0, bArr, i, iMin);
        zzs(iMin);
        return iMin;
    }

    private final void zzs(int i) {
        int i4 = this.zzg - i;
        this.zzg = i4;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i4 < bArr.length + (-524288) ? new byte[65536 + i4] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i4);
        this.zze = bArr2;
    }

    private final int zzt(byte[] bArr, int i, int i4, int i6, boolean z4) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iZza = this.zzb.zza(bArr, i + i6, i4 - i6);
        if (iZza != -1) {
            return i6 + iZza;
        }
        if (i6 == 0 && z4) {
            return -1;
        }
        throw new EOFException();
    }

    private final void zzu(int i) {
        if (i != -1) {
            this.zzd += (long) i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i4) throws IOException {
        int iZzr = zzr(bArr, i, i4);
        if (iZzr == 0) {
            iZzr = zzt(bArr, i, i4, 0, true);
        }
        zzu(iZzr);
        return iZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzb(byte[] bArr, int i, int i4, boolean z4) throws IOException {
        int iZzr = zzr(bArr, i, i4);
        while (iZzr < i4 && iZzr != -1) {
            iZzr = zzt(bArr, i, i4, iZzr, z4);
        }
        zzu(iZzr);
        return iZzr != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzc(byte[] bArr, int i, int i4) throws IOException {
        zzb(bArr, i, i4, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzd(int i) throws IOException {
        int iZzq = zzq(1);
        if (iZzq == 0) {
            iZzq = zzt(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzu(iZzq);
        return iZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zze(int i, boolean z4) throws IOException {
        int iZzq = zzq(i);
        while (iZzq < i && iZzq != -1) {
            iZzq = zzt(this.zza, -iZzq, Math.min(i, iZzq + 4096), iZzq, z4);
        }
        zzu(iZzq);
        return iZzq != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(int i) throws IOException {
        zze(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzg(byte[] bArr, int i, int i4) throws IOException {
        zzacl zzaclVar;
        int iMin;
        zzp(i4);
        int i6 = this.zzg;
        int i10 = this.zzf;
        int i11 = i6 - i10;
        if (i11 == 0) {
            zzaclVar = this;
            iMin = zzaclVar.zzt(this.zze, i10, i4, 0, true);
            if (iMin == -1) {
                return -1;
            }
            zzaclVar.zzg += iMin;
        } else {
            zzaclVar = this;
            iMin = Math.min(i4, i11);
        }
        System.arraycopy(zzaclVar.zze, zzaclVar.zzf, bArr, i, iMin);
        zzaclVar.zzf += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzh(byte[] bArr, int i, int i4, boolean z4) throws IOException {
        if (!zzj(i4, z4)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i4, bArr, i, i4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzi(byte[] bArr, int i, int i4) throws IOException {
        zzh(bArr, i, i4, false);
    }

    public final boolean zzj(int i, boolean z4) throws IOException {
        zzp(i);
        int iZzt = this.zzg - this.zzf;
        while (iZzt < i) {
            int i4 = i;
            boolean z5 = z4;
            iZzt = zzt(this.zze, this.zzf, i4, iZzt, z5);
            if (iZzt == -1) {
                return false;
            }
            this.zzg = this.zzf + iZzt;
            i = i4;
            z4 = z5;
        }
        this.zzf += i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzk(int i) throws IOException {
        zzj(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzl() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final long zzm() {
        return this.zzd + ((long) this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final long zzn() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final long zzo() {
        return this.zzc;
    }
}
