package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import dOYHB6.yFtIp6.svM7M6;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeri implements zzeup {
    private final Context zza;
    private final zzgpd zzb;

    public zzeri(Context context, zzgpd zzgpdVar) {
        this.zza = context;
        this.zzb = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        return this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzerh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 18;
    }

    public final /* synthetic */ zzerg zzc() {
        Bundle bundle;
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgy)).booleanValue() ? "" : svM7M6.getString(this.zza.getSharedPreferences("mobileads_consent", 0), "consent_string", "");
        String string2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgA)).booleanValue() ? svM7M6.getString(this.zza.getSharedPreferences("mobileads_consent", 0), "fc_consent", "") : "";
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgz)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, svM7M6.getString(defaultSharedPreferences, str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new zzerg(string, string2, bundle, null);
    }
}
