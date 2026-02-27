package com.paymaya.mayaui.cards.view.fragment.impl;

import Ag.k;
import B6.a;
import N5.C0491z;
import O5.f;
import O6.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.datasource.cache.c;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.store.X;
import com.paymaya.mayaui.common.view.widget.MayaCustomCardView;
import com.paymaya.mayaui.common.view.widget.MayaHorizontalLabelWithArrow;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.ui.common.view.dialog.impl.AlertDialogFragment;
import kotlin.jvm.internal.j;
import p0.C2004c;
import y6.C2514b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCardsFragment extends BaseFragment implements a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C2514b f11596S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C0491z f11597T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C6.a f11598U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public A6.a f11599V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public LinearLayoutManager f11600W;

    public static final void r1(MayaCardsFragment mayaCardsFragment) {
        C1220i c1220i = mayaCardsFragment.f10245B;
        FragmentActivity activity = mayaCardsFragment.getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.MY_CARDS);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.LINK_CARD);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put(SessionDescription.ATTR_TYPE, "PHYSICAL");
        c1220i.c(activity, c1219hD);
        C2514b c2514b = mayaCardsFragment.f11596S;
        if (c2514b == null) {
            j.n("mMayaCardsFragmentPresenter");
            throw null;
        }
        if (c2514b.e.f11330b.getBoolean("key_can_link_card", true)) {
            ((a) c2514b.c.get()).getClass();
        } else {
            ((MayaCardsFragment) ((a) c2514b.c.get())).s1();
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.MY_CARDS;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.cards.view.fragment.impl.MayaCardsFragment.CardsFragmentListener");
        this.f11598U = (C6.a) activity;
        W4.a aVarE = W4.a.e();
        if (aVarE.f6254N == null) {
            O5.a aVar = aVarE.f6267a;
            C2004c c2004c = new C2004c();
            aVar.getClass();
            aVarE.f6254N = new f(aVar.f4704b, c2004c);
        }
        O5.a aVar2 = aVarE.f6254N.f4755a;
        this.f10245B = (C1220i) aVar2.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar2.e.get();
        X xT = aVar2.t();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar2.e.get();
        j.g(preference, "preference");
        C2514b c2514b = new C2514b(xT, preference);
        this.f11596S = c2514b;
        c2514b.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_cards, viewGroup, false);
        int i = R.id.activate_card_item;
        if (((MayaHorizontalLabelWithArrow) ViewBindings.findChildViewById(viewInflate, R.id.activate_card_item)) != null) {
            i = R.id.activate_card_item_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.activate_card_item_container);
            if (frameLayout != null) {
                i = R.id.cards_limit_reached_group;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.cards_limit_reached_group);
                if (group != null) {
                    i = R.id.cards_limit_reached_image_view;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.cards_limit_reached_image_view)) != null) {
                        i = R.id.cards_limit_reached_label_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.cards_limit_reached_label_text_view)) != null) {
                            i = R.id.cards_limit_reached_message_image_view;
                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.cards_limit_reached_message_image_view)) != null) {
                                i = R.id.cards_limit_reached_message_space;
                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.cards_limit_reached_message_space);
                                if (viewFindChildViewById != null) {
                                    i = R.id.cards_limit_reached_message_text_view;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.cards_limit_reached_message_text_view)) != null) {
                                        i = R.id.cards_limit_reached_message_view;
                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.cards_limit_reached_message_view);
                                        if (viewFindChildViewById2 != null) {
                                            i = R.id.cards_recycler_view;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.cards_recycler_view);
                                            if (recyclerView != null) {
                                                i = R.id.get_new_card_container;
                                                MayaCustomCardView mayaCustomCardView = (MayaCustomCardView) ViewBindings.findChildViewById(viewInflate, R.id.get_new_card_container);
                                                if (mayaCustomCardView != null) {
                                                    i = R.id.get_new_card_label_text_view;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.get_new_card_label_text_view)) != null) {
                                                        i = R.id.left_guideline;
                                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                                                            i = R.id.right_guideline;
                                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                                                                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                                this.f11597T = new C0491z(nestedScrollView, frameLayout, group, viewFindChildViewById, viewFindChildViewById2, recyclerView, mayaCustomCardView);
                                                                j.f(nestedScrollView, "getRoot(...)");
                                                                return nestedScrollView;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C2514b c2514b = this.f11596S;
        if (c2514b == null) {
            j.n("mMayaCardsFragmentPresenter");
            throw null;
        }
        c2514b.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C6.a aVar = this.f11598U;
        if (aVar != null) {
            ((MayaDashboardActivity) aVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f11597T;
        j.d(c0491z);
        ((FrameLayout) c0491z.f4303b).setOnClickListener(new Ba.a(this, 1));
        ((MayaCustomCardView) c0491z.h).setOnClickAction(new k(this, 6));
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.f11599V = new A6.a(contextRequireContext, this);
        this.f11600W = new LinearLayoutManager(getActivity(), 1, false);
        C0491z c0491z2 = this.f11597T;
        j.d(c0491z2);
        LinearLayoutManager linearLayoutManager = this.f11600W;
        RecyclerView recyclerView = (RecyclerView) c0491z2.f;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f11599V);
        ViewCompat.setNestedScrollingEnabled(recyclerView, true);
        Context contextRequireContext2 = requireContext();
        j.f(contextRequireContext2, "requireContext(...)");
        b bVar = new b(contextRequireContext2, 1);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.maya_divider_recycler_view);
        if (drawable != null) {
            bVar.f4759a = drawable;
        }
        recyclerView.addItemDecoration(bVar);
        C2514b c2514b = this.f11596S;
        if (c2514b != null) {
            c2514b.j();
        } else {
            j.n("mMayaCardsFragmentPresenter");
            throw null;
        }
    }

    public final void s1() {
        C6.a aVar = this.f11598U;
        if (aVar != null) {
            Bundle bundleE = c.e("title", getString(R.string.pma_label_maximum_number_of_linked_cards_reached), "content", getString(R.string.pma_label_you_can_no_longer_add_additional_cards_to_your_account));
            AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
            alertDialogFragment.setArguments(bundleE);
            alertDialogFragment.show(((MayaDashboardActivity) aVar).getSupportFragmentManager(), "alert_dialog");
        }
    }
}
