package com.paymaya.ui.common.view.fragment.impl;

import Bd.e;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public class ServiceUnavailableFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServiceUnavailableFragment f14406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14407b;

    @UiThread
    public ServiceUnavailableFragment_ViewBinding(ServiceUnavailableFragment serviceUnavailableFragment, View view) {
        this.f14406a = serviceUnavailableFragment;
        serviceUnavailableFragment.mLayoutContainer = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.constraint_layout_pma_fragment_service_unavailable, "field 'mLayoutContainer'", ConstraintLayout.class);
        serviceUnavailableFragment.mImageMaintenance = (ImageView) Utils.findRequiredViewAsType(view, R.id.maintenance_image_view_pma_fragment_service_unavailable, "field 'mImageMaintenance'", ImageView.class);
        serviceUnavailableFragment.mTextViewTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title_reusable_text_view_pma_fragment_service_unavailable, "field 'mTextViewTitle'", TextView.class);
        serviceUnavailableFragment.mTextViewDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.description_reusable_text_view_pma_fragment_service_unavailable, "field 'mTextViewDescription'", TextView.class);
        serviceUnavailableFragment.mGroupForTheMeantime = (Group) Utils.findRequiredViewAsType(view, R.id.for_the_meantime_group_pma_fragment_service_unavailable, "field 'mGroupForTheMeantime'", Group.class);
        serviceUnavailableFragment.mImageViewBackgroundGreen = (ImageView) Utils.findRequiredViewAsType(view, R.id.green_background_image_view_pma_fragment_service_unavailable, "field 'mImageViewBackgroundGreen'", ImageView.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.shop_now_button_pma_fragment_service_unavailable, "method 'onShopNowClicked'");
        this.f14407b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(serviceUnavailableFragment, 3));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        ServiceUnavailableFragment serviceUnavailableFragment = this.f14406a;
        if (serviceUnavailableFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14406a = null;
        serviceUnavailableFragment.mLayoutContainer = null;
        serviceUnavailableFragment.mImageMaintenance = null;
        serviceUnavailableFragment.mTextViewTitle = null;
        serviceUnavailableFragment.mTextViewDescription = null;
        serviceUnavailableFragment.mGroupForTheMeantime = null;
        serviceUnavailableFragment.mImageViewBackgroundGreen = null;
        this.f14407b.setOnClickListener(null);
        this.f14407b = null;
    }
}
