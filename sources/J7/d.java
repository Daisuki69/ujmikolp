package J7;

import a7.C0633A;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0633A f2443b;

    public d(ArrayList mOldFieldList, C0633A c0633a) {
        kotlin.jvm.internal.j.g(mOldFieldList, "mOldFieldList");
        this.f2442a = mOldFieldList;
        this.f2443b = c0633a;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return areItemsTheSame(i, i4);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b(this.f2442a.get(i), this.f2443b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f2443b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f2442a.size();
    }
}
