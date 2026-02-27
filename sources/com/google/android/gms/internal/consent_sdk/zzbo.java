package com.google.android.gms.internal.consent_sdk;

import L1.b;
import L1.c;
import L1.f;
import L1.i;
import L1.j;
import L1.k;
import android.app.Activity;
import android.util.Log;
import androidx.annotation.WorkerThread;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbo {
    private final zzdt zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    public zzbo(zzdt zzdtVar, Executor executor) {
        this.zza = zzdtVar;
        this.zzb = executor;
    }

    public static /* synthetic */ void zza(zzbo zzboVar, zzbc zzbcVar) {
        final AtomicReference atomicReference = zzboVar.zzd;
        Objects.requireNonNull(atomicReference);
        zzbcVar.zzf(new k() { // from class: com.google.android.gms.internal.consent_sdk.zzbf
            @Override // L1.k
            public final void onConsentFormLoadSuccess(c cVar) {
                atomicReference.set(cVar);
            }
        }, new j() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
            @Override // L1.j
            public final void onConsentFormLoadFailure(i iVar) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(iVar.f2806b)));
            }
        });
    }

    public final void zzb(k kVar, j jVar) {
        zzcs.zza();
        zzbq zzbqVar = (zzbq) this.zzc.get();
        if (zzbqVar == null) {
            jVar.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
        } else {
            ((zzaw) this.zza.zza()).zza(zzbqVar).zzb().zza().zzf(kVar, jVar);
        }
    }

    @WorkerThread
    public final void zzc() {
        zzbq zzbqVar = (zzbq) this.zzc.get();
        if (zzbqVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final zzbc zzbcVarZza = ((zzaw) this.zza.zza()).zza(zzbqVar).zzb().zza();
        zzbcVarZza.zza = true;
        zzcs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                zzbo.zza(this.zza, zzbcVarZza);
            }
        });
    }

    public final void zzd(zzbq zzbqVar) {
        this.zzc.set(zzbqVar);
    }

    public final void zze(Activity activity, final b bVar) {
        zzcs.zza();
        zzj zzjVarZzb = zza.zza(activity).zzb();
        if (zzjVarZzb == null) {
            zzcs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
                @Override // java.lang.Runnable
                public final void run() {
                    bVar.onConsentFormDismissed(new zzg(1, "No consentInformation.").zza());
                }
            });
            return;
        }
        boolean zIsConsentFormAvailable = zzjVarZzb.isConsentFormAvailable();
        f fVar = f.f2801b;
        if (!zIsConsentFormAvailable && zzjVarZzb.getPrivacyOptionsRequirementStatus() != fVar) {
            zzcs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
                @Override // java.lang.Runnable
                public final void run() {
                    bVar.onConsentFormDismissed(new zzg(3, "No valid response received yet.").zza());
                }
            });
            zzjVarZzb.zza(activity);
        } else {
            if (zzjVarZzb.getPrivacyOptionsRequirementStatus() == fVar) {
                zzcs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.onConsentFormDismissed(new zzg(3, "Privacy options form is not required.").zza());
                    }
                });
                return;
            }
            c cVar = (c) this.zzd.get();
            if (cVar == null) {
                zzcs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.onConsentFormDismissed(new zzg(3, "Privacy options form is being loading. Please try again later.").zza());
                    }
                });
            } else {
                cVar.show(activity, bVar);
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
