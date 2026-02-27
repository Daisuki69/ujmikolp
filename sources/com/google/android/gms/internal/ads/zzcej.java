package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.media3.datasource.cache.CacheDataSink;
import com.dynatrace.android.agent.Global;
import dOYHB6.lN8Dz0.d8NVX3;
import dOYHB6.lN8Dz0.wGEE15;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcej extends WebChromeClient {
    private final zzcek zza;

    public zzcej(zzcek zzcekVar) {
        this.zza = zzcekVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcek)) {
            return webView.getContext();
        }
        zzcek zzcekVar = (zzcek) webView;
        Activity activityZzj = zzcekVar.zzj();
        return activityZzj != null ? activityZzj : zzcekVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcek)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = ((zzcek) webView).zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzb();
        } else {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(strMessage).length();
        StringBuilder sb2 = new StringBuilder(We.s.b(length + 6 + String.valueOf(strSourceId).length(), 1, String.valueOf(iLineNumber).length(), 1));
        androidx.media3.datasource.cache.c.A(sb2, "JS: ", strMessage, " (", strSourceId);
        String strM = androidx.media3.datasource.cache.c.m(sb2, Global.COLON, iLineNumber, ")");
        if (strM.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzcei.zza[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(strM);
        } else if (i == 2) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strM);
        } else if (i == 3 || i == 4 || i != 5) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(strM);
        } else {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(strM);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z5, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        wGEE15 wgee15 = new wGEE15(webView.getContext());
        zzcek zzcekVar = this.zza;
        if (zzcekVar.zzQ() != null) {
            wgee15.setWebViewClient(zzcekVar.zzQ());
        }
        webViewTransport.setWebView(wgee15);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j6, long j7, WebStorage.QuotaUpdater quotaUpdater) {
        long j9 = CacheDataSink.DEFAULT_FRAGMENT_SIZE - j7;
        if (j9 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j6 > j9 || j6 > 1048576) {
                j6 = 0;
            }
        } else if (j6 == 0) {
            j6 = Math.min(Math.min(131072L, j9) + j, 1048576L);
        } else {
            if (j6 <= Math.min(1048576 - j, j9)) {
                j += j6;
            }
            j6 = j;
        }
        quotaUpdater.updateQuota(j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r6, android.webkit.GeolocationPermissions.Callback r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L59
            com.google.android.gms.internal.ads.zzcek r0 = r5.zza
            com.google.android.gms.ads.internal.zzt.zzc()
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = com.google.android.gms.ads.internal.util.zzs.zzE(r1, r2)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L24
            com.google.android.gms.ads.internal.zzt.zzc()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzE(r0, r1)
            if (r0 == 0) goto L26
        L24:
            r0 = r3
            goto L27
        L26:
            r0 = r2
        L27:
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zznZ
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r4.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3d
            r7.invoke(r6, r2, r3)
            goto L40
        L3d:
            r7.invoke(r6, r0, r3)
        L40:
            com.google.android.gms.internal.ads.zzbbz r6 = com.google.android.gms.internal.ads.zzbci.zzoa
            com.google.android.gms.internal.ads.zzbcg r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r6 = r7.zzd(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L59
            int r6 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r6 = "AdWebChromeClient.onGeolocationPermissionsShowPrompt()"
            com.google.android.gms.ads.internal.util.client.zzo.zzd(r6)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcej.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = this.zza.zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzc();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get ad overlay when hiding custom view.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = this.zza.zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzx(view, customViewCallback);
            zzlVarZzL.zzw(i);
        } else {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        }
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z4) {
        zzcek zzcekVar;
        com.google.android.gms.ads.internal.zzb zzbVarZzh;
        try {
            zzcekVar = this.zza;
        } catch (WindowManager.BadTokenException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to display Dialog.", e);
        }
        if (zzcekVar != null && zzcekVar.zzP() != null && zzcekVar.zzP().zzh() != null && (zzbVarZzh = zzcekVar.zzP().zzh()) != null && !zzbVarZzh.zzb()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
            sb2.append("window.");
            sb2.append(str);
            sb2.append("('");
            sb2.append(str3);
            sb2.append("')");
            zzbVarZzh.zzc(sb2.toString());
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzO = com.google.android.gms.ads.internal.util.zzs.zzO(context);
        builderZzO.setTitle(str2);
        if (z4) {
            d8NVX3 d8nvx3 = new d8NVX3(context);
            d8nvx3.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            d8nvx3.addView(textView);
            d8nvx3.addView(editText);
            builderZzO.setView(d8nvx3).setPositiveButton(R.string.ok, new zzceh(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzceg(jsPromptResult)).setOnCancelListener(new zzcef(jsPromptResult)).create().show();
        } else {
            builderZzO.setMessage(str3).setPositiveButton(R.string.ok, new zzcee(jsResult)).setNegativeButton(R.string.cancel, new zzced(jsResult)).setOnCancelListener(new zzcec(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
