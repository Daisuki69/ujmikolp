package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycCmsContentData implements Parcelable {
    public static final Parcelable.Creator<KycCmsContentData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("additional_document")
    private final KycAdditionalDocument additionalDocument;

    @InterfaceC1497a
    @InterfaceC1498b("allGood")
    private final KycAllGood allGood;

    @InterfaceC1497a
    @InterfaceC1498b("basic_account")
    private final KycBasicAccount basicAccount;

    @InterfaceC1497a
    @InterfaceC1498b("benefits")
    private final List<KycBenefit> benefits;

    @InterfaceC1497a
    @InterfaceC1498b("capture_guides")
    private List<KycCaptureGuide> captureGuides;

    @InterfaceC1497a
    @InterfaceC1498b("countries")
    private final List<KycCountry> countries;

    @InterfaceC1497a
    @InterfaceC1498b("dnfbp_guides")
    private final List<KycDnfbpGuide> dnfbpGuide;

    @InterfaceC1497a
    @InterfaceC1498b("documents")
    private final List<KycDocument> documents;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("image_quality_guides")
    private List<KycImageQualityGuide> imageQualityGuides;

    @InterfaceC1497a
    @InterfaceC1498b("income_sources")
    private final List<KycIncomeSource> incomeSources;

    @InterfaceC1497a
    @InterfaceC1498b("intro")
    private final KycIntro intro;

    @InterfaceC1497a
    @InterfaceC1498b("live_photo_tips")
    private final List<KycLivePhotoTip> livePhotoTips;

    @InterfaceC1497a
    @InterfaceC1498b("image_quality_max_retries")
    private Integer maxRetryLimit;

    @InterfaceC1497a
    @InterfaceC1498b("nationalities")
    private final List<KycNationality> nationalities;

    @InterfaceC1497a
    @InterfaceC1498b("other_documents")
    private final List<KycOtherDocuments> otherDocuments;

    @InterfaceC1497a
    @InterfaceC1498b("other_primary_documents")
    private List<KycDocument> otherPrimaryDocuments;

    @InterfaceC1497a
    @InterfaceC1498b("photo_tips")
    private final List<KycPhotoTip> photoTips;

    @InterfaceC1497a
    @InterfaceC1498b("recommended_documents")
    private List<KycDocument> recommendedDocuments;

    @InterfaceC1497a
    @InterfaceC1498b("review")
    private final KycReview review;

    @InterfaceC1497a
    @InterfaceC1498b("rule")
    private final KycRule rule;

    @InterfaceC1497a
    @InterfaceC1498b("secondary_documents")
    private List<KycDocument> secondaryDocuments;

    @InterfaceC1497a
    @InterfaceC1498b("selfie_tips")
    private final KycSelfieTips selfieTips;

    @InterfaceC1497a
    @InterfaceC1498b("submit")
    private final KycSubmit submit;

    @InterfaceC1497a
    @InterfaceC1498b("upload_guides")
    private KycUploadGuide uploadGuides;

    @InterfaceC1497a
    @InterfaceC1498b("validation_rules")
    private final List<KycValidationRule> validationRules;

    @InterfaceC1497a
    @InterfaceC1498b("video_tips")
    private final List<KycVideoTip> videoTips;

    @InterfaceC1497a
    @InterfaceC1498b("work_natures")
    private final List<KycWorkNature> workNatures;

    public static final class Creator implements Parcelable.Creator<KycCmsContentData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCmsContentData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ArrayList arrayList11;
            ArrayList arrayList12;
            ArrayList arrayList13;
            ArrayList arrayList14;
            ArrayList arrayList15;
            ArrayList arrayList16;
            ArrayList arrayList17;
            j.g(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList18 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(KycDnfbpGuide.CREATOR, parcel, arrayList18, I4, 1);
                }
                arrayList = arrayList18;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList19 = new ArrayList(i4);
                int I9 = 0;
                while (I9 != i4) {
                    I9 = AbstractC1213b.I(KycOtherDocuments.CREATOR, parcel, arrayList19, I9, 1);
                }
                arrayList2 = arrayList19;
            }
            KycIntro kycIntroCreateFromParcel = parcel.readInt() == 0 ? null : KycIntro.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i6 = parcel.readInt();
                ArrayList arrayList20 = new ArrayList(i6);
                int I10 = 0;
                while (I10 != i6) {
                    I10 = AbstractC1213b.I(KycBenefit.CREATOR, parcel, arrayList20, I10, 1);
                }
                arrayList3 = arrayList20;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i10 = parcel.readInt();
                ArrayList arrayList21 = new ArrayList(i10);
                int I11 = 0;
                while (I11 != i10) {
                    I11 = AbstractC1213b.I(KycCountry.CREATOR, parcel, arrayList21, I11, 1);
                }
                arrayList4 = arrayList21;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList22 = new ArrayList(i11);
                int I12 = 0;
                while (I12 != i11) {
                    I12 = AbstractC1213b.I(KycDocument.CREATOR, parcel, arrayList22, I12, 1);
                }
                arrayList5 = arrayList22;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList23 = new ArrayList(i12);
                int I13 = 0;
                while (I13 != i12) {
                    I13 = AbstractC1213b.I(KycDocument.CREATOR, parcel, arrayList23, I13, 1);
                }
                arrayList6 = arrayList23;
            }
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList7 = new ArrayList(i13);
                int I14 = 0;
                while (I14 != i13) {
                    I14 = AbstractC1213b.I(KycDocument.CREATOR, parcel, arrayList7, I14, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList8 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList8 = new ArrayList(i14);
                int I15 = 0;
                while (I15 != i14) {
                    I15 = AbstractC1213b.I(KycDocument.CREATOR, parcel, arrayList8, I15, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList9 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList24 = new ArrayList(i15);
                int I16 = 0;
                while (I16 != i15) {
                    I16 = AbstractC1213b.I(KycCaptureGuide.CREATOR, parcel, arrayList24, I16, 1);
                    i15 = i15;
                }
                arrayList9 = arrayList24;
            }
            KycUploadGuide kycUploadGuideCreateFromParcel = parcel.readInt() == 0 ? null : KycUploadGuide.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList10 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList25 = new ArrayList(i16);
                int I17 = 0;
                while (I17 != i16) {
                    I17 = AbstractC1213b.I(KycImageQualityGuide.CREATOR, parcel, arrayList25, I17, 1);
                    i16 = i16;
                }
                arrayList10 = arrayList25;
            }
            if (parcel.readInt() == 0) {
                arrayList11 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList26 = new ArrayList(i17);
                int I18 = 0;
                while (I18 != i17) {
                    I18 = AbstractC1213b.I(KycNationality.CREATOR, parcel, arrayList26, I18, 1);
                    i17 = i17;
                }
                arrayList11 = arrayList26;
            }
            if (parcel.readInt() == 0) {
                arrayList12 = null;
            } else {
                int i18 = parcel.readInt();
                ArrayList arrayList27 = new ArrayList(i18);
                int I19 = 0;
                while (I19 != i18) {
                    I19 = AbstractC1213b.I(KycPhotoTip.CREATOR, parcel, arrayList27, I19, 1);
                    i18 = i18;
                }
                arrayList12 = arrayList27;
            }
            if (parcel.readInt() == 0) {
                arrayList13 = null;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList28 = new ArrayList(i19);
                int I20 = 0;
                while (I20 != i19) {
                    I20 = AbstractC1213b.I(KycLivePhotoTip.CREATOR, parcel, arrayList28, I20, 1);
                    i19 = i19;
                }
                arrayList13 = arrayList28;
            }
            if (parcel.readInt() == 0) {
                arrayList14 = null;
            } else {
                int i20 = parcel.readInt();
                ArrayList arrayList29 = new ArrayList(i20);
                int I21 = 0;
                while (I21 != i20) {
                    I21 = AbstractC1213b.I(KycVideoTip.CREATOR, parcel, arrayList29, I21, 1);
                    i20 = i20;
                }
                arrayList14 = arrayList29;
            }
            KycSelfieTips kycSelfieTipsCreateFromParcel = parcel.readInt() == 0 ? null : KycSelfieTips.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList15 = null;
            } else {
                int i21 = parcel.readInt();
                ArrayList arrayList30 = new ArrayList(i21);
                int I22 = 0;
                while (I22 != i21) {
                    I22 = AbstractC1213b.I(KycWorkNature.CREATOR, parcel, arrayList30, I22, 1);
                    i21 = i21;
                }
                arrayList15 = arrayList30;
            }
            KycAdditionalDocument kycAdditionalDocumentCreateFromParcel = parcel.readInt() == 0 ? null : KycAdditionalDocument.CREATOR.createFromParcel(parcel);
            KycBasicAccount kycBasicAccountCreateFromParcel = parcel.readInt() == 0 ? null : KycBasicAccount.CREATOR.createFromParcel(parcel);
            KycRule kycRuleCreateFromParcel = parcel.readInt() == 0 ? null : KycRule.CREATOR.createFromParcel(parcel);
            KycAllGood kycAllGoodCreateFromParcel = parcel.readInt() == 0 ? null : KycAllGood.CREATOR.createFromParcel(parcel);
            KycReview kycReviewCreateFromParcel = parcel.readInt() == 0 ? null : KycReview.CREATOR.createFromParcel(parcel);
            KycSubmit kycSubmitCreateFromParcel = parcel.readInt() == 0 ? null : KycSubmit.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList16 = null;
            } else {
                int i22 = parcel.readInt();
                ArrayList arrayList31 = new ArrayList(i22);
                int I23 = 0;
                while (I23 != i22) {
                    I23 = AbstractC1213b.I(KycIncomeSource.CREATOR, parcel, arrayList31, I23, 1);
                    i22 = i22;
                }
                arrayList16 = arrayList31;
            }
            if (parcel.readInt() == 0) {
                arrayList17 = null;
            } else {
                int i23 = parcel.readInt();
                ArrayList arrayList32 = new ArrayList(i23);
                int I24 = 0;
                while (I24 != i23) {
                    I24 = AbstractC1213b.I(KycValidationRule.CREATOR, parcel, arrayList32, I24, 1);
                    i23 = i23;
                }
                arrayList17 = arrayList32;
            }
            return new KycCmsContentData(arrayList, arrayList2, kycIntroCreateFromParcel, numValueOf, numValueOf2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, kycUploadGuideCreateFromParcel, arrayList10, arrayList11, arrayList12, arrayList13, arrayList14, kycSelfieTipsCreateFromParcel, arrayList15, kycAdditionalDocumentCreateFromParcel, kycBasicAccountCreateFromParcel, kycRuleCreateFromParcel, kycAllGoodCreateFromParcel, kycReviewCreateFromParcel, kycSubmitCreateFromParcel, arrayList16, arrayList17);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCmsContentData[] newArray(int i) {
            return new KycCmsContentData[i];
        }
    }

    public KycCmsContentData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycCmsContentData copy$default(KycCmsContentData kycCmsContentData, List list, List list2, KycIntro kycIntro, Integer num, Integer num2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, KycUploadGuide kycUploadGuide, List list10, List list11, List list12, List list13, List list14, KycSelfieTips kycSelfieTips, List list15, KycAdditionalDocument kycAdditionalDocument, KycBasicAccount kycBasicAccount, KycRule kycRule, KycAllGood kycAllGood, KycReview kycReview, KycSubmit kycSubmit, List list16, List list17, int i, Object obj) {
        List list18;
        List list19;
        List list20 = (i & 1) != 0 ? kycCmsContentData.dnfbpGuide : list;
        List list21 = (i & 2) != 0 ? kycCmsContentData.otherDocuments : list2;
        KycIntro kycIntro2 = (i & 4) != 0 ? kycCmsContentData.intro : kycIntro;
        Integer num3 = (i & 8) != 0 ? kycCmsContentData.maxRetryLimit : num;
        Integer num4 = (i & 16) != 0 ? kycCmsContentData.id : num2;
        List list22 = (i & 32) != 0 ? kycCmsContentData.benefits : list3;
        List list23 = (i & 64) != 0 ? kycCmsContentData.countries : list4;
        List list24 = (i & 128) != 0 ? kycCmsContentData.documents : list5;
        List list25 = (i & 256) != 0 ? kycCmsContentData.recommendedDocuments : list6;
        List list26 = (i & 512) != 0 ? kycCmsContentData.otherPrimaryDocuments : list7;
        List list27 = (i & 1024) != 0 ? kycCmsContentData.secondaryDocuments : list8;
        List list28 = (i & 2048) != 0 ? kycCmsContentData.captureGuides : list9;
        KycUploadGuide kycUploadGuide2 = (i & 4096) != 0 ? kycCmsContentData.uploadGuides : kycUploadGuide;
        List list29 = (i & 8192) != 0 ? kycCmsContentData.imageQualityGuides : list10;
        List list30 = list20;
        List list31 = (i & 16384) != 0 ? kycCmsContentData.nationalities : list11;
        List list32 = (i & 32768) != 0 ? kycCmsContentData.photoTips : list12;
        List list33 = (i & 65536) != 0 ? kycCmsContentData.livePhotoTips : list13;
        List list34 = (i & 131072) != 0 ? kycCmsContentData.videoTips : list14;
        KycSelfieTips kycSelfieTips2 = (i & 262144) != 0 ? kycCmsContentData.selfieTips : kycSelfieTips;
        List list35 = (i & 524288) != 0 ? kycCmsContentData.workNatures : list15;
        KycAdditionalDocument kycAdditionalDocument2 = (i & 1048576) != 0 ? kycCmsContentData.additionalDocument : kycAdditionalDocument;
        KycBasicAccount kycBasicAccount2 = (i & 2097152) != 0 ? kycCmsContentData.basicAccount : kycBasicAccount;
        KycRule kycRule2 = (i & 4194304) != 0 ? kycCmsContentData.rule : kycRule;
        KycAllGood kycAllGood2 = (i & 8388608) != 0 ? kycCmsContentData.allGood : kycAllGood;
        KycReview kycReview2 = (i & 16777216) != 0 ? kycCmsContentData.review : kycReview;
        KycSubmit kycSubmit2 = (i & 33554432) != 0 ? kycCmsContentData.submit : kycSubmit;
        List list36 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? kycCmsContentData.incomeSources : list16;
        if ((i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
            list19 = list36;
            list18 = kycCmsContentData.validationRules;
        } else {
            list18 = list17;
            list19 = list36;
        }
        return kycCmsContentData.copy(list30, list21, kycIntro2, num3, num4, list22, list23, list24, list25, list26, list27, list28, kycUploadGuide2, list29, list31, list32, list33, list34, kycSelfieTips2, list35, kycAdditionalDocument2, kycBasicAccount2, kycRule2, kycAllGood2, kycReview2, kycSubmit2, list19, list18);
    }

    public final List<KycDnfbpGuide> component1() {
        return this.dnfbpGuide;
    }

    public final List<KycDocument> component10() {
        return this.otherPrimaryDocuments;
    }

    public final List<KycDocument> component11() {
        return this.secondaryDocuments;
    }

    public final List<KycCaptureGuide> component12() {
        return this.captureGuides;
    }

    public final KycUploadGuide component13() {
        return this.uploadGuides;
    }

    public final List<KycImageQualityGuide> component14() {
        return this.imageQualityGuides;
    }

    public final List<KycNationality> component15() {
        return this.nationalities;
    }

    public final List<KycPhotoTip> component16() {
        return this.photoTips;
    }

    public final List<KycLivePhotoTip> component17() {
        return this.livePhotoTips;
    }

    public final List<KycVideoTip> component18() {
        return this.videoTips;
    }

    public final KycSelfieTips component19() {
        return this.selfieTips;
    }

    public final List<KycOtherDocuments> component2() {
        return this.otherDocuments;
    }

    public final List<KycWorkNature> component20() {
        return this.workNatures;
    }

    public final KycAdditionalDocument component21() {
        return this.additionalDocument;
    }

    public final KycBasicAccount component22() {
        return this.basicAccount;
    }

    public final KycRule component23() {
        return this.rule;
    }

    public final KycAllGood component24() {
        return this.allGood;
    }

    public final KycReview component25() {
        return this.review;
    }

    public final KycSubmit component26() {
        return this.submit;
    }

    public final List<KycIncomeSource> component27() {
        return this.incomeSources;
    }

    public final List<KycValidationRule> component28() {
        return this.validationRules;
    }

    public final KycIntro component3() {
        return this.intro;
    }

    public final Integer component4() {
        return this.maxRetryLimit;
    }

    public final Integer component5() {
        return this.id;
    }

    public final List<KycBenefit> component6() {
        return this.benefits;
    }

    public final List<KycCountry> component7() {
        return this.countries;
    }

    public final List<KycDocument> component8() {
        return this.documents;
    }

    public final List<KycDocument> component9() {
        return this.recommendedDocuments;
    }

    public final KycCmsContentData copy(List<KycDnfbpGuide> list, List<KycOtherDocuments> list2, KycIntro kycIntro, Integer num, Integer num2, List<KycBenefit> list3, List<KycCountry> list4, List<KycDocument> list5, List<KycDocument> list6, List<KycDocument> list7, List<KycDocument> list8, List<KycCaptureGuide> list9, KycUploadGuide kycUploadGuide, List<KycImageQualityGuide> list10, List<KycNationality> list11, List<KycPhotoTip> list12, List<KycLivePhotoTip> list13, List<KycVideoTip> list14, KycSelfieTips kycSelfieTips, List<KycWorkNature> list15, KycAdditionalDocument kycAdditionalDocument, KycBasicAccount kycBasicAccount, KycRule kycRule, KycAllGood kycAllGood, KycReview kycReview, KycSubmit kycSubmit, List<KycIncomeSource> list16, List<KycValidationRule> list17) {
        return new KycCmsContentData(list, list2, kycIntro, num, num2, list3, list4, list5, list6, list7, list8, list9, kycUploadGuide, list10, list11, list12, list13, list14, kycSelfieTips, list15, kycAdditionalDocument, kycBasicAccount, kycRule, kycAllGood, kycReview, kycSubmit, list16, list17);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycCmsContentData)) {
            return false;
        }
        KycCmsContentData kycCmsContentData = (KycCmsContentData) obj;
        return j.b(this.dnfbpGuide, kycCmsContentData.dnfbpGuide) && j.b(this.otherDocuments, kycCmsContentData.otherDocuments) && j.b(this.intro, kycCmsContentData.intro) && j.b(this.maxRetryLimit, kycCmsContentData.maxRetryLimit) && j.b(this.id, kycCmsContentData.id) && j.b(this.benefits, kycCmsContentData.benefits) && j.b(this.countries, kycCmsContentData.countries) && j.b(this.documents, kycCmsContentData.documents) && j.b(this.recommendedDocuments, kycCmsContentData.recommendedDocuments) && j.b(this.otherPrimaryDocuments, kycCmsContentData.otherPrimaryDocuments) && j.b(this.secondaryDocuments, kycCmsContentData.secondaryDocuments) && j.b(this.captureGuides, kycCmsContentData.captureGuides) && j.b(this.uploadGuides, kycCmsContentData.uploadGuides) && j.b(this.imageQualityGuides, kycCmsContentData.imageQualityGuides) && j.b(this.nationalities, kycCmsContentData.nationalities) && j.b(this.photoTips, kycCmsContentData.photoTips) && j.b(this.livePhotoTips, kycCmsContentData.livePhotoTips) && j.b(this.videoTips, kycCmsContentData.videoTips) && j.b(this.selfieTips, kycCmsContentData.selfieTips) && j.b(this.workNatures, kycCmsContentData.workNatures) && j.b(this.additionalDocument, kycCmsContentData.additionalDocument) && j.b(this.basicAccount, kycCmsContentData.basicAccount) && j.b(this.rule, kycCmsContentData.rule) && j.b(this.allGood, kycCmsContentData.allGood) && j.b(this.review, kycCmsContentData.review) && j.b(this.submit, kycCmsContentData.submit) && j.b(this.incomeSources, kycCmsContentData.incomeSources) && j.b(this.validationRules, kycCmsContentData.validationRules);
    }

    public final KycAdditionalDocument getAdditionalDocument() {
        return this.additionalDocument;
    }

    public final KycAllGood getAllGood() {
        return this.allGood;
    }

    public final KycBasicAccount getBasicAccount() {
        return this.basicAccount;
    }

    public final List<KycBenefit> getBenefits() {
        return this.benefits;
    }

    public final List<KycCaptureGuide> getCaptureGuides() {
        return this.captureGuides;
    }

    public final List<KycCountry> getCountries() {
        return this.countries;
    }

    public final List<KycDnfbpGuide> getDnfbpGuide() {
        return this.dnfbpGuide;
    }

    public final List<KycDocument> getDocuments() {
        return this.documents;
    }

    public final Integer getId() {
        return this.id;
    }

    public final List<KycImageQualityGuide> getImageQualityGuides() {
        return this.imageQualityGuides;
    }

    public final List<KycIncomeSource> getIncomeSources() {
        return this.incomeSources;
    }

    public final KycIntro getIntro() {
        return this.intro;
    }

    public final List<KycLivePhotoTip> getLivePhotoTips() {
        return this.livePhotoTips;
    }

    public final Integer getMaxRetryLimit() {
        return this.maxRetryLimit;
    }

    public final List<KycNationality> getNationalities() {
        return this.nationalities;
    }

    public final List<KycOtherDocuments> getOtherDocuments() {
        return this.otherDocuments;
    }

    public final List<KycDocument> getOtherPrimaryDocuments() {
        return this.otherPrimaryDocuments;
    }

    public final List<KycPhotoTip> getPhotoTips() {
        return this.photoTips;
    }

    public final List<KycDocument> getRecommendedDocuments() {
        return this.recommendedDocuments;
    }

    public final KycReview getReview() {
        return this.review;
    }

    public final KycRule getRule() {
        return this.rule;
    }

    public final List<KycDocument> getSecondaryDocuments() {
        return this.secondaryDocuments;
    }

    public final KycSelfieTips getSelfieTips() {
        return this.selfieTips;
    }

    public final KycSubmit getSubmit() {
        return this.submit;
    }

    public final KycUploadGuide getUploadGuides() {
        return this.uploadGuides;
    }

    public final List<KycValidationRule> getValidationRules() {
        return this.validationRules;
    }

    public final List<KycVideoTip> getVideoTips() {
        return this.videoTips;
    }

    public final List<KycWorkNature> getWorkNatures() {
        return this.workNatures;
    }

    public int hashCode() {
        List<KycDnfbpGuide> list = this.dnfbpGuide;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<KycOtherDocuments> list2 = this.otherDocuments;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        KycIntro kycIntro = this.intro;
        int iHashCode3 = (iHashCode2 + (kycIntro == null ? 0 : kycIntro.hashCode())) * 31;
        Integer num = this.maxRetryLimit;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.id;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<KycBenefit> list3 = this.benefits;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<KycCountry> list4 = this.countries;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<KycDocument> list5 = this.documents;
        int iHashCode8 = (iHashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<KycDocument> list6 = this.recommendedDocuments;
        int iHashCode9 = (iHashCode8 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<KycDocument> list7 = this.otherPrimaryDocuments;
        int iHashCode10 = (iHashCode9 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<KycDocument> list8 = this.secondaryDocuments;
        int iHashCode11 = (iHashCode10 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<KycCaptureGuide> list9 = this.captureGuides;
        int iHashCode12 = (iHashCode11 + (list9 == null ? 0 : list9.hashCode())) * 31;
        KycUploadGuide kycUploadGuide = this.uploadGuides;
        int iHashCode13 = (iHashCode12 + (kycUploadGuide == null ? 0 : kycUploadGuide.hashCode())) * 31;
        List<KycImageQualityGuide> list10 = this.imageQualityGuides;
        int iHashCode14 = (iHashCode13 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<KycNationality> list11 = this.nationalities;
        int iHashCode15 = (iHashCode14 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<KycPhotoTip> list12 = this.photoTips;
        int iHashCode16 = (iHashCode15 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<KycLivePhotoTip> list13 = this.livePhotoTips;
        int iHashCode17 = (iHashCode16 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<KycVideoTip> list14 = this.videoTips;
        int iHashCode18 = (iHashCode17 + (list14 == null ? 0 : list14.hashCode())) * 31;
        KycSelfieTips kycSelfieTips = this.selfieTips;
        int iHashCode19 = (iHashCode18 + (kycSelfieTips == null ? 0 : kycSelfieTips.hashCode())) * 31;
        List<KycWorkNature> list15 = this.workNatures;
        int iHashCode20 = (iHashCode19 + (list15 == null ? 0 : list15.hashCode())) * 31;
        KycAdditionalDocument kycAdditionalDocument = this.additionalDocument;
        int iHashCode21 = (iHashCode20 + (kycAdditionalDocument == null ? 0 : kycAdditionalDocument.hashCode())) * 31;
        KycBasicAccount kycBasicAccount = this.basicAccount;
        int iHashCode22 = (iHashCode21 + (kycBasicAccount == null ? 0 : kycBasicAccount.hashCode())) * 31;
        KycRule kycRule = this.rule;
        int iHashCode23 = (iHashCode22 + (kycRule == null ? 0 : kycRule.hashCode())) * 31;
        KycAllGood kycAllGood = this.allGood;
        int iHashCode24 = (iHashCode23 + (kycAllGood == null ? 0 : kycAllGood.hashCode())) * 31;
        KycReview kycReview = this.review;
        int iHashCode25 = (iHashCode24 + (kycReview == null ? 0 : kycReview.hashCode())) * 31;
        KycSubmit kycSubmit = this.submit;
        int iHashCode26 = (iHashCode25 + (kycSubmit == null ? 0 : kycSubmit.hashCode())) * 31;
        List<KycIncomeSource> list16 = this.incomeSources;
        int iHashCode27 = (iHashCode26 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<KycValidationRule> list17 = this.validationRules;
        return iHashCode27 + (list17 != null ? list17.hashCode() : 0);
    }

    public final void setCaptureGuides(List<KycCaptureGuide> list) {
        this.captureGuides = list;
    }

    public final void setImageQualityGuides(List<KycImageQualityGuide> list) {
        this.imageQualityGuides = list;
    }

    public final void setMaxRetryLimit(Integer num) {
        this.maxRetryLimit = num;
    }

    public final void setOtherPrimaryDocuments(List<KycDocument> list) {
        this.otherPrimaryDocuments = list;
    }

    public final void setRecommendedDocuments(List<KycDocument> list) {
        this.recommendedDocuments = list;
    }

    public final void setSecondaryDocuments(List<KycDocument> list) {
        this.secondaryDocuments = list;
    }

    public final void setUploadGuides(KycUploadGuide kycUploadGuide) {
        this.uploadGuides = kycUploadGuide;
    }

    public String toString() {
        return "KycCmsContentData(dnfbpGuide=" + this.dnfbpGuide + ", otherDocuments=" + this.otherDocuments + ", intro=" + this.intro + ", maxRetryLimit=" + this.maxRetryLimit + ", id=" + this.id + ", benefits=" + this.benefits + ", countries=" + this.countries + ", documents=" + this.documents + ", recommendedDocuments=" + this.recommendedDocuments + ", otherPrimaryDocuments=" + this.otherPrimaryDocuments + ", secondaryDocuments=" + this.secondaryDocuments + ", captureGuides=" + this.captureGuides + ", uploadGuides=" + this.uploadGuides + ", imageQualityGuides=" + this.imageQualityGuides + ", nationalities=" + this.nationalities + ", photoTips=" + this.photoTips + ", livePhotoTips=" + this.livePhotoTips + ", videoTips=" + this.videoTips + ", selfieTips=" + this.selfieTips + ", workNatures=" + this.workNatures + ", additionalDocument=" + this.additionalDocument + ", basicAccount=" + this.basicAccount + ", rule=" + this.rule + ", allGood=" + this.allGood + ", review=" + this.review + ", submit=" + this.submit + ", incomeSources=" + this.incomeSources + ", validationRules=" + this.validationRules + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        List<KycDnfbpGuide> list = this.dnfbpGuide;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itP = AbstractC1213b.P(dest, 1, list);
            while (itP.hasNext()) {
                ((KycDnfbpGuide) itP.next()).writeToParcel(dest, i);
            }
        }
        List<KycOtherDocuments> list2 = this.otherDocuments;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP2 = AbstractC1213b.P(dest, 1, list2);
            while (itP2.hasNext()) {
                ((KycOtherDocuments) itP2.next()).writeToParcel(dest, i);
            }
        }
        KycIntro kycIntro = this.intro;
        if (kycIntro == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycIntro.writeToParcel(dest, i);
        }
        Integer num = this.maxRetryLimit;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        Integer num2 = this.id;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num2);
        }
        List<KycBenefit> list3 = this.benefits;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP3 = AbstractC1213b.P(dest, 1, list3);
            while (itP3.hasNext()) {
                ((KycBenefit) itP3.next()).writeToParcel(dest, i);
            }
        }
        List<KycCountry> list4 = this.countries;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP4 = AbstractC1213b.P(dest, 1, list4);
            while (itP4.hasNext()) {
                ((KycCountry) itP4.next()).writeToParcel(dest, i);
            }
        }
        List<KycDocument> list5 = this.documents;
        if (list5 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP5 = AbstractC1213b.P(dest, 1, list5);
            while (itP5.hasNext()) {
                ((KycDocument) itP5.next()).writeToParcel(dest, i);
            }
        }
        List<KycDocument> list6 = this.recommendedDocuments;
        if (list6 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP6 = AbstractC1213b.P(dest, 1, list6);
            while (itP6.hasNext()) {
                ((KycDocument) itP6.next()).writeToParcel(dest, i);
            }
        }
        List<KycDocument> list7 = this.otherPrimaryDocuments;
        if (list7 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP7 = AbstractC1213b.P(dest, 1, list7);
            while (itP7.hasNext()) {
                ((KycDocument) itP7.next()).writeToParcel(dest, i);
            }
        }
        List<KycDocument> list8 = this.secondaryDocuments;
        if (list8 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP8 = AbstractC1213b.P(dest, 1, list8);
            while (itP8.hasNext()) {
                ((KycDocument) itP8.next()).writeToParcel(dest, i);
            }
        }
        List<KycCaptureGuide> list9 = this.captureGuides;
        if (list9 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP9 = AbstractC1213b.P(dest, 1, list9);
            while (itP9.hasNext()) {
                ((KycCaptureGuide) itP9.next()).writeToParcel(dest, i);
            }
        }
        KycUploadGuide kycUploadGuide = this.uploadGuides;
        if (kycUploadGuide == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycUploadGuide.writeToParcel(dest, i);
        }
        List<KycImageQualityGuide> list10 = this.imageQualityGuides;
        if (list10 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP10 = AbstractC1213b.P(dest, 1, list10);
            while (itP10.hasNext()) {
                ((KycImageQualityGuide) itP10.next()).writeToParcel(dest, i);
            }
        }
        List<KycNationality> list11 = this.nationalities;
        if (list11 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP11 = AbstractC1213b.P(dest, 1, list11);
            while (itP11.hasNext()) {
                ((KycNationality) itP11.next()).writeToParcel(dest, i);
            }
        }
        List<KycPhotoTip> list12 = this.photoTips;
        if (list12 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP12 = AbstractC1213b.P(dest, 1, list12);
            while (itP12.hasNext()) {
                ((KycPhotoTip) itP12.next()).writeToParcel(dest, i);
            }
        }
        List<KycLivePhotoTip> list13 = this.livePhotoTips;
        if (list13 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP13 = AbstractC1213b.P(dest, 1, list13);
            while (itP13.hasNext()) {
                ((KycLivePhotoTip) itP13.next()).writeToParcel(dest, i);
            }
        }
        List<KycVideoTip> list14 = this.videoTips;
        if (list14 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP14 = AbstractC1213b.P(dest, 1, list14);
            while (itP14.hasNext()) {
                ((KycVideoTip) itP14.next()).writeToParcel(dest, i);
            }
        }
        KycSelfieTips kycSelfieTips = this.selfieTips;
        if (kycSelfieTips == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycSelfieTips.writeToParcel(dest, i);
        }
        List<KycWorkNature> list15 = this.workNatures;
        if (list15 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP15 = AbstractC1213b.P(dest, 1, list15);
            while (itP15.hasNext()) {
                ((KycWorkNature) itP15.next()).writeToParcel(dest, i);
            }
        }
        KycAdditionalDocument kycAdditionalDocument = this.additionalDocument;
        if (kycAdditionalDocument == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycAdditionalDocument.writeToParcel(dest, i);
        }
        KycBasicAccount kycBasicAccount = this.basicAccount;
        if (kycBasicAccount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycBasicAccount.writeToParcel(dest, i);
        }
        KycRule kycRule = this.rule;
        if (kycRule == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycRule.writeToParcel(dest, i);
        }
        KycAllGood kycAllGood = this.allGood;
        if (kycAllGood == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycAllGood.writeToParcel(dest, i);
        }
        KycReview kycReview = this.review;
        if (kycReview == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycReview.writeToParcel(dest, i);
        }
        KycSubmit kycSubmit = this.submit;
        if (kycSubmit == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycSubmit.writeToParcel(dest, i);
        }
        List<KycIncomeSource> list16 = this.incomeSources;
        if (list16 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP16 = AbstractC1213b.P(dest, 1, list16);
            while (itP16.hasNext()) {
                ((KycIncomeSource) itP16.next()).writeToParcel(dest, i);
            }
        }
        List<KycValidationRule> list17 = this.validationRules;
        if (list17 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP17 = AbstractC1213b.P(dest, 1, list17);
        while (itP17.hasNext()) {
            ((KycValidationRule) itP17.next()).writeToParcel(dest, i);
        }
    }

    public KycCmsContentData(List<KycDnfbpGuide> list, List<KycOtherDocuments> list2, KycIntro kycIntro, Integer num, Integer num2, List<KycBenefit> list3, List<KycCountry> list4, List<KycDocument> list5, List<KycDocument> list6, List<KycDocument> list7, List<KycDocument> list8, List<KycCaptureGuide> list9, KycUploadGuide kycUploadGuide, List<KycImageQualityGuide> list10, List<KycNationality> list11, List<KycPhotoTip> list12, List<KycLivePhotoTip> list13, List<KycVideoTip> list14, KycSelfieTips kycSelfieTips, List<KycWorkNature> list15, KycAdditionalDocument kycAdditionalDocument, KycBasicAccount kycBasicAccount, KycRule kycRule, KycAllGood kycAllGood, KycReview kycReview, KycSubmit kycSubmit, List<KycIncomeSource> list16, List<KycValidationRule> list17) {
        this.dnfbpGuide = list;
        this.otherDocuments = list2;
        this.intro = kycIntro;
        this.maxRetryLimit = num;
        this.id = num2;
        this.benefits = list3;
        this.countries = list4;
        this.documents = list5;
        this.recommendedDocuments = list6;
        this.otherPrimaryDocuments = list7;
        this.secondaryDocuments = list8;
        this.captureGuides = list9;
        this.uploadGuides = kycUploadGuide;
        this.imageQualityGuides = list10;
        this.nationalities = list11;
        this.photoTips = list12;
        this.livePhotoTips = list13;
        this.videoTips = list14;
        this.selfieTips = kycSelfieTips;
        this.workNatures = list15;
        this.additionalDocument = kycAdditionalDocument;
        this.basicAccount = kycBasicAccount;
        this.rule = kycRule;
        this.allGood = kycAllGood;
        this.review = kycReview;
        this.submit = kycSubmit;
        this.incomeSources = list16;
        this.validationRules = list17;
    }

    public KycCmsContentData(List list, List list2, KycIntro kycIntro, Integer num, Integer num2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, KycUploadGuide kycUploadGuide, List list10, List list11, List list12, List list13, List list14, KycSelfieTips kycSelfieTips, List list15, KycAdditionalDocument kycAdditionalDocument, KycBasicAccount kycBasicAccount, KycRule kycRule, KycAllGood kycAllGood, KycReview kycReview, KycSubmit kycSubmit, List list16, List list17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1112C.f9377a : list, (i & 2) != 0 ? C1112C.f9377a : list2, (i & 4) != 0 ? null : kycIntro, (i & 8) != 0 ? null : num, (i & 16) != 0 ? 0 : num2, (i & 32) != 0 ? C1112C.f9377a : list3, (i & 64) != 0 ? C1112C.f9377a : list4, (i & 128) != 0 ? C1112C.f9377a : list5, (i & 256) != 0 ? C1112C.f9377a : list6, (i & 512) != 0 ? C1112C.f9377a : list7, (i & 1024) != 0 ? C1112C.f9377a : list8, (i & 2048) != 0 ? C1112C.f9377a : list9, (i & 4096) != 0 ? null : kycUploadGuide, (i & 8192) != 0 ? C1112C.f9377a : list10, (i & 16384) != 0 ? C1112C.f9377a : list11, (i & 32768) != 0 ? C1112C.f9377a : list12, (i & 65536) != 0 ? C1112C.f9377a : list13, (i & 131072) != 0 ? C1112C.f9377a : list14, (i & 262144) != 0 ? null : kycSelfieTips, (i & 524288) != 0 ? C1112C.f9377a : list15, (i & 1048576) != 0 ? null : kycAdditionalDocument, (i & 2097152) != 0 ? null : kycBasicAccount, (i & 4194304) != 0 ? null : kycRule, (i & 8388608) != 0 ? null : kycAllGood, (i & 16777216) != 0 ? null : kycReview, (i & 33554432) != 0 ? null : kycSubmit, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? C1112C.f9377a : list16, (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? C1112C.f9377a : list17);
    }
}
