package a7;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;

/* JADX INFO: renamed from: a7.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0652m extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7031b;

    public C0652m(List mOldChoicesListItem, List list) {
        kotlin.jvm.internal.j.g(mOldChoicesListItem, "mOldChoicesListItem");
        this.f7030a = mOldChoicesListItem;
        this.f7031b = list;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return areItemsTheSame(i, i4);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b(this.f7030a.get(i), this.f7031b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f7031b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f7030a.size();
    }
}
