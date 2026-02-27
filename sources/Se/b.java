package Se;

import com.shield.android.h.b;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements IntPredicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5722a;

    public /* synthetic */ b(int i) {
        this.f5722a = i;
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        switch (this.f5722a) {
            case 0:
                return b.e.d.g(i);
            default:
                return com.shield.android.n.a.n(i);
        }
    }
}
