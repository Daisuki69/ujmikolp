package com.paymaya.mayaui.rewardscatalog.view.fragment;

import Bb.f;
import N4.d;
import N5.C0456h;
import N5.C0462k;
import N5.z1;
import O5.g;
import S5.c;
import W4.a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.data.api.RewardsCatalogApi;
import com.paymaya.domain.store.G0;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.rewardscatalog.view.fragment.MayaRewardsCatalogFragment;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import pb.InterfaceC2031a;
import qb.C2168a;
import rb.InterfaceC2193b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaRewardsCatalogFragment extends MayaBaseFragment implements InterfaceC2031a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0462k f13716U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public InterfaceC2193b f13717V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public f f13718W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C2168a f13719X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ConstraintLayout f13720Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public RecyclerView f13721Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f13722a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f13723b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public C0456h f13724c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C0456h f13725d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ConstraintLayout f13726e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ConstraintLayout f13727f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ConstraintLayout f13728g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TextView f13729h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Group f13730i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f13731j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f13732k0;

    public static final void I1(MayaRewardsCatalogFragment mayaRewardsCatalogFragment) {
        String str = mayaRewardsCatalogFragment.f13731j0 ? "deals_page" : "cc_application";
        String str2 = mayaRewardsCatalogFragment.f13732k0;
        TextView textView = mayaRewardsCatalogFragment.f13723b0;
        if (textView == null) {
            j.n("mMayaMilesCta");
            throw null;
        }
        mayaRewardsCatalogFragment.H1(str2, null, textView.getText().toString(), str);
        f fVarG1 = mayaRewardsCatalogFragment.G1();
        if (mayaRewardsCatalogFragment.f13731j0) {
            InterfaceC2193b interfaceC2193b = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVarG1.c.get())).f13717V;
            if (interfaceC2193b != null) {
                ((MayaDashboardActivity) interfaceC2193b).Y1().l("paymaya://mycards/carddashboard/mbcc-deals");
                return;
            }
            return;
        }
        InterfaceC2193b interfaceC2193b2 = ((MayaRewardsCatalogFragment) ((InterfaceC2031a) fVarG1.c.get())).f13717V;
        if (interfaceC2193b2 != null) {
            ((MayaDashboardActivity) interfaceC2193b2).f2();
        }
    }

    public static final void J1(MayaRewardsCatalogFragment mayaRewardsCatalogFragment) {
        String str = mayaRewardsCatalogFragment.f13732k0;
        TextView textView = mayaRewardsCatalogFragment.f13729h0;
        if (textView == null) {
            j.n("mTryAgainTextView");
            throw null;
        }
        mayaRewardsCatalogFragment.H1(str, null, textView.getText().toString(), "Dashboard");
        ConstraintLayout constraintLayout = mayaRewardsCatalogFragment.f13727f0;
        if (constraintLayout == null) {
            j.n("mErrorStateView");
            throw null;
        }
        constraintLayout.setVisibility(8);
        RecyclerView recyclerView = mayaRewardsCatalogFragment.f13721Z;
        if (recyclerView == null) {
            j.n("mRewardsCatalogRecyclerView");
            throw null;
        }
        recyclerView.setVisibility(0);
        mayaRewardsCatalogFragment.G1().q();
    }

    public final f G1() {
        f fVar = this.f13718W;
        if (fVar != null) {
            return fVar;
        }
        j.n("mMayaRewardsCatalogPresenter");
        throw null;
    }

    public final void H1(String str, String str2, String str3, String str4) {
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e("RCATALOG_WIDGET_ITEM_TAPPED");
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("button", str3);
        map.put("destination_page", str4);
        if (str != null) {
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("acct_status", str);
        }
        if (str2 != null) {
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("product_id", str2);
        }
        c1220iO1.b(c1219hE);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        a aVarE = a.e();
        if (aVarE.f6273d0 == null) {
            O5.a aVar = aVarE.f6267a;
            d dVar = new d(29);
            aVar.getClass();
            aVarE.f6273d0 = new g(aVar.f4704b, dVar);
        }
        O5.a aVar2 = aVarE.f6273d0.f4756a;
        this.f10334B = (C1220i) aVar2.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f10336P = (c) aVar2.f4724k.get();
        this.f13718W = new f(new G0((RewardsCatalogApi) aVar2.f4726k1.get()), 20);
        super.onAttach(context);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13717V = (InterfaceC2193b) getActivity();
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_rewards_catalog, viewGroup, false);
        int i = R.id.barrier_rewards_content_bottom;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_rewards_content_bottom)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.group_rewards_catalog_footer;
            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_rewards_catalog_footer);
            if (group != null) {
                i = R.id.image_view_right_chevron;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_right_chevron)) != null) {
                    i = R.id.recycler_view_maya_miles_rewards;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_maya_miles_rewards);
                    if (recyclerView != null) {
                        i = R.id.text_view_maya_miles_balance;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_maya_miles_balance);
                        if (textView != null) {
                            i = R.id.text_view_maya_miles_cta;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_maya_miles_cta);
                            if (textView2 != null) {
                                i = R.id.text_view_maya_miles_title;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_maya_miles_title)) != null) {
                                    i = R.id.view_divider;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_divider);
                                    if (viewFindChildViewById != null) {
                                        i = R.id.view_loading_maya_miles_balance;
                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_loading_maya_miles_balance);
                                        if (viewFindChildViewById2 != null) {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindChildViewById2;
                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.lottie_animation_balance_loading);
                                            if (viewFindChildViewById3 == null) {
                                                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById2.getResources().getResourceName(R.id.lottie_animation_balance_loading)));
                                            }
                                            C0456h c0456h = new C0456h(constraintLayout2, constraintLayout2, 2);
                                            i = R.id.view_rewards_catalog_empty;
                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.view_rewards_catalog_empty);
                                            if (viewFindChildViewById4 != null) {
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) viewFindChildViewById4;
                                                int i4 = R.id.empty_emoji_image_view;
                                                if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById4, R.id.empty_emoji_image_view)) != null) {
                                                    i4 = R.id.empty_message_text_view;
                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById4, R.id.empty_message_text_view)) != null) {
                                                        i4 = R.id.empty_title_text_view;
                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById4, R.id.empty_title_text_view)) != null) {
                                                            C0456h c0456h2 = new C0456h(constraintLayout3, constraintLayout3, 3);
                                                            i = R.id.view_rewards_catalog_error;
                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.view_rewards_catalog_error);
                                                            if (viewFindChildViewById5 != null) {
                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) viewFindChildViewById5;
                                                                int i6 = R.id.error_emoji_image_view;
                                                                if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById5, R.id.error_emoji_image_view)) != null) {
                                                                    i6 = R.id.error_retry_text_view;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById5, R.id.error_retry_text_view);
                                                                    if (textView3 != null) {
                                                                        i6 = R.id.error_title_text_view;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById5, R.id.error_title_text_view)) != null) {
                                                                            this.f13716U = new C0462k(constraintLayout, constraintLayout, group, recyclerView, textView, textView2, viewFindChildViewById, c0456h, c0456h2, new z1(constraintLayout4, constraintLayout4, textView3, 0), 11);
                                                                            j.f(constraintLayout, "getRoot(...)");
                                                                            return constraintLayout;
                                                                        }
                                                                    }
                                                                }
                                                                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById5.getResources().getResourceName(i6)));
                                                            }
                                                        }
                                                    }
                                                }
                                                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById4.getResources().getResourceName(i4)));
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

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        a.e().f6273d0 = null;
        G1().i();
        super.onDestroyView();
        this.f13716U = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f13717V = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2193b interfaceC2193b = this.f13717V;
        if (interfaceC2193b != null) {
            ((MayaDashboardActivity) interfaceC2193b).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0462k c0462k = this.f13716U;
        j.d(c0462k);
        this.f13721Z = (RecyclerView) c0462k.h;
        C0462k c0462k2 = this.f13716U;
        j.d(c0462k2);
        this.f13720Y = (ConstraintLayout) c0462k2.f;
        C0462k c0462k3 = this.f13716U;
        j.d(c0462k3);
        this.f13722a0 = (TextView) c0462k3.c;
        C0462k c0462k4 = this.f13716U;
        j.d(c0462k4);
        this.f13723b0 = (TextView) c0462k4.f4132d;
        C0462k c0462k5 = this.f13716U;
        j.d(c0462k5);
        this.f13724c0 = (C0456h) c0462k5.i;
        C0462k c0462k6 = this.f13716U;
        j.d(c0462k6);
        this.f13725d0 = (C0456h) c0462k6.j;
        C0462k c0462k7 = this.f13716U;
        j.d(c0462k7);
        z1 z1Var = (z1) c0462k7.f4134k;
        C0456h c0456h = this.f13725d0;
        if (c0456h == null) {
            j.n("mEmptyStateViewBinding");
            throw null;
        }
        this.f13726e0 = c0456h.c;
        this.f13727f0 = z1Var.c;
        this.f13729h0 = z1Var.f4319d;
        C0462k c0462k8 = this.f13716U;
        j.d(c0462k8);
        this.f13730i0 = (Group) c0462k8.f4133g;
        C0456h c0456h2 = this.f13724c0;
        if (c0456h2 == null) {
            j.n("mViewLoadingMayaMilesBalanceBinding");
            throw null;
        }
        this.f13728g0 = c0456h2.c;
        TextView textView = this.f13723b0;
        if (textView == null) {
            j.n("mMayaMilesCta");
            throw null;
        }
        final int i = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: rb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRewardsCatalogFragment f19882b;

            {
                this.f19882b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaRewardsCatalogFragment mayaRewardsCatalogFragment = this.f19882b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRewardsCatalogFragment.I1(mayaRewardsCatalogFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaRewardsCatalogFragment mayaRewardsCatalogFragment2 = this.f19882b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRewardsCatalogFragment.J1(mayaRewardsCatalogFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView2 = this.f13729h0;
        if (textView2 == null) {
            j.n("mTryAgainTextView");
            throw null;
        }
        final int i4 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: rb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRewardsCatalogFragment f19882b;

            {
                this.f19882b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaRewardsCatalogFragment mayaRewardsCatalogFragment = this.f19882b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRewardsCatalogFragment.I1(mayaRewardsCatalogFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaRewardsCatalogFragment mayaRewardsCatalogFragment2 = this.f19882b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaRewardsCatalogFragment.J1(mayaRewardsCatalogFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        C2168a c2168a = new C2168a(new o6.f(this, 4));
        this.f13719X = c2168a;
        RecyclerView recyclerView = this.f13721Z;
        if (recyclerView == null) {
            j.n("mRewardsCatalogRecyclerView");
            throw null;
        }
        recyclerView.setAdapter(c2168a);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        recyclerView.addItemDecoration(new Rc.d(contextRequireContext, R.dimen.maya_margin_normal, R.dimen.maya_margin_extra_small));
        G1().j();
    }
}
