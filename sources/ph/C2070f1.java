package ph;

import N5.A1;
import N5.D1;
import a.AbstractC0617a;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import b6.C0922a;
import bg.AbstractC0983W;
import cj.C1110A;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1228q;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.AlternativeLandline;
import com.paymaya.domain.model.AlternativeMobile;
import com.paymaya.domain.model.ContactName;
import com.paymaya.domain.model.EducationDetails;
import com.paymaya.domain.model.EducationalAttainment;
import com.paymaya.domain.model.EmailContact;
import com.paymaya.domain.model.Gender;
import com.paymaya.domain.model.JobTitle;
import com.paymaya.domain.model.MFAChallengeInformationV2;
import com.paymaya.domain.model.MaritalStatus;
import com.paymaya.domain.model.MayaUpdateProfileData;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.model.ProfileGender;
import com.paymaya.domain.model.ProfileMaritalStatus;
import com.paymaya.domain.model.ProfileTin;
import com.paymaya.domain.model.PushNotification;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.model.ShopPurchaseHistoryPushNotification;
import com.paymaya.domain.model.UpdateProfileCmsContentData;
import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.domain.model.WorkDetails;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMfaFaceAuthFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserUpdateWorkDetailsFragment;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDIntroFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSubmissionReviewFragment;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3Fragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;
import com.tencent.could.huiyansdk.entity.HuiYanOsAuthResult;
import com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack;
import hh.InterfaceC1573f;
import io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao;
import io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheEntity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import pi.C2151a;
import pi.C2152b;
import pi.InterfaceC2153c;
import qc.C2169a;
import sc.AbstractC2250a;
import v.AbstractC2329d;
import wc.InterfaceC2394e;
import we.InterfaceC2428q;
import zj.C2576A;

