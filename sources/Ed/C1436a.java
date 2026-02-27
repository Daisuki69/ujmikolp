package ed;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.CarouselItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: ed.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1436a extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f16645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f16646b;

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return ((CarouselItem) this.f16645a.get(i)).equals(this.f16646b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return ((CarouselItem) this.f16645a.get(i)).getPropertyId().equals(((CarouselItem) this.f16646b.get(i4)).getPropertyId());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f16646b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f16645a.size();
    }
}
