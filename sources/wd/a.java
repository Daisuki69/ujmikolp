package Wd;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6340b;

    public a(ArrayList mOldFavoriteListItem, ArrayList mNewFavoriteListItem) {
        j.g(mOldFavoriteListItem, "mOldFavoriteListItem");
        j.g(mNewFavoriteListItem, "mNewFavoriteListItem");
        this.f6339a = mOldFavoriteListItem;
        this.f6340b = mNewFavoriteListItem;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return areItemsTheSame(i, i4);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return j.b(this.f6339a.get(i), this.f6340b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f6340b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f6339a.size();
    }
}
