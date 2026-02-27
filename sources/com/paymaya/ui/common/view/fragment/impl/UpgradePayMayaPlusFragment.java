package com.paymaya.ui.common.view.fragment.impl;

import D8.C0214w;
import G6.w;
import Lh.h;
import N5.C0435a;
import O5.a;
import Uh.d;
import Vc.b;
import Wc.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.store.C1293x0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradePayMayaPlusFragment extends BaseFragment implements b {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0435a f14412S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ImageView f14413T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Button f14414U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f14415V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Group f14416W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C0214w f14417X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public c f14418Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f14419Z;

    public static final void s1(UpgradePayMayaPlusFragment upgradePayMayaPlusFragment) {
        C1220i c1220i = upgradePayMayaPlusFragment.f10245B;
        FragmentActivity activity = upgradePayMayaPlusFragment.getActivity();
        C1219h c1219hD = C1219h.d(upgradePayMayaPlusFragment.m1());
        c1219hD.n(17);
        c1219hD.u(upgradePayMayaPlusFragment.f14419Z);
        c1220i.c(activity, c1219hD);
        c cVar = ((UpgradePayMayaPlusFragment) ((b) upgradePayMayaPlusFragment.r1().c.get())).f14418Y;
        j.d(cVar);
        cVar.O0();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        this.f14418Y = (c) getActivity();
        a aVar = (a) W4.a.e().a().c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14417X = new C0214w((com.paymaya.data.preference.a) aVar.e.get(), aVar.J(), (d) aVar.f4748y.get());
        r1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_transfer_upgrade_to_paymaya, viewGroup, false);
        int i = R.id.bird_image_view_pma_fragment_transfer_upgrade_to_paymaya;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.bird_image_view_pma_fragment_transfer_upgrade_to_paymaya);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.loading_background_view_pma_fragment_transfer_upgrade_to_paymaya;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.loading_background_view_pma_fragment_transfer_upgrade_to_paymaya);
            if (viewFindChildViewById != null) {
                i = R.id.loading_constraint_group_pma_fragment_transfer_upgrade_to_paymaya;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.loading_constraint_group_pma_fragment_transfer_upgrade_to_paymaya);
                if (group != null) {
                    i = R.id.loading_progress_bar_pma_fragment_transfer_upgrade_to_paymaya;
                    if (((ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.loading_progress_bar_pma_fragment_transfer_upgrade_to_paymaya)) != null) {
                        i = R.id.spiel_sub_text_view_pma_fragment_transfer_upgrade_to_paymaya;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.spiel_sub_text_view_pma_fragment_transfer_upgrade_to_paymaya)) != null) {
                            i = R.id.spiel_text_view_pma_fragment_transfer_upgrade_to_paymaya;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.spiel_text_view_pma_fragment_transfer_upgrade_to_paymaya);
                            if (textView != null) {
                                i = R.id.upgrade_button_pma_fragment_transfer_upgrade_to_paymaya;
                                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.upgrade_button_pma_fragment_transfer_upgrade_to_paymaya);
                                if (button != null) {
                                    this.f14412S = new C0435a(constraintLayout, (View) imageView, viewFindChildViewById, (View) group, (View) textView, (TextView) button, 25);
                                    j.f(constraintLayout, "getRoot(...)");
                                    return constraintLayout;
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
        r1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14412S = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        c cVar = this.f14418Y;
        j.d(cVar);
        cVar.Q(this);
        C0214w c0214wR1 = r1();
        Group group = ((UpgradePayMayaPlusFragment) ((b) c0214wR1.c.get())).f14416W;
        if (group == null) {
            j.n("mGroupLoadingScreen");
            throw null;
        }
        group.setVisibility(0);
        new Lh.d(new Lh.d(new h(((C1293x0) c0214wR1.f).g(), zh.b.a(), 0), new Gc.h(c0214wR1, 24), 2), new w(c0214wR1, 23), 0).e();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0435a c0435a = this.f14412S;
        j.d(c0435a);
        this.f14413T = (ImageView) c0435a.c;
        C0435a c0435a2 = this.f14412S;
        j.d(c0435a2);
        this.f14414U = (Button) c0435a2.f4049g;
        C0435a c0435a3 = this.f14412S;
        j.d(c0435a3);
        this.f14415V = (TextView) c0435a3.e;
        C0435a c0435a4 = this.f14412S;
        j.d(c0435a4);
        this.f14416W = (Group) c0435a4.f4048d;
        Button button = this.f14414U;
        if (button == null) {
            j.n("mButtonUpgradeToPaymaya");
            throw null;
        }
        button.setOnClickListener(new S.b(this, 25));
        Bundle arguments = getArguments();
        String feature = arguments != null ? arguments.getString("feature") : "";
        C0214w c0214wR1 = r1();
        j.g(feature, "feature");
        c0214wR1.j();
        c0214wR1.f1106g = feature;
        ((b) c0214wR1.c.get()).getClass();
        if ("activate_virtual_card".equalsIgnoreCase((String) c0214wR1.f1106g)) {
            UpgradePayMayaPlusFragment upgradePayMayaPlusFragment = (UpgradePayMayaPlusFragment) ((b) c0214wR1.c.get());
            ImageView imageView = upgradePayMayaPlusFragment.f14413T;
            if (imageView == null) {
                j.n("mImageViewBird");
                throw null;
            }
            imageView.setImageDrawable(ContextCompat.getDrawable(upgradePayMayaPlusFragment.requireContext(), 2131231930));
        } else {
            UpgradePayMayaPlusFragment upgradePayMayaPlusFragment2 = (UpgradePayMayaPlusFragment) ((b) c0214wR1.c.get());
            ImageView imageView2 = upgradePayMayaPlusFragment2.f14413T;
            if (imageView2 == null) {
                j.n("mImageViewBird");
                throw null;
            }
            imageView2.setImageDrawable(ContextCompat.getDrawable(upgradePayMayaPlusFragment2.requireContext(), 2131231960));
        }
        c0214wR1.q();
        UpgradePayMayaPlusFragment upgradePayMayaPlusFragment3 = (UpgradePayMayaPlusFragment) ((b) c0214wR1.c.get());
        TextView textView = upgradePayMayaPlusFragment3.f14415V;
        if (textView == null) {
            j.n("mTextViewSpiel");
            throw null;
        }
        textView.setText(upgradePayMayaPlusFragment3.getString(R.string.pma_label_default_upgrade_spiel));
        String deepLink = ((UpgradePayMayaPlusFragment) ((b) c0214wR1.c.get())).requireActivity().getIntent().getDataString();
        int iW = C.w(deepLink);
        if (11 == iW || 14 == iW || 9 == iW || 8 == iW || 10 == iW) {
            UpgradePayMayaPlusFragment upgradePayMayaPlusFragment4 = (UpgradePayMayaPlusFragment) ((b) c0214wR1.c.get());
            upgradePayMayaPlusFragment4.getClass();
            j.g(deepLink, "deepLink");
            C1219h c1219h = upgradePayMayaPlusFragment4.f10248Q;
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put("from_deep_link", "true");
            upgradePayMayaPlusFragment4.requireActivity().getIntent().setData(null);
        }
    }

    public final C0214w r1() {
        C0214w c0214w = this.f14417X;
        if (c0214w != null) {
            return c0214w;
        }
        j.n("mIUpgradePayMayaPlusFragmentPresenter");
        throw null;
    }
}
