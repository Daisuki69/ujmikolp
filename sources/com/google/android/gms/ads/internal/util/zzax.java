package com.google.android.gms.ads.internal.util;

import S1.y;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzdvr;
import com.google.android.gms.internal.ads.zzdvs;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzax {
    private zzdvs zzg;
    private final Object zzb = new Object();
    private String zzc = "";
    private String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;

    @VisibleForTesting
    protected String zza = "";

    @Nullable
    @VisibleForTesting
    public static final String zzo(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put(RtspHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str2));
        y yVarZzb = new zzbl(context).zzb(0, str, map, null);
        try {
            return (String) yVarZzb.get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfv)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String strValueOf = String.valueOf(str);
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Interrupted while retrieving a response from: ".concat(strValueOf), e);
            yVarZzb.cancel(true);
            return null;
        } catch (TimeoutException e7) {
            String strValueOf2 = String.valueOf(str);
            int i4 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Timeout while retrieving a response from: ".concat(strValueOf2), e7);
            yVarZzb.cancel(true);
            return null;
        } catch (Exception e10) {
            String strValueOf3 = String.valueOf(str);
            int i6 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving a response from: ".concat(strValueOf3), e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:12:0x0034, B:14:0x003c, B:16:0x0051, B:19:0x0063, B:11:0x002b, B:20:0x006a, B:21:0x006c), top: B:26:0x000b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.net.Uri zzp(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.Object r0 = r4.zzb
            monitor-enter(r0)
            java.lang.String r1 = r4.zzc     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L6a
            com.google.android.gms.ads.internal.zzt.zzc()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r5.openFileInput(r1)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            r3 = 1
            byte[] r1 = com.google.android.gms.common.util.IOUtils.readInputStreamFully(r1, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            goto L34
        L29:
            r5 = move-exception
            goto L81
        L2b:
            java.lang.String r1 = "Error reading from internal storage."
            int r2 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.ads.internal.util.client.zzo.zzd(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = ""
        L34:
            r4.zzc = r2     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L6a
            com.google.android.gms.ads.internal.zzt.zzc()     // Catch: java.lang.Throwable -> L29
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29
            r4.zzc = r1     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.ads.internal.zzt.zzc()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r4.zzc     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L62
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L62
            r5.write(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L62
            r5.close()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L62
            goto L6a
        L62:
            r5 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            int r2 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r1, r5)     // Catch: java.lang.Throwable -> L29
        L6a:
            java.lang.String r5 = r4.zzc     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "linkedDeviceId"
            r6.appendQueryParameter(r0, r5)
            java.lang.String r5 = "adSlotPath"
            r6.appendQueryParameter(r5, r7)
            java.lang.String r5 = "afmaVersion"
            r6.appendQueryParameter(r5, r8)
            android.net.Uri r5 = r6.build()
            return r5
        L81:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzax.zzp(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    public final void zza(zzdvs zzdvsVar) {
        this.zzg = zzdvsVar;
    }

    public final zzdvs zzb() {
        return this.zzg;
    }

    public final void zzc(Context context) {
        zzdvs zzdvsVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjX)).booleanValue() || (zzdvsVar = this.zzg) == null) {
            return;
        }
        zzdvsVar.zzo(new zzau(this, context), zzdvr.DEBUG_MENU);
    }

    @VisibleForTesting
    public final boolean zzd(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfs), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strZzo.trim());
            String strOptString = jSONObject.optString("gct");
            this.zza = jSONObject.optString("status");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjX)).booleanValue()) {
                boolean z4 = "0".equals(this.zza) || ExifInterface.GPS_MEASUREMENT_2D.equals(this.zza);
                zzj(z4);
                zzg zzgVarZzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                if (!z4) {
                    str = "";
                }
                zzgVarZzo.zzM(str);
            }
            synchronized (this.zzb) {
                this.zzd = strOptString;
            }
            return true;
        } catch (JSONException e) {
            int i4 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to get in app preview response json.", e);
            return false;
        }
    }

    public final boolean zze(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzft), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(new JSONObject(strZzo.trim()).optString("debug_mode"));
            zzj(zEquals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjX)).booleanValue()) {
                zzg zzgVarZzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                if (true != zEquals) {
                    str = "";
                }
                zzgVarZzo.zzM(str);
            }
            return zEquals;
        } catch (JSONException e) {
            int i4 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final void zzf(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzZ(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfr), str, str2));
    }

    public final boolean zzg(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Sending troubleshooting signals to the server.");
        zzh(context, str, str2, str3);
        return true;
    }

    public final void zzh(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = zzp(context, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfu), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzP(context, str, builderBuildUpon.build().toString());
    }

    public final String zzi() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzj(boolean z4) {
        synchronized (this.zzb) {
            try {
                this.zzf = z4;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjX)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzo().zzK(z4);
                    zzdvs zzdvsVar = this.zzg;
                    if (zzdvsVar != null) {
                        zzdvsVar.zzb(z4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzk() {
        boolean z4;
        synchronized (this.zzb) {
            z4 = this.zzf;
        }
        return z4;
    }

    public final void zzl(boolean z4) {
        synchronized (this.zzb) {
            this.zze = z4;
        }
    }

    public final boolean zzm() {
        boolean z4;
        synchronized (this.zzb) {
            z4 = this.zze;
        }
        return z4;
    }

    @VisibleForTesting
    public final void zzn(Context context, String str, boolean z4, boolean z5) {
        if (context instanceof Activity) {
            zzs.zza.post(new zzaw(this, context, str, z4, z5));
        } else {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
        }
    }
}
