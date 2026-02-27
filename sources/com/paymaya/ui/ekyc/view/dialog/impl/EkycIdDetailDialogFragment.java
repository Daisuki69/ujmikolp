package com.paymaya.ui.ekyc.view.dialog.impl;

import N5.C0450f;
import W4.a;
import We.A;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseDialogFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import i8.C1593a;
import java.io.File;
import kotlin.jvm.internal.j;
import qf.d;
import wd.InterfaceC2395a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class EkycIdDetailDialogFragment extends BaseDialogFragment implements InterfaceC2395a {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C0450f f14500R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ImageView f14501S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ImageView f14502T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C1593a f14503U;

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10241B = (C1220i) a.e().d().f4753a.f4716g.get();
        C1593a c1593a = new C1593a(11);
        this.f14503U = c1593a;
        c1593a.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_dialog_fragment_ekyc_id_detail, viewGroup, false);
        int i = R.id.back_image_view_pma_dialog_fragment_ekyc_id_detail;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.back_image_view_pma_dialog_fragment_ekyc_id_detail);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.id_preview_image_view_pma_dialog_fragment_ekyc_id_detail);
            if (imageView2 != null) {
                this.f14500R = new C0450f((ViewGroup) constraintLayout, (View) imageView, (View) imageView2, 22);
                return constraintLayout;
            }
            i = R.id.id_preview_image_view_pma_dialog_fragment_ekyc_id_detail;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1593a c1593a = this.f14503U;
        if (c1593a == null) {
            j.n("mGovernmentIdDetailDialogFragmentPresenter");
            throw null;
        }
        c1593a.i();
        super.onDestroy();
        this.f14500R = null;
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0450f c0450f = this.f14500R;
        j.d(c0450f);
        this.f14501S = (ImageView) c0450f.f4087b;
        C0450f c0450f2 = this.f14500R;
        j.d(c0450f2);
        this.f14502T = (ImageView) c0450f2.f4088d;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            C1593a c1593a = this.f14503U;
            if (c1593a == null) {
                j.n("mGovernmentIdDetailDialogFragmentPresenter");
                throw null;
            }
            String string = arguments.getString("government_id_url");
            File file = (File) arguments.getSerializable("government_id_file");
            c1593a.j();
            if (string != null && !C2576A.H(string)) {
                EkycIdDetailDialogFragment ekycIdDetailDialogFragment = (EkycIdDetailDialogFragment) ((InterfaceC2395a) c1593a.c.get());
                ekycIdDetailDialogFragment.getActivity();
                ImageView imageView = ekycIdDetailDialogFragment.f14501S;
                if (imageView == null) {
                    j.n("mImageViewGovernmentId");
                    throw null;
                }
                C.d0(imageView, string);
            } else if (file != null) {
                EkycIdDetailDialogFragment ekycIdDetailDialogFragment2 = (EkycIdDetailDialogFragment) ((InterfaceC2395a) c1593a.c.get());
                ekycIdDetailDialogFragment2.getActivity();
                ImageView imageView2 = ekycIdDetailDialogFragment2.f14501S;
                if (imageView2 == null) {
                    j.n("mImageViewGovernmentId");
                    throw null;
                }
                A aD = A.d();
                aD.getClass();
                aD.g(Uri.fromFile(file)).e(imageView2, null);
            }
        }
        ImageView imageView3 = this.f14502T;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new d(this, 12));
        } else {
            j.n("mImageViewBackButton");
            throw null;
        }
    }
}
