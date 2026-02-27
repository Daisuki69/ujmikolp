package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import L9.o;
import M2.b;
import N5.C0466m;
import O5.a;
import P9.g;
import Q9.InterfaceC0583m;
import Q9.ViewOnClickListenerC0582l;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import b7.f;
import c7.C1079c;
import c7.C1081e;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.E;
import com.paymaya.domain.model.MothersMaidenName;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.K;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.MayaReviewInfoRecyclerView;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class NewMayaCreditActivationConfirmDetailFragment extends MayaBaseFragment implements g {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0466m f13146U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public CreditReviewUiModel f13147V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f13148W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MayaReviewInfoRecyclerView f13149X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MayaReviewInfoRecyclerView f13150Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public MayaReviewInfoRecyclerView f13151Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public MayaReviewInfoRecyclerView f13152a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Button f13153b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Group f13154c0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public o f13159h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public InterfaceC0583m f13160i0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final f f13155d0 = new f();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final f f13156e0 = new f();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final f f13157f0 = new f();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final f f13158g0 = new f();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final boolean f13161j0 = true;

    public final o G1() {
        o oVar = this.f13159h0;
        if (oVar != null) {
            return oVar;
        }
        j.n("mNewMayaCreditActivationConfirmDetailFragmentPresenter");
        throw null;
    }

    public final void H1(String str, Map map) {
        InterfaceC0583m interfaceC0583m = this.f13160i0;
        if (interfaceC0583m != null) {
            ((NewMayaCreditActivity) interfaceC0583m).Y1(str, map);
        }
    }

    public final void I1(CreditReviewUiModel creditReviewUiModel) {
        j.g(creditReviewUiModel, "creditReviewUiModel");
        InterfaceC0583m interfaceC0583m = this.f13160i0;
        if (interfaceC0583m != null) {
            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) interfaceC0583m;
            E.a("NewMayaCreditActivity", "showAllSetScreenEnhance");
            newMayaCreditActivity.getWindow().setSoftInputMode(48);
            MayaCreditActivationAllSetEnhanceFragment mayaCreditActivationAllSetEnhanceFragment = new MayaCreditActivationAllSetEnhanceFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("BUNDLE_REVIEW_INFO", creditReviewUiModel);
            mayaCreditActivationAllSetEnhanceFragment.setArguments(bundle);
            AbstractC1236z.h(newMayaCreditActivity, R.id.fragment_container, mayaCreditActivationAllSetEnhanceFragment);
        }
    }

    public final void J1() {
        InterfaceC0583m interfaceC0583m = this.f13160i0;
        if (interfaceC0583m != null) {
            ViewOnClickListenerC0582l viewOnClickListenerC0582l = new ViewOnClickListenerC0582l(this, 2);
            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) interfaceC0583m;
            if (newMayaCreditActivity.isFinishing()) {
                E.a("NewMayaCreditActivity", "showGeolocationErrorDialog: Cannot show dialog, activity is finishing.");
            } else {
                E.a("NewMayaCreditActivity", "showGeolocationErrorDialog");
                b.Z(0, newMayaCreditActivity.getString(R.string.maya_label_lets_try_that_again), newMayaCreditActivity.getString(R.string.maya_label_location_data_extract_error_message), newMayaCreditActivity.getString(R.string.maya_label_try_again), newMayaCreditActivity.getString(R.string.maya_label_got_it), false, null, viewOnClickListenerC0582l, false, 353).show(newMayaCreditActivity.getSupportFragmentManager(), "error_dialog");
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CreditReviewUiModel creditReviewUiModel;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (creditReviewUiModel = (CreditReviewUiModel) arguments.getParcelable("BUNDLE_REVIEW_INFO")) != null) {
            this.f13147V = creditReviewUiModel;
        }
        this.f13160i0 = (InterfaceC0583m) getActivity();
        a aVar = W4.a.e().D().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        C1264i0 c1264i0A = aVar.A();
        K deviceStore = (K) aVar.f4671K.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        j.g(deviceStore, "deviceStore");
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        this.f13159h0 = new o(c1264i0A, deviceStore, preference, flagConfigurationService);
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_credit_confrim_detail, viewGroup, false);
        int i = R.id.barrier;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier)) != null) {
            i = R.id.button_confirm;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_confirm);
            if (button != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                i = R.id.group_mothers_maiden_name;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_mothers_maiden_name);
                if (group != null) {
                    i = R.id.recycler_view_billing;
                    MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView = (MayaReviewInfoRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_billing);
                    if (mayaReviewInfoRecyclerView != null) {
                        i = R.id.recycler_view_contact;
                        MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView2 = (MayaReviewInfoRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_contact);
                        if (mayaReviewInfoRecyclerView2 != null) {
                            i = R.id.recycler_view_mothers_maiden_name;
                            MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView3 = (MayaReviewInfoRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_mothers_maiden_name);
                            if (mayaReviewInfoRecyclerView3 != null) {
                                i = R.id.recycler_view_personal;
                                MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView4 = (MayaReviewInfoRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_personal);
                                if (mayaReviewInfoRecyclerView4 != null) {
                                    i = R.id.text_view_billing_title;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_billing_title)) != null) {
                                        i = R.id.text_view_contact_title;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_contact_title);
                                        if (textView != null) {
                                            i = R.id.text_view_header;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                                i = R.id.text_view_mothers_maiden_name_title;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_mothers_maiden_name_title)) != null) {
                                                    i = R.id.text_view_personal_title;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_personal_title)) != null) {
                                                        this.f13146U = new C0466m((ViewGroup) nestedScrollView, (Object) button, (View) group, (Object) mayaReviewInfoRecyclerView, (Object) mayaReviewInfoRecyclerView2, (Object) mayaReviewInfoRecyclerView3, (View) mayaReviewInfoRecyclerView4, (View) textView, 7);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC0583m interfaceC0583m = this.f13160i0;
        if (interfaceC0583m != null) {
            ((NewMayaCreditActivity) interfaceC0583m).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        G1().i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        String str;
        Throwable th2;
        String str2;
        String str3;
        String str4;
        List list;
        String firstName;
        String middleName;
        String lastName;
        int i = 0;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0466m c0466m = this.f13146U;
        j.d(c0466m);
        this.f13149X = (MayaReviewInfoRecyclerView) c0466m.e;
        C0466m c0466m2 = this.f13146U;
        j.d(c0466m2);
        this.f13150Y = (MayaReviewInfoRecyclerView) c0466m2.h;
        C0466m c0466m3 = this.f13146U;
        j.d(c0466m3);
        this.f13151Z = (MayaReviewInfoRecyclerView) c0466m3.f;
        C0466m c0466m4 = this.f13146U;
        j.d(c0466m4);
        this.f13148W = (TextView) c0466m4.i;
        C0466m c0466m5 = this.f13146U;
        j.d(c0466m5);
        this.f13152a0 = (MayaReviewInfoRecyclerView) c0466m5.f4152g;
        C0466m c0466m6 = this.f13146U;
        j.d(c0466m6);
        this.f13153b0 = (Button) c0466m6.c;
        C0466m c0466m7 = this.f13146U;
        j.d(c0466m7);
        this.f13154c0 = (Group) c0466m7.f4151d;
        MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView = this.f13149X;
        if (mayaReviewInfoRecyclerView == null) {
            j.n("mRecyclerViewBilling");
            throw null;
        }
        mayaReviewInfoRecyclerView.setAdapter(this.f13155d0);
        MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView2 = this.f13150Y;
        if (mayaReviewInfoRecyclerView2 == null) {
            j.n("mRecyclerViewPersonal");
            throw null;
        }
        mayaReviewInfoRecyclerView2.setAdapter(this.f13156e0);
        MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView3 = this.f13151Z;
        if (mayaReviewInfoRecyclerView3 == null) {
            j.n("mRecyclerViewContact");
            throw null;
        }
        mayaReviewInfoRecyclerView3.setAdapter(this.f13157f0);
        MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView4 = this.f13152a0;
        if (mayaReviewInfoRecyclerView4 == null) {
            j.n("mRecyclerViewMothersMaidenName");
            throw null;
        }
        mayaReviewInfoRecyclerView4.setAdapter(this.f13158g0);
        o oVarG1 = G1();
        CreditReviewUiModel creditReviewUiModel = this.f13147V;
        if (creditReviewUiModel == null) {
            j.n("creditReviewUiModel");
            throw null;
        }
        oVarG1.j();
        oVarG1.h = creditReviewUiModel;
        oVarG1.i = false;
        NewMayaCreditActivationConfirmDetailFragment newMayaCreditActivationConfirmDetailFragment = (NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG1.c.get());
        Group group = newMayaCreditActivationConfirmDetailFragment.f13154c0;
        if (group == null) {
            j.n("mGroupMotherMaidenName");
            throw null;
        }
        group.setVisibility(0);
        CreditReviewUiModel creditReviewUiModel2 = oVarG1.h;
        if (creditReviewUiModel2 == null) {
            j.n("mCreditReviewUiModel");
            throw null;
        }
        o oVarG12 = newMayaCreditActivationConfirmDetailFragment.G1();
        f fVar = newMayaCreditActivationConfirmDetailFragment.f13155d0;
        ArrayList arrayList = new ArrayList();
        String string = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_credit_activation_billing_end_date_header);
        j.f(string, "getString(...)");
        String string2 = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_credit_enhanced_activation_billing_end_date);
        j.f(string2, "getString(...)");
        String str5 = creditReviewUiModel2.c;
        if (str5 == null) {
            str5 = "";
        }
        if (string2.length() == 0 || str5.length() == 0) {
            str = "";
            th2 = null;
        } else {
            th2 = null;
            str = String.format(string2, Arrays.copyOf(new Object[]{str5}, 1));
        }
        String string3 = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_credit_enhanced_activation_billing_end_date_desc);
        j.f(string3, "getString(...)");
        arrayList.add(new C1079c(string, str, string3, null, 24));
        String string4 = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_credit_enhanced_billing_email);
        j.f(string4, "getString(...)");
        String str6 = creditReviewUiModel2.e;
        if (str6 == null) {
            str6 = "";
        }
        arrayList.add(new C1081e(string4, str6));
        fVar.e(arrayList);
        f fVar2 = newMayaCreditActivationConfirmDetailFragment.f13156e0;
        ArrayList arrayList2 = new ArrayList();
        String strL = o.l(creditReviewUiModel2.j);
        String string5 = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_credit_activation_gender_header);
        j.f(string5, "getString(...)");
        String str7 = creditReviewUiModel2.h;
        if (str7 == null) {
            str7 = "";
        }
        arrayList2.add(new C1081e(string5, str7));
        String string6 = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_credit_activation_marital_header);
        j.f(string6, "getString(...)");
        String str8 = creditReviewUiModel2.i;
        if (str8 == null) {
            str8 = "";
        }
        arrayList2.add(new C1081e(string6, str8));
        String string7 = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_credit_alternative_mobile_summary_title);
        j.f(string7, "getString(...)");
        arrayList2.add(new C1081e(string7, C.p(strL)));
        fVar2.e(arrayList2);
        f fVar3 = newMayaCreditActivationConfirmDetailFragment.f13157f0;
        c cVar = oVarG12.f2905g;
        A5.b bVar = A5.b.f76S;
        if (c.b(cVar, bVar)) {
            list = C1112C.f9377a;
        } else {
            ArrayList arrayList3 = new ArrayList();
            J9.a aVar = creditReviewUiModel2.f13060l;
            String strL2 = o.l(aVar != null ? aVar.f2487d : th2);
            String string8 = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_contact_reference_two_third_input_field_first_name_title);
            j.f(string8, "getString(...)");
            J9.a aVar2 = creditReviewUiModel2.f13060l;
            if (aVar2 == null || (str2 = aVar2.f2485a) == null) {
                str2 = "";
            }
            arrayList3.add(new C1081e(string8, str2));
            String string9 = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_contact_reference_two_third_input_field_last_name_title);
            j.f(string9, "getString(...)");
            J9.a aVar3 = creditReviewUiModel2.f13060l;
            if (aVar3 == null || (str3 = aVar3.f2486b) == null) {
                str3 = "";
            }
            arrayList3.add(new C1081e(string9, str3));
            String string10 = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_contact_reference_two_third_input_field_contact_relationship_title);
            j.f(string10, "getString(...)");
            J9.a aVar4 = creditReviewUiModel2.f13060l;
            if (aVar4 == null || (str4 = aVar4.c) == null) {
                str4 = "";
            }
            arrayList3.add(new C1081e(string10, str4));
            String string11 = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_contact_reference_two_third_input_field_mobile_number_title);
            j.f(string11, "getString(...)");
            arrayList3.add(new C1081e(string11, C.p(strL2)));
            list = arrayList3;
        }
        fVar3.e(list);
        f fVar4 = newMayaCreditActivationConfirmDetailFragment.f13158g0;
        ArrayList arrayList4 = new ArrayList();
        String string12 = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_credit_mothers_maiden_first_name);
        j.f(string12, "getString(...)");
        MothersMaidenName mothersMaidenName = creditReviewUiModel2.f13065r;
        if (mothersMaidenName == null || (firstName = mothersMaidenName.getFirstName()) == null) {
            firstName = "";
        }
        arrayList4.add(new C1081e(string12, firstName));
        String string13 = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_credit_mothers_maiden_middle_name);
        j.f(string13, "getString(...)");
        MothersMaidenName mothersMaidenName2 = creditReviewUiModel2.f13065r;
        if (mothersMaidenName2 == null || (middleName = mothersMaidenName2.getMiddleName()) == null) {
            middleName = "";
        }
        arrayList4.add(new C1081e(string13, middleName));
        String string14 = ((NewMayaCreditActivationConfirmDetailFragment) ((g) oVarG12.c.get())).getString(R.string.maya_label_credit_mothers_maiden_last_name);
        j.f(string14, "getString(...)");
        MothersMaidenName mothersMaidenName3 = creditReviewUiModel2.f13065r;
        if (mothersMaidenName3 == null || (lastName = mothersMaidenName3.getLastName()) == null) {
            lastName = "";
        }
        arrayList4.add(new C1081e(string14, lastName));
        fVar4.e(arrayList4);
        if (c.b(oVarG1.f2905g, bVar)) {
            TextView textView = newMayaCreditActivationConfirmDetailFragment.f13148W;
            if (textView == null) {
                j.n("mContactReferenceTextView");
                throw th2;
            }
            textView.setVisibility(8);
            MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView5 = newMayaCreditActivationConfirmDetailFragment.f13151Z;
            if (mayaReviewInfoRecyclerView5 == null) {
                j.n("mRecyclerViewContact");
                throw th2;
            }
            mayaReviewInfoRecyclerView5.setVisibility(8);
        }
        Button button = this.f13153b0;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC0582l(this, i));
        } else {
            j.n("mConfirmButton");
            throw th2;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return this.f13161j0;
    }
}
