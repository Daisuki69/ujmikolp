package f5;

import Bj.E;
import Bj.H;
import Bj.U;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import b5.C0910b;
import b5.C0912d;
import c5.C1075a;
import cj.C1110A;
import cj.C1132s;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import g5.C1501a;
import i5.l;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import x5.C2467a;

/* JADX INFO: renamed from: f5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1463a extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerAdCarousel f16708a;

    public C1463a(BannerAdCarousel bannerAdCarousel) {
        this.f16708a = bannerAdCarousel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        j.g(recyclerView, "recyclerView");
        BannerAdCarousel bannerAdCarousel = this.f16708a;
        boolean z4 = bannerAdCarousel.f10221n;
        if (i != 0) {
            return;
        }
        boolean z5 = false;
        bannerAdCarousel.f10221n = false;
        if (bannerAdCarousel.i) {
            bannerAdCarousel.d();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        View viewFindSnapView = new PagerSnapHelper().findSnapView(linearLayoutManager);
        int position = viewFindSnapView != null ? linearLayoutManager.getPosition(viewFindSnapView) : -1;
        if (position == -1 || position == bannerAdCarousel.f10219k) {
            return;
        }
        C1501a c1501a = bannerAdCarousel.c;
        if (c1501a == null) {
            j.n("adapter");
            throw null;
        }
        int size = position % c1501a.f16788a.size();
        int i4 = bannerAdCarousel.f10219k;
        C1501a c1501a2 = bannerAdCarousel.c;
        if (c1501a2 == null) {
            j.n("adapter");
            throw null;
        }
        int size2 = i4 % c1501a2.f16788a.size();
        l lVar = bannerAdCarousel.f10216b;
        if (lVar == null) {
            j.n("viewModel");
            throw null;
        }
        if (C1132s.e(lVar.c()).a(size)) {
            C0912d c0912d = (C0912d) C1110A.C(size, lVar.c());
            if ((c0912d != null ? c0912d.c : null) != null) {
                C0912d c0912d2 = (C0912d) ((ArrayList) lVar.c()).get(size);
                C0910b c0910b = ((C0912d) ((ArrayList) lVar.c()).get(size)).c;
                j.d(c0910b);
                if (!lVar.f17118k.contains(c0912d2.f8520a)) {
                    lVar.g(c0912d2);
                }
                if (!z4) {
                    boolean z8 = size2 == ((ArrayList) lVar.c()).size() - 1 && size == 0;
                    if (size == ((ArrayList) lVar.c()).size() - 1 && size2 == 0) {
                        z5 = true;
                    }
                    String str = ((size >= size2 || z8) && !z5) ? "next" : "previous";
                    C2467a c2467a = lVar.c;
                    if (c2467a != null) {
                        s5.d dVar = lVar.m;
                        j.d(dVar);
                        c2467a.a("BANNER_SWIPE", new C1075a(c0910b.f8516a, dVar, c0910b.f8518d, c0910b.e, c0910b.f, null, null, null, null, null, str, 992).a());
                    }
                }
                E viewModelScope = ViewModelKt.getViewModelScope(lVar);
                lVar.f17116d.getClass();
                Ij.e eVar = U.f603a;
                H.w(viewModelScope, Ij.d.f2362a, null, new i5.j(lVar, size, null), 2);
            }
        }
        bannerAdCarousel.f10219k = position;
    }
}
