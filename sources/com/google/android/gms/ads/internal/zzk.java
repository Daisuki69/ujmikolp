package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzaui;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzaut;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzfoh;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzfpy;
import com.google.android.gms.internal.ads.zzgot;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzk implements Runnable, zzaup {
    private static final long zzc = System.currentTimeMillis();

    @VisibleForTesting
    protected boolean zza;
    private final boolean zzg;
    private final boolean zzh;
    private final Executor zzi;
    private final zzfoh zzj;
    private Context zzk;
    private final Context zzl;
    private VersionInfoParcel zzm;
    private final VersionInfoParcel zzn;
    private final boolean zzo;
    private int zzp;
    private final List zzd = new Vector();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzk = context;
        this.zzl = context;
        this.zzm = versionInfoParcel;
        this.zzn = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzi = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzbd.zzc().zzd(zzbci.zzcJ)).booleanValue();
        this.zzo = zBooleanValue;
        this.zzj = zzfoh.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzg = ((Boolean) zzbd.zzc().zzd(zzbci.zzcG)).booleanValue();
        this.zzh = ((Boolean) zzbd.zzc().zzd(zzbci.zzcK)).booleanValue();
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzcI)).booleanValue()) {
            this.zzp = 2;
        } else {
            this.zzp = 1;
        }
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzdS)).booleanValue()) {
            this.zza = zzm();
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzdL)).booleanValue()) {
            zzbzh.zza.execute(this);
            return;
        }
        zzbb.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzz()) {
            zzbzh.zza.execute(this);
        } else {
            run();
        }
    }

    private final void zzq() {
        List<Object[]> list = this.zzd;
        zzaup zzaupVarZzs = zzs();
        if (list.isEmpty() || zzaupVarZzs == null) {
            return;
        }
        for (Object[] objArr : list) {
            int length = objArr.length;
            if (length == 1) {
                zzaupVarZzs.zzd((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzaupVarZzs.zze(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        list.clear();
    }

    private final void zzr(boolean z4) {
        String str = this.zzm.afmaVersion;
        Context contextZzt = zzt(this.zzk);
        zzaqx zzaqxVarZze = zzaqy.zze();
        zzaqxVarZze.zzb(z4);
        zzaqxVarZze.zza(str);
        this.zze.set(zzaut.zzt(contextZzt, (zzaqy) zzaqxVarZze.zzbu()));
    }

    @Nullable
    private final zzaup zzs() {
        return zzp() == 2 ? (zzaup) this.zzf.get() : (zzaup) this.zze.get();
    }

    private static final Context zzt(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final zzaum zzu(Context context, VersionInfoParcel versionInfoParcel, boolean z4, boolean z5) {
        zzaqx zzaqxVarZze = zzaqy.zze();
        zzaqxVarZze.zzb(z4);
        zzaqxVarZze.zza(versionInfoParcel.afmaVersion);
        return zzaum.zza(zzt(context), (zzaqy) zzaqxVarZze.zzbu(), z5);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzdS)).booleanValue()) {
                this.zza = zzm();
            }
            boolean z4 = this.zzm.isClientJar;
            final boolean z5 = false;
            if (!((Boolean) zzbd.zzc().zzd(zzbci.zzbk)).booleanValue() && z4) {
                z5 = true;
            }
            if (zzp() == 1) {
                zzr(z5);
                if (this.zzp == 2) {
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzn(z5);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zzaum zzaumVarZzu = zzu(this.zzk, this.zzm, z5, this.zzo);
                    this.zzf.set(zzaumVarZzu);
                    if (this.zzh && !zzaumVarZzu.zzb()) {
                        this.zzp = 1;
                        zzr(z5);
                    }
                } catch (NullPointerException e) {
                    this.zzp = 1;
                    zzr(z5);
                    this.zzj.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
        } catch (Throwable th2) {
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
            throw th2;
        }
    }

    public final boolean zza() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final String zzb(Context context, byte[] bArr) {
        zzaup zzaupVarZzs;
        if (!zza() || (zzaupVarZzs = zzs()) == null) {
            return "";
        }
        zzq();
        return zzaupVarZzs.zzl(zzt(context));
    }

    public final String zzc() {
        int i = this.zzp;
        int i4 = i - 1;
        if (i != 0) {
            return i4 != 0 ? ExifInterface.GPS_MEASUREMENT_2D : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzd(MotionEvent motionEvent) {
        zzaup zzaupVarZzs = zzs();
        if (zzaupVarZzs == null) {
            this.zzd.add(new Object[]{motionEvent});
        } else {
            zzq();
            zzaupVarZzs.zzd(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zze(int i, int i4, int i6) {
        zzaup zzaupVarZzs = zzs();
        if (zzaupVarZzs == null) {
            this.zzd.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6)});
        } else {
            zzq();
            zzaupVarZzs.zze(i, i4, i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zza()) {
            return "";
        }
        zzaup zzaupVarZzs = zzs();
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzlw)).booleanValue()) {
            zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzN(view, 4, null);
        }
        if (zzaupVarZzs == null) {
            return "";
        }
        zzq();
        return zzaupVarZzs.zzf(zzt(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzh(View view) {
        zzaup zzaupVarZzs = zzs();
        if (zzaupVarZzs != null) {
            zzaupVarZzs.zzh(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzaup zzaupVarZzs;
        zzaup zzaupVarZzs2;
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzdh)).booleanValue()) {
            if (this.zzb.getCount() != 0 || (zzaupVarZzs2 = zzs()) == null) {
                return;
            }
            zzaupVarZzs2.zzi(stackTraceElementArr);
            return;
        }
        if (!zza() || (zzaupVarZzs = zzs()) == null) {
            return;
        }
        zzaupVarZzs.zzi(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzj(Context context, View view, Activity activity) {
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzlv)).booleanValue()) {
            zzaup zzaupVarZzs = zzs();
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzlw)).booleanValue()) {
                zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzN(view, 2, null);
            }
            return zzaupVarZzs != null ? zzaupVarZzs.zzj(context, view, activity) : "";
        }
        if (!zza()) {
            return "";
        }
        zzaup zzaupVarZzs2 = zzs();
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzlw)).booleanValue()) {
            zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzN(view, 2, null);
        }
        return zzaupVarZzs2 != null ? zzaupVarZzs2.zzj(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzk(final Context context) {
        try {
            return (String) zzgot.zzd(new Callable() { // from class: com.google.android.gms.ads.internal.zzj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb(context, null);
                }
            }, this.zzi).get(((Integer) zzbd.zzc().zzd(zzbci.zzda)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzaui.zza(context, this.zzn.afmaVersion, zzc, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzl(Context context) {
        return zzb(context, null);
    }

    public final boolean zzm() {
        Context context = this.zzk;
        zzh zzhVar = new zzh(this);
        zzfoh zzfohVar = this.zzj;
        return new zzfpy(this.zzk, zzfpe.zzb(context, zzfohVar), zzhVar, ((Boolean) zzbd.zzc().zzd(zzbci.zzcH)).booleanValue()).zzd(1);
    }

    public final /* synthetic */ void zzn(boolean z4) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zzu(this.zzl, this.zzn, z4, this.zzo).zzm();
        } catch (NullPointerException e) {
            this.zzj.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }

    public final /* synthetic */ zzfoh zzo() {
        return this.zzj;
    }

    public final int zzp() {
        if (!this.zzg || this.zza) {
            return this.zzp;
        }
        return 1;
    }
}
