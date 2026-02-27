package com.google.android.gms.internal.ads;

import android.os.IBinder;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzgel extends zzgfm {
    private final IBinder zza;

    @Nullable
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;

    @Nullable
    private final String zzf;

    public /* synthetic */ zzgel(IBinder iBinder, String str, int i, float f, int i4, int i6, String str2, int i10, String str3, String str4, String str5, byte[] bArr) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i;
        this.zzd = f;
        this.zze = i10;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgfm) {
            zzgfm zzgfmVar = (zzgfm) obj;
            if (this.zza.equals(zzgfmVar.zza()) && ((str = this.zzb) != null ? str.equals(zzgfmVar.zzb()) : zzgfmVar.zzb() == null) && this.zzc == zzgfmVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzgfmVar.zzd())) {
                zzgfmVar.zze();
                zzgfmVar.zzf();
                zzgfmVar.zzg();
                if (this.zze == zzgfmVar.zzh()) {
                    zzgfmVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzgfmVar.zzj()) : zzgfmVar.zzj() == null) {
                        zzgfmVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i = this.zze;
        String str2 = this.zzf;
        return ((((iHashCode2 * 1525764945) ^ i) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i = this.zzc;
        int length3 = String.valueOf(i).length();
        float f = this.zzd;
        int length4 = String.valueOf(f).length();
        int i4 = this.zze;
        int length5 = String.valueOf(i4).length();
        String str2 = this.zzf;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        androidx.media3.datasource.cache.c.A(sb2, "OverlayDisplayShowRequest{windowToken=", string, ", appId=", str);
        sb2.append(", layoutGravity=");
        sb2.append(i);
        sb2.append(", layoutVerticalMargin=");
        sb2.append(f);
        sb2.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb2.append(i4);
        sb2.append(", deeplinkUrl=null, adFieldEnifd=");
        sb2.append(str2);
        sb2.append(", thirdPartyAuthCallerId=null}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final IBinder zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final int zzf() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    @Nullable
    public final String zzg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final int zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    @Nullable
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    @Nullable
    public final String zzj() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    @Nullable
    public final String zzk() {
        return null;
    }
}
