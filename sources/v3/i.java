package v3;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractSafeParcelable f20467b;

    public /* synthetic */ i(AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.f20466a = i;
        this.f20467b = abstractSafeParcelable;
    }

    public final String a() {
        switch (this.f20466a) {
            case 0:
                return ((zzyb) this.f20467b).zzm();
            default:
                return ((zzu) this.f20467b).zzb;
        }
    }
}
