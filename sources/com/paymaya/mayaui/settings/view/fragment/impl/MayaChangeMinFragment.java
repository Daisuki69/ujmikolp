package com.paymaya.mayaui.settings.view.fragment.impl;

import D8.C0214w;
import N5.C0466m;
import O5.a;
import Rb.d;
import S5.c;
import Sb.l;
import W6.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.store.C1279q;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaChangeMinRemindersBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFragment;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaChangeMinFragment extends MayaBaseFragment implements d, e {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0466m f13937U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f13938V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Button f13939W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f13940X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f13941Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C0214w f13942Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public l f13943a0;

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.f13943a0 = (l) getActivity();
        a aVar = (a) W4.a.e().y().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        C1279q c1279qI = aVar.i();
        S0 s0S = aVar.S();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        C0214w c0214w = new C0214w(preference, c1279qI, s0S, sessionSubject);
        this.f13942Z = c0214w;
        c0214w.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_change_min, viewGroup, false);
        int i = R.id.button_change_mobile_number;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_change_mobile_number);
        if (button != null) {
            i = R.id.image_view_registered_mobile_number_icon;
            if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_registered_mobile_number_icon)) != null) {
                i = R.id.space_useful_links_top;
                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_useful_links_top)) != null) {
                    i = R.id.text_view_header_description;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_description)) != null) {
                        i = R.id.text_view_header_title;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_title)) != null) {
                            i = R.id.text_view_registered_mobile_number_label;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_registered_mobile_number_label)) != null) {
                                i = R.id.text_view_registered_mobile_number_text;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_registered_mobile_number_text);
                                if (textView != null) {
                                    i = R.id.text_view_useful_links_guide;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_useful_links_guide);
                                    if (textView2 != null) {
                                        i = R.id.text_view_useful_links_label;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_useful_links_label)) != null) {
                                            i = R.id.text_view_useful_links_no_access;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_useful_links_no_access);
                                            if (textView3 != null) {
                                                i = R.id.view_registered_mobile_number_background;
                                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_registered_mobile_number_background);
                                                if (viewFindChildViewById != null) {
                                                    i = R.id.view_registered_mobile_number_bottom_space;
                                                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.view_registered_mobile_number_bottom_space)) != null) {
                                                        i = R.id.view_useful_links_background;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_useful_links_background);
                                                        if (viewFindChildViewById2 != null) {
                                                            i = R.id.view_useful_links_constraint_guide;
                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_useful_links_constraint_guide);
                                                            if (viewFindChildViewById3 != null) {
                                                                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                                this.f13937U = new C0466m(nestedScrollView, button, textView, textView2, textView3, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
                                                                j.f(nestedScrollView, "getRoot(...)");
                                                                return nestedScrollView;
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0214w c0214w = this.f13942Z;
        if (c0214w == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        c0214w.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13937U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, W6.e
    public final void onDismiss() {
        l lVar = this.f13943a0;
        if (lVar != null) {
            String string = getString(R.string.maya_label_enter_password);
            j.f(string, "getString(...)");
            String string2 = getString(R.string.maya_label_change_min_enter_password_description);
            j.f(string2, "getString(...)");
            ((MayaSettingsActivity) lVar).Z1(string, string2);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        l lVar = this.f13943a0;
        if (lVar != null) {
            ((MayaSettingsActivity) lVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0466m c0466m = this.f13937U;
        j.d(c0466m);
        this.f13938V = (TextView) c0466m.f4152g;
        C0466m c0466m2 = this.f13937U;
        j.d(c0466m2);
        this.f13939W = (Button) c0466m2.c;
        C0466m c0466m3 = this.f13937U;
        j.d(c0466m3);
        this.f13940X = (TextView) c0466m3.i;
        C0466m c0466m4 = this.f13937U;
        j.d(c0466m4);
        this.f13941Y = (TextView) c0466m4.h;
        C0214w c0214w = this.f13942Z;
        if (c0214w == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        c0214w.j();
        Button button = this.f13939W;
        if (button == null) {
            j.n("mButtonChangeMobileNumber");
            throw null;
        }
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Sb.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaChangeMinFragment f5705b;

            {
                this.f5705b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaChangeMinFragment mayaChangeMinFragment = this.f5705b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iO1 = mayaChangeMinFragment.o1();
                            FragmentActivity activity = mayaChangeMinFragment.getActivity();
                            C1219h c1219hD = C1219h.d(EnumC1215d.MOBILE_NUMBER);
                            c1219hD.n(17);
                            AbstractC1414e.n(c1219hD, EnumC1217f.CHANGE_MOBILE, c1220iO1, activity, c1219hD);
                            l lVar = mayaChangeMinFragment.f13943a0;
                            if (lVar != null) {
                                new MayaChangeMinRemindersBottomSheetDialogFragment().show(((MayaSettingsActivity) lVar).getSupportFragmentManager(), "alert_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaChangeMinFragment mayaChangeMinFragment2 = this.f5705b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iO12 = mayaChangeMinFragment2.o1();
                            FragmentActivity activity2 = mayaChangeMinFragment2.getActivity();
                            C1219h c1219hD2 = C1219h.d(EnumC1215d.MOBILE_NUMBER);
                            c1219hD2.n(17);
                            c1219hD2.t(EnumC1217f.NO_ACCESS);
                            c1219hD2.i();
                            c1220iO12.c(activity2, c1219hD2);
                            l lVar2 = mayaChangeMinFragment2.f13943a0;
                            if (lVar2 != null) {
                                MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) lVar2;
                                mayaSettingsActivity.n1().w(mayaSettingsActivity, "https://cares.paymaya.com/s/article/I-lost-the-SIM-and-or-phone-with-the-number-that-s-registered-to-my-PayMaya-account");
                            }
                            return;
                        } finally {
                        }
                    default:
                        MayaChangeMinFragment mayaChangeMinFragment3 = this.f5705b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iO13 = mayaChangeMinFragment3.o1();
                            FragmentActivity activity3 = mayaChangeMinFragment3.getActivity();
                            C1219h c1219hD3 = C1219h.d(EnumC1215d.MOBILE_NUMBER);
                            c1219hD3.n(17);
                            c1219hD3.t(EnumC1217f.GUIDE);
                            c1219hD3.i();
                            c1220iO13.c(activity3, c1219hD3);
                            l lVar3 = mayaChangeMinFragment3.f13943a0;
                            if (lVar3 != null) {
                                MayaSettingsActivity mayaSettingsActivity2 = (MayaSettingsActivity) lVar3;
                                mayaSettingsActivity2.n1().w(mayaSettingsActivity2, "https://cares.paymaya.com/s/article/How-do-I-change-the-registered-mobile-number-in-my-PayMaya-account");
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView = this.f13940X;
        if (textView == null) {
            j.n("mTextViewUsefulLinkNoAccess");
            throw null;
        }
        final int i4 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: Sb.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaChangeMinFragment f5705b;

            {
                this.f5705b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaChangeMinFragment mayaChangeMinFragment = this.f5705b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iO1 = mayaChangeMinFragment.o1();
                            FragmentActivity activity = mayaChangeMinFragment.getActivity();
                            C1219h c1219hD = C1219h.d(EnumC1215d.MOBILE_NUMBER);
                            c1219hD.n(17);
                            AbstractC1414e.n(c1219hD, EnumC1217f.CHANGE_MOBILE, c1220iO1, activity, c1219hD);
                            l lVar = mayaChangeMinFragment.f13943a0;
                            if (lVar != null) {
                                new MayaChangeMinRemindersBottomSheetDialogFragment().show(((MayaSettingsActivity) lVar).getSupportFragmentManager(), "alert_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaChangeMinFragment mayaChangeMinFragment2 = this.f5705b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iO12 = mayaChangeMinFragment2.o1();
                            FragmentActivity activity2 = mayaChangeMinFragment2.getActivity();
                            C1219h c1219hD2 = C1219h.d(EnumC1215d.MOBILE_NUMBER);
                            c1219hD2.n(17);
                            c1219hD2.t(EnumC1217f.NO_ACCESS);
                            c1219hD2.i();
                            c1220iO12.c(activity2, c1219hD2);
                            l lVar2 = mayaChangeMinFragment2.f13943a0;
                            if (lVar2 != null) {
                                MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) lVar2;
                                mayaSettingsActivity.n1().w(mayaSettingsActivity, "https://cares.paymaya.com/s/article/I-lost-the-SIM-and-or-phone-with-the-number-that-s-registered-to-my-PayMaya-account");
                            }
                            return;
                        } finally {
                        }
                    default:
                        MayaChangeMinFragment mayaChangeMinFragment3 = this.f5705b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iO13 = mayaChangeMinFragment3.o1();
                            FragmentActivity activity3 = mayaChangeMinFragment3.getActivity();
                            C1219h c1219hD3 = C1219h.d(EnumC1215d.MOBILE_NUMBER);
                            c1219hD3.n(17);
                            c1219hD3.t(EnumC1217f.GUIDE);
                            c1219hD3.i();
                            c1220iO13.c(activity3, c1219hD3);
                            l lVar3 = mayaChangeMinFragment3.f13943a0;
                            if (lVar3 != null) {
                                MayaSettingsActivity mayaSettingsActivity2 = (MayaSettingsActivity) lVar3;
                                mayaSettingsActivity2.n1().w(mayaSettingsActivity2, "https://cares.paymaya.com/s/article/How-do-I-change-the-registered-mobile-number-in-my-PayMaya-account");
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView2 = this.f13941Y;
        if (textView2 == null) {
            j.n("mTextViewUsefulLinkGuide");
            throw null;
        }
        final int i6 = 2;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: Sb.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaChangeMinFragment f5705b;

            {
                this.f5705b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaChangeMinFragment mayaChangeMinFragment = this.f5705b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iO1 = mayaChangeMinFragment.o1();
                            FragmentActivity activity = mayaChangeMinFragment.getActivity();
                            C1219h c1219hD = C1219h.d(EnumC1215d.MOBILE_NUMBER);
                            c1219hD.n(17);
                            AbstractC1414e.n(c1219hD, EnumC1217f.CHANGE_MOBILE, c1220iO1, activity, c1219hD);
                            l lVar = mayaChangeMinFragment.f13943a0;
                            if (lVar != null) {
                                new MayaChangeMinRemindersBottomSheetDialogFragment().show(((MayaSettingsActivity) lVar).getSupportFragmentManager(), "alert_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaChangeMinFragment mayaChangeMinFragment2 = this.f5705b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iO12 = mayaChangeMinFragment2.o1();
                            FragmentActivity activity2 = mayaChangeMinFragment2.getActivity();
                            C1219h c1219hD2 = C1219h.d(EnumC1215d.MOBILE_NUMBER);
                            c1219hD2.n(17);
                            c1219hD2.t(EnumC1217f.NO_ACCESS);
                            c1219hD2.i();
                            c1220iO12.c(activity2, c1219hD2);
                            l lVar2 = mayaChangeMinFragment2.f13943a0;
                            if (lVar2 != null) {
                                MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) lVar2;
                                mayaSettingsActivity.n1().w(mayaSettingsActivity, "https://cares.paymaya.com/s/article/I-lost-the-SIM-and-or-phone-with-the-number-that-s-registered-to-my-PayMaya-account");
                            }
                            return;
                        } finally {
                        }
                    default:
                        MayaChangeMinFragment mayaChangeMinFragment3 = this.f5705b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iO13 = mayaChangeMinFragment3.o1();
                            FragmentActivity activity3 = mayaChangeMinFragment3.getActivity();
                            C1219h c1219hD3 = C1219h.d(EnumC1215d.MOBILE_NUMBER);
                            c1219hD3.n(17);
                            c1219hD3.t(EnumC1217f.GUIDE);
                            c1219hD3.i();
                            c1220iO13.c(activity3, c1219hD3);
                            l lVar3 = mayaChangeMinFragment3.f13943a0;
                            if (lVar3 != null) {
                                MayaSettingsActivity mayaSettingsActivity2 = (MayaSettingsActivity) lVar3;
                                mayaSettingsActivity2.n1().w(mayaSettingsActivity2, "https://cares.paymaya.com/s/article/How-do-I-change-the-registered-mobile-number-in-my-PayMaya-account");
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.MOBILE_NUMBER;
    }
}
