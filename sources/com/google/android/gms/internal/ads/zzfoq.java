package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
public final class zzfoq {
    public static zzfpv zza(Context context, int i, zzaxq zzaxqVar, String str, String str2, String str3, zzfoh zzfohVar) {
        return new zzfop(context, 1, zzaxqVar, str, str2, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, zzfohVar).zza(50000);
    }
}
