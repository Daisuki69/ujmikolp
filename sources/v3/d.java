package v3;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import ph.C2070f1;
import r3.InterfaceC2187a;
import w3.C2376a;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends x3.c implements InterfaceC2187a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f20460g = 0;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r3.b bVar, g gVar, Executor executor, zzwp zzwpVar) {
        super(gVar, executor);
        bVar.getClass();
        boolean zC = AbstractC2338a.c();
        this.f = zC;
        zzrp zzrpVar = new zzrp();
        zzrpVar.zzi(AbstractC2338a.a(bVar));
        zzrr zzrrVarZzj = zzrpVar.zzj();
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(zC ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzrrVarZzj);
        zzwpVar.zzd(zzws.zzg(zzrdVar, 1), zzrc.ON_DEVICE_BARCODE_CREATE);
    }

    public final Task c(C2376a c2376a) {
        return b(c2376a).onSuccessTask(new C2070f1(this, c2376a.c, c2376a.f20687d));
    }

    @Override // x3.c, java.io.Closeable, java.lang.AutoCloseable, r3.InterfaceC2187a
    public final synchronized void close() {
        super.close();
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f ? p3.j.f19034a : new Feature[]{p3.j.f19035b};
    }
}
