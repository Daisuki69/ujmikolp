package Fd;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1574a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1575b;

    public b(Context context) {
        this.f1575b = context.getResources().getDimensionPixelSize(R.dimen.pma_margin_small);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        j.g(outRect, "outRect");
        j.g(view, "view");
        j.g(parent, "parent");
        j.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int i = this.f1574a;
        int i4 = childAdapterPosition % i;
        int i6 = this.f1575b;
        if (i4 == 0) {
            outRect.left = i6 * 2;
        } else if (i4 == i - 1) {
            outRect.right = i6 * 2;
        } else {
            outRect.left = i6;
            outRect.right = i6;
        }
        outRect.top = i6 * 2;
    }
}
