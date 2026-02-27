package com.paymaya.ui.travel.view.fragment.impl;

import Lh.c;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.OnClick;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.ui.travel.view.activity.impl.TravelActivity;
import z2.d;

/* JADX INFO: loaded from: classes4.dex */
public class ImageViewerFragment extends BaseFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Ae.a f14931S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public He.a f14932T;

    @BindView(R.id.image_view_pma_fragment_image_viewer)
    ImageView mImageView;

    @OnClick({R.id.back_image_view_pma_fragment_image_viewer})
    public void onClickBackIcon() {
        ((TravelActivity) this.f14932T).g1();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVarI = W4.a.e().I();
        O5.a aVar = (O5.a) cVarI.c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        ((d) cVarI.f2990b).getClass();
        this.f14931S = new Ae.a(24);
        this.f14932T = (He.a) getActivity();
        this.f14931S.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pma_fragment_image_viewer, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f14931S.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((TravelActivity) this.f14932T).Q(this);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() != null && getArguments().getString("bitmap_base64") != null) {
            byte[] bArrDecode = Base64.decode(getArguments().getString("bitmap_base64"), 0);
            this.mImageView.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        }
        this.f14931S.j();
    }
}
