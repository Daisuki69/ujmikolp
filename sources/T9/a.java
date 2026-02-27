package T9;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5816b;

    public a(ArrayList mOldFavoriteListItem, ArrayList arrayList) {
        j.g(mOldFavoriteListItem, "mOldFavoriteListItem");
        this.f5815a = mOldFavoriteListItem;
        this.f5816b = arrayList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return areItemsTheSame(i, i4);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return j.b(this.f5815a.get(i), this.f5816b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f5816b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f5815a.size();
    }
}
