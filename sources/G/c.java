package G;

import androidx.recyclerview.widget.RecyclerView;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1685a;

    public c(d dVar) {
        this.f1685a = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        j.g(recyclerView, numX49.tnTj78("PhS"));
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            this.f1685a.b();
        }
    }
}
