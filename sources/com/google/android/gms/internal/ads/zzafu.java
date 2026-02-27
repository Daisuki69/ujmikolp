package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafu implements zzan {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzafu(int i, String str, String str2, int i4, int i6, int i10, int i11, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i4;
        this.zze = i6;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = bArr;
    }

    public static zzafu zzb(zzef zzefVar) {
        int iZzB = zzefVar.zzB();
        String strZzi = zzar.zzi(zzefVar.zzK(zzefVar.zzB(), StandardCharsets.US_ASCII));
        String strZzK = zzefVar.zzK(zzefVar.zzB(), StandardCharsets.UTF_8);
        int iZzB2 = zzefVar.zzB();
        int iZzB3 = zzefVar.zzB();
        int iZzB4 = zzefVar.zzB();
        int iZzB5 = zzefVar.zzB();
        int iZzB6 = zzefVar.zzB();
        byte[] bArr = new byte[iZzB6];
        zzefVar.zzm(bArr, 0, iZzB6);
        return new zzafu(iZzB, strZzi, strZzK, iZzB2, iZzB3, iZzB4, iZzB5, bArr);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafu.class == obj.getClass()) {
            zzafu zzafuVar = (zzafu) obj;
            if (this.zza == zzafuVar.zza && this.zzb.equals(zzafuVar.zzb) && this.zzc.equals(zzafuVar.zzc) && this.zzd == zzafuVar.zzd && this.zze == zzafuVar.zze && this.zzf == zzafuVar.zzf && this.zzg == zzafuVar.zzg && Arrays.equals(this.zzh, zzafuVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza + 527;
        int iHashCode = this.zzb.hashCode() + (i * 31);
        int iHashCode2 = this.zzc.hashCode() + (iHashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((iHashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        return androidx.camera.core.impl.a.p(new StringBuilder(str2.length() + length + 32), "Picture: mimeType=", str, ", description=", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzan
    public final void zza(zzal zzalVar) {
        zzalVar.zzf(this.zzh, this.zza);
    }
}
