package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import androidx.webkit.ProxyConfig;
import com.dynatrace.android.callback.Callback;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqi extends zzapv {
    public zzaqi() {
        throw null;
    }

    @VisibleForTesting
    public static List zzb(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzaoz((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final zzaqf zza(zzaph zzaphVar, Map map) throws Throwable {
        String strZzh = zzaphVar.zzh();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(zzaphVar.zzm());
        URL url = new URL(strZzh);
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int iZzo = zzaphVar.zzo();
        httpURLConnection.setConnectTimeout(iZzo);
        httpURLConnection.setReadTimeout(iZzo);
        boolean z4 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        ProxyConfig.MATCH_HTTPS.equals(url.getProtocol());
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            if (zzaphVar.zza() != 0) {
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                byte[] bArrZzn = zzaphVar.zzn();
                if (bArrZzn != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey(RtspHeaders.CONTENT_TYPE)) {
                        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(Callback.getOutputStream(httpURLConnection));
                    dataOutputStream.write(bArrZzn);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
            }
            int responseCode = Callback.getResponseCode(httpURLConnection);
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            zzaphVar.zza();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                zzaqf zzaqfVar = new zzaqf(responseCode, zzb(Callback.getHeaderFields(httpURLConnection)), -1, null);
                httpURLConnection.disconnect();
                return zzaqfVar;
            }
            try {
                return new zzaqf(responseCode, zzb(Callback.getHeaderFields(httpURLConnection)), Callback.getContentLength(httpURLConnection), new zzaqg(httpURLConnection));
            } catch (Throwable th2) {
                th = th2;
                z4 = true;
                if (!z4) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public zzaqi(zzaqh zzaqhVar, SSLSocketFactory sSLSocketFactory) {
    }
}
