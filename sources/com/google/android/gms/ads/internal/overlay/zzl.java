package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzcwf;
import com.google.android.gms.internal.ads.zzddz;
import com.google.android.gms.internal.ads.zzdsl;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzecz;
import com.google.android.gms.internal.ads.zzeda;
import com.google.android.gms.internal.ads.zzeds;
import com.google.android.gms.internal.ads.zzedu;
import com.google.android.gms.internal.ads.zzfro;
import com.google.android.gms.internal.ads.zzghs;
import dOYHB6.lN8Dz0.yf3D09;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class zzl extends zzbsv implements zzag {

    @VisibleForTesting
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;

    @Nullable
    @VisibleForTesting
    AdOverlayInfoParcel zzc;

    @VisibleForTesting
    zzcek zzd;

    @VisibleForTesting
    zzi zze;

    @VisibleForTesting
    zzt zzf;

    @VisibleForTesting
    FrameLayout zzh;

    @VisibleForTesting
    WebChromeClient.CustomViewCallback zzi;

    @VisibleForTesting
    zzh zzl;
    private Runnable zzq;
    private boolean zzr;
    private boolean zzs;
    private Toolbar zzw;

    @VisibleForTesting
    boolean zzg = false;

    @VisibleForTesting
    boolean zzj = false;

    @VisibleForTesting
    boolean zzk = false;

    @VisibleForTesting
    boolean zzm = false;

    @VisibleForTesting
    int zzn = 1;
    private final Object zzo = new Object();
    private final View.OnClickListener zzp = new zzd(this);
    private boolean zzt = false;
    private boolean zzu = false;
    private boolean zzv = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzJ(android.content.res.Configuration r7) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzJ(android.content.res.Configuration):void");
    }

    private final void zzK(View view) {
        zzedu zzeduVarZzU;
        zzeds zzedsVarZzV;
        zzcek zzcekVar = this.zzd;
        if (zzcekVar == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && (zzedsVarZzV = zzcekVar.zzV()) != null) {
            zzedsVarZzV.zzf(view);
        } else if (((Boolean) zzbd.zzc().zzd(zzbci.zzfL)).booleanValue() && (zzeduVarZzU = zzcekVar.zzU()) != null && zzeduVarZzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzeduVarZzU.zza(), view);
        }
    }

    private static final void zzL(@Nullable zzedu zzeduVar, @Nullable View view) {
        if (zzeduVar == null || view == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfL)).booleanValue() && zzeduVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzeduVar.zza(), view);
    }

    public final void zzA() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzq zzqVar;
        if (!this.zzb.isFinishing() || this.zzt) {
            return;
        }
        this.zzt = true;
        zzcek zzcekVar = this.zzd;
        if (zzcekVar != null) {
            zzcekVar.zzH(this.zzn - 1);
            synchronized (this.zzo) {
                try {
                    if (!this.zzr && this.zzd.zzaa()) {
                        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfx)).booleanValue() && !this.zzu && (adOverlayInfoParcel = this.zzc) != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
                            zzqVar.zzdX();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzB();
                            }
                        };
                        this.zzq = runnable;
                        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzbd.zzc().zzd(zzbci.zzbl)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzB();
    }

    @VisibleForTesting
    public final void zzB() {
        zzcek zzcekVar;
        zzq zzqVar;
        if (this.zzu) {
            return;
        }
        this.zzu = true;
        zzcek zzcekVar2 = this.zzd;
        if (zzcekVar2 != null) {
            this.zzl.removeView(zzcekVar2.zzE());
            zzi zziVar = this.zze;
            if (zziVar != null) {
                this.zzd.zzai(zziVar.zzd);
                this.zzd.zzag(false);
                if (((Boolean) zzbd.zzc().zzd(zzbci.zznx)).booleanValue() && this.zzd.getParent() != null) {
                    ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzE());
                }
                ViewGroup viewGroup = this.zze.zzc;
                View viewZzE = this.zzd.zzE();
                zzi zziVar2 = this.zze;
                viewGroup.addView(viewZzE, zziVar2.zza, zziVar2.zzb);
                this.zze = null;
            } else {
                Activity activity = this.zzb;
                if (activity.getApplicationContext() != null) {
                    this.zzd.zzai(activity.getApplicationContext());
                }
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdY(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcekVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(zzcekVar.zzU(), this.zzc.zzd.zzE());
    }

    public final void zzC() {
        if (this.zzm) {
            this.zzm = false;
            zzD();
        }
    }

    public final void zzD() {
        this.zzd.zzI();
    }

    public final void zzE() {
        this.zzl.zzb = true;
    }

    public final void zzF() {
        synchronized (this.zzo) {
            try {
                this.zzr = true;
                Runnable runnable = this.zzq;
                if (runnable != null) {
                    zzfro zzfroVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    zzfroVar.removeCallbacks(runnable);
                    zzfroVar.post(this.zzq);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzG(zzeda zzedaVar) throws RemoteException, zzg {
        zzbsp zzbspVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbspVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzg("noioou");
        }
        zzbspVar.zzh(ObjectWrapper.wrap(zzedaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzH(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.zzb;
            zzecz zzeczVarZze = zzeda.zze();
            zzeczVarZze.zza(activity);
            zzeczVarZze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzi(strArr, iArr, ObjectWrapper.wrap(zzeczVarZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzb() {
        this.zzn = 3;
        Activity activity = this.zzb;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzcek zzcekVar = this.zzd;
        if (zzcekVar != null) {
            zzcekVar.zzae(null);
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzs = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzag
    public final void zzd() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zze() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzf() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzqVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzqVar.zzdA();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final boolean zzg() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzjI)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zZzZ = this.zzd.zzZ();
        if (!zZzZ) {
            this.zzd.zze("onbackblocked", Collections.EMPTY_MAP);
        }
        return zZzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public void zzh(Bundle bundle) {
        zzq zzqVar;
        if (!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
            this.zzc = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new zzg("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.zzc.zzm.clientJarVersion > 7500000) {
                this.zzn = 4;
            }
            if (activity.getIntent() != null) {
                this.zzv = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.zzo;
            if (zzlVar != null) {
                boolean z4 = zzlVar.zza;
                this.zzk = z4;
                if (z4) {
                    if (adOverlayInfoParcel.zzk != 5 && zzlVar.zzf != -1) {
                        new zzk(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzk(this, null).zzb();
                }
            } else {
                this.zzk = false;
            }
            if (bundle == null) {
                if (this.zzv) {
                    zzcwf zzcwfVar = this.zzc.zzt;
                    if (zzcwfVar != null) {
                        zzcwfVar.zza();
                    }
                    zzq zzqVar2 = this.zzc.zzc;
                    if (zzqVar2 != null) {
                        zzqVar2.zzh();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    zzddz zzddzVar = this.zzc.zzu;
                    if (zzddzVar != null) {
                        zzddzVar.zzdz();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
            if (adOverlayInfoParcel3 != null && (zzqVar = adOverlayInfoParcel3.zzc) != null) {
                zzqVar.zzdt();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            zzh zzhVar = new zzh(activity, adOverlayInfoParcel4.zzn, adOverlayInfoParcel4.zzm.afmaVersion, adOverlayInfoParcel4.zzs);
            this.zzl = zzhVar;
            zzhVar.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.zzc;
            int i = adOverlayInfoParcel5.zzk;
            if (i == 1) {
                zzy(false);
                return;
            }
            if (i == 2) {
                this.zze = new zzi(adOverlayInfoParcel5.zzd);
                zzy(false);
            } else if (i == 3) {
                zzy(true);
            } else {
                if (i != 5) {
                    throw new zzg("Could not determine ad overlay type.");
                }
                zzy(false);
            }
        } catch (zzg e) {
            String message = e.getMessage();
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzi() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzqVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzqVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzj() {
        zzq zzqVar;
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfz)).booleanValue()) {
            zzcek zzcekVar = this.zzd;
            if (zzcekVar == null || zzcekVar.zzX()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzqVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzqVar.zzdu();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzk() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdC();
        }
        zzJ(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfz)).booleanValue()) {
            return;
        }
        zzcek zzcekVar = this.zzd;
        if (zzcekVar != null && !zzcekVar.zzX()) {
            this.zzd.onResume();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzl() {
        zzq zzqVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdB();
        }
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzfz)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzm(int i, int i4, Intent intent) {
        zzdsm zzdsmVarZzI;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            zzbbz zzbbzVar = zzbci.zznV;
            if (((Boolean) zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 66);
                sb2.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb2.append(i4);
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                zzcek zzcekVar = this.zzd;
                if (zzcekVar == null || zzcekVar.zzP() == null || (zzdsmVarZzI = zzcekVar.zzP().zzI()) == null || (adOverlayInfoParcel = this.zzc) == null || !((Boolean) zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                    return;
                }
                zzdsl zzdslVarZza = zzdsmVarZzI.zza();
                zzdslVarZza.zzc("action", "hilca");
                zzdslVarZza.zzc("gqi", zzghs.zza(adOverlayInfoParcel.zzq));
                StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length());
                sb3.append(i4);
                zzdslVarZza.zzc("hilr", sb3.toString());
                if (i4 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zzdslVarZza.zzc("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zzdslVarZza.zzc("hills", stringExtra2);
                    }
                }
                zzdslVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzn(IObjectWrapper iObjectWrapper) {
        zzJ((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzp() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdD();
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfz)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzq() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdE();
        }
        zzcek zzcekVar = this.zzd;
        if (zzcekVar != null) {
            try {
                this.zzl.removeView(zzcekVar.zzE());
            } catch (NullPointerException unused) {
            }
        }
        zzA();
    }

    public final void zzr(boolean z4) {
        if (this.zzc.zzw) {
            return;
        }
        int iIntValue = ((Integer) zzbd.zzc().zzd(zzbci.zzfC)).intValue();
        boolean z5 = ((Boolean) zzbd.zzc().zzd(zzbci.zzbo)).booleanValue() || z4;
        zzs zzsVar = new zzs();
        zzsVar.zzd = 50;
        zzsVar.zza = true != z5 ? 0 : iIntValue;
        zzsVar.zzb = true != z5 ? iIntValue : 0;
        zzsVar.zzc = iIntValue;
        this.zzf = new zzt(this.zzb, zzsVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z5 ? 9 : 11);
        zzt(z4, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzK(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzs() {
        this.zzs = true;
    }

    public final void zzt(boolean z4, boolean z5) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z8 = true;
        boolean z9 = ((Boolean) zzbd.zzc().zzd(zzbci.zzbm)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z10 = ((Boolean) zzbd.zzc().zzd(zzbci.zzbn)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z4 && z5 && z9 && !z10) {
            new zzbsb(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzt zztVar = this.zzf;
        if (zztVar != null) {
            if (!z10 && (!z5 || z9)) {
                z8 = false;
            }
            zztVar.zza(z8);
        }
    }

    public final void zzu(boolean z4) {
        if (z4) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
    }

    public final void zzv() {
        this.zzl.removeView(this.zzf);
        zzr(true);
    }

    public final void zzw(int i) {
        Activity activity = this.zzb;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzbd.zzc().zzd(zzbci.zzgu)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzbd.zzc().zzd(zzbci.zzgv)).intValue()) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= ((Integer) zzbd.zzc().zzd(zzbci.zzgw)).intValue()) {
                    if (i4 <= ((Integer) zzbd.zzc().zzd(zzbci.zzgx)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzx(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.zzb;
        yf3D09 yf3d09 = new yf3D09(activity);
        this.zzh = yf3d09;
        yf3d09.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        activity.setContentView(this.zzh);
        this.zzs = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzy(boolean r44) throws com.google.android.gms.ads.internal.overlay.zzg {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzy(boolean):void");
    }

    public final void zzz(String str) {
        Toolbar toolbar = this.zzw;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }
}
