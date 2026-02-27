package N6;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4327b;

    public d(ArrayList mOldPaymentOptionList, List mNewPaymentOptionList) {
        j.g(mOldPaymentOptionList, "mOldPaymentOptionList");
        j.g(mNewPaymentOptionList, "mNewPaymentOptionList");
        this.f4326a = mOldPaymentOptionList;
        this.f4327b = mNewPaymentOptionList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return areItemsTheSame(i, i4);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return j.b(this.f4326a.get(i), this.f4327b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f4327b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f4326a.size();
    }
}
