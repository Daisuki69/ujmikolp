package G;

import Z.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements RecyclerView.OnChildAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1684a;

    public b(d dVar) {
        this.f1684a = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(View view) {
        j.g(view, "view");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(View view) {
        j.g(view, "view");
        d dVar = this.f1684a;
        k kVar = dVar.e;
        if (kVar == null || !j.b(kVar.itemView, view)) {
            return;
        }
        dVar.f1686a.pause();
        dVar.e = null;
    }
}
