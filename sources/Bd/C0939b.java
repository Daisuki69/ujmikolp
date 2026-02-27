package bd;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: bd.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0939b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0938a f8636b;

    public C0939b(int i, EnumC0938a enumC0938a) {
        this.f8635a = i;
        this.f8636b = enumC0938a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int iOrdinal = this.f8636b.ordinal();
        int i = this.f8635a;
        if (iOrdinal == 0) {
            if (childAdapterPosition == 0) {
                rect.left = i;
            }
            rect.right = i;
            return;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            int i4 = i * 2;
            if (recyclerView.getAdapter() != null && recyclerView.getAdapter().getItemCount() == 1) {
                rect.left = i4 + i;
            } else if (childAdapterPosition == 0) {
                rect.left = i4;
            }
            if (recyclerView.getAdapter() == null || childAdapterPosition != recyclerView.getAdapter().getItemCount() - 1 || childAdapterPosition == 0) {
                rect.right = i;
            } else {
                rect.right = i4;
            }
        }
    }
}
