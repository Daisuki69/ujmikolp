package com.paymaya.ui.travel.view.fragment.impl;

import Bd.e;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public class ImageViewerFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageViewerFragment f14933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14934b;

    @UiThread
    public ImageViewerFragment_ViewBinding(ImageViewerFragment imageViewerFragment, View view) {
        this.f14933a = imageViewerFragment;
        imageViewerFragment.mImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.image_view_pma_fragment_image_viewer, "field 'mImageView'", ImageView.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.back_image_view_pma_fragment_image_viewer, "method 'onClickBackIcon'");
        this.f14934b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new e(imageViewerFragment, 2));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        ImageViewerFragment imageViewerFragment = this.f14933a;
        if (imageViewerFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14933a = null;
        imageViewerFragment.mImageView = null;
        this.f14934b.setOnClickListener(null);
        this.f14934b = null;
    }
}
