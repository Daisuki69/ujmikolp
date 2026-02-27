package M8;

import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import c8.InterfaceC1083a;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.FieldType;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaAddFavoriteFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycVerifyWithPhilsysFragment;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationUserFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountCreationFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDisplayNameFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaPersonalDetailsFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import db.InterfaceC1348a;
import g9.InterfaceC1510e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pi.C2151a;
import rc.C2194a;
import wc.InterfaceC2390a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class W2 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaBaseFragment f3245b;

    public /* synthetic */ W2(MayaBaseFragment mayaBaseFragment, int i) {
        this.f3244a = i;
        this.f3245b = mayaBaseFragment;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
        String str;
        String str2;
        String string = "";
        switch (this.f3244a) {
            case 0:
                MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment = (MayaKycVerifyWithPhilsysFragment) this.f3245b;
                T2.Q(mayaKycVerifyWithPhilsysFragment, ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3540b.getText().toString(), null, null, 14);
                if (z4) {
                    ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3543k.e.setText("");
                    KycMayaInputLayout kycMayaInputLayout = ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3543k;
                    kycMayaInputLayout.f12696l = false;
                    kycMayaInputLayout.d();
                    ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3543k.setEnabled(false);
                    ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3540b.setVisibility(0);
                } else {
                    ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3543k.setEnabled(true);
                    ((N5.A0) mayaKycVerifyWithPhilsysFragment.G1()).f3540b.setVisibility(0);
                }
                ((D8.W) mayaKycVerifyWithPhilsysFragment.K1()).k();
                return;
            case 1:
                NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = (NewMayaCreditEnhancedActivationFragment) this.f3245b;
                if (!z4) {
                    MayaInputLayout mayaInputLayout = newMayaCreditEnhancedActivationFragment.u0;
                    if (mayaInputLayout == null) {
                        kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                        throw null;
                    }
                    mayaInputLayout.getInputEditText().setText("");
                    MayaInputLayout mayaInputLayout2 = newMayaCreditEnhancedActivationFragment.u0;
                    if (mayaInputLayout2 == null) {
                        kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                        throw null;
                    }
                    mayaInputLayout2.setEnabled(true);
                    newMayaCreditEnhancedActivationFragment.H1().r(true);
                    return;
                }
                MayaInputLayout mayaInputLayout3 = newMayaCreditEnhancedActivationFragment.u0;
                if (mayaInputLayout3 == null) {
                    kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                    throw null;
                }
                mayaInputLayout3.getInputEditText().setText("");
                MayaInputLayout mayaInputLayout4 = newMayaCreditEnhancedActivationFragment.u0;
                if (mayaInputLayout4 == null) {
                    kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                    throw null;
                }
                mayaInputLayout4.setEnabled(false);
                MayaInputLayout mayaInputLayout5 = newMayaCreditEnhancedActivationFragment.u0;
                if (mayaInputLayout5 == null) {
                    kotlin.jvm.internal.j.n("mMothersMaidenMiddleName");
                    throw null;
                }
                mayaInputLayout5.f();
                newMayaCreditEnhancedActivationFragment.H1().r(false);
                return;
            case 2:
                ((MayaDisplayNameFragment) this.f3245b).G1().k(z4);
                return;
            case 3:
                Y7.b bVar = (Y7.b) ((MayaAddFavoriteFragment) this.f3245b).G1();
                if (z4) {
                    ((MayaAddFavoriteFragment) ((InterfaceC1083a) bVar.c.get())).I1();
                    MayaAddFavoriteFragment mayaAddFavoriteFragment = (MayaAddFavoriteFragment) ((InterfaceC1083a) bVar.c.get());
                    mayaAddFavoriteFragment.getClass();
                    mayaAddFavoriteFragment.f12337k0 = "y";
                    return;
                }
                ((MayaAddFavoriteFragment) ((InterfaceC1083a) bVar.c.get())).f12336j0 = null;
                Group group = ((MayaAddFavoriteFragment) ((InterfaceC1083a) bVar.c.get())).f12331e0;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mConstraintGroupChosenReminderDaySection");
                    throw null;
                }
                group.setVisibility(8);
                MayaAddFavoriteFragment mayaAddFavoriteFragment2 = (MayaAddFavoriteFragment) ((InterfaceC1083a) bVar.c.get());
                mayaAddFavoriteFragment2.getClass();
                mayaAddFavoriteFragment2.f12337k0 = "n";
                return;
            case 4:
                MayaAccountCreationFragment mayaAccountCreationFragment = (MayaAccountCreationFragment) this.f3245b;
                Xa.b bVar2 = (Xa.b) mayaAccountCreationFragment.I1();
                bVar2.i = z4;
                if (z4) {
                    N5.C c = ((MayaAccountCreationFragment) ((InterfaceC1348a) bVar2.c.get())).f13677V;
                    kotlin.jvm.internal.j.d(c);
                    MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) c.f3562k;
                    mayaProfileInputLayout.getInputEditText().setText("");
                    mayaProfileInputLayout.setEnabled(false);
                    mayaProfileInputLayout.f();
                } else {
                    N5.C c10 = ((MayaAccountCreationFragment) ((InterfaceC1348a) bVar2.c.get())).f13677V;
                    kotlin.jvm.internal.j.d(c10);
                    MayaProfileInputLayout mayaProfileInputLayout2 = (MayaProfileInputLayout) c10.f3562k;
                    mayaProfileInputLayout2.getInputEditText().setText("");
                    mayaProfileInputLayout2.setEnabled(true);
                }
                C1229s c1229sH1 = mayaAccountCreationFragment.H1();
                FragmentActivity fragmentActivityRequireActivity = mayaAccountCreationFragment.requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                String strP = AbstractC1213b.p(2);
                kotlin.jvm.internal.j.f(strP, "tapped(...)");
                String strS = mayaAccountCreationFragment.s();
                N5.C c11 = mayaAccountCreationFragment.f13677V;
                kotlin.jvm.internal.j.d(c11);
                c1229sH1.a(fragmentActivityRequireActivity, strP, strS, ((AppCompatCheckBox) c11.f3564n).getText().toString(), z4, EnumC1212a.CHECKBOX, new eb.g(1, mayaAccountCreationFragment.H1(), C1229s.class, "getStatusValue", "getStatusValue(Z)Ljava/lang/String;", 0, 2), new eb.g(1, mayaAccountCreationFragment.H1(), C1229s.class, "getCheckValue", "getCheckValue(Z)Ljava/lang/String;", 0, 3), cj.M.e());
                return;
            case 5:
                Z8.g gVar = (Z8.g) ((MayaRegistrationUserFragment) this.f3245b).L1();
                gVar.e = z4;
                if (z4) {
                    str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    str2 = "check";
                } else {
                    str = "0";
                    str2 = "uncheck";
                }
                MayaRegistrationUserFragment mayaRegistrationUserFragment = (MayaRegistrationUserFragment) ((InterfaceC1510e) gVar.c.get());
                mayaRegistrationUserFragment.getClass();
                C1220i c1220iO1 = mayaRegistrationUserFragment.o1();
                FragmentActivity activity = mayaRegistrationUserFragment.getActivity();
                C1219h c1219hE = C1219h.e(AbstractC1213b.o(3));
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                HashMap map = c1219hE.j;
                map.put("source_page", "Start an account");
                map.put("checkbox", str);
                map.put("action_function", str2);
                AppCompatCheckBox appCompatCheckBox = mayaRegistrationUserFragment.f12815f0;
                if (appCompatCheckBox == null) {
                    kotlin.jvm.internal.j.n("mLegalMiddleNameCheckbox");
                    throw null;
                }
                map.put("option_label", appCompatCheckBox.getText().toString());
                c1219hE.i();
                c1220iO1.c(activity, c1219hE);
                gVar.m();
                InterfaceC1510e interfaceC1510e = (InterfaceC1510e) gVar.c.get();
                boolean z5 = gVar.e;
                MayaInputLayout mayaInputLayout6 = ((MayaRegistrationUserFragment) interfaceC1510e).f12810a0;
                if (mayaInputLayout6 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutMiddleName");
                    throw null;
                }
                if (z5) {
                    mayaInputLayout6.setEnabled(false);
                    mayaInputLayout6.getFormContainerLayout().setEnabled(false);
                    mayaInputLayout6.getFormContainerLayout().setClickable(false);
                    mayaInputLayout6.getInputEditText().setText("");
                    mayaInputLayout6.f();
                    mayaInputLayout6.f12051K = false;
                    mayaInputLayout6.l();
                } else {
                    mayaInputLayout6.setEnabled(true);
                    mayaInputLayout6.getFormContainerLayout().setEnabled(true);
                    mayaInputLayout6.getFormContainerLayout().setClickable(true);
                }
                InterfaceC1510e interfaceC1510e2 = (InterfaceC1510e) gVar.c.get();
                boolean z8 = gVar.e;
                MayaRegistrationUserFragment mayaRegistrationUserFragment2 = (MayaRegistrationUserFragment) interfaceC1510e2;
                MayaInputLayout mayaInputLayout7 = mayaRegistrationUserFragment2.f12810a0;
                if (mayaInputLayout7 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutMiddleName");
                    throw null;
                }
                if (!z8) {
                    string = mayaRegistrationUserFragment2.getString(R.string.maya_hint_registration_user_enter_middle_name);
                    kotlin.jvm.internal.j.d(string);
                }
                mayaInputLayout7.setHint(string);
                MayaRegistrationUserFragment mayaRegistrationUserFragment3 = (MayaRegistrationUserFragment) ((InterfaceC1510e) gVar.c.get());
                if (gVar.e) {
                    mayaRegistrationUserFragment3.getClass();
                } else {
                    MayaInputLayout mayaInputLayout8 = mayaRegistrationUserFragment3.f12810a0;
                    if (mayaInputLayout8 == null) {
                        kotlin.jvm.internal.j.n("mMayaInputLayoutMiddleName");
                        throw null;
                    }
                    mayaInputLayout8.requestFocus();
                }
                MayaRegistrationUserFragment mayaRegistrationUserFragment4 = (MayaRegistrationUserFragment) ((InterfaceC1510e) gVar.c.get());
                if (gVar.e) {
                    MayaInputLayout mayaInputLayout9 = mayaRegistrationUserFragment4.f12810a0;
                    if (mayaInputLayout9 != null) {
                        mayaInputLayout9.getInputEditText().removeTextChangedListener(mayaRegistrationUserFragment4.f12818i0);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mMayaInputLayoutMiddleName");
                        throw null;
                    }
                }
                MayaInputLayout mayaInputLayout10 = mayaRegistrationUserFragment4.f12810a0;
                if (mayaInputLayout10 != null) {
                    mayaInputLayout10.getInputEditText().addTextChangedListener(mayaRegistrationUserFragment4.f12818i0);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutMiddleName");
                    throw null;
                }
            case 6:
                MayaPersonalDetailsFragment mayaPersonalDetailsFragment = (MayaPersonalDetailsFragment) this.f3245b;
                C2194a c2194a = (C2194a) mayaPersonalDetailsFragment.X1();
                c2194a.f19885n = z4;
                if (z4) {
                    MayaPersonalDetailsFragment mayaPersonalDetailsFragment2 = (MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a.c.get());
                    MayaProfileInputLayout mayaProfileInputLayout3 = ((N5.K0) mayaPersonalDetailsFragment2.G1()).h;
                    mayaProfileInputLayout3.getInputEditText().setText("");
                    mayaProfileInputLayout3.setEnabled(false);
                    mayaProfileInputLayout3.getFormContainerLayout().setEnabled(false);
                    mayaProfileInputLayout3.getFormContainerLayout().setClickable(false);
                    mayaProfileInputLayout3.f();
                    mayaPersonalDetailsFragment2.f14245d0.e(FieldType.MiddleName.INSTANCE);
                } else {
                    MayaPersonalDetailsFragment mayaPersonalDetailsFragment3 = (MayaPersonalDetailsFragment) ((InterfaceC2390a) c2194a.c.get());
                    MayaProfileInputLayout mayaProfileInputLayout4 = ((N5.K0) mayaPersonalDetailsFragment3.G1()).h;
                    mayaProfileInputLayout4.getInputEditText().setText("");
                    mayaProfileInputLayout4.setEnabled(true);
                    mayaProfileInputLayout4.getFormContainerLayout().setEnabled(true);
                    mayaProfileInputLayout4.getFormContainerLayout().setClickable(true);
                    FieldType.MiddleName type = FieldType.MiddleName.INSTANCE;
                    C2151a c2151a = mayaPersonalDetailsFragment3.f14245d0;
                    c2151a.getClass();
                    kotlin.jvm.internal.j.g(type, "type");
                    ((Set) c2151a.f19707a).add(type);
                    ((Map) c2151a.c).put(type, Boolean.FALSE);
                }
                N5.K0 k02 = (N5.K0) mayaPersonalDetailsFragment.G1();
                k02.f3719n.setEnabled(mayaPersonalDetailsFragment.f14245d0.c());
                return;
            case 7:
                MayaUserContactReferenceFragment mayaUserContactReferenceFragment = (MayaUserContactReferenceFragment) this.f3245b;
                if (!z4) {
                    mayaUserContactReferenceFragment.a2().getInputEditText().setText("");
                    mayaUserContactReferenceFragment.a2().setEnabled(true);
                    ((rc.i) mayaUserContactReferenceFragment.Z1()).f19905p = true;
                    return;
                } else {
                    mayaUserContactReferenceFragment.a2().getInputEditText().setText("");
                    mayaUserContactReferenceFragment.a2().setEnabled(false);
                    mayaUserContactReferenceFragment.a2().f();
                    ((rc.i) mayaUserContactReferenceFragment.Z1()).f19905p = false;
                    return;
                }
            default:
                List list = MayaUserProfileUpdateFragment.f14261f0;
                MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = (MayaUserProfileUpdateFragment) this.f3245b;
                if (!z4) {
                    mayaUserProfileUpdateFragment.f2().getInputEditText().setText("");
                    mayaUserProfileUpdateFragment.f2().setEnabled(true);
                    ((rc.m) mayaUserProfileUpdateFragment.h2()).f19920r = true;
                    return;
                } else {
                    mayaUserProfileUpdateFragment.f2().getInputEditText().setText("");
                    mayaUserProfileUpdateFragment.f2().setEnabled(false);
                    mayaUserProfileUpdateFragment.f2().f();
                    ((rc.m) mayaUserProfileUpdateFragment.h2()).f19920r = false;
                    return;
                }
        }
    }
}
