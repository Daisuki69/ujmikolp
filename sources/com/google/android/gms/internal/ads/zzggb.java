package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzggb {
    private final zzght zza;
    private final Context zzb;
    private final zzggc zzc;
    private boolean zzf;
    private final Intent zzg;

    @Nullable
    private ServiceConnection zzi;

    @Nullable
    private IInterface zzj;
    private final List zze = new ArrayList();
    private final String zzd = "OverlayDisplayService";
    private final IBinder.DeathRecipient zzh = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzgfw
        @Override // android.os.IBinder.DeathRecipient
        public final /* synthetic */ void binderDied() {
            this.zza.zzd();
        }
    };

    public zzggb(Context context, zzggc zzggcVar, String str, Intent intent, zzgfs zzgfsVar) {
        this.zzb = context;
        this.zzc = zzggcVar;
        final String str2 = "OverlayDisplayService";
        this.zzg = intent;
        this.zza = zzghx.zza(new zzght(str2) { // from class: com.google.android.gms.internal.ads.zzgga
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final void zzh(final Runnable runnable) {
        ((Handler) this.zza.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(runnable);
            }
        });
    }

    public final void zza(final Runnable runnable) {
        zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(runnable);
            }
        });
    }

    public final void zzb() {
        zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        });
    }

    @Nullable
    public final IInterface zzc() {
        return this.zzj;
    }

    public final /* synthetic */ void zzd() {
        this.zzc.zza("%s : Binder has died.", this.zzd);
        List list = this.zze;
        synchronized (list) {
            list.clear();
        }
    }

    public final /* synthetic */ void zze(Runnable runnable) {
        if (this.zzj != null || this.zzf) {
            if (!this.zzf) {
                runnable.run();
                return;
            }
            this.zzc.zza("Waiting to bind to the service.", new Object[0]);
            List list = this.zze;
            synchronized (list) {
                list.add(runnable);
            }
            return;
        }
        this.zzc.zza("Initiate binding to the service.", new Object[0]);
        List list2 = this.zze;
        synchronized (list2) {
            list2.add(runnable);
        }
        zzgfv zzgfvVar = new zzgfv(this, null);
        this.zzi = zzgfvVar;
        this.zzf = true;
        if (this.zzb.bindService(this.zzg, zzgfvVar, 1)) {
            return;
        }
        this.zzc.zza("Failed to bind to the service.", new Object[0]);
        this.zzf = false;
        List list3 = this.zze;
        synchronized (list3) {
            list3.clear();
        }
    }

    public final /* synthetic */ void zzf() {
        if (this.zzj != null) {
            this.zzc.zza("Unbind from service.", new Object[0]);
            Context context = this.zzb;
            ServiceConnection serviceConnection = this.zzi;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.zzf = false;
            this.zzj = null;
            this.zzi = null;
            List list = this.zze;
            synchronized (list) {
                list.clear();
            }
        }
    }

    public final /* synthetic */ void zzg(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            this.zzc.zzc("error caused by ", e);
        }
    }

    public final /* synthetic */ zzggc zzi() {
        return this.zzc;
    }

    public final /* synthetic */ List zzj() {
        return this.zze;
    }

    public final /* synthetic */ void zzk(boolean z4) {
        this.zzf = false;
    }

    public final /* synthetic */ IBinder.DeathRecipient zzl() {
        return this.zzh;
    }

    public final /* synthetic */ IInterface zzm() {
        return this.zzj;
    }

    public final /* synthetic */ void zzn(IInterface iInterface) {
        this.zzj = iInterface;
    }
}
