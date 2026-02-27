package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdyo {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcgv zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfdc zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfib zzi;
    private final zzdsg zzj;
    private final zzfjv zzk;
    private final zzcyw zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;

    @Nullable
    private Bundle zzp;
    private final zzbvd zzq;

    public zzdyo(zzcgv zzcgvVar, Context context, VersionInfoParcel versionInfoParcel, zzfdc zzfdcVar, Executor executor, String str, zzfib zzfibVar, zzdsg zzdsgVar, zzbvd zzbvdVar, zzeau zzeauVar, ScheduledExecutorService scheduledExecutorService, zzfjv zzfjvVar, zzcyw zzcywVar) {
        this.zzb = zzcgvVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfdcVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfibVar;
        zzcgvVar.zzz();
        this.zzj = zzdsgVar;
        this.zzq = zzbvdVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfjvVar;
        this.zzl = zzcywVar;
    }

    private final S1.y zzg(@Nullable String str, final String str2) {
        S1.y yVarZza;
        String str3;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return zzgot.zzc(new zzeho(15, "Invalid ad string."));
        }
        Context context = this.zzc;
        zzfhr zzfhrVarA = s.a(context, 11);
        zzfhrVarA.zza();
        zzbod zzbodVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(context, this.zzd, this.zzb.zzv());
        zzbnx zzbnxVar = zzboa.zza;
        final zzbnt zzbntVarZza = zzbodVarZzb.zza("google.afma.response.normalize", zzbnxVar, zzbnxVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhz)).booleanValue()) {
            try {
                str3 = str;
            } catch (JSONException unused) {
                str3 = str;
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                this.zzn = jSONObject.optString("fetch_url", "");
                this.zzo = com.google.android.gms.ads.internal.util.zzbp.zza(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
            } catch (JSONException unused2) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid ad response.");
            }
            String string = this.zzn;
            final List list = this.zzo;
            if (TextUtils.isEmpty(string)) {
                yVarZza = zzgot.zza(str3);
                this.zzj.zzd("sst", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            } else {
                this.zzj.zzd("sst", ExifInterface.GPS_MEASUREMENT_2D);
                String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhB);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhA)).booleanValue()) {
                    List listZze = zzghq.zzb(zza).zze(string);
                    if (listZze.size() < 2) {
                        yVarZza = zzgot.zzc(new zzeho(1, "Invalid fetch URL."));
                    } else {
                        str4 = (String) listZze.get(1);
                        com.google.android.gms.ads.internal.zzt.zzc();
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        final zzear zzearVar = new zzear(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                        yVarZza = (zzgol) zzgot.zzh((zzgol) zzgot.zzi(zzgol.zzw(zzbzh.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyl
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzd(zzearVar);
                            }
                        })), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhC)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdym
                            @Override // com.google.android.gms.internal.ads.zzgob
                            public final /* synthetic */ S1.y zza(Object obj) {
                                return this.zza.zze(list, (Exception) obj);
                            }
                        }, this.zzf);
                    }
                } else {
                    final zzear zzearVar2 = new zzear(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                    yVarZza = (zzgol) zzgot.zzh((zzgol) zzgot.zzi(zzgol.zzw(zzbzh.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyl
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.zza.zzd(zzearVar2);
                        }
                    })), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhC)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdym
                        @Override // com.google.android.gms.internal.ads.zzgob
                        public final /* synthetic */ S1.y zza(Object obj) {
                            return this.zza.zze(list, (Exception) obj);
                        }
                    }, this.zzf);
                }
            }
        } else {
            yVarZza = zzgot.zza(str);
            this.zzj.zzd("sst", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        zzgob zzgobVar = new zzgob(this) { // from class: com.google.android.gms.internal.ads.zzdyn
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) throws JSONException {
                String str6 = (String) obj;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String str7 = str2;
                try {
                    jSONObject4.put("headers", new JSONObject());
                    jSONObject4.put(TtmlNode.TAG_BODY, str6);
                    jSONObject3.put("base_url", "");
                    jSONObject3.put("signals", new JSONObject(str7));
                    jSONObject2.put("request", jSONObject3);
                    jSONObject2.put("response", jSONObject4);
                    jSONObject2.put("flags", new JSONObject());
                    return zzgot.zza(jSONObject2);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        };
        Executor executor = this.zzf;
        S1.y yVarZzj = zzgot.zzj(zzgot.zzj(zzgot.zzj(yVarZza, zzgobVar, executor), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdyj
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzb(zzbntVarZza, (JSONObject) obj);
            }
        }, executor), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdyk
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzc((JSONObject) obj);
            }
        }, executor);
        zzfia.zzd(yVarZzj, this.zzi, zzfhrVarA);
        zzgot.zzq(yVarZzj, new zzdyi(this), zzbzh.zzg);
        return yVarZzj;
    }

    private final void zzh(zzdru zzdruVar) {
        Bundle bundleZze = this.zzj.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhE)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(bundleZze, zzdruVar.zza());
        }
    }

    private final String zzi(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String strConcat = "Failed to update the ad types for rendering. ".concat(e.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
            return str;
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01e8 A[Catch: all -> 0x00dc, TryCatch #5 {all -> 0x00dc, blocks: (B:21:0x0078, B:23:0x0096, B:25:0x009e, B:27:0x00ab, B:29:0x00c5, B:33:0x00f5, B:36:0x0101, B:38:0x0109, B:40:0x010f, B:44:0x0118, B:55:0x0152, B:47:0x012c, B:54:0x013d, B:57:0x0157, B:32:0x00df, B:58:0x016b, B:65:0x0188, B:68:0x0190, B:72:0x01b2, B:74:0x01c7, B:78:0x01e8, B:80:0x01fd, B:83:0x0211, B:85:0x0217, B:86:0x0224, B:88:0x0226, B:91:0x022f, B:90:0x022c, B:79:0x01f2, B:75:0x01da, B:71:0x019e, B:62:0x0178, B:63:0x017d), top: B:123:0x0078, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f2 A[Catch: all -> 0x00dc, TryCatch #5 {all -> 0x00dc, blocks: (B:21:0x0078, B:23:0x0096, B:25:0x009e, B:27:0x00ab, B:29:0x00c5, B:33:0x00f5, B:36:0x0101, B:38:0x0109, B:40:0x010f, B:44:0x0118, B:55:0x0152, B:47:0x012c, B:54:0x013d, B:57:0x0157, B:32:0x00df, B:58:0x016b, B:65:0x0188, B:68:0x0190, B:72:0x01b2, B:74:0x01c7, B:78:0x01e8, B:80:0x01fd, B:83:0x0211, B:85:0x0217, B:86:0x0224, B:88:0x0226, B:91:0x022f, B:90:0x022c, B:79:0x01f2, B:75:0x01da, B:71:0x019e, B:62:0x0178, B:63:0x017d), top: B:123:0x0078, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022c A[Catch: all -> 0x00dc, TryCatch #5 {all -> 0x00dc, blocks: (B:21:0x0078, B:23:0x0096, B:25:0x009e, B:27:0x00ab, B:29:0x00c5, B:33:0x00f5, B:36:0x0101, B:38:0x0109, B:40:0x010f, B:44:0x0118, B:55:0x0152, B:47:0x012c, B:54:0x013d, B:57:0x0157, B:32:0x00df, B:58:0x016b, B:65:0x0188, B:68:0x0190, B:72:0x01b2, B:74:0x01c7, B:78:0x01e8, B:80:0x01fd, B:83:0x0211, B:85:0x0217, B:86:0x0224, B:88:0x0226, B:91:0x022f, B:90:0x022c, B:79:0x01f2, B:75:0x01da, B:71:0x019e, B:62:0x0178, B:63:0x017d), top: B:123:0x0078, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final S1.y zza() {
        /*
            Method dump skipped, instruction units count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyo.zza():S1.y");
    }

    public final /* synthetic */ S1.y zzb(zzbnt zzbntVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzct)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(this.zzj.zze(), zzdru.SCAR_PRELOADER_PROCESSING_DONE.zza());
        }
        return zzbntVar.zzb(jSONObject);
    }

    public final /* synthetic */ S1.y zzc(JSONObject jSONObject) {
        zzfcr zzfcrVar = new zzfcr(this.zze);
        String string = jSONObject.toString();
        return zzgot.zza(new zzfcu(zzfcrVar, zzfct.zza(new StringReader(string), this.zzp)));
    }

    public final /* synthetic */ String zzd(zzear zzearVar) throws zzeho {
        zzh(zzdru.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i4 = -1;
        while (true) {
            try {
                if (i >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhD)).intValue()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 40);
                    sb2.append("Received HTTP error code from ad server:");
                    sb2.append(i4);
                    throw new zzeho(1, sb2.toString());
                }
                zzeas zzeasVarZzb = new zzeat(this.zzc, this.zzd.afmaVersion, this.zzq, Binder.getCallingUid()).zza(zzearVar);
                int i6 = zzeasVarZzb.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhE)).booleanValue()) {
                    this.zzj.zzd("fr", String.valueOf(i));
                }
                if (i6 == 200) {
                    zzh(zzdru.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzeasVarZzb.zzc;
                }
                i++;
                i4 = i6;
            } catch (Exception e) {
                throw new zzeho(1, e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
            }
        }
    }

    public final /* synthetic */ S1.y zze(List list, Exception exc) {
        zzeho zzehoVar;
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzehoVar = new zzeho(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzeho) {
            zzehoVar = (zzeho) exc;
        } else {
            zzehoVar = new zzeho(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzehoVar.getMessage() == null ? "" : zzehoVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List listZze = zzghq.zza(zzggo.zzc(':')).zze(message);
                    if (listZze.size() == 2) {
                        message = (String) listZze.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfjr.zzd(zzfjr.zzd((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return zzgot.zzc(zzehoVar);
    }

    public final /* synthetic */ zzcyw zzf() {
        return this.zzl;
    }
}
