package o6;

import Gj.t;
import N5.C0489y;
import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.Bank;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1269l;
import com.paymaya.domain.store.Q;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1932c;
import s6.InterfaceC2242c;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends AbstractC2509a implements InterfaceC1932c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1269l f18806d;
    public final Q e;
    public final com.paymaya.data.preference.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S5.c f18807g;
    public boolean h;

    public n(C1269l c1269l, Q q9, com.paymaya.data.preference.a aVar, S5.c cVar, Uh.d dVar) {
        super(dVar);
        this.f18806d = c1269l;
        this.e = q9;
        this.f = aVar;
        this.f18807g = cVar;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Intent intent;
        Intent intent2;
        super.j();
        FragmentActivity activity = ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).getActivity();
        if (9 == C.w((activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getDataString())) {
            MayaBankTransferListFragment mayaBankTransferListFragment = (MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get());
            C1219h c1219hM1 = mayaBankTransferListFragment.m1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hM1.j.put("from_deep_link", "true");
            FragmentActivity activity2 = mayaBankTransferListFragment.getActivity();
            if (activity2 == null || (intent = activity2.getIntent()) == null) {
                return;
            }
            intent.setData(null);
        }
    }

    public final Lh.d k() {
        return new Lh.d(new Lh.d(new Lh.h(this.e.a("bank"), zh.b.a(), 0), new i(this, 1), 2), new j(this), 0);
    }

    public final void l(PayMayaError payMayaError) {
        List listB = this.f18806d.b();
        kotlin.jvm.internal.j.f(listB, "getBanks(...)");
        if (!listB.isEmpty()) {
            RecyclerView recyclerView = ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).f11561V;
            if (recyclerView == null) {
                kotlin.jvm.internal.j.n("mRecyclerViewBankNames");
                throw null;
            }
            recyclerView.setVisibility(0);
            InterfaceC2242c interfaceC2242c = (InterfaceC2242c) this.c.get();
            List listB2 = this.f18806d.b();
            kotlin.jvm.internal.j.f(listB2, "getBanks(...)");
            MayaBankTransferListFragment mayaBankTransferListFragment = (MayaBankTransferListFragment) interfaceC2242c;
            mayaBankTransferListFragment.getClass();
            r6.b bVar = mayaBankTransferListFragment.f11575j0;
            if (bVar != null) {
                bVar.submitList(listB2);
            }
        }
        ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).H1();
    }

    public final void m(List banks) {
        kotlin.jvm.internal.j.g(banks, "banks");
        ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).H1();
        RecyclerView recyclerView = ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).f11561V;
        if (recyclerView == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewBankNames");
            throw null;
        }
        recyclerView.setVisibility(0);
        MayaBankTransferListFragment mayaBankTransferListFragment = (MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get());
        mayaBankTransferListFragment.getClass();
        r6.b bVar = mayaBankTransferListFragment.f11575j0;
        if (bVar != null) {
            bVar.submitList(banks);
        }
    }

    public final void n(List favorites) {
        List list = favorites;
        if (list == null || list.isEmpty()) {
            ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).K1();
            AppCompatTextView appCompatTextView = ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).f11567b0;
            if (appCompatTextView == null) {
                kotlin.jvm.internal.j.n("mTextViewEmptyFavorites");
                throw null;
            }
            appCompatTextView.setVisibility(0);
            TextView textView = ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).f11566a0;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mTextViewViewAllFavorites");
                throw null;
            }
            textView.setVisibility(8);
        } else {
            MayaBankTransferListFragment mayaBankTransferListFragment = (MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get());
            mayaBankTransferListFragment.getClass();
            kotlin.jvm.internal.j.g(favorites, "favorites");
            r6.a aVar = mayaBankTransferListFragment.f11576k0;
            if (aVar != null) {
                aVar.submitList(favorites);
            }
            RecyclerView recyclerView = ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).f11570e0;
            if (recyclerView == null) {
                kotlin.jvm.internal.j.n("mRecyclerViewFavorites");
                throw null;
            }
            recyclerView.setVisibility(0);
            ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).I1();
            TextView textView2 = ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).f11566a0;
            if (textView2 == null) {
                kotlin.jvm.internal.j.n("mTextViewViewAllFavorites");
                throw null;
            }
            textView2.setVisibility(0);
        }
        ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).L1();
    }

    public final void o(PayMayaError payMayaError) {
        ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).P1();
        ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).K1();
        ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).I1();
        TextView textView = ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).f11566a0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewViewAllFavorites");
            throw null;
        }
        textView.setVisibility(8);
        ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).L1();
        C0489y c0489y = ((MayaBankTransferListFragment) ((InterfaceC2242c) this.c.get())).f11569d0;
        if (c0489y != null) {
            c0489y.f4296b.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mViewFavoritesError");
            throw null;
        }
    }

    public final ArrayList p(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Favorite favorite = (Favorite) it.next();
                String strMMeta = favorite.mContentPreview().mMeta();
                C1269l c1269l = this.f18806d;
                c1269l.getClass();
                t tVar = new t();
                tVar.f2032b = strMMeta;
                Bank bankC = c1269l.f11457b.c(tVar);
                Favorite favoriteBuild = favorite.toBuilder().mIsMaintenance(Boolean.valueOf(bankC != null ? kotlin.jvm.internal.j.b(bankC.mIsMaintenance(), Boolean.TRUE) : false)).build();
                kotlin.jvm.internal.j.f(favoriteBuild, "build(...)");
                arrayList.add(favoriteBuild);
            }
        }
        return arrayList;
    }
}
