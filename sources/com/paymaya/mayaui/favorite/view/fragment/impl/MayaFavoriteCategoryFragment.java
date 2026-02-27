package com.paymaya.mayaui.favorite.view.fragment.impl;

import N5.Q;
import O5.a;
import X7.c;
import Y7.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import c8.b;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.favorite.model.FavoriteCategory;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaFavoriteActivity;
import d8.C1339d;
import d8.InterfaceC1338c;
import java.util.Locale;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaFavoriteCategoryFragment extends MayaBaseFragment implements b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Q f12339U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public d f12340V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public RecyclerView f12341W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Group f12342X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public InterfaceC1338c f12343Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public U7.b f12344Z;

    public final String G1() {
        Bundle arguments = getArguments();
        FavoriteCategory favoriteCategory = arguments != null ? (FavoriteCategory) arguments.getParcelable("favorite_category") : null;
        if (favoriteCategory == null) {
            return null;
        }
        Locale locale = Locale.getDefault();
        j.f(locale, "getDefault(...)");
        String lowerCase = favoriteCategory.f12314a.toLowerCase(locale);
        j.f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final c H1() {
        d dVar = this.f12340V;
        if (dVar != null) {
            return dVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final void I1() {
        m1().r(EnumC1216e.EMPTY);
        RecyclerView recyclerView = this.f12341W;
        if (recyclerView == null) {
            j.n("mRecyclerView");
            throw null;
        }
        recyclerView.setVisibility(8);
        Group group = this.f12342X;
        if (group != null) {
            group.setVisibility(0);
        } else {
            j.n("mGroupNoFavorites");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put(SessionDescription.ATTR_TYPE, G1());
        c1219hM1.i();
        this.f12343Y = (InterfaceC1338c) getActivity();
        a aVar = W4.a.e().m().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        com.paymaya.domain.store.Q q9 = aVar.q();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(sessionSubject, "sessionSubject");
        this.f12340V = new d(q9, sessionSubject);
        ((AbstractC2509a) H1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_favorite_category, viewGroup, false);
        int i = R.id.group_no_favorites;
        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_no_favorites);
        if (group != null) {
            i = R.id.image_view_no_saved_favorites;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_no_saved_favorites)) != null) {
                i = R.id.recycler_view_favorites;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_favorites);
                if (recyclerView != null) {
                    i = R.id.text_view_no_saved_favorites;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_no_saved_favorites)) != null) {
                        i = R.id.text_view_no_saved_favorites_description;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_no_saved_favorites_description)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.f12339U = new Q(constraintLayout, group, recyclerView);
                            j.f(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) H1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f12339U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        F1();
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put(SessionDescription.ATTR_TYPE, G1());
        A1(c1219h);
        InterfaceC1338c interfaceC1338c = this.f12343Y;
        if (interfaceC1338c != null) {
            ((MayaFavoriteActivity) interfaceC1338c).Q(this);
        }
        c cVarH1 = H1();
        InterfaceC1338c interfaceC1338c2 = this.f12343Y;
        ((d) cVarH1).m(interfaceC1338c2 != null ? ((MayaFavoriteActivity) interfaceC1338c2).V1() : null);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Q q9 = this.f12339U;
        j.d(q9);
        this.f12341W = q9.c;
        Q q10 = this.f12339U;
        j.d(q10);
        this.f12342X = q10.f3874d;
        this.f12344Z = new U7.b(this);
        RecyclerView recyclerView = this.f12341W;
        if (recyclerView == null) {
            j.n("mRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = this.f12341W;
        if (recyclerView2 == null) {
            j.n("mRecyclerView");
            throw null;
        }
        recyclerView2.setAdapter(this.f12344Z);
        RecyclerView recyclerView3 = this.f12341W;
        if (recyclerView3 == null) {
            j.n("mRecyclerView");
            throw null;
        }
        recyclerView3.setItemAnimator(new C1339d());
        c cVarH1 = H1();
        InterfaceC1338c interfaceC1338c = this.f12343Y;
        ((d) cVarH1).m(interfaceC1338c != null ? ((MayaFavoriteActivity) interfaceC1338c).V1() : null);
    }
}
