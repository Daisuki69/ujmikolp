package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface zzcek extends com.google.android.gms.ads.internal.client.zza, zzddz, zzceb, zzbmh, zzcfr, zzcfw, zzbmt, zzayi, zzcga, com.google.android.gms.ads.internal.zzn, zzcgd, zzcge, zzcbd, zzcgf {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcfw, com.google.android.gms.internal.ads.zzcbd
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i4);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcbd
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzceb
    zzfcj zzC();

    WebView zzD();

    @Override // com.google.android.gms.internal.ads.zzcgf
    View zzE();

    List zzF();

    void zzG();

    void zzH(int i);

    void zzI();

    void zzJ();

    Context zzK();

    com.google.android.gms.ads.internal.overlay.zzl zzL();

    com.google.android.gms.ads.internal.overlay.zzl zzM();

    @Override // com.google.android.gms.internal.ads.zzcgc
    zzcgt zzN();

    String zzO();

    zzcgi zzP();

    WebViewClient zzQ();

    boolean zzR();

    @Override // com.google.android.gms.internal.ads.zzcgd
    zzauu zzS();

    zzfdg zzT();

    zzedu zzU();

    zzeds zzV();

    boolean zzW();

    boolean zzX();

    void zzY();

    boolean zzZ();

    boolean zzaA(boolean z4, int i);

    boolean zzaB();

    @Override // com.google.android.gms.internal.ads.zzcfr
    zzfcm zzaC();

    void zzaD(zzfcj zzfcjVar, zzfcm zzfcmVar);

    void zzaE(boolean z4);

    S1.y zzaF();

    void zzaG(boolean z4);

    boolean zzaa();

    void zzab(String str, zzbjl zzbjlVar);

    void zzac(String str, zzbjl zzbjlVar);

    void zzad(String str, Predicate predicate);

    void zzae(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzaf(zzcgt zzcgtVar);

    void zzag(boolean z4);

    void zzah();

    void zzai(Context context);

    void zzaj(boolean z4);

    void zzak(zzedu zzeduVar);

    void zzal(zzeds zzedsVar);

    void zzam(int i);

    void zzan(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzao(boolean z4);

    void zzap();

    void zzaq(zzbfj zzbfjVar);

    zzbfj zzar();

    void zzas(boolean z4);

    void zzat();

    void zzau(String str, String str2, String str3);

    void zzav();

    void zzaw(boolean z4);

    void zzax(zzbfg zzbfgVar);

    void zzay(zzazv zzazvVar);

    zzazv zzaz();

    @Override // com.google.android.gms.internal.ads.zzcbd
    zzcfq zzh();

    @Override // com.google.android.gms.internal.ads.zzcfw, com.google.android.gms.internal.ads.zzcbd
    Activity zzj();

    @Override // com.google.android.gms.internal.ads.zzcbd
    com.google.android.gms.ads.internal.zza zzk();

    @Override // com.google.android.gms.internal.ads.zzcbd
    zzbcv zzq();

    @Override // com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbd
    VersionInfoParcel zzs();

    @Override // com.google.android.gms.internal.ads.zzcbd
    void zzt(String str, zzccq zzccqVar);

    @Override // com.google.android.gms.internal.ads.zzcbd
    void zzw(zzcfq zzcfqVar);
}
