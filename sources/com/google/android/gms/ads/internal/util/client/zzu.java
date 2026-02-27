package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import android.net.TrafficStats;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbtt;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import mx_android.support.v7.media.MediaRouter;

/* JADX INFO: loaded from: classes2.dex */
public final class zzu implements zze {
    private final Context zza;

    @Nullable
    private final String zzb;

    @Nullable
    private String zzc;

    public zzu(Context context, @Nullable String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final URL zzc(String str) throws MalformedURLException {
        URL urlZzd = null;
        try {
            urlZzd = new URI(str).toURL();
        } catch (IllegalArgumentException e) {
            e = e;
            zze(str, e);
        } catch (MalformedURLException e7) {
            e = e7;
            zze(str, e);
        } catch (URISyntaxException e10) {
            zze(str, e10);
            if (((Boolean) zzbd.zzc().zzd(zzbci.zze)).booleanValue()) {
                urlZzd = zzd(str);
            }
        }
        if (urlZzd != null) {
            return urlZzd;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 47);
        sb2.append("Falling back to direct new URL(\"");
        sb2.append(str);
        sb2.append("\") constructor.");
        zzo.zzd(sb2.toString());
        return new URL(str);
    }

    @Nullable
    private final URL zzd(String str) {
        URL url;
        URI uri;
        try {
            zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e) {
            e = e;
            url = null;
        }
        try {
            String string = uri.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 114 + string.length());
            sb2.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
            sb2.append(str);
            sb2.append("\" -> encoded URI: ");
            sb2.append(string);
            zzo.zzd(sb2.toString());
            return url;
        } catch (IllegalArgumentException e7) {
            e = e7;
            zze(str, e);
            return url;
        } catch (MalformedURLException e10) {
            e = e10;
            zze(str, e);
            return url;
        } catch (URISyntaxException e11) {
            e = e11;
            zze(str, e);
            return url;
        }
    }

    private final void zze(String str, Throwable th2) {
        String message = th2.getMessage();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
        sb2.append("Error while parsing ping URL: ");
        sb2.append(str);
        sb2.append(". ");
        sb2.append(message);
        zzo.zzi(sb2.toString());
        zzbtt.zza(this.zza).zzi(th2, "HttpUrlPinger.pingUrl", ((Integer) zzbd.zzc().zzd(zzbci.zznA)).intValue() / 100.0f);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    @WorkerThread
    public final zzt zza(String str) {
        zzt zztVar = zzt.PERMANENT_FAILURE;
        try {
            try {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.setThreadStatsTag(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_UNSELECTED);
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 13);
                sb2.append("Pinging URL: ");
                sb2.append(str);
                zzo.zzd(sb2.toString());
                URLConnection uRLConnectionOpenConnection = zzc(str).openConnection();
                Callback.openConnection(uRLConnectionOpenConnection);
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    zzbb.zza();
                    String str2 = this.zzb;
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(60000);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    zzl zzlVar = new zzl(null);
                    zzlVar.zza(httpURLConnection, null);
                    int responseCode = Callback.getResponseCode(httpURLConnection);
                    zzlVar.zzc(httpURLConnection, responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 54 + String.valueOf(str).length());
                        sb3.append("Received non-success response code ");
                        sb3.append(responseCode);
                        sb3.append(" from pinging URL: ");
                        sb3.append(str);
                        zzo.zzi(sb3.toString());
                        if (responseCode == 502) {
                            zztVar = zzt.RETRIABLE_FAILURE;
                        }
                    } else {
                        if (((Boolean) zzbd.zzc().zzd(zzbci.zziB)).booleanValue()) {
                            this.zzc = Callback.getHeaderField(httpURLConnection, "X-Afma-Ad-Event-Value");
                        }
                        zztVar = zzt.SUCCESS;
                    }
                    httpURLConnection.disconnect();
                    if (!ClientLibraryUtils.isPackageSide()) {
                        return zztVar;
                    }
                } catch (Throwable th2) {
                    httpURLConnection.disconnect();
                    throw th2;
                }
            } catch (Throwable th3) {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                }
                throw th3;
            }
        } catch (IndexOutOfBoundsException e) {
            e = e;
            zze(str, e);
            if (ClientLibraryUtils.isPackageSide()) {
            }
            return zztVar;
        } catch (MalformedURLException e7) {
            e = e7;
            zze(str, e);
            if (ClientLibraryUtils.isPackageSide()) {
            }
            return zztVar;
        } catch (IOException e10) {
            e = e10;
            String message = e.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb4.append("Error while pinging URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message);
            zzo.zzi(sb4.toString());
            zztVar = zzt.RETRIABLE_FAILURE;
            if (ClientLibraryUtils.isPackageSide()) {
            }
            return zztVar;
        } catch (RuntimeException e11) {
            e = e11;
            String message2 = e.getMessage();
            StringBuilder sb42 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
            sb42.append("Error while pinging URL: ");
            sb42.append(str);
            sb42.append(". ");
            sb42.append(message2);
            zzo.zzi(sb42.toString());
            zztVar = zzt.RETRIABLE_FAILURE;
            if (ClientLibraryUtils.isPackageSide()) {
            }
            return zztVar;
        }
        TrafficStats.clearThreadStatsTag();
        return zztVar;
    }

    @Nullable
    public final String zzb() {
        return this.zzc;
    }
}
