package com.google.android.gms.internal.consent_sdk;

import L1.a;
import L1.d;
import L1.e;
import L1.f;
import L1.h;
import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.callback.Callback;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzw {
    private final Application zza;
    private final Handler zzb;
    private final Executor zzc;
    private final zzaq zzd;
    private final zzbo zze;
    private final zzn zzf;
    private final zzz zzg;
    private final zze zzh;

    public zzw(Application application, zzad zzadVar, Handler handler, Executor executor, zzaq zzaqVar, zzbo zzboVar, zzn zznVar, zzz zzzVar, zze zzeVar) {
        this.zza = application;
        this.zzb = handler;
        this.zzc = executor;
        this.zzd = zzaqVar;
        this.zze = zzboVar;
        this.zzf = zznVar;
        this.zzg = zzzVar;
        this.zzh = zzeVar;
    }

    public static void zza(final zzw zzwVar, Activity activity, h hVar, final e eVar, final d dVar) throws Exception {
        try {
            a aVar = hVar.f2804b;
            if (aVar == null || !aVar.f2798a) {
                Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zzcm.zza(zzwVar.zza) + "\") to set this as a debug device.");
            }
            final zzab zzabVarZza = new zzy(zzwVar.zzg, zzwVar.zzd(zzwVar.zzf.zzc(activity, hVar))).zza();
            zzaq zzaqVar = zzwVar.zzd;
            zzaqVar.zzg(zzabVarZza.zza);
            zzaqVar.zzi(zzabVarZza.zzb);
            zzwVar.zze.zzd(zzabVarZza.zzc);
            zzwVar.zzh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    zzw.zzb(this.zza, eVar, zzabVarZza);
                }
            });
        } catch (zzg e) {
            zzwVar.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
                @Override // java.lang.Runnable
                public final void run() {
                    dVar.onConsentInfoUpdateFailure(e.zza());
                }
            });
        } catch (RuntimeException e7) {
            final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e7))));
            zzwVar.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    dVar.onConsentInfoUpdateFailure(zzgVar.zza());
                }
            });
        }
    }

    public static /* synthetic */ void zzb(zzw zzwVar, final e eVar, zzab zzabVar) {
        Objects.requireNonNull(eVar);
        zzwVar.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
            @Override // java.lang.Runnable
            public final void run() {
                eVar.onConsentInfoUpdateSuccess();
            }
        });
        if (zzabVar.zzb != f.f2801b) {
            zzwVar.zze.zzc();
        }
    }

    @WorkerThread
    private final zzcl zzd(zzcj zzcjVar) throws Exception {
        try {
            URLConnection uRLConnectionOpenConnection = new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
            httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(Callback.getOutputStream(httpURLConnection), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = zzcjVar.zza;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    zzcf zzcfVar = zzcjVar.zzb;
                    if (zzcfVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = zzcfVar.zzc;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i4 = i - 1;
                            if (i4 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i4 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = zzcfVar.zza;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = zzcfVar.zzb;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = zzcjVar.zzc;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = zzcjVar.zzd;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = zzcjVar.zze;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    zzch zzchVar = zzcjVar.zzf;
                    if (zzchVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = zzchVar.zza;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = zzchVar.zzb;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d10 = zzchVar.zzc;
                        if (d10 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d10);
                        }
                        List<zzcg> list = zzchVar.zzd;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (zzcg zzcgVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zzcgVar.zza;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zzcgVar.zzb;
                                if (num5 != null) {
                                    jsonWriter.name(TtmlNode.LEFT);
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zzcgVar.zzc;
                                if (num6 != null) {
                                    jsonWriter.name(TtmlNode.RIGHT);
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zzcgVar.zzd;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    zzcd zzcdVar = zzcjVar.zzg;
                    if (zzcdVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = zzcdVar.zza;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = zzcdVar.zzb;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = zzcdVar.zzc;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    zzci zzciVar = zzcjVar.zzh;
                    if (zzciVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str7 = zzciVar.zza;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = zzcjVar.zzi;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch ((zzce) it.next()) {
                                case DEBUG_PARAM_UNKNOWN:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case ALWAYS_SHOW:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case GEO_OVERRIDE_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case GEO_OVERRIDE_REGULATED_US_STATE:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case GEO_OVERRIDE_OTHER:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case GEO_OVERRIDE_NON_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case PREVIEWING_DEBUG_MESSAGES:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = Callback.getResponseCode(httpURLConnection);
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(Callback.getErrorStream(httpURLConnection)).useDelimiter("\\A").next());
                    }
                    String headerField = Callback.getHeaderField(httpURLConnection, "x-ump-using-header");
                    if (headerField != null) {
                        zzcl zzclVarZza = zzcl.zza(new JsonReader(new StringReader(headerField)));
                        zzclVarZza.zza = new Scanner(Callback.getInputStream(httpURLConnection)).useDelimiter("\\A").next();
                        return zzclVarZza;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Callback.getInputStream(httpURLConnection), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            zzcl zzclVarZza2 = zzcl.zza(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return zzclVarZza2;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } finally {
                }
            } catch (Throwable th4) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (SocketTimeoutException e) {
            throw new zzg(4, "The server timed out.", e);
        } catch (IOException e7) {
            throw new zzg(2, "Error making request.", e7);
        }
    }

    public final void zzc(@Nullable final Activity activity, final h hVar, final e eVar, final d dVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzv
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                zzw.zza(this.zza, activity, hVar, eVar, dVar);
            }
        });
    }
}
