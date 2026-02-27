package a7;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: a7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0645f implements RecyclerView.OnItemTouchListener {
    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent event) {
        kotlin.jvm.internal.j.g(rv, "rv");
        kotlin.jvm.internal.j.g(event, "event");
        if (event.getAction() != 0) {
            return false;
        }
        rv.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(RecyclerView rv, MotionEvent e) {
        kotlin.jvm.internal.j.g(rv, "rv");
        kotlin.jvm.internal.j.g(e, "e");
    }
}
