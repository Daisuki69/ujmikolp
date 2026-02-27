package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeaw implements zzfgm {
    private static final Pattern zzd = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zza;
    private final zzfhr zzb;
    private final zzfib zzc;

    public zzeaw(String str, zzfib zzfibVar, zzfhr zzfhrVar) {
        this.zza = str;
        this.zzc = zzfibVar;
        this.zzb = zzfhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgm
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdwz zzdwzVar;
        String strJoin;
        byte[] bArr;
        JSONObject jSONObjectZza;
        String strConcat;
        zzeav zzeavVar = (zzeav) obj;
        int iOptInt = zzeavVar.zza().optInt("http_timeout_millis", 60000);
        zzbux zzbuxVarZzb = zzeavVar.zzb();
        if (zzbuxVarZzb.zza() != -2) {
            if (zzbuxVarZzb.zza() == 1) {
                if (zzbuxVarZzb.zzb() != null) {
                    strJoin = TextUtils.join(", ", zzbuxVarZzb.zzb());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strJoin);
                } else {
                    strJoin = "";
                }
                zzdwzVar = new zzdwz(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdwzVar = new zzdwz(1);
            }
            zzfib zzfibVar = this.zzc;
            zzfhr zzfhrVar = this.zzb;
            zzfhrVar.zzj(zzdwzVar);
            zzfhrVar.zzd(false);
            zzfibVar.zza(zzfhrVar);
            throw zzdwzVar;
        }
        HashMap map = new HashMap();
        if (zzeavVar.zzb().zzg()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbe)).booleanValue()) {
                    if (TextUtils.isEmpty(str)) {
                        strConcat = "";
                    } else {
                        Matcher matcher = zzd.matcher(str);
                        strConcat = "";
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            if (strGroup != null) {
                                Locale locale = Locale.ROOT;
                                if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(strConcat)) {
                                        strConcat = strConcat.concat("; ");
                                    }
                                    strConcat = strConcat.concat(strGroup);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str);
                }
            }
        }
        if (zzeavVar.zzb().zzf() && (jSONObjectZza = zzeavVar.zza()) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObjectZza.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        byte[] byteArray = new byte[0];
        if (TextUtils.isEmpty(zzeavVar.zzb().zzd())) {
            bArr = byteArray;
        } else {
            byte[] bytes = zzeavVar.zzb().zzd().getBytes(StandardCharsets.UTF_8);
            if (zzeavVar.zzb().zzm()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } finally {
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("gzip compression failed, sending uncompressed.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PrepareRequestFunction.apply");
                    byteArray = null;
                }
                if (byteArray != null) {
                    map.put(RtspHeaders.CONTENT_ENCODING, "gzip");
                    bArr = byteArray;
                }
            }
            bArr = bytes;
        }
        String strZzl = !TextUtils.isEmpty(zzeavVar.zzb().zzl()) ? zzeavVar.zzb().zzl() : "";
        zzfib zzfibVar2 = this.zzc;
        zzfhr zzfhrVar2 = this.zzb;
        zzfhrVar2.zzd(true);
        zzfibVar2.zza(zzfhrVar2);
        return new zzear(zzeavVar.zzb().zze(), iOptInt, map, bArr, strZzl, zzeavVar.zzb().zzf());
    }
}
