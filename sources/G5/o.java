package G5;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1760a;

    public o(Context context) {
        this.f1760a = context.getResources().getDimensionPixelSize(R.dimen.pma_padding_10dp);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        kotlin.jvm.internal.j.g(outRect, "outRect");
        kotlin.jvm.internal.j.g(view, "view");
        kotlin.jvm.internal.j.g(parent, "parent");
        kotlin.jvm.internal.j.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int i = this.f1760a;
        outRect.set(i, i, i, i);
    }
}
