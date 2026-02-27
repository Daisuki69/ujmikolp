package X2;

import D.P;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import pi.C2154d;
import pi.InterfaceC2153c;
import v3.AbstractC2338a;
import w3.C2376a;
import x3.C2463b;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements InterfaceC2153c, zzwo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6481b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6482d;
    public Object e;
    public Object f;

    public f a() {
        return new f((JSONObject) this.f6481b, (Date) this.f6482d, (JSONArray) this.e, (JSONObject) this.c, this.f6480a, (JSONArray) this.f);
    }

    public void b() {
        if (((AtomicBoolean) this.e).compareAndSet(false, true)) {
            ((ScheduledThreadPoolExecutor) this.c).submit(new P((ConcurrentHashMap) this.f6482d, (ImpressionsObserverCacheDao) this.f6481b, (C2154d) this.f));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
    public zzwe zza() {
        v3.g gVar = (v3.g) this.f6481b;
        gVar.getClass();
        zzrp zzrpVar = new zzrp();
        zzqo zzqoVar = new zzqo();
        zzqoVar.zzc(Long.valueOf(this.f6480a));
        zzqoVar.zzd((zzrb) this.c);
        zzqoVar.zze(Boolean.valueOf(v3.g.f20463k));
        Boolean bool = Boolean.TRUE;
        zzqoVar.zza(bool);
        zzqoVar.zzb(bool);
        zzrpVar.zzh(zzqoVar.zzf());
        zzrpVar.zzi(AbstractC2338a.a(gVar.f20464d));
        zzrpVar.zze(((zzcp) this.f6482d).zzf());
        zzrpVar.zzf(((zzcp) this.e).zzf());
        C2376a c2376a = (C2376a) this.f;
        v3.g.j.getClass();
        int iB = C2463b.b(c2376a);
        zzqh zzqhVar = new zzqh();
        int i = c2376a.f;
        zzqhVar.zza(i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzqi.UNKNOWN_FORMAT : zzqi.NV21 : zzqi.NV16 : zzqi.YV12 : zzqi.YUV_420_888 : zzqi.BITMAP);
        zzqhVar.zzb(Integer.valueOf(iB));
        zzrpVar.zzg(zzqhVar.zzd());
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(gVar.i ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzrpVar.zzj());
        return zzws.zzf(zzrdVar);
    }
}
