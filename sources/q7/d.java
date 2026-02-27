package q7;

import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreFragment;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaCreatorStoreFragment f19751a;

    public d(MayaCreatorStoreFragment mayaCreatorStoreFragment) {
        this.f19751a = mayaCreatorStoreFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        j.g(recyclerView, "recyclerView");
        this.f19751a.P1();
    }
}
