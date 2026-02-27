package com.paymaya.mayaui.userprofileupdate.view.fragment.impl;

import G5.A;
import Lh.d;
import Lh.h;
import M8.W2;
import N5.S0;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentActivity;
import cj.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ContactName;
import com.paymaya.domain.model.ContactReferenceRelationship;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.domain.model.UpdateProfileSelectionItem;
import com.paymaya.domain.model.UpdateProfileSelectionModel;
import com.paymaya.domain.model.UpdateProfileValidationResult;
import com.paymaya.domain.model.User;
import com.paymaya.domain.model.UserContactReference;
import com.paymaya.domain.store.C1286u;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUserProfileUpdateActivity;
import com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment;
import com.squareup.wire.internal.a;
import eb.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import oc.c;
import oi.C1983a;
import org.json.JSONException;
import org.json.JSONObject;
import rc.i;
import sc.AbstractC2250a;
import wc.InterfaceC2393d;
import y5.AbstractC2509a;
import yc.C2525f;
import yc.m;
import yc.o;
import yc.p;
import yc.r;
import yc.s;
import yj.e;
import yj.f;
import yj.q;
import zh.b;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaUserContactReferenceFragment extends MayaUpdateProfileBaseFragment<S0> implements InterfaceC2393d {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public i f14258Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public p f14259a0;

    public MayaUserContactReferenceFragment() {
        super(o.f21125a);
    }

    public static final void i2(MayaUserContactReferenceFragment mayaUserContactReferenceFragment) throws JSONException {
        Pair pair;
        int i = 6;
        int i4 = 2;
        int i6 = 1;
        int i10 = 0;
        mayaUserContactReferenceFragment.d2().requestFocus();
        c cVarZ1 = mayaUserContactReferenceFragment.Z1();
        UpdateProfileFieldType field = UpdateProfileFieldType.RELATION;
        Object selectedData = mayaUserContactReferenceFragment.d2().getSelectedData();
        i iVar = (i) cVarZ1;
        j.g(field, "field");
        UpdateProfileValidationResult requiredFieldError = (selectedData == null && iVar.q(field)) ? new UpdateProfileValidationResult.RequiredFieldError(field) : UpdateProfileValidationResult.Success.INSTANCE;
        f fVarH = q.h(q.n(q.n(q.h(q.h(ViewGroupKt.getChildren(((S0) mayaUserContactReferenceFragment.G1()).f3914b), r.f21127b), new m(i6)), new m(i4)), new a(mayaUserContactReferenceFragment, 27)), new m(i10));
        MayaProfileInputLayout mayaProfileInputLayout = null;
        if (q.p(fVarH)) {
            fVarH = null;
        }
        AbstractC2250a.d(mayaUserContactReferenceFragment.d2(), requiredFieldError);
        if (fVarH != null) {
            e eVar = new e(fVarH);
            while (eVar.hasNext()) {
                Pair firstErrorView = (Pair) eVar.next();
                j.g(firstErrorView, "firstErrorView");
                AbstractC2250a.c((MayaProfileInputLayout) firstErrorView.f18160a, (UpdateProfileValidationResult) firstErrorView.f18161b, new n0.e(2));
            }
        }
        if (fVarH != null && (pair = (Pair) q.j(fVarH)) != null) {
            mayaProfileInputLayout = (MayaProfileInputLayout) pair.f18160a;
        }
        if (mayaProfileInputLayout != null && requiredFieldError.equals(UpdateProfileValidationResult.Success.INSTANCE)) {
            mayaUserContactReferenceFragment.K1(mayaProfileInputLayout);
        }
        if (mayaProfileInputLayout == null && !requiredFieldError.equals(UpdateProfileValidationResult.Success.INSTANCE)) {
            mayaUserContactReferenceFragment.K1(mayaUserContactReferenceFragment.d2());
        }
        if (fVarH != null && !requiredFieldError.equals(UpdateProfileValidationResult.Success.INSTANCE)) {
            for (View view : ViewGroupKt.getChildren(((S0) mayaUserContactReferenceFragment.G1()).f3914b)) {
                if (view.getId() == mayaUserContactReferenceFragment.d2().getId() || (mayaProfileInputLayout != null && view.getId() == mayaProfileInputLayout.getId())) {
                    mayaUserContactReferenceFragment.K1(view);
                    break;
                }
            }
        }
        if (fVarH == null && requiredFieldError.equals(UpdateProfileValidationResult.Success.INSTANCE)) {
            c cVarZ12 = mayaUserContactReferenceFragment.Z1();
            String strValueOf = String.valueOf(mayaUserContactReferenceFragment.X1().getInputEditText().getText());
            String strValueOf2 = String.valueOf(mayaUserContactReferenceFragment.a2().getInputEditText().getText());
            String strValueOf3 = String.valueOf(mayaUserContactReferenceFragment.Y1().getInputEditText().getText());
            i iVar2 = (i) cVarZ12;
            User userA = iVar2.h.a();
            if (z.o(userA.mFirstName(), strValueOf, true) && z.o(userA.mLastName(), strValueOf3, true) && (!iVar2.f19905p || z.o(userA.mMiddleName(), strValueOf2, true))) {
                iVar2.f19909t = true;
                InterfaceC2393d interfaceC2393d = (InterfaceC2393d) iVar2.c.get();
                boolean z4 = iVar2.f19905p;
                MayaUserContactReferenceFragment mayaUserContactReferenceFragment2 = (MayaUserContactReferenceFragment) interfaceC2393d;
                mayaUserContactReferenceFragment2.K1(mayaUserContactReferenceFragment2.X1());
                MayaProfileInputLayout mayaProfileInputLayoutX1 = mayaUserContactReferenceFragment2.X1();
                String string = mayaUserContactReferenceFragment2.getString(R.string.maya_user_contact_reference_invalid_name);
                j.f(string, "getString(...)");
                mayaProfileInputLayoutX1.setHelperErrorText(string);
                mayaProfileInputLayoutX1.p();
                if (z4) {
                    MayaProfileInputLayout mayaProfileInputLayoutA2 = mayaUserContactReferenceFragment2.a2();
                    String string2 = mayaUserContactReferenceFragment2.getString(R.string.maya_user_contact_reference_invalid_name);
                    j.f(string2, "getString(...)");
                    mayaProfileInputLayoutA2.setHelperErrorText(string2);
                    mayaProfileInputLayoutA2.p();
                }
                MayaProfileInputLayout mayaProfileInputLayoutY1 = mayaUserContactReferenceFragment2.Y1();
                String string3 = mayaUserContactReferenceFragment2.getString(R.string.maya_user_contact_reference_invalid_name);
                j.f(string3, "getString(...)");
                mayaProfileInputLayoutY1.setHelperErrorText(string3);
                mayaProfileInputLayoutY1.p();
                return;
            }
            iVar2.f19909t = false;
            MayaUserContactReferenceFragment mayaUserContactReferenceFragment3 = (MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar2.c.get());
            mayaUserContactReferenceFragment3.getClass();
            ContactName contactName = new ContactName(String.valueOf(mayaUserContactReferenceFragment3.X1().getInputEditText().getText()), String.valueOf(mayaUserContactReferenceFragment3.a2().getInputEditText().getText()), String.valueOf(mayaUserContactReferenceFragment3.Y1().getInputEditText().getText()), Boolean.valueOf(mayaUserContactReferenceFragment3.b2().isChecked()));
            Object selectedData2 = mayaUserContactReferenceFragment3.d2().getSelectedData();
            j.e(selectedData2, "null cannot be cast to non-null type com.paymaya.domain.model.ContactReferenceRelationship");
            String code = ((ContactReferenceRelationship) selectedData2).getCode();
            if (code == null) {
                code = "";
            }
            UserContactReference userContactReference = new UserContactReference(contactName, code, "+63" + ((Object) mayaUserContactReferenceFragment3.c2().getInputEditText().getText()));
            i iVar3 = (i) mayaUserContactReferenceFragment3.Z1();
            if (iVar3.j.v().length() == 0) {
                iVar3.j.m0(UUID.randomUUID().toString());
            }
            JSONObject jSONObject = new JSONObject();
            ContactName name = userContactReference.getName();
            if (name != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("firstName", name.getFirstName());
                jSONObject2.put("lastName", name.getLastName());
                jSONObject2.put("middleName", name.getMiddleName());
                jSONObject2.put("hasNoMiddleName", name.getHasNoMiddleName());
                Unit unit = Unit.f18162a;
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, jSONObject2);
            }
            String mobileNumber = userContactReference.getMobileNumber();
            if (mobileNumber != null) {
                jSONObject.put("mobileNumber", mobileNumber);
            }
            String relationship = userContactReference.getRelationship();
            if (relationship != null) {
                jSONObject.put("relationship", relationship);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("contactReference", jSONObject);
            String string4 = jSONObject3.toString();
            j.f(string4, "toString(...)");
            ((MayaBaseFragment) ((InterfaceC2393d) iVar3.c.get())).E1();
            new d(new d(new h(iVar3.f19900g.x(string4), b.a(), i10), new p8.a(iVar3, i), i4), new C1983a(iVar3, i), i10).e();
        }
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final ScrollView N1() {
        ScrollView scrollableNestedScrollView = ((S0) G1()).f3917k;
        j.f(scrollableNestedScrollView, "scrollableNestedScrollView");
        return scrollableNestedScrollView;
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final String O1() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("SOURCE_SCREEN")) == null) ? "" : string;
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final void P1() {
        i iVar = (i) Z1();
        if (iVar.f19908s == null) {
            ((MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get())).f2("");
            MayaUserContactReferenceFragment mayaUserContactReferenceFragment = (MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get());
            mayaUserContactReferenceFragment.requireActivity().setResult(MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS);
            mayaUserContactReferenceFragment.requireActivity().finish();
            return;
        }
        InterfaceC2393d interfaceC2393d = (InterfaceC2393d) iVar.c.get();
        String str = iVar.f19908s;
        if (str == null) {
            str = "https://paymaya.com/app/";
        }
        ((MayaUserContactReferenceFragment) interfaceC2393d).f2(str);
        InterfaceC2393d interfaceC2393d2 = (InterfaceC2393d) iVar.c.get();
        String str2 = iVar.f19908s;
        String str3 = str2 != null ? str2 : "https://paymaya.com/app/";
        p pVar = ((MayaUserContactReferenceFragment) interfaceC2393d2).f14259a0;
        if (pVar != null) {
            MayaUserProfileUpdateActivity mayaUserProfileUpdateActivity = (MayaUserProfileUpdateActivity) pVar;
            mayaUserProfileUpdateActivity.n1();
            B5.i.k(mayaUserProfileUpdateActivity, str3);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.CONTACT_REF;
    }

    public final MayaProfileInputLayout X1() {
        MayaProfileInputLayout inputFirstName = ((S0) G1()).c;
        j.f(inputFirstName, "inputFirstName");
        return inputFirstName;
    }

    public final MayaProfileInputLayout Y1() {
        MayaProfileInputLayout inputLastName = ((S0) G1()).f3915d;
        j.f(inputLastName, "inputLastName");
        return inputLastName;
    }

    public final c Z1() {
        i iVar = this.f14258Z;
        if (iVar != null) {
            return iVar;
        }
        j.n("mMayaUserContactReferenceFragmentPresenter");
        throw null;
    }

    public final MayaProfileInputLayout a2() {
        MayaProfileInputLayout inputMiddleName = ((S0) G1()).e;
        j.f(inputMiddleName, "inputMiddleName");
        return inputMiddleName;
    }

    public final AppCompatCheckBox b2() {
        AppCompatCheckBox middleNameCheckbox = ((S0) G1()).i;
        j.f(middleNameCheckbox, "middleNameCheckbox");
        return middleNameCheckbox;
    }

    public final MayaProfileInputLayout c2() {
        MayaProfileInputLayout inputMobileNumber = ((S0) G1()).f;
        j.f(inputMobileNumber, "inputMobileNumber");
        return inputMobileNumber;
    }

    public final MayaDropDown d2() {
        MayaDropDown mayaDropdownRelation = ((S0) G1()).h;
        j.f(mayaDropdownRelation, "mayaDropdownRelation");
        return mayaDropdownRelation;
    }

    public final void e2(String str, List list) {
        Integer numValueOf = Integer.valueOf(R.string.maya_user_contact_reference_label_relation);
        List list2 = list;
        ArrayList arrayList = new ArrayList(t.l(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(UpdateProfileSelectionItem.Companion.toSelectionItem((ContactReferenceRelationship) it.next()));
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = new UpdateProfileSelectionModel(numValueOf, str, arrayList);
        UpdateProfileFieldType updateProfileFieldType = UpdateProfileFieldType.EMAIL_ADDRESS;
        p pVar = this.f14259a0;
        if (pVar != null) {
            ((MayaUserProfileUpdateActivity) pVar).X1(updateProfileSelectionModel);
        }
        if (!j.b(d2().getDisplayText().getText(), getString(R.string.maya_user_contact_reference_relation))) {
            CharSequence text = d2().getDisplayText().getText();
            j.f(text, "getText(...)");
            if (text.length() != 0) {
                return;
            }
        }
        CharSequence text2 = d2().getFloatingLabel().getText();
        MayaDropDown mayaDropDownD2 = d2();
        String string = getString(R.string.maya_update_profile_required_field, text2);
        j.f(string, "getString(...)");
        AbstractC2250a.h(mayaDropDownD2, string);
    }

    public final void f2(String str) {
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.p(EnumC1215d.PROFILE);
        c1219h.r(EnumC1216e.CONTACT_REF);
        c1219h.n(17);
        c1219h.t(EnumC1217f.BACK);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("referrer", O1());
        c1219h.i();
        map.put("destination", str);
        o1().c(getActivity(), c1219h);
    }

    public final void g2(String str) {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.p(EnumC1215d.PROFILE);
        c1219h.r(EnumC1216e.CONTACT_REF);
        c1219h.n(17);
        c1219h.t(EnumC1217f.NEXT);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("destination", str);
        map.put("referrer", O1());
        c1219h.i();
        c1220iO1.c(activity, c1219h);
    }

    public final void h2(MayaProfileInputLayout mayaProfileInputLayout, String str) {
        mayaProfileInputLayout.getInputEditText().requestFocus();
        mayaProfileInputLayout.getInputEditText().setText(str);
        b2().requestFocus();
    }

    public final void j2(MayaProfileInputLayout mayaProfileInputLayout, UpdateProfileFieldType updateProfileFieldType, Function2 function2) {
        mayaProfileInputLayout.setTag(updateProfileFieldType);
        mayaProfileInputLayout.getInputEditText().addTextChangedListener(new A(this, updateProfileFieldType, mayaProfileInputLayout, function2));
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment.IMayaUserContactReferenceFragmentListener");
        this.f14259a0 = (p) activity;
        O5.a aVar = W4.a.e().B().f4755a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        Y.e eVarW = aVar.W();
        Z0 z0X = aVar.X();
        C1293x0 c1293x0J = aVar.J();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        C1286u c1286uK = aVar.k();
        j.g(preference, "preference");
        this.f14258Z = new i(eVarW, z0X, c1293x0J, preference, c1286uK);
        this.f10338R = true;
        ((AbstractC2509a) Z1()).h(this);
        if (bundle == null) {
            ((i) Z1()).j();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        MayaUserProfileUpdateFragment.f14263h0 = null;
        ((i) Z1()).j.m0("");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((i) Z1()).o();
        p pVar = this.f14259a0;
        if (pVar != null) {
            ((MayaUserProfileUpdateActivity) pVar).Q(this);
        }
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.PROFILE);
        c1219hD.r(EnumC1216e.CONTACT_REF);
        c1219hD.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String str = ((i) Z1()).f19908s;
        HashMap map = c1219hD.j;
        map.put("origin", str);
        map.put("referrer", O1());
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 3;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        ((S0) G1()).j.setOnClickListener(new qf.d(this, 28));
        b2().setOnCheckedChangeListener(new W2(this, 7));
        List list = MayaUserProfileUpdateFragment.f14261f0;
        S1.r.g(d2(), UpdateProfileFieldType.RELATION, new g(1, Z1(), c.class, "onRelationshipClicked", "onRelationshipClicked(Ljava/lang/Object;)V", 0, 25), new eb.f(2, Z1(), c.class, "validateDropDownField", "validateDropDownField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/Object;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 26));
        j2(X1(), UpdateProfileFieldType.FIRST_NAME, new eb.f(2, Z1(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 27));
        j2(a2(), UpdateProfileFieldType.MIDDLE_NAME, new eb.f(2, Z1(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 28));
        j2(Y1(), UpdateProfileFieldType.LAST_NAME, new eb.f(2, Z1(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 29));
        j2(c2(), UpdateProfileFieldType.MOBILE_NUMBER, new s(2, Z1(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 0));
        c2().getInputEditText().setFilters(new InputFilter[]{new Gb.g(2)});
        c2().setOnPrimaryIconClickListener(new C2525f(this, i));
        Xh.i.E(this, kotlin.jvm.internal.z.a(MayaProfileUpdateSingleSelectionBottomSheetDialogFragment.class), new g(1, this, MayaUserContactReferenceFragment.class, "handleSingleSelectionResult", "handleSingleSelectionResult(Lcom/paymaya/domain/model/UpdateProfileSelectionItem;)V", 0, 24));
        getParentFragmentManager().setFragmentResultListener("key_contact_request", this, new y9.d(this, i));
        c2().getFloatingPrefix().setText("+63");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.PROFILE;
    }
}
