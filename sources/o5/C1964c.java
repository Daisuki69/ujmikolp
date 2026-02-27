package o5;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.o;
import c5.C1075a;
import com.dynatrace.android.agent.Global;
import com.paymaya.adkit.presentation.verticalbannerad.view.VerticalBannerAd;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import p5.C2013a;
import r5.m;
import s5.g;
import x5.C2467a;
import zj.C2576A;

/* JADX INFO: renamed from: o5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1964c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerticalBannerAd f18776a;

    public C1964c(VerticalBannerAd verticalBannerAd) {
        this.f18776a = verticalBannerAd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        j.g(recyclerView, "recyclerView");
        int i4 = VerticalBannerAd.h;
        VerticalBannerAd verticalBannerAd = this.f18776a;
        verticalBannerAd.getClass();
        if (i != 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        View viewFindSnapView = new g().findSnapView(linearLayoutManager);
        int position = viewFindSnapView != null ? linearLayoutManager.getPosition(viewFindSnapView) : -1;
        if (j.b(verticalBannerAd.f10228g, TtmlNode.RIGHT) && position == -1) {
            C2013a c2013a = verticalBannerAd.f10227d;
            if (c2013a == null) {
                j.n("adapter");
                throw null;
            }
            position = c2013a.f19070a.size() - 1;
        } else if (position == -1) {
            return;
        }
        m mVar = verticalBannerAd.c;
        if (mVar == null) {
            j.n("viewModel");
            throw null;
        }
        String scrollDirection = verticalBannerAd.f10228g;
        j.g(scrollDirection, "scrollDirection");
        C2467a c2467a = mVar.f19870b;
        if (c2467a != null) {
            String strA0 = C2576A.a0(((o) ((ArrayList) mVar.c()).get(position)).f8535a, Global.HYPHEN);
            s5.m mVar2 = mVar.j;
            j.d(mVar2);
            c2467a.a("VERTICAL_BANNER_SWIPE", new C1075a(strA0, mVar2, null, null, null, null, null, null, null, null, scrollDirection, 1020).a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        j.g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i4);
        VerticalBannerAd verticalBannerAd = this.f18776a;
        if (i > 0) {
            verticalBannerAd.f10228g = TtmlNode.RIGHT;
        } else if (i < 0) {
            verticalBannerAd.f10228g = TtmlNode.LEFT;
        }
    }
}
