package com.google.android.gms.internal.consent_sdk;

import L1.b;
import L1.c;
import L1.j;
import L1.k;
import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.annotation.UiThread;
import androidx.core.view.WindowCompat;
import dOYHB6.eJxIy3.vjtnx1;
import dOYHB6.iY9fr2.dLgao9;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
@UiThread
public final class zzbc implements c {
    private final Application zzb;
    private final zzbx zzc;
    private final zzaq zzd;
    private final zzbq zze;
    private final zzdt zzf;
    private Dialog zzg;
    private zzbv zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    boolean zza = false;

    public zzbc(Application application, zzad zzadVar, zzbx zzbxVar, zzaq zzaqVar, zzbq zzbqVar, zzdt zzdtVar) {
        this.zzb = application;
        this.zzc = zzbxVar;
        this.zzd = zzaqVar;
        this.zze = zzbqVar;
        this.zzf = zzdtVar;
    }

    private final void zzk() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzaz zzazVar = (zzaz) this.zzl.getAndSet(null);
        if (zzazVar != null) {
            zzazVar.zzb();
        }
    }

    @Override // L1.c
    public final void show(Activity activity, b bVar) {
        zzcs.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            bVar.onConsentFormDismissed(new zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza());
            return;
        }
        this.zzh.zzc();
        zzaz zzazVar = new zzaz(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzazVar);
        this.zzl.set(zzazVar);
        this.zzc.zza(activity);
        vjtnx1 vjtnx1Var = new vjtnx1(activity, R.style.Theme.Translucent.NoTitleBar);
        vjtnx1Var.setContentView(this.zzh);
        vjtnx1Var.setCancelable(false);
        Window window = vjtnx1Var.getWindow();
        if (window == null) {
            bVar.onConsentFormDismissed(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dLgao9.setFlags(window, 16777216, 16777216);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        this.zzk.set(bVar);
        vjtnx1Var.show();
        this.zzg = vjtnx1Var;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    public final zzbv zzc() {
        return this.zzh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(k kVar, j jVar) {
        zzbv zzbvVarZzb = ((zzbw) this.zzf).zza();
        this.zzh = zzbvVarZzb;
        zzbvVarZzb.setBackgroundColor(0);
        zzbvVarZzb.getSettings().setJavaScriptEnabled(true);
        zzbvVarZzb.getSettings().setAllowFileAccess(false);
        zzbvVarZzb.getSettings().setAllowContentAccess(false);
        zzbvVarZzb.setWebViewClient(new zzbt(zzbvVarZzb, null));
        this.zzj.set(new zzba(kVar, jVar, 0 == true ? 1 : 0));
        zzbv zzbvVar = this.zzh;
        zzbq zzbqVar = this.zze;
        zzbvVar.loadDataWithBaseURL(zzbqVar.zza(), zzbqVar.zzb(), "text/html", "UTF-8", null);
        zzcs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzay
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void zzg(int i) {
        zzk();
        b bVar = (b) this.zzk.getAndSet(null);
        if (bVar == null) {
            return;
        }
        this.zzd.zzg(i);
        bVar.onConsentFormDismissed(null);
    }

    public final void zzh(zzg zzgVar) {
        zzk();
        b bVar = (b) this.zzk.getAndSet(null);
        if (bVar == null) {
            return;
        }
        bVar.onConsentFormDismissed(zzgVar.zza());
    }

    public final void zzi() {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadSuccess(this);
    }

    public final void zzj(zzg zzgVar) {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
