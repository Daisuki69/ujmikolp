package D7;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.Dated;
import com.paymaya.domain.model.UserActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f994b;

    public e(ArrayList arrayList, List mDatedListOld) {
        j.g(mDatedListOld, "mDatedListOld");
        this.f993a = mDatedListOld;
        this.f994b = arrayList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return j.b(this.f993a.get(i), this.f994b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        List list = this.f993a;
        boolean z4 = list.get(i) instanceof UserActivity;
        ArrayList arrayList = this.f994b;
        if (!z4 || !(arrayList.get(i4) instanceof UserActivity)) {
            return j.b(((Dated) list.get(i)).getLocalDateTime(), ((Dated) arrayList.get(i4)).getLocalDateTime());
        }
        UserActivity userActivity = (UserActivity) list.get(i);
        String strMId = userActivity != null ? userActivity.mId() : null;
        UserActivity userActivity2 = (UserActivity) arrayList.get(i4);
        return j.b(strMId, userActivity2 != null ? userActivity2.mId() : null);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f994b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f993a.size();
    }
}
