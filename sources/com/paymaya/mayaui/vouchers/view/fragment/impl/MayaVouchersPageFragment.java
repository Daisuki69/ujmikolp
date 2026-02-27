package com.paymaya.mayaui.vouchers.view.fragment.impl;

import Cc.a;
import Dh.c;
import Fc.d;
import Gc.f;
import Gc.g;
import Gc.h;
import Gc.i;
import J7.e;
import N5.C0491z;
import We.A;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.util.Base64Utils;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.H;
import com.paymaya.common.utility.I;
import com.paymaya.common.utility.b0;
import com.paymaya.domain.model.Voucher;
import com.paymaya.mayaui.vouchers.view.activity.impl.MayaVouchersActivity;
import com.paymaya.ui.login.view.activity.impl.DeepLinkActivity;
import java.util.HashMap;
import k2.v0;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaVouchersPageFragment extends MayaBaseLoadingFragment implements d {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public g f14311A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f14312B0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final c f14313o0 = new c(1);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public C0491z f14314p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public SpringView f14315q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public RecyclerView f14316r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Button f14317s0;
    public Group t0;
    public TextView u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public TextView f14318v0;
    public LottieAnimationView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Dc.d f14319x0;
    public String y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Ac.c f14320z0;

    public static final void R1(MayaVouchersPageFragment mayaVouchersPageFragment) {
        C1220i c1220iO1 = mayaVouchersPageFragment.o1();
        FragmentActivity activity = mayaVouchersPageFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaVouchersPageFragment.u1());
        c1219hD.r(EnumC1216e.EMPTYAVAILABLETAB);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.DEALS);
        c1220iO1.c(activity, c1219hD);
        g gVar = mayaVouchersPageFragment.f14311A0;
        if (gVar != null) {
            MayaVouchersActivity mayaVouchersActivity = (MayaVouchersActivity) gVar;
            mayaVouchersActivity.n1().k0(mayaVouchersActivity, "https://www.paymaya.com/deals/");
        }
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_vouchers_page, viewGroup, false);
        int i = R.id.button_vouchers_deals;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_vouchers_deals);
        if (button != null) {
            i = R.id.image_view_vouchers_empty;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_vouchers_empty)) != null) {
                i = R.id.recycler_view_vouchers;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_vouchers);
                if (recyclerView != null) {
                    SpringView springView = (SpringView) viewInflate;
                    i = R.id.text_view_vouchers_empty_subtitle;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_vouchers_empty_subtitle);
                    if (textView != null) {
                        i = R.id.text_view_vouchers_empty_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_vouchers_empty_title);
                        if (textView2 != null) {
                            i = R.id.vouchers_empty_group_spiels;
                            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.vouchers_empty_group_spiels);
                            if (group != null) {
                                this.f14314p0 = new C0491z(springView, button, recyclerView, springView, textView, textView2, group);
                                j.f(springView, "getRoot(...)");
                                return springView;
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
        View viewInflate = layoutInflater.inflate(R.layout.maya_voucher_view_loading, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View K1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.maya_view_maintenance_dashboard, viewGroup, false);
    }

    public final a P1() {
        Dc.d dVar = this.f14319x0;
        if (dVar != null) {
            return dVar;
        }
        j.n("mIVouchersPageFragmentPresenter");
        throw null;
    }

    public final PendingIntent Q1(Voucher voucher, long j) {
        Intent intent = new Intent(getContext(), (Class<?>) DeepLinkActivity.class);
        intent.setData(Uri.parse(C.n(j, voucher.mCode(), voucher.mCampaignName())));
        PendingIntent activity = PendingIntent.getActivity(getContext(), voucher.mAssignmentId(), intent, 1140850688);
        j.f(activity, "getActivity(...)");
        return activity;
    }

    public final void S1(Voucher voucher) {
        j.g(voucher, "voucher");
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.VOUCHER_REMINDER);
        c1219hD.n(12);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("assignment_id", String.valueOf(voucher.mAssignmentId()));
        c1220iO1.c(activity, c1219hD);
    }

    public final void T1() {
        FragmentActivity activity = getActivity();
        SpringView springView = this.f14315q0;
        if (springView != null) {
            b0.e(activity, springView, null, R.string.maya_label_voucher_reminder_error, R.drawable.maya_bg_snackbar_error_small_margin, R.style.JekoSemiBoldSmallText_Error, 0, 0, 852);
        } else {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
    }

    public final void U1() {
        FragmentActivity activity = getActivity();
        SpringView springView = this.f14315q0;
        if (springView == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        b0.e(activity, springView, null, R.string.maya_label_voucher_reminder_success, R.drawable.maya_bg_snackbar_success_small_margin, R.style.JekoBoldSmallText_Snackbar_Success, 0, 0, 852);
        C1220i c1220iO1 = o1();
        FragmentActivity activity2 = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.VOUCHER_REMINDER);
        c1219hD.n(5);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hD.j;
        map.put(SessionDescription.ATTR_TYPE, "subscribe");
        map.put("status", "success");
        c1220iO1.c(activity2, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14311A0 = (g) getActivity();
        O5.a aVar = W4.a.e().C().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f14319x0 = new Dc.d((com.paymaya.data.preference.a) aVar.e.get(), aVar.Y());
        ((AbstractC2509a) P1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) P1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14313o0.d();
        this.f14314p0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219hH = AbstractC2329d.h(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("status", this.y0);
        c1219hH.j.put("attribution", n1().f10371a);
        A1(c1219hH);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((Dc.d) P1()).k();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 0;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f14314p0;
        j.d(c0491z);
        this.f14315q0 = (SpringView) c0491z.e;
        C0491z c0491z2 = this.f14314p0;
        j.d(c0491z2);
        this.f14316r0 = (RecyclerView) c0491z2.f;
        C0491z c0491z3 = this.f14314p0;
        j.d(c0491z3);
        this.f14317s0 = (Button) c0491z3.c;
        C0491z c0491z4 = this.f14314p0;
        j.d(c0491z4);
        this.t0 = (Group) c0491z4.f4305g;
        C0491z c0491z5 = this.f14314p0;
        j.d(c0491z5);
        this.u0 = (TextView) c0491z5.h;
        C0491z c0491z6 = this.f14314p0;
        j.d(c0491z6);
        this.f14318v0 = (TextView) c0491z6.f4304d;
        SpringView springView = this.f14315q0;
        if (springView == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView.setHeader(new e());
        SpringView springView2 = this.f14315q0;
        if (springView2 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        View viewFindViewById = springView2.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.w0 = (LottieAnimationView) viewFindViewById;
        SpringView springView3 = this.f14315q0;
        if (springView3 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView3.setListener(new h(this, i));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        A aD = A.d();
        j.f(aD, "get(...)");
        this.f14320z0 = new Ac.c(contextRequireContext, this, aD, t1());
        RecyclerView recyclerView = this.f14316r0;
        if (recyclerView == null) {
            j.n("mRecyclerViewItems");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        Ac.c cVar = this.f14320z0;
        if (cVar == null) {
            j.n("mVoucherItemAdapter");
            throw null;
        }
        recyclerView.setAdapter(cVar);
        recyclerView.addItemDecoration(new Hc.a(v0.o(8)));
        recyclerView.addOnScrollListener(new i(this, linearLayoutManager));
        Button button = this.f14317s0;
        if (button == null) {
            j.n("mButtonCheckDeals");
            throw null;
        }
        button.setOnClickListener(new f(this, 2));
        if (getArguments() != null) {
            this.y0 = requireArguments().getString("vouchers_status");
            a aVarP1 = P1();
            String str = this.y0;
            boolean zA = I.a(getActivity(), getString(R.string.pma_notification_channel_id_reminders));
            Dc.d dVar = (Dc.d) aVarP1;
            dVar.j();
            dVar.f = str;
            ((MayaVouchersPageFragment) ((d) dVar.c.get())).O1();
            dVar.k();
            if ("NEW".equalsIgnoreCase(dVar.f) && !zA && dVar.e.f11330b.getBoolean("key_should_show_voucher_prompt_notification", true)) {
                MayaVouchersPageFragment mayaVouchersPageFragment = (MayaVouchersPageFragment) ((d) dVar.c.get());
                if (mayaVouchersPageFragment.getContext() != null) {
                    Context context = mayaVouchersPageFragment.getContext();
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    View viewInflate = LayoutInflater.from(context).inflate(R.layout.pma_dialog_prompt_turn_on_notification, (ViewGroup) null);
                    builder.setView(viewInflate);
                    AlertDialog alertDialogCreate = builder.create();
                    alertDialogCreate.setCanceledOnTouchOutside(false);
                    View viewFindViewById2 = viewInflate.findViewById(R.id.no_text_view_pma_dialog_prompt_turn_on_notification);
                    View viewFindViewById3 = viewInflate.findViewById(R.id.yes_text_view_pma_dialog_prompt_turn_on_notification);
                    viewFindViewById2.setOnClickListener(new Na.a(alertDialogCreate, 2));
                    viewFindViewById3.setOnClickListener(new H(i, context, alertDialogCreate));
                    alertDialogCreate.show();
                    androidx.camera.core.impl.a.A(mayaVouchersPageFragment.t1().f11330b, "key_should_show_voucher_prompt_notification", false);
                }
            }
            String dataString = ((MayaVouchersPageFragment) ((d) dVar.c.get())).requireActivity().getIntent().getDataString();
            if (C.w(dataString) == 0) {
                return;
            }
            String strL = C.L(dataString, "code");
            if (strL == null) {
                MayaVouchersPageFragment mayaVouchersPageFragment2 = (MayaVouchersPageFragment) ((d) dVar.c.get());
                C1219h c1219hM1 = mayaVouchersPageFragment2.m1();
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hM1.j.put("from_deep_link", "true");
                mayaVouchersPageFragment2.requireActivity().getIntent().setData(null);
                return;
            }
            d dVar2 = (d) dVar.c.get();
            j.d(dataString);
            String strL2 = C.L(dataString, "campaign_name");
            String str2 = C.e(strL2) ? null : new String(Base64Utils.decodeUrlSafe(Uri.decode(strL2)));
            MayaVouchersPageFragment mayaVouchersPageFragment3 = (MayaVouchersPageFragment) dVar2;
            C1220i c1220iO1 = mayaVouchersPageFragment3.o1();
            FragmentActivity activity = mayaVouchersPageFragment3.getActivity();
            C1219h c1219hD = C1219h.d(EnumC1215d.VOUCHER_REMINDER);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.NOTIF);
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hD.j.put("campaign_name", str2);
            c1220iO1.c(activity, c1219hD);
            MayaVouchersPageFragment mayaVouchersPageFragment4 = (MayaVouchersPageFragment) ((d) dVar.c.get());
            mayaVouchersPageFragment4.m1().j.put("from_deep_link", "true");
            mayaVouchersPageFragment4.requireActivity().getIntent().setData(null);
            g gVar = ((MayaVouchersPageFragment) ((d) dVar.c.get())).f14311A0;
            if (gVar != null) {
                Bundle bundleD = androidx.media3.datasource.cache.c.d("voucher", strL);
                MayaVoucherDetailsFragment mayaVoucherDetailsFragment = new MayaVoucherDetailsFragment();
                mayaVoucherDetailsFragment.setArguments(bundleD);
                AbstractC1236z.h((MayaVouchersActivity) gVar, R.id.fragment_container_frame_layout_pma_activity_vouchers, mayaVoucherDetailsFragment);
            }
        }
    }
}
