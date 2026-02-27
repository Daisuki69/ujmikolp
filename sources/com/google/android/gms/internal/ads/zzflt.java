package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzflt implements WebViewCompat.WebMessageListener {
    final /* synthetic */ zzflv zza;

    public zzflt(zzflv zzflvVar) {
        Objects.requireNonNull(zzflvVar);
        this.zza = zzflvVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z4, JavaScriptReplyProxy javaScriptReplyProxy) {
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.getData());
            String string = jSONObject.getString(Constants.METHOD);
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                zzflg.zza.getClass();
            }
        } catch (JSONException e) {
            zzfne.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
