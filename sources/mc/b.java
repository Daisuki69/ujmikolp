package mc;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18398b;

    public b(ArrayList mOldTravelSelection, ArrayList arrayList) {
        j.g(mOldTravelSelection, "mOldTravelSelection");
        this.f18397a = mOldTravelSelection;
        this.f18398b = arrayList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return areItemsTheSame(i, i4);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return j.b(this.f18397a.get(i), this.f18398b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f18398b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f18397a.size();
    }
}
