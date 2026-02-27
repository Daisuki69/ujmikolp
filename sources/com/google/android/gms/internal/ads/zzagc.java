package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.id3.GeobFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagc extends zzagh {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzagc(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagc.class == obj.getClass()) {
            zzagc zzagcVar = (zzagc) obj;
            if (Objects.equals(this.zza, zzagcVar.zza) && Objects.equals(this.zzb, zzagcVar.zzb) && Objects.equals(this.zzc, zzagcVar.zzc) && Arrays.equals(this.zzd, zzagcVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return Arrays.hashCode(this.zzd) + ((this.zzc.hashCode() + ((this.zzb.hashCode() + (((str != null ? str.hashCode() : 0) + 527) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzb;
        int length3 = str3.length() + We.s.b(length, 11, length2, 11);
        String str4 = this.zzc;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 14);
        androidx.media3.datasource.cache.c.A(sb2, str, ": mimeType=", str2, ", filename=");
        return We.s.q(sb2, str3, ", description=", str4);
    }
}
