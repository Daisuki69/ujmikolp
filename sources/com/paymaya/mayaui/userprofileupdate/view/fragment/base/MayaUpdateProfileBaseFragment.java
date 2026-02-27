package com.paymaya.mayaui.userprofileupdate.view.fragment.base;

import M8.D2;
import Va.f;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBinding;
import cj.C1110A;
import cj.C1128n;
import com.paymaya.common.base.MayaBaseBindingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.ValidationResult;
import com.paymaya.domain.store.H0;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import io.flutter.plugins.firebase.core.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.sequences.Sequence;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import pi.C2151a;
import qc.C2169a;
import qj.n;
import sc.C2251b;
import tc.InterfaceC2282c;
import xc.InterfaceC2469a;
import xc.b;
import yj.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MayaUpdateProfileBaseFragment<T extends ViewBinding> extends MayaBaseBindingFragment<T> implements InterfaceC2469a {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public InterfaceC2282c f14238W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final String f14239X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final D2 f14240Y;

    public MayaUpdateProfileBaseFragment(n nVar) {
        super(nVar);
        this.f14239X = "";
        this.f14240Y = new D2(this, 14);
    }

    public static void U1(C1128n c1128n, C1128n c1128n2) {
        if (c1128n != null) {
            for (Pair pair : (Iterable) c1128n.f9395b) {
                f.a((MayaDropDown) pair.f18160a, (ValidationResult) pair.f18161b);
            }
        }
        if (c1128n2 != null) {
            for (Pair pair2 : (Iterable) c1128n2.f9395b) {
                f.b((MayaProfileInputLayout) pair2.f18160a, (ValidationResult) pair2.f18161b, null);
            }
        }
    }

    public final C1128n H1(Function2 function2) {
        ConstraintLayout constraintLayoutM1 = M1();
        Sequence<View> children = constraintLayoutM1 != null ? ViewGroupKt.getChildren(constraintLayoutM1) : null;
        if (children == null) {
            children = yj.n.c();
        }
        List listQ = q.q(q.o(q.h(q.h(children, b.f20933b), new H0(27)), new C2169a(function2, 1)));
        if (listQ.isEmpty()) {
            listQ = null;
        }
        if (listQ != null) {
            return C1110A.u(listQ);
        }
        return null;
    }

    public final C1128n I1(Function2 function2) {
        ConstraintLayout constraintLayoutM1 = M1();
        Sequence<View> children = constraintLayoutM1 != null ? ViewGroupKt.getChildren(constraintLayoutM1) : null;
        if (children == null) {
            children = yj.n.c();
        }
        List listQ = q.q(q.h(q.o(q.h(q.h(children, b.c), new H0(28)), new C2169a(function2, 2)), new H0(29)));
        if (listQ.isEmpty()) {
            listQ = null;
        }
        if (listQ != null) {
            return C1110A.u(listQ);
        }
        return null;
    }

    public final void J1(C1128n c1128n, C1128n c1128n2) {
        Pair pair;
        Pair pair2;
        MayaDropDown mayaDropDown = (c1128n == null || (pair2 = (Pair) q.j(c1128n)) == null) ? null : (MayaDropDown) pair2.f18160a;
        MayaProfileInputLayout mayaProfileInputLayout = (c1128n2 == null || (pair = (Pair) q.j(c1128n2)) == null) ? null : (MayaProfileInputLayout) pair.f18160a;
        if (mayaProfileInputLayout != null && mayaDropDown == null) {
            Q1(mayaProfileInputLayout);
            mayaProfileInputLayout.requestFocus();
        }
        if (mayaProfileInputLayout == null && mayaDropDown != null) {
            Q1(mayaDropDown);
            mayaDropDown.requestFocus();
        }
        if (c1128n2 == null || c1128n == null) {
            return;
        }
        ConstraintLayout constraintLayoutM1 = M1();
        Sequence<View> children = constraintLayoutM1 != null ? ViewGroupKt.getChildren(constraintLayoutM1) : null;
        if (children == null) {
            children = yj.n.c();
        }
        for (View view : children) {
            if ((mayaDropDown != null && view.getId() == mayaDropDown.getId()) || (mayaProfileInputLayout != null && view.getId() == mayaProfileInputLayout.getId())) {
                Q1(view);
                view.requestFocus();
                return;
            }
        }
    }

    public final void K1(View view) {
        j.g(view, "view");
        Q1(view);
        view.requestFocus();
        if (view instanceof MayaProfileInputLayout) {
            MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) view;
            S1(mayaProfileInputLayout.getLabelTextView().getText().toString(), mayaProfileInputLayout.getHelperErrorSpielTextView().getText().toString());
        } else if (view instanceof MayaDropDown) {
            MayaDropDown mayaDropDown = (MayaDropDown) view;
            S1(mayaDropDown.getLabel(), mayaDropDown.getErrorMessage());
        }
    }

    public Button L1() {
        return null;
    }

    public ConstraintLayout M1() {
        return null;
    }

    public abstract ScrollView N1();

    public String O1() {
        return this.f14239X;
    }

    public abstract void P1();

    public final void Q1(View view) {
        j.g(view, "<this>");
        ScrollView scrollViewN1 = N1();
        if (scrollViewN1 != null) {
            scrollViewN1.smoothScrollTo(0, view.getTop());
        }
    }

    public final void R1(View view) {
        j.g(view, "<this>");
        ScrollView scrollViewN1 = N1();
        if (scrollViewN1 != null) {
            scrollViewN1.post(new a(18, view, scrollViewN1));
        } else {
            Q1(view);
        }
    }

    public final void S1(String fieldName, String errorSpielText) {
        j.g(fieldName, "fieldName");
        j.g(errorSpielText, "errorSpielText");
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.p(u1());
        c1219h.r(U());
        c1219h.n(30);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("field", fieldName);
        map.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, errorSpielText);
        map.put("referrer", O1());
        c1219h.i();
        c1220iO1.c(activity, c1219h);
    }

    public final void T1(String str, String inputLabel, String invalidReason, boolean z4) {
        j.g(inputLabel, "inputLabel");
        j.g(invalidReason, "invalidReason");
        o1().b(C1219h.b(str, "Minimum Underwriting Requirements", inputLabel, z4, invalidReason, true));
    }

    public final ValidationResult V1(FieldType type, String rawInput, Function2 function2, C2151a formValidationController) {
        j.g(type, "type");
        j.g(rawInput, "rawInput");
        j.g(formValidationController, "formValidationController");
        C2251b c2251b = C2251b.f20034a;
        ValidationResult result = (ValidationResult) function2.invoke(type, C2251b.b(type, rawInput));
        j.g(result, "result");
        ((Map) formValidationController.c).put(type, Boolean.valueOf(result instanceof ValidationResult.Success));
        Button buttonL1 = L1();
        if (buttonL1 != null) {
            buttonL1.setEnabled(formValidationController.c());
        }
        return result;
    }

    public final ValidationResult W1(FieldType type, Object obj, Function2 function2, C2151a formValidationController) {
        j.g(type, "type");
        j.g(formValidationController, "formValidationController");
        ValidationResult result = (ValidationResult) function2.invoke(type, obj);
        j.g(result, "result");
        ((Map) formValidationController.c).put(type, Boolean.valueOf(result instanceof ValidationResult.Success));
        Button buttonL1 = L1();
        if (buttonL1 != null) {
            buttonL1.setEnabled(formValidationController.c());
        }
        return result;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.userprofileupdate.view.activity.UpdateProfileErrorListener");
        this.f14238W = (InterfaceC2282c) activity;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        x1(this.f14240Y);
    }
}
