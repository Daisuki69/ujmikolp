package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzghs;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
    }

    public void set(@NonNull Map<String, String> map) {
        map.put(CmcdData.Factory.STREAMING_FORMAT_SS, "gmob_sdk");
        map.put("v", ExifInterface.GPS_MEASUREMENT_3D);
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzc();
        map.put("device", zzs.zzv());
        map.put("app", this.zzb);
        zzt.zzc();
        Context context = this.zza;
        boolean zZzI = zzs.zzI(context);
        String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        map.put("is_lite_sdk", true != zZzI ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        zzbbz zzbbzVar = zzbci.zza;
        List listZzf = zzbd.zzb().zzf();
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzhm)).booleanValue()) {
            listZzf.addAll(zzt.zzh().zzo().zzi().zzh());
        }
        map.put("e", TextUtils.join(",", listZzf));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzmf)).booleanValue()) {
            zzt.zzc();
            if (true != zzs.zzF(context)) {
                str = "0";
            }
            map.put("is_bstar", str);
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzkj)).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzcE)).booleanValue()) {
                map.put("plugin", zzghs.zza(zzt.zzh().zzu()));
            }
        }
    }
}
