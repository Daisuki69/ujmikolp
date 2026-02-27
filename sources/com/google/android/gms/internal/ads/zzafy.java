package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafy extends zzagh {
    public final byte[] zza;

    public zzafy(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafy.class == obj.getClass()) {
            zzafy zzafyVar = (zzafy) obj;
            if (this.zzf.equals(zzafyVar.zzf) && Arrays.equals(this.zza, zzafyVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        return Arrays.hashCode(this.zza) + (iHashCode * 31);
    }
}
