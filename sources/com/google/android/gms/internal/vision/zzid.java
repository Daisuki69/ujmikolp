package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class zzid extends zzia {
    protected final byte[] zzb;

    public zzid(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzht) || zza() != ((zzht) obj).zza()) {
            return false;
        }
        if (zza() == 0) {
            return true;
        }
        if (!(obj instanceof zzid)) {
            return obj.equals(this);
        }
        zzid zzidVar = (zzid) obj;
        int iZzd = zzd();
        int iZzd2 = zzidVar.zzd();
        if (iZzd == 0 || iZzd2 == 0 || iZzd == iZzd2) {
            return zza(zzidVar, 0, zza());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public final boolean zzc() {
        int iZze = zze();
        return zzmd.zza(this.zzb, iZze, zza() + iZze);
    }

    public int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public final zzht zza(int i, int i4) {
        int iZzb = zzht.zzb(0, i4, zza());
        if (iZzb == 0) {
            return zzht.zza;
        }
        return new zzhw(this.zzb, zze(), iZzb);
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public void zza(byte[] bArr, int i, int i4, int i6) {
        System.arraycopy(this.zzb, 0, bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public final void zza(zzhq zzhqVar) throws IOException {
        zzhqVar.zza(this.zzb, zze(), zza());
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public final String zza(Charset charset) {
        return new String(this.zzb, zze(), zza(), charset);
    }

    @Override // com.google.android.gms.internal.vision.zzia
    public final boolean zza(zzht zzhtVar, int i, int i4) {
        if (i4 <= zzhtVar.zza()) {
            if (i4 <= zzhtVar.zza()) {
                if (zzhtVar instanceof zzid) {
                    zzid zzidVar = (zzid) zzhtVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzidVar.zzb;
                    int iZze = zze() + i4;
                    int iZze2 = zze();
                    int iZze3 = zzidVar.zze();
                    while (iZze2 < iZze) {
                        if (bArr[iZze2] != bArr2[iZze3]) {
                            return false;
                        }
                        iZze2++;
                        iZze3++;
                    }
                    return true;
                }
                return zzhtVar.zza(0, i4).equals(zza(0, i4));
            }
            throw new IllegalArgumentException(AbstractC1173g.p(59, i4, zzhtVar.zza(), "Ran off end of other: 0, ", ", "));
        }
        int iZza = zza();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i4);
        sb2.append(iZza);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public final int zza(int i, int i4, int i6) {
        return zzjf.zza(i, this.zzb, zze(), i6);
    }
}
