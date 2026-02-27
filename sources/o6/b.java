package O6;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends DividerItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f4759a;

    @Override // androidx.recyclerview.widget.DividerItemDecoration, androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        j.g(canvas, "canvas");
        j.g(parent, "parent");
        j.g(state, "state");
        Drawable drawable = this.f4759a;
        if (drawable != null) {
            canvas.save();
            int paddingLeft = parent.getPaddingLeft();
            int width = parent.getWidth() - parent.getPaddingRight();
            int childCount = parent.getChildCount() - 1;
            for (int i = 0; i < childCount; i++) {
                View childAt = parent.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                j.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
                drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                drawable.draw(canvas);
            }
            canvas.restore();
        }
    }
}
