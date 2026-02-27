package B3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements zzel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f338b = new h(0);
    public static final h c = new h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f339d = new h(2);
    public static final h e = new h(3);
    public static final h f = new h(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f340a;

    public /* synthetic */ h(int i) {
        this.f340a = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel
    public final boolean zza(int i) {
        switch (this.f340a) {
            case 0:
                if (i == 0 || i == 1 || i == 2) {
                }
                break;
            case 1:
                if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                }
                break;
            case 2:
                if (S1.r.B(i) != 0) {
                }
                break;
            case 3:
                if (S1.s.w(i) != 0) {
                }
                break;
            default:
                if (i == 0 || i == 1 || i == 2) {
                }
                break;
        }
        return true;
    }
}
