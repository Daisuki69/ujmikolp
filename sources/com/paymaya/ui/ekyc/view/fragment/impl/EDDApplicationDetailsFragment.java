package com.paymaya.ui.ekyc.view.fragment.impl;

import Bd.i;
import Lb.a;
import M5.b;
import M5.d;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.KeyEventDispatcher;
import butterknife.BindView;
import butterknife.OnClick;
import cj.C1110A;
import cj.C1112C;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.database.repository.q;
import com.paymaya.data.database.repository.w;
import com.paymaya.domain.model.Address;
import com.paymaya.domain.model.BirthPlace;
import com.paymaya.domain.model.EDD;
import com.paymaya.domain.model.EDDFinancialDocument;
import com.paymaya.domain.model.EDDUsage;
import com.paymaya.domain.model.Ekyc;
import com.paymaya.domain.model.EkycAdditionalDocument;
import com.paymaya.domain.model.EkycIdentification;
import com.paymaya.domain.model.FinancialDocument;
import com.paymaya.domain.model.Nationality;
import com.paymaya.domain.store.C1276o0;
import com.paymaya.domain.store.C1290w;
import com.paymaya.domain.store.U;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.widget.FinancialDocumentPhoto;
import java.io.File;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.j;
import org.joda.time.format.DateTimeFormatter;
import yd.c;
import zd.InterfaceC2562f;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class EDDApplicationDetailsFragment extends BaseFragment implements c, i {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public a f14519S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public InterfaceC2562f f14520T;

    @BindView(R.id.account_upgrade_details_arrow_pma_fragment_edd_application_details)
    public ImageView mAccountUpgradeDetailsArrow;

    @BindView(R.id.account_upgrade_details_group_pma_fragment_edd_application_details)
    public Group mAccountUpgradeDetailsGroup;

    @BindView(R.id.additional_account_information_arrow_pma_fragment_edd_application_details)
    public ImageView mAdditionalAccountInformationArrow;

    @BindView(R.id.additional_account_information_group)
    public Group mAdditionalAccountInformationGroup;

    @BindView(R.id.bank_information_text_view_pma_fragment_edd_application_details)
    public TextView mBankInformationTextView;

    @BindView(R.id.container_pma_fragment_edd_application_details)
    public ViewGroup mContainer;

    @BindView(R.id.financial_documents_photo_linear_layout_pma_fragment_edd_application_details)
    public LinearLayout mFinancialDocumentsLayout;

    @BindView(R.id.back_id_photo_image_view_pma_view_application_details_first_id)
    public ImageView mImageViewBackIdPhotoFirst;

    @BindView(R.id.back_id_photo_image_view_pma_view_application_details_second_id)
    public ImageView mImageViewBackIdPhotoSecond;

    @BindView(R.id.birth_certificate_image_view_pma_view_application_details_birth_certificate)
    public ImageView mImageViewBirthCertificate;

    @BindView(R.id.id_photo_image_view_pma_view_application_details_first_id)
    public ImageView mImageViewIdPhotoFirstId;

    @BindView(R.id.id_photo_image_view_pma_view_application_details_second_id)
    public ImageView mImageViewIdPhotoSecondId;

    @BindView(R.id.parent_id_image_view_pma_view_application_details_parent_id)
    public ImageView mImageViewParentId;

    @BindView(R.id.parental_consent_image_view_pma_view_application_details_parental_consent)
    public ImageView mImageViewParentalConsent;

    @BindView(R.id.alternative_income_source_text_view_pma_fragment_edd_application_details)
    public TextView mIncomeSourceTextView;

    @BindView(R.id.account_usage_optional_group_view_pma_fragment_edd_application_details)
    public Group mPrimaryUsageOptionalGroup;

    @BindView(R.id.primary_usage_text_view_pma_fragment_edd_application_details)
    public TextView mPrimaryUsageTextView;

    @BindView(R.id.purpose_text_view_pma_fragment_edd_application_details)
    public TextView mPurposeTextView;

    @BindView(R.id.related_companies_text_view_pma_fragment_edd_application_details)
    public TextView mRelatedCompaniesTextView;

    @BindView(R.id.remittance_text_view_pma_fragment_edd_application_details)
    public TextView mRemittanceTextView;

    @BindView(R.id.birth_date_text_view_pma_fragment_edd_application_details)
    public TextView mTextViewBirthDate;

    @BindView(R.id.birth_place_text_view_pma_fragment_edd_application_details)
    public TextView mTextViewBirthPlace;

    @BindView(R.id.id_expiration_date_text_view_pma_view_application_details_first_id)
    public TextView mTextViewIdExpiryFirstId;

    @BindView(R.id.id_expiration_date_label_text_view_pma_view_application_details_first_id)
    public TextView mTextViewIdExpiryLabelFirstId;

    @BindView(R.id.id_expiration_date_label_text_view_pma_view_application_details_second_id)
    public TextView mTextViewIdExpiryLabelSecondId;

    @BindView(R.id.id_expiration_date_text_view_pma_view_application_details_second_id)
    public TextView mTextViewIdExpirySecondId;

    @BindView(R.id.id_number_text_view_pma_view_application_details_first_id)
    public TextView mTextViewIdNumberFirstId;

    @BindView(R.id.id_number_text_view_pma_view_application_details_second_id)
    public TextView mTextViewIdNumberSecondId;

    @BindView(R.id.id_type_text_view_pma_view_application_details_first_id)
    public TextView mTextViewIdTypeFirstId;

    @BindView(R.id.id_type_label_text_view_pma_view_application_details_first_id)
    public TextView mTextViewIdTypeLabelFirstId;

    @BindView(R.id.id_type_text_view_pma_view_application_details_second_id)
    public TextView mTextViewIdTypeSecondId;

    @BindView(R.id.income_source_text_view_pma_fragment_edd_application_details)
    public TextView mTextViewIncomeSource;

    @BindView(R.id.name_text_view_pma_fragment_edd_application_details)
    public TextView mTextViewName;

    @BindView(R.id.nationality_text_view_pma_fragment_edd_application_details)
    public TextView mTextViewNationality;

    @BindView(R.id.permanent_address_text_view_pma_fragment_edd_application_details)
    public TextView mTextViewPermanentAddress;

    @BindView(R.id.present_address_text_view_pma_fragment_edd_application_details)
    public TextView mTextViewPresentAddress;

    @BindView(R.id.work_nature_text_view_pma_fragment_edd_application_details)
    public TextView mTextViewWorkNature;

    @BindView(R.id.birth_certificate_view_group_pma_fragment_edd_application_details)
    public ViewGroup mViewGroupBirthCertificate;

    @BindView(R.id.parent_id_view_group_pma_fragment_edd_application_details)
    public ViewGroup mViewGroupParentId;

    @BindView(R.id.parental_consent_view_group_pma_fragment_edd_application_details)
    public ViewGroup mViewGroupParentalConsent;

    @BindView(R.id.second_id_view_group_pma_fragment_edd_application_details)
    public ViewGroup mViewGroupSecondId;

    public static void s1(ImageView imageView, boolean z4) {
        imageView.animate().rotation(BigDecimal.valueOf((double) imageView.getRotation()).compareTo(BigDecimal.ZERO) == 0 ? 180.0f : 0.0f).setDuration(z4 ? 0L : 300L);
    }

    @Override // Bd.i
    public final void h(File file, String str) {
        InterfaceC2562f interfaceC2562f = this.f14520T;
        if (interfaceC2562f != null) {
            ((EDDActivity) interfaceC2562f).z1(null, str);
        }
    }

    @OnClick({R.id.account_upgrade_details_arrow_pma_fragment_edd_application_details})
    public void onAccountUpgradeDetailsArrowClick() {
        ImageView imageView = this.mAccountUpgradeDetailsArrow;
        if (imageView == null) {
            j.n("mAccountUpgradeDetailsArrow");
            throw null;
        }
        s1(imageView, false);
        ViewGroup viewGroup = this.mContainer;
        if (viewGroup == null) {
            j.n("mContainer");
            throw null;
        }
        TransitionManager.beginDelayedTransition(viewGroup);
        Group group = this.mAccountUpgradeDetailsGroup;
        if (group == null) {
            j.n("mAccountUpgradeDetailsGroup");
            throw null;
        }
        group.setVisibility(group.getVisibility() == 8 ? 0 : 8);
        r1().o(group.getVisibility() == 0);
    }

    @OnClick({R.id.additional_account_information_arrow_pma_fragment_edd_application_details})
    public void onApplicationDetailsArrowClick() {
        ImageView imageView = this.mAdditionalAccountInformationArrow;
        if (imageView == null) {
            j.n("mAdditionalAccountInformationArrow");
            throw null;
        }
        s1(imageView, false);
        ViewGroup viewGroup = this.mContainer;
        if (viewGroup == null) {
            j.n("mContainer");
            throw null;
        }
        TransitionManager.beginDelayedTransition(viewGroup);
        Group group = this.mAdditionalAccountInformationGroup;
        if (group == null) {
            j.n("mAdditionalAccountInformationGroup");
            throw null;
        }
        group.setVisibility(group.getVisibility() == 8 ? 0 : 8);
        r1().n(group.getVisibility() == 0);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().d().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        U uR = aVar.r();
        w wVar = (w) aVar.f4660D0.get();
        PayMayaClientApi payMayaClientApi = (PayMayaClientApi) aVar.f4745w.get();
        C1276o0 c1276o0 = new C1276o0();
        c1276o0.f11468b = wVar;
        c1276o0.c = payMayaClientApi;
        this.f14519S = new a(uR, c1276o0, aVar.l());
        r1().h(this);
        KeyEventDispatcher.Component activity = getActivity();
        this.f14520T = activity instanceof InterfaceC2562f ? (InterfaceC2562f) activity : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        return inflater.inflate(R.layout.pma_fragment_edd_application_details, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        r1().i();
        super.onDestroy();
    }

    @OnClick({R.id.back_id_photo_image_view_pma_view_application_details_first_id})
    public void onFirstIdBackClicked() {
        List<EkycIdentification> listMIdList;
        Ekyc ekyc;
        List<EkycIdentification> listMIdList2;
        EkycIdentification ekycIdentification;
        InterfaceC2562f interfaceC2562f = this.f14520T;
        if (interfaceC2562f != null) {
            a aVarR1 = r1();
            Ekyc ekyc2 = (Ekyc) aVarR1.h;
            ((EDDActivity) interfaceC2562f).z1(null, (ekyc2 == null || (listMIdList = ekyc2.mIdList()) == null || listMIdList.isEmpty() || (ekyc = (Ekyc) aVarR1.h) == null || (listMIdList2 = ekyc.mIdList()) == null || (ekycIdentification = listMIdList2.get(0)) == null) ? null : ekycIdentification.mBackSideImageUrl());
        }
    }

    @OnClick({R.id.id_photo_image_view_pma_view_application_details_first_id})
    public void onFirstIdClicked() {
        List<EkycIdentification> listMIdList;
        Ekyc ekyc;
        List<EkycIdentification> listMIdList2;
        EkycIdentification ekycIdentification;
        InterfaceC2562f interfaceC2562f = this.f14520T;
        if (interfaceC2562f != null) {
            a aVarR1 = r1();
            Ekyc ekyc2 = (Ekyc) aVarR1.h;
            ((EDDActivity) interfaceC2562f).z1(null, (ekyc2 == null || (listMIdList = ekyc2.mIdList()) == null || listMIdList.isEmpty() || (ekyc = (Ekyc) aVarR1.h) == null || (listMIdList2 = ekyc.mIdList()) == null || (ekycIdentification = listMIdList2.get(0)) == null) ? null : ekycIdentification.mImageUrl());
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2562f interfaceC2562f = this.f14520T;
        if (interfaceC2562f != null) {
            ((EDDActivity) interfaceC2562f).Q(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    @butterknife.OnClick({com.paymaya.R.id.back_id_photo_image_view_pma_view_application_details_second_id})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSecondIdBackClicked() {
        /*
            r5 = this;
            zd.f r0 = r5.f14520T
            if (r0 == 0) goto L52
            Lb.a r1 = r5.r1()
            java.lang.Object r2 = r1.h
            com.paymaya.domain.model.Ekyc r2 = (com.paymaya.domain.model.Ekyc) r2
            r3 = 0
            if (r2 == 0) goto L4c
            java.util.List r2 = r2.mIdList()
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L4c
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1e
            goto L4c
        L1e:
            java.lang.Object r2 = r1.h
            com.paymaya.domain.model.Ekyc r2 = (com.paymaya.domain.model.Ekyc) r2
            if (r2 == 0) goto L2f
            java.util.List r2 = r2.mIdList()
            if (r2 == 0) goto L2f
            int r2 = r2.size()
            goto L30
        L2f:
            r2 = 0
        L30:
            r4 = 1
            if (r2 <= r4) goto L4c
            java.lang.Object r1 = r1.h
            com.paymaya.domain.model.Ekyc r1 = (com.paymaya.domain.model.Ekyc) r1
            if (r1 == 0) goto L4c
            java.util.List r1 = r1.mIdList()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r1.get(r4)
            com.paymaya.domain.model.EkycIdentification r1 = (com.paymaya.domain.model.EkycIdentification) r1
            if (r1 == 0) goto L4c
            java.lang.String r1 = r1.mBackSideImageUrl()
            goto L4d
        L4c:
            r1 = r3
        L4d:
            com.paymaya.ui.ekyc.view.activity.impl.EDDActivity r0 = (com.paymaya.ui.ekyc.view.activity.impl.EDDActivity) r0
            r0.z1(r3, r1)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.ui.ekyc.view.fragment.impl.EDDApplicationDetailsFragment.onSecondIdBackClicked():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    @butterknife.OnClick({com.paymaya.R.id.id_photo_image_view_pma_view_application_details_second_id})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSecondIdClicked() {
        /*
            r5 = this;
            zd.f r0 = r5.f14520T
            if (r0 == 0) goto L52
            Lb.a r1 = r5.r1()
            java.lang.Object r2 = r1.h
            com.paymaya.domain.model.Ekyc r2 = (com.paymaya.domain.model.Ekyc) r2
            r3 = 0
            if (r2 == 0) goto L4c
            java.util.List r2 = r2.mIdList()
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L4c
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1e
            goto L4c
        L1e:
            java.lang.Object r2 = r1.h
            com.paymaya.domain.model.Ekyc r2 = (com.paymaya.domain.model.Ekyc) r2
            if (r2 == 0) goto L2f
            java.util.List r2 = r2.mIdList()
            if (r2 == 0) goto L2f
            int r2 = r2.size()
            goto L30
        L2f:
            r2 = 0
        L30:
            r4 = 1
            if (r2 <= r4) goto L4c
            java.lang.Object r1 = r1.h
            com.paymaya.domain.model.Ekyc r1 = (com.paymaya.domain.model.Ekyc) r1
            if (r1 == 0) goto L4c
            java.util.List r1 = r1.mIdList()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r1.get(r4)
            com.paymaya.domain.model.EkycIdentification r1 = (com.paymaya.domain.model.EkycIdentification) r1
            if (r1 == 0) goto L4c
            java.lang.String r1 = r1.mImageUrl()
            goto L4d
        L4c:
            r1 = r3
        L4d:
            com.paymaya.ui.ekyc.view.activity.impl.EDDActivity r0 = (com.paymaya.ui.ekyc.view.activity.impl.EDDActivity) r0
            r0.z1(r3, r1)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.ui.ekyc.view.fragment.impl.EDDApplicationDetailsFragment.onSecondIdClicked():void");
    }

    @OnClick({R.id.birth_certificate_image_view_pma_view_application_details_birth_certificate})
    public void onViewBirthCertificate() {
        String strMImageUrl;
        List<EkycAdditionalDocument> listMAdditionalDocuments;
        List<EkycAdditionalDocument> listMAdditionalDocuments2;
        InterfaceC2562f interfaceC2562f = this.f14520T;
        if (interfaceC2562f != null) {
            a aVarR1 = r1();
            Ekyc ekyc = (Ekyc) aVarR1.h;
            if (ekyc == null || (listMAdditionalDocuments = ekyc.mAdditionalDocuments()) == null || listMAdditionalDocuments.isEmpty()) {
                strMImageUrl = null;
            } else {
                Ekyc ekyc2 = (Ekyc) aVarR1.h;
                if (ekyc2 == null || (listMAdditionalDocuments2 = ekyc2.mAdditionalDocuments()) == null) {
                    listMAdditionalDocuments2 = C1112C.f9377a;
                }
                for (EkycAdditionalDocument ekycAdditionalDocument : listMAdditionalDocuments2) {
                    if ("BIRTH_CERTIFICATE".equalsIgnoreCase(ekycAdditionalDocument.mType())) {
                        strMImageUrl = ekycAdditionalDocument.mImageUrl();
                        break;
                    }
                }
                strMImageUrl = null;
            }
            ((EDDActivity) interfaceC2562f).z1(null, strMImageUrl);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        Throwable th2;
        EDD eddMEDDInformation;
        String string;
        String string2;
        String string3;
        String purpose;
        List<EkycAdditionalDocument> listMAdditionalDocuments;
        List<EkycIdentification> listMIdList;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Throwable th3 = null;
        if (arguments != null) {
            a aVarR1 = r1();
            Ekyc ekyc = (Ekyc) arguments.getParcelable("ekyc");
            aVarR1.j();
            aVarR1.h = ekyc;
            if (ekyc != null) {
                c cVar = (c) aVarR1.c.get();
                String fullName = ekyc.getFullName();
                j.d(fullName);
                EDDApplicationDetailsFragment eDDApplicationDetailsFragment = (EDDApplicationDetailsFragment) cVar;
                eDDApplicationDetailsFragment.getClass();
                TextView textView = eDDApplicationDetailsFragment.mTextViewName;
                if (textView == null) {
                    j.n("mTextViewName");
                    throw null;
                }
                textView.setText(fullName);
                C1276o0 c1276o0 = (C1276o0) aVarR1.e;
                String strMNationalityCode = ekyc.mNationalityCode();
                c1276o0.getClass();
                b bVar = new b(1);
                bVar.f3082b = strMNationalityCode;
                w wVar = c1276o0.f11468b;
                String strMName = (wVar.a(bVar).isEmpty() ? null : (Nationality) wVar.a(bVar).get(0)).mName();
                c cVar2 = (c) aVarR1.c.get();
                j.d(strMName);
                EDDApplicationDetailsFragment eDDApplicationDetailsFragment2 = (EDDApplicationDetailsFragment) cVar2;
                eDDApplicationDetailsFragment2.getClass();
                TextView textView2 = eDDApplicationDetailsFragment2.mTextViewNationality;
                if (textView2 == null) {
                    j.n("mTextViewNationality");
                    throw null;
                }
                textView2.setText(strMName);
                c cVar3 = (c) aVarR1.c.get();
                String strMDateOfBirth = ekyc.mDateOfBirth();
                DateTimeFormatter dateTimeFormatter = AbstractC1234x.f11248a;
                String[] strArrSplit = strMDateOfBirth.split(Global.HYPHEN);
                int i = Integer.parseInt(strArrSplit[0]);
                int i4 = Integer.parseInt(strArrSplit[1]) - 1;
                int i6 = Integer.parseInt(strArrSplit[2]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(i, i4, i6);
                String string4 = DateFormat.format("MMMM dd, yyyy", calendar).toString();
                j.f(string4, "stringDateFormat(...)");
                EDDApplicationDetailsFragment eDDApplicationDetailsFragment3 = (EDDApplicationDetailsFragment) cVar3;
                eDDApplicationDetailsFragment3.getClass();
                TextView textView3 = eDDApplicationDetailsFragment3.mTextViewBirthDate;
                if (textView3 == null) {
                    j.n("mTextViewBirthDate");
                    throw null;
                }
                textView3.setText(string4);
                C1290w c1290w = (C1290w) aVarR1.f2942g;
                BirthPlace birthPlaceMBirthPlace = ekyc.mBirthPlace();
                String strMName2 = c1290w.a(birthPlaceMBirthPlace != null ? birthPlaceMBirthPlace.mCountryCode() : null).mName();
                BirthPlace birthPlaceMBirthPlace2 = ekyc.mBirthPlace();
                String birthPlace = androidx.camera.core.impl.a.j(birthPlaceMBirthPlace2 != null ? birthPlaceMBirthPlace2.mCity() : null, ", ", strMName2);
                EDDApplicationDetailsFragment eDDApplicationDetailsFragment4 = (EDDApplicationDetailsFragment) ((c) aVarR1.c.get());
                eDDApplicationDetailsFragment4.getClass();
                j.g(birthPlace, "birthPlace");
                TextView textView4 = eDDApplicationDetailsFragment4.mTextViewBirthPlace;
                if (textView4 == null) {
                    j.n("mTextViewBirthPlace");
                    throw null;
                }
                textView4.setText(birthPlace);
            }
            Ekyc ekyc2 = (Ekyc) aVarR1.h;
            if (ekyc2 != null) {
                c cVar4 = (c) aVarR1.c.get();
                String strMIncomeSource = ekyc2.mIncomeSource();
                j.d(strMIncomeSource);
                EDDApplicationDetailsFragment eDDApplicationDetailsFragment5 = (EDDApplicationDetailsFragment) cVar4;
                eDDApplicationDetailsFragment5.getClass();
                TextView textView5 = eDDApplicationDetailsFragment5.mTextViewIncomeSource;
                if (textView5 == null) {
                    j.n("mTextViewIncomeSource");
                    throw null;
                }
                textView5.setText(strMIncomeSource);
                c cVar5 = (c) aVarR1.c.get();
                String strMWorkNature = ekyc2.mWorkNature();
                j.d(strMWorkNature);
                EDDApplicationDetailsFragment eDDApplicationDetailsFragment6 = (EDDApplicationDetailsFragment) cVar5;
                eDDApplicationDetailsFragment6.getClass();
                TextView textView6 = eDDApplicationDetailsFragment6.mTextViewWorkNature;
                if (textView6 == null) {
                    j.n("mTextViewWorkNature");
                    throw null;
                }
                textView6.setText(strMWorkNature);
            }
            Ekyc ekyc3 = (Ekyc) aVarR1.h;
            if (ekyc3 != null) {
                C1290w c1290w2 = (C1290w) aVarR1.f2942g;
                Address addressMPresentAddress = ekyc3.mPresentAddress();
                String strMName3 = c1290w2.a(addressMPresentAddress != null ? addressMPresentAddress.mCountryCode() : null).mName();
                Address addressMPresentAddress2 = ekyc3.mPresentAddress();
                String presentAddress = androidx.camera.core.impl.a.j(addressMPresentAddress2 != null ? addressMPresentAddress2.getCompleteAddress() : null, ", ", strMName3);
                C1290w c1290w3 = (C1290w) aVarR1.f2942g;
                Address addressMPermanentAddress = ekyc3.mPermanentAddress();
                String strMName4 = c1290w3.a(addressMPermanentAddress != null ? addressMPermanentAddress.mCountryCode() : null).mName();
                Address addressMPermanentAddress2 = ekyc3.mPermanentAddress();
                String strJ = androidx.camera.core.impl.a.j(addressMPermanentAddress2 != null ? addressMPermanentAddress2.getCompleteAddress() : null, ", ", strMName4);
                EDDApplicationDetailsFragment eDDApplicationDetailsFragment7 = (EDDApplicationDetailsFragment) ((c) aVarR1.c.get());
                eDDApplicationDetailsFragment7.getClass();
                j.g(presentAddress, "presentAddress");
                TextView textView7 = eDDApplicationDetailsFragment7.mTextViewPresentAddress;
                if (textView7 == null) {
                    j.n("mTextViewPresentAddress");
                    throw null;
                }
                textView7.setText(presentAddress);
                if (presentAddress.equalsIgnoreCase(strJ)) {
                    TextView textView8 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mTextViewPermanentAddress;
                    if (textView8 == null) {
                        j.n("mTextViewPermanentAddress");
                        throw null;
                    }
                    textView8.setText("Same as Present Address");
                } else {
                    TextView textView9 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mTextViewPermanentAddress;
                    if (textView9 == null) {
                        j.n("mTextViewPermanentAddress");
                        throw null;
                    }
                    textView9.setText(strJ);
                }
            }
            Ekyc ekyc4 = (Ekyc) aVarR1.h;
            if (ekyc4 != null) {
                List<EkycIdentification> listMIdList2 = ekyc4.mIdList();
                EkycIdentification ekycIdentification = listMIdList2 != null ? listMIdList2.get(0) : null;
                j.d(ekycIdentification);
                c cVar6 = (c) aVarR1.c.get();
                String strMIdName = ekycIdentification.mIdName();
                TextView textView10 = ((EDDApplicationDetailsFragment) cVar6).mTextViewIdTypeFirstId;
                if (textView10 == null) {
                    j.n("mTextViewIdTypeFirstId");
                    throw null;
                }
                textView10.setText(strMIdName);
                c cVar7 = (c) aVarR1.c.get();
                String strMIdNumber = ekycIdentification.mIdNumber();
                TextView textView11 = ((EDDApplicationDetailsFragment) cVar7).mTextViewIdNumberFirstId;
                if (textView11 == null) {
                    j.n("mTextViewIdNumberFirstId");
                    throw null;
                }
                textView11.setText(strMIdNumber);
                String strMExpirationDate = ekycIdentification.mExpirationDate();
                if (strMExpirationDate == null || C2576A.H(strMExpirationDate)) {
                    EDDApplicationDetailsFragment eDDApplicationDetailsFragment8 = (EDDApplicationDetailsFragment) ((c) aVarR1.c.get());
                    TextView textView12 = eDDApplicationDetailsFragment8.mTextViewIdExpiryFirstId;
                    if (textView12 == null) {
                        j.n("mTextViewIdExpiryFirstId");
                        throw null;
                    }
                    textView12.setVisibility(8);
                    TextView textView13 = eDDApplicationDetailsFragment8.mTextViewIdExpiryLabelFirstId;
                    if (textView13 == null) {
                        j.n("mTextViewIdExpiryLabelFirstId");
                        throw null;
                    }
                    textView13.setVisibility(8);
                } else {
                    c cVar8 = (c) aVarR1.c.get();
                    String strI = AbstractC1234x.i(ekycIdentification.mExpirationDate());
                    TextView textView14 = ((EDDApplicationDetailsFragment) cVar8).mTextViewIdExpiryFirstId;
                    if (textView14 == null) {
                        j.n("mTextViewIdExpiryFirstId");
                        throw null;
                    }
                    textView14.setText(strI);
                    EDDApplicationDetailsFragment eDDApplicationDetailsFragment9 = (EDDApplicationDetailsFragment) ((c) aVarR1.c.get());
                    TextView textView15 = eDDApplicationDetailsFragment9.mTextViewIdExpiryFirstId;
                    if (textView15 == null) {
                        j.n("mTextViewIdExpiryFirstId");
                        throw null;
                    }
                    textView15.setVisibility(0);
                    TextView textView16 = eDDApplicationDetailsFragment9.mTextViewIdExpiryLabelFirstId;
                    if (textView16 == null) {
                        j.n("mTextViewIdExpiryLabelFirstId");
                        throw null;
                    }
                    textView16.setVisibility(0);
                }
                c cVar9 = (c) aVarR1.c.get();
                String strMImageUrl = ekycIdentification.mImageUrl();
                EDDApplicationDetailsFragment eDDApplicationDetailsFragment10 = (EDDApplicationDetailsFragment) cVar9;
                ImageView imageView = eDDApplicationDetailsFragment10.mImageViewIdPhotoFirstId;
                if (imageView == null) {
                    j.n("mImageViewIdPhotoFirstId");
                    throw null;
                }
                imageView.setBackground(null);
                eDDApplicationDetailsFragment10.getActivity();
                ImageView imageView2 = eDDApplicationDetailsFragment10.mImageViewIdPhotoFirstId;
                if (imageView2 == null) {
                    j.n("mImageViewIdPhotoFirstId");
                    throw null;
                }
                C.e0(strMImageUrl, imageView2, 2131231811);
                String strMBackSideImageUrl = ekycIdentification.mBackSideImageUrl();
                if (strMBackSideImageUrl == null || C2576A.H(strMBackSideImageUrl)) {
                    ImageView imageView3 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mImageViewBackIdPhotoFirst;
                    if (imageView3 == null) {
                        j.n("mImageViewBackIdPhotoFirst");
                        throw null;
                    }
                    imageView3.setVisibility(8);
                } else {
                    c cVar10 = (c) aVarR1.c.get();
                    String strMBackSideImageUrl2 = ekycIdentification.mBackSideImageUrl();
                    j.d(strMBackSideImageUrl2);
                    EDDApplicationDetailsFragment eDDApplicationDetailsFragment11 = (EDDApplicationDetailsFragment) cVar10;
                    eDDApplicationDetailsFragment11.getClass();
                    ImageView imageView4 = eDDApplicationDetailsFragment11.mImageViewBackIdPhotoFirst;
                    if (imageView4 == null) {
                        j.n("mImageViewBackIdPhotoFirst");
                        throw null;
                    }
                    imageView4.setBackground(null);
                    eDDApplicationDetailsFragment11.getActivity();
                    ImageView imageView5 = eDDApplicationDetailsFragment11.mImageViewBackIdPhotoFirst;
                    if (imageView5 == null) {
                        j.n("mImageViewBackIdPhotoFirst");
                        throw null;
                    }
                    C.e0(strMBackSideImageUrl2, imageView5, 2131231811);
                }
                EDDApplicationDetailsFragment eDDApplicationDetailsFragment12 = (EDDApplicationDetailsFragment) ((c) aVarR1.c.get());
                TextView textView17 = eDDApplicationDetailsFragment12.mTextViewIdTypeFirstId;
                if (textView17 == null) {
                    j.n("mTextViewIdTypeFirstId");
                    throw null;
                }
                textView17.setVisibility(0);
                TextView textView18 = eDDApplicationDetailsFragment12.mTextViewIdTypeLabelFirstId;
                if (textView18 == null) {
                    j.n("mTextViewIdTypeLabelFirstId");
                    throw null;
                }
                textView18.setVisibility(0);
            }
            Ekyc ekyc5 = (Ekyc) aVarR1.h;
            if (ekyc5 != null && (listMIdList = ekyc5.mIdList()) != null && !listMIdList.isEmpty()) {
                List<EkycIdentification> listMIdList3 = ekyc5.mIdList();
                if ((listMIdList3 != null ? listMIdList3.size() : 0) > 1) {
                    List<EkycIdentification> listMIdList4 = ekyc5.mIdList();
                    EkycIdentification ekycIdentification2 = listMIdList4 != null ? listMIdList4.get(1) : null;
                    j.d(ekycIdentification2);
                    c cVar11 = (c) aVarR1.c.get();
                    String strMIdName2 = ekycIdentification2.mIdName();
                    TextView textView19 = ((EDDApplicationDetailsFragment) cVar11).mTextViewIdTypeSecondId;
                    if (textView19 == null) {
                        j.n("mTextViewIdTypeSecondId");
                        throw null;
                    }
                    textView19.setText(strMIdName2);
                    c cVar12 = (c) aVarR1.c.get();
                    String strMIdNumber2 = ekycIdentification2.mIdNumber();
                    TextView textView20 = ((EDDApplicationDetailsFragment) cVar12).mTextViewIdNumberSecondId;
                    if (textView20 == null) {
                        j.n("mTextViewIdNumberSecondId");
                        throw null;
                    }
                    textView20.setText(strMIdNumber2);
                    String strMExpirationDate2 = ekycIdentification2.mExpirationDate();
                    if (strMExpirationDate2 == null || C2576A.H(strMExpirationDate2)) {
                        EDDApplicationDetailsFragment eDDApplicationDetailsFragment13 = (EDDApplicationDetailsFragment) ((c) aVarR1.c.get());
                        TextView textView21 = eDDApplicationDetailsFragment13.mTextViewIdExpirySecondId;
                        if (textView21 == null) {
                            j.n("mTextViewIdExpirySecondId");
                            throw null;
                        }
                        textView21.setVisibility(8);
                        TextView textView22 = eDDApplicationDetailsFragment13.mTextViewIdExpiryLabelSecondId;
                        if (textView22 == null) {
                            j.n("mTextViewIdExpiryLabelSecondId");
                            throw null;
                        }
                        textView22.setVisibility(8);
                    } else {
                        c cVar13 = (c) aVarR1.c.get();
                        String strI2 = AbstractC1234x.i(ekycIdentification2.mExpirationDate());
                        j.f(strI2, "formatExpiryDate(...)");
                        EDDApplicationDetailsFragment eDDApplicationDetailsFragment14 = (EDDApplicationDetailsFragment) cVar13;
                        eDDApplicationDetailsFragment14.getClass();
                        TextView textView23 = eDDApplicationDetailsFragment14.mTextViewIdExpirySecondId;
                        if (textView23 == null) {
                            j.n("mTextViewIdExpirySecondId");
                            throw null;
                        }
                        textView23.setText(strI2);
                        EDDApplicationDetailsFragment eDDApplicationDetailsFragment15 = (EDDApplicationDetailsFragment) ((c) aVarR1.c.get());
                        TextView textView24 = eDDApplicationDetailsFragment15.mTextViewIdExpirySecondId;
                        if (textView24 == null) {
                            j.n("mTextViewIdExpirySecondId");
                            throw null;
                        }
                        textView24.setVisibility(0);
                        TextView textView25 = eDDApplicationDetailsFragment15.mTextViewIdExpiryLabelSecondId;
                        if (textView25 == null) {
                            j.n("mTextViewIdExpiryLabelSecondId");
                            throw null;
                        }
                        textView25.setVisibility(0);
                    }
                    c cVar14 = (c) aVarR1.c.get();
                    String strMImageUrl2 = ekycIdentification2.mImageUrl();
                    EDDApplicationDetailsFragment eDDApplicationDetailsFragment16 = (EDDApplicationDetailsFragment) cVar14;
                    ImageView imageView6 = eDDApplicationDetailsFragment16.mImageViewIdPhotoSecondId;
                    if (imageView6 == null) {
                        j.n("mImageViewIdPhotoSecondId");
                        throw null;
                    }
                    imageView6.setBackground(null);
                    eDDApplicationDetailsFragment16.getActivity();
                    ImageView imageView7 = eDDApplicationDetailsFragment16.mImageViewIdPhotoSecondId;
                    if (imageView7 == null) {
                        j.n("mImageViewIdPhotoSecondId");
                        throw null;
                    }
                    C.e0(strMImageUrl2, imageView7, 2131231811);
                    String strMBackSideImageUrl3 = ekycIdentification2.mBackSideImageUrl();
                    if (strMBackSideImageUrl3 == null || C2576A.H(strMBackSideImageUrl3)) {
                        ImageView imageView8 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mImageViewBackIdPhotoSecond;
                        if (imageView8 == null) {
                            j.n("mImageViewBackIdPhotoSecond");
                            throw null;
                        }
                        imageView8.setVisibility(8);
                    } else {
                        c cVar15 = (c) aVarR1.c.get();
                        String strMBackSideImageUrl4 = ekycIdentification2.mBackSideImageUrl();
                        EDDApplicationDetailsFragment eDDApplicationDetailsFragment17 = (EDDApplicationDetailsFragment) cVar15;
                        ImageView imageView9 = eDDApplicationDetailsFragment17.mImageViewBackIdPhotoSecond;
                        if (imageView9 == null) {
                            j.n("mImageViewBackIdPhotoSecond");
                            throw null;
                        }
                        imageView9.setBackground(null);
                        eDDApplicationDetailsFragment17.getActivity();
                        ImageView imageView10 = eDDApplicationDetailsFragment17.mImageViewBackIdPhotoSecond;
                        if (imageView10 == null) {
                            j.n("mImageViewBackIdPhotoSecond");
                            throw null;
                        }
                        C.e0(strMBackSideImageUrl4, imageView10, 2131231811);
                    }
                    ViewGroup viewGroup = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mViewGroupSecondId;
                    if (viewGroup == null) {
                        j.n("mViewGroupSecondId");
                        throw null;
                    }
                    viewGroup.setVisibility(0);
                }
            }
            ViewGroup viewGroup2 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mViewGroupBirthCertificate;
            if (viewGroup2 == null) {
                j.n("mViewGroupBirthCertificate");
                throw null;
            }
            viewGroup2.setVisibility(8);
            ViewGroup viewGroup3 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mViewGroupParentId;
            if (viewGroup3 == null) {
                j.n("mViewGroupParentId");
                throw null;
            }
            viewGroup3.setVisibility(8);
            ViewGroup viewGroup4 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mViewGroupParentalConsent;
            if (viewGroup4 == null) {
                j.n("mViewGroupParentalConsent");
                throw null;
            }
            viewGroup4.setVisibility(8);
            Ekyc ekyc6 = (Ekyc) aVarR1.h;
            if (ekyc6 != null && (listMAdditionalDocuments = ekyc6.mAdditionalDocuments()) != null) {
                for (EkycAdditionalDocument ekycAdditionalDocument : listMAdditionalDocuments) {
                    Throwable th4 = th3;
                    if ("BIRTH_CERTIFICATE".equals(ekycAdditionalDocument.mType())) {
                        c cVar16 = (c) aVarR1.c.get();
                        String strMImageUrl3 = ekycAdditionalDocument.mImageUrl();
                        EDDApplicationDetailsFragment eDDApplicationDetailsFragment18 = (EDDApplicationDetailsFragment) cVar16;
                        ImageView imageView11 = eDDApplicationDetailsFragment18.mImageViewBirthCertificate;
                        if (imageView11 == null) {
                            j.n("mImageViewBirthCertificate");
                            throw th4;
                        }
                        imageView11.setBackground(null);
                        eDDApplicationDetailsFragment18.getActivity();
                        ImageView imageView12 = eDDApplicationDetailsFragment18.mImageViewBirthCertificate;
                        if (imageView12 == null) {
                            j.n("mImageViewBirthCertificate");
                            throw th4;
                        }
                        C.e0(strMImageUrl3, imageView12, 2131231811);
                        ViewGroup viewGroup5 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mViewGroupBirthCertificate;
                        if (viewGroup5 == null) {
                            j.n("mViewGroupBirthCertificate");
                            throw th4;
                        }
                        viewGroup5.setVisibility(0);
                    } else if ("PARENT_GUARDIAN_ID".equals(ekycAdditionalDocument.mType())) {
                        c cVar17 = (c) aVarR1.c.get();
                        String strMImageUrl4 = ekycAdditionalDocument.mImageUrl();
                        EDDApplicationDetailsFragment eDDApplicationDetailsFragment19 = (EDDApplicationDetailsFragment) cVar17;
                        ImageView imageView13 = eDDApplicationDetailsFragment19.mImageViewParentId;
                        if (imageView13 == null) {
                            j.n("mImageViewParentId");
                            throw th4;
                        }
                        imageView13.setBackground(null);
                        eDDApplicationDetailsFragment19.getActivity();
                        ImageView imageView14 = eDDApplicationDetailsFragment19.mImageViewParentId;
                        if (imageView14 == null) {
                            j.n("mImageViewParentId");
                            throw th4;
                        }
                        C.e0(strMImageUrl4, imageView14, 2131231811);
                        ViewGroup viewGroup6 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mViewGroupParentId;
                        if (viewGroup6 == null) {
                            j.n("mViewGroupParentId");
                            throw th4;
                        }
                        viewGroup6.setVisibility(0);
                    } else if ("PARENTAL_CONSENT".equals(ekycAdditionalDocument.mType())) {
                        c cVar18 = (c) aVarR1.c.get();
                        String strMImageUrl5 = ekycAdditionalDocument.mImageUrl();
                        EDDApplicationDetailsFragment eDDApplicationDetailsFragment20 = (EDDApplicationDetailsFragment) cVar18;
                        ImageView imageView15 = eDDApplicationDetailsFragment20.mImageViewParentalConsent;
                        if (imageView15 == null) {
                            j.n("mImageViewParentalConsent");
                            throw th4;
                        }
                        imageView15.setBackground(null);
                        eDDApplicationDetailsFragment20.getActivity();
                        ImageView imageView16 = eDDApplicationDetailsFragment20.mImageViewParentalConsent;
                        if (imageView16 == null) {
                            j.n("mImageViewParentalConsent");
                            throw th4;
                        }
                        C.e0(strMImageUrl5, imageView16, 2131231811);
                        ViewGroup viewGroup7 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mViewGroupParentalConsent;
                        if (viewGroup7 == null) {
                            j.n("mViewGroupParentalConsent");
                            throw th4;
                        }
                        viewGroup7.setVisibility(0);
                    } else {
                        continue;
                    }
                    th3 = th4;
                }
            }
            th2 = th3;
            Ekyc ekyc7 = (Ekyc) aVarR1.h;
            if (ekyc7 != null && (eddMEDDInformation = ekyc7.mEDDInformation()) != null) {
                EDDUsage usage = eddMEDDInformation.getUsage();
                if (usage != null) {
                    c cVar19 = (c) aVarR1.c.get();
                    String usage2 = usage.getName();
                    EDDApplicationDetailsFragment eDDApplicationDetailsFragment21 = (EDDApplicationDetailsFragment) cVar19;
                    eDDApplicationDetailsFragment21.getClass();
                    j.g(usage2, "usage");
                    TextView textView26 = eDDApplicationDetailsFragment21.mPrimaryUsageTextView;
                    if (textView26 == null) {
                        j.n("mPrimaryUsageTextView");
                        throw th2;
                    }
                    textView26.setText(usage2);
                    String remitTo = usage.getRemitTo();
                    if ((remitTo == null || C2576A.H(remitTo)) && ((purpose = usage.getPurpose()) == null || C2576A.H(purpose))) {
                        Group group = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mPrimaryUsageOptionalGroup;
                        if (group == null) {
                            j.n("mPrimaryUsageOptionalGroup");
                            throw th2;
                        }
                        group.setVisibility(8);
                    } else {
                        c cVar20 = (c) aVarR1.c.get();
                        String remitTo2 = usage.getRemitTo();
                        j.d(remitTo2);
                        EDDApplicationDetailsFragment eDDApplicationDetailsFragment22 = (EDDApplicationDetailsFragment) cVar20;
                        eDDApplicationDetailsFragment22.getClass();
                        TextView textView27 = eDDApplicationDetailsFragment22.mRemittanceTextView;
                        if (textView27 == null) {
                            j.n("mRemittanceTextView");
                            throw th2;
                        }
                        textView27.setText(remitTo2);
                        c cVar21 = (c) aVarR1.c.get();
                        String purpose2 = usage.getPurpose();
                        j.d(purpose2);
                        EDDApplicationDetailsFragment eDDApplicationDetailsFragment23 = (EDDApplicationDetailsFragment) cVar21;
                        eDDApplicationDetailsFragment23.getClass();
                        TextView textView28 = eDDApplicationDetailsFragment23.mPurposeTextView;
                        if (textView28 == null) {
                            j.n("mPurposeTextView");
                            throw th2;
                        }
                        textView28.setText(purpose2);
                        Group group2 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mPrimaryUsageOptionalGroup;
                        if (group2 == null) {
                            j.n("mPrimaryUsageOptionalGroup");
                            throw th2;
                        }
                        group2.setVisibility(0);
                    }
                }
                List<String> alternativeIncomeSources = eddMEDDInformation.getAlternativeIncomeSources();
                if (alternativeIncomeSources == null || (string = C1110A.F(alternativeIncomeSources, Global.NEWLINE, null, null, null, 62)) == null) {
                    string = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).getString(R.string.pma_label_na);
                    j.f(string, "getString(...)");
                }
                EDDApplicationDetailsFragment eDDApplicationDetailsFragment24 = (EDDApplicationDetailsFragment) ((c) aVarR1.c.get());
                eDDApplicationDetailsFragment24.getClass();
                TextView textView29 = eDDApplicationDetailsFragment24.mIncomeSourceTextView;
                if (textView29 == null) {
                    j.n("mIncomeSourceTextView");
                    throw th2;
                }
                textView29.setText(string);
                List<String> relatedCompanies = eddMEDDInformation.getRelatedCompanies();
                if (relatedCompanies == null || (string2 = C1110A.F(relatedCompanies, Global.NEWLINE, null, null, null, 62)) == null) {
                    string2 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).getString(R.string.pma_label_na);
                    j.f(string2, "getString(...)");
                }
                EDDApplicationDetailsFragment eDDApplicationDetailsFragment25 = (EDDApplicationDetailsFragment) ((c) aVarR1.c.get());
                eDDApplicationDetailsFragment25.getClass();
                TextView textView30 = eDDApplicationDetailsFragment25.mRelatedCompaniesTextView;
                if (textView30 == null) {
                    j.n("mRelatedCompaniesTextView");
                    throw th2;
                }
                textView30.setText(string2);
                List<String> banks = eddMEDDInformation.getBanks();
                if (banks == null || (string3 = C1110A.F(banks, Global.NEWLINE, null, null, null, 62)) == null) {
                    string3 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).getString(R.string.pma_label_na);
                    j.f(string3, "getString(...)");
                }
                EDDApplicationDetailsFragment eDDApplicationDetailsFragment26 = (EDDApplicationDetailsFragment) ((c) aVarR1.c.get());
                eDDApplicationDetailsFragment26.getClass();
                TextView textView31 = eDDApplicationDetailsFragment26.mBankInformationTextView;
                if (textView31 == null) {
                    j.n("mBankInformationTextView");
                    throw th2;
                }
                textView31.setText(string3);
                LinearLayout linearLayout = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).mFinancialDocumentsLayout;
                if (linearLayout == null) {
                    j.n("mFinancialDocumentsLayout");
                    throw th2;
                }
                linearLayout.removeAllViews();
                List<EDDFinancialDocument> financialDocuments = eddMEDDInformation.getFinancialDocuments();
                List<EDDFinancialDocument> list = financialDocuments;
                if (list == null || list.isEmpty()) {
                    EDDApplicationDetailsFragment eDDApplicationDetailsFragment27 = (EDDApplicationDetailsFragment) ((c) aVarR1.c.get());
                    String string5 = eDDApplicationDetailsFragment27.getString(R.string.pma_label_na);
                    Context contextRequireContext = eDDApplicationDetailsFragment27.requireContext();
                    j.f(contextRequireContext, "requireContext(...)");
                    FinancialDocumentPhoto financialDocumentPhoto = new FinancialDocumentPhoto(contextRequireContext);
                    FinancialDocumentPhoto.b(financialDocumentPhoto, string5, null, null, eDDApplicationDetailsFragment27, 2);
                    LinearLayout linearLayout2 = eDDApplicationDetailsFragment27.mFinancialDocumentsLayout;
                    if (linearLayout2 == null) {
                        j.n("mFinancialDocumentsLayout");
                        throw th2;
                    }
                    linearLayout2.addView(financialDocumentPhoto);
                } else {
                    for (EDDFinancialDocument eDDFinancialDocument : financialDocuments) {
                        U u3 = (U) aVarR1.f;
                        String type = eDDFinancialDocument.getType();
                        u3.getClass();
                        j.g(type, "type");
                        d dVar = new d(type, 0);
                        q qVar = u3.f11394b;
                        qVar.getClass();
                        FinancialDocument financialDocument = qVar.a(dVar).isEmpty() ? null : (FinancialDocument) qVar.a(dVar).get(0);
                        if (financialDocument != null) {
                            eDDFinancialDocument.setFinancialDocument(financialDocument);
                        } else if (j.b(eDDFinancialDocument.getType(), "NOT_APPLICABLE")) {
                            String type2 = eDDFinancialDocument.getType();
                            String string6 = ((EDDApplicationDetailsFragment) ((c) aVarR1.c.get())).getString(R.string.pma_label_na);
                            j.f(string6, "getString(...)");
                            eDDFinancialDocument.setFinancialDocument(new FinancialDocument(type2, string6));
                        } else {
                            eDDFinancialDocument.setFinancialDocument(new FinancialDocument(eDDFinancialDocument.getType(), eDDFinancialDocument.getType()));
                        }
                        EDDApplicationDetailsFragment eDDApplicationDetailsFragment28 = (EDDApplicationDetailsFragment) ((c) aVarR1.c.get());
                        eDDApplicationDetailsFragment28.getClass();
                        FinancialDocument financialDocument2 = eDDFinancialDocument.getFinancialDocument();
                        String name = financialDocument2 != null ? financialDocument2.getName() : null;
                        String url = eDDFinancialDocument.getUrl();
                        Context contextRequireContext2 = eDDApplicationDetailsFragment28.requireContext();
                        j.f(contextRequireContext2, "requireContext(...)");
                        FinancialDocumentPhoto financialDocumentPhoto2 = new FinancialDocumentPhoto(contextRequireContext2);
                        FinancialDocumentPhoto.b(financialDocumentPhoto2, name, null, url, eDDApplicationDetailsFragment28, 2);
                        LinearLayout linearLayout3 = eDDApplicationDetailsFragment28.mFinancialDocumentsLayout;
                        if (linearLayout3 == null) {
                            j.n("mFinancialDocumentsLayout");
                            throw th2;
                        }
                        linearLayout3.addView(financialDocumentPhoto2);
                    }
                }
            }
        } else {
            th2 = null;
        }
        ImageView imageView17 = this.mAdditionalAccountInformationArrow;
        if (imageView17 == null) {
            j.n("mAdditionalAccountInformationArrow");
            throw th2;
        }
        s1(imageView17, true);
        Group group3 = this.mAdditionalAccountInformationGroup;
        if (group3 == null) {
            j.n("mAdditionalAccountInformationGroup");
            throw th2;
        }
        group3.setVisibility(8);
        r1().n(false);
        ImageView imageView18 = this.mAccountUpgradeDetailsArrow;
        if (imageView18 == null) {
            j.n("mAccountUpgradeDetailsArrow");
            throw th2;
        }
        s1(imageView18, true);
        Group group4 = this.mAccountUpgradeDetailsGroup;
        if (group4 == null) {
            j.n("mAccountUpgradeDetailsGroup");
            throw th2;
        }
        group4.setVisibility(8);
        r1().o(false);
    }

    @OnClick({R.id.parent_id_image_view_pma_view_application_details_parent_id})
    public void onViewParentId() {
        String strMImageUrl;
        List<EkycAdditionalDocument> listMAdditionalDocuments;
        List<EkycAdditionalDocument> listMAdditionalDocuments2;
        InterfaceC2562f interfaceC2562f = this.f14520T;
        if (interfaceC2562f != null) {
            a aVarR1 = r1();
            Ekyc ekyc = (Ekyc) aVarR1.h;
            if (ekyc == null || (listMAdditionalDocuments = ekyc.mAdditionalDocuments()) == null || listMAdditionalDocuments.isEmpty()) {
                strMImageUrl = null;
            } else {
                Ekyc ekyc2 = (Ekyc) aVarR1.h;
                if (ekyc2 == null || (listMAdditionalDocuments2 = ekyc2.mAdditionalDocuments()) == null) {
                    listMAdditionalDocuments2 = C1112C.f9377a;
                }
                for (EkycAdditionalDocument ekycAdditionalDocument : listMAdditionalDocuments2) {
                    if ("PARENT_GUARDIAN_ID".equalsIgnoreCase(ekycAdditionalDocument.mType())) {
                        strMImageUrl = ekycAdditionalDocument.mImageUrl();
                        break;
                    }
                }
                strMImageUrl = null;
            }
            ((EDDActivity) interfaceC2562f).z1(null, strMImageUrl);
        }
    }

    @OnClick({R.id.parental_consent_image_view_pma_view_application_details_parental_consent})
    public void onViewParentalConsent() {
        String strMImageUrl;
        List<EkycAdditionalDocument> listMAdditionalDocuments;
        List<EkycAdditionalDocument> listMAdditionalDocuments2;
        InterfaceC2562f interfaceC2562f = this.f14520T;
        if (interfaceC2562f != null) {
            a aVarR1 = r1();
            Ekyc ekyc = (Ekyc) aVarR1.h;
            if (ekyc == null || (listMAdditionalDocuments = ekyc.mAdditionalDocuments()) == null || listMAdditionalDocuments.isEmpty()) {
                strMImageUrl = null;
            } else {
                Ekyc ekyc2 = (Ekyc) aVarR1.h;
                if (ekyc2 == null || (listMAdditionalDocuments2 = ekyc2.mAdditionalDocuments()) == null) {
                    listMAdditionalDocuments2 = C1112C.f9377a;
                }
                for (EkycAdditionalDocument ekycAdditionalDocument : listMAdditionalDocuments2) {
                    if ("PARENTAL_CONSENT".equalsIgnoreCase(ekycAdditionalDocument.mType())) {
                        strMImageUrl = ekycAdditionalDocument.mImageUrl();
                        break;
                    }
                }
                strMImageUrl = null;
            }
            ((EDDActivity) interfaceC2562f).z1(null, strMImageUrl);
        }
    }

    public final a r1() {
        a aVar = this.f14519S;
        if (aVar != null) {
            return aVar;
        }
        j.n("mEDDApplicationDetailsFragmentPresenter");
        throw null;
    }
}
