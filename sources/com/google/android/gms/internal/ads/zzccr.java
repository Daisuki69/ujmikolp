package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccr implements zzbjl {
    @Nullable
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            String strP = androidx.camera.core.impl.a.p(new StringBuilder(str.length() + 39 + String.valueOf(str2).length()), "Precache invalid numeric parameter '", str, "': ", str2);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strP);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzccq zzcctVar;
        int i;
        zzcbd zzcbdVar = (zzcbd) obj;
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzccj zzccjVarZzB = com.google.android.gms.ads.internal.zzt.zzB();
        if (map.containsKey("abort")) {
            if (zzccjVarZzB.zza(zzcbdVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcbc zzcbcVar = new zzcbc((String) map.get("flags"));
        boolean z4 = zzcbcVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzcci zzcciVarZzb = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    i = 0;
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        try {
                            strArr2[i4] = jSONArray.getString(i4);
                        } catch (JSONException unused) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for precache: ".concat(str2));
                            strArr = null;
                        }
                    }
                    strArr = strArr2;
                } catch (JSONException unused2) {
                    i = 0;
                }
            } else {
                i = 0;
            }
            if (strArr == null) {
                strArr = new String[1];
                strArr[i] = str;
            }
            if (z4) {
                Iterator it = zzccjVarZzB.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zzcci zzcciVar = (zzcci) it.next();
                    if (zzcciVar.zza == zzcbdVar && str.equals(zzcciVar.zzd())) {
                        zzcciVarZzb = zzcciVar;
                        break;
                    }
                }
            } else {
                zzcciVarZzb = zzccjVarZzB.zzb(zzcbdVar);
            }
            if (zzcciVarZzb != null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache task is already running.");
                return;
            }
            if (zzcbdVar.zzk() == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = Integer.valueOf(i);
            }
            if (numZzb != null) {
                zzcbdVar.zzo(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzcbdVar.zzA(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzcbdVar.zzB(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzcca zzccaVar = zzcbdVar.zzk().zzb;
            if (iIntValue > 0) {
                int i6 = zzcbcVar.zzg;
                int iZzQ = zzcau.zzQ();
                if (iZzQ < i6) {
                    zzcctVar = new zzccz(zzcbdVar, zzcbcVar);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzp)).booleanValue()) {
                        iZzQ = zzccw.zzr();
                    }
                    zzcctVar = iZzQ < zzcbcVar.zzb ? new zzccw(zzcbdVar, zzcbcVar) : new zzccu(zzcbdVar);
                }
            } else {
                zzcctVar = new zzcct(zzcbdVar);
            }
            new zzcci(zzcbdVar, zzcctVar, str, strArr).zzb();
        } else {
            zzcci zzcciVarZzb2 = zzccjVarZzB.zzb(zzcbdVar);
            if (zzcciVarZzb2 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache must specify a source.");
                return;
            }
            zzcctVar = zzcciVarZzb2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzcctVar.zzi(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzcctVar.zzh(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzcctVar.zzj(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzcctVar.zzk(numZzb8.intValue());
        }
    }
}
