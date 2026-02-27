package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemo implements zzeun {
    final zzfdc zza;
    private final long zzb;

    public zzemo(zzfdc zzfdcVar, long j) {
        this.zza = zzfdcVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        zzfdc zzfdcVar = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfdcVar.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", zzfdcVar.zzg);
        int i = zzfdcVar.zzp.zza;
        if (i == 0) {
            throw null;
        }
        int i4 = i - 1;
        if (i4 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i4 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.zzb);
        zzfdr.zzd(bundle, "is_sdk_preload", true, zzmVar.zzc());
        zzfdr.zzb(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j = zzmVar.zzb;
        zzfdr.zzb(bundle, "cust_age", simpleDateFormat.format(new Date(j)), j != -1);
        zzfdr.zzf(bundle, "extras", zzmVar.zzc);
        int i6 = zzmVar.zzd;
        zzfdr.zzc(bundle, "cust_gender", i6, i6 != -1);
        zzfdr.zzg(bundle, "kw", zzmVar.zze);
        int i10 = zzmVar.zzg;
        zzfdr.zzc(bundle, "tag_for_child_directed_treatment", i10, i10 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i11 = zzmVar.zza;
        zzfdr.zzc(bundle, "d_imp_hdr", 1, i11 >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        zzfdr.zzb(bundle, "ppid", str, i11 >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        zzfdr.zze(bundle, ImagesContract.URL, zzmVar.zzl);
        zzfdr.zzg(bundle, "neighboring_content_urls", zzmVar.zzv);
        zzfdr.zzf(bundle, "custom_targeting", zzmVar.zzn);
        zzfdr.zzg(bundle, "category_exclusions", zzmVar.zzo);
        zzfdr.zze(bundle, "request_agent", zzmVar.zzp);
        zzfdr.zze(bundle, "request_pkg", zzmVar.zzq);
        zzfdr.zzd(bundle, "is_designed_for_families", zzmVar.zzr, i11 >= 7);
        if (i11 >= 8) {
            int i12 = zzmVar.zzt;
            zzfdr.zzc(bundle, "tag_for_under_age_of_consent", i12, i12 != -1);
            zzfdr.zze(bundle, "max_ad_content_rating", zzmVar.zzu);
        }
        Bundle bundle3 = zzfdcVar.zze;
        zzfdr.zzh(bundle, "plcs", Integer.valueOf(bundle3.getInt("plcs")));
        zzfdr.zzh(bundle, "plbs", Integer.valueOf(bundle3.getInt("plbs")));
        zzfdr.zze(bundle, "plid", bundle3.getString("plid"));
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuu) obj).zzb;
        zzfdc zzfdcVar = this.zza;
        bundle.putString("slotname", zzfdcVar.zzg);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfdcVar.zzd;
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        int i = zzmVar.zzg;
        zzfdr.zzc(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (zzmVar.zza >= 8) {
            int i4 = zzmVar.zzt;
            zzfdr.zzc(bundle, "tag_for_under_age_of_consent", i4, i4 != -1);
        }
        zzfdr.zze(bundle, ImagesContract.URL, zzmVar.zzl);
        zzfdr.zzg(bundle, "neighboring_content_urls", zzmVar.zzv);
        Bundle bundle2 = zzmVar.zzc;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhZ)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        zzfdr.zzf(bundle, "extras", bundle3);
    }
}
