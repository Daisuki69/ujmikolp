package com.paymaya.ui.common.view.fragment.impl;

import L9.C0327e;
import Uh.d;
import Vc.a;
import Xa.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopActivity;
import kotlin.jvm.internal.j;
import y5.AbstractActivityC2512d;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class ServiceUnavailableFragment extends BaseFragment implements a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0327e f14401S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Wc.a f14402T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public c f14403U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f14404V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f14405W;

    @BindView(R.id.for_the_meantime_group_pma_fragment_service_unavailable)
    Group mGroupForTheMeantime;

    @BindView(R.id.maintenance_image_view_pma_fragment_service_unavailable)
    ImageView mImageMaintenance;

    @BindView(R.id.green_background_image_view_pma_fragment_service_unavailable)
    ImageView mImageViewBackgroundGreen;

    @BindView(R.id.constraint_layout_pma_fragment_service_unavailable)
    ConstraintLayout mLayoutContainer;

    @BindView(R.id.description_reusable_text_view_pma_fragment_service_unavailable)
    TextView mTextViewDescription;

    @BindView(R.id.title_reusable_text_view_pma_fragment_service_unavailable)
    TextView mTextViewTitle;

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.MAINTENANCE;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f14404V) {
            this.f10249R = true;
        }
        this.f14402T = (Wc.a) getActivity();
        O5.a aVar = (O5.a) W4.a.e().a().c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        d dVar = (d) aVar.f4748y.get();
        com.paymaya.data.preference.a mPreference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(mPreference, "mPreference");
        C0327e c0327e = new C0327e(dVar, 16);
        this.f14401S = c0327e;
        c0327e.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pma_fragment_service_unavailable, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f14401S.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f14402T.Q(this);
    }

    @OnClick({R.id.shop_now_button_pma_fragment_service_unavailable})
    public void onShopNowClicked() {
        ServiceUnavailableFragment serviceUnavailableFragment = (ServiceUnavailableFragment) ((a) this.f14401S.c.get());
        if (serviceUnavailableFragment.getArguments() != null && serviceUnavailableFragment.getArguments().getBoolean("is_show_for_the_meantime") && serviceUnavailableFragment.f14405W) {
            if (serviceUnavailableFragment.f14403U != null) {
                C1220i c1220i = serviceUnavailableFragment.f10245B;
                FragmentActivity activity = serviceUnavailableFragment.getActivity();
                c cVar = serviceUnavailableFragment.f14403U;
                cVar.getClass();
                int i = MayaShopActivity.f13984k;
                ((MayaShopActivity) cVar.f6548b).getClass();
                C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
                c1219hD.r(EnumC1216e.MAINTENANCE_SCREEN);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.SHOP);
                c1220i.c(activity, c1219hD);
            } else {
                C1220i c1220i2 = serviceUnavailableFragment.f10245B;
                FragmentActivity activity2 = serviceUnavailableFragment.getActivity();
                C1219h c1219hD2 = C1219h.d(serviceUnavailableFragment.m1());
                c1219hD2.n(17);
                c1219hD2.t(EnumC1217f.MAINTENANCE_SHOP);
                c1220i2.c(activity2, c1219hD2);
            }
        }
        serviceUnavailableFragment.f14402T.n();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String pageTitle = arguments.getString("page");
            String string = arguments.getString("title");
            String string2 = arguments.getString("description");
            boolean z4 = arguments.getBoolean("is_show_for_the_meantime");
            boolean z5 = arguments.getBoolean("has_top_margin", true);
            C0327e c0327e = this.f14401S;
            c0327e.getClass();
            j.g(pageTitle, "pageTitle");
            c0327e.j();
            ((AbstractActivityC2512d) ((ServiceUnavailableFragment) ((a) c0327e.c.get())).f14402T).m1(pageTitle);
            if (string != null && !C2576A.H(string)) {
                ((ServiceUnavailableFragment) ((a) c0327e.c.get())).mTextViewTitle.setText(string);
            }
            if (string2 != null && !C2576A.H(string2)) {
                ((ServiceUnavailableFragment) ((a) c0327e.c.get())).mTextViewDescription.setText(string2);
            }
            if (z4) {
                ServiceUnavailableFragment serviceUnavailableFragment = (ServiceUnavailableFragment) ((a) c0327e.c.get());
                int dimensionPixelSize = serviceUnavailableFragment.getResources().getDimensionPixelSize(R.dimen.pma_margin_30dp);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) serviceUnavailableFragment.mImageMaintenance.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize;
                serviceUnavailableFragment.mImageMaintenance.setLayoutParams(layoutParams);
                serviceUnavailableFragment.mGroupForTheMeantime.setVisibility(0);
            } else {
                ServiceUnavailableFragment serviceUnavailableFragment2 = (ServiceUnavailableFragment) ((a) c0327e.c.get());
                int dimensionPixelSize2 = serviceUnavailableFragment2.getResources().getDimensionPixelSize(R.dimen.pma_margin_70dp);
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) serviceUnavailableFragment2.mImageMaintenance.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = dimensionPixelSize2;
                serviceUnavailableFragment2.mImageMaintenance.setLayoutParams(layoutParams2);
                serviceUnavailableFragment2.mGroupForTheMeantime.setVisibility(8);
            }
            if (z5) {
                return;
            }
            ServiceUnavailableFragment serviceUnavailableFragment3 = (ServiceUnavailableFragment) ((a) c0327e.c.get());
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) serviceUnavailableFragment3.mLayoutContainer.getLayoutParams();
            layoutParams3.topMargin = 0;
            serviceUnavailableFragment3.mLayoutContainer.setLayoutParams(layoutParams3);
        }
    }
}
