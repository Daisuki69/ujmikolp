package com.paymaya.mayaui.regv2.view.fragment.impl;

import Ah.o;
import Ah.p;
import Hh.g;
import Kh.J;
import M8.D2;
import M8.T;
import M8.W2;
import N5.C;
import Q6.s;
import Wa.a;
import Xa.b;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import cj.M;
import com.google.firebase.messaging.n;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.P;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.ValidationResult;
import com.paymaya.domain.store.C1253d;
import com.paymaya.domain.store.C1284t;
import com.paymaya.domain.store.CallableC1251c;
import com.paymaya.domain.store.E0;
import com.paymaya.domain.store.H0;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.login.view.activity.impl.MayaAuthBaseFragment;
import com.paymaya.mayaui.login.view.dialog.impl.MayaPasswordTipsBottomSheetDialogFragment;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountCreationFragment;
import dOYHB6.tiZVw8.numX49;
import db.InterfaceC1348a;
import eb.c;
import eb.d;
import eb.e;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import y5.AbstractC2509a;
import yj.f;
import yj.q;

/* JADX INFO: loaded from: classes4.dex */
public class MayaAccountCreationFragment extends MayaAuthBaseFragment implements InterfaceC1348a {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C f13677V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public b f13678W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public d f13679X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f13680Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final D2 f13681Z = new D2(this, 9);

    public static void J1(MayaAccountCreationFragment mayaAccountCreationFragment, String str, String str2, String str3, String str4) {
        if (mayaAccountCreationFragment.isAdded()) {
            C1229s c1229sH1 = mayaAccountCreationFragment.H1();
            FragmentActivity fragmentActivityRequireActivity = mayaAccountCreationFragment.requireActivity();
            j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            C1229s.c(c1229sH1, fragmentActivityRequireActivity, str, str2, str4, str3, null, null, null, 160);
        }
    }

    public final a I1() {
        b bVar = this.f13678W;
        if (bVar != null) {
            return bVar;
        }
        j.n("mMayaAccountCreationFragmentPresenter");
        throw null;
    }

