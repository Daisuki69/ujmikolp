package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzbcx {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbcx(boolean z4, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbcu zzf() {
        return new zzbcu(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
    }

    public final void zza(@Nullable zzbcx zzbcxVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbcu zzbcuVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbcu(j, strArr[0], zzbcuVar));
        }
        return true;
    }

    public final zzbcw zzc() {
        zzbcw zzbcwVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            try {
                List<zzbcu> list = this.zza;
                for (zzbcu zzbcuVar : list) {
                    long jZza = zzbcuVar.zza();
                    String strZzb = zzbcuVar.zzb();
                    zzbcu zzbcuVarZzc = zzbcuVar.zzc();
                    if (zzbcuVarZzc != null && jZza > 0) {
                        long jZza2 = jZza - zzbcuVarZzc.zza();
                        sb2.append(strZzb);
                        sb2.append('.');
                        sb2.append(jZza2);
                        sb2.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(zzbcuVarZzc.zza()))) {
                                StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(zzbcuVarZzc.zza()));
                                sb3.append('+');
                                sb3.append(strZzb);
                            } else {
                                map.put(Long.valueOf(zzbcuVarZzc.zza()), new StringBuilder(strZzb));
                            }
                        }
                    }
                }
                list.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb2.append((String) null);
                } else if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                StringBuilder sb4 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb4.append((CharSequence) entry.getValue());
                        sb4.append('.');
                        sb4.append(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
                        sb4.append(',');
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    string = sb4.toString();
                }
                zzbcwVar = new zzbcw(sb2.toString(), string);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbcwVar;
    }

    public final void zzd(String str, String str2) {
        zzbcn zzbcnVarZza;
        if (TextUtils.isEmpty(str2) || (zzbcnVarZza = com.google.android.gms.ads.internal.zzt.zzh().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbct zzbctVarZzd = zzbcnVarZza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzbctVarZzd.zza((String) map.get(str), str2));
        }
    }

    @VisibleForTesting
    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzh().zza();
            map = this.zzb;
        }
        return map;
    }
}
