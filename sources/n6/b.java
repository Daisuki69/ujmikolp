package N6;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4323b;

    public b(ArrayList mOldLoadUpPartnerList, List mNewLoadUpPartnerList) {
        j.g(mOldLoadUpPartnerList, "mOldLoadUpPartnerList");
        j.g(mNewLoadUpPartnerList, "mNewLoadUpPartnerList");
        this.f4322a = mOldLoadUpPartnerList;
        this.f4323b = mNewLoadUpPartnerList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return areItemsTheSame(i, i4);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return j.b(this.f4322a.get(i), this.f4323b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f4323b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f4322a.size();
    }
}
