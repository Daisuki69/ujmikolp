package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.VisibleForTesting;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbbn;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
@VisibleForTesting
final class zzcfn extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcek {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcfq zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbfj zzE;
    private zzbfg zzF;
    private zzazv zzG;
    private int zzH;
    private int zzI;
    private zzbcu zzJ;
    private final zzbcu zzK;
    private zzbcu zzL;
    private final zzbcv zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzl zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzci zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbbh zzY;
    private boolean zzZ;
    private final zzcgl zzb;
    private final zzauu zzc;
    private final zzfdg zzd;
    private final zzbdp zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfcj zzk;
    private zzfcm zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcev zzo;
    private com.google.android.gms.ads.internal.overlay.zzl zzp;
    private zzedu zzq;
    private zzeds zzr;
    private zzcgt zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    @VisibleForTesting
    public zzcfn(zzcgl zzcglVar, zzcgt zzcgtVar, String str, boolean z4, boolean z5, zzauu zzauuVar, zzbdp zzbdpVar, VersionInfoParcel versionInfoParcel, zzbcx zzbcxVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbbh zzbbhVar, zzfcj zzfcjVar, zzfcm zzfcmVar, zzfdg zzfdgVar) {
        zzfcm zzfcmVar2;
        super(zzcglVar);
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzcglVar;
        this.zzs = zzcgtVar;
        this.zzt = str;
        this.zzw = z4;
        this.zzc = zzauuVar;
        this.zzd = zzfdgVar;
        this.zze = zzbdpVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzx = com.google.android.gms.ads.internal.util.zzs.zzx(windowManager);
        this.zzi = displayMetricsZzx;
        this.zzj = displayMetricsZzx.density;
        this.zzY = zzbbhVar;
        this.zzk = zzfcjVar;
        this.zzl = zzfcmVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzci(zzcglVar.zzb(), this, this, null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzms)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmr)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznY)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzc().zze(zzcglVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzr(getContext(), settings);
        setDownloadListener(this);
        zzbc();
        addJavascriptInterface(new zzcfv(this, new zzcfu() { // from class: com.google.android.gms.internal.ads.zzcft
            @Override // com.google.android.gms.internal.ads.zzcfu
            public final /* synthetic */ void zza(Uri uri) {
                zzcev zzcevVarZzaS = ((zzcfn) this).zzaS();
                if (zzcevVarZzaS != null) {
                    zzcevVarZzaS.zzO(uri);
                } else {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                }
            }
        }), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbh();
        zzbcv zzbcvVar = new zzbcv(new zzbcx(true, "make_wv", this.zzt));
        this.zzM = zzbcvVar;
        zzbcvVar.zzc().zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue() && (zzfcmVar2 = this.zzl) != null && zzfcmVar2.zzb != null) {
            zzbcvVar.zzc().zzd("gqi", this.zzl.zzb);
        }
        zzbcvVar.zzc();
        zzbcu zzbcuVarZzf = zzbcx.zzf();
        this.zzK = zzbcuVarZzf;
        zzbcvVar.zza("native:view_create", zzbcuVarZzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcglVar);
        com.google.android.gms.ads.internal.zzt.zzh().zzj();
    }

    private final synchronized void zzaZ(String str) {
        final String str2 = "about:blank";
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcfk
                private final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaW(this.zzb);
                }
            });
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "AdWebViewImpl.loadUrlUnsafe");
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl in destroy(). ", th2);
        }
    }

    private final synchronized void zzba() {
        Boolean boolZzc = com.google.android.gms.ads.internal.zzt.zzh().zzc();
        this.zzy = boolZzc;
        if (boolZzc == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    private final void zzbb() {
        zzbcp.zza(this.zzM.zzc(), this.zzK, "aeh2");
    }

    private final synchronized void zzbc() {
        zzfcj zzfcjVar = this.zzk;
        if (zzfcjVar != null && zzfcjVar.zzam) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Disabling hardware acceleration on an overlay.");
            zzbd();
            return;
        }
        if (!this.zzw && !this.zzs.zzg()) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbd() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, null);
            }
            this.zzx = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzbf() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzh().zzk();
    }

    private final synchronized void zzbg() {
        try {
            Map map = this.zzW;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzccq) it.next()).release();
                }
            }
            this.zzW = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void zzbh() {
        zzbcv zzbcvVar = this.zzM;
        if (zzbcvVar == null) {
            return;
        }
        zzbcx zzbcxVarZzc = zzbcvVar.zzc();
        zzbcn zzbcnVarZza = com.google.android.gms.ads.internal.zzt.zzh().zza();
        if (zzbcnVarZza != null) {
            zzbcnVarZza.zzb(zzbcxVarZzc);
        }
    }

    private final void zzbi(boolean z4) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z4 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        zze("onAdVisibilityChanged", map);
    }

    public final boolean __replaced_14533_3_onTouchEvent(MotionEvent motionEvent) {
        boolean z4 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdV)).booleanValue() && this.zzo.zzm();
        if ((!this.zzo.zzl() || this.zzo.zzn()) && !z4) {
            zzauu zzauuVar = this.zzc;
            if (zzauuVar != null) {
                zzauuVar.zzc(motionEvent);
            }
            zzbdp zzbdpVar = this.zze;
            if (zzbdpVar != null) {
                zzbdpVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbfj zzbfjVar = this.zzE;
                    if (zzbfjVar != null) {
                        zzbfjVar.zzb(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final synchronized void destroy() {
        try {
            zzbh();
            this.zzQ.zzc();
            com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzp;
            if (zzlVar != null) {
                zzlVar.zzb();
                this.zzp.zzq();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzF();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzB().zza(this);
            zzbg();
            this.zzv = true;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlC)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzY();
                return;
            }
            Activity activityZzb = this.zzb.zzb();
            if (activityZzb != null && activityZzb.isDestroyed()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzY();
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
                zzaZ("about:blank");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzX()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlD)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzbzh.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaU(str, valueCallback);
                }
            });
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzF();
                        com.google.android.gms.ads.internal.zzt.zzB().zza(this);
                        zzbg();
                        zzbf();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzX()) {
            super.loadData(str, str2, str3);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (!zzX()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                    return;
                } else {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        throw th;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final synchronized void loadUrl(final String str) {
        if (zzX()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaV(str);
                }
            });
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "AdWebViewImpl.loadUrl");
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl. ", th2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!zzX()) {
                this.zzQ.zzd();
            }
            if (this.zzZ) {
                onResume();
                this.zzZ = false;
            }
            boolean z4 = this.zzC;
            zzcev zzcevVar = this.zzo;
            if (zzcevVar != null && zzcevVar.zzl()) {
                if (!this.zzD) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = true;
                }
                zzaM();
                z4 = true;
            }
            zzbi(z4);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcev zzcevVar;
        synchronized (this) {
            try {
                if (!zzX()) {
                    this.zzQ.zze();
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzcevVar = this.zzo) != null && zzcevVar.zzl() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzbi(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlR)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzY(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            String strP = androidx.camera.core.impl.a.p(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()), "Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(strP);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (zzX()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zZzaM = zzaM();
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = zzL();
        if (zzlVarZzL == null || !zZzaM) {
            return;
        }
        zzlVarZzL.zzC();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfn.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzns)).booleanValue() && WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Muting webview");
                WebViewCompat.setAudioMuted(this, true);
            }
        } catch (Exception e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not pause webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznv)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzns)).booleanValue() && WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unmuting webview");
                WebViewCompat.setAudioMuted(this, false);
            }
        } catch (Exception e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not resume webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznv)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewImpl.onResume");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return __replaced_14533_3_onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcev) {
            this.zzo = (zzcev) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzA(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzceb
    public final zzfcj zzC() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcgf
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final List zzF() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzG() {
        zzbb();
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzH(int i) {
        if (i == 0) {
            zzbcv zzbcvVar = this.zzM;
            zzbcp.zza(zzbcvVar.zzc(), this.zzK, "aebb2");
        }
        zzbb();
        zzbcv zzbcvVar2 = this.zzM;
        zzbcvVar2.zzc();
        zzbcvVar2.zzc().zzd("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.zzf.afmaVersion);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzI() {
        if (this.zzJ == null) {
            zzbcv zzbcvVar = this.zzM;
            zzbcp.zza(zzbcvVar.zzc(), this.zzK, "aes2");
            zzbcvVar.zzc();
            zzbcu zzbcuVarZzf = zzbcx.zzf();
            this.zzJ = zzbcuVarZzf;
            zzbcvVar.zza("native:view_show", zzbcuVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zze("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzJ() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzd()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzb()));
        map.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzaa.zze(getContext())));
        zze(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, map);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final Context zzK() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcgc
    public final synchronized zzcgt zzN() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized String zzO() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final /* synthetic */ zzcgi zzP() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final WebViewClient zzQ() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzR() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcgd
    public final zzauu zzS() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final zzfdg zzT() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized zzedu zzU() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized zzeds zzV() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzW() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzX() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzY() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbf();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfi(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzZ() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zza(String str) {
        zzaP(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean zzaA(final boolean z4, final int i) {
        destroy();
        zzbbg zzbbgVar = new zzbbg() { // from class: com.google.android.gms.internal.ads.zzcfl
            @Override // com.google.android.gms.internal.ads.zzbbg
            public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar) {
                int i4 = zzcfn.zza;
                zzbbn.zzbl.zza zzaVarZzq = zzbbn.zzbl.zzq();
                boolean zZzb = zzaVarZzq.zzb();
                boolean z5 = z4;
                if (zZzb != z5) {
                    zzaVarZzq.zzc(z5);
                }
                zzaVarZzq.zzg(i);
                zzaVar.zzal(zzaVarZzq.zzbu());
            }
        };
        zzbbh zzbbhVar = this.zzY;
        zzbbhVar.zzb(zzbbgVar);
        zzbbhVar.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcfr
    public final zzfcm zzaC() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaD(zzfcj zzfcjVar, zzfcm zzfcmVar) {
        this.zzk = zzfcjVar;
        this.zzl = zzfcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzaE(boolean z4) {
        if (z4) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzp;
        if (zzlVar != null) {
            zzlVar.zzu(z4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final S1.y zzaF() {
        zzbdp zzbdpVar = this.zze;
        return zzbdpVar == null ? zzgot.zza(null) : zzbdpVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaG(boolean z4) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z4, boolean z5, String str) {
        this.zzo.zzv(zzcVar, z4, z5, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaI(boolean z4, int i, boolean z5) {
        this.zzo.zzx(z4, i, z5);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaJ(boolean z4, int i, String str, boolean z5, boolean z8) {
        this.zzo.zzy(z4, i, str, z5, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaK(boolean z4, int i, String str, String str2, boolean z5) {
        this.zzo.zzz(z4, i, str, str2, z5);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaL(String str, String str2, int i) {
        this.zzo.zzw(str, str2, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r10.zzV != r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzaM() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzcev r0 = r10.zzo
            boolean r0 = r0.zzk()
            r1 = 0
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzcev r0 = r10.zzo
            boolean r0 = r0.zzl()
            if (r0 == 0) goto L86
        L11:
            com.google.android.gms.ads.internal.client.zzbb.zza()
            android.util.DisplayMetrics r0 = r10.zzi
            int r2 = r0.widthPixels
            int r4 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            com.google.android.gms.ads.internal.client.zzbb.zza()
            int r2 = r0.heightPixels
            int r5 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            com.google.android.gms.internal.ads.zzcgl r2 = r10.zzb
            android.app.Activity r2 = r2.zzb()
            r3 = 1
            if (r2 == 0) goto L50
            android.view.Window r6 = r2.getWindow()
            if (r6 != 0) goto L35
            goto L50
        L35:
            com.google.android.gms.ads.internal.zzt.zzc()
            int[] r2 = com.google.android.gms.ads.internal.util.zzs.zzV(r2)
            com.google.android.gms.ads.internal.client.zzbb.zza()
            r6 = r2[r1]
            int r6 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r6)
            com.google.android.gms.ads.internal.client.zzbb.zza()
            r2 = r2[r3]
            int r2 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            r7 = r2
            goto L52
        L50:
            r6 = r4
            r7 = r5
        L52:
            com.google.android.gms.ads.internal.zzt.zzc()
            android.view.WindowManager r2 = r10.zzX
            android.view.Display r2 = r2.getDefaultDisplay()
            int r9 = r2.getRotation()
            int r2 = r10.zzS
            if (r2 != r4) goto L87
            int r2 = r10.zzR
            if (r2 != r5) goto L87
            int r2 = r10.zzT
            if (r2 != r6) goto L87
            int r2 = r10.zzU
            if (r2 != r7) goto L87
            com.google.android.gms.internal.ads.zzbbz r2 = com.google.android.gms.internal.ads.zzbci.zzak
            com.google.android.gms.internal.ads.zzbcg r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r8.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L86
            int r2 = r10.zzV
            if (r2 == r9) goto L86
            goto L87
        L86:
            return r1
        L87:
            int r2 = r10.zzS
            if (r2 != r4) goto La5
            int r2 = r10.zzR
            if (r2 != r5) goto La5
            com.google.android.gms.internal.ads.zzbbz r2 = com.google.android.gms.internal.ads.zzbci.zzak
            com.google.android.gms.internal.ads.zzbcg r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r8.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto La6
            int r2 = r10.zzV
            if (r2 == r9) goto La6
        La5:
            r1 = r3
        La6:
            r10.zzS = r4
            r10.zzR = r5
            r10.zzT = r6
            r10.zzU = r7
            r10.zzV = r9
            com.google.android.gms.internal.ads.zzbsb r3 = new com.google.android.gms.internal.ads.zzbsb
            java.lang.String r2 = ""
            r3.<init>(r10, r2)
            float r8 = r0.density
            r3.zzl(r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfn.zzaM():boolean");
    }

    public final synchronized void zzaN(String str) {
        if (!zzX()) {
            loadUrl(str);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void zzaO(String str, ValueCallback valueCallback) {
        if (!zzX()) {
            evaluateJavascript(str, null);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaP(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaN("javascript:".concat(str));
            return;
        }
        if (zzaR() == null) {
            zzba();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN("javascript:".concat(str));
        }
    }

    @VisibleForTesting
    public final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzb(bool);
    }

    @VisibleForTesting
    public final synchronized Boolean zzaR() {
        return this.zzy;
    }

    public final zzcev zzaS() {
        return this.zzo;
    }

    public final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    public final /* synthetic */ void zzaW(String str) {
        super.loadUrl("about:blank");
    }

    public final /* synthetic */ int zzaX() {
        return this.zzI;
    }

    public final /* synthetic */ void zzaY(int i) {
        this.zzI = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzaa() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzab(String str, zzbjl zzbjlVar) {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzB(str, zzbjlVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzac(String str, zzbjl zzbjlVar) {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzC(str, zzbjlVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzad(String str, Predicate predicate) {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzE(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzae(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzp = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzaf(zzcgt zzcgtVar) {
        this.zzs = zzcgtVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzag(boolean z4) {
        try {
            boolean z5 = this.zzw;
            this.zzw = z4;
            zzbc();
            if (z4 != z5) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzai)).booleanValue()) {
                    if (!this.zzs.zzg()) {
                    }
                }
                new zzbsb(this, "").zzk(true != z4 ? "default" : "expanded");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzah() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzai(Context context) {
        zzcgl zzcglVar = this.zzb;
        zzcglVar.setBaseContext(context);
        this.zzQ.zza(zzcglVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzaj(boolean z4) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzp;
        if (zzlVar != null) {
            zzlVar.zzt(this.zzo.zzk(), z4);
        } else {
            this.zzu = z4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzak(zzedu zzeduVar) {
        this.zzq = zzeduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzal(zzeds zzedsVar) {
        this.zzr = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzam(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzp;
        if (zzlVar != null) {
            zzlVar.zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzan(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzO = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzao(boolean z4) {
        this.zzz = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzap() {
        if (this.zzL == null) {
            zzbcv zzbcvVar = this.zzM;
            zzbcvVar.zzc();
            zzbcu zzbcuVarZzf = zzbcx.zzf();
            this.zzL = zzbcuVarZzf;
            zzbcvVar.zza("native:view_load", zzbcuVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzaq(zzbfj zzbfjVar) {
        this.zzE = zzbfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized zzbfj zzar() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzas(boolean z4) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.zzH + (true != z4 ? -1 : 1);
        this.zzH = i;
        if (i > 0 || (zzlVar = this.zzp) == null) {
            return;
        }
        zzlVar.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzat() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzau(String str, String str2, String str3) throws Throwable {
        Throwable th2;
        String str4;
        try {
            try {
                if (zzX()) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzah);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (JSONException e) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to build MRAID_ENV", e);
                    str4 = null;
                }
                super.loadDataWithBaseURL(str, zzcgb.zza(str2, str4), "text/html", "UTF-8", null);
                return;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzav() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaw(boolean z4) {
        this.zzo.zzM(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzax(zzbfg zzbfgVar) {
        this.zzF = zzbfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzay(zzazv zzazvVar) {
        this.zzG = zzazvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized zzazv zzaz() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zzc(String str, String str2) {
        zzaP(androidx.camera.core.impl.a.p(new StringBuilder(androidx.media3.datasource.cache.c.b(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbX = We.s.x("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbX.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(string));
        zzaP(sbX.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzdV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzdo(zzayh zzayhVar) {
        boolean z4;
        synchronized (this) {
            z4 = zzayhVar.zzj;
            this.zzC = z4;
        }
        zzbi(z4);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdp() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdp();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdq() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final zzcas zzdr() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzds(boolean z4) {
        this.zzo.zzK(false);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzdz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zze(String str, Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzbb.zza().zzk(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final synchronized zzcfq zzh() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final zzbcu zzi() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcfw, com.google.android.gms.internal.ads.zzcbd
    public final Activity zzj() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized String zzm() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized String zzn() {
        zzfcm zzfcmVar = this.zzl;
        if (zzfcmVar == null) {
            return null;
        }
        return zzfcmVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzo(int i) {
        this.zzN = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized int zzp() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final zzbcv zzq() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized zzccq zzr(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzccq) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbd
    public final VersionInfoParcel zzs() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzt(String str, zzccq zzccqVar) {
        try {
            if (this.zzW == null) {
                this.zzW = new HashMap();
            }
            this.zzW.put(str, zzccqVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzu(boolean z4, long j) {
        HashMap map = new HashMap(2);
        map.put("success", true != z4 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        map.put("duration", Long.toString(j));
        zze("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzv(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzw(zzcfq zzcfqVar) {
        if (this.zzB == null) {
            this.zzB = zzcfqVar;
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final int zzy() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzz() {
        zzbfg zzbfgVar = this.zzF;
        if (zzbfgVar != null) {
            zzbfgVar.zza();
        }
    }
}
