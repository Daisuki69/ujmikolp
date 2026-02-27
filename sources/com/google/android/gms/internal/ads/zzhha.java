package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhha extends OutputStream {
    private static final byte[] zza = new byte[0];
    private int zzd;
    private int zzf;
    private final int zzb = 128;
    private final ArrayList zzc = new ArrayList();
    private byte[] zze = new byte[128];

    public zzhha(int i) {
    }

    private final void zzc(int i) {
        this.zzc.add(new zzhgz(this.zze));
        int length = this.zzd + this.zze.length;
        this.zzd = length;
        this.zze = new byte[Math.max(this.zzb, Math.max(i, length >>> 1))];
        this.zzf = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzb()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.zzf == this.zze.length) {
                zzc(1);
            }
            byte[] bArr = this.zze;
            int i4 = this.zzf;
            this.zzf = i4 + 1;
            bArr[i4] = (byte) i;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized zzhhb zza() {
        try {
            int i = this.zzf;
            byte[] bArr = this.zze;
            if (i >= bArr.length) {
                this.zzc.add(new zzhgz(this.zze));
                this.zze = zza;
            } else if (i > 0) {
                this.zzc.add(new zzhgz(Arrays.copyOf(bArr, i)));
            }
            this.zzd += this.zzf;
            this.zzf = 0;
        } catch (Throwable th2) {
            throw th2;
        }
        return zzhhb.zzt(this.zzc);
    }

    public final synchronized int zzb() {
        return this.zzd + this.zzf;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i4) {
        byte[] bArr2 = this.zze;
        int length = bArr2.length;
        int i6 = this.zzf;
        int i10 = length - i6;
        if (i4 <= i10) {
            System.arraycopy(bArr, i, bArr2, i6, i4);
            this.zzf += i4;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i6, i10);
        int i11 = i4 - i10;
        zzc(i11);
        System.arraycopy(bArr, i + i10, this.zze, 0, i11);
        this.zzf = i11;
    }
}
