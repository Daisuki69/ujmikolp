package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagk extends zzagh {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzagk(int i, int i4, int i6, int[] iArr, int[] iArr2) {
        super(MlltFrame.ID);
        this.zza = i;
        this.zzb = i4;
        this.zzc = i6;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagk.class == obj.getClass()) {
            zzagk zzagkVar = (zzagk) obj;
            if (this.zza == zzagkVar.zza && this.zzb == zzagkVar.zzb && this.zzc == zzagkVar.zzc && Arrays.equals(this.zzd, zzagkVar.zzd) && Arrays.equals(this.zze, zzagkVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza + 527;
        int[] iArr = this.zzd;
        int iHashCode = Arrays.hashCode(iArr) + (((((i * 31) + this.zzb) * 31) + this.zzc) * 31);
        return Arrays.hashCode(this.zze) + (iHashCode * 31);
    }
}
