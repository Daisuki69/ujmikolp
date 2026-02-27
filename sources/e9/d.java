package E9;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.MissionV2Action;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1337b;

    public d(ArrayList mOldMissionV2ActionItems, List mNewMissionV2ActionItems) {
        kotlin.jvm.internal.j.g(mOldMissionV2ActionItems, "mOldMissionV2ActionItems");
        kotlin.jvm.internal.j.g(mNewMissionV2ActionItems, "mNewMissionV2ActionItems");
        this.f1336a = mOldMissionV2ActionItems;
        this.f1337b = mNewMissionV2ActionItems;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b(this.f1336a.get(i), this.f1337b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b(((MissionV2Action) this.f1336a.get(i)).getId(), ((MissionV2Action) this.f1337b.get(i4)).getId());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f1337b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f1336a.size();
    }
}
