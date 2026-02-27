package com.appsflyer.internal;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AFLogger;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import mx_android.support.v7.media.MediaRouteProviderProtocol;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class AFa1uSDK {
    private final AFb1rSDK AFKeystoreWrapper;
    private final AFe1iSDK valueOf;

    public interface AFa1ySDK {
        void AFInAppEventParameterName(String str);

        void AFInAppEventType(@Nullable String str, @Nullable String str2, @Nullable String str3);
    }

    public AFa1uSDK() {
    }

    public final HttpURLConnection AFInAppEventType(String str) {
        String strAFInAppEventParameterName;
        HttpURLConnection httpURLConnection;
        URL url;
        boolean z4 = false;
        AFe1iSDK aFe1iSDK = this.valueOf;
        String str2 = aFe1iSDK.afInfoLog;
        String string = AFa1mSDK.valueOf((Map<String, ?>) aFe1iSDK.values()).toString();
        boolean zAFVersionDeclaration = this.valueOf.AFVersionDeclaration();
        boolean zAfWarnLog = this.valueOf.afWarnLog();
        boolean zAfErrorLogForExcManagerOnly = this.valueOf.afErrorLogForExcManagerOnly();
        boolean zValueOf = this.valueOf.valueOf();
        strAFInAppEventParameterName = "";
        byte[] bytes = string.getBytes();
        HttpURLConnection httpURLConnection2 = null;
        if (zAFVersionDeclaration) {
            return null;
        }
        try {
            url = new URL(str2);
            if (zAfErrorLogForExcManagerOnly) {
                this.AFKeystoreWrapper.values(url.toString(), string);
                int length = string.getBytes("UTF-8").length;
                StringBuilder sb2 = new StringBuilder("call = ");
                sb2.append(url);
                sb2.append("; size = ");
                sb2.append(length);
                sb2.append(" byte");
                sb2.append(length > 1 ? CmcdData.Factory.STREAMING_FORMAT_SS : "");
                sb2.append("; body = ");
                sb2.append(string);
                AFc1vSDK.AFInAppEventType(sb2.toString());
            }
            TrafficStats.setThreadStatsTag(82339054);
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            Callback.openConnection(uRLConnection);
            httpURLConnection = (HttpURLConnection) uRLConnection;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, zValueOf ? "application/octet-stream" : "application/json");
            OutputStream outputStream = Callback.getOutputStream((URLConnection) httpURLConnection);
            if (zValueOf) {
                try {
                    try {
                        bytes = (byte[]) ((Class) AFa1vSDK.values(38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((Process.getThreadPriority(0) + 20) >> 6), View.resolveSizeAndState(0, 0, 0) + 37)).getDeclaredMethod("AFInAppEventParameterName", byte[].class).invoke(((Class) AFa1vSDK.values(36 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 36 - ExpandableListView.getPackedPositionChild(0L))).getMethod("AFKeystoreWrapper", String.class).invoke(null, str), bytes);
                    } catch (Throwable th3) {
                        Throwable cause = th3.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    Throwable cause2 = th4.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th4;
                }
            }
            outputStream.write(bytes);
            outputStream.close();
            Callback.connect((URLConnection) httpURLConnection);
            int responseCode = Callback.getResponseCode(httpURLConnection);
            strAFInAppEventParameterName = zAfWarnLog ? AFb1wSDK.AFInAppEventParameterName(httpURLConnection) : "";
            if (zAfErrorLogForExcManagerOnly) {
                this.AFKeystoreWrapper.valueOf(url.toString(), responseCode, strAFInAppEventParameterName);
            }
            if (responseCode == 200) {
                AFLogger.afInfoLog("Status 200 ok");
            } else {
                z4 = true;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection2 = httpURLConnection;
            AFLogger.afErrorLog("Error while calling ".concat(String.valueOf(str2)), th);
            z4 = true;
            httpURLConnection = httpURLConnection2;
        }
        StringBuilder sb3 = new StringBuilder("Connection ");
        sb3.append(z4 ? MediaRouteProviderProtocol.SERVICE_DATA_ERROR : "call succeeded");
        sb3.append(": ");
        sb3.append(strAFInAppEventParameterName);
        AFLogger.afInfoLog(sb3.toString());
        return httpURLConnection;
    }

    public AFa1uSDK(AFe1iSDK aFe1iSDK, AFb1rSDK aFb1rSDK) {
        this.valueOf = aFe1iSDK;
        this.AFKeystoreWrapper = aFb1rSDK;
    }
}
