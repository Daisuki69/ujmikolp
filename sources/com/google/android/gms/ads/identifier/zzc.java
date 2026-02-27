package com.google.android.gms.ads.identifier;

import android.util.Log;
import androidx.annotation.WorkerThread;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import mx_android.support.v7.media.MediaRouter;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc {
    @WorkerThread
    public static final void zza(String str) {
        try {
            try {
                zzi.zzb(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_UNSELECTED);
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                Callback.openConnection(uRLConnectionOpenConnection);
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    int responseCode = Callback.getResponseCode(httpURLConnection);
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
                        sb2.append("Received non-success response code ");
                        sb2.append(responseCode);
                        sb2.append(" from pinging URL: ");
                        sb2.append(str);
                        Log.w("HttpUrlPinger", sb2.toString());
                    }
                    zzi.zza();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                zzi.zza();
                throw th2;
            }
        } catch (IOException e) {
            e = e;
            String message = e.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb3.append("Error while pinging URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message);
            Log.w("HttpUrlPinger", sb3.toString(), e);
            zzi.zza();
        } catch (IndexOutOfBoundsException e7) {
            String message2 = e7.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb4.append("Error while parsing ping URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message2);
            Log.w("HttpUrlPinger", sb4.toString(), e7);
            zzi.zza();
        } catch (RuntimeException e10) {
            e = e10;
            String message3 = e.getMessage();
            StringBuilder sb32 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
            sb32.append("Error while pinging URL: ");
            sb32.append(str);
            sb32.append(". ");
            sb32.append(message3);
            Log.w("HttpUrlPinger", sb32.toString(), e);
            zzi.zza();
        }
    }
}
