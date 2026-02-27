package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaiw implements zzadz {
    public final int zza;
    public final zzgnc zzb;

    public zzaiw(int i, @Nullable int[] iArr) {
        this.zza = i;
        this.zzb = iArr != null ? zzgnc.zzb(iArr) : zzgnc.zza();
    }

    public final String toString() {
        zzgnc zzgncVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgncVar.zzc());
        for (int i = 0; i < zzgncVar.zzc(); i++) {
            arrayList.add(zzeo.zzx(zzgncVar.zzd(i)));
        }
        String strZzx = zzeo.zzx(this.zza);
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.b(strZzx.length() + 37, 1, string));
        sb2.append("UnsupportedBrands{major=");
        sb2.append(strZzx);
        sb2.append(", compatible=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
