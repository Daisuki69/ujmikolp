package M8;

import D8.C0214w;
import D8.C0217z;
import N5.C0466m;
import a7.C0657r;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.Global;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.DataPrivacyProvision;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaAutoProvisionDataPrivacyPolicyFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyDataPersonalizationFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDosriFragment;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import com.paymaya.ui.dataprivacy.view.fragment.impl.DataAndPersonalizationFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class D0 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3150b;
    public final /* synthetic */ Object c;

    public /* synthetic */ D0(int i, Object obj, Object obj2) {
        this.f3149a = i;
        this.f3150b = obj;
        this.c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        String str4 = "uncheck";
        switch (this.f3149a) {
            case 0:
                kotlin.jvm.internal.j.d(compoundButton);
                MayaKycDosriFragment mayaKycDosriFragment = (MayaKycDosriFragment) this.f3150b;
                int iO1 = mayaKycDosriFragment.O1(compoundButton);
                C0466m c0466m = (C0466m) this.c;
                mayaKycDosriFragment.Q1(((Object) ((AppCompatCheckBox) c0466m.c).getText()) + Global.BLANK + iO1, "");
                boolean z5 = z4 ^ true;
                MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) c0466m.h;
                mayaProfileInputLayout.setEnabled(z5);
                mayaProfileInputLayout.getFormContainerLayout().setEnabled(z5);
                mayaProfileInputLayout.getFormContainerLayout().setClickable(z5);
                mayaKycDosriFragment.P1(mayaProfileInputLayout, ((C0217z) mayaKycDosriFragment.M1()).q(KycFieldType.MIDDLE_NAME, z4 ? "" : String.valueOf(mayaProfileInputLayout.getInputEditText().getText()), z4));
                ((C0217z) mayaKycDosriFragment.M1()).p();
                return;
            case 1:
                MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment = (MayaAutoProvisionDataPrivacyPolicyFragment) this.f3150b;
                DataPrivacyProvision dataPrivacyProvision = (DataPrivacyProvision) this.c;
                String id = dataPrivacyProvision.getId();
                Bundle arguments = mayaAutoProvisionDataPrivacyPolicyFragment.getArguments();
                if (arguments == null || (arrayList = arguments.getParcelableArrayList("data_privacy_provisions")) == null) {
                    arrayList = new ArrayList();
                }
                ListIterator listIterator = arrayList.listIterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        DataPrivacyProvision dataPrivacyProvision2 = (DataPrivacyProvision) listIterator.next();
                        if (kotlin.jvm.internal.j.b(dataPrivacyProvision2.getId(), id)) {
                            dataPrivacyProvision2.setChecked(z4);
                        }
                    }
                }
                M7.a aVar = mayaAutoProvisionDataPrivacyPolicyFragment.f12269U;
                if (aVar == null) {
                    kotlin.jvm.internal.j.n("mMayaAutoProvisionDataPrivacyPolicyFragmentPresenter");
                    throw null;
                }
                if (kotlin.jvm.internal.j.b(dataPrivacyProvision.getId(), DataPrivacyProvision.ID_SAVINGS)) {
                    androidx.camera.core.impl.a.A(aVar.e.f11330b, "savings_auto_provision_opt_in", z4);
                    if (z4) {
                        Group group = ((MayaAutoProvisionDataPrivacyPolicyFragment) ((R7.a) aVar.c.get())).f12278d0;
                        if (group == null) {
                            kotlin.jvm.internal.j.n("mSavingsGroup");
                            throw null;
                        }
                        group.setVisibility(0);
                    } else {
                        Group group2 = ((MayaAutoProvisionDataPrivacyPolicyFragment) ((R7.a) aVar.c.get())).f12278d0;
                        if (group2 == null) {
                            kotlin.jvm.internal.j.n("mSavingsGroup");
                            throw null;
                        }
                        group2.setVisibility(8);
                    }
                    String optionLabel = dataPrivacyProvision.getName();
                    kotlin.jvm.internal.j.g(optionLabel, "optionLabel");
                    str = z4 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0";
                    str2 = z4 ? "check" : "uncheck";
                    MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment2 = (MayaAutoProvisionDataPrivacyPolicyFragment) ((R7.a) aVar.c.get());
                    mayaAutoProvisionDataPrivacyPolicyFragment2.getClass();
                    C1220i c1220iO1 = mayaAutoProvisionDataPrivacyPolicyFragment2.o1();
                    FragmentActivity activity = mayaAutoProvisionDataPrivacyPolicyFragment2.getActivity();
                    C1219h c1219hE = C1219h.e(AbstractC1213b.o(3));
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    HashMap map = c1219hE.j;
                    map.put("source_page", "Product Opt In");
                    map.put("checkbox", str);
                    map.put("action_function", str2);
                    map.put("option_label", optionLabel);
                    c1219hE.i();
                    c1220iO1.c(activity, c1219hE);
                    return;
                }
                return;
            case 2:
                MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = (MayaDataPrivacyDataPersonalizationFragment) this.f3150b;
                Consent consent = (Consent) this.c;
                String strMID = consent.mID();
                kotlin.jvm.internal.j.f(strMID, "mID(...)");
                ListIterator listIterator2 = mayaDataPrivacyDataPersonalizationFragment.f12290f0.listIterator();
                while (true) {
                    if (listIterator2.hasNext()) {
                        Consent consent2 = (Consent) listIterator2.next();
                        str3 = str4;
                        if (kotlin.jvm.internal.j.b(consent2.mID(), strMID)) {
                            ArrayList arrayList2 = mayaDataPrivacyDataPersonalizationFragment.f12290f0;
                            int iPreviousIndex = listIterator2.previousIndex();
                            Consent consentBuild = consent2.toBuilder().isEnabled(z4).build();
                            kotlin.jvm.internal.j.f(consentBuild, "build(...)");
                            arrayList2.set(iPreviousIndex, consentBuild);
                        } else {
                            str4 = str3;
                        }
                    } else {
                        str3 = str4;
                    }
                }
                S7.f fVar = mayaDataPrivacyDataPersonalizationFragment.f12287c0;
                if (fVar != null) {
                    fVar.m0();
                }
                mayaDataPrivacyDataPersonalizationFragment.H1().s();
                if (mayaDataPrivacyDataPersonalizationFragment.f12291g0) {
                    C0214w c0214wH1 = mayaDataPrivacyDataPersonalizationFragment.H1();
                    String strMName = consent.mName();
                    kotlin.jvm.internal.j.f(strMName, "mName(...)");
                    str = z4 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0";
                    str2 = z4 ? "check" : str3;
                    MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment2 = (MayaDataPrivacyDataPersonalizationFragment) ((R7.b) c0214wH1.c.get());
                    mayaDataPrivacyDataPersonalizationFragment2.getClass();
                    if (kotlin.jvm.internal.j.b(mayaDataPrivacyDataPersonalizationFragment2.f12289e0, "registration")) {
                        C1220i c1220iO12 = mayaDataPrivacyDataPersonalizationFragment2.o1();
                        FragmentActivity activity2 = mayaDataPrivacyDataPersonalizationFragment2.getActivity();
                        C1219h c1219hE2 = C1219h.e(AbstractC1213b.o(6));
                        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                        HashMap map2 = c1219hE2.j;
                        map2.put("source_page", "Data personalization");
                        map2.put("checkbox", str);
                        map2.put("action_function", str2);
                        map2.put("option_label", strMName);
                        c1219hE2.i();
                        c1220iO12.c(activity2, c1219hE2);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (((C0657r) this.f3150b).j) {
                    return;
                }
                ((CompoundButton.OnCheckedChangeListener) this.c).onCheckedChanged(compoundButton, z4);
                return;
            default:
                DataAndPersonalizationFragment dataAndPersonalizationFragment = (DataAndPersonalizationFragment) this.f3150b;
                pd.c cVar = dataAndPersonalizationFragment.f14486U;
                if (cVar != null) {
                    String strMName2 = ((Consent) this.c).mName();
                    kotlin.jvm.internal.j.f(strMName2, "mName(...)");
                    DataPrivacyActivity dataPrivacyActivity = (DataPrivacyActivity) cVar;
                    ArrayList arrayList3 = dataPrivacyActivity.m;
                    kotlin.jvm.internal.j.d(arrayList3);
                    ListIterator listIterator3 = arrayList3.listIterator();
                    while (true) {
                        if (listIterator3.hasNext()) {
                            Consent consent3 = (Consent) listIterator3.next();
                            if (kotlin.jvm.internal.j.b(consent3.mName(), strMName2)) {
                                int iPreviousIndex2 = listIterator3.previousIndex();
                                Consent consentBuild2 = consent3.toBuilder().isEnabled(z4).build();
                                kotlin.jvm.internal.j.f(consentBuild2, "build(...)");
                                arrayList3.set(iPreviousIndex2, consentBuild2);
                            }
                        }
                    }
                    dataPrivacyActivity.f14473k = true;
                }
                dataAndPersonalizationFragment.r1().k();
                if (z4) {
                    return;
                }
                N5.k1 k1Var = dataAndPersonalizationFragment.f14484S;
                kotlin.jvm.internal.j.d(k1Var);
                ((CheckBox) k1Var.f).setChecked(false);
                return;
        }
    }
}
