package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class zzhhl extends zzhhi {
    private final OutputStream zzg;

    public zzhhl(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzH(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzI();
        }
    }

    private final void zzI() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzJ(int i, int i4) throws IOException {
        zzs((i << 3) | i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzK(int i, int i4) throws IOException {
        zzH(20);
        zzd(i << 3);
        if (i4 >= 0) {
            zzd(i4);
        } else {
            zze(i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzL(int i, int i4) throws IOException {
        zzH(20);
        zzd(i << 3);
        zzd(i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzM(int i, int i4) throws IOException {
        zzH(14);
        zzd((i << 3) | 5);
        zzf(i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzN(int i, long j) throws IOException {
        zzH(20);
        zzd(i << 3);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm, com.google.android.gms.internal.ads.zzhgs
    public final void zza(byte[] bArr, int i, int i4) throws IOException {
        zzw(bArr, i, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzh(int i, long j) throws IOException {
        zzH(18);
        zzd((i << 3) | 1);
        zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzi(int i, boolean z4) throws IOException {
        zzH(11);
        zzd(i << 3);
        zzc(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzj(int i, String str) throws IOException {
        zzs((i << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzk(int i, zzhhb zzhhbVar) throws IOException {
        zzs((i << 3) | 2);
        zzl(zzhhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzl(zzhhb zzhhbVar) throws IOException {
        zzs(zzhhbVar.zzc());
        zzhhbVar.zzk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzm(byte[] bArr, int i, int i4) throws IOException {
        zzs(i4);
        zzw(bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzn(int i, zzhjs zzhjsVar) throws IOException {
        zzs(11);
        zzL(2, i);
        zzs(26);
        zzp(zzhjsVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzo(int i, zzhhb zzhhbVar) throws IOException {
        zzs(11);
        zzL(2, i);
        zzk(3, zzhhbVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzp(zzhjs zzhjsVar) throws IOException {
        zzs(zzhjsVar.zzbr());
        zzhjsVar.zzdc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzq(byte b8) throws IOException {
        if (this.zzc == this.zzb) {
            zzI();
        }
        zzc(b8);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzr(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzs(int i) throws IOException {
        zzH(5);
        zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzt(int i) throws IOException {
        zzH(4);
        zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzu(long j) throws IOException {
        zzH(10);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzv(long j) throws IOException {
        zzH(8);
        zzg(j);
    }

    public final void zzw(byte[] bArr, int i, int i4) throws IOException {
        int i6 = this.zzb;
        int i10 = this.zzc;
        int i11 = i6 - i10;
        if (i11 >= i4) {
            System.arraycopy(bArr, i, this.zza, i10, i4);
            this.zzc += i4;
            this.zzd += i4;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, i, bArr2, i10, i11);
        int i12 = i + i11;
        this.zzc = i6;
        this.zzd += i11;
        zzI();
        int i13 = i4 - i11;
        if (i13 <= i6) {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.zzc = i13;
        } else {
            this.zzg.write(bArr, i12, i13);
        }
        this.zzd += i13;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzx(String str) throws IOException {
        int iZzc;
        try {
            int length = str.length() * 3;
            int iZzA = zzhhm.zzA(length);
            int i = iZzA + length;
            int i4 = this.zzb;
            if (i > i4) {
                byte[] bArr = new byte[length];
                int iZzd = zzhlh.zzd(str, bArr, 0, length);
                zzs(iZzd);
                zzw(bArr, 0, iZzd);
                return;
            }
            if (i > i4 - this.zzc) {
                zzI();
            }
            int iZzA2 = zzhhm.zzA(str.length());
            int i6 = this.zzc;
            try {
                try {
                    if (iZzA2 == iZzA) {
                        int i10 = i6 + iZzA2;
                        this.zzc = i10;
                        int iZzd2 = zzhlh.zzd(str, this.zza, i10, i4 - i10);
                        this.zzc = i6;
                        iZzc = (iZzd2 - i6) - iZzA2;
                        zzd(iZzc);
                        this.zzc = iZzd2;
                    } else {
                        iZzc = zzhlh.zzc(str);
                        zzd(iZzc);
                        this.zzc = zzhlh.zzd(str, this.zza, this.zzc, iZzc);
                    }
                    this.zzd += iZzc;
                } catch (zzhlg e) {
                    this.zzd -= this.zzc - i6;
                    this.zzc = i6;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e7) {
                throw new zzhhk(e7);
            }
        } catch (zzhlg e10) {
            zzF(str, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzy() throws IOException {
        if (this.zzc > 0) {
            zzI();
        }
    }
}
