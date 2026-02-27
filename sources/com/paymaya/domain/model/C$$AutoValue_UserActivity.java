package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.UserActivity;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_UserActivity, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_UserActivity extends UserActivity {
    private final String mAccountLastFour;
    private final String mAccountNo;
    private final Amount mAmount;
    private final Amount mAuthAmount;
    private final String mAuthTimestamp;
    private final String mBankName;
    private final String mBillerReason;
    private final String mBillerReceiptNo;
    private final String mBillerslug;
    private final Decoration mDecoration;
    private final ActivityDescription mDescription;
    private final String mDisplay;
    private final Fee mFee;
    private final String mFundSourceId;
    private final String mId;
    private final InstapayAccount mInstapayAccount;
    private final String mInvoiceNumber;
    private final String mInvoiceNumberLabel;
    private final Boolean mIsAmountVisible;
    private final String mItem;
    private final String mMerchantId;
    private final String mMerchantReferenceNumber;
    private final String mMessage;
    private final String mMethod;
    private final List<BillerDynamicField> mOtherFields;
    private final String mP2PTarget;
    private final String mPaymentId;
    private final String mPaymentReferenceNo;
    private final String mProductName;
    private final String mProvider;
    private final String mRecipient;
    private final String mRequestReferenceNo;
    private final String mSchemeType;
    private final String mStatus;
    private final String mStatusDisplay;
    private final String mTimestamp;
    private final TotalAmount mTotalAmount;
    private final String mTraceNumber;
    private final String mTraceNumberLabel;
    private final TransferPersonalizationMeta mTransferPersonalizationMeta;
    private final String mType;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_UserActivity$Builder */
    public static class Builder extends UserActivity.Builder {
        private String mAccountLastFour;
        private String mAccountNo;
        private Amount mAmount;
        private Amount mAuthAmount;
        private String mAuthTimestamp;
        private String mBankName;
        private String mBillerReason;
        private String mBillerReceiptNo;
        private String mBillerslug;
        private Decoration mDecoration;
        private ActivityDescription mDescription;
        private String mDisplay;
        private Fee mFee;
        private String mFundSourceId;
        private String mId;
        private InstapayAccount mInstapayAccount;
        private String mInvoiceNumber;
        private String mInvoiceNumberLabel;
        private Boolean mIsAmountVisible;
        private String mItem;
        private String mMerchantId;
        private String mMerchantReferenceNumber;
        private String mMessage;
        private String mMethod;
        private List<BillerDynamicField> mOtherFields;
        private String mP2PTarget;
        private String mPaymentId;
        private String mPaymentReferenceNo;
        private String mProductName;
        private String mProvider;
        private String mRecipient;
        private String mRequestReferenceNo;
        private String mSchemeType;
        private String mStatus;
        private String mStatusDisplay;
        private String mTimestamp;
        private TotalAmount mTotalAmount;
        private String mTraceNumber;
        private String mTraceNumberLabel;
        private TransferPersonalizationMeta mTransferPersonalizationMeta;
        private String mType;

        public /* synthetic */ Builder(UserActivity userActivity, int i) {
            this(userActivity);
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity build() {
            return new AutoValue_UserActivity(this.mId, this.mType, this.mMethod, this.mStatus, this.mStatusDisplay, this.mDescription, this.mAmount, this.mTimestamp, this.mDisplay, this.mItem, this.mMessage, this.mRecipient, this.mRequestReferenceNo, this.mPaymentReferenceNo, this.mAuthTimestamp, this.mAuthAmount, this.mFundSourceId, this.mBillerslug, this.mBillerReceiptNo, this.mBillerReason, this.mAccountNo, this.mP2PTarget, this.mInstapayAccount, this.mFee, this.mOtherFields, this.mAccountLastFour, this.mPaymentId, this.mMerchantId, this.mBankName, this.mTraceNumber, this.mTraceNumberLabel, this.mInvoiceNumber, this.mInvoiceNumberLabel, this.mTotalAmount, this.mProductName, this.mSchemeType, this.mMerchantReferenceNumber, this.mDecoration, this.mProvider, this.mTransferPersonalizationMeta, this.mIsAmountVisible);
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mAccountLastFour(@Nullable String str) {
            this.mAccountLastFour = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mAccountNo(@Nullable String str) {
            this.mAccountNo = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mAmount(@Nullable Amount amount) {
            this.mAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mAuthAmount(@Nullable Amount amount) {
            this.mAuthAmount = amount;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mAuthTimestamp(@Nullable String str) {
            this.mAuthTimestamp = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mBankName(@Nullable String str) {
            this.mBankName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mBillerReason(@Nullable String str) {
            this.mBillerReason = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mBillerReceiptNo(@Nullable String str) {
            this.mBillerReceiptNo = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mBillerslug(@Nullable String str) {
            this.mBillerslug = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mDecoration(@Nullable Decoration decoration) {
            this.mDecoration = decoration;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mDescription(@Nullable ActivityDescription activityDescription) {
            this.mDescription = activityDescription;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mDisplay(String str) {
            this.mDisplay = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mFee(@Nullable Fee fee) {
            this.mFee = fee;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mFundSourceId(@Nullable String str) {
            this.mFundSourceId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mId(@Nullable String str) {
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mInstapayAccount(@Nullable InstapayAccount instapayAccount) {
            this.mInstapayAccount = instapayAccount;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mInvoiceNumber(@Nullable String str) {
            this.mInvoiceNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mInvoiceNumberLabel(@Nullable String str) {
            this.mInvoiceNumberLabel = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mIsAmountVisible(@Nullable Boolean bool) {
            this.mIsAmountVisible = bool;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mItem(@Nullable String str) {
            this.mItem = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mMerchantId(@Nullable String str) {
            this.mMerchantId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mMerchantReferenceNumber(@Nullable String str) {
            this.mMerchantReferenceNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mMessage(@Nullable String str) {
            this.mMessage = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mMethod(@Nullable String str) {
            this.mMethod = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mOtherFields(@Nullable List<BillerDynamicField> list) {
            this.mOtherFields = list;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mP2PTarget(@Nullable String str) {
            this.mP2PTarget = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mPaymentId(@Nullable String str) {
            this.mPaymentId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mPaymentReferenceNo(@Nullable String str) {
            this.mPaymentReferenceNo = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mProductName(@Nullable String str) {
            this.mProductName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mProvider(@Nullable String str) {
            this.mProvider = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mRecipient(@Nullable String str) {
            this.mRecipient = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mRequestReferenceNo(@Nullable String str) {
            this.mRequestReferenceNo = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mSchemeType(@Nullable String str) {
            this.mSchemeType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mStatus(@Nullable String str) {
            this.mStatus = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mStatusDisplay(String str) {
            this.mStatusDisplay = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mTimestamp(@Nullable String str) {
            this.mTimestamp = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mTotalAmount(@Nullable TotalAmount totalAmount) {
            this.mTotalAmount = totalAmount;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mTraceNumber(@Nullable String str) {
            this.mTraceNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mTraceNumberLabel(@Nullable String str) {
            this.mTraceNumberLabel = str;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mTransferPersonalizationMeta(@Nullable TransferPersonalizationMeta transferPersonalizationMeta) {
            this.mTransferPersonalizationMeta = transferPersonalizationMeta;
            return this;
        }

        @Override // com.paymaya.domain.model.UserActivity.Builder
        public UserActivity.Builder mType(@Nullable String str) {
            this.mType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(UserActivity userActivity) {
            this.mId = userActivity.mId();
            this.mType = userActivity.mType();
            this.mMethod = userActivity.mMethod();
            this.mStatus = userActivity.mStatus();
            this.mStatusDisplay = userActivity.mStatusDisplay();
            this.mDescription = userActivity.mDescription();
            this.mAmount = userActivity.mAmount();
            this.mTimestamp = userActivity.mTimestamp();
            this.mDisplay = userActivity.mDisplay();
            this.mItem = userActivity.mItem();
            this.mMessage = userActivity.mMessage();
            this.mRecipient = userActivity.mRecipient();
            this.mRequestReferenceNo = userActivity.mRequestReferenceNo();
            this.mPaymentReferenceNo = userActivity.mPaymentReferenceNo();
            this.mAuthTimestamp = userActivity.mAuthTimestamp();
            this.mAuthAmount = userActivity.mAuthAmount();
            this.mFundSourceId = userActivity.mFundSourceId();
            this.mBillerslug = userActivity.mBillerslug();
            this.mBillerReceiptNo = userActivity.mBillerReceiptNo();
            this.mBillerReason = userActivity.mBillerReason();
            this.mAccountNo = userActivity.mAccountNo();
            this.mP2PTarget = userActivity.mP2PTarget();
            this.mInstapayAccount = userActivity.mInstapayAccount();
            this.mFee = userActivity.mFee();
            this.mOtherFields = userActivity.mOtherFields();
            this.mAccountLastFour = userActivity.mAccountLastFour();
            this.mPaymentId = userActivity.mPaymentId();
            this.mMerchantId = userActivity.mMerchantId();
            this.mBankName = userActivity.mBankName();
            this.mTraceNumber = userActivity.mTraceNumber();
            this.mTraceNumberLabel = userActivity.mTraceNumberLabel();
            this.mInvoiceNumber = userActivity.mInvoiceNumber();
            this.mInvoiceNumberLabel = userActivity.mInvoiceNumberLabel();
            this.mTotalAmount = userActivity.mTotalAmount();
            this.mProductName = userActivity.mProductName();
            this.mSchemeType = userActivity.mSchemeType();
            this.mMerchantReferenceNumber = userActivity.mMerchantReferenceNumber();
            this.mDecoration = userActivity.mDecoration();
            this.mProvider = userActivity.mProvider();
            this.mTransferPersonalizationMeta = userActivity.mTransferPersonalizationMeta();
            this.mIsAmountVisible = userActivity.mIsAmountVisible();
        }
    }

    public C$$AutoValue_UserActivity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable ActivityDescription activityDescription, @Nullable Amount amount, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Amount amount2, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable InstapayAccount instapayAccount, @Nullable Fee fee, @Nullable List<BillerDynamicField> list, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable TotalAmount totalAmount, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable Decoration decoration, @Nullable String str31, @Nullable TransferPersonalizationMeta transferPersonalizationMeta, @Nullable Boolean bool) {
        this.mId = str;
        this.mType = str2;
        this.mMethod = str3;
        this.mStatus = str4;
        this.mStatusDisplay = str5;
        this.mDescription = activityDescription;
        this.mAmount = amount;
        this.mTimestamp = str6;
        this.mDisplay = str7;
        this.mItem = str8;
        this.mMessage = str9;
        this.mRecipient = str10;
        this.mRequestReferenceNo = str11;
        this.mPaymentReferenceNo = str12;
        this.mAuthTimestamp = str13;
        this.mAuthAmount = amount2;
        this.mFundSourceId = str14;
        this.mBillerslug = str15;
        this.mBillerReceiptNo = str16;
        this.mBillerReason = str17;
        this.mAccountNo = str18;
        this.mP2PTarget = str19;
        this.mInstapayAccount = instapayAccount;
        this.mFee = fee;
        this.mOtherFields = list;
        this.mAccountLastFour = str20;
        this.mPaymentId = str21;
        this.mMerchantId = str22;
        this.mBankName = str23;
        this.mTraceNumber = str24;
        this.mTraceNumberLabel = str25;
        this.mInvoiceNumber = str26;
        this.mInvoiceNumberLabel = str27;
        this.mTotalAmount = totalAmount;
        this.mProductName = str28;
        this.mSchemeType = str29;
        this.mMerchantReferenceNumber = str30;
        this.mDecoration = decoration;
        this.mProvider = str31;
        this.mTransferPersonalizationMeta = transferPersonalizationMeta;
        this.mIsAmountVisible = bool;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserActivity) {
            UserActivity userActivity = (UserActivity) obj;
            String str = this.mId;
            if (str != null ? str.equals(userActivity.mId()) : userActivity.mId() == null) {
                String str2 = this.mType;
                if (str2 != null ? str2.equals(userActivity.mType()) : userActivity.mType() == null) {
                    String str3 = this.mMethod;
                    if (str3 != null ? str3.equals(userActivity.mMethod()) : userActivity.mMethod() == null) {
                        String str4 = this.mStatus;
                        if (str4 != null ? str4.equals(userActivity.mStatus()) : userActivity.mStatus() == null) {
                            String str5 = this.mStatusDisplay;
                            if (str5 != null ? str5.equals(userActivity.mStatusDisplay()) : userActivity.mStatusDisplay() == null) {
                                ActivityDescription activityDescription = this.mDescription;
                                if (activityDescription != null ? activityDescription.equals(userActivity.mDescription()) : userActivity.mDescription() == null) {
                                    Amount amount = this.mAmount;
                                    if (amount != null ? amount.equals(userActivity.mAmount()) : userActivity.mAmount() == null) {
                                        String str6 = this.mTimestamp;
                                        if (str6 != null ? str6.equals(userActivity.mTimestamp()) : userActivity.mTimestamp() == null) {
                                            String str7 = this.mDisplay;
                                            if (str7 != null ? str7.equals(userActivity.mDisplay()) : userActivity.mDisplay() == null) {
                                                String str8 = this.mItem;
                                                if (str8 != null ? str8.equals(userActivity.mItem()) : userActivity.mItem() == null) {
                                                    String str9 = this.mMessage;
                                                    if (str9 != null ? str9.equals(userActivity.mMessage()) : userActivity.mMessage() == null) {
                                                        String str10 = this.mRecipient;
                                                        if (str10 != null ? str10.equals(userActivity.mRecipient()) : userActivity.mRecipient() == null) {
                                                            String str11 = this.mRequestReferenceNo;
                                                            if (str11 != null ? str11.equals(userActivity.mRequestReferenceNo()) : userActivity.mRequestReferenceNo() == null) {
                                                                String str12 = this.mPaymentReferenceNo;
                                                                if (str12 != null ? str12.equals(userActivity.mPaymentReferenceNo()) : userActivity.mPaymentReferenceNo() == null) {
                                                                    String str13 = this.mAuthTimestamp;
                                                                    if (str13 != null ? str13.equals(userActivity.mAuthTimestamp()) : userActivity.mAuthTimestamp() == null) {
                                                                        Amount amount2 = this.mAuthAmount;
                                                                        if (amount2 != null ? amount2.equals(userActivity.mAuthAmount()) : userActivity.mAuthAmount() == null) {
                                                                            String str14 = this.mFundSourceId;
                                                                            if (str14 != null ? str14.equals(userActivity.mFundSourceId()) : userActivity.mFundSourceId() == null) {
                                                                                String str15 = this.mBillerslug;
                                                                                if (str15 != null ? str15.equals(userActivity.mBillerslug()) : userActivity.mBillerslug() == null) {
                                                                                    String str16 = this.mBillerReceiptNo;
                                                                                    if (str16 != null ? str16.equals(userActivity.mBillerReceiptNo()) : userActivity.mBillerReceiptNo() == null) {
                                                                                        String str17 = this.mBillerReason;
                                                                                        if (str17 != null ? str17.equals(userActivity.mBillerReason()) : userActivity.mBillerReason() == null) {
                                                                                            String str18 = this.mAccountNo;
                                                                                            if (str18 != null ? str18.equals(userActivity.mAccountNo()) : userActivity.mAccountNo() == null) {
                                                                                                String str19 = this.mP2PTarget;
                                                                                                if (str19 != null ? str19.equals(userActivity.mP2PTarget()) : userActivity.mP2PTarget() == null) {
                                                                                                    InstapayAccount instapayAccount = this.mInstapayAccount;
                                                                                                    if (instapayAccount != null ? instapayAccount.equals(userActivity.mInstapayAccount()) : userActivity.mInstapayAccount() == null) {
                                                                                                        Fee fee = this.mFee;
                                                                                                        if (fee != null ? fee.equals(userActivity.mFee()) : userActivity.mFee() == null) {
                                                                                                            List<BillerDynamicField> list = this.mOtherFields;
                                                                                                            if (list != null ? list.equals(userActivity.mOtherFields()) : userActivity.mOtherFields() == null) {
                                                                                                                String str20 = this.mAccountLastFour;
                                                                                                                if (str20 != null ? str20.equals(userActivity.mAccountLastFour()) : userActivity.mAccountLastFour() == null) {
                                                                                                                    String str21 = this.mPaymentId;
                                                                                                                    if (str21 != null ? str21.equals(userActivity.mPaymentId()) : userActivity.mPaymentId() == null) {
                                                                                                                        String str22 = this.mMerchantId;
                                                                                                                        if (str22 != null ? str22.equals(userActivity.mMerchantId()) : userActivity.mMerchantId() == null) {
                                                                                                                            String str23 = this.mBankName;
                                                                                                                            if (str23 != null ? str23.equals(userActivity.mBankName()) : userActivity.mBankName() == null) {
                                                                                                                                String str24 = this.mTraceNumber;
                                                                                                                                if (str24 != null ? str24.equals(userActivity.mTraceNumber()) : userActivity.mTraceNumber() == null) {
                                                                                                                                    String str25 = this.mTraceNumberLabel;
                                                                                                                                    if (str25 != null ? str25.equals(userActivity.mTraceNumberLabel()) : userActivity.mTraceNumberLabel() == null) {
                                                                                                                                        String str26 = this.mInvoiceNumber;
                                                                                                                                        if (str26 != null ? str26.equals(userActivity.mInvoiceNumber()) : userActivity.mInvoiceNumber() == null) {
                                                                                                                                            String str27 = this.mInvoiceNumberLabel;
                                                                                                                                            if (str27 != null ? str27.equals(userActivity.mInvoiceNumberLabel()) : userActivity.mInvoiceNumberLabel() == null) {
                                                                                                                                                TotalAmount totalAmount = this.mTotalAmount;
                                                                                                                                                if (totalAmount != null ? totalAmount.equals(userActivity.mTotalAmount()) : userActivity.mTotalAmount() == null) {
                                                                                                                                                    String str28 = this.mProductName;
                                                                                                                                                    if (str28 != null ? str28.equals(userActivity.mProductName()) : userActivity.mProductName() == null) {
                                                                                                                                                        String str29 = this.mSchemeType;
                                                                                                                                                        if (str29 != null ? str29.equals(userActivity.mSchemeType()) : userActivity.mSchemeType() == null) {
                                                                                                                                                            String str30 = this.mMerchantReferenceNumber;
                                                                                                                                                            if (str30 != null ? str30.equals(userActivity.mMerchantReferenceNumber()) : userActivity.mMerchantReferenceNumber() == null) {
                                                                                                                                                                Decoration decoration = this.mDecoration;
                                                                                                                                                                if (decoration != null ? decoration.equals(userActivity.mDecoration()) : userActivity.mDecoration() == null) {
                                                                                                                                                                    String str31 = this.mProvider;
                                                                                                                                                                    if (str31 != null ? str31.equals(userActivity.mProvider()) : userActivity.mProvider() == null) {
                                                                                                                                                                        TransferPersonalizationMeta transferPersonalizationMeta = this.mTransferPersonalizationMeta;
                                                                                                                                                                        if (transferPersonalizationMeta != null ? transferPersonalizationMeta.equals(userActivity.mTransferPersonalizationMeta()) : userActivity.mTransferPersonalizationMeta() == null) {
                                                                                                                                                                            Boolean bool = this.mIsAmountVisible;
                                                                                                                                                                            if (bool != null ? bool.equals(userActivity.mIsAmountVisible()) : userActivity.mIsAmountVisible() == null) {
                                                                                                                                                                                return true;
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
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mId;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mType;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mMethod;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mStatus;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mStatusDisplay;
        int iHashCode5 = (iHashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        ActivityDescription activityDescription = this.mDescription;
        int iHashCode6 = (iHashCode5 ^ (activityDescription == null ? 0 : activityDescription.hashCode())) * 1000003;
        Amount amount = this.mAmount;
        int iHashCode7 = (iHashCode6 ^ (amount == null ? 0 : amount.hashCode())) * 1000003;
        String str6 = this.mTimestamp;
        int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.mDisplay;
        int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.mItem;
        int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.mMessage;
        int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.mRecipient;
        int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.mRequestReferenceNo;
        int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        String str12 = this.mPaymentReferenceNo;
        int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        String str13 = this.mAuthTimestamp;
        int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        Amount amount2 = this.mAuthAmount;
        int iHashCode16 = (iHashCode15 ^ (amount2 == null ? 0 : amount2.hashCode())) * 1000003;
        String str14 = this.mFundSourceId;
        int iHashCode17 = (iHashCode16 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
        String str15 = this.mBillerslug;
        int iHashCode18 = (iHashCode17 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
        String str16 = this.mBillerReceiptNo;
        int iHashCode19 = (iHashCode18 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
        String str17 = this.mBillerReason;
        int iHashCode20 = (iHashCode19 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
        String str18 = this.mAccountNo;
        int iHashCode21 = (iHashCode20 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
        String str19 = this.mP2PTarget;
        int iHashCode22 = (iHashCode21 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
        InstapayAccount instapayAccount = this.mInstapayAccount;
        int iHashCode23 = (iHashCode22 ^ (instapayAccount == null ? 0 : instapayAccount.hashCode())) * 1000003;
        Fee fee = this.mFee;
        int iHashCode24 = (iHashCode23 ^ (fee == null ? 0 : fee.hashCode())) * 1000003;
        List<BillerDynamicField> list = this.mOtherFields;
        int iHashCode25 = (iHashCode24 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        String str20 = this.mAccountLastFour;
        int iHashCode26 = (iHashCode25 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
        String str21 = this.mPaymentId;
        int iHashCode27 = (iHashCode26 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
        String str22 = this.mMerchantId;
        int iHashCode28 = (iHashCode27 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
        String str23 = this.mBankName;
        int iHashCode29 = (iHashCode28 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
        String str24 = this.mTraceNumber;
        int iHashCode30 = (iHashCode29 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
        String str25 = this.mTraceNumberLabel;
        int iHashCode31 = (iHashCode30 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
        String str26 = this.mInvoiceNumber;
        int iHashCode32 = (iHashCode31 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
        String str27 = this.mInvoiceNumberLabel;
        int iHashCode33 = (iHashCode32 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
        TotalAmount totalAmount = this.mTotalAmount;
        int iHashCode34 = (iHashCode33 ^ (totalAmount == null ? 0 : totalAmount.hashCode())) * 1000003;
        String str28 = this.mProductName;
        int iHashCode35 = (iHashCode34 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
        String str29 = this.mSchemeType;
        int iHashCode36 = (iHashCode35 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
        String str30 = this.mMerchantReferenceNumber;
        int iHashCode37 = (iHashCode36 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
        Decoration decoration = this.mDecoration;
        int iHashCode38 = (iHashCode37 ^ (decoration == null ? 0 : decoration.hashCode())) * 1000003;
        String str31 = this.mProvider;
        int iHashCode39 = (iHashCode38 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
        TransferPersonalizationMeta transferPersonalizationMeta = this.mTransferPersonalizationMeta;
        int iHashCode40 = (iHashCode39 ^ (transferPersonalizationMeta == null ? 0 : transferPersonalizationMeta.hashCode())) * 1000003;
        Boolean bool = this.mIsAmountVisible;
        return iHashCode40 ^ (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("account_last_four")
    public String mAccountLastFour() {
        return this.mAccountLastFour;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("account_no")
    public String mAccountNo() {
        return this.mAccountNo;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("amount")
    public Amount mAmount() {
        return this.mAmount;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("auth_amount")
    public Amount mAuthAmount() {
        return this.mAuthAmount;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("auth_timestamp")
    public String mAuthTimestamp() {
        return this.mAuthTimestamp;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("bank_name")
    public String mBankName() {
        return this.mBankName;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("biller_reason")
    public String mBillerReason() {
        return this.mBillerReason;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("biller_receipt_no")
    public String mBillerReceiptNo() {
        return this.mBillerReceiptNo;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("biller_slug")
    public String mBillerslug() {
        return this.mBillerslug;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    public Decoration mDecoration() {
        return this.mDecoration;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("description")
    public ActivityDescription mDescription() {
        return this.mDescription;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("display")
    public String mDisplay() {
        return this.mDisplay;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("fee")
    public Fee mFee() {
        return this.mFee;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("fund_source_id")
    public String mFundSourceId() {
        return this.mFundSourceId;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("account")
    public InstapayAccount mInstapayAccount() {
        return this.mInstapayAccount;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("invoice_number")
    public String mInvoiceNumber() {
        return this.mInvoiceNumber;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("invoice_number_label")
    public String mInvoiceNumberLabel() {
        return this.mInvoiceNumberLabel;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    public Boolean mIsAmountVisible() {
        return this.mIsAmountVisible;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("item")
    public String mItem() {
        return this.mItem;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("merchant_id")
    public String mMerchantId() {
        return this.mMerchantId;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("merchant_reference_number")
    public String mMerchantReferenceNumber() {
        return this.mMerchantReferenceNumber;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("message")
    public String mMessage() {
        return this.mMessage;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b(Constants.METHOD)
    public String mMethod() {
        return this.mMethod;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("biller_other_fields")
    public List<BillerDynamicField> mOtherFields() {
        return this.mOtherFields;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("p2p_target")
    public String mP2PTarget() {
        return this.mP2PTarget;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("payment_id")
    public String mPaymentId() {
        return this.mPaymentId;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("payment_reference_no")
    public String mPaymentReferenceNo() {
        return this.mPaymentReferenceNo;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("product_name")
    public String mProductName() {
        return this.mProductName;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    public String mProvider() {
        return this.mProvider;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("recipient")
    public String mRecipient() {
        return this.mRecipient;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("request_reference_no")
    public String mRequestReferenceNo() {
        return this.mRequestReferenceNo;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("scheme_type")
    public String mSchemeType() {
        return this.mSchemeType;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("status_display")
    public String mStatusDisplay() {
        return this.mStatusDisplay;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("timestamp")
    public String mTimestamp() {
        return this.mTimestamp;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("total_amount")
    public TotalAmount mTotalAmount() {
        return this.mTotalAmount;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("trace_number")
    public String mTraceNumber() {
        return this.mTraceNumber;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b("trace_number_label")
    public String mTraceNumberLabel() {
        return this.mTraceNumberLabel;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    public TransferPersonalizationMeta mTransferPersonalizationMeta() {
        return this.mTransferPersonalizationMeta;
    }

    @Override // com.paymaya.domain.model.UserActivity
    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.UserActivity
    public UserActivity.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserActivity{mId=");
        sb2.append(this.mId);
        sb2.append(", mType=");
        sb2.append(this.mType);
        sb2.append(", mMethod=");
        sb2.append(this.mMethod);
        sb2.append(", mStatus=");
        sb2.append(this.mStatus);
        sb2.append(", mStatusDisplay=");
        sb2.append(this.mStatusDisplay);
        sb2.append(", mDescription=");
        sb2.append(this.mDescription);
        sb2.append(", mAmount=");
        sb2.append(this.mAmount);
        sb2.append(", mTimestamp=");
        sb2.append(this.mTimestamp);
        sb2.append(", mDisplay=");
        sb2.append(this.mDisplay);
        sb2.append(", mItem=");
        sb2.append(this.mItem);
        sb2.append(", mMessage=");
        sb2.append(this.mMessage);
        sb2.append(", mRecipient=");
        sb2.append(this.mRecipient);
        sb2.append(", mRequestReferenceNo=");
        sb2.append(this.mRequestReferenceNo);
        sb2.append(", mPaymentReferenceNo=");
        sb2.append(this.mPaymentReferenceNo);
        sb2.append(", mAuthTimestamp=");
        sb2.append(this.mAuthTimestamp);
        sb2.append(", mAuthAmount=");
        sb2.append(this.mAuthAmount);
        sb2.append(", mFundSourceId=");
        sb2.append(this.mFundSourceId);
        sb2.append(", mBillerslug=");
        sb2.append(this.mBillerslug);
        sb2.append(", mBillerReceiptNo=");
        sb2.append(this.mBillerReceiptNo);
        sb2.append(", mBillerReason=");
        sb2.append(this.mBillerReason);
        sb2.append(", mAccountNo=");
        sb2.append(this.mAccountNo);
        sb2.append(", mP2PTarget=");
        sb2.append(this.mP2PTarget);
        sb2.append(", mInstapayAccount=");
        sb2.append(this.mInstapayAccount);
        sb2.append(", mFee=");
        sb2.append(this.mFee);
        sb2.append(", mOtherFields=");
        sb2.append(this.mOtherFields);
        sb2.append(", mAccountLastFour=");
        sb2.append(this.mAccountLastFour);
        sb2.append(", mPaymentId=");
        sb2.append(this.mPaymentId);
        sb2.append(", mMerchantId=");
        sb2.append(this.mMerchantId);
        sb2.append(", mBankName=");
        sb2.append(this.mBankName);
        sb2.append(", mTraceNumber=");
        sb2.append(this.mTraceNumber);
        sb2.append(", mTraceNumberLabel=");
        sb2.append(this.mTraceNumberLabel);
        sb2.append(", mInvoiceNumber=");
        sb2.append(this.mInvoiceNumber);
        sb2.append(", mInvoiceNumberLabel=");
        sb2.append(this.mInvoiceNumberLabel);
        sb2.append(", mTotalAmount=");
        sb2.append(this.mTotalAmount);
        sb2.append(", mProductName=");
        sb2.append(this.mProductName);
        sb2.append(", mSchemeType=");
        sb2.append(this.mSchemeType);
        sb2.append(", mMerchantReferenceNumber=");
        sb2.append(this.mMerchantReferenceNumber);
        sb2.append(", mDecoration=");
        sb2.append(this.mDecoration);
        sb2.append(", mProvider=");
        sb2.append(this.mProvider);
        sb2.append(", mTransferPersonalizationMeta=");
        sb2.append(this.mTransferPersonalizationMeta);
        sb2.append(", mIsAmountVisible=");
        return AbstractC1213b.N(sb2, this.mIsAmountVisible, "}");
    }
}
