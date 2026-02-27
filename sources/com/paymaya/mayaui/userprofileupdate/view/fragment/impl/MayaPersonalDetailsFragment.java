package com.paymaya.mayaui.userprofileupdate.view.fragment.impl;

import Ag.l;
import B5.i;
import Ke.b;
import M8.W2;
import N5.K0;
import O5.a;
import S5.c;
import Va.f;
import Y.e;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import cj.Q;
import cj.t;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.EducationalAttainment;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.Gender;
import com.paymaya.domain.model.MaritalStatus;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.paymaya.domain.model.ProfileData;
import com.paymaya.domain.model.UpdateProfileSelectionItem;
import com.paymaya.domain.model.UpdateProfileSelectionModel;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUpdateProfileActivity;
import com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaPersonalDetailsFragment;
import dOYHB6.tiZVw8.numX49;
import eb.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import o5.C1963b;
import oc.InterfaceC1974a;
import pi.C2151a;
import qc.d;
import rc.C2194a;
import sc.AbstractC2250a;
import wc.InterfaceC2390a;
import y5.AbstractC2509a;
import yc.C2523d;
import yc.InterfaceC2524e;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPersonalDetailsFragment extends MayaUpdateProfileBaseFragment<K0> implements InterfaceC2390a {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C2194a f14241Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public InterfaceC2524e f14242a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ProfileData f14243b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public FieldType f14244c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final C2151a f14245d0;

    public MayaPersonalDetailsFragment() {
        super(C2523d.f21110a);
        this.f14245d0 = new C2151a(Q.c(FieldType.EmailAddress.INSTANCE, FieldType.Gender.INSTANCE, FieldType.CivilStatus.INSTANCE, FieldType.EducationalAttainment.INSTANCE, FieldType.FirstName.INSTANCE, FieldType.LastName.INSTANCE));
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final Button L1() {
        return ((K0) G1()).f3719n;
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final ConstraintLayout M1() {
        return ((K0) G1()).c;
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final ScrollView N1() {
        return ((K0) G1()).f3721p;
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment
    public final void P1() {
        String str = ((d) X1()).j;
        if (str == null) {
            requireActivity().setResult(MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS);
            requireActivity().finish();
            return;
        }
        InterfaceC2524e interfaceC2524e = this.f14242a0;
        if (interfaceC2524e != null) {
            MayaUpdateProfileActivity mayaUpdateProfileActivity = (MayaUpdateProfileActivity) interfaceC2524e;
            mayaUpdateProfileActivity.n1();
            i.k(mayaUpdateProfileActivity, str);
        }
    }

    public final InterfaceC1974a X1() {
        C2194a c2194a = this.f14241Z;
        if (c2194a != null) {
            return c2194a;
        }
        j.n("mPresenter");
        throw null;
    }

    public final void Y1(String str, List civilStatuses) {
        j.g(civilStatuses, "civilStatuses");
        Integer numValueOf = Integer.valueOf(R.string.maya_update_profile_civil_status_dropdown_header);
        List list = civilStatuses;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(UpdateProfileSelectionItem.Companion.toSelectionItem((MaritalStatus) it.next()));
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = new UpdateProfileSelectionModel(numValueOf, str, arrayList);
        this.f14244c0 = FieldType.CivilStatus.INSTANCE;
        InterfaceC2524e interfaceC2524e = this.f14242a0;
        if (interfaceC2524e != null) {
            ((MayaUpdateProfileActivity) interfaceC2524e).V1(updateProfileSelectionModel);
        }
        if (!j.b(((K0) G1()).i.getDisplayText().getText(), getString(R.string.maya_update_profile_civil_status_dropdown_hint))) {
            CharSequence text = ((K0) G1()).i.getDisplayText().getText();
            j.f(text, "getText(...)");
            if (text.length() != 0) {
                return;
            }
        }
        CharSequence text2 = ((K0) G1()).i.getFloatingLabel().getText();
        MayaDropDown mayaDropDown = ((K0) G1()).i;
        String string = getString(R.string.maya_update_profile_required_field, text2);
        j.f(string, "getString(...)");
        AbstractC2250a.h(mayaDropDown, string);
    }

    public final void Z1(String str, List list) {
        j.g(list, "list");
        Integer numValueOf = Integer.valueOf(R.string.maya_update_profile_educational_attainment_hint);
        List list2 = list;
        ArrayList arrayList = new ArrayList(t.l(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(UpdateProfileSelectionItem.Companion.toSelectionItem((EducationalAttainment) it.next()));
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = new UpdateProfileSelectionModel(numValueOf, str, arrayList);
        this.f14244c0 = FieldType.EducationalAttainment.INSTANCE;
        InterfaceC2524e interfaceC2524e = this.f14242a0;
        if (interfaceC2524e != null) {
            ((MayaUpdateProfileActivity) interfaceC2524e).V1(updateProfileSelectionModel);
        }
        if (!j.b(((K0) G1()).j.getDisplayText().getText(), getString(R.string.maya_update_profile_educational_attainment_hint))) {
            CharSequence text = ((K0) G1()).j.getDisplayText().getText();
            j.f(text, "getText(...)");
            if (text.length() != 0) {
                return;
            }
        }
        CharSequence text2 = ((K0) G1()).j.getFloatingLabel().getText();
        MayaDropDown mayaDropDown = ((K0) G1()).j;
        String string = getString(R.string.maya_update_profile_required_field, text2);
        j.f(string, "getString(...)");
        AbstractC2250a.h(mayaDropDown, string);
    }

    public final void a2(String str, List genders) {
        j.g(genders, "genders");
        Integer numValueOf = Integer.valueOf(R.string.maya_update_profile_gender_dropdown_header);
        List list = genders;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(UpdateProfileSelectionItem.Companion.toSelectionItem((Gender) it.next()));
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = new UpdateProfileSelectionModel(numValueOf, str, arrayList);
        this.f14244c0 = FieldType.Gender.INSTANCE;
        InterfaceC2524e interfaceC2524e = this.f14242a0;
        if (interfaceC2524e != null) {
            ((MayaUpdateProfileActivity) interfaceC2524e).V1(updateProfileSelectionModel);
        }
        if (!j.b(((K0) G1()).f3717k.getDisplayText().getText(), getString(R.string.maya_update_profile_gender_dropdown_hint))) {
            CharSequence text = ((K0) G1()).f3717k.getDisplayText().getText();
            j.f(text, "getText(...)");
            if (text.length() != 0) {
                return;
            }
        }
        CharSequence text2 = ((K0) G1()).f3717k.getFloatingLabel().getText();
        MayaDropDown mayaDropDown = ((K0) G1()).f3717k;
        String string = getString(R.string.maya_update_profile_required_field, text2);
        j.f(string, "getString(...)");
        AbstractC2250a.h(mayaDropDown, string);
    }

    public final void b2(MaritalStatus maritalStatus) {
        MayaDropDown mayaDropDown = ((K0) G1()).i;
        mayaDropDown.getDisplayText().setText(maritalStatus.getName());
        mayaDropDown.setSelectedData(maritalStatus);
        mayaDropDown.getDisplayText().setHint("");
        mayaDropDown.b();
    }

    public final void c2(EducationalAttainment educationalAttainment) {
        MayaDropDown mayaDropDown = ((K0) G1()).j;
        mayaDropDown.getDisplayText().setText(educationalAttainment.getName());
        mayaDropDown.setSelectedData(educationalAttainment);
        mayaDropDown.getDisplayText().setHint("");
        mayaDropDown.b();
    }

    public final void d2(Gender gender) {
        MayaDropDown mayaDropDown = ((K0) G1()).f3717k;
        mayaDropDown.getDisplayText().setText(gender.getName());
        mayaDropDown.setSelectedData(gender);
        mayaDropDown.getDisplayText().setHint("");
        mayaDropDown.b();
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = W4.a.e().B().f4755a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        e eVarW = aVar.W();
        Z0 z0X = aVar.X();
        C1293x0 c1293x0J = aVar.J();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f14241Z = new C2194a(eVarW, z0X, c1293x0J, preference);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaPersonalDetailsFragment.MayaPersonalDetailsFragmentListener");
        this.f14242a0 = (InterfaceC2524e) activity;
        ((AbstractC2509a) X1()).h(this);
        ((C2194a) X1()).j();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((d) X1()).f19771d.m0("");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C2194a c2194a = (C2194a) X1();
        c2194a.o(new g(1, c2194a, C2194a.class, "prefillProfileData", "prefillProfileData(Lcom/paymaya/domain/model/MayaUpdateProfileData;)V", 0, 13));
        InterfaceC2524e interfaceC2524e = this.f14242a0;
        if (interfaceC2524e != null) {
            ((MayaUpdateProfileActivity) interfaceC2524e).Q(this);
        }
    }

    @Override // com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        K0 k02 = (K0) G1();
        k02.f3719n.setEnabled(this.f14245d0.c());
        MayaProfileInputLayout mayaProfileInputLayout = ((K0) G1()).e;
        FieldType.EmailAddress emailAddress = FieldType.EmailAddress.INSTANCE;
        final int i = 5;
        Function2 function2 = new Function2(this) { // from class: yc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21107b;

            {
                this.f21107b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FieldType fieldType = (FieldType) obj;
                switch (i) {
                    case 0:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PY"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment = this.f21107b;
                        return mayaPersonalDetailsFragment.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PT"), numX49.tnTj78("bt9PR"), 0, 11), mayaPersonalDetailsFragment.f14245d0);
                    case 1:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pv"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment2 = this.f21107b;
                        return mayaPersonalDetailsFragment2.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment2.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P7"), numX49.tnTj78("bt9PA"), 0, 12), mayaPersonalDetailsFragment2.f14245d0);
                    case 2:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PG"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment3 = this.f21107b;
                        return mayaPersonalDetailsFragment3.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment3.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P3"), numX49.tnTj78("bt9Py"), 0, 13), mayaPersonalDetailsFragment3.f14245d0);
                    case 3:
                        String str = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PN"));
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9P6"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment4 = this.f21107b;
                        return mayaPersonalDetailsFragment4.V1(fieldType, str, new eb.f(2, mayaPersonalDetailsFragment4.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pa"), numX49.tnTj78("bt9PX"), 0, 14), mayaPersonalDetailsFragment4.f14245d0);
                    case 4:
                        String str2 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pm"));
                        kotlin.jvm.internal.j.g(str2, numX49.tnTj78("bt9PD"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment5 = this.f21107b;
                        return mayaPersonalDetailsFragment5.V1(fieldType, str2, new eb.f(2, mayaPersonalDetailsFragment5.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Ph"), numX49.tnTj78("bt9PM"), 0, 8), mayaPersonalDetailsFragment5.f14245d0);
                    case 5:
                        String str3 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Po"));
                        kotlin.jvm.internal.j.g(str3, numX49.tnTj78("bt9PK"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment6 = this.f21107b;
                        return mayaPersonalDetailsFragment6.V1(fieldType, str3, new eb.f(2, mayaPersonalDetailsFragment6.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pw"), numX49.tnTj78("bt9Pc"), 0, 7), mayaPersonalDetailsFragment6.f14245d0);
                    case 6:
                        String str4 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pe"));
                        kotlin.jvm.internal.j.g(str4, numX49.tnTj78("bt9P8"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment7 = this.f21107b;
                        return mayaPersonalDetailsFragment7.V1(fieldType, str4, new eb.f(2, mayaPersonalDetailsFragment7.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PC"), numX49.tnTj78("bt9P4"), 0, 9), mayaPersonalDetailsFragment7.f14245d0);
                    default:
                        String str5 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PO"));
                        kotlin.jvm.internal.j.g(str5, numX49.tnTj78("bt9PQ"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment8 = this.f21107b;
                        return mayaPersonalDetailsFragment8.V1(fieldType, str5, new eb.f(2, mayaPersonalDetailsFragment8.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pt"), numX49.tnTj78("bt9PU"), 0, 10), mayaPersonalDetailsFragment8.f14245d0);
                }
            }
        };
        final int i4 = 0;
        f.e(mayaProfileInputLayout, emailAddress, function2, null, null, new Function0(this) { // from class: yc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21105b;

            {
                this.f21105b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x01f6  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 668
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yc.C2520a.invoke():java.lang.Object");
            }
        }, 12);
        final int i6 = 0;
        f.f(((K0) G1()).f3717k, FieldType.Gender.INSTANCE, new g(1, X1(), InterfaceC1974a.class, "onGenderClicked", "onGenderClicked(Ljava/lang/Object;)V", 0, 16), new Function2(this) { // from class: yc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21107b;

            {
                this.f21107b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FieldType fieldType = (FieldType) obj;
                switch (i6) {
                    case 0:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PY"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment = this.f21107b;
                        return mayaPersonalDetailsFragment.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PT"), numX49.tnTj78("bt9PR"), 0, 11), mayaPersonalDetailsFragment.f14245d0);
                    case 1:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pv"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment2 = this.f21107b;
                        return mayaPersonalDetailsFragment2.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment2.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P7"), numX49.tnTj78("bt9PA"), 0, 12), mayaPersonalDetailsFragment2.f14245d0);
                    case 2:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PG"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment3 = this.f21107b;
                        return mayaPersonalDetailsFragment3.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment3.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P3"), numX49.tnTj78("bt9Py"), 0, 13), mayaPersonalDetailsFragment3.f14245d0);
                    case 3:
                        String str = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PN"));
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9P6"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment4 = this.f21107b;
                        return mayaPersonalDetailsFragment4.V1(fieldType, str, new eb.f(2, mayaPersonalDetailsFragment4.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pa"), numX49.tnTj78("bt9PX"), 0, 14), mayaPersonalDetailsFragment4.f14245d0);
                    case 4:
                        String str2 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pm"));
                        kotlin.jvm.internal.j.g(str2, numX49.tnTj78("bt9PD"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment5 = this.f21107b;
                        return mayaPersonalDetailsFragment5.V1(fieldType, str2, new eb.f(2, mayaPersonalDetailsFragment5.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Ph"), numX49.tnTj78("bt9PM"), 0, 8), mayaPersonalDetailsFragment5.f14245d0);
                    case 5:
                        String str3 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Po"));
                        kotlin.jvm.internal.j.g(str3, numX49.tnTj78("bt9PK"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment6 = this.f21107b;
                        return mayaPersonalDetailsFragment6.V1(fieldType, str3, new eb.f(2, mayaPersonalDetailsFragment6.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pw"), numX49.tnTj78("bt9Pc"), 0, 7), mayaPersonalDetailsFragment6.f14245d0);
                    case 6:
                        String str4 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pe"));
                        kotlin.jvm.internal.j.g(str4, numX49.tnTj78("bt9P8"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment7 = this.f21107b;
                        return mayaPersonalDetailsFragment7.V1(fieldType, str4, new eb.f(2, mayaPersonalDetailsFragment7.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PC"), numX49.tnTj78("bt9P4"), 0, 9), mayaPersonalDetailsFragment7.f14245d0);
                    default:
                        String str5 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PO"));
                        kotlin.jvm.internal.j.g(str5, numX49.tnTj78("bt9PQ"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment8 = this.f21107b;
                        return mayaPersonalDetailsFragment8.V1(fieldType, str5, new eb.f(2, mayaPersonalDetailsFragment8.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pt"), numX49.tnTj78("bt9PU"), 0, 10), mayaPersonalDetailsFragment8.f14245d0);
                }
            }
        }, null);
        final int i10 = 1;
        f.f(((K0) G1()).i, FieldType.CivilStatus.INSTANCE, new g(1, X1(), InterfaceC1974a.class, "onCivilStatusClicked", "onCivilStatusClicked(Ljava/lang/Object;)V", 0, 17), new Function2(this) { // from class: yc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21107b;

            {
                this.f21107b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FieldType fieldType = (FieldType) obj;
                switch (i10) {
                    case 0:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PY"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment = this.f21107b;
                        return mayaPersonalDetailsFragment.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PT"), numX49.tnTj78("bt9PR"), 0, 11), mayaPersonalDetailsFragment.f14245d0);
                    case 1:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pv"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment2 = this.f21107b;
                        return mayaPersonalDetailsFragment2.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment2.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P7"), numX49.tnTj78("bt9PA"), 0, 12), mayaPersonalDetailsFragment2.f14245d0);
                    case 2:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PG"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment3 = this.f21107b;
                        return mayaPersonalDetailsFragment3.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment3.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P3"), numX49.tnTj78("bt9Py"), 0, 13), mayaPersonalDetailsFragment3.f14245d0);
                    case 3:
                        String str = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PN"));
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9P6"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment4 = this.f21107b;
                        return mayaPersonalDetailsFragment4.V1(fieldType, str, new eb.f(2, mayaPersonalDetailsFragment4.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pa"), numX49.tnTj78("bt9PX"), 0, 14), mayaPersonalDetailsFragment4.f14245d0);
                    case 4:
                        String str2 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pm"));
                        kotlin.jvm.internal.j.g(str2, numX49.tnTj78("bt9PD"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment5 = this.f21107b;
                        return mayaPersonalDetailsFragment5.V1(fieldType, str2, new eb.f(2, mayaPersonalDetailsFragment5.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Ph"), numX49.tnTj78("bt9PM"), 0, 8), mayaPersonalDetailsFragment5.f14245d0);
                    case 5:
                        String str3 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Po"));
                        kotlin.jvm.internal.j.g(str3, numX49.tnTj78("bt9PK"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment6 = this.f21107b;
                        return mayaPersonalDetailsFragment6.V1(fieldType, str3, new eb.f(2, mayaPersonalDetailsFragment6.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pw"), numX49.tnTj78("bt9Pc"), 0, 7), mayaPersonalDetailsFragment6.f14245d0);
                    case 6:
                        String str4 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pe"));
                        kotlin.jvm.internal.j.g(str4, numX49.tnTj78("bt9P8"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment7 = this.f21107b;
                        return mayaPersonalDetailsFragment7.V1(fieldType, str4, new eb.f(2, mayaPersonalDetailsFragment7.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PC"), numX49.tnTj78("bt9P4"), 0, 9), mayaPersonalDetailsFragment7.f14245d0);
                    default:
                        String str5 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PO"));
                        kotlin.jvm.internal.j.g(str5, numX49.tnTj78("bt9PQ"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment8 = this.f21107b;
                        return mayaPersonalDetailsFragment8.V1(fieldType, str5, new eb.f(2, mayaPersonalDetailsFragment8.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pt"), numX49.tnTj78("bt9PU"), 0, 10), mayaPersonalDetailsFragment8.f14245d0);
                }
            }
        }, null);
        final int i11 = 2;
        f.f(((K0) G1()).j, FieldType.EducationalAttainment.INSTANCE, new g(1, X1(), InterfaceC1974a.class, "onEducationAttainmentClicked", "onEducationAttainmentClicked(Ljava/lang/Object;)V", 0, 18), new Function2(this) { // from class: yc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21107b;

            {
                this.f21107b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FieldType fieldType = (FieldType) obj;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PY"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment = this.f21107b;
                        return mayaPersonalDetailsFragment.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PT"), numX49.tnTj78("bt9PR"), 0, 11), mayaPersonalDetailsFragment.f14245d0);
                    case 1:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pv"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment2 = this.f21107b;
                        return mayaPersonalDetailsFragment2.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment2.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P7"), numX49.tnTj78("bt9PA"), 0, 12), mayaPersonalDetailsFragment2.f14245d0);
                    case 2:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PG"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment3 = this.f21107b;
                        return mayaPersonalDetailsFragment3.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment3.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P3"), numX49.tnTj78("bt9Py"), 0, 13), mayaPersonalDetailsFragment3.f14245d0);
                    case 3:
                        String str = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PN"));
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9P6"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment4 = this.f21107b;
                        return mayaPersonalDetailsFragment4.V1(fieldType, str, new eb.f(2, mayaPersonalDetailsFragment4.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pa"), numX49.tnTj78("bt9PX"), 0, 14), mayaPersonalDetailsFragment4.f14245d0);
                    case 4:
                        String str2 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pm"));
                        kotlin.jvm.internal.j.g(str2, numX49.tnTj78("bt9PD"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment5 = this.f21107b;
                        return mayaPersonalDetailsFragment5.V1(fieldType, str2, new eb.f(2, mayaPersonalDetailsFragment5.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Ph"), numX49.tnTj78("bt9PM"), 0, 8), mayaPersonalDetailsFragment5.f14245d0);
                    case 5:
                        String str3 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Po"));
                        kotlin.jvm.internal.j.g(str3, numX49.tnTj78("bt9PK"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment6 = this.f21107b;
                        return mayaPersonalDetailsFragment6.V1(fieldType, str3, new eb.f(2, mayaPersonalDetailsFragment6.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pw"), numX49.tnTj78("bt9Pc"), 0, 7), mayaPersonalDetailsFragment6.f14245d0);
                    case 6:
                        String str4 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pe"));
                        kotlin.jvm.internal.j.g(str4, numX49.tnTj78("bt9P8"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment7 = this.f21107b;
                        return mayaPersonalDetailsFragment7.V1(fieldType, str4, new eb.f(2, mayaPersonalDetailsFragment7.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PC"), numX49.tnTj78("bt9P4"), 0, 9), mayaPersonalDetailsFragment7.f14245d0);
                    default:
                        String str5 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PO"));
                        kotlin.jvm.internal.j.g(str5, numX49.tnTj78("bt9PQ"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment8 = this.f21107b;
                        return mayaPersonalDetailsFragment8.V1(fieldType, str5, new eb.f(2, mayaPersonalDetailsFragment8.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pt"), numX49.tnTj78("bt9PU"), 0, 10), mayaPersonalDetailsFragment8.f14245d0);
                }
            }
        }, null);
        MayaProfileInputLayout mayaProfileInputLayout2 = ((K0) G1()).f;
        FieldType.FirstName firstName = FieldType.FirstName.INSTANCE;
        final int i12 = 3;
        Function2 function22 = new Function2(this) { // from class: yc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21107b;

            {
                this.f21107b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FieldType fieldType = (FieldType) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PY"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment = this.f21107b;
                        return mayaPersonalDetailsFragment.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PT"), numX49.tnTj78("bt9PR"), 0, 11), mayaPersonalDetailsFragment.f14245d0);
                    case 1:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pv"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment2 = this.f21107b;
                        return mayaPersonalDetailsFragment2.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment2.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P7"), numX49.tnTj78("bt9PA"), 0, 12), mayaPersonalDetailsFragment2.f14245d0);
                    case 2:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PG"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment3 = this.f21107b;
                        return mayaPersonalDetailsFragment3.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment3.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P3"), numX49.tnTj78("bt9Py"), 0, 13), mayaPersonalDetailsFragment3.f14245d0);
                    case 3:
                        String str = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PN"));
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9P6"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment4 = this.f21107b;
                        return mayaPersonalDetailsFragment4.V1(fieldType, str, new eb.f(2, mayaPersonalDetailsFragment4.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pa"), numX49.tnTj78("bt9PX"), 0, 14), mayaPersonalDetailsFragment4.f14245d0);
                    case 4:
                        String str2 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pm"));
                        kotlin.jvm.internal.j.g(str2, numX49.tnTj78("bt9PD"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment5 = this.f21107b;
                        return mayaPersonalDetailsFragment5.V1(fieldType, str2, new eb.f(2, mayaPersonalDetailsFragment5.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Ph"), numX49.tnTj78("bt9PM"), 0, 8), mayaPersonalDetailsFragment5.f14245d0);
                    case 5:
                        String str3 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Po"));
                        kotlin.jvm.internal.j.g(str3, numX49.tnTj78("bt9PK"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment6 = this.f21107b;
                        return mayaPersonalDetailsFragment6.V1(fieldType, str3, new eb.f(2, mayaPersonalDetailsFragment6.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pw"), numX49.tnTj78("bt9Pc"), 0, 7), mayaPersonalDetailsFragment6.f14245d0);
                    case 6:
                        String str4 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pe"));
                        kotlin.jvm.internal.j.g(str4, numX49.tnTj78("bt9P8"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment7 = this.f21107b;
                        return mayaPersonalDetailsFragment7.V1(fieldType, str4, new eb.f(2, mayaPersonalDetailsFragment7.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PC"), numX49.tnTj78("bt9P4"), 0, 9), mayaPersonalDetailsFragment7.f14245d0);
                    default:
                        String str5 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PO"));
                        kotlin.jvm.internal.j.g(str5, numX49.tnTj78("bt9PQ"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment8 = this.f21107b;
                        return mayaPersonalDetailsFragment8.V1(fieldType, str5, new eb.f(2, mayaPersonalDetailsFragment8.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pt"), numX49.tnTj78("bt9PU"), 0, 10), mayaPersonalDetailsFragment8.f14245d0);
                }
            }
        };
        final int i13 = 0;
        Function1 function1 = new Function1(this) { // from class: yc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21109b;

            {
                this.f21109b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str = (String) obj;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9R"));
                        ((C2194a) this.f21109b.X1()).q();
                        break;
                    case 1:
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9T"));
                        int length = str.length();
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment = this.f21109b;
                        if (length < 2) {
                            ((K0) mayaPersonalDetailsFragment.G1()).m.setVisibility(0);
                        } else {
                            ((K0) mayaPersonalDetailsFragment.G1()).m.setChecked(false);
                            ((K0) mayaPersonalDetailsFragment.G1()).m.setVisibility(8);
                        }
                        ((C2194a) mayaPersonalDetailsFragment.X1()).q();
                        break;
                    default:
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9Y"));
                        ((C2194a) this.f21109b.X1()).q();
                        break;
                }
                return Unit.f18162a;
            }
        };
        final int i14 = 1;
        f.e(mayaProfileInputLayout2, firstName, function22, function1, null, new Function0(this) { // from class: yc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21105b;

            {
                this.f21105b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x01f6  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 668
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yc.C2520a.invoke():java.lang.Object");
            }
        }, 8);
        MayaProfileInputLayout mayaProfileInputLayout3 = ((K0) G1()).h;
        FieldType.MiddleName middleName = FieldType.MiddleName.INSTANCE;
        final int i15 = 4;
        Function2 function23 = new Function2(this) { // from class: yc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21107b;

            {
                this.f21107b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FieldType fieldType = (FieldType) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PY"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment = this.f21107b;
                        return mayaPersonalDetailsFragment.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PT"), numX49.tnTj78("bt9PR"), 0, 11), mayaPersonalDetailsFragment.f14245d0);
                    case 1:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pv"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment2 = this.f21107b;
                        return mayaPersonalDetailsFragment2.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment2.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P7"), numX49.tnTj78("bt9PA"), 0, 12), mayaPersonalDetailsFragment2.f14245d0);
                    case 2:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PG"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment3 = this.f21107b;
                        return mayaPersonalDetailsFragment3.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment3.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P3"), numX49.tnTj78("bt9Py"), 0, 13), mayaPersonalDetailsFragment3.f14245d0);
                    case 3:
                        String str = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PN"));
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9P6"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment4 = this.f21107b;
                        return mayaPersonalDetailsFragment4.V1(fieldType, str, new eb.f(2, mayaPersonalDetailsFragment4.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pa"), numX49.tnTj78("bt9PX"), 0, 14), mayaPersonalDetailsFragment4.f14245d0);
                    case 4:
                        String str2 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pm"));
                        kotlin.jvm.internal.j.g(str2, numX49.tnTj78("bt9PD"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment5 = this.f21107b;
                        return mayaPersonalDetailsFragment5.V1(fieldType, str2, new eb.f(2, mayaPersonalDetailsFragment5.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Ph"), numX49.tnTj78("bt9PM"), 0, 8), mayaPersonalDetailsFragment5.f14245d0);
                    case 5:
                        String str3 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Po"));
                        kotlin.jvm.internal.j.g(str3, numX49.tnTj78("bt9PK"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment6 = this.f21107b;
                        return mayaPersonalDetailsFragment6.V1(fieldType, str3, new eb.f(2, mayaPersonalDetailsFragment6.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pw"), numX49.tnTj78("bt9Pc"), 0, 7), mayaPersonalDetailsFragment6.f14245d0);
                    case 6:
                        String str4 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pe"));
                        kotlin.jvm.internal.j.g(str4, numX49.tnTj78("bt9P8"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment7 = this.f21107b;
                        return mayaPersonalDetailsFragment7.V1(fieldType, str4, new eb.f(2, mayaPersonalDetailsFragment7.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PC"), numX49.tnTj78("bt9P4"), 0, 9), mayaPersonalDetailsFragment7.f14245d0);
                    default:
                        String str5 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PO"));
                        kotlin.jvm.internal.j.g(str5, numX49.tnTj78("bt9PQ"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment8 = this.f21107b;
                        return mayaPersonalDetailsFragment8.V1(fieldType, str5, new eb.f(2, mayaPersonalDetailsFragment8.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pt"), numX49.tnTj78("bt9PU"), 0, 10), mayaPersonalDetailsFragment8.f14245d0);
                }
            }
        };
        final int i16 = 1;
        Function1 function12 = new Function1(this) { // from class: yc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21109b;

            {
                this.f21109b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str = (String) obj;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9R"));
                        ((C2194a) this.f21109b.X1()).q();
                        break;
                    case 1:
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9T"));
                        int length = str.length();
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment = this.f21109b;
                        if (length < 2) {
                            ((K0) mayaPersonalDetailsFragment.G1()).m.setVisibility(0);
                        } else {
                            ((K0) mayaPersonalDetailsFragment.G1()).m.setChecked(false);
                            ((K0) mayaPersonalDetailsFragment.G1()).m.setVisibility(8);
                        }
                        ((C2194a) mayaPersonalDetailsFragment.X1()).q();
                        break;
                    default:
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9Y"));
                        ((C2194a) this.f21109b.X1()).q();
                        break;
                }
                return Unit.f18162a;
            }
        };
        final int i17 = 3;
        f.e(mayaProfileInputLayout3, middleName, function23, function12, null, new Function0(this) { // from class: yc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21105b;

            {
                this.f21105b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x01f6  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 668
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yc.C2520a.invoke():java.lang.Object");
            }
        }, 8);
        MayaProfileInputLayout mayaProfileInputLayout4 = ((K0) G1()).f3716g;
        FieldType.LastName lastName = FieldType.LastName.INSTANCE;
        final int i18 = 6;
        Function2 function24 = new Function2(this) { // from class: yc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21107b;

            {
                this.f21107b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FieldType fieldType = (FieldType) obj;
                switch (i18) {
                    case 0:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PY"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment = this.f21107b;
                        return mayaPersonalDetailsFragment.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PT"), numX49.tnTj78("bt9PR"), 0, 11), mayaPersonalDetailsFragment.f14245d0);
                    case 1:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pv"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment2 = this.f21107b;
                        return mayaPersonalDetailsFragment2.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment2.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P7"), numX49.tnTj78("bt9PA"), 0, 12), mayaPersonalDetailsFragment2.f14245d0);
                    case 2:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PG"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment3 = this.f21107b;
                        return mayaPersonalDetailsFragment3.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment3.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P3"), numX49.tnTj78("bt9Py"), 0, 13), mayaPersonalDetailsFragment3.f14245d0);
                    case 3:
                        String str = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PN"));
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9P6"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment4 = this.f21107b;
                        return mayaPersonalDetailsFragment4.V1(fieldType, str, new eb.f(2, mayaPersonalDetailsFragment4.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pa"), numX49.tnTj78("bt9PX"), 0, 14), mayaPersonalDetailsFragment4.f14245d0);
                    case 4:
                        String str2 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pm"));
                        kotlin.jvm.internal.j.g(str2, numX49.tnTj78("bt9PD"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment5 = this.f21107b;
                        return mayaPersonalDetailsFragment5.V1(fieldType, str2, new eb.f(2, mayaPersonalDetailsFragment5.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Ph"), numX49.tnTj78("bt9PM"), 0, 8), mayaPersonalDetailsFragment5.f14245d0);
                    case 5:
                        String str3 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Po"));
                        kotlin.jvm.internal.j.g(str3, numX49.tnTj78("bt9PK"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment6 = this.f21107b;
                        return mayaPersonalDetailsFragment6.V1(fieldType, str3, new eb.f(2, mayaPersonalDetailsFragment6.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pw"), numX49.tnTj78("bt9Pc"), 0, 7), mayaPersonalDetailsFragment6.f14245d0);
                    case 6:
                        String str4 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pe"));
                        kotlin.jvm.internal.j.g(str4, numX49.tnTj78("bt9P8"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment7 = this.f21107b;
                        return mayaPersonalDetailsFragment7.V1(fieldType, str4, new eb.f(2, mayaPersonalDetailsFragment7.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PC"), numX49.tnTj78("bt9P4"), 0, 9), mayaPersonalDetailsFragment7.f14245d0);
                    default:
                        String str5 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PO"));
                        kotlin.jvm.internal.j.g(str5, numX49.tnTj78("bt9PQ"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment8 = this.f21107b;
                        return mayaPersonalDetailsFragment8.V1(fieldType, str5, new eb.f(2, mayaPersonalDetailsFragment8.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pt"), numX49.tnTj78("bt9PU"), 0, 10), mayaPersonalDetailsFragment8.f14245d0);
                }
            }
        };
        final int i19 = 2;
        Function1 function13 = new Function1(this) { // from class: yc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21109b;

            {
                this.f21109b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str = (String) obj;
                switch (i19) {
                    case 0:
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9R"));
                        ((C2194a) this.f21109b.X1()).q();
                        break;
                    case 1:
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9T"));
                        int length = str.length();
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment = this.f21109b;
                        if (length < 2) {
                            ((K0) mayaPersonalDetailsFragment.G1()).m.setVisibility(0);
                        } else {
                            ((K0) mayaPersonalDetailsFragment.G1()).m.setChecked(false);
                            ((K0) mayaPersonalDetailsFragment.G1()).m.setVisibility(8);
                        }
                        ((C2194a) mayaPersonalDetailsFragment.X1()).q();
                        break;
                    default:
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9Y"));
                        ((C2194a) this.f21109b.X1()).q();
                        break;
                }
                return Unit.f18162a;
            }
        };
        final int i20 = 4;
        f.e(mayaProfileInputLayout4, lastName, function24, function13, null, new Function0(this) { // from class: yc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21105b;

            {
                this.f21105b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x01f6  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 668
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yc.C2520a.invoke():java.lang.Object");
            }
        }, 8);
        MayaProfileInputLayout mayaProfileInputLayout5 = ((K0) G1()).f3715d;
        final int i21 = 7;
        f.e(mayaProfileInputLayout5, FieldType.AlternativeContactNumber.INSTANCE, new Function2(this) { // from class: yc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21107b;

            {
                this.f21107b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FieldType fieldType = (FieldType) obj;
                switch (i21) {
                    case 0:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PY"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment = this.f21107b;
                        return mayaPersonalDetailsFragment.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PT"), numX49.tnTj78("bt9PR"), 0, 11), mayaPersonalDetailsFragment.f14245d0);
                    case 1:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pv"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment2 = this.f21107b;
                        return mayaPersonalDetailsFragment2.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment2.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P7"), numX49.tnTj78("bt9PA"), 0, 12), mayaPersonalDetailsFragment2.f14245d0);
                    case 2:
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PG"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment3 = this.f21107b;
                        return mayaPersonalDetailsFragment3.W1(fieldType, obj2, new eb.f(2, mayaPersonalDetailsFragment3.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9P3"), numX49.tnTj78("bt9Py"), 0, 13), mayaPersonalDetailsFragment3.f14245d0);
                    case 3:
                        String str = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PN"));
                        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt9P6"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment4 = this.f21107b;
                        return mayaPersonalDetailsFragment4.V1(fieldType, str, new eb.f(2, mayaPersonalDetailsFragment4.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pa"), numX49.tnTj78("bt9PX"), 0, 14), mayaPersonalDetailsFragment4.f14245d0);
                    case 4:
                        String str2 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pm"));
                        kotlin.jvm.internal.j.g(str2, numX49.tnTj78("bt9PD"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment5 = this.f21107b;
                        return mayaPersonalDetailsFragment5.V1(fieldType, str2, new eb.f(2, mayaPersonalDetailsFragment5.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Ph"), numX49.tnTj78("bt9PM"), 0, 8), mayaPersonalDetailsFragment5.f14245d0);
                    case 5:
                        String str3 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Po"));
                        kotlin.jvm.internal.j.g(str3, numX49.tnTj78("bt9PK"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment6 = this.f21107b;
                        return mayaPersonalDetailsFragment6.V1(fieldType, str3, new eb.f(2, mayaPersonalDetailsFragment6.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pw"), numX49.tnTj78("bt9Pc"), 0, 7), mayaPersonalDetailsFragment6.f14245d0);
                    case 6:
                        String str4 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9Pe"));
                        kotlin.jvm.internal.j.g(str4, numX49.tnTj78("bt9P8"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment7 = this.f21107b;
                        return mayaPersonalDetailsFragment7.V1(fieldType, str4, new eb.f(2, mayaPersonalDetailsFragment7.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9PC"), numX49.tnTj78("bt9P4"), 0, 9), mayaPersonalDetailsFragment7.f14245d0);
                    default:
                        String str5 = (String) obj2;
                        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bt9PO"));
                        kotlin.jvm.internal.j.g(str5, numX49.tnTj78("bt9PQ"));
                        MayaPersonalDetailsFragment mayaPersonalDetailsFragment8 = this.f21107b;
                        return mayaPersonalDetailsFragment8.V1(fieldType, str5, new eb.f(2, mayaPersonalDetailsFragment8.X1(), InterfaceC1974a.class, numX49.tnTj78("bt9Pt"), numX49.tnTj78("bt9PU"), 0, 10), mayaPersonalDetailsFragment8.f14245d0);
                }
            }
        }, new C1963b(i21, this, mayaProfileInputLayout5), null, new l(28, this, mayaProfileInputLayout5), 8);
        K0 k03 = (K0) G1();
        k03.m.setOnCheckedChangeListener(new W2(this, 6));
        final int i22 = 2;
        b.b(((K0) G1()).f3719n, new Function0(this) { // from class: yc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPersonalDetailsFragment f21105b;

            {
                this.f21105b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x01f6  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 668
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yc.C2520a.invoke():java.lang.Object");
            }
        });
        Xh.i.E(this, z.a(MayaProfileUpdateSingleSelectionBottomSheetDialogFragment.class), new g(1, this, MayaPersonalDetailsFragment.class, "handleSingleSelectionResult", "handleSingleSelectionResult(Lcom/paymaya/domain/model/UpdateProfileSelectionItem;)V", 0, 15));
    }
}
