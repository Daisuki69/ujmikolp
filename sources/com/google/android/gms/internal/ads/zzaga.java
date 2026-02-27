package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaga extends zzagh {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagh[] zze;

    public zzaga(String str, boolean z4, boolean z5, String[] strArr, zzagh[] zzaghVarArr) {
        super(ChapterTocFrame.ID);
        this.zza = str;
        this.zzb = z4;
        this.zzc = z5;
        this.zzd = strArr;
        this.zze = zzaghVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaga.class == obj.getClass()) {
            zzaga zzagaVar = (zzaga) obj;
            if (this.zzb == zzagaVar.zzb && this.zzc == zzagaVar.zzc && Objects.equals(this.zza, zzagaVar.zza) && Arrays.equals(this.zzd, zzagaVar.zzd) && Arrays.equals(this.zze, zzagaVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.zzb ? 1 : 0) + 527;
        String str = this.zza;
        return str.hashCode() + (((i * 31) + (this.zzc ? 1 : 0)) * 31);
    }
}
