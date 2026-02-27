package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzegz implements zzedz {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        return !TextUtils.isEmpty(zzfcjVar.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final S1.y zzb(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        JSONObject jSONObject = zzfcjVar.zzv;
        String strOptString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        zzfdb zzfdbVar = new zzfdb();
        zzfdbVar.zzy(zzfdcVar);
        zzfdbVar.zzg(strOptString);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfdcVar.zzd;
        Bundle bundleZzd = zzd(zzmVar.zzm);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzfcjVar.zzD;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        zzfdbVar.zza(new com.google.android.gms.ads.internal.client.zzm(zzmVar.zza, zzmVar.zzb, bundleZzd2, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, bundleZzd, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz, zzmVar.zzA));
        zzfdc zzfdcVarZzz = zzfdbVar.zzz();
        Bundle bundle = new Bundle();
        zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfcmVar.zza));
        bundle2.putInt("refresh_interval", zzfcmVar.zzc);
        bundle2.putString("gws_query_id", zzfcmVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        Bundle bundleD = androidx.media3.datasource.cache.c.d("initial_ad_unit_id", zzfdcVar.zzg);
        bundleD.putString("allocation_id", zzfcjVar.zzw);
        bundleD.putString("ad_source_name", zzfcjVar.zzF);
        bundleD.putStringArrayList("click_urls", new ArrayList<>(zzfcjVar.zzc));
        bundleD.putStringArrayList("imp_urls", new ArrayList<>(zzfcjVar.zzd));
        bundleD.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfcjVar.zzp));
        bundleD.putStringArrayList("fill_urls", new ArrayList<>(zzfcjVar.zzm));
        bundleD.putStringArrayList("video_start_urls", new ArrayList<>(zzfcjVar.zzg));
        bundleD.putStringArrayList("video_reward_urls", new ArrayList<>(zzfcjVar.zzh));
        bundleD.putStringArrayList("video_complete_urls", new ArrayList<>(zzfcjVar.zzi));
        bundleD.putString("transaction_id", zzfcjVar.zzj);
        bundleD.putString("valid_from_timestamp", zzfcjVar.zzk);
        bundleD.putBoolean("is_closable_area_disabled", zzfcjVar.zzP);
        bundleD.putString("recursive_server_response_data", zzfcjVar.zzao);
        bundleD.putBoolean("is_analytics_logging_enabled", zzfcjVar.zzW);
        zzbvt zzbvtVar = zzfcjVar.zzl;
        if (zzbvtVar != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("rb_amount", zzbvtVar.zzb);
            bundle3.putString("rb_type", zzbvtVar.zza);
            bundleD.putParcelableArray("rewards", new Bundle[]{bundle3});
        }
        bundle.putBundle("parent_ad_config", bundleD);
        return zzc(zzfdcVarZzz, bundle, zzfcjVar, zzfcuVar);
    }

    public abstract S1.y zzc(zzfdc zzfdcVar, Bundle bundle, zzfcj zzfcjVar, zzfcu zzfcuVar);
}
