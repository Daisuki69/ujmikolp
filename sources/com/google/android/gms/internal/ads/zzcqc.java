package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcqc implements zzayi {

    @Nullable
    private final zzcek zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcqc(@Nullable zzcek zzcekVar, Executor executor) {
        this.zza = zzcekVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final synchronized void zzdo(zzayh zzayhVar) {
        final zzcek zzcekVar = this.zza;
        if (zzcekVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznt)).booleanValue()) {
                if (zzayhVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqb
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzcekVar.onResume();
                            }
                        });
                    }
                } else {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqa
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzcekVar.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
