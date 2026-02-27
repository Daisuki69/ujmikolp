package ba;

import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bb.f f8593b;

    public /* synthetic */ m(Bb.f fVar, int i) {
        this.f8592a = i;
        this.f8593b = fVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8592a) {
            case 0:
                List list = (List) obj;
                kotlin.jvm.internal.j.g(list, numX49.tnTj78("bucb"));
                Bb.f fVar = this.f8593b;
                fVar.getClass();
                if (!list.isEmpty()) {
                    ((MayaBillersFragment) ((ga.b) fVar.c.get())).f13379x0++;
                } else {
                    ((MayaBillersFragment) ((ga.b) fVar.c.get())).R1(true);
                }
                break;
            default:
                List list2 = (List) obj;
                kotlin.jvm.internal.j.g(list2, numX49.tnTj78("bucP"));
                if (((MayaBaseLoadingFragment) ((ga.b) this.f8593b.c.get())).f10359n0) {
                    this.f8593b.A(list2);
                    break;
                }
                break;
        }
    }
}
