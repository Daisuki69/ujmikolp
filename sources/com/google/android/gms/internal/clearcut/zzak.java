package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;
import dOYHB6.yFtIp6.svM7M6;

/* JADX INFO: loaded from: classes3.dex */
final class zzak extends zzae<String> {
    public zzak(zzao zzaoVar, String str, String str2) {
        super(zzaoVar, str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzae
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zza(SharedPreferences sharedPreferences) {
        try {
            return svM7M6.getString(sharedPreferences, this.zzds, null);
        } catch (ClassCastException e) {
            String strValueOf = String.valueOf(this.zzds);
            Log.e("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid string value in SharedPreferences for ".concat(strValueOf) : new String("Invalid string value in SharedPreferences for "), e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    public final /* synthetic */ String zzb(String str) {
        return str;
    }
}
