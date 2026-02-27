package mc;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: mc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1861a extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18396b;

    public C1861a(ArrayList mOldOnlinePaymentList, List list) {
        j.g(mOldOnlinePaymentList, "mOldOnlinePaymentList");
        this.f18395a = mOldOnlinePaymentList;
        this.f18396b = list;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return areItemsTheSame(i, i4);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return j.b(this.f18395a.get(i), this.f18396b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f18396b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f18395a.size();
    }
}
