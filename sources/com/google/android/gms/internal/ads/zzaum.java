package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaum implements zzaup {

    @Nullable
    private static zzaum zzb;
    private final Context zzc;
    private final zzfpr zzd;
    private final zzfpy zze;
    private final zzfqa zzf;
    private final zzavr zzg;
    private final zzfoh zzh;
    private final Executor zzi;
    private final zzaxq zzj;
    private final zzfpx zzk;
    private final zzawg zzm;

    @Nullable
    private final zzavy zzn;

    @Nullable
    private final zzavp zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;

    @VisibleForTesting
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    @VisibleForTesting
    public zzaum(@NonNull Context context, @NonNull zzfoh zzfohVar, @NonNull zzfpr zzfprVar, @NonNull zzfpy zzfpyVar, @NonNull zzfqa zzfqaVar, @NonNull zzavr zzavrVar, @NonNull Executor executor, @NonNull zzfoc zzfocVar, zzaxq zzaxqVar, @Nullable zzawg zzawgVar, @Nullable zzavy zzavyVar, @Nullable zzavp zzavpVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfohVar;
        this.zzd = zzfprVar;
        this.zze = zzfpyVar;
        this.zzf = zzfqaVar;
        this.zzg = zzavrVar;
        this.zzi = executor;
        this.zzj = zzaxqVar;
        this.zzm = zzawgVar;
        this.zzn = zzavyVar;
        this.zzo = zzavpVar;
        this.zzr = false;
        this.zzk = new zzauk(this, zzfocVar);
    }

    public static synchronized zzaum zza(@NonNull Context context, @NonNull zzaqy zzaqyVar, boolean z4) {
        zzfoi zzfoiVarZzh;
        zzfoiVarZzh = zzfoj.zzh();
        zzfoiVarZzh.zza(zzaqyVar.zza());
        zzfoiVarZzh.zzb(zzaqyVar.zzb());
        return zzs(context, Executors.newCachedThreadPool(), zzfoiVarZzh.zzh(), z4);
    }

    private static synchronized zzaum zzs(@NonNull Context context, @NonNull Executor executor, zzfoj zzfojVar, boolean z4) {
        try {
            if (zzb == null) {
                zzfoh zzfohVarZza = zzfoh.zza(context, executor, z4);
                zzava zzavaVarZza = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdN)).booleanValue() ? zzava.zza(context) : null;
                zzawg zzawgVarZza = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdO)).booleanValue() ? zzawg.zza(context, executor) : null;
                zzavy zzavyVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcX)).booleanValue() ? new zzavy() : null;
                zzavp zzavpVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdg)).booleanValue() ? new zzavp() : null;
                zzfox zzfoxVarZza = zzfox.zza(context, executor, zzfohVarZza, zzfojVar);
                zzavq zzavqVar = new zzavq(context);
                zzavr zzavrVar = new zzavr(zzfojVar, zzfoxVarZza, new zzawe(context, zzavqVar), zzavqVar, zzavaVarZza, zzawgVarZza, zzavyVar, zzavpVar);
                zzaxq zzaxqVarZzb = zzfpe.zzb(context, zzfohVarZza);
                zzfoc zzfocVar = new zzfoc();
                zzaum zzaumVar = new zzaum(context, zzfohVarZza, new zzfpr(context, zzaxqVarZzb), new zzfpy(context, zzaxqVarZzb, new zzauj(zzfohVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcH)).booleanValue()), new zzfqa(context, zzavrVar, zzfohVarZza, zzfocVar, false), zzavrVar, executor, zzfocVar, zzaxqVarZzb, zzawgVarZza, zzavyVar, zzavpVar);
                zzb = zzaumVar;
                zzaumVar.zzc();
                zzb.zzm();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzb;
    }

    private final void zzt() {
        zzawg zzawgVar = this.zzm;
        if (zzawgVar != null) {
            zzawgVar.zzb();
        }
    }

    private final zzfpq zzu(int i) {
        if (zzfpe.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcF)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    public final synchronized void zzc() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfpq zzfpqVarZzu = zzu(1);
        if (zzfpqVarZzu == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zza(zzfpqVarZzu)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzd(@Nullable MotionEvent motionEvent) {
        zzfok zzfokVarZzb = this.zzf.zzb();
        if (zzfokVarZzb != null) {
            try {
                zzfokVarZzb.zzd(null, motionEvent);
            } catch (zzfpz e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zze(int i, int i4, int i6) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmM)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f3 = displayMetrics.density;
        float f7 = i4;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * f3, f7 * f3, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain);
        motionEventObtain.recycle();
        float f10 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * f10, f7 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain2);
        motionEventObtain2.recycle();
        float f11 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i6, 1, f * f11, f7 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzf(Context context, String str, @Nullable View view, @Nullable Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcX)).booleanValue()) {
            this.zzn.zzc();
        }
        zzm();
        zzfok zzfokVarZzb = this.zzf.zzb();
        if (zzfokVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfokVarZzb.zzc(context, null, str, view, activity);
        this.zzh.zzd(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzg(Context context, @Nullable String str, @Nullable View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzh(@Nullable View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzavp zzavpVar = this.zzo;
        if (zzavpVar != null) {
            zzavpVar.zza(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzj(Context context, @Nullable View view, @Nullable Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcX)).booleanValue()) {
            this.zzn.zzb(context, view);
        }
        zzm();
        zzfok zzfokVarZzb = this.zzf.zzb();
        if (zzfokVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfokVarZzb.zzb(context, null, view, activity);
        this.zzh.zzd(PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzl(Context context) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcX)).booleanValue()) {
            this.zzn.zza();
        }
        zzm();
        zzfok zzfokVarZzb = this.zzf.zzb();
        if (zzfokVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfokVarZzb.zza(context, null);
        this.zzh.zzd(PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            try {
                if (!this.zzq) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfpq zzfpqVarZzc = this.zzf.zzc();
                    if ((zzfpqVarZzc == null || zzfpqVarZzc.zze(3600L)) && zzfpe.zza(this.zzj)) {
                        this.zzi.execute(new zzaul(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void zzn() {
        String str;
        String strZzb;
        int length;
        zzfpq zzfpqVarZzu;
        zzaxw zzaxwVarZza;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfpq zzfpqVarZzu2 = zzu(1);
        if (zzfpqVarZzu2 != null) {
            String strZza = zzfpqVarZzu2.zza().zza();
            strZzb = zzfpqVarZzu2.zza().zzb();
            str = strZza;
        } else {
            str = null;
            strZzb = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzaxq zzaxqVar = this.zzj;
                zzfoh zzfohVar = this.zzh;
                zzfpv zzfpvVarZza = zzfoq.zza(context, 1, zzaxqVar, str, strZzb, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, zzfohVar);
                byte[] bArr = zzfpvVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfohVar.zzb(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzaxs zzaxsVarZzd = zzaxs.zzd(zzhhb.zzr(bArr, 0, length), zzhhr.zza());
                        if (zzaxsVarZzd.zza().zza().isEmpty() || zzaxsVarZzd.zza().zzb().isEmpty() || zzaxsVarZzd.zzc().zzv().length == 0 || ((zzfpqVarZzu = zzu(1)) != null && (zzaxwVarZza = zzfpqVarZzu.zza()) != null && zzaxsVarZzd.zza().zza().equals(zzaxwVarZza.zza()) && zzaxsVarZzd.zza().zzb().equals(zzaxwVarZza.zzb()))) {
                            this.zzh.zzb(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfpx zzfpxVar = this.zzk;
                            int i = zzfpvVarZza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcF)).booleanValue()) {
                                zZza = this.zzd.zza(zzaxsVarZzd, zzfpxVar);
                            } else if (i == 3) {
                                zZza = this.zze.zzb(zzaxsVarZzd);
                            } else {
                                if (i == 4) {
                                    zZza = this.zze.zza(zzaxsVarZzd, zzfpxVar);
                                }
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                zzfpq zzfpqVarZzu3 = zzu(1);
                                if (zzfpqVarZzu3 != null) {
                                    if (this.zzf.zza(zzfpqVarZzu3)) {
                                        this.zzr = true;
                                    }
                                    this.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzhiw e) {
                this.zzh.zzc(PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED, System.currentTimeMillis() - jCurrentTimeMillis, e);
            }
            this.zzl.countDown();
        } catch (Throwable th2) {
            this.zzl.countDown();
            throw th2;
        }
    }

    public final /* synthetic */ zzfoh zzo() {
        return this.zzh;
    }

    public final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    public final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    public final /* synthetic */ void zzr(boolean z4) {
        this.zzq = z4;
    }
}
