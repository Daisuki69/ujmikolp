package com.paymaya.mayaui.settings.view.fragment.impl;

import E8.l;
import G5.A;
import G5.C0251a;
import G6.u;
import Kb.a;
import Lb.b;
import Lh.d;
import Lh.h;
import M8.C0332a;
import N5.C0453g;
import R4.i;
import Rb.c;
import Sb.j;
import Th.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.ChangeMin;
import com.paymaya.domain.model.Identity;
import com.paymaya.domain.store.C1279q;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import kotlin.jvm.functions.Function0;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaChangeMinFormFragment extends MayaBaseFragment implements c {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0453g f13931U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public MayaInputLayout f13932V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f13933W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Button f13934X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public b f13935Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public j f13936Z;

    public static final void H1(MayaChangeMinFormFragment mayaChangeMinFormFragment) {
        b bVar = (b) mayaChangeMinFormFragment.G1();
        ((MayaBaseFragment) ((c) bVar.c.get())).E1();
        new d(new d(new h(bVar.e.f11472b.updateNewIdentity(ChangeMin.sBuilder().mId(bVar.f).mIdentity(Identity.sBuilder().mType("msisdn").mValue(bVar.k()).build()).build()).h(e.c), zh.b.a(), 0), new u(bVar, 15), 2), new Gb.d(bVar, 14), 0).e();
    }

    public final a G1() {
        b bVar = this.f13935Y;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.j.n("mFragmentPresenter");
        throw null;
    }

    public final void I1(boolean z4) {
        Button button = this.f13934X;
        if (button != null) {
            button.setEnabled(z4);
        } else {
            kotlin.jvm.internal.j.n("mButtonSave");
            throw null;
        }
    }

    public final void J1(String str) {
        TextView textView = this.f13933W;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewNewMobileNumberError");
            throw null;
        }
        textView.setText(str);
        TextView textView2 = this.f13933W;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewNewMobileNumberError");
            throw null;
        }
        textView2.setVisibility(0);
        MayaInputLayout mayaInputLayout = this.f13932V;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutNewMobileNumber");
            throw null;
        }
        mayaInputLayout.r();
        MayaInputLayout mayaInputLayout2 = this.f13932V;
        if (mayaInputLayout2 != null) {
            mayaInputLayout2.p();
        } else {
            kotlin.jvm.internal.j.n("mMayaInputLayoutNewMobileNumber");
            throw null;
        }
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        j jVar = this.f13936Z;
        if (jVar == null) {
            return true;
        }
        ((MayaSettingsActivity) jVar).a2();
        return true;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.f13936Z = (j) getActivity();
        O5.a aVar = (O5.a) W4.a.e().y().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        C1279q c1279qI = aVar.i();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        kotlin.jvm.internal.j.g(preference, "preference");
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        this.f13935Y = new b(preference, c1279qI, sessionSubject);
        ((AbstractC2509a) G1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_change_min_form, viewGroup, false);
        int i = R.id.button_save;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_save);
        if (button != null) {
            i = R.id.image_view_mobile_number_prefix;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_mobile_number_prefix)) != null) {
                i = R.id.maya_input_layout_new_mobile_number;
                MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_new_mobile_number);
                if (mayaInputLayout != null) {
                    i = R.id.text_view_mobile_number_prefix;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_mobile_number_prefix)) != null) {
                        i = R.id.text_view_new_mobile_number_description;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_new_mobile_number_description)) != null) {
                            i = R.id.text_view_new_mobile_number_error;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_new_mobile_number_error);
                            if (textView != null) {
                                i = R.id.view_container;
                                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_container)) != null) {
                                    i = R.id.view_mobile_number_prefix;
                                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_mobile_number_prefix)) != null) {
                                        NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                        this.f13931U = new C0453g(9, nestedScrollView, button, mayaInputLayout, textView);
                                        kotlin.jvm.internal.j.f(nestedScrollView, "getRoot(...)");
                                        return nestedScrollView;
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
        ((AbstractC2509a) G1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13931U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        j jVar = this.f13936Z;
        if (jVar != null) {
            ((MayaSettingsActivity) jVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f13931U;
        kotlin.jvm.internal.j.d(c0453g);
        this.f13932V = (MayaInputLayout) c0453g.f4095d;
        C0453g c0453g2 = this.f13931U;
        kotlin.jvm.internal.j.d(c0453g2);
        this.f13933W = (TextView) c0453g2.e;
        C0453g c0453g3 = this.f13931U;
        kotlin.jvm.internal.j.d(c0453g3);
        this.f13934X = (Button) c0453g3.c;
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(TtmlNode.ATTR_ID);
            b bVar = (b) G1();
            bVar.f = string;
            c cVar = (c) bVar.c.get();
            String strR = bVar.f2943d.r();
            kotlin.jvm.internal.j.f(strR, "getMobileNumber(...)");
            MayaChangeMinFormFragment mayaChangeMinFormFragment = (MayaChangeMinFormFragment) cVar;
            mayaChangeMinFormFragment.getClass();
            C0251a c0251a = new C0251a();
            c0251a.c = strR;
            c0251a.f1726b = new i(mayaChangeMinFormFragment, 1);
            A a8 = new A(new A5.j(11), (Function0) null, (Function0) null, 14);
            a8.c = new C0332a(mayaChangeMinFormFragment, 28);
            MayaInputLayout mayaInputLayout = mayaChangeMinFormFragment.f13932V;
            if (mayaInputLayout == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutNewMobileNumber");
                throw null;
            }
            mayaInputLayout.getInputEditText().addTextChangedListener(c0251a);
            mayaInputLayout.getInputEditText().addTextChangedListener(a8);
            MayaInputLayout mayaInputLayout2 = mayaChangeMinFormFragment.f13932V;
            if (mayaInputLayout2 == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutNewMobileNumber");
                throw null;
            }
            mayaInputLayout2.postDelayed(new l(mayaChangeMinFormFragment, 9), 200L);
        }
        Button button = this.f13934X;
        if (button != null) {
            button.setOnClickListener(new S.b(this, 8));
        } else {
            kotlin.jvm.internal.j.n("mButtonSave");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.ENTER_NEW_MOBILE_NUMBER;
    }
}
