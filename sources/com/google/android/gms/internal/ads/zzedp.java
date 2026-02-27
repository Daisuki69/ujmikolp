package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public interface zzedp {
    boolean zza(Context context);

    @Nullable
    String zzb(Context context);

    @Nullable
    zzedu zzc(String str, WebView webView, String str2, String str3, @Nullable String str4, zzedr zzedrVar, zzedq zzedqVar, @Nullable String str5);

    @Nullable
    zzedu zzd(String str, WebView webView, String str2, String str3, @Nullable String str4, String str5, zzedr zzedrVar, zzedq zzedqVar, @Nullable String str6);

    void zze(zzflj zzfljVar);

    void zzf(zzflj zzfljVar);

    void zzg(zzflj zzfljVar, View view);

    void zzh(zzflj zzfljVar, View view);

    @Nullable
    zzflv zzi(VersionInfoParcel versionInfoParcel, WebView webView, boolean z4);

    void zzj(zzflv zzflvVar, zzflu zzfluVar);

    void zzk(zzflv zzflvVar, View view);
}
