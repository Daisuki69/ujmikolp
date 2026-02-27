package com.paymaya.mayaui.cashin.view.fragment.impl;

import Ah.a;
import Ah.o;
import D8.C0214w;
import G6.u;
import Hh.f;
import J6.g;
import K6.n;
import L6.E;
import L6.F;
import N5.C0453g;
import S5.c;
import W6.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.AddMoneyViaCardSettings;
import com.paymaya.domain.model.VaultedCard;
import com.paymaya.domain.store.C1295y0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import z2.d;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaVaultedCardsFragment extends MayaBaseLoadingFragment implements n, e {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0453g f11762o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public RecyclerView f11763p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Group f11764q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AppCompatTextView f11765r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public C0214w f11766s0;
    public F t0;
    public g u0;

    public static final void Q1(MayaVaultedCardsFragment mayaVaultedCardsFragment, int i, VaultedCard vaultedCard) {
        g gVar = mayaVaultedCardsFragment.u0;
        if (gVar != null) {
            gVar.notifyItemChanged(i);
        }
        RecyclerView recyclerView = mayaVaultedCardsFragment.f11763p0;
        if (recyclerView == null) {
            j.n("mVaultedCardsRecyclerView");
            throw null;
        }
        recyclerView.getRecycledViewPool().clear();
        C0214w c0214wP1 = mayaVaultedCardsFragment.P1();
        j.g(vaultedCard, "vaultedCard");
        ((MayaBaseFragment) ((n) c0214wP1.c.get())).E1();
        C1295y0 c1295y0 = (C1295y0) c0214wP1.e;
        a aVarDeleteVaultedCard = c1295y0.f11503b.deleteVaultedCard(vaultedCard.mCardTokenId());
        o oVarA = b.a();
        aVarDeleteVaultedCard.getClass();
        new f(aVarDeleteVaultedCard, oVarA, 0).a(new G6.b(c0214wP1, i, vaultedCard, 2)).b(new u(c0214wP1, i)).c();
    }

    public static final void R1(MayaVaultedCardsFragment mayaVaultedCardsFragment) {
        C0214w c0214wP1 = mayaVaultedCardsFragment.P1();
        ArrayList arrayList = (ArrayList) c0214wP1.f1106g;
        int size = arrayList != null ? arrayList.size() : 0;
        AddMoneyViaCardSettings addMoneyViaCardSettings = (AddMoneyViaCardSettings) c0214wP1.f;
        if (size >= (addMoneyViaCardSettings != null ? addMoneyViaCardSettings.getMMaxLinkedCards() : 0)) {
            n nVar = (n) c0214wP1.c.get();
            AddMoneyViaCardSettings addMoneyViaCardSettings2 = (AddMoneyViaCardSettings) c0214wP1.f;
            int mMaxLinkedCards = addMoneyViaCardSettings2 != null ? addMoneyViaCardSettings2.getMMaxLinkedCards() : 0;
            F f = ((MayaVaultedCardsFragment) nVar).t0;
            if (f != null) {
                MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) f;
                String string = mayaCashInActivity.getString(R.string.maya_label_card_max_limit_reached_title);
                j.f(string, "getString(...)");
                d.n(2131231464, string, mayaCashInActivity.getString(R.string.maya_format_card_max_limit_reached_description, Integer.valueOf(mMaxLinkedCards)), new Pair(mayaCashInActivity.getString(R.string.maya_label_got_it), null), null, null, 112).show(mayaCashInActivity.getSupportFragmentManager(), "alert_dialog");
                return;
            }
            return;
        }
        MayaVaultedCardsFragment mayaVaultedCardsFragment2 = (MayaVaultedCardsFragment) ((n) c0214wP1.c.get());
        F f3 = mayaVaultedCardsFragment2.t0;
        if (f3 != null) {
            AddMoneyViaCardSettings addMoneyViaCardSettings3 = (AddMoneyViaCardSettings) mayaVaultedCardsFragment2.P1().f;
            MayaCashInActivity mayaCashInActivity2 = (MayaCashInActivity) f3;
            MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment = new MayaCashInViaCardFormFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("vaultedCard", null);
            bundle.putParcelable("settings", addMoneyViaCardSettings3);
            mayaCashInViaCardFormFragment.setArguments(bundle);
            AbstractC1236z.i(mayaCashInActivity2, R.id.frame_layout_container, mayaCashInViaCardFormFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_vaulted_cards, viewGroup, false);
        int i = R.id.my_cards_title_text_view;
        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.my_cards_title_text_view)) != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
            i = R.id.swipe_left_delete_text_view;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.swipe_left_delete_text_view)) != null) {
                i = R.id.title_header_text_view;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_header_text_view)) != null) {
                    i = R.id.use_new_card_text_view;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.use_new_card_text_view);
                    if (appCompatTextView != null) {
                        i = R.id.vaulted_cards_group;
                        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.vaulted_cards_group);
                        if (group != null) {
                            i = R.id.vaulted_cards_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.vaulted_cards_recycler_view);
                            if (recyclerView != null) {
                                this.f11762o0 = new C0453g(19, nestedScrollView, appCompatTextView, group, recyclerView);
                                j.f(nestedScrollView, "getRoot(...)");
                                return nestedScrollView;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_dialog_fragment_loading, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final C0214w P1() {
        C0214w c0214w = this.f11766s0;
        if (c0214w != null) {
            return c0214w;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.t0 = (F) getActivity();
        O5.a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        C1295y0 c1295y0K = aVar.K();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(sessionSubject, "sessionSubject");
        this.f11766s0 = new C0214w(c1295y0K, sessionSubject, 5);
        P1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        P1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11762o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, W6.e
    public final void onDismiss() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        F f = this.t0;
        if (f != null) {
            ((MayaCashInActivity) f).Q(this);
        }
        P1().o();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f11762o0;
        j.d(c0453g);
        this.f11763p0 = (RecyclerView) c0453g.e;
        C0453g c0453g2 = this.f11762o0;
        j.d(c0453g2);
        this.f11764q0 = (Group) c0453g2.f4095d;
        C0453g c0453g3 = this.f11762o0;
        j.d(c0453g3);
        this.f11765r0 = (AppCompatTextView) c0453g3.c;
        this.u0 = new g(this);
        RecyclerView recyclerView = this.f11763p0;
        if (recyclerView == null) {
            j.n("mVaultedCardsRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = this.f11763p0;
        if (recyclerView2 == null) {
            j.n("mVaultedCardsRecyclerView");
            throw null;
        }
        recyclerView2.setAdapter(this.u0);
        P1().j();
        AppCompatTextView appCompatTextView = this.f11765r0;
        if (appCompatTextView != null) {
            appCompatTextView.setOnClickListener(new E(this, 0));
        } else {
            j.n("mUseNewCardTextView");
            throw null;
        }
    }
}
