package G5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1764b;
    public final int c;

    public r(int i, int i4, int i6) {
        this.f1763a = i;
        this.f1764b = i4;
        this.c = i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        if (childAdapterPosition == 0) {
            rect.left = this.f1764b;
        }
        if (recyclerView.getAdapter() == null || childAdapterPosition != recyclerView.getAdapter().getItemCount() - 1 || childAdapterPosition == 0) {
            rect.right = this.f1763a;
        } else {
            rect.right = this.c;
        }
    }
}
