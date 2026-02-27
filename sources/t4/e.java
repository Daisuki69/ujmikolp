package t4;

import androidx.recyclerview.widget.RecyclerView;
import com.liaoinstan.springview.widget.SpringView;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SpringView f20159a;

    public e(SpringView springView) {
        this.f20159a = springView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        int i6 = SpringView.f10155q0;
        this.f20159a.j();
    }
}
