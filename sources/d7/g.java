package D7;

import androidx.recyclerview.widget.DiffUtil;
import dj.C1406d;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1406d f1000b;

    public g(ArrayList oldServiceSectionItems, C1406d c1406d) {
        j.g(oldServiceSectionItems, "oldServiceSectionItems");
        this.f999a = oldServiceSectionItems;
        this.f1000b = c1406d;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        J7.j jVar = (J7.j) this.f999a.get(i);
        J7.j jVar2 = (J7.j) this.f1000b.get(i4);
        return ((jVar instanceof J7.g) && (jVar2 instanceof J7.g)) ? j.b(((J7.g) jVar).f2445b, ((J7.g) jVar2).f2445b) : ((jVar instanceof J7.f) && (jVar2 instanceof J7.f)) ? j.b(((J7.f) jVar).f2444b, ((J7.f) jVar2).f2444b) : j.b(jVar, jVar2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        ArrayList arrayList = this.f999a;
        J7.j jVar = (J7.j) arrayList.get(i);
        C1406d c1406d = this.f1000b;
        J7.j jVar2 = (J7.j) c1406d.get(i4);
        if (jVar.f2447a != jVar2.f2447a) {
            return false;
        }
        return ((jVar instanceof J7.g) && (jVar2 instanceof J7.g)) ? j.b(((J7.g) jVar).f2445b.getId(), ((J7.g) jVar2).f2445b.getId()) : ((jVar instanceof J7.f) && (jVar2 instanceof J7.f)) ? j.b(((J7.f) jVar).f2444b, ((J7.f) jVar2).f2444b) : j.b(arrayList.get(i), c1406d.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f1000b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f999a.size();
    }
}