/* JADX INFO: renamed from: ph.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2070f1 implements InterfaceC1573f, Ch.c, SuccessContinuation, ye.b, HuiYanOsAuthCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19463b;

    public /* synthetic */ C2070f1(Object obj, int i) {
        this.f19462a = i;
        this.f19463b = obj;
    }

    public static void b() {
        for (C2070f1 c2070f1 : yk.a.f21330a) {
            c2070f1.getClass();
            b();
        }
    }

    public static void c() {
        for (C2070f1 c2070f1 : yk.a.f21330a) {
            c2070f1.getClass();
            c();
        }
    }

    public static void d() {
        for (C2070f1 c2070f1 : yk.a.f21330a) {
            c2070f1.getClass();
            d();
        }
    }

    public static void e() {
        for (C2070f1 c2070f1 : yk.a.f21330a) {
            c2070f1.getClass();
            e();
        }
    }

    public static void f() {
        for (C2070f1 c2070f1 : yk.a.f21330a) {
            c2070f1.getClass();
            f();
        }
    }

    public static void g() {
        for (C2070f1 c2070f1 : yk.a.f21330a) {
            c2070f1.getClass();
            g();
        }
    }

    public static void h() {
        for (C2070f1 c2070f1 : yk.a.f21330a) {
            c2070f1.getClass();
            h();
        }
    }

    public static void i() {
        for (C2070f1 c2070f1 : yk.a.f21330a) {
            c2070f1.getClass();
            i();
        }
    }

    public static void k() {
        for (C2070f1 c2070f1 : yk.a.f21330a) {
            c2070f1.getClass();
            k();
        }
    }

    public static void l() {
        for (C2070f1 c2070f1 : yk.a.f21330a) {
            c2070f1.getClass();
            l();
        }
    }

    public static void m() {
        for (C2070f1 c2070f1 : yk.a.f21330a) {
            c2070f1.getClass();
            m();
        }
    }

    @Override // ye.c
    public void a() {
    }

    @Override // hh.InterfaceC1573f
    public void accept(Object obj) {
        EducationalAttainment educationalAttainment;
        Object next;
        MaritalStatus maritalStatus;
        Object next2;
        Gender gender;
        Object next3;
        switch (this.f19462a) {
            case 0:
                ((ch.r) this.f19463b).onNext(obj);
                return;
            case 1:
            case 3:
            default:
                Xb.A a8 = (Xb.A) this.f19463b;
                PayMayaError payMayaErrorF = a8.f((Throwable) obj, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                a8.l(payMayaErrorF);
                return;
            case 2:
                MayaUpdateProfileData userProfileData = (MayaUpdateProfileData) obj;
                kotlin.jvm.internal.j.g(userProfileData, "userProfileData");
                ((C2169a) this.f19463b).invoke(userProfileData);
                return;
            case 4:
                MayaUpdateProfileData it = (MayaUpdateProfileData) obj;
                kotlin.jvm.internal.j.g(it, "it");
                rc.m mVar = (rc.m) this.f19463b;
                mVar.getClass();
                EmailContact emailContact = it.getEmailContact();
                String emailAddress = emailContact != null ? emailContact.getEmailAddress() : null;
                if (emailAddress != null && emailAddress.length() != 0 && mVar.p(UpdateProfileFieldType.EMAIL_ADDRESS, emailAddress) == null) {
                    ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get())).a2().getInputEditText().setText(emailAddress);
                }
                ProfileGender gender2 = it.getGender();
                String genderCode = gender2 != null ? gender2.getGenderCode() : null;
                if (genderCode != null && genderCode.length() != 0) {
                    UpdateProfileCmsContentData updateProfileCmsContentData = mVar.f19915l;
                    if (updateProfileCmsContentData == null) {
                        kotlin.jvm.internal.j.n("updateProfileCmsContentData");
                        throw null;
                    }
                    List<Gender> genders = updateProfileCmsContentData.getGenders();
                    if (genders != null) {
                        Iterator<T> it2 = genders.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next3 = it2.next();
                                if (kotlin.jvm.internal.j.b(((Gender) next3).getCode(), genderCode)) {
                                }
                            } else {
                                next3 = null;
                            }
                        }
                        gender = (Gender) next3;
                    } else {
                        gender = null;
                    }
                    if (gender != null) {
                        ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get())).r2(gender);
                        MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get());
                        mayaUserProfileUpdateFragment.b2().h.setVisibility(4);
                        MayaDropDown mayaDropDownB2 = mayaUserProfileUpdateFragment.b2();
                        mayaDropDownB2.f12041g.setEnabled(false);
                        mayaDropDownB2.i.setEnabled(false);
                    }
                }
                ProfileMaritalStatus profileMaritalStatus = it.getProfileMaritalStatus();
                String classification = profileMaritalStatus != null ? profileMaritalStatus.getClassification() : null;
                if (classification != null && classification.length() != 0) {
                    UpdateProfileCmsContentData updateProfileCmsContentData2 = mVar.f19915l;
                    if (updateProfileCmsContentData2 == null) {
                        kotlin.jvm.internal.j.n("updateProfileCmsContentData");
                        throw null;
                    }
                    List<MaritalStatus> maritalStatuses = updateProfileCmsContentData2.getMaritalStatuses();
                    if (maritalStatuses != null) {
                        Iterator<T> it3 = maritalStatuses.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                if (kotlin.jvm.internal.j.b(((MaritalStatus) next2).getCode(), classification)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        maritalStatus = (MaritalStatus) next2;
                    } else {
                        maritalStatus = null;
                    }
                    if (maritalStatus != null) {
                        ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get())).p2(maritalStatus);
                    }
                }
                EducationDetails educationDetails = it.getEducationDetails();
                String educationalAttainment2 = educationDetails != null ? educationDetails.getEducationalAttainment() : null;
                if (educationalAttainment2 != null && educationalAttainment2.length() != 0) {
                    UpdateProfileCmsContentData updateProfileCmsContentData3 = mVar.f19915l;
                    if (updateProfileCmsContentData3 == null) {
                        kotlin.jvm.internal.j.n("updateProfileCmsContentData");
                        throw null;
                    }
                    List<EducationalAttainment> educationalAttainments = updateProfileCmsContentData3.getEducationalAttainments();
                    if (educationalAttainments != null) {
                        Iterator<T> it4 = educationalAttainments.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next = it4.next();
                                if (kotlin.jvm.internal.j.b(((EducationalAttainment) next).getCode(), educationalAttainment2)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        educationalAttainment = (EducationalAttainment) next;
                    } else {
                        educationalAttainment = null;
                    }
                    if (educationalAttainment != null) {
                        ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get())).q2(educationalAttainment);
                    }
                }
                AlternativeMobile alternativeMobile = it.getAlternativeMobile();
                String mobileNumber = alternativeMobile != null ? alternativeMobile.getMobileNumber() : null;
                AlternativeLandline alternativeLandline = it.getAlternativeLandline();
                String landlineNumber = alternativeLandline != null ? alternativeLandline.getLandlineNumber() : null;
                String strT = mobileNumber != null ? zj.z.t(mobileNumber, "+", "") : null;
                if (strT != null && strT.length() != 0 && mVar.p(UpdateProfileFieldType.ALTERNATE_CONTACT, strT) == null) {
                    MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment2 = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get());
                    mayaUserProfileUpdateFragment2.getClass();
                    mayaUserProfileUpdateFragment2.X1().getInputEditText().setText(strT);
                } else if (landlineNumber != null && landlineNumber.length() != 0 && mVar.p(UpdateProfileFieldType.ALTERNATE_CONTACT, landlineNumber) == null) {
                    MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment3 = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get());
                    mayaUserProfileUpdateFragment3.getClass();
                    mayaUserProfileUpdateFragment3.X1().getInputEditText().setText(landlineNumber);
                }
                ContactName mothersMaidenName = it.getMothersMaidenName();
                if (mothersMaidenName != null) {
                    MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment4 = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get());
                    mayaUserProfileUpdateFragment4.getClass();
                    String firstName = mothersMaidenName.getFirstName();
                    if (firstName != null) {
                        mayaUserProfileUpdateFragment4.s2(mayaUserProfileUpdateFragment4.d2(), firstName);
                    }
                    String middleName = mothersMaidenName.getMiddleName();
                    if (middleName != null) {
                        mayaUserProfileUpdateFragment4.s2(mayaUserProfileUpdateFragment4.f2(), middleName);
                    }
                    String lastName = mothersMaidenName.getLastName();
                    if (lastName != null) {
                        mayaUserProfileUpdateFragment4.s2(mayaUserProfileUpdateFragment4.e2(), lastName);
                    }
                    Boolean hasNoMiddleName = mothersMaidenName.getHasNoMiddleName();
                    if (hasNoMiddleName != null) {
                        mayaUserProfileUpdateFragment4.g2().setChecked(hasNoMiddleName.booleanValue());
                    }
                }
                if (S5.c.b(mVar.f19914k, A5.b.f112j1)) {
                    ProfileTin tin = it.getTin();
                    String number = tin != null ? tin.getNumber() : null;
                    ProfileTin sss = it.getSss();
                    String number2 = sss != null ? sss.getNumber() : null;
                    if (number != null && number.length() != 0 && mVar.p(UpdateProfileFieldType.TIN, number) == null) {
                        MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment5 = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get());
                        ((N5.T0) mayaUserProfileUpdateFragment5.G1()).f3935u.setVisibility(8);
                        MayaProfileInputLayout mayaProfileInputLayout = mayaUserProfileUpdateFragment5.f14270e0;
                        if (mayaProfileInputLayout == null) {
                            kotlin.jvm.internal.j.n("mInputTin");
                            throw null;
                        }
                        mayaProfileInputLayout.setVisibility(0);
                        MayaProfileInputLayout mayaProfileInputLayout2 = ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get())).f14270e0;
                        if (mayaProfileInputLayout2 == null) {
                            kotlin.jvm.internal.j.n("mInputTin");
                            throw null;
                        }
                        mayaProfileInputLayout2.getInputEditText().setText(number);
                    }
                    if (number2 != null && number2.length() != 0 && mVar.p(UpdateProfileFieldType.SSS, number2) == null) {
                        MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment6 = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get());
                        ((N5.T0) mayaUserProfileUpdateFragment6.G1()).f3934t.setVisibility(8);
                        mayaUserProfileUpdateFragment6.c2().setVisibility(0);
                        MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment7 = (MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get());
                        mayaUserProfileUpdateFragment7.getClass();
                        mayaUserProfileUpdateFragment7.c2().getInputEditText().setText(number2);
                    }
                } else {
                    ProfileTin tin2 = it.getTin();
                    String number3 = tin2 != null ? tin2.getNumber() : null;
                    if (number3 != null && number3.length() != 0 && mVar.p(UpdateProfileFieldType.TIN, number3) == null) {
                        MayaProfileInputLayout mayaProfileInputLayout3 = ((MayaUserProfileUpdateFragment) ((InterfaceC2394e) mVar.c.get())).f14270e0;
                        if (mayaProfileInputLayout3 == null) {
                            kotlin.jvm.internal.j.n("mInputTin");
                            throw null;
                        }
                        mayaProfileInputLayout3.getInputEditText().setText(number3);
                    }
                }
                ((MayaBaseFragment) ((InterfaceC2394e) ((rc.m) this.f19463b).c.get())).w1();
                return;
            case 5:
                MayaUpdateProfileData mayaUpdateProfileData = (MayaUpdateProfileData) obj;
                kotlin.jvm.internal.j.g(mayaUpdateProfileData, "mayaUpdateProfileData");
                WorkDetails workDetails = mayaUpdateProfileData.getWorkDetails();
                if (workDetails != null) {
                    rc.o oVar = (rc.o) this.f19463b;
                    oVar.getClass();
                    String workNature = workDetails.getWorkNature();
                    if (workNature != null) {
                        oVar.r(workNature);
                    }
                    String jobTitle = workDetails.getJobTitle();
                    if (jobTitle != null) {
                        UpdateProfileCmsContentData updateProfileCmsContentData4 = oVar.f19930n;
                        Object obj2 = null;
                        if (updateProfileCmsContentData4 == null) {
                            kotlin.jvm.internal.j.n("updateProfileCmsContentData");
                            throw null;
                        }
                        List<JobTitle> jobTitles = updateProfileCmsContentData4.getJobTitles();
                        if (jobTitles != null) {
                            Iterator<T> it5 = jobTitles.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    Object next4 = it5.next();
                                    if (zj.z.o(((JobTitle) next4).getName(), jobTitle, true)) {
                                        obj2 = next4;
                                    }
                                }
                            }
                            JobTitle jobTitle2 = (JobTitle) obj2;
                            if (jobTitle2 != null) {
                                ((MayaUserUpdateWorkDetailsFragment) ((wc.f) oVar.c.get())).j2(jobTitle2);
                            }
                        }
                    }
                    String incomeSource = workDetails.getIncomeSource();
                    if (incomeSource != null) {
                        oVar.q(incomeSource);
                    }
                    String employmentDetails = workDetails.getEmploymentDetails();
                    if (employmentDetails != null) {
                        ((MayaUserUpdateWorkDetailsFragment) ((wc.f) oVar.c.get())).X1().getInputEditText().setText(employmentDetails);
                    }
                    String monthlyIncome = workDetails.getMonthlyIncome();
                    if (monthlyIncome != null) {
                        MayaUserUpdateWorkDetailsFragment mayaUserUpdateWorkDetailsFragment = (MayaUserUpdateWorkDetailsFragment) ((wc.f) oVar.c.get());
                        mayaUserUpdateWorkDetailsFragment.getClass();
                        mayaUserUpdateWorkDetailsFragment.Z1().getInputEditText().requestFocus();
                        mayaUserUpdateWorkDetailsFragment.Z1().getInputEditText().setText(AbstractC2250a.a(monthlyIncome));
                        mayaUserUpdateWorkDetailsFragment.a2().requestFocus();
                    }
                }
                ((MayaBaseFragment) ((wc.f) ((rc.o) this.f19463b).c.get())).w1();
                return;
            case 6:
                Profile profile = (Profile) obj;
                kotlin.jvm.internal.j.g(profile, "profile");
                A7.j jVar = (A7.j) this.f19463b;
                String strMEddStatus = profile.mEddStatus();
                if (strMEddStatus == null || strMEddStatus.length() == 0) {
                    FragmentActivity activity = ((EDDIntroFragment) ((yd.h) jVar.c.get())).getActivity();
                    kotlin.jvm.internal.j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.ekyc.view.activity.impl.EDDActivity");
                    EDDActivity eDDActivity = (EDDActivity) activity;
                    eDDActivity.e.getClass();
                    B5.i.j(eDDActivity);
                    return;
                }
                return;
            case 7:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                Lb.a aVar = (Lb.a) this.f19463b;
                PayMayaError payMayaErrorF2 = aVar.f(throwable, false);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "paymayaErrorHandling(...)");
                if (payMayaErrorF2.isSessionTimeout()) {
                    return;
                }
                ((BaseFragment) ((yd.k) aVar.c.get())).o1(AbstractC2329d.h(12));
                EDDSubmissionReviewFragment eDDSubmissionReviewFragment = (EDDSubmissionReviewFragment) ((yd.k) aVar.c.get());
                eDDSubmissionReviewFragment.getClass();
                zd.r rVar = eDDSubmissionReviewFragment.f14553T;
                if (rVar != null) {
                    ((EDDActivity) rVar).y1(payMayaErrorF2);
                    return;
                }
                return;
            case 8:
                PushNotification pushNotification = (PushNotification) obj;
                kotlin.jvm.internal.j.g(pushNotification, "pushNotification");
                C0922a c0922a = (C0922a) this.f19463b;
                c0922a.getClass();
                String strMStatus = ((ShopPurchaseHistoryPushNotification) pushNotification).mStatus();
                if (C1110A.v(((ShopV3Fragment) ((ve.b) c0922a.c.get())).f14789f0, strMStatus)) {
                    return;
                }
                ShopV3Fragment shopV3Fragment = (ShopV3Fragment) ((ve.b) c0922a.c.get());
                String str = shopV3Fragment.f14789f0.isEmpty() ? null : (String) shopV3Fragment.f14789f0.get(0);
                boolean z4 = str == null || C2576A.H(str);
                if ("DISBURSEMENT_SUCCESSFUL".equalsIgnoreCase(strMStatus)) {
                    final ShopV3Fragment shopV3Fragment2 = (ShopV3Fragment) ((ve.b) c0922a.c.get());
                    shopV3Fragment2.getClass();
                    final int i = 1;
                    Runnable runnable = new Runnable() { // from class: we.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    ShopV3Fragment shopV3Fragment3 = shopV3Fragment2;
                                    D1 d12 = shopV3Fragment3.f14791h0;
                                    kotlin.jvm.internal.j.d(d12);
                                    CardView cardView = ((A1) d12.f).f3548b;
                                    D1 d13 = shopV3Fragment3.f14791h0;
                                    kotlin.jvm.internal.j.d(d13);
                                    ConstraintLayout containerPmaFragmentShopV3 = (ConstraintLayout) d13.c;
                                    kotlin.jvm.internal.j.f(containerPmaFragmentShopV3, "containerPmaFragmentShopV3");
                                    AbstractC1228q.c(cardView, containerPmaFragmentShopV3, new C2417f(shopV3Fragment3, 1));
                                    break;
                                default:
                                    ShopV3Fragment shopV3Fragment4 = shopV3Fragment2;
                                    D1 d14 = shopV3Fragment4.f14791h0;
                                    kotlin.jvm.internal.j.d(d14);
                                    CardView cardView2 = ((A1) d14.e).f3548b;
                                    D1 d15 = shopV3Fragment4.f14791h0;
                                    kotlin.jvm.internal.j.d(d15);
                                    ConstraintLayout containerPmaFragmentShopV32 = (ConstraintLayout) d15.c;
                                    kotlin.jvm.internal.j.f(containerPmaFragmentShopV32, "containerPmaFragmentShopV3");
                                    AbstractC1228q.c(cardView2, containerPmaFragmentShopV32, new C2417f(shopV3Fragment4, 2));
                                    break;
                            }
                        }
                    };
                    shopV3Fragment2.f14789f0.add("DISBURSEMENT_SUCCESSFUL");
                    shopV3Fragment2.f14790g0.add(runnable);
                    if (z4) {
                        ((ShopV3Fragment) ((ve.b) c0922a.c.get())).A1();
                        return;
                    }
                    return;
                }
                if ("KYUUBI_PENDING".equalsIgnoreCase(strMStatus)) {
                    final ShopV3Fragment shopV3Fragment3 = (ShopV3Fragment) ((ve.b) c0922a.c.get());
                    shopV3Fragment3.getClass();
                    final int i4 = 0;
                    Runnable runnable2 = new Runnable() { // from class: we.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    ShopV3Fragment shopV3Fragment32 = shopV3Fragment3;
                                    D1 d12 = shopV3Fragment32.f14791h0;
                                    kotlin.jvm.internal.j.d(d12);
                                    CardView cardView = ((A1) d12.f).f3548b;
                                    D1 d13 = shopV3Fragment32.f14791h0;
                                    kotlin.jvm.internal.j.d(d13);
                                    ConstraintLayout containerPmaFragmentShopV3 = (ConstraintLayout) d13.c;
                                    kotlin.jvm.internal.j.f(containerPmaFragmentShopV3, "containerPmaFragmentShopV3");
                                    AbstractC1228q.c(cardView, containerPmaFragmentShopV3, new C2417f(shopV3Fragment32, 1));
                                    break;
                                default:
                                    ShopV3Fragment shopV3Fragment4 = shopV3Fragment3;
                                    D1 d14 = shopV3Fragment4.f14791h0;
                                    kotlin.jvm.internal.j.d(d14);
                                    CardView cardView2 = ((A1) d14.e).f3548b;
                                    D1 d15 = shopV3Fragment4.f14791h0;
                                    kotlin.jvm.internal.j.d(d15);
                                    ConstraintLayout containerPmaFragmentShopV32 = (ConstraintLayout) d15.c;
                                    kotlin.jvm.internal.j.f(containerPmaFragmentShopV32, "containerPmaFragmentShopV3");
                                    AbstractC1228q.c(cardView2, containerPmaFragmentShopV32, new C2417f(shopV3Fragment4, 2));
                                    break;
                            }
                        }
                    };
                    shopV3Fragment3.f14789f0.add("KYUUBI_PENDING");
                    shopV3Fragment3.f14790g0.add(runnable2);
                    if (z4) {
                        ((ShopV3Fragment) ((ve.b) c0922a.c.get())).A1();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ShopProviderBase it6 = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(it6, "it");
                ((Xb.h) this.f19463b).l(it6.getData());
                return;
            case 10:
                kotlin.jvm.internal.j.g((Throwable) obj, "it");
                InterfaceC2428q interfaceC2428q = ((ShopV3PaymentFragment) ((ve.e) ((se.f) this.f19463b).c.get())).f14815d0;
                if (interfaceC2428q != null) {
                    ((ShopV3Activity) interfaceC2428q).finish();
                    return;
                }
                return;
            case 11:
                kotlin.jvm.internal.j.g((List) obj, "it");
                ((ShopV3ProviderProductsListFragment) ((ve.f) ((se.i) this.f19463b).c.get())).f14840i0++;
                return;
            case 12:
                List p02 = (List) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                ((se.l) this.f19463b).n(p02);
                return;
        }
    }

    public Long j(fi.b bVar) {
        Long lValueOf;
        long j = bVar.f16762d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bVar.f16760a);
        sb2.append(Global.COLON);
        String str = bVar.f16761b;
        if (str == null) {
            str = "UNKNOWN";
        }
        sb2.append(str);
        sb2.append(Global.COLON);
        String str2 = bVar.c;
        if (str2 == null) {
            str2 = "UNKNOWN";
        }
        sb2.append(str2);
        sb2.append(Global.COLON);
        String str3 = bVar.e;
        sb2.append(str3 != null ? str3 : "UNKNOWN");
        sb2.append(Global.COLON);
        Long l6 = bVar.f;
        sb2.append(Long.valueOf(l6 == null ? 0L : l6.longValue()));
        String string = sb2.toString();
        Long lValueOf2 = Long.valueOf(AbstractC0617a.G(string.length(), 0, string));
        long jLongValue = lValueOf2.longValue();
        C2151a c2151a = (C2151a) this.f19463b;
        C2152b c2152b = (C2152b) c2151a.f19708b;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) c2151a.c;
        reentrantReadWriteLock.readLock().lock();
        try {
            try {
                lValueOf = (Long) c2152b.get(lValueOf2);
            } catch (Exception e) {
                C2151a.d("Error while getting value from cache", e);
            }
            if (lValueOf == null) {
                lValueOf = null;
            }
            InterfaceC2153c interfaceC2153c = (InterfaceC2153c) c2151a.f19707a;
            if (lValueOf == null) {
                reentrantReadWriteLock.readLock().unlock();
                reentrantReadWriteLock.writeLock().lock();
                try {
                    try {
                        lValueOf = (Long) c2152b.get(lValueOf2);
                    } catch (Exception e7) {
                        C2151a.d("Error while getting value from cache", e7);
                    }
                    if (lValueOf == null) {
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        try {
                            ImpressionsObserverCacheEntity impressionsObserverCacheEntity = ((ImpressionsObserverCacheDao) ((X2.e) interfaceC2153c).f6481b).get(Long.valueOf(jLongValue));
                            lValueOf = impressionsObserverCacheEntity == null ? null : Long.valueOf(impressionsObserverCacheEntity.getTime());
                        } catch (Exception e10) {
                            C2151a.d("Error while getting value from persistent storage", e10);
                            lValueOf = null;
                        }
                        if (lValueOf != null) {
                            try {
                                c2152b.put(lValueOf2, lValueOf);
                            } catch (Exception e11) {
                                C2151a.d("Error while putting value in cache", e11);
                            }
                        } else {
                            reentrantReadWriteLock.writeLock().unlock();
                            lValueOf = null;
                        }
                    }
                } finally {
                }
            }
            long jLongValue2 = lValueOf2.longValue();
            reentrantReadWriteLock.writeLock().lock();
            try {
                try {
                    ((C2152b) c2151a.f19708b).put(lValueOf2, Long.valueOf(j));
                } catch (Exception e12) {
                    C2151a.d("Error while putting value in cache", e12);
                }
                try {
                    ((ConcurrentHashMap) ((X2.e) interfaceC2153c).f6482d).put(Long.valueOf(jLongValue2), Long.valueOf(j));
                } catch (Exception e13) {
                    C2151a.d("Error while putting value in persistent storage", e13);
                }
                if (lValueOf == null) {
                    return null;
                }
                return Long.valueOf(Math.min(lValueOf.longValue(), j));
            } finally {
            }
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack
    public void onFail(int i, String str, String str2) {
        char c;
        int i4 = 2;
        int i6 = 1;
        MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment = (MayaMfaFaceAuthFragment) this.f19463b;
        mayaMfaFaceAuthFragment.f12937Y = false;
        A7.j jVarL1 = mayaMfaFaceAuthFragment.L1();
        String str3 = str == null ? "" : str;
        if (jVarL1.g()) {
            MfaTencentErrorResult mfaTencentErrorResult = new MfaTencentErrorResult(i, str3);
            if (mfaTencentErrorResult.isTencentErrorUserStops()) {
                y9.b bVar = ((MayaMfaFaceAuthFragment) ((x9.a) jVarL1.c.get())).f12936X;
                if (bVar != null) {
                    ((MayaMfaActivity) bVar).a2();
                }
                MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment2 = (MayaMfaFaceAuthFragment) ((x9.a) jVarL1.c.get());
                C1229s c1229s = mayaMfaFaceAuthFragment2.f12939a0;
                if (c1229s == null) {
                    kotlin.jvm.internal.j.n("mAuthAnalyticsUtils");
                    throw null;
                }
                FragmentActivity fragmentActivityRequireActivity = mayaMfaFaceAuthFragment2.requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                String strM = AbstractC1213b.m(3);
                kotlin.jvm.internal.j.f(strM, "tapped(...)");
                MfaMeta mfaMetaM1 = mayaMfaFaceAuthFragment2.M1();
                String sourceScreen = mfaMetaM1 != null ? mfaMetaM1.getSourceScreen() : null;
                EnumC1212a enumC1212a = EnumC1212a.TYPE;
                MfaMeta mfaMetaM12 = mayaMfaFaceAuthFragment2.M1();
                String method = mfaMetaM12 != null ? mfaMetaM12.getMethod() : null;
                if (method == null) {
                    method = "";
                }
                Pair pair = new Pair(enumC1212a, method);
                EnumC1212a enumC1212a2 = EnumC1212a.PURPOSE;
                MfaMeta mfaMetaM13 = mayaMfaFaceAuthFragment2.M1();
                String transactionType = mfaMetaM13 != null ? mfaMetaM13.getTransactionType() : null;
                if (transactionType == null) {
                    transactionType = "";
                }
                Pair pair2 = new Pair(enumC1212a2, transactionType);
                EnumC1212a enumC1212a3 = EnumC1212a.CHALLENGE_ID;
                MfaMeta mfaMetaM14 = mayaMfaFaceAuthFragment2.M1();
                String challengeId = mfaMetaM14 != null ? mfaMetaM14.getChallengeId() : null;
                C1229s.c(c1229s, fragmentActivityRequireActivity, strM, "Tencent Face Auth Screen", sourceScreen, "Cancel", null, null, cj.M.h(pair, pair2, new Pair(enumC1212a3, challengeId != null ? challengeId : "")), 96);
                return;
            }
            if (mfaTencentErrorResult.getShouldBypassTencentRealtimeFaceComparison()) {
                y9.b bVar2 = ((MayaMfaFaceAuthFragment) ((x9.a) jVarL1.c.get())).f12936X;
                MFAChallengeInformationV2 mFAChallengeInformationV2 = bVar2 != null ? ((MayaMfaActivity) bVar2).f12929p : null;
                jVarL1.w(mFAChallengeInformationV2 != null ? mFAChallengeInformationV2.getTencentToken() : null);
                return;
            }
            MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment3 = (MayaMfaFaceAuthFragment) ((x9.a) jVarL1.c.get());
            mayaMfaFaceAuthFragment3.getClass();
            y9.b bVar3 = mayaMfaFaceAuthFragment3.f12936X;
            if (bVar3 != null) {
                A7.j jVarZ1 = ((MayaMfaActivity) bVar3).Z1();
                if (mfaTencentErrorResult.isTencentErrorFaceDetectionTimeout()) {
                    v9.a aVar = (v9.a) jVarZ1.c.get();
                    String strS = AbstractC1213b.s(5);
                    kotlin.jvm.internal.j.f(strS, "viewed(...)");
                    c = 0;
                    ((MayaMfaActivity) aVar).f2(strS, "Tencent Face Auth Screen", cj.M.h(new Pair(EnumC1212a.SCREEN_NAME, "Tencent Face Auth Screen"), new Pair(EnumC1212a.CHALLENGE_ID, ((MayaMfaActivity) ((v9.a) jVarZ1.c.get())).Y1())));
                    MayaMfaActivity mayaMfaActivity = (MayaMfaActivity) ((v9.a) jVarZ1.c.get());
                    String string = mayaMfaActivity.getString(R.string.maya_label_face_auth_retry_error_title);
                    String string2 = mayaMfaActivity.getString(R.string.maya_label_face_timeout_error_spiel);
                    kotlin.jvm.internal.j.f(string2, "getString(...)");
                    MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231273, string, string2, mayaMfaActivity.getString(R.string.maya_label_face_auth_button_retry), mayaMfaActivity.getString(R.string.maya_label_close), false, null, null, false, 480);
                    mayaErrorDialogFragmentZ.f11852e0 = new w9.e(mayaMfaActivity, mayaErrorDialogFragmentZ, i6);
                    mayaErrorDialogFragmentZ.f11851d0 = new w9.j(mayaMfaActivity, mayaErrorDialogFragmentZ, i4);
                    mayaErrorDialogFragmentZ.f11850c0 = new w9.h(mayaMfaActivity);
                    FragmentManager supportFragmentManager = mayaMfaActivity.getSupportFragmentManager();
                    kotlin.jvm.internal.j.f(supportFragmentManager, "getSupportFragmentManager(...)");
                    AbstractC0983W.D(mayaErrorDialogFragmentZ, supportFragmentManager, "alert_dialog");
                } else {
                    c = 0;
                    if (mfaTencentErrorResult.isTencentErrorInitFailure()) {
                        MayaMfaActivity mayaMfaActivity2 = (MayaMfaActivity) ((v9.a) jVarZ1.c.get());
                        mayaMfaActivity2.getClass();
                        MayaErrorDialogFragment mayaErrorDialogFragmentZ2 = M2.b.Z(2131231347, mayaMfaActivity2.getString(R.string.maya_label_face_init_error_title), mayaMfaActivity2.getString(R.string.maya_label_face_init_error_spiel), mayaMfaActivity2.getString(R.string.maya_label_face_auth_button_got_it), null, false, null, null, false, 464);
                        mayaErrorDialogFragmentZ2.f11852e0 = new N9.g(mayaMfaActivity2, mayaErrorDialogFragmentZ2, mfaTencentErrorResult, 4);
                        mayaErrorDialogFragmentZ2.f11850c0 = new w9.k(mayaMfaActivity2, i4);
                        FragmentManager supportFragmentManager2 = mayaMfaActivity2.getSupportFragmentManager();
                        kotlin.jvm.internal.j.f(supportFragmentManager2, "getSupportFragmentManager(...)");
                        AbstractC0983W.D(mayaErrorDialogFragmentZ2, supportFragmentManager2, "alert_dialog");
                        ((MayaMfaActivity) ((v9.a) jVarZ1.c.get())).f2("MFA_FACE_SCREEN_TENCENT_ERROR_VIEWED", "Tencent Face Auth Screen", cj.M.h(new Pair(EnumC1212a.SCREEN_NAME, "Tencent Error (Dialog)"), new Pair(EnumC1212a.CHALLENGE_ID, ((MayaMfaActivity) ((v9.a) jVarZ1.c.get())).Y1())));
                    } else if (mfaTencentErrorResult.isTencentErrorGeneric()) {
                        MayaMfaActivity mayaMfaActivity3 = (MayaMfaActivity) ((v9.a) jVarZ1.c.get());
                        MayaErrorDialogFragment mayaErrorDialogFragmentZ3 = M2.b.Z(2131231273, mayaMfaActivity3.getString(R.string.maya_label_face_generic_error_title), mayaMfaActivity3.getString(R.string.maya_label_face_generic_error_spiel), mayaMfaActivity3.getString(R.string.maya_label_face_auth_button_got_it), null, false, null, null, false, 464);
                        mayaErrorDialogFragmentZ3.f11852e0 = new w9.b(mayaMfaActivity3, i6);
                        mayaErrorDialogFragmentZ3.f11850c0 = new w9.i(mayaMfaActivity3, i4);
                        FragmentManager supportFragmentManager3 = mayaMfaActivity3.getSupportFragmentManager();
                        kotlin.jvm.internal.j.f(supportFragmentManager3, "getSupportFragmentManager(...)");
                        AbstractC0983W.D(mayaErrorDialogFragmentZ3, supportFragmentManager3, "alert_dialog");
                    } else if (mfaTencentErrorResult.isTencentErrorFromAppSwitch()) {
                        ((MayaMfaActivity) ((v9.a) jVarZ1.c.get())).a2();
                    } else {
                        ((MayaMfaActivity) ((v9.a) jVarZ1.c.get())).g2(null);
                    }
                }
            } else {
                c = 0;
            }
            x9.a aVar2 = (x9.a) jVarL1.c.get();
            String code = String.valueOf(mfaTencentErrorResult.getErrorCode());
            String reason = mfaTencentErrorResult.getErrorString();
            MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment4 = (MayaMfaFaceAuthFragment) aVar2;
            mayaMfaFaceAuthFragment4.getClass();
            kotlin.jvm.internal.j.g(code, "code");
            kotlin.jvm.internal.j.g(reason, "reason");
            C1229s c1229s2 = mayaMfaFaceAuthFragment4.f12939a0;
            if (c1229s2 == null) {
                kotlin.jvm.internal.j.n("mAuthAnalyticsUtils");
                throw null;
            }
            FragmentActivity fragmentActivityRequireActivity2 = mayaMfaFaceAuthFragment4.requireActivity();
            kotlin.jvm.internal.j.f(fragmentActivityRequireActivity2, "requireActivity(...)");
            String strF = AbstractC1213b.f(1);
            kotlin.jvm.internal.j.f(strF, "failure(...)");
            EnumC1212a enumC1212a4 = EnumC1212a.PURPOSE;
            MfaMeta mfaMetaM15 = mayaMfaFaceAuthFragment4.M1();
            Pair pair3 = new Pair(enumC1212a4, mfaMetaM15 != null ? mfaMetaM15.getTransactionType() : null);
            Pair pair4 = new Pair(EnumC1212a.CODE, code);
            Pair pair5 = new Pair(EnumC1212a.REASON, reason);
            Pair[] pairArr = new Pair[3];
            pairArr[c] = pair3;
            pairArr[1] = pair4;
            pairArr[2] = pair5;
            c1229s2.b(fragmentActivityRequireActivity2, strF, cj.M.h(pairArr));
        }
    }

    @Override // com.tencent.could.huiyansdk.overseas.HuiYanOsAuthCallBack
    public void onSuccess(HuiYanOsAuthResult huiYanOsAuthResult) {
        MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment = (MayaMfaFaceAuthFragment) this.f19463b;
        mayaMfaFaceAuthFragment.f12937Y = false;
        if (huiYanOsAuthResult != null) {
            A7.j jVarL1 = mayaMfaFaceAuthFragment.L1();
            String token = huiYanOsAuthResult.token;
            kotlin.jvm.internal.j.f(token, "token");
            jVarL1.w(token);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ((v3.d) this.f19463b).getClass();
        return Tasks.forResult((List) obj);
    }

    public /* synthetic */ C2070f1(v3.d dVar, int i, int i4) {
        this.f19462a = 15;
        this.f19463b = dVar;
    }

    public C2070f1(InterfaceC2153c interfaceC2153c) {
        this.f19462a = 1;
        this.f19463b = new C2151a(interfaceC2153c);
    }

    public C2070f1() {
        this.f19462a = 18;
        this.f19463b = new ThreadLocal();
    }
}
