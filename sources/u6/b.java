package U6;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5951b;

    public b(ArrayList contactsItemListOld, List list) {
        j.g(contactsItemListOld, "contactsItemListOld");
        this.f5950a = new ArrayList(contactsItemListOld);
        this.f5951b = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return j.b(this.f5950a.get(i), this.f5951b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return j.b(this.f5950a.get(i), this.f5951b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f5951b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f5950a.size();
    }
}
