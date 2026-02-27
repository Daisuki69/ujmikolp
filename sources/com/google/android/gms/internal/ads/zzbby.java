package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import dOYHB6.yFtIp6.svM7M6;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzbby extends zzbbz {
    public zzbby(int i, String str, String str2, String str3) {
        super(1, str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbbz
    public final /* bridge */ /* synthetic */ Object zza(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zze())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(zze())) : (String) zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbbz
    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, Object obj) {
        editor.putString(zze(), (String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbbz
    public final /* bridge */ /* synthetic */ Object zzc(JSONObject jSONObject) {
        return jSONObject.optString(zze(), (String) zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzbbz
    public final /* bridge */ /* synthetic */ Object zzd(SharedPreferences sharedPreferences) {
        return svM7M6.getString(sharedPreferences, zze(), (String) zzf());
    }
}
