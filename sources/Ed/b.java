package ed;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.Dated;
import com.paymaya.domain.model.UserActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16648b;

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f16647a = new ArrayList(arrayList);
        this.f16648b = new ArrayList(arrayList2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return ((Dated) this.f16647a.get(i)).equals(this.f16648b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        ArrayList arrayList = this.f16647a;
        boolean z4 = arrayList.get(i) instanceof UserActivity;
        ArrayList arrayList2 = this.f16648b;
        return (z4 && (arrayList2.get(i4) instanceof UserActivity)) ? ((UserActivity) arrayList.get(i)).mId().equals(((UserActivity) arrayList2.get(i4)).mId()) : ((Dated) arrayList.get(i)).getLocalDateTime().equals(((Dated) arrayList2.get(i4)).getLocalDateTime());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f16648b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f16647a.size();
    }
}
