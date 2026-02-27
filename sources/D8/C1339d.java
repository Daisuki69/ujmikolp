package d8;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import f8.C1471d;

/* JADX INFO: renamed from: d8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1339d extends DefaultItemAnimator {
    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        if (!(viewHolder instanceof C1471d)) {
            return super.animateRemove(viewHolder);
        }
        ViewCompat.postOnAnimationDelayed(((C1471d) viewHolder).itemView, new androidx.window.layout.adapter.extensions.a((C1471d) viewHolder, 9), 300L);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final long getAddDuration() {
        return 100L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final long getRemoveDuration() {
        return 100L;
    }
}
