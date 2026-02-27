package ba;

import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bb.f f8587b;

    public /* synthetic */ j(Bb.f fVar, int i) {
        this.f8586a = i;
        this.f8587b = fVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8586a) {
            case 0:
                kotlin.jvm.internal.j.g((List) obj, numX49.tnTj78("bucrl"));
                ((MayaBaseLoadingFragment) ((ga.b) this.f8587b.c.get())).f10359n0 = true;
                break;
            default:
                kotlin.jvm.internal.j.g((List) obj, numX49.tnTj78("bucrz"));
                ((MayaBillersFragment) ((ga.b) this.f8587b.c.get())).f13379x0 = 1;
                break;
        }
    }
}
