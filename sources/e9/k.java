package E9;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.MissionsV2ListItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1348b;

    public k(ArrayList arrayList, List list) {
        kotlin.jvm.internal.j.d(arrayList);
        this.f1347a = new ArrayList(arrayList);
        kotlin.jvm.internal.j.d(list);
        this.f1348b = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b((MissionsV2ListItem) this.f1347a.get(i), (MissionsV2ListItem) this.f1348b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return ((MissionsV2ListItem) this.f1347a.get(i)).getViewTypeMissionV2() == ((MissionsV2ListItem) this.f1348b.get(i4)).getViewTypeMissionV2();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f1348b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f1347a.size();
    }
}