    public final void K1(String inputLabel, String str, boolean z4) {
        if (isAdded()) {
            C1229s c1229sH1 = H1();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            String strS = s();
            j.g(inputLabel, "inputLabel");
            LinkedHashMap linkedHashMapI = M.i(new Pair(EnumC1212a.SOURCE_PAGE, strS), new Pair(EnumC1212a.INPUT_LABEL, inputLabel), new Pair(EnumC1212a.IS_INVALID, z4 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
            if (!z4 && str != null) {
                linkedHashMapI.put(EnumC1212a.INVALID_REASON, str);
            }
            c1229sH1.b(fragmentActivityRequireActivity, "REGV2_ACCOUNT_CREATION_INPUTTED", linkedHashMapI);
        }
    }

    public final void L1() {
        Pair pair;
        C c = this.f13677V;
        j.d(c);
        f fVarH = q.h(q.n(q.n(q.h(q.h(ViewGroupKt.getChildren((ConstraintLayout) c.f3561g), e.f16630a), new H0(3)), new H0(4)), new c(this, 1)), new H0(5));
        MayaProfileInputLayout mayaProfileInputLayout = null;
        if (q.p(fVarH)) {
            fVarH = null;
        }
        if (fVarH != null) {
            yj.e eVar = new yj.e(fVarH);
            while (eVar.hasNext()) {
                Pair pair2 = (Pair) eVar.next();
                Va.f.b((MayaProfileInputLayout) pair2.f18160a, (ValidationResult) pair2.f18161b, null);
            }
        }
        if (fVarH == null) {
            com.paymaya.common.utility.C.R(getActivity());
            b bVar = (b) I1();
            ((MayaBaseFragment) ((InterfaceC1348a) bVar.c.get())).E1();
            E0 e02 = bVar.f6545d;
            C c10 = ((MayaAccountCreationFragment) ((InterfaceC1348a) bVar.c.get())).f13677V;
            j.d(c10);
            String strP = jk.b.p((MayaProfileInputLayout) c10.m);
            e02.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("password", strP);
            } catch (JSONException unused) {
                yk.a.e();
            }
            g gVarB = e02.f11346b.validatePassword(Je.d.a(jSONObject.toString().getBytes(Charset.forName("UTF-8")))).a(new C2.f(23)).b(Xa.a.f6542b);
            Lh.d dVar = new Lh.d(bVar.e.f11481b.getConsent().d(new n(22)), Xa.a.c, 0);
            bVar.f.getClass();
            p pVarL = p.l(dVar, new J(new CallableC1251c(), 3), Xa.a.f6543d);
            o oVarA = zh.b.a();
            Na.d dVar2 = new Na.d(bVar, 29);
            Gh.d dVar3 = new Gh.d(1, new Qd.a(bVar, 6), new s(bVar, 7));
            try {
                try {
                    try {
                        gVarB.d(new Gh.d(4, new Lh.g(new Hh.d(dVar3, dVar2, 1), oVarA), pVarL));
                        bVar.e(dVar3);
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (Throwable th2) {
                        AbstractC0983W.G(th2);
                        NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                        nullPointerException.initCause(th2);
                        throw nullPointerException;
                    }
                } catch (NullPointerException e7) {
                    throw e7;
                } catch (Throwable th3) {
                    AbstractC0983W.G(th3);
                    NullPointerException nullPointerException2 = new NullPointerException("subscribeActual failed");
                    nullPointerException2.initCause(th3);
                    throw nullPointerException2;
                }
            } catch (NullPointerException e10) {
                throw e10;
            } catch (Throwable th4) {
                throw AbstractC1213b.L(th4, "subscribeActual failed", th4);
            }
        }
        if (fVarH != null && (pair = (Pair) q.j(fVarH)) != null) {
            mayaProfileInputLayout = (MayaProfileInputLayout) pair.f18160a;
        }
        if (mayaProfileInputLayout != null) {
            C c11 = this.f13677V;
            j.d(c11);
            ((ScrollView) c11.f3565o).smoothScrollTo(0, mayaProfileInputLayout.getTop());
            mayaProfileInputLayout.requestFocus();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().w().f4755a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f12720U = (C1229s) aVar.f4684R.get();
        E0 e0M = aVar.M();
        C1284t c1284tJ = aVar.j();
        C1253d c1253d = new C1253d();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        P partnerOnboardingUtils = (P) aVar.f4687T.get();
        j.g(preference, "preference");
        j.g(partnerOnboardingUtils, "partnerOnboardingUtils");
        this.f13678W = new b(e0M, c1284tJ, c1253d, preference, partnerOnboardingUtils);
        C1219h c1219hE = C1219h.e(AbstractC1213b.h(2));
        c1219hE.i();
        this.f10337Q = c1219hE;
        this.f10338R = true;
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountCreationFragment.MayaAccountCreationFragmentListener");
        this.f13679X = (d) activity;
        ((AbstractC2509a) I1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_account_creation, viewGroup, false);
        int i = R.id.continue_button;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_button);
        if (button != null) {
            i = R.id.divider_email_address;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.divider_email_address);
            if (viewFindChildViewById != null) {
                i = R.id.divider_user_name;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.divider_user_name);
                if (viewFindChildViewById2 != null) {
                    i = R.id.form_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.form_container);
                    if (constraintLayout != null) {
                        i = R.id.maya_input_email_address;
                        MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_email_address);
                        if (mayaProfileInputLayout != null) {
                            i = R.id.maya_input_first_name;
                            MayaProfileInputLayout mayaProfileInputLayout2 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_first_name);
                            if (mayaProfileInputLayout2 != null) {
                                i = R.id.maya_input_last_name;
                                MayaProfileInputLayout mayaProfileInputLayout3 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_last_name);
                                if (mayaProfileInputLayout3 != null) {
                                    i = R.id.maya_input_middle_name;
                                    MayaProfileInputLayout mayaProfileInputLayout4 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_middle_name);
                                    if (mayaProfileInputLayout4 != null) {
                                        i = R.id.maya_input_mobile_number;
                                        MayaProfileInputLayout mayaProfileInputLayout5 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_mobile_number);
                                        if (mayaProfileInputLayout5 != null) {
                                            i = R.id.maya_input_password;
                                            MayaProfileInputLayout mayaProfileInputLayout6 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_password);
                                            if (mayaProfileInputLayout6 != null) {
                                                i = R.id.middle_name_checkbox;
                                                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.middle_name_checkbox);
                                                if (appCompatCheckBox != null) {
                                                    i = R.id.password_tips_text_view;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.password_tips_text_view);
                                                    if (textView != null) {
                                                        i = R.id.scrollable_nested_scroll_view;
                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_nested_scroll_view);
                                                        if (scrollView != null) {
                                                            i = R.id.title_header_create_an_account;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_header_create_an_account)) != null) {
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                                this.f13677V = new C(constraintLayout2, button, viewFindChildViewById, viewFindChildViewById2, constraintLayout, mayaProfileInputLayout, mayaProfileInputLayout2, mayaProfileInputLayout3, mayaProfileInputLayout4, mayaProfileInputLayout5, mayaProfileInputLayout6, appCompatCheckBox, textView, scrollView);
                                                                return constraintLayout2;
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
        ((AbstractC2509a) I1()).i();
        super.onDestroy();
        this.f13677V = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        d dVar = this.f13679X;
        if (dVar != null) {
            ((MayaRegistrationV2Activity) dVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final int i = 1;
        final int i4 = 4;
        final int i6 = 0;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        x1(this.f13681Z);
        C1220i c1220iO1 = o1();
        final int i10 = 2;
        C1219h c1219hE = C1219h.e(AbstractC1213b.v(2));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = G1().r().toString();
        if (string.length() == 0) {
            string = "Landing";
        }
        HashMap map = c1219hE.j;
        map.put("source_page", string);
        map.put("screen_name", s());
        c1219hE.i();
        c1220iO1.b(c1219hE);
        C c = this.f13677V;
        j.d(c);
        AppCompatEditText floatingPrefix = ((MayaProfileInputLayout) c.f3563l).getFloatingPrefix();
        floatingPrefix.setText(getString(R.string.maya_label_philippines_phone_prefix));
        floatingPrefix.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(requireContext(), 2131231256), (Drawable) null, (Drawable) null, (Drawable) null);
        floatingPrefix.setCompoundDrawablePadding(floatingPrefix.getResources().getDimensionPixelSize(R.dimen.maya_padding_extra_small));
        C c10 = this.f13677V;
        j.d(c10);
        MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) c10.i;
        mayaProfileInputLayout.requestFocus();
        com.paymaya.common.utility.C.u0(getActivity(), mayaProfileInputLayout);
        C c11 = this.f13677V;
        j.d(c11);
        Ke.b.b(((MayaProfileInputLayout) c11.m).getPrimaryIconImageView(), new Function0(this) { // from class: eb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAccountCreationFragment f16625b;

            {
                this.f16625b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        MayaAccountCreationFragment mayaAccountCreationFragment = this.f16625b;
                        mayaAccountCreationFragment.f13680Y = !mayaAccountCreationFragment.f13680Y;
                        C1229s c1229sH1 = mayaAccountCreationFragment.H1();
                        FragmentActivity fragmentActivityRequireActivity = mayaAccountCreationFragment.requireActivity();
                        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, numX49.tnTj78("bi9Pj"));
                        String strP = AbstractC1213b.p(2);
                        kotlin.jvm.internal.j.f(strP, numX49.tnTj78("bi9Pd"));
                        c1229sH1.a(fragmentActivityRequireActivity, strP, mayaAccountCreationFragment.s(), null, mayaAccountCreationFragment.f13680Y, EnumC1212a.BUTTON, new g(1, mayaAccountCreationFragment.H1(), C1229s.class, numX49.tnTj78("bi9Pi"), numX49.tnTj78("bi9PE"), 0, 0), new g(1, mayaAccountCreationFragment.H1(), C1229s.class, numX49.tnTj78("bi9PF"), numX49.tnTj78("bi9PH"), 0, 1), M.e());
                        C c12 = mayaAccountCreationFragment.f13677V;
                        kotlin.jvm.internal.j.d(c12);
                        jk.b.z((MayaProfileInputLayout) c12.m, mayaAccountCreationFragment.f13680Y);
                        break;
                    case 1:
                        this.f16625b.L1();
                        break;
                    default:
                        String strP2 = AbstractC1213b.p(2);
                        kotlin.jvm.internal.j.f(strP2, numX49.tnTj78("bi9PV"));
                        MayaAccountCreationFragment mayaAccountCreationFragment2 = this.f16625b;
                        String strS = mayaAccountCreationFragment2.s();
                        C c13 = mayaAccountCreationFragment2.f13677V;
                        kotlin.jvm.internal.j.d(c13);
                        MayaAccountCreationFragment.J1(mayaAccountCreationFragment2, strP2, strS, ((TextView) c13.f3559b).getText().toString(), numX49.tnTj78("bi9PS"));
                        d dVar = mayaAccountCreationFragment2.f13679X;
                        if (dVar != null) {
                            MayaPasswordTipsBottomSheetDialogFragment mayaPasswordTipsBottomSheetDialogFragment = new MayaPasswordTipsBottomSheetDialogFragment();
                            mayaPasswordTipsBottomSheetDialogFragment.show(((MayaRegistrationV2Activity) dVar).getSupportFragmentManager(), mayaPasswordTipsBottomSheetDialogFragment.getTag());
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        C c12 = this.f13677V;
        j.d(c12);
        ((MayaProfileInputLayout) c12.m).getInputEditText().setOnEditorActionListener(new Ke.e(this, i4));
        C c13 = this.f13677V;
        j.d(c13);
        ((AppCompatCheckBox) c13.f3564n).setOnCheckedChangeListener(new W2(this, i4));
        C c14 = this.f13677V;
        j.d(c14);
        Ke.b.b(c14.f3560d, new Function0(this) { // from class: eb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAccountCreationFragment f16625b;

            {
                this.f16625b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MayaAccountCreationFragment mayaAccountCreationFragment = this.f16625b;
                        mayaAccountCreationFragment.f13680Y = !mayaAccountCreationFragment.f13680Y;
                        C1229s c1229sH1 = mayaAccountCreationFragment.H1();
                        FragmentActivity fragmentActivityRequireActivity = mayaAccountCreationFragment.requireActivity();
                        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, numX49.tnTj78("bi9Pj"));
                        String strP = AbstractC1213b.p(2);
                        kotlin.jvm.internal.j.f(strP, numX49.tnTj78("bi9Pd"));
                        c1229sH1.a(fragmentActivityRequireActivity, strP, mayaAccountCreationFragment.s(), null, mayaAccountCreationFragment.f13680Y, EnumC1212a.BUTTON, new g(1, mayaAccountCreationFragment.H1(), C1229s.class, numX49.tnTj78("bi9Pi"), numX49.tnTj78("bi9PE"), 0, 0), new g(1, mayaAccountCreationFragment.H1(), C1229s.class, numX49.tnTj78("bi9PF"), numX49.tnTj78("bi9PH"), 0, 1), M.e());
                        C c122 = mayaAccountCreationFragment.f13677V;
                        kotlin.jvm.internal.j.d(c122);
                        jk.b.z((MayaProfileInputLayout) c122.m, mayaAccountCreationFragment.f13680Y);
                        break;
                    case 1:
                        this.f16625b.L1();
                        break;
                    default:
                        String strP2 = AbstractC1213b.p(2);
                        kotlin.jvm.internal.j.f(strP2, numX49.tnTj78("bi9PV"));
                        MayaAccountCreationFragment mayaAccountCreationFragment2 = this.f16625b;
                        String strS = mayaAccountCreationFragment2.s();
                        C c132 = mayaAccountCreationFragment2.f13677V;
                        kotlin.jvm.internal.j.d(c132);
                        MayaAccountCreationFragment.J1(mayaAccountCreationFragment2, strP2, strS, ((TextView) c132.f3559b).getText().toString(), numX49.tnTj78("bi9PS"));
                        d dVar = mayaAccountCreationFragment2.f13679X;
                        if (dVar != null) {
                            MayaPasswordTipsBottomSheetDialogFragment mayaPasswordTipsBottomSheetDialogFragment = new MayaPasswordTipsBottomSheetDialogFragment();
                            mayaPasswordTipsBottomSheetDialogFragment.show(((MayaRegistrationV2Activity) dVar).getSupportFragmentManager(), mayaPasswordTipsBottomSheetDialogFragment.getTag());
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        C c15 = this.f13677V;
        j.d(c15);
        Ke.b.b((TextView) c15.f3559b, new Function0(this) { // from class: eb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAccountCreationFragment f16625b;

            {
                this.f16625b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        MayaAccountCreationFragment mayaAccountCreationFragment = this.f16625b;
                        mayaAccountCreationFragment.f13680Y = !mayaAccountCreationFragment.f13680Y;
                        C1229s c1229sH1 = mayaAccountCreationFragment.H1();
                        FragmentActivity fragmentActivityRequireActivity = mayaAccountCreationFragment.requireActivity();
                        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, numX49.tnTj78("bi9Pj"));
                        String strP = AbstractC1213b.p(2);
                        kotlin.jvm.internal.j.f(strP, numX49.tnTj78("bi9Pd"));
                        c1229sH1.a(fragmentActivityRequireActivity, strP, mayaAccountCreationFragment.s(), null, mayaAccountCreationFragment.f13680Y, EnumC1212a.BUTTON, new g(1, mayaAccountCreationFragment.H1(), C1229s.class, numX49.tnTj78("bi9Pi"), numX49.tnTj78("bi9PE"), 0, 0), new g(1, mayaAccountCreationFragment.H1(), C1229s.class, numX49.tnTj78("bi9PF"), numX49.tnTj78("bi9PH"), 0, 1), M.e());
                        C c122 = mayaAccountCreationFragment.f13677V;
                        kotlin.jvm.internal.j.d(c122);
                        jk.b.z((MayaProfileInputLayout) c122.m, mayaAccountCreationFragment.f13680Y);
                        break;
                    case 1:
                        this.f16625b.L1();
                        break;
                    default:
                        String strP2 = AbstractC1213b.p(2);
                        kotlin.jvm.internal.j.f(strP2, numX49.tnTj78("bi9PV"));
                        MayaAccountCreationFragment mayaAccountCreationFragment2 = this.f16625b;
                        String strS = mayaAccountCreationFragment2.s();
                        C c132 = mayaAccountCreationFragment2.f13677V;
                        kotlin.jvm.internal.j.d(c132);
                        MayaAccountCreationFragment.J1(mayaAccountCreationFragment2, strP2, strS, ((TextView) c132.f3559b).getText().toString(), numX49.tnTj78("bi9PS"));
                        d dVar = mayaAccountCreationFragment2.f13679X;
                        if (dVar != null) {
                            MayaPasswordTipsBottomSheetDialogFragment mayaPasswordTipsBottomSheetDialogFragment = new MayaPasswordTipsBottomSheetDialogFragment();
                            mayaPasswordTipsBottomSheetDialogFragment.show(((MayaRegistrationV2Activity) dVar).getSupportFragmentManager(), mayaPasswordTipsBottomSheetDialogFragment.getTag());
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        C c16 = this.f13677V;
        j.d(c16);
        final MayaProfileInputLayout mayaProfileInputLayout2 = (MayaProfileInputLayout) c16.i;
        AbstractC0983W.A(mayaProfileInputLayout2, null, new Function1() { // from class: eb.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i11 = i10;
                ((Boolean) obj).booleanValue();
                switch (i11) {
                    case 0:
                        MayaProfileInputLayout mayaProfileInputLayout3 = mayaProfileInputLayout2;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout3);
                        AbstractC0983W.E(mayaProfileInputLayout3);
                        String string2 = mayaProfileInputLayout3.getLabel().toString();
                        boolean zBooleanValue = ((Boolean) mayaProfileInputLayout3.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string2, (String) mayaProfileInputLayout3.getLastValidationResult().f18161b, zBooleanValue);
                        break;
                    case 1:
                        MayaProfileInputLayout mayaProfileInputLayout4 = mayaProfileInputLayout2;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout4);
                        AbstractC0983W.E(mayaProfileInputLayout4);
                        String string3 = mayaProfileInputLayout4.getLabel().toString();
                        boolean zBooleanValue2 = ((Boolean) mayaProfileInputLayout4.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string3, (String) mayaProfileInputLayout4.getLastValidationResult().f18161b, zBooleanValue2);
                        break;
                    case 2:
                        MayaProfileInputLayout mayaProfileInputLayout5 = mayaProfileInputLayout2;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout5);
                        AbstractC0983W.E(mayaProfileInputLayout5);
                        String string4 = mayaProfileInputLayout5.getLabel().toString();
                        boolean zBooleanValue3 = ((Boolean) mayaProfileInputLayout5.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string4, (String) mayaProfileInputLayout5.getLastValidationResult().f18161b, zBooleanValue3);
                        break;
                    case 3:
                        MayaProfileInputLayout mayaProfileInputLayout6 = mayaProfileInputLayout2;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout6);
                        AbstractC0983W.E(mayaProfileInputLayout6);
                        String string5 = mayaProfileInputLayout6.getLabel().toString();
                        boolean zBooleanValue4 = ((Boolean) mayaProfileInputLayout6.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string5, (String) mayaProfileInputLayout6.getLastValidationResult().f18161b, zBooleanValue4);
                        break;
                    case 4:
                        MayaProfileInputLayout mayaProfileInputLayout7 = mayaProfileInputLayout2;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout7);
                        AbstractC0983W.E(mayaProfileInputLayout7);
                        String string6 = mayaProfileInputLayout7.getLabel().toString();
                        boolean zBooleanValue5 = ((Boolean) mayaProfileInputLayout7.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string6, (String) mayaProfileInputLayout7.getLastValidationResult().f18161b, zBooleanValue5);
                        break;
                    default:
                        MayaProfileInputLayout mayaProfileInputLayout8 = mayaProfileInputLayout2;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout8);
                        AbstractC0983W.E(mayaProfileInputLayout8);
                        String string7 = mayaProfileInputLayout8.getLabel().toString();
                        boolean zBooleanValue6 = ((Boolean) mayaProfileInputLayout8.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string7, (String) mayaProfileInputLayout8.getLastValidationResult().f18161b, zBooleanValue6);
                        break;
                }
                return Unit.f18162a;
            }
        }, 1);
        C c17 = this.f13677V;
        j.d(c17);
        final MayaProfileInputLayout mayaProfileInputLayout3 = (MayaProfileInputLayout) c17.f3562k;
        final int i11 = 3;
        AbstractC0983W.A(mayaProfileInputLayout3, null, new Function1() { // from class: eb.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i112 = i11;
                ((Boolean) obj).booleanValue();
                switch (i112) {
                    case 0:
                        MayaProfileInputLayout mayaProfileInputLayout32 = mayaProfileInputLayout3;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout32);
                        AbstractC0983W.E(mayaProfileInputLayout32);
                        String string2 = mayaProfileInputLayout32.getLabel().toString();
                        boolean zBooleanValue = ((Boolean) mayaProfileInputLayout32.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string2, (String) mayaProfileInputLayout32.getLastValidationResult().f18161b, zBooleanValue);
                        break;
                    case 1:
                        MayaProfileInputLayout mayaProfileInputLayout4 = mayaProfileInputLayout3;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout4);
                        AbstractC0983W.E(mayaProfileInputLayout4);
                        String string3 = mayaProfileInputLayout4.getLabel().toString();
                        boolean zBooleanValue2 = ((Boolean) mayaProfileInputLayout4.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string3, (String) mayaProfileInputLayout4.getLastValidationResult().f18161b, zBooleanValue2);
                        break;
                    case 2:
                        MayaProfileInputLayout mayaProfileInputLayout5 = mayaProfileInputLayout3;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout5);
                        AbstractC0983W.E(mayaProfileInputLayout5);
                        String string4 = mayaProfileInputLayout5.getLabel().toString();
                        boolean zBooleanValue3 = ((Boolean) mayaProfileInputLayout5.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string4, (String) mayaProfileInputLayout5.getLastValidationResult().f18161b, zBooleanValue3);
                        break;
                    case 3:
                        MayaProfileInputLayout mayaProfileInputLayout6 = mayaProfileInputLayout3;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout6);
                        AbstractC0983W.E(mayaProfileInputLayout6);
                        String string5 = mayaProfileInputLayout6.getLabel().toString();
                        boolean zBooleanValue4 = ((Boolean) mayaProfileInputLayout6.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string5, (String) mayaProfileInputLayout6.getLastValidationResult().f18161b, zBooleanValue4);
                        break;
                    case 4:
                        MayaProfileInputLayout mayaProfileInputLayout7 = mayaProfileInputLayout3;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout7);
                        AbstractC0983W.E(mayaProfileInputLayout7);
                        String string6 = mayaProfileInputLayout7.getLabel().toString();
                        boolean zBooleanValue5 = ((Boolean) mayaProfileInputLayout7.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string6, (String) mayaProfileInputLayout7.getLastValidationResult().f18161b, zBooleanValue5);
                        break;
                    default:
                        MayaProfileInputLayout mayaProfileInputLayout8 = mayaProfileInputLayout3;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout8);
                        AbstractC0983W.E(mayaProfileInputLayout8);
                        String string7 = mayaProfileInputLayout8.getLabel().toString();
                        boolean zBooleanValue6 = ((Boolean) mayaProfileInputLayout8.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string7, (String) mayaProfileInputLayout8.getLastValidationResult().f18161b, zBooleanValue6);
                        break;
                }
                return Unit.f18162a;
            }
        }, 1);
        C c18 = this.f13677V;
        j.d(c18);
        final MayaProfileInputLayout mayaProfileInputLayout4 = (MayaProfileInputLayout) c18.j;
        AbstractC0983W.A(mayaProfileInputLayout4, null, new Function1() { // from class: eb.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i112 = i4;
                ((Boolean) obj).booleanValue();
                switch (i112) {
                    case 0:
                        MayaProfileInputLayout mayaProfileInputLayout32 = mayaProfileInputLayout4;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout32);
                        AbstractC0983W.E(mayaProfileInputLayout32);
                        String string2 = mayaProfileInputLayout32.getLabel().toString();
                        boolean zBooleanValue = ((Boolean) mayaProfileInputLayout32.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string2, (String) mayaProfileInputLayout32.getLastValidationResult().f18161b, zBooleanValue);
                        break;
                    case 1:
                        MayaProfileInputLayout mayaProfileInputLayout42 = mayaProfileInputLayout4;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout42);
                        AbstractC0983W.E(mayaProfileInputLayout42);
                        String string3 = mayaProfileInputLayout42.getLabel().toString();
                        boolean zBooleanValue2 = ((Boolean) mayaProfileInputLayout42.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string3, (String) mayaProfileInputLayout42.getLastValidationResult().f18161b, zBooleanValue2);
                        break;
                    case 2:
                        MayaProfileInputLayout mayaProfileInputLayout5 = mayaProfileInputLayout4;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout5);
                        AbstractC0983W.E(mayaProfileInputLayout5);
                        String string4 = mayaProfileInputLayout5.getLabel().toString();
                        boolean zBooleanValue3 = ((Boolean) mayaProfileInputLayout5.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string4, (String) mayaProfileInputLayout5.getLastValidationResult().f18161b, zBooleanValue3);
                        break;
                    case 3:
                        MayaProfileInputLayout mayaProfileInputLayout6 = mayaProfileInputLayout4;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout6);
                        AbstractC0983W.E(mayaProfileInputLayout6);
                        String string5 = mayaProfileInputLayout6.getLabel().toString();
                        boolean zBooleanValue4 = ((Boolean) mayaProfileInputLayout6.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string5, (String) mayaProfileInputLayout6.getLastValidationResult().f18161b, zBooleanValue4);
                        break;
                    case 4:
                        MayaProfileInputLayout mayaProfileInputLayout7 = mayaProfileInputLayout4;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout7);
                        AbstractC0983W.E(mayaProfileInputLayout7);
                        String string6 = mayaProfileInputLayout7.getLabel().toString();
                        boolean zBooleanValue5 = ((Boolean) mayaProfileInputLayout7.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string6, (String) mayaProfileInputLayout7.getLastValidationResult().f18161b, zBooleanValue5);
                        break;
                    default:
                        MayaProfileInputLayout mayaProfileInputLayout8 = mayaProfileInputLayout4;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout8);
                        AbstractC0983W.E(mayaProfileInputLayout8);
                        String string7 = mayaProfileInputLayout8.getLabel().toString();
                        boolean zBooleanValue6 = ((Boolean) mayaProfileInputLayout8.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string7, (String) mayaProfileInputLayout8.getLastValidationResult().f18161b, zBooleanValue6);
                        break;
                }
                return Unit.f18162a;
            }
        }, 1);
        C c19 = this.f13677V;
        j.d(c19);
        final MayaProfileInputLayout mayaProfileInputLayout5 = (MayaProfileInputLayout) c19.h;
        final int i12 = 5;
        AbstractC0983W.A(mayaProfileInputLayout5, null, new Function1() { // from class: eb.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i112 = i12;
                ((Boolean) obj).booleanValue();
                switch (i112) {
                    case 0:
                        MayaProfileInputLayout mayaProfileInputLayout32 = mayaProfileInputLayout5;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout32);
                        AbstractC0983W.E(mayaProfileInputLayout32);
                        String string2 = mayaProfileInputLayout32.getLabel().toString();
                        boolean zBooleanValue = ((Boolean) mayaProfileInputLayout32.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string2, (String) mayaProfileInputLayout32.getLastValidationResult().f18161b, zBooleanValue);
                        break;
                    case 1:
                        MayaProfileInputLayout mayaProfileInputLayout42 = mayaProfileInputLayout5;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout42);
                        AbstractC0983W.E(mayaProfileInputLayout42);
                        String string3 = mayaProfileInputLayout42.getLabel().toString();
                        boolean zBooleanValue2 = ((Boolean) mayaProfileInputLayout42.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string3, (String) mayaProfileInputLayout42.getLastValidationResult().f18161b, zBooleanValue2);
                        break;
                    case 2:
                        MayaProfileInputLayout mayaProfileInputLayout52 = mayaProfileInputLayout5;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout52);
                        AbstractC0983W.E(mayaProfileInputLayout52);
                        String string4 = mayaProfileInputLayout52.getLabel().toString();
                        boolean zBooleanValue3 = ((Boolean) mayaProfileInputLayout52.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string4, (String) mayaProfileInputLayout52.getLastValidationResult().f18161b, zBooleanValue3);
                        break;
                    case 3:
                        MayaProfileInputLayout mayaProfileInputLayout6 = mayaProfileInputLayout5;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout6);
                        AbstractC0983W.E(mayaProfileInputLayout6);
                        String string5 = mayaProfileInputLayout6.getLabel().toString();
                        boolean zBooleanValue4 = ((Boolean) mayaProfileInputLayout6.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string5, (String) mayaProfileInputLayout6.getLastValidationResult().f18161b, zBooleanValue4);
                        break;
                    case 4:
                        MayaProfileInputLayout mayaProfileInputLayout7 = mayaProfileInputLayout5;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout7);
                        AbstractC0983W.E(mayaProfileInputLayout7);
                        String string6 = mayaProfileInputLayout7.getLabel().toString();
                        boolean zBooleanValue5 = ((Boolean) mayaProfileInputLayout7.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string6, (String) mayaProfileInputLayout7.getLastValidationResult().f18161b, zBooleanValue5);
                        break;
                    default:
                        MayaProfileInputLayout mayaProfileInputLayout8 = mayaProfileInputLayout5;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout8);
                        AbstractC0983W.E(mayaProfileInputLayout8);
                        String string7 = mayaProfileInputLayout8.getLabel().toString();
                        boolean zBooleanValue6 = ((Boolean) mayaProfileInputLayout8.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string7, (String) mayaProfileInputLayout8.getLastValidationResult().f18161b, zBooleanValue6);
                        break;
                }
                return Unit.f18162a;
            }
        }, 1);
        C c20 = this.f13677V;
        j.d(c20);
        final MayaProfileInputLayout mayaProfileInputLayout6 = (MayaProfileInputLayout) c20.f3563l;
        AbstractC0983W.A(mayaProfileInputLayout6, null, new Function1() { // from class: eb.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i112 = i6;
                ((Boolean) obj).booleanValue();
                switch (i112) {
                    case 0:
                        MayaProfileInputLayout mayaProfileInputLayout32 = mayaProfileInputLayout6;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout32);
                        AbstractC0983W.E(mayaProfileInputLayout32);
                        String string2 = mayaProfileInputLayout32.getLabel().toString();
                        boolean zBooleanValue = ((Boolean) mayaProfileInputLayout32.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string2, (String) mayaProfileInputLayout32.getLastValidationResult().f18161b, zBooleanValue);
                        break;
                    case 1:
                        MayaProfileInputLayout mayaProfileInputLayout42 = mayaProfileInputLayout6;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout42);
                        AbstractC0983W.E(mayaProfileInputLayout42);
                        String string3 = mayaProfileInputLayout42.getLabel().toString();
                        boolean zBooleanValue2 = ((Boolean) mayaProfileInputLayout42.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string3, (String) mayaProfileInputLayout42.getLastValidationResult().f18161b, zBooleanValue2);
                        break;
                    case 2:
                        MayaProfileInputLayout mayaProfileInputLayout52 = mayaProfileInputLayout6;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout52);
                        AbstractC0983W.E(mayaProfileInputLayout52);
                        String string4 = mayaProfileInputLayout52.getLabel().toString();
                        boolean zBooleanValue3 = ((Boolean) mayaProfileInputLayout52.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string4, (String) mayaProfileInputLayout52.getLastValidationResult().f18161b, zBooleanValue3);
                        break;
                    case 3:
                        MayaProfileInputLayout mayaProfileInputLayout62 = mayaProfileInputLayout6;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout62);
                        AbstractC0983W.E(mayaProfileInputLayout62);
                        String string5 = mayaProfileInputLayout62.getLabel().toString();
                        boolean zBooleanValue4 = ((Boolean) mayaProfileInputLayout62.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string5, (String) mayaProfileInputLayout62.getLastValidationResult().f18161b, zBooleanValue4);
                        break;
                    case 4:
                        MayaProfileInputLayout mayaProfileInputLayout7 = mayaProfileInputLayout6;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout7);
                        AbstractC0983W.E(mayaProfileInputLayout7);
                        String string6 = mayaProfileInputLayout7.getLabel().toString();
                        boolean zBooleanValue5 = ((Boolean) mayaProfileInputLayout7.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string6, (String) mayaProfileInputLayout7.getLastValidationResult().f18161b, zBooleanValue5);
                        break;
                    default:
                        MayaProfileInputLayout mayaProfileInputLayout8 = mayaProfileInputLayout6;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout8);
                        AbstractC0983W.E(mayaProfileInputLayout8);
                        String string7 = mayaProfileInputLayout8.getLabel().toString();
                        boolean zBooleanValue6 = ((Boolean) mayaProfileInputLayout8.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string7, (String) mayaProfileInputLayout8.getLastValidationResult().f18161b, zBooleanValue6);
                        break;
                }
                return Unit.f18162a;
            }
        }, 1);
        C c21 = this.f13677V;
        j.d(c21);
        final MayaProfileInputLayout mayaProfileInputLayout7 = (MayaProfileInputLayout) c21.m;
        AbstractC0983W.A(mayaProfileInputLayout7, null, new Function1() { // from class: eb.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i112 = i;
                ((Boolean) obj).booleanValue();
                switch (i112) {
                    case 0:
                        MayaProfileInputLayout mayaProfileInputLayout32 = mayaProfileInputLayout7;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout32);
                        AbstractC0983W.E(mayaProfileInputLayout32);
                        String string2 = mayaProfileInputLayout32.getLabel().toString();
                        boolean zBooleanValue = ((Boolean) mayaProfileInputLayout32.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string2, (String) mayaProfileInputLayout32.getLastValidationResult().f18161b, zBooleanValue);
                        break;
                    case 1:
                        MayaProfileInputLayout mayaProfileInputLayout42 = mayaProfileInputLayout7;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout42);
                        AbstractC0983W.E(mayaProfileInputLayout42);
                        String string3 = mayaProfileInputLayout42.getLabel().toString();
                        boolean zBooleanValue2 = ((Boolean) mayaProfileInputLayout42.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string3, (String) mayaProfileInputLayout42.getLastValidationResult().f18161b, zBooleanValue2);
                        break;
                    case 2:
                        MayaProfileInputLayout mayaProfileInputLayout52 = mayaProfileInputLayout7;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout52);
                        AbstractC0983W.E(mayaProfileInputLayout52);
                        String string4 = mayaProfileInputLayout52.getLabel().toString();
                        boolean zBooleanValue3 = ((Boolean) mayaProfileInputLayout52.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string4, (String) mayaProfileInputLayout52.getLastValidationResult().f18161b, zBooleanValue3);
                        break;
                    case 3:
                        MayaProfileInputLayout mayaProfileInputLayout62 = mayaProfileInputLayout7;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout62);
                        AbstractC0983W.E(mayaProfileInputLayout62);
                        String string5 = mayaProfileInputLayout62.getLabel().toString();
                        boolean zBooleanValue4 = ((Boolean) mayaProfileInputLayout62.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string5, (String) mayaProfileInputLayout62.getLastValidationResult().f18161b, zBooleanValue4);
                        break;
                    case 4:
                        MayaProfileInputLayout mayaProfileInputLayout72 = mayaProfileInputLayout7;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout72);
                        AbstractC0983W.E(mayaProfileInputLayout72);
                        String string6 = mayaProfileInputLayout72.getLabel().toString();
                        boolean zBooleanValue5 = ((Boolean) mayaProfileInputLayout72.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string6, (String) mayaProfileInputLayout72.getLastValidationResult().f18161b, zBooleanValue5);
                        break;
                    default:
                        MayaProfileInputLayout mayaProfileInputLayout8 = mayaProfileInputLayout7;
                        kotlin.jvm.internal.j.d(mayaProfileInputLayout8);
                        AbstractC0983W.E(mayaProfileInputLayout8);
                        String string7 = mayaProfileInputLayout8.getLabel().toString();
                        boolean zBooleanValue6 = ((Boolean) mayaProfileInputLayout8.getLastValidationResult().f18160a).booleanValue();
                        this.K1(string7, (String) mayaProfileInputLayout8.getLastValidationResult().f18161b, zBooleanValue6);
                        break;
                }
                return Unit.f18162a;
            }
        }, 1);
        C c22 = this.f13677V;
        j.d(c22);
        Va.f.e((MayaProfileInputLayout) c22.i, FieldType.FirstName.INSTANCE, new T(2, I1(), a.class, "validateField", "validateField(Lcom/paymaya/domain/model/FieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/ValidationResult;", 0, 26), null, null, null, 28);
        C c23 = this.f13677V;
        j.d(c23);
        Va.f.e((MayaProfileInputLayout) c23.f3562k, FieldType.MiddleName.INSTANCE, new T(2, I1(), a.class, "validateField", "validateField(Lcom/paymaya/domain/model/FieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/ValidationResult;", 0, 27), new c(this, i6), null, null, 24);
        C c24 = this.f13677V;
        j.d(c24);
        Va.f.e((MayaProfileInputLayout) c24.j, FieldType.LastName.INSTANCE, new T(2, I1(), a.class, "validateField", "validateField(Lcom/paymaya/domain/model/FieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/ValidationResult;", 0, 28), null, null, null, 28);
        C c25 = this.f13677V;
        j.d(c25);
        Va.f.e((MayaProfileInputLayout) c25.h, FieldType.EmailAddress.INSTANCE, new T(2, I1(), a.class, "validateField", "validateField(Lcom/paymaya/domain/model/FieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/ValidationResult;", 0, 29), null, null, null, 28);
        C c26 = this.f13677V;
        j.d(c26);
        Va.f.e((MayaProfileInputLayout) c26.f3563l, FieldType.MobileNumber.INSTANCE, new eb.f(2, I1(), a.class, "validateField", "validateField(Lcom/paymaya/domain/model/FieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/ValidationResult;", 0, 0), null, null, null, 28);
        C c27 = this.f13677V;
        j.d(c27);
        Va.f.e((MayaProfileInputLayout) c27.m, FieldType.Password.INSTANCE, new eb.f(2, I1(), a.class, "validateField", "validateField(Lcom/paymaya/domain/model/FieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/ValidationResult;", 0, 1), null, null, null, 28);
    }
}
