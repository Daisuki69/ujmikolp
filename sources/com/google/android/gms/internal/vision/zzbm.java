package com.google.android.gms.internal.vision;

import android.util.Base64;
import android.util.Log;
import androidx.media3.datasource.cache.c;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzbm extends zzbi {
    private final /* synthetic */ zzbp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbm(zzbo zzboVar, String str, Object obj, boolean z4, zzbp zzbpVar) {
        super(zzboVar, str, obj, true, null);
        this.zza = zzbpVar;
    }

    @Override // com.google.android.gms.internal.vision.zzbi
    public final Object zza(Object obj) {
        if (obj instanceof String) {
            try {
                return this.zza.zza(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        String strZzb = zzb();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + c.c(27, strZzb));
        sb2.append("Invalid byte[] value for ");
        sb2.append(strZzb);
        sb2.append(": ");
        sb2.append(strValueOf);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
