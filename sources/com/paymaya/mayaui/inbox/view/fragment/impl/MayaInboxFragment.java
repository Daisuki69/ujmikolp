package com.paymaya.mayaui.inbox.view.fragment.impl;

import A7.j;
import E9.e;
import N5.C0491z;
import O5.a;
import S5.c;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.inbox.view.activity.impl.MayaInboxV2Activity;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxFragment;
import l9.C1803a;
import s8.b;
import t8.d;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public class MayaInboxFragment extends MayaBaseFragment implements b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0491z f12406U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public j f12407V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public e f12408W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public d f12409X;

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        setHasOptionsMenu(true);
        this.f12409X = (d) getActivity();
        a aVar = W4.a.e().o().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12407V = new j(aVar.u(), (com.paymaya.data.preference.a) aVar.e.get());
        FragmentActivity activity = getActivity();
        kotlin.jvm.internal.j.e(activity, "null cannot be cast to non-null type com.paymaya.common.base.MayaBaseActivity");
        ((q) activity).w1(false);
        j jVar = this.f12407V;
        if (jVar != null) {
            jVar.h(this);
        } else {
            kotlin.jvm.internal.j.n("mInboxFragmentPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_inbox, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.inbox_back_button;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.inbox_back_button);
        if (button != null) {
            i = R.id.inbox_come_back_text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_come_back_text_view);
            if (textView != null) {
                i = R.id.inbox_no_notifications_group;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.inbox_no_notifications_group);
                if (group != null) {
                    i = R.id.inbox_no_notifications_icon;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_no_notifications_icon)) != null) {
                        i = R.id.inbox_no_notifications_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_no_notifications_text_view)) != null) {
                            i = R.id.inbox_tab_layout;
                            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(viewInflate, R.id.inbox_tab_layout);
                            if (tabLayout != null) {
                                i = R.id.inbox_toolbar;
                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.inbox_toolbar);
                                if (toolbar != null) {
                                    i = R.id.inbox_toolbar_title;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.inbox_toolbar_title)) != null) {
                                        i = R.id.inbox_view_pager;
                                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(viewInflate, R.id.inbox_view_pager);
                                        if (viewPager != null) {
                                            this.f12406U = new C0491z(constraintLayout, button, textView, group, tabLayout, toolbar, viewPager);
                                            return constraintLayout;
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

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        j jVar = this.f12407V;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mInboxFragmentPresenter");
            throw null;
        }
        jVar.i();
        super.onDestroy();
        this.f12406U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        d dVar = this.f12409X;
        kotlin.jvm.internal.j.d(dVar);
        ((MayaInboxV2Activity) dVar).Q(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        j jVar = this.f12407V;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mInboxFragmentPresenter");
            throw null;
        }
        jVar.j();
        C0491z c0491z = this.f12406U;
        kotlin.jvm.internal.j.d(c0491z);
        final int i = 0;
        ((Button) c0491z.c).setOnClickListener(new View.OnClickListener(this) { // from class: t8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaInboxFragment f20184b;

            {
                this.f20184b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaInboxFragment mayaInboxFragment = this.f20184b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaInboxFragment.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    default:
                        MayaInboxFragment mayaInboxFragment2 = this.f20184b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaInboxFragment2.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                }
            }
        });
        C0491z c0491z2 = this.f12406U;
        kotlin.jvm.internal.j.d(c0491z2);
        final int i4 = 1;
        ((Toolbar) c0491z2.f4305g).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: t8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaInboxFragment f20184b;

            {
                this.f20184b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaInboxFragment mayaInboxFragment = this.f20184b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaInboxFragment.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                    default:
                        MayaInboxFragment mayaInboxFragment2 = this.f20184b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaInboxFragment2.requireActivity().onBackPressed();
                            return;
                        } finally {
                        }
                }
            }
        });
        C0491z c0491z3 = this.f12406U;
        kotlin.jvm.internal.j.d(c0491z3);
        ((Toolbar) c0491z3.f4305g).inflateMenu(R.menu.pma_menu_inbox);
        C0491z c0491z4 = this.f12406U;
        kotlin.jvm.internal.j.d(c0491z4);
        Context context = getContext();
        ((Toolbar) c0491z4.f4305g).setOverflowIcon(context != null ? jk.b.o(context, R.attr.mayaDotsHorizontal) : null);
        C0491z c0491z5 = this.f12406U;
        kotlin.jvm.internal.j.d(c0491z5);
        ((Toolbar) c0491z5.f4305g).setOnMenuItemClickListener(new C1803a(this, 19));
    }
}
