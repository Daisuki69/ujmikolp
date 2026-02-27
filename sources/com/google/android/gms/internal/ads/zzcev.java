package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class zzcev extends WebViewClient implements zzcgi {
    public static final /* synthetic */ int zzc = 0;

    @Nullable
    private zzdsm zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;

    @Nullable
    private final zzecy zzG;
    private View.OnAttachStateChangeListener zzH;
    protected final zzcek zza;

    @Nullable
    protected zzbxf zzb;

    @Nullable
    private final zzbbh zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzq zzh;
    private zzcgg zzi;
    private zzcgh zzj;
    private zzbib zzk;
    private zzbid zzl;
    private zzddz zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzac zzw;

    @Nullable
    private zzbsa zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbrv zzz = null;
    private final HashSet zzF = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgg)).split(",")));

    @VisibleForTesting
    public zzcev(zzcek zzcekVar, @Nullable zzbbh zzbbhVar, boolean z4, zzbsa zzbsaVar, @Nullable zzbrv zzbrvVar, @Nullable zzecy zzecyVar) {
        this.zzd = zzbbhVar;
        this.zza = zzcekVar;
        this.zzs = z4;
        this.zzx = zzbsaVar;
        this.zzG = zzecyVar;
    }

    private final void zzaa(final View view, final zzbxf zzbxfVar, final int i) {
        if (!zzbxfVar.zzc() || i <= 0) {
            return;
        }
        zzbxfVar.zzd(view);
        if (zzbxfVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcet
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzS(view, zzbxfVar, i);
                }
            }, 100L);
        }
    }

    private final void zzab() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzH;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    @Nullable
    private static WebResourceResponse zzac() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaZ)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010d, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.zzt.zzc();
        r1 = com.dynatrace.android.callback.Callback.getContentType(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011b, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011f, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0121, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0123, code lost:
    
        r15 = r1.split(com.dynatrace.android.agent.Global.SEMICOLON)[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012e, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        r1 = com.dynatrace.android.callback.Callback.getContentType(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0139, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013b, code lost:
    
        r16 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013e, code lost:
    
        r1 = r1.split(com.dynatrace.android.agent.Global.SEMICOLON);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0143, code lost:
    
        if (r1.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0146, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0148, code lost:
    
        if (r2 >= r1.length) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0156, code lost:
    
        if (r1[r2].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0158, code lost:
    
        r3 = r1[r2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0165, code lost:
    
        if (r3.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0167, code lost:
    
        r5 = r3[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016e, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0170, code lost:
    
        r0 = com.dynatrace.android.callback.Callback.getHeaderFields(r13);
        r1 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0189, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018b, code lost:
    
        r2 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0195, code lost:
    
        if (r2.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019b, code lost:
    
        if (r2.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a7, code lost:
    
        if (r2.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a9, code lost:
    
        r1.put(r2.getKey(), r2.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bf, code lost:
    
        r9 = com.google.android.gms.ads.internal.zzt.zzf().zzc(r15, r16, com.dynatrace.android.callback.Callback.getResponseCode(r13), com.dynatrace.android.callback.Callback.getResponseMessage(r13), r1, com.dynatrace.android.callback.Callback.getInputStream(r13));
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse zzad(java.lang.String r22, java.util.Map r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcev.zzad(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzY(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbjl) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzW(boolean z4, long j) {
        this.zza.zzu(z4, j);
    }

    private static final boolean zzag(zzcek zzcekVar) {
        return zzcekVar.zzC() != null && zzcekVar.zzC().zzb();
    }

    private static final boolean zzah(boolean z4, zzcek zzcekVar) {
        return (!z4 || zzcekVar.zzN().zzg() || zzcekVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzO(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            try {
                zzcek zzcekVar = this.zza;
                if (zzcekVar.zzX()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                    zzcekVar.zzY();
                    return;
                }
                this.zzB = true;
                zzcgh zzcghVar = this.zzj;
                if (zzcghVar != null) {
                    zzcghVar.zza();
                    this.zzj = null;
                }
                zzu();
                zzcek zzcekVar2 = this.zza;
                if (zzcekVar2.zzL() != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmJ)).booleanValue()) {
                        zzcekVar2.zzL().zzz(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzJ(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZzd = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZzd.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZzd.getHost())) {
            zzO(uriZzd);
        } else {
            if (this.zzn && webView == this.zza.zzD()) {
                String scheme = uriZzd.getScheme();
                if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbxf zzbxfVar = this.zzb;
                        if (zzbxfVar != null) {
                            zzbxfVar.zzb(str);
                        }
                        this.zzg = null;
                    }
                    zzddz zzddzVar = this.zzm;
                    if (zzddzVar != null) {
                        zzddzVar.zzdz();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzcek zzcekVar = this.zza;
            if (zzcekVar.zzD().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzauu zzauuVarZzS = zzcekVar.zzS();
                    zzfdg zzfdgVarZzT = zzcekVar.zzT();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmN)).booleanValue() || zzfdgVarZzT == null) {
                        if (zzauuVarZzS != null && zzauuVarZzS.zza(uriZzd)) {
                            uriZzd = zzauuVarZzS.zzd(uriZzd, zzcekVar.getContext(), (View) zzcekVar, zzcekVar.zzj());
                        }
                    } else if (zzauuVarZzS != null && zzauuVarZzS.zza(uriZzd)) {
                        uriZzd = zzfdgVarZzT.zza(uriZzd, zzcekVar.getContext(), (View) zzcekVar, zzcekVar.zzj());
                    }
                } catch (zzauv unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzb()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZzd.toString(), null, null, null, null, null, null);
                    zzcek zzcekVar2 = this.zza;
                    zzv(zzcVar, true, false, zzcekVar2 != null ? zzcekVar2.zzn() : "");
                } else {
                    zzbVar.zzc(str);
                }
            }
        }
        return true;
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbrv zzbrvVar = this.zzz;
        boolean zZzd = zzbrvVar != null ? zzbrvVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zza.getContext(), adOverlayInfoParcel, !zZzd, this.zzA);
        zzbxf zzbxfVar = this.zzb;
        if (zzbxfVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbxfVar.zzb(str);
        }
    }

    public final void zzB(String str, zzbjl zzbjlVar) {
        synchronized (this.zzf) {
            try {
                HashMap map = this.zze;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(zzbjlVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzC(String str, zzbjl zzbjlVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbjlVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzE(String str, Predicate predicate) {
        synchronized (this.zzf) {
            try {
                List<zzbjl> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzbjl zzbjlVar : list) {
                    if (predicate.apply(zzbjlVar)) {
                        arrayList.add(zzbjlVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzF() {
        zzbxf zzbxfVar = this.zzb;
        if (zzbxfVar != null) {
            zzbxfVar.zzf();
            this.zzb = null;
        }
        zzab();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbrv zzbrvVar = this.zzz;
                if (zzbrvVar != null) {
                    zzbrvVar.zzb(true);
                    this.zzz = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzG(zzcgg zzcggVar) {
        this.zzi = zzcggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzH(zzcgh zzcghVar) {
        this.zzj = zzcghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final zzdsm zzI() {
        return this.zzA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02e3 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01c8, B:50:0x017c, B:97:0x02cd, B:100:0x02dd, B:102:0x02e3, B:104:0x02f1, B:86:0x024b, B:87:0x027e, B:85:0x0219, B:49:0x014b, B:32:0x00db, B:88:0x027f, B:90:0x0289, B:92:0x028f, B:94:0x02c2), top: B:112:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020e A[Catch: all -> 0x01bb, TryCatch #12 {all -> 0x01bb, blocks: (B:71:0x01a0, B:73:0x01b2, B:77:0x01be, B:81:0x01fc, B:83:0x020e, B:84:0x0215), top: B:111:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cd A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01c8, B:50:0x017c, B:97:0x02cd, B:100:0x02dd, B:102:0x02e3, B:104:0x02f1, B:86:0x024b, B:87:0x027e, B:85:0x0219, B:49:0x014b, B:32:0x00db, B:88:0x027f, B:90:0x0289, B:92:0x028f, B:94:0x02c2), top: B:112:0x000c }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse zzJ(java.lang.String r21, java.util.Map r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcev.zzJ(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void zzK(boolean z4) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzL() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcer
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcek zzcekVar = this.zza.zza;
                    zzcekVar.zzah();
                    com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = zzcekVar.zzL();
                    if (zzlVarZzL != null) {
                        zzlVarZzL.zzv();
                    }
                }
            });
        }
    }

    public final void zzM(boolean z4) {
        this.zzE = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzN(int i, int i4) {
        zzbrv zzbrvVar = this.zzz;
        if (zzbrvVar != null) {
            zzbrvVar.zze(i, i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzO(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhf)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zza() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzces
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    int i = zzcev.zzc;
                    com.google.android.gms.ads.internal.zzt.zzh().zza().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgf)).booleanValue() && this.zzF.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgh)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgot.zzq(com.google.android.gms.ads.internal.zzt.zzc().zzf(uri), new zzcem(this, list, path, uri), zzbzh.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzY(com.google.android.gms.ads.internal.util.zzs.zzU(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzP(boolean z4) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzQ(boolean z4) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzR(boolean z4) {
        synchronized (this.zzf) {
            this.zzv = z4;
        }
    }

    public final /* synthetic */ void zzS(View view, zzbxf zzbxfVar, int i) {
        zzaa(view, zzbxfVar, i - 1);
    }

    public final /* synthetic */ void zzT(boolean z4, long j) {
        zzW(true, j);
    }

    public final /* synthetic */ void zzX(View view, zzbxf zzbxfVar, int i) {
        zzaa(view, zzbxfVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzZ(@Nullable com.google.android.gms.ads.internal.client.zza zzaVar, @Nullable zzbib zzbibVar, @Nullable com.google.android.gms.ads.internal.overlay.zzq zzqVar, @Nullable zzbid zzbidVar, @Nullable com.google.android.gms.ads.internal.overlay.zzac zzacVar, boolean z4, @Nullable zzbjo zzbjoVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbsc zzbscVar, @Nullable zzbxf zzbxfVar, @Nullable zzecn zzecnVar, @Nullable zzfjv zzfjvVar, @Nullable zzdsm zzdsmVar, @Nullable zzbkg zzbkgVar, @Nullable zzddz zzddzVar, @Nullable zzbkf zzbkfVar, @Nullable zzbjz zzbjzVar, @Nullable zzbjm zzbjmVar, @Nullable zzcmi zzcmiVar, @Nullable zzdtp zzdtpVar, @Nullable zzcur zzcurVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zza.getContext(), zzbxfVar, null) : zzbVar;
        zzcek zzcekVar = this.zza;
        this.zzz = new zzbrv(zzcekVar, zzbscVar);
        this.zzb = zzbxfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbg)).booleanValue()) {
            zzB("/adMetadata", new zzbia(zzbibVar));
        }
        if (zzbidVar != null) {
            zzB("/appEvent", new zzbic(zzbidVar));
        }
        zzB("/backButton", zzbjk.zzj);
        zzB("/refresh", zzbjk.zzk);
        zzB("/canOpenApp", zzbjk.zzb);
        zzB("/canOpenURLs", zzbjk.zza);
        zzB("/canOpenIntents", zzbjk.zzc);
        zzB("/close", zzbjk.zzd);
        zzB("/customClose", zzbjk.zze);
        zzB("/instrument", zzbjk.zzn);
        zzB("/delayPageLoaded", zzbjk.zzp);
        zzB("/delayPageClosed", zzbjk.zzq);
        zzB("/getLocationInfo", zzbjk.zzr);
        zzB("/log", zzbjk.zzg);
        zzB("/mraid", new zzbjs(zzbVar2, this.zzz, zzbscVar));
        zzbsa zzbsaVar = this.zzx;
        if (zzbsaVar != null) {
            zzB("/mraidLoaded", zzbsaVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbjy(zzbVar3, this.zzz, zzecnVar, zzdsmVar, zzcmiVar, zzcurVar));
        zzB("/precache", new zzccr());
        zzB("/touch", zzbjk.zzi);
        zzB("/video", zzbjk.zzl);
        zzB("/videoMeta", zzbjk.zzm);
        if (zzecnVar == null || zzfjvVar == null) {
            zzB("/click", zzbjk.zzb(zzddzVar, zzcmiVar));
            zzB("/httpTrack", zzbjk.zzf);
        } else {
            zzB("/click", zzfdn.zza(zzecnVar, zzfjvVar, zzcmiVar, zzddzVar));
            zzB("/httpTrack", zzfdn.zzb(zzecnVar, zzfjvVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcekVar.getContext())) {
            Map map = new HashMap();
            if (zzcekVar.zzC() != null) {
                map = zzcekVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbjr(zzcekVar.getContext(), map));
        }
        if (zzbjoVar != null) {
            zzB("/setInterstitialProperties", new zzbjn(zzbjoVar));
        }
        if (zzbkgVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbkgVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkb)).booleanValue() && zzbkfVar != null) {
            zzB("/shareSheet", zzbkfVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzio)).booleanValue() && zzdtpVar != null) {
            zzB("/onDeviceStorageEvent", new zzbjt(zzdtpVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkg)).booleanValue() && zzbjzVar != null) {
            zzB("/inspectorOutOfContextTest", zzbjzVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkl)).booleanValue() && zzbjmVar != null) {
            zzB("/inspectorStorage", zzbjmVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmo)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbjk.zzu);
            zzB("/presentPlayStoreOverlay", zzbjk.zzv);
            zzB("/expandPlayStoreOverlay", zzbjk.zzw);
            zzB("/collapsePlayStoreOverlay", zzbjk.zzx);
            zzB("/closePlayStoreOverlay", zzbjk.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdI)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbjk.zzA);
            zzB("/resetPAID", zzbjk.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmI)).booleanValue() && zzcekVar.zzC() != null && zzcekVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbjk.zzB);
            zzB("/clearLocalStorageKeys", zzbjk.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzqVar;
        this.zzk = zzbibVar;
        this.zzl = zzbidVar;
        this.zzw = zzacVar;
        this.zzy = zzbVar3;
        this.zzm = zzddzVar;
        this.zzA = zzdsmVar;
        this.zzn = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zza(int i, int i4, boolean z4) {
        zzbsa zzbsaVar = this.zzx;
        if (zzbsaVar != null) {
            zzbsaVar.zzb(i, i4);
        }
        zzbrv zzbrvVar = this.zzz;
        if (zzbrvVar != null) {
            zzbrvVar.zzc(i, i4, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzb(zzfcj zzfcjVar) {
        zzcek zzcekVar = this.zza;
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcekVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbjr(zzcekVar.getContext(), zzfcjVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzc(zzcmi zzcmiVar) {
        zzD("/click");
        zzB("/click", zzbjk.zzb(this.zzm, zzcmiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzd(zzcmi zzcmiVar, @Nullable zzecn zzecnVar, @Nullable zzfjv zzfjvVar) {
        zzD("/click");
        if (zzecnVar == null || zzfjvVar == null) {
            zzB("/click", zzbjk.zzb(this.zzm, zzcmiVar));
        } else {
            zzB("/click", zzfdn.zza(zzecnVar, zzfjvVar, zzcmiVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
        zzddz zzddzVar = this.zzm;
        if (zzddzVar != null) {
            zzddzVar.zzdV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        zzddz zzddzVar = this.zzm;
        if (zzddzVar != null) {
            zzddzVar.zzdz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zze(zzcmi zzcmiVar, @Nullable zzecn zzecnVar, @Nullable zzdsm zzdsmVar) {
        zzD("/open");
        zzB("/open", new zzbjy(this.zzy, this.zzz, zzecnVar, zzdsmVar, zzcmiVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final com.google.android.gms.ads.internal.zzb zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzi(@Nullable com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzj(zzbxf zzbxfVar) {
        this.zzb = zzbxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final boolean zzk() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzs;
        }
        return z4;
    }

    public final boolean zzl() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzt;
        }
        return z4;
    }

    public final boolean zzm() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzu;
        }
        return z4;
    }

    public final boolean zzn() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzv;
        }
        return z4;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzq() {
        zzbxf zzbxfVar = this.zzb;
        if (zzbxfVar != null) {
            zzcek zzcekVar = this.zza;
            WebView webViewZzD = zzcekVar.zzD();
            if (ViewCompat.isAttachedToWindow(webViewZzD)) {
                zzaa(webViewZzD, zzbxfVar, 10);
                return;
            }
            zzab();
            zzcel zzcelVar = new zzcel(this, zzbxfVar);
            this.zzH = zzcelVar;
            ((View) zzcekVar).addOnAttachStateChangeListener(zzcelVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzD++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzs() {
        this.zzD--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzt() {
        zzbbh zzbbhVar = this.zzd;
        if (zzbbhVar != null) {
            zzbbhVar.zzc(10005);
        }
        this.zzC = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzB && this.zzD <= 0) || this.zzC || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue()) {
                zzcek zzcekVar = this.zza;
                if (zzcekVar.zzq() != null) {
                    zzbcp.zza(zzcekVar.zzq().zzc(), zzcekVar.zzi(), "awfllc");
                }
            }
            zzcgg zzcggVar = this.zzi;
            boolean z4 = false;
            if (!this.zzC && !this.zzo) {
                z4 = true;
            }
            zzcggVar.zza(z4, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z4, boolean z5, String str) {
        boolean z8;
        zzcek zzcekVar = this.zza;
        boolean zZzW = zzcekVar.zzW();
        boolean z9 = false;
        boolean z10 = zzah(zZzW, zzcekVar) || z5;
        if (z10 || !z4) {
            z8 = zZzW;
            z9 = true;
        } else {
            z8 = zZzW;
        }
        zzA(new AdOverlayInfoParcel(zzcVar, z10 ? null : this.zzg, z8 ? null : this.zzh, this.zzw, zzcekVar.zzs(), zzcekVar, z9 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i) {
        zzecy zzecyVar = this.zzG;
        zzcek zzcekVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzcekVar, zzcekVar.zzs(), str, str2, 14, zzecyVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.zzbsp] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final void zzx(boolean z4, int i, boolean z5) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzddz zzddzVar;
        ?? r9;
        int i4;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z8;
        zzcek zzcekVar = this.zza;
        boolean zZzah = zzah(zzcekVar.zzW(), zzcekVar);
        boolean z9 = true;
        if (!zZzah && z5) {
            z9 = false;
        }
        if (zZzah) {
            zzaVar = null;
            zzddzVar = null;
        } else {
            zzaVar = this.zzg;
            zzddzVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzh;
        zzddz zzddzVar2 = zzddzVar;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzs = zzcekVar.zzs();
        zzddz zzddzVar3 = z9 ? zzddzVar2 : this.zzm;
        if (zzag(zzcekVar)) {
            r9 = this.zzG;
            z8 = z4;
            i4 = i;
            zzaVar2 = zzaVar;
        } else {
            r9 = zzddzVar2;
            i4 = i;
            zzaVar2 = zzaVar;
            z8 = z4;
        }
        zzA(new AdOverlayInfoParcel(zzaVar2, zzqVar, zzacVar, zzcekVar, z8, i4, versionInfoParcelZzs, zzddzVar3, r9));
    }

    public final void zzy(boolean z4, int i, String str, boolean z5, boolean z8) {
        zzcek zzcekVar = this.zza;
        boolean zZzW = zzcekVar.zzW();
        boolean zZzah = zzah(zZzW, zzcekVar);
        boolean z9 = true;
        if (!zZzah && z5) {
            z9 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzah ? null : this.zzg;
        zzceu zzceuVar = zZzW ? null : new zzceu(zzcekVar, this.zzh);
        zzbib zzbibVar = this.zzk;
        zzecy zzecyVar = null;
        zzbid zzbidVar = this.zzl;
        boolean z10 = z9;
        zzceu zzceuVar2 = zzceuVar;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzs = zzcekVar.zzs();
        zzddz zzddzVar = z10 ? null : this.zzm;
        if (zzag(zzcekVar)) {
            zzecyVar = this.zzG;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzceuVar2, zzbibVar, zzbidVar, zzacVar, zzcekVar, z4, i, str, versionInfoParcelZzs, zzddzVar, zzecyVar, z8));
    }

    public final void zzz(boolean z4, int i, String str, String str2, boolean z5) {
        zzcek zzcekVar = this.zza;
        boolean zZzW = zzcekVar.zzW();
        boolean zZzah = zzah(zZzW, zzcekVar);
        boolean z8 = true;
        if (!zZzah && z5) {
            z8 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzah ? null : this.zzg;
        zzceu zzceuVar = zZzW ? null : new zzceu(zzcekVar, this.zzh);
        zzbib zzbibVar = this.zzk;
        zzecy zzecyVar = null;
        zzbid zzbidVar = this.zzl;
        boolean z9 = z8;
        zzceu zzceuVar2 = zzceuVar;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzs = zzcekVar.zzs();
        zzddz zzddzVar = z9 ? null : this.zzm;
        if (zzag(zzcekVar)) {
            zzecyVar = this.zzG;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzceuVar2, zzbibVar, zzbidVar, zzacVar, zzcekVar, z4, i, str, str2, versionInfoParcelZzs, zzddzVar, zzecyVar));
    }
}
