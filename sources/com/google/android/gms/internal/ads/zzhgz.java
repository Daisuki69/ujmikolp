package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class zzhgz extends zzhgy {
    protected final byte[] zza;

    public zzhgz(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhhb) || zzc() != ((zzhhb) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzhgz)) {
            return obj.equals(this);
        }
        zzhgz zzhgzVar = (zzhgz) obj;
        int iZzy = zzy();
        int iZzy2 = zzhgzVar.zzy();
        if (iZzy == 0 || iZzy2 == 0 || iZzy == iZzy2) {
            return zzh(zzhgzVar, 0, zzc());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public int zzc() {
        return this.zza.length;
    }

    public int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public void zze(byte[] bArr, int i, int i4, int i6) {
        System.arraycopy(this.zza, i, bArr, i4, i6);
    }

    @Override // com.google.android.gms.internal.ads.zzhgy
    public final boolean zzh(zzhhb zzhhbVar, int i, int i4) {
        if (i4 > zzhhbVar.zzc()) {
            int iZzc = zzc();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 18 + String.valueOf(iZzc).length());
            sb2.append("Length too large: ");
            sb2.append(i4);
            sb2.append(iZzc);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i6 = i + i4;
        if (i6 > zzhhbVar.zzc()) {
            int iZzc2 = zzhhbVar.zzc();
            int length = String.valueOf(i).length();
            StringBuilder sb3 = new StringBuilder(length + 24 + String.valueOf(i4).length() + 2 + String.valueOf(iZzc2).length());
            androidx.media3.datasource.cache.c.y(sb3, "Ran off end of other: ", i, ", ", i4);
            throw new IllegalArgumentException(androidx.camera.core.impl.a.o(sb3, ", ", iZzc2));
        }
        if (!(zzhhbVar instanceof zzhgz)) {
            return zzhhbVar.zzi(i, i6).equals(zzi(0, i4));
        }
        zzhgz zzhgzVar = (zzhgz) zzhhbVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzhgzVar.zza;
        int iZzd = zzd() + i4;
        int iZzd2 = zzd();
        int iZzd3 = zzhgzVar.zzd() + i;
        while (iZzd2 < iZzd) {
            if (bArr[iZzd2] != bArr2[iZzd3]) {
                return false;
            }
            iZzd2++;
            iZzd3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final zzhhb zzi(int i, int i4) {
        int iZzA = zzhhb.zzA(i, i4, zzc());
        return iZzA == 0 ? zzhhb.zzb : new zzhgv(this.zza, zzd() + i, iZzA);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final ByteBuffer zzj() {
        return ByteBuffer.wrap(this.zza, zzd(), zzc()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final void zzk(zzhgs zzhgsVar) throws IOException {
        zzhgsVar.zza(this.zza, zzd(), zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final String zzl(Charset charset) {
        return new String(this.zza, zzd(), zzc(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final boolean zzm() {
        int iZzd = zzd();
        return zzhlh.zza(this.zza, iZzd, zzc() + iZzd);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final int zzn(int i, int i4, int i6) {
        int iZzd = zzd() + i4;
        return zzhlh.zzb(i, this.zza, iZzd, i6 + iZzd);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final int zzo(int i, int i4, int i6) {
        return zzhiu.zzc(i, this.zza, zzd() + i4, i6);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final zzhhg zzp() {
        return zzhhg.zzG(this.zza, zzd(), zzc(), true);
    }
}
