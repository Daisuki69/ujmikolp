package Lb;

import Ah.p;
import Kh.T;
import Lh.h;
import N5.E;
import R4.i;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import cj.C1110A;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.P;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.EDD;
import com.paymaya.domain.model.EDDFinancialDocument;
import com.paymaya.domain.model.EDDUsage;
import com.paymaya.domain.model.Ekyc;
import com.paymaya.domain.model.EkycAdditionalDocument;
import com.paymaya.domain.model.EkycIdentification;
import com.paymaya.domain.model.FinancialDocument;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.OngoingRegistration;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1257f;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1269l;
import com.paymaya.domain.store.C1276o0;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.C1279q;
import com.paymaya.domain.store.C1290w;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.E0;
import com.paymaya.domain.store.L0;
import com.paymaya.domain.store.O;
import com.paymaya.domain.store.O0;
import com.paymaya.domain.store.S;
import com.paymaya.domain.store.S0;
import com.paymaya.domain.store.U;
import com.paymaya.domain.store.W0;
import com.paymaya.domain.store.Y;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginOTPFragment;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountProvisionFragment;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDApplicationDetailsFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSubmissionReviewFragment;
import com.paymaya.ui.ekyc.view.widget.FinancialDocumentPhoto;
import d4.AbstractC1331a;
import db.InterfaceC1349b;
import eb.l;
import g9.InterfaceC1508c;
import h9.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import zd.r;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC2509a implements y5.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2941d = 2;
    public final Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2942g;
    public Object h;

    public a(C1269l c1269l, com.paymaya.data.preference.a aVar) {
        this.e = c1269l;
        this.f = aVar;
    }

    @Override // y5.e
    public void b() {
        ((MayaBaseFragment) ((InterfaceC1508c) this.c.get())).E1();
        Bundle arguments = ((MayaLoginOTPFragment) ((InterfaceC1508c) this.c.get())).getArguments();
        String string = arguments != null ? arguments.getString("challenge_id") : null;
        if (string == null || string.length() == 0) {
            return;
        }
        p<MFAChallengeInformation> pVarResendMFAChallenge = ((C1278p0) this.e).f11471b.resendMFAChallenge(string);
        new T(5, new Lh.d(AbstractC1331a.l(pVarResendMFAChallenge, pVarResendMFAChallenge, zh.b.a()), new i(this, 15), 0), new Z8.d(this, 0)).e();
    }

    @Override // y5.e
    public void c() {
        String strL1 = ((MayaLoginOTPFragment) ((InterfaceC1508c) this.c.get())).L1();
        if (strL1.length() == 0) {
            MayaLoginOTPFragment mayaLoginOTPFragment = (MayaLoginOTPFragment) ((InterfaceC1508c) this.c.get());
            k kVar = mayaLoginOTPFragment.f12790k0;
            if (kVar != null) {
                kVar.o(mayaLoginOTPFragment.getString(R.string.maya_error_title_verification_code), mayaLoginOTPFragment.getString(R.string.maya_error_otp_missing));
                return;
            }
            return;
        }
        if (strL1.length() < 6) {
            MayaLoginOTPFragment mayaLoginOTPFragment2 = (MayaLoginOTPFragment) ((InterfaceC1508c) this.c.get());
            k kVar2 = mayaLoginOTPFragment2.f12790k0;
            if (kVar2 != null) {
                kVar2.o(mayaLoginOTPFragment2.getString(R.string.maya_error_title_verification_code), mayaLoginOTPFragment2.getString(R.string.maya_error_otp_invalid));
                return;
            }
            return;
        }
        ((MayaBaseFragment) ((InterfaceC1508c) this.c.get())).E1();
        Bundle arguments = ((MayaLoginOTPFragment) ((InterfaceC1508c) this.c.get())).getArguments();
        String string = arguments != null ? arguments.getString("transaction_type") : null;
        Bundle arguments2 = ((MayaLoginOTPFragment) ((InterfaceC1508c) this.c.get())).getArguments();
        String string2 = arguments2 != null ? arguments2.getString("challenge_id") : null;
        if (string == null || C2576A.H(string) || string2 == null || C2576A.H(string2)) {
            return;
        }
        p pVarB = ((C1278p0) this.e).b(string, string2, ((MayaLoginOTPFragment) ((InterfaceC1508c) this.c.get())).L1());
        Y.e eVar = new Y.e(5, this, string2);
        pVarB.getClass();
        new Lh.d(new Lh.d(pVarB, eVar, 2), new Qd.a(this, 18), 0).e();
    }

    @Override // y5.e
    public long d() {
        return ((com.paymaya.data.preference.a) this.f).e().mResendCodeCountdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07dc  */
    @Override // y5.AbstractC2509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            Method dump skipped, instruction units count: 3200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lb.a.j():void");
    }

    public void k(boolean z4) {
        if (z4) {
            E e = ((MayaAccountProvisionFragment) ((InterfaceC1349b) this.c.get())).f13682V;
            j.d(e);
            ((Group) e.f3590l).setVisibility(0);
        } else {
            E e7 = ((MayaAccountProvisionFragment) ((InterfaceC1349b) this.c.get())).f13682V;
            j.d(e7);
            ((Group) e7.f3590l).setVisibility(8);
        }
    }

    public void l() {
        String strS1;
        String strS12;
        String strS13;
        String purpose;
        r rVar = ((EDDSubmissionReviewFragment) ((yd.k) this.c.get())).f14553T;
        EDD edd = rVar != null ? ((EDDActivity) rVar).t1().i : null;
        j.d(edd);
        edd.setMsisdn(((com.paymaya.data.preference.a) this.f).r());
        EDDUsage usage = edd.getUsage();
        if (usage != null) {
            yd.k kVar = (yd.k) this.c.get();
            String usage2 = usage.getName();
            EDDSubmissionReviewFragment eDDSubmissionReviewFragment = (EDDSubmissionReviewFragment) kVar;
            eDDSubmissionReviewFragment.getClass();
            j.g(usage2, "usage");
            TextView textView = eDDSubmissionReviewFragment.mPrimaryUsageTextView;
            if (textView == null) {
                j.n("mPrimaryUsageTextView");
                throw null;
            }
            textView.setText(usage2);
            String remitTo = usage.getRemitTo();
            if ((remitTo == null || C2576A.H(remitTo)) && ((purpose = usage.getPurpose()) == null || C2576A.H(purpose))) {
                Group group = ((EDDSubmissionReviewFragment) ((yd.k) this.c.get())).mPrimaryUsageOptionalGroup;
                if (group == null) {
                    j.n("mPrimaryUsageOptionalGroup");
                    throw null;
                }
                group.setVisibility(8);
            } else {
                yd.k kVar2 = (yd.k) this.c.get();
                String remitTo2 = usage.getRemitTo();
                TextView textView2 = ((EDDSubmissionReviewFragment) kVar2).mRemittanceTextView;
                if (textView2 == null) {
                    j.n("mRemittanceTextView");
                    throw null;
                }
                textView2.setText(remitTo2);
                yd.k kVar3 = (yd.k) this.c.get();
                String purpose2 = usage.getPurpose();
                TextView textView3 = ((EDDSubmissionReviewFragment) kVar3).mPurposeTextView;
                if (textView3 == null) {
                    j.n("mPurposeTextView");
                    throw null;
                }
                textView3.setText(purpose2);
                Group group2 = ((EDDSubmissionReviewFragment) ((yd.k) this.c.get())).mPrimaryUsageOptionalGroup;
                if (group2 == null) {
                    j.n("mPrimaryUsageOptionalGroup");
                    throw null;
                }
                group2.setVisibility(0);
            }
        }
        List<String> alternativeIncomeSources = edd.getAlternativeIncomeSources();
        if (alternativeIncomeSources == null || (strS1 = C1110A.F(alternativeIncomeSources, Global.NEWLINE, null, null, null, 62)) == null) {
            strS1 = ((EDDSubmissionReviewFragment) ((yd.k) this.c.get())).s1();
        }
        EDDSubmissionReviewFragment eDDSubmissionReviewFragment2 = (EDDSubmissionReviewFragment) ((yd.k) this.c.get());
        eDDSubmissionReviewFragment2.getClass();
        TextView textView4 = eDDSubmissionReviewFragment2.mIncomeSourceTextView;
        if (textView4 == null) {
            j.n("mIncomeSourceTextView");
            throw null;
        }
        textView4.setText(strS1);
        List<String> relatedCompanies = edd.getRelatedCompanies();
        if (relatedCompanies == null || (strS12 = C1110A.F(relatedCompanies, Global.NEWLINE, null, null, null, 62)) == null) {
            strS12 = ((EDDSubmissionReviewFragment) ((yd.k) this.c.get())).s1();
        }
        EDDSubmissionReviewFragment eDDSubmissionReviewFragment3 = (EDDSubmissionReviewFragment) ((yd.k) this.c.get());
        eDDSubmissionReviewFragment3.getClass();
        TextView textView5 = eDDSubmissionReviewFragment3.mRelatedCompaniesTextView;
        if (textView5 == null) {
            j.n("mRelatedCompaniesTextView");
            throw null;
        }
        textView5.setText(strS12);
        List<String> banks = edd.getBanks();
        if (banks == null || (strS13 = C1110A.F(banks, Global.NEWLINE, null, null, null, 62)) == null) {
            strS13 = ((EDDSubmissionReviewFragment) ((yd.k) this.c.get())).s1();
        }
        EDDSubmissionReviewFragment eDDSubmissionReviewFragment4 = (EDDSubmissionReviewFragment) ((yd.k) this.c.get());
        eDDSubmissionReviewFragment4.getClass();
        TextView textView6 = eDDSubmissionReviewFragment4.mBankInformationTextView;
        if (textView6 == null) {
            j.n("mBankInformationTextView");
            throw null;
        }
        textView6.setText(strS13);
        LinearLayout linearLayout = ((EDDSubmissionReviewFragment) ((yd.k) this.c.get())).mFinancialDocumentsLayout;
        if (linearLayout == null) {
            j.n("mFinancialDocumentsLayout");
            throw null;
        }
        linearLayout.removeAllViews();
        List<EDDFinancialDocument> financialDocuments = edd.getFinancialDocuments();
        List<EDDFinancialDocument> list = financialDocuments;
        if (list == null || list.isEmpty()) {
            EDDSubmissionReviewFragment eDDSubmissionReviewFragment5 = (EDDSubmissionReviewFragment) ((yd.k) this.c.get());
            String string = eDDSubmissionReviewFragment5.getString(R.string.pma_label_na);
            Context contextRequireContext = eDDSubmissionReviewFragment5.requireContext();
            j.f(contextRequireContext, "requireContext(...)");
            FinancialDocumentPhoto financialDocumentPhoto = new FinancialDocumentPhoto(contextRequireContext);
            FinancialDocumentPhoto.b(financialDocumentPhoto, string, null, null, eDDSubmissionReviewFragment5, 4);
            LinearLayout linearLayout2 = eDDSubmissionReviewFragment5.mFinancialDocumentsLayout;
            if (linearLayout2 == null) {
                j.n("mFinancialDocumentsLayout");
                throw null;
            }
            linearLayout2.addView(financialDocumentPhoto);
        } else {
            for (EDDFinancialDocument financialDocument : financialDocuments) {
                EDDSubmissionReviewFragment eDDSubmissionReviewFragment6 = (EDDSubmissionReviewFragment) ((yd.k) this.c.get());
                eDDSubmissionReviewFragment6.getClass();
                j.g(financialDocument, "financialDocument");
                FinancialDocument financialDocument2 = financialDocument.getFinancialDocument();
                String name = financialDocument2 != null ? financialDocument2.getName() : null;
                String fileUrl = financialDocument.getFileUrl();
                Context contextRequireContext2 = eDDSubmissionReviewFragment6.requireContext();
                j.f(contextRequireContext2, "requireContext(...)");
                FinancialDocumentPhoto financialDocumentPhoto2 = new FinancialDocumentPhoto(contextRequireContext2);
                FinancialDocumentPhoto.b(financialDocumentPhoto2, name, fileUrl, null, eDDSubmissionReviewFragment6, 4);
                LinearLayout linearLayout3 = eDDSubmissionReviewFragment6.mFinancialDocumentsLayout;
                if (linearLayout3 == null) {
                    j.n("mFinancialDocumentsLayout");
                    throw null;
                }
                linearLayout3.addView(financialDocumentPhoto2);
            }
        }
        this.h = edd;
    }

    public void m(PayMayaError payMayaError) {
        int iMErrorCode = payMayaError.mErrorCode();
        if (iMErrorCode != -340 && iMErrorCode != -329) {
            MayaLoginOTPFragment mayaLoginOTPFragment = (MayaLoginOTPFragment) ((InterfaceC1508c) this.c.get());
            k kVar = mayaLoginOTPFragment.f12790k0;
            if (kVar != null) {
                kVar.a(payMayaError, mayaLoginOTPFragment.getString(R.string.maya_error_title_verification_code));
                return;
            }
            return;
        }
        MayaLoginOTPFragment mayaLoginOTPFragment2 = (MayaLoginOTPFragment) ((InterfaceC1508c) this.c.get());
        k kVar2 = mayaLoginOTPFragment2.f12790k0;
        if (kVar2 != null) {
            String string = mayaLoginOTPFragment2.getString(R.string.maya_error_otp_invalid);
            j.f(string, "getString(...)");
            kVar2.O(payMayaError, string);
        }
    }

    public void n(boolean z4) {
        EDD eddMEDDInformation;
        EDDUsage usage;
        String remitTo;
        String purpose;
        Ekyc ekyc = (Ekyc) this.h;
        if (ekyc == null || (eddMEDDInformation = ekyc.mEDDInformation()) == null || (usage = eddMEDDInformation.getUsage()) == null || (remitTo = usage.getRemitTo()) == null || C2576A.H(remitTo) || (purpose = usage.getPurpose()) == null || C2576A.H(purpose)) {
            return;
        }
        if (z4) {
            Group group = ((EDDApplicationDetailsFragment) ((yd.c) this.c.get())).mPrimaryUsageOptionalGroup;
            if (group != null) {
                group.setVisibility(0);
                return;
            } else {
                j.n("mPrimaryUsageOptionalGroup");
                throw null;
            }
        }
        Group group2 = ((EDDApplicationDetailsFragment) ((yd.c) this.c.get())).mPrimaryUsageOptionalGroup;
        if (group2 != null) {
            group2.setVisibility(8);
        } else {
            j.n("mPrimaryUsageOptionalGroup");
            throw null;
        }
    }

    public void o(boolean z4) {
        List<EkycIdentification> listMIdList;
        List<EkycAdditionalDocument> listMAdditionalDocuments;
        Ekyc ekyc = (Ekyc) this.h;
        if (ekyc != null && (listMAdditionalDocuments = ekyc.mAdditionalDocuments()) != null) {
            for (EkycAdditionalDocument ekycAdditionalDocument : listMAdditionalDocuments) {
                if ("BIRTH_CERTIFICATE".equals(ekycAdditionalDocument.mType())) {
                    if (z4) {
                        ViewGroup viewGroup = ((EDDApplicationDetailsFragment) ((yd.c) this.c.get())).mViewGroupBirthCertificate;
                        if (viewGroup == null) {
                            j.n("mViewGroupBirthCertificate");
                            throw null;
                        }
                        viewGroup.setVisibility(0);
                    } else {
                        ViewGroup viewGroup2 = ((EDDApplicationDetailsFragment) ((yd.c) this.c.get())).mViewGroupBirthCertificate;
                        if (viewGroup2 == null) {
                            j.n("mViewGroupBirthCertificate");
                            throw null;
                        }
                        viewGroup2.setVisibility(8);
                    }
                } else if ("PARENT_GUARDIAN_ID".equals(ekycAdditionalDocument.mType())) {
                    if (z4) {
                        ViewGroup viewGroup3 = ((EDDApplicationDetailsFragment) ((yd.c) this.c.get())).mViewGroupParentId;
                        if (viewGroup3 == null) {
                            j.n("mViewGroupParentId");
                            throw null;
                        }
                        viewGroup3.setVisibility(0);
                    } else {
                        ViewGroup viewGroup4 = ((EDDApplicationDetailsFragment) ((yd.c) this.c.get())).mViewGroupParentId;
                        if (viewGroup4 == null) {
                            j.n("mViewGroupParentId");
                            throw null;
                        }
                        viewGroup4.setVisibility(8);
                    }
                } else if (!"PARENTAL_CONSENT".equals(ekycAdditionalDocument.mType())) {
                    continue;
                } else if (z4) {
                    ViewGroup viewGroup5 = ((EDDApplicationDetailsFragment) ((yd.c) this.c.get())).mViewGroupParentalConsent;
                    if (viewGroup5 == null) {
                        j.n("mViewGroupParentalConsent");
                        throw null;
                    }
                    viewGroup5.setVisibility(0);
                } else {
                    ViewGroup viewGroup6 = ((EDDApplicationDetailsFragment) ((yd.c) this.c.get())).mViewGroupParentalConsent;
                    if (viewGroup6 == null) {
                        j.n("mViewGroupParentalConsent");
                        throw null;
                    }
                    viewGroup6.setVisibility(8);
                }
            }
        }
        Ekyc ekyc2 = (Ekyc) this.h;
        if (ekyc2 == null || (listMIdList = ekyc2.mIdList()) == null) {
            return;
        }
        if (listMIdList.size() <= 1) {
            listMIdList = null;
        }
        if (listMIdList != null) {
            if (z4) {
                ViewGroup viewGroup7 = ((EDDApplicationDetailsFragment) ((yd.c) this.c.get())).mViewGroupSecondId;
                if (viewGroup7 != null) {
                    viewGroup7.setVisibility(0);
                    return;
                } else {
                    j.n("mViewGroupSecondId");
                    throw null;
                }
            }
            ViewGroup viewGroup8 = ((EDDApplicationDetailsFragment) ((yd.c) this.c.get())).mViewGroupSecondId;
            if (viewGroup8 == null) {
                j.n("mViewGroupSecondId");
                throw null;
            }
            viewGroup8.setVisibility(8);
        }
    }

    public void p() {
        ((MayaBaseFragment) ((InterfaceC1349b) this.c.get())).E1();
        l lVar = ((MayaAccountProvisionFragment) ((InterfaceC1349b) this.c.get())).f13684X;
        OngoingRegistration ongoingRegistration = lVar != null ? ((MayaRegistrationV2Activity) lVar).f13667q : null;
        new Lh.d(new T(5, new Lh.d(new Lh.d(new h(((E0) this.f2942g).a(ongoingRegistration != null ? ongoingRegistration.getRegisteringUser() : null, ongoingRegistration != null ? ongoingRegistration.getRegisteringLoginIdentity() : null, ongoingRegistration != null ? ongoingRegistration.getRegisteringEmailIdentity() : null, ongoingRegistration != null ? ongoingRegistration.getConsentsList() : null), zh.b.a(), 0), new i(this, 6), 2), new T3.l(this, 5), 0), new Xa.c(this, 0)), new Q6.r(this, 7), 1).e();
    }

    public a(U u3, C1276o0 c1276o0, C1290w c1290w) {
        this.f = u3;
        this.e = c1276o0;
        this.f2942g = c1290w;
    }

    public a(com.paymaya.data.preference.a preference, Z0 z02, Y y7, C1257f c1257f) {
        j.g(preference, "preference");
        this.f = preference;
        this.e = z02;
        this.f2942g = y7;
        this.h = c1257f;
    }

    public a(com.paymaya.data.preference.a aVar, C1265j c1265j, C1293x0 c1293x0, S0 s02, Uh.d dVar) {
        super(dVar);
        this.f = aVar;
        this.e = c1265j;
        this.f2942g = c1293x0;
        this.h = s02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C1264i0 c1264i0, C1265j c1265j, Uh.d payMayaErrorPublishSubject) {
        super(payMayaErrorPublishSubject);
        j.g(payMayaErrorPublishSubject, "payMayaErrorPublishSubject");
        this.e = c1265j;
        this.f2942g = new ArrayList();
        this.h = new ArrayList();
    }

    public a(com.paymaya.data.preference.a mPreference, S5.c flagConfigurationService, e0 resourceManager, P partnerOnboardingUtils) {
        j.g(mPreference, "mPreference");
        j.g(flagConfigurationService, "flagConfigurationService");
        j.g(resourceManager, "resourceManager");
        j.g(partnerOnboardingUtils, "partnerOnboardingUtils");
        this.f = mPreference;
        this.e = flagConfigurationService;
        this.f2942g = resourceManager;
        this.h = partnerOnboardingUtils;
    }

    public a(com.paymaya.data.preference.a aVar, W0 w0, C1247a c1247a, Uh.d dVar) {
        super(dVar);
        this.f = aVar;
        this.e = w0;
        this.f2942g = c1247a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(L0 l02, O0 o02, com.paymaya.data.preference.a mPreference, Uh.d mPushNotificationSubject, Uh.d dVar) {
        super(dVar);
        j.g(mPreference, "mPreference");
        j.g(mPushNotificationSubject, "mPushNotificationSubject");
        this.e = l02;
        this.f2942g = o02;
        this.f = mPreference;
        this.h = mPushNotificationSubject;
    }

    public a(Uh.d dVar, com.paymaya.data.preference.a aVar, P p10, E0 e02, S5.c cVar) {
        super(dVar);
        this.f = aVar;
        this.e = p10;
        this.f2942g = e02;
        this.h = cVar;
    }

    public a(com.paymaya.data.preference.a mPreference, C1293x0 c1293x0, C1278p0 c1278p0, C1279q c1279q, S5.c mFlagConfigurationService) {
        j.g(mPreference, "mPreference");
        j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.f = mPreference;
        this.f2942g = c1293x0;
        this.e = c1278p0;
        this.h = mFlagConfigurationService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(O o8, S s9, com.paymaya.data.preference.a mPreference, Uh.d sessionPublishSubject) {
        super(sessionPublishSubject);
        j.g(mPreference, "mPreference");
        j.g(sessionPublishSubject, "sessionPublishSubject");
        this.e = o8;
        this.f2942g = s9;
        this.f = mPreference;
    }
}
