package v3;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.mlkit.common.MlKitException;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC1780a;
import p3.m;
import t3.C2268a;
import w3.C2376a;
import x3.C2462a;
import x3.C2463b;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends AbstractC1780a {
    public static final C2463b j = C2463b.f20895b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f20463k = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r3.b f20464d;
    public final h e;
    public final zzwp f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzwr f20465g;
    public final C2462a h;
    public boolean i;

    public g(p3.g gVar, r3.b bVar, h hVar, zzwp zzwpVar) {
        super(1);
        this.h = new C2462a();
        Preconditions.checkNotNull(gVar, numX49.tnTj78("bbcS"));
        Preconditions.checkNotNull(bVar, numX49.tnTj78("bbcj"));
        this.f20464d = bVar;
        this.e = hVar;
        this.f = zzwpVar;
        this.f20465g = zzwr.zza(gVar.b());
    }

    @Override // ki.AbstractC1780a
    public final synchronized void c() {
        this.i = this.e.zzc();
    }

    @Override // ki.AbstractC1780a
    public final synchronized void e() {
        try {
            this.e.zzb();
            f20463k = true;
            zzrd zzrdVar = new zzrd();
            zzra zzraVar = this.i ? zzra.TYPE_THICK : zzra.TYPE_THIN;
            zzwp zzwpVar = this.f;
            zzrdVar.zze(zzraVar);
            zzrp zzrpVar = new zzrp();
            zzrpVar.zzi(AbstractC2338a.a(this.f20464d));
            zzrdVar.zzg(zzrpVar.zzj());
            zzwpVar.zzd(zzws.zzf(zzrdVar), zzrc.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ki.AbstractC1780a
    public final List g(C2376a c2376a) throws Throwable {
        g gVar;
        C2376a c2376a2;
        synchronized (this) {
            try {
                try {
                    C2462a c2462a = this.h;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c2462a.a(c2376a);
                    try {
                        ArrayList arrayListA = this.e.a(c2376a);
                        gVar = this;
                        c2376a2 = c2376a;
                        try {
                            gVar.m(zzrb.NO_ERROR, jElapsedRealtime, c2376a2, arrayListA);
                            f20463k = false;
                            return arrayListA;
                        } catch (MlKitException e) {
                            e = e;
                            MlKitException mlKitException = e;
                            gVar.m(mlKitException.f10040a == 14 ? zzrb.MODEL_NOT_DOWNLOADED : zzrb.UNKNOWN_ERROR, jElapsedRealtime, c2376a2, null);
                            throw mlKitException;
                        }
                    } catch (MlKitException e7) {
                        e = e7;
                        gVar = this;
                        c2376a2 = c2376a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void m(zzrb zzrbVar, long j6, C2376a c2376a, List list) {
        int iZza;
        int iZzb;
        zzcp zzcpVar = new zzcp();
        zzcp zzcpVar2 = new zzcp();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2268a c2268a = (C2268a) it.next();
                i iVar = c2268a.f20149a;
                switch (iVar.f20466a) {
                    case 0:
                        iZza = ((zzyb) iVar.f20467b).zza();
                        break;
                    default:
                        iZza = ((zzu) iVar.f20467b).zza;
                        break;
                }
                if (iZza > 4096 || iZza == 0) {
                    iZza = -1;
                }
                zzrn zzrnVar = (zzrn) AbstractC2338a.f20455a.get(iZza);
                if (zzrnVar == null) {
                    zzrnVar = zzrn.FORMAT_UNKNOWN;
                }
                zzcpVar.zzd(zzrnVar);
                i iVar2 = c2268a.f20149a;
                switch (iVar2.f20466a) {
                    case 0:
                        iZzb = ((zzyb) iVar2.f20467b).zzb();
                        break;
                    default:
                        iZzb = ((zzu) iVar2.f20467b).zzd;
                        break;
                }
                zzro zzroVar = (zzro) AbstractC2338a.f20456b.get(iZzb);
                if (zzroVar == null) {
                    zzroVar = zzro.TYPE_UNKNOWN;
                }
                zzcpVar2.zzd(zzroVar);
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j6;
        X2.e eVar = new X2.e();
        eVar.f6481b = this;
        eVar.f6480a = jElapsedRealtime;
        eVar.c = zzrbVar;
        eVar.f6482d = zzcpVar;
        eVar.e = zzcpVar2;
        eVar.f = c2376a;
        this.f.zzf(eVar, zzrc.ON_DEVICE_BARCODE_DETECT);
        zzfr zzfrVar = new zzfr();
        zzfrVar.zze(zzrbVar);
        zzfrVar.zzf(Boolean.valueOf(f20463k));
        zzfrVar.zzg(AbstractC2338a.a(this.f20464d));
        zzfrVar.zzc(zzcpVar.zzf());
        zzfrVar.zzd(zzcpVar2.zzf());
        final zzft zzftVarZzh = zzfrVar.zzh();
        final f fVar = new f(this);
        final zzrc zzrcVar = zzrc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        m mVar = m.f19041a;
        final zzwp zzwpVar = this.f;
        mVar.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwn
            @Override // java.lang.Runnable
            public final void run() {
                zzwpVar.zzh(zzrcVar, zzftVarZzh, jElapsedRealtime, fVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = jCurrentTimeMillis - jElapsedRealtime;
        this.f20465g.zzc(true != this.i ? 24301 : 24302, zzrbVar.zza(), j7, jCurrentTimeMillis);
    }
}
