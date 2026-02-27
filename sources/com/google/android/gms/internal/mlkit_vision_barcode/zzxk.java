package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p3.k;
import v3.AbstractC2339b;
import v3.d;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxk {
    private static final GmsLogger zzf = new GmsLogger("AutoZoom");

    @VisibleForTesting
    final zzxm zza;

    @VisibleForTesting
    final zzbw zzb;

    @VisibleForTesting
    ScheduledFuture zzc;

    @VisibleForTesting
    String zzd;

    @VisibleForTesting
    int zze;
    private final AtomicBoolean zzg;
    private final Object zzh;
    private final ScheduledExecutorService zzi;
    private final zzbb zzj;
    private final zzwp zzk;
    private final String zzl;
    private Executor zzm;
    private float zzn;
    private float zzo;
    private long zzp;
    private long zzq;
    private boolean zzr;
    private AbstractC2339b zzs;

    private zzxk(Context context, zzxm zzxmVar, String str) {
        zzg.zza();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        zzbb zzbbVarZza = zzar.zza();
        zzwp zzwpVar = new zzwp(context, new k(context), new zzwi(context, zzwh.zzd("scanner-auto-zoom").zzd()), "scanner-auto-zoom");
        this.zzh = new Object();
        this.zza = zzxmVar;
        this.zzg = new AtomicBoolean(false);
        this.zzb = zzbw.zzz();
        this.zzi = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        this.zzj = zzbbVarZza;
        this.zzk = zzwpVar;
        this.zzl = str;
        this.zze = 1;
        this.zzn = 1.0f;
        this.zzo = -1.0f;
        this.zzp = zzbbVarZza.zza();
    }

    public static zzxk zzd(Context context, String str) {
        return new zzxk(context, zzxm.zza, str);
    }

    public static /* synthetic */ void zzf(zzxk zzxkVar) {
        ScheduledFuture scheduledFuture;
        synchronized (zzxkVar.zzh) {
            try {
                if (zzxkVar.zze == 2 && !zzxkVar.zzg.get() && (scheduledFuture = zzxkVar.zzc) != null && !scheduledFuture.isCancelled()) {
                    if (zzxkVar.zzn > 1.0f && zzxkVar.zza() >= zzxkVar.zza.zzi()) {
                        zzf.i("AutoZoom", "Reset zoom = 1");
                        zzxkVar.zzl(1.0f, zzrc.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                    }
                }
            } finally {
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzg(zzxk zzxkVar, float f) {
        synchronized (zzxkVar.zzh) {
            zzxkVar.zzn = f;
            zzxkVar.zzr(false);
        }
    }

    private final float zzp(float f) {
        float f3 = this.zzo;
        if (f < 1.0f) {
            f = 1.0f;
        }
        return (f3 <= 0.0f || f <= f3) ? f : f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq(zzrc zzrcVar, float f, float f3, zzxn zzxnVar) {
        long jConvert;
        if (this.zzd != null) {
            zzuo zzuoVar = new zzuo();
            zzuoVar.zza(this.zzl);
            String str = this.zzd;
            str.getClass();
            zzuoVar.zze(str);
            zzuoVar.zzf(Float.valueOf(f));
            zzuoVar.zzc(Float.valueOf(f3));
            synchronized (this.zzh) {
                jConvert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzq, TimeUnit.NANOSECONDS);
            }
            zzuoVar.zzb(Long.valueOf(jConvert));
            if (zzxnVar != null) {
                zzup zzupVar = new zzup();
                zzupVar.zzc(Float.valueOf(zzxnVar.zzc()));
                zzupVar.zze(Float.valueOf(zzxnVar.zze()));
                zzupVar.zzb(Float.valueOf(zzxnVar.zzb()));
                zzupVar.zzd(Float.valueOf(zzxnVar.zzd()));
                zzupVar.zza(Float.valueOf(0.0f));
                zzuoVar.zzd(zzupVar.zzf());
            }
            zzwp zzwpVar = this.zzk;
            zzrd zzrdVar = new zzrd();
            zzrdVar.zzi(zzuoVar.zzh());
            zzwpVar.zzd(zzws.zzf(zzrdVar), zzrcVar);
        }
    }

    private final void zzr(boolean z4) {
        ScheduledFuture scheduledFuture;
        synchronized (this.zzh) {
            try {
                this.zzb.zzs();
                this.zzp = this.zzj.zza();
                if (z4 && (scheduledFuture = this.zzc) != null) {
                    scheduledFuture.cancel(false);
                    this.zzc = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final long zza() {
        long jConvert;
        synchronized (this.zzh) {
            jConvert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzp, TimeUnit.NANOSECONDS);
        }
        return jConvert;
    }

    public final /* synthetic */ zzet zzc(float f) throws Exception {
        AbstractC2339b abstractC2339b = this.zzs;
        zzp(f);
        abstractC2339b.getClass();
        int i = d.f20460g;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0259 A[Catch: all -> 0x01ac, Merged into TryCatch #0 {all -> 0x0010, all -> 0x01ac, blocks: (B:4:0x000a, B:6:0x000e, B:10:0x0013, B:12:0x0019, B:14:0x0022, B:17:0x002e, B:19:0x0032, B:20:0x003b, B:22:0x00a3, B:23:0x00a9, B:25:0x00af, B:28:0x00bd, B:29:0x00de, B:30:0x00ed, B:32:0x00f3, B:34:0x0107, B:36:0x0113, B:39:0x011b, B:40:0x0165, B:42:0x016f, B:43:0x017a, B:45:0x0186, B:47:0x018e, B:74:0x0277, B:49:0x0198, B:50:0x019a, B:77:0x027a, B:78:0x027b, B:51:0x019b, B:53:0x01a9, B:57:0x01af, B:58:0x01da, B:60:0x01e0, B:63:0x0209, B:65:0x0218, B:67:0x0227, B:69:0x0232, B:70:0x0257, B:72:0x0259, B:73:0x0276), top: B:82:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(int r19, com.google.android.gms.internal.mlkit_vision_barcode.zzxn r20) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode.zzxk.zzi(int, com.google.android.gms.internal.mlkit_vision_barcode.zzxn):void");
    }

    public final void zzj() {
        synchronized (this.zzh) {
            try {
                if (this.zze == 4) {
                    return;
                }
                zzn(false);
                this.zzi.shutdown();
                this.zze = 4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzk(float f) {
        synchronized (this.zzh) {
            zzaz.zzd(f >= 1.0f);
            this.zzo = f;
        }
    }

    @VisibleForTesting
    public final void zzl(float f, zzrc zzrcVar, zzxn zzxnVar) {
        synchronized (this.zzh) {
        }
    }

    public final void zzm() {
        synchronized (this.zzh) {
            try {
                int i = this.zze;
                if (i != 2 && i != 4) {
                    zzr(true);
                    this.zzc = this.zzi.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzxi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzxk.zzf(this.zza);
                        }
                    }, 500L, 500L, TimeUnit.MILLISECONDS);
                    if (this.zze == 1) {
                        this.zzd = UUID.randomUUID().toString();
                        this.zzq = this.zzj.zza();
                        this.zzr = false;
                        zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_START;
                        float f = this.zzn;
                        zzq(zzrcVar, f, f, null);
                    } else {
                        zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_RESUME;
                        float f3 = this.zzn;
                        zzq(zzrcVar2, f3, f3, null);
                    }
                    this.zze = 2;
                }
            } finally {
            }
        }
    }

    public final void zzn(boolean z4) {
        synchronized (this.zzh) {
            try {
                int i = this.zze;
                if (i != 1 && i != 4) {
                    zzr(true);
                    if (z4) {
                        if (!this.zzr) {
                            zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f = this.zzn;
                            zzq(zzrcVar, f, f, null);
                        }
                        zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f3 = this.zzn;
                        zzq(zzrcVar2, f3, f3, null);
                    } else {
                        zzrc zzrcVar3 = zzrc.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f7 = this.zzn;
                        zzq(zzrcVar3, f7, f7, null);
                    }
                    this.zzr = false;
                    this.zze = 1;
                    this.zzd = null;
                }
            } finally {
            }
        }
    }

    public final void zzo(AbstractC2339b abstractC2339b, Executor executor) {
        this.zzs = abstractC2339b;
        this.zzm = executor;
    }
}
