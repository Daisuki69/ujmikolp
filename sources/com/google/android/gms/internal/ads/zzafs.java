package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafs implements zzan {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzs zzsVar = new zzs();
        zzsVar.zzm(MimeTypes.APPLICATION_ID3);
        zzsVar.zzM();
        zzs zzsVar2 = new zzs();
        zzsVar2.zzm(MimeTypes.APPLICATION_SCTE35);
        zzsVar2.zzM();
    }

    public zzafs(String str, String str2, long j, long j6, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j6;
        this.zze = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafs.class == obj.getClass()) {
            zzafs zzafsVar = (zzafs) obj;
            if (this.zzc == zzafsVar.zzc && this.zzd == zzafsVar.zzd && Objects.equals(this.zza, zzafsVar.zza) && Objects.equals(this.zzb, zzafsVar.zzb) && Arrays.equals(this.zze, zzafsVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zza.hashCode() + 527;
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        long j = this.zzc;
        long j6 = this.zzd;
        int iHashCode3 = Arrays.hashCode(this.zze) + (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) j6)) * 31);
        this.zzf = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        long j = this.zzd;
        int length = String.valueOf(j).length();
        long j6 = this.zzc;
        int length2 = String.valueOf(j6).length();
        String str = this.zza;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str2.length() + length3 + 8);
        androidx.camera.core.impl.a.C(sb2, "EMSG: scheme=", str, ", id=");
        sb2.append(j);
        androidx.media3.datasource.cache.c.z(sb2, ", durationMs=", j6, ", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzan
    public final /* synthetic */ void zza(zzal zzalVar) {
        AbstractC1174h.a(this, zzalVar);
    }
}
