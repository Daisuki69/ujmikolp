package A3;

import A3.g;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_face.zzdl;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzke;
import com.google.android.gms.internal.mlkit_vision_face.zzkf;
import com.google.android.gms.internal.mlkit_vision_face.zzkj;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoe;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.AbstractC1780a;
import p3.m;
import w3.C2376a;
import x3.C2462a;
import x3.C2463b;
import y3.C2503d;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends AbstractC1780a {
    public static final AtomicBoolean j = new AtomicBoolean(true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C2463b f36k = C2463b.f20895b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2503d f37d;
    public final zzoc e;
    public final zzoe f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f38g;
    public boolean h;
    public final C2462a i;

    public h(zzoc zzocVar, C2503d c2503d, c cVar) {
        super(1);
        this.i = new C2462a();
        Preconditions.checkNotNull(c2503d, "FaceDetectorOptions can not be null");
        this.f37d = c2503d;
        this.e = zzocVar;
        this.f38g = cVar;
        this.f = zzoe.zza(p3.g.c().b());
    }

    @Override // ki.AbstractC1780a
    public final synchronized void c() {
        this.h = this.f38g.zzd();
    }

    @Override // ki.AbstractC1780a
    public final synchronized void e() {
        try {
            this.f38g.zzb();
            j.set(true);
            zzoc zzocVar = this.e;
            zzku zzkuVar = new zzku();
            zzkuVar.zze(this.h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
            zzocVar.zzd(zzof.zzf(zzkuVar), zzkt.ON_DEVICE_FACE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113 A[Catch: all -> 0x002b, MlKitException -> 0x002e, Merged into TryCatch #1 {all -> 0x002b, MlKitException -> 0x002e, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0033, B:46:0x010d, B:54:0x0123, B:53:0x011d, B:49:0x0113, B:19:0x0041, B:20:0x0048, B:21:0x0051, B:23:0x0057, B:24:0x0062, B:26:0x0068, B:28:0x0072, B:30:0x0076, B:32:0x007c, B:34:0x00cd, B:35:0x00d5, B:37:0x00db, B:40:0x00ef, B:43:0x00fc, B:45:0x0105, B:58:0x0130, B:60:0x0136, B:63:0x013d, B:64:0x0146, B:62:0x013a), top: B:68:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d A[Catch: all -> 0x002b, MlKitException -> 0x002e, Merged into TryCatch #1 {all -> 0x002b, MlKitException -> 0x002e, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0033, B:46:0x010d, B:54:0x0123, B:53:0x011d, B:49:0x0113, B:19:0x0041, B:20:0x0048, B:21:0x0051, B:23:0x0057, B:24:0x0062, B:26:0x0068, B:28:0x0072, B:30:0x0076, B:32:0x007c, B:34:0x00cd, B:35:0x00d5, B:37:0x00db, B:40:0x00ef, B:43:0x00fc, B:45:0x0105, B:58:0x0130, B:60:0x0136, B:63:0x013d, B:64:0x0146, B:62:0x013a), top: B:68:0x0005 }] */
    @Override // ki.AbstractC1780a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List g(w3.C2376a r20) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.h.g(w3.a):java.util.List");
    }

    public final synchronized void m(final zzks zzksVar, long j6, final C2376a c2376a, final int i, final int i4) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j6;
        this.e.zzf(new zzoa() { // from class: A3.f
            @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
            public final zznr zza() {
                h hVar = this.f32a;
                hVar.getClass();
                zzlj zzljVar = new zzlj();
                zzkj zzkjVar = new zzkj();
                zzkjVar.zzc(Long.valueOf(jElapsedRealtime));
                zzkjVar.zzd(zzksVar);
                zzkjVar.zze(Boolean.valueOf(h.j.get()));
                Boolean bool = Boolean.TRUE;
                zzkjVar.zza(bool);
                zzkjVar.zzb(bool);
                zzljVar.zzg(zzkjVar.zzf());
                zzljVar.zze(j.a(hVar.f37d));
                zzljVar.zzd(Integer.valueOf(i));
                zzljVar.zzh(Integer.valueOf(i4));
                h.f36k.getClass();
                C2376a c2376a2 = c2376a;
                int iB = C2463b.b(c2376a2);
                zzke zzkeVar = new zzke();
                int i6 = c2376a2.f;
                zzkeVar.zza(i6 != -1 ? i6 != 35 ? i6 != 842094169 ? i6 != 16 ? i6 != 17 ? zzkf.UNKNOWN_FORMAT : zzkf.NV21 : zzkf.NV16 : zzkf.YV12 : zzkf.YUV_420_888 : zzkf.BITMAP);
                zzkeVar.zzb(Integer.valueOf(iB));
                zzljVar.zzf(zzkeVar.zzd());
                zzll zzllVarZzi = zzljVar.zzi();
                zzku zzkuVar = new zzku();
                zzkuVar.zze(hVar.h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
                zzkuVar.zzg(zzllVarZzi);
                return zzof.zzf(zzkuVar);
            }
        }, zzkt.ON_DEVICE_FACE_DETECT);
        zzdl zzdlVar = new zzdl();
        zzdlVar.zzc(zzksVar);
        zzdlVar.zzd(Boolean.valueOf(j.get()));
        zzdlVar.zza(Integer.valueOf(i));
        zzdlVar.zze(Integer.valueOf(i4));
        zzdlVar.zzb(j.a(this.f37d));
        final zzdn zzdnVarZzf = zzdlVar.zzf();
        final g gVar = new g(this);
        final zzoc zzocVar = this.e;
        final zzkt zzktVar = zzkt.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        final byte[] bArr = null;
        m.f19041a.execute(new Runnable(zzktVar, zzdnVarZzf, jElapsedRealtime, gVar, bArr) { // from class: com.google.android.gms.internal.mlkit_vision_face.zzny
            public final /* synthetic */ zzkt zzb;
            public final /* synthetic */ Object zzc;
            public final /* synthetic */ long zzd;
            public final /* synthetic */ g zze;

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f.zzc(true != this.h ? 24303 : 24304, zzksVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }
}
