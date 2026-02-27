package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import We.s;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class zzde extends zzdd {
    protected final byte[] zza;

    public zzde(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdf) || zzd() != ((zzdf) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzde)) {
            return obj.equals(this);
        }
        zzde zzdeVar = (zzde) obj;
        int iZzp = zzp();
        int iZzp2 = zzdeVar.zzp();
        if (iZzp == 0 || iZzp2 == 0 || iZzp == iZzp2) {
            return zzg(zzdeVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public void zze(byte[] bArr, int i, int i4, int i6) {
        System.arraycopy(this.zza, i, bArr, i4, i6);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdd
    public final boolean zzg(zzdf zzdfVar, int i, int i4) {
        if (i4 > zzdfVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i4 + zzd());
        }
        int i6 = i + i4;
        if (i6 > zzdfVar.zzd()) {
            int iZzd = zzdfVar.zzd();
            StringBuilder sbU = s.u("Ran off end of other: ", i, ", ", i4, ", ");
            sbU.append(iZzd);
            throw new IllegalArgumentException(sbU.toString());
        }
        if (!(zzdfVar instanceof zzde)) {
            return zzdfVar.zzk(i, i6).equals(zzk(0, i4));
        }
        zzde zzdeVar = (zzde) zzdfVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzdeVar.zza;
        int iZzc = zzc() + i4;
        int iZzc2 = zzc();
        int iZzc3 = zzdeVar.zzc() + i;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzi(int i, int i4, int i6) {
        return zzep.zzb(i, this.zza, zzc() + i4, i6);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzj(int i, int i4, int i6) {
        int iZzc = zzc() + i4;
        return zzhe.zzf(i, this.zza, iZzc, i6 + iZzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final zzdf zzk(int i, int i4) {
        int iZzo = zzdf.zzo(i, i4, zzd());
        return iZzo == 0 ? zzdf.zzb : new zzda(this.zza, zzc() + i, iZzo);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final String zzl(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final void zzm(zzcx zzcxVar) throws IOException {
        ((zzdk) zzcxVar).zzc(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzn() {
        int iZzc = zzc();
        return zzhe.zzg(this.zza, iZzc, zzd() + iZzc);
    }
}
