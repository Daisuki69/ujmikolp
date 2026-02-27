package com.paymaya.mayaui.common.view.fragment.impl;

import L9.C0327e;
import N5.E0;
import O5.a;
import S5.c;
import X6.d;
import Y6.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMaintenanceFragment extends MayaBaseFragment implements d {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public E0 f11914U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ImageView f11915V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f11916W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f11917X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C0327e f11918Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public e f11919Z;

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.MAINTENANCE;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        this.f10338R = true;
        this.f11919Z = (e) getActivity();
        a aVar = (a) W4.a.e().a().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(sessionSubject, "sessionSubject");
        C0327e c0327e = new C0327e(sessionSubject, 25);
        this.f11918Y = c0327e;
        c0327e.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_maintenance, viewGroup, false);
        int i = R.id.image_view_maintenance_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_maintenance_image);
        if (imageView != null) {
            i = R.id.text_view_maintenance_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_maintenance_description);
            if (textView != null) {
                i = R.id.text_view_maintenance_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_maintenance_title);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.f11914U = new E0(constraintLayout, imageView, textView, textView2);
                    j.f(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f11918Y;
        if (c0327e == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        e eVar = this.f11919Z;
        if (eVar != null) {
            eVar.Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        E0 e02 = this.f11914U;
        j.d(e02);
        this.f11915V = e02.f3593d;
        E0 e03 = this.f11914U;
        j.d(e03);
        this.f11916W = e03.e;
        E0 e04 = this.f11914U;
        j.d(e04);
        this.f11917X = e04.c;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i = arguments.getInt("image_res_id", 0);
            CharSequence charSequence = arguments.getCharSequence("title");
            CharSequence charSequence2 = arguments.getCharSequence("description");
            C0327e c0327e = this.f11918Y;
            if (c0327e == null) {
                j.n("mFragmentPresenter");
                throw null;
            }
            c0327e.j();
            if (i == 0) {
                MayaMaintenanceFragment mayaMaintenanceFragment = (MayaMaintenanceFragment) ((d) c0327e.c.get());
                ImageView imageView = mayaMaintenanceFragment.f11915V;
                if (imageView == null) {
                    j.n("mImageViewHeadImage");
                    throw null;
                }
                imageView.setImageDrawable(ContextCompat.getDrawable(mayaMaintenanceFragment.requireContext(), 2131231451));
            } else {
                MayaMaintenanceFragment mayaMaintenanceFragment2 = (MayaMaintenanceFragment) ((d) c0327e.c.get());
                ImageView imageView2 = mayaMaintenanceFragment2.f11915V;
                if (imageView2 == null) {
                    j.n("mImageViewHeadImage");
                    throw null;
                }
                imageView2.setImageDrawable(ContextCompat.getDrawable(mayaMaintenanceFragment2.requireContext(), i));
            }
            if (charSequence == null || C2576A.H(charSequence)) {
                MayaMaintenanceFragment mayaMaintenanceFragment3 = (MayaMaintenanceFragment) ((d) c0327e.c.get());
                TextView textView = mayaMaintenanceFragment3.f11916W;
                if (textView == null) {
                    j.n("mTextViewTitle");
                    throw null;
                }
                textView.setText(mayaMaintenanceFragment3.getString(R.string.maya_label_maintenance_title));
            } else {
                MayaMaintenanceFragment mayaMaintenanceFragment4 = (MayaMaintenanceFragment) ((d) c0327e.c.get());
                mayaMaintenanceFragment4.getClass();
                TextView textView2 = mayaMaintenanceFragment4.f11916W;
                if (textView2 == null) {
                    j.n("mTextViewTitle");
                    throw null;
                }
                textView2.setText(charSequence);
            }
            if (charSequence2 == null || C2576A.H(charSequence2)) {
                MayaMaintenanceFragment mayaMaintenanceFragment5 = (MayaMaintenanceFragment) ((d) c0327e.c.get());
                TextView textView3 = mayaMaintenanceFragment5.f11917X;
                if (textView3 != null) {
                    textView3.setText(mayaMaintenanceFragment5.getString(R.string.maya_label_maintenance_description));
                    return;
                } else {
                    j.n("mTextViewDescription");
                    throw null;
                }
            }
            MayaMaintenanceFragment mayaMaintenanceFragment6 = (MayaMaintenanceFragment) ((d) c0327e.c.get());
            mayaMaintenanceFragment6.getClass();
            TextView textView4 = mayaMaintenanceFragment6.f11917X;
            if (textView4 != null) {
                textView4.setText(charSequence2);
            } else {
                j.n("mTextViewDescription");
                throw null;
            }
        }
    }
}
