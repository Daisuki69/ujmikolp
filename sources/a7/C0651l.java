package a7;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: a7.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0651l extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0650k f7029b;
    public final boolean c;

    public C0651l(int i, EnumC0650k mCarouselDividerMode, boolean z4) {
        kotlin.jvm.internal.j.g(mCarouselDividerMode, "mCarouselDividerMode");
        this.f7028a = i;
        this.f7029b = mCarouselDividerMode;
        this.c = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        kotlin.jvm.internal.j.g(outRect, "outRect");
        kotlin.jvm.internal.j.g(view, "view");
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.j.g(state, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int iOrdinal = this.f7029b.ordinal();
        int i = this.f7028a;
        if (iOrdinal == 0) {
            if (childAdapterPosition == 0) {
                outRect.left = i;
            }
            outRect.right = i;
            return;
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = i * 2;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount == 1) {
            if (this.c) {
                outRect.left = i;
            } else {
                outRect.left = i4 + i;
            }
        } else if (childAdapterPosition == 0) {
            outRect.left = i4;
        }
        if (recyclerView.getAdapter() == null || childAdapterPosition != itemCount - 1 || childAdapterPosition == 0) {
            outRect.right = i;
        } else {
            outRect.right = i4;
        }
    }
}
