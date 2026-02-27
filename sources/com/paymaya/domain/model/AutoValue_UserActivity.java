package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.UserActivity;
import io.flutter.plugins.firebase.crashlytics.Constants;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_UserActivity extends C$AutoValue_UserActivity {
    public static final Parcelable.Creator<AutoValue_UserActivity> CREATOR = new Parcelable.Creator<AutoValue_UserActivity>() { // from class: com.paymaya.domain.model.AutoValue_UserActivity.1
        /* JADX WARN: Can't rename method to resolve collision */
        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // android.os.Parcelable.Creator
        public com.paymaya.domain.model.AutoValue_UserActivity createFromParcel(android.os.Parcel r45) {
            /*
                Method dump skipped, instruction units count: 643
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paymaya.domain.model.AutoValue_UserActivity.AnonymousClass1.createFromParcel(android.os.Parcel):com.paymaya.domain.model.AutoValue_UserActivity");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserActivity[] newArray(int i) {
            return new AutoValue_UserActivity[i];
        }
    };

    public AutoValue_UserActivity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable ActivityDescription activityDescription, @Nullable Amount amount, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Amount amount2, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable InstapayAccount instapayAccount, @Nullable Fee fee, @Nullable List<BillerDynamicField> list, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable TotalAmount totalAmount, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable Decoration decoration, @Nullable String str31, @Nullable TransferPersonalizationMeta transferPersonalizationMeta, @Nullable Boolean bool) {
        new C$$AutoValue_UserActivity(str, str2, str3, str4, str5, activityDescription, amount, str6, str7, str8, str9, str10, str11, str12, str13, amount2, str14, str15, str16, str17, str18, str19, instapayAccount, fee, list, str20, str21, str22, str23, str24, str25, str26, str27, totalAmount, str28, str29, str30, decoration, str31, transferPersonalizationMeta, bool) { // from class: com.paymaya.domain.model.$AutoValue_UserActivity

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_UserActivity$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y activityDescription_adapter;
                private volatile y amount_adapter;
                private volatile y boolean__adapter;
                private volatile y decoration_adapter;
                private volatile y fee_adapter;
                private final j gson;
                private volatile y instapayAccount_adapter;
                private volatile y list__billerDynamicField_adapter;
                private volatile y string_adapter;
                private volatile y totalAmount_adapter;
                private volatile y transferPersonalizationMeta_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(UserActivity)";
                }

                @Override // com.google.gson.y
                public UserActivity read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    UserActivity.Builder builderSBuilder = UserActivity.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "biller_reason":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mBillerReason((String) yVarH.read(aVar));
                                    break;
                                case "bank_name":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mBankName((String) yVarH2.read(aVar));
                                    break;
                                case "description":
                                    y yVarH3 = this.activityDescription_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(ActivityDescription.class);
                                        this.activityDescription_adapter = yVarH3;
                                    }
                                    builderSBuilder.mDescription((ActivityDescription) yVarH3.read(aVar));
                                    break;
                                case "amount":
                                    y yVarH4 = this.amount_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH4;
                                    }
                                    builderSBuilder.mAmount((Amount) yVarH4.read(aVar));
                                    break;
                                case "p2p_target":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mP2PTarget((String) yVarH5.read(aVar));
                                    break;
                                case "account":
                                    y yVarH6 = this.instapayAccount_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(InstapayAccount.class);
                                        this.instapayAccount_adapter = yVarH6;
                                    }
                                    builderSBuilder.mInstapayAccount((InstapayAccount) yVarH6.read(aVar));
                                    break;
                                case "fund_source_id":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mFundSourceId((String) yVarH7.read(aVar));
                                    break;
                                case "method":
                                    y yVarH8 = this.string_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(String.class);
                                        this.string_adapter = yVarH8;
                                    }
                                    builderSBuilder.mMethod((String) yVarH8.read(aVar));
                                    break;
                                case "auth_amount":
                                    y yVarH9 = this.amount_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH9;
                                    }
                                    builderSBuilder.mAuthAmount((Amount) yVarH9.read(aVar));
                                    break;
                                case "scheme_type":
                                    y yVarH10 = this.string_adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(String.class);
                                        this.string_adapter = yVarH10;
                                    }
                                    builderSBuilder.mSchemeType((String) yVarH10.read(aVar));
                                    break;
                                case "status":
                                    y yVarH11 = this.string_adapter;
                                    if (yVarH11 == null) {
                                        yVarH11 = this.gson.h(String.class);
                                        this.string_adapter = yVarH11;
                                    }
                                    builderSBuilder.mStatus((String) yVarH11.read(aVar));
                                    break;
                                case "account_no":
                                    y yVarH12 = this.string_adapter;
                                    if (yVarH12 == null) {
                                        yVarH12 = this.gson.h(String.class);
                                        this.string_adapter = yVarH12;
                                    }
                                    builderSBuilder.mAccountNo((String) yVarH12.read(aVar));
                                    break;
                                case "payment_reference_no":
                                    y yVarH13 = this.string_adapter;
                                    if (yVarH13 == null) {
                                        yVarH13 = this.gson.h(String.class);
                                        this.string_adapter = yVarH13;
                                    }
                                    builderSBuilder.mPaymentReferenceNo((String) yVarH13.read(aVar));
                                    break;
                                case "merchant_reference_number":
                                    y yVarH14 = this.string_adapter;
                                    if (yVarH14 == null) {
                                        yVarH14 = this.gson.h(String.class);
                                        this.string_adapter = yVarH14;
                                    }
                                    builderSBuilder.mMerchantReferenceNumber((String) yVarH14.read(aVar));
                                    break;
                                case "id":
                                    y yVarH15 = this.string_adapter;
                                    if (yVarH15 == null) {
                                        yVarH15 = this.gson.h(String.class);
                                        this.string_adapter = yVarH15;
                                    }
                                    builderSBuilder.mId((String) yVarH15.read(aVar));
                                    break;
                                case "fee":
                                    y yVarH16 = this.fee_adapter;
                                    if (yVarH16 == null) {
                                        yVarH16 = this.gson.h(Fee.class);
                                        this.fee_adapter = yVarH16;
                                    }
                                    builderSBuilder.mFee((Fee) yVarH16.read(aVar));
                                    break;
                                case "item":
                                    y yVarH17 = this.string_adapter;
                                    if (yVarH17 == null) {
                                        yVarH17 = this.gson.h(String.class);
                                        this.string_adapter = yVarH17;
                                    }
                                    builderSBuilder.mItem((String) yVarH17.read(aVar));
                                    break;
                                case "type":
                                    y yVarH18 = this.string_adapter;
                                    if (yVarH18 == null) {
                                        yVarH18 = this.gson.h(String.class);
                                        this.string_adapter = yVarH18;
                                    }
                                    builderSBuilder.mType((String) yVarH18.read(aVar));
                                    break;
                                case "timestamp":
                                    y yVarH19 = this.string_adapter;
                                    if (yVarH19 == null) {
                                        yVarH19 = this.gson.h(String.class);
                                        this.string_adapter = yVarH19;
                                    }
                                    builderSBuilder.mTimestamp((String) yVarH19.read(aVar));
                                    break;
                                case "request_reference_no":
                                    y yVarH20 = this.string_adapter;
                                    if (yVarH20 == null) {
                                        yVarH20 = this.gson.h(String.class);
                                        this.string_adapter = yVarH20;
                                    }
                                    builderSBuilder.mRequestReferenceNo((String) yVarH20.read(aVar));
                                    break;
                                case "total_amount":
                                    y yVarH21 = this.totalAmount_adapter;
                                    if (yVarH21 == null) {
                                        yVarH21 = this.gson.h(TotalAmount.class);
                                        this.totalAmount_adapter = yVarH21;
                                    }
                                    builderSBuilder.mTotalAmount((TotalAmount) yVarH21.read(aVar));
                                    break;
                                case "trace_number":
                                    y yVarH22 = this.string_adapter;
                                    if (yVarH22 == null) {
                                        yVarH22 = this.gson.h(String.class);
                                        this.string_adapter = yVarH22;
                                    }
                                    builderSBuilder.mTraceNumber((String) yVarH22.read(aVar));
                                    break;
                                case "status_display":
                                    y yVarH23 = this.string_adapter;
                                    if (yVarH23 == null) {
                                        yVarH23 = this.gson.h(String.class);
                                        this.string_adapter = yVarH23;
                                    }
                                    builderSBuilder.mStatusDisplay((String) yVarH23.read(aVar));
                                    break;
                                case "merchant_id":
                                    y yVarH24 = this.string_adapter;
                                    if (yVarH24 == null) {
                                        yVarH24 = this.gson.h(String.class);
                                        this.string_adapter = yVarH24;
                                    }
                                    builderSBuilder.mMerchantId((String) yVarH24.read(aVar));
                                    break;
                                case "invoice_number":
                                    y yVarH25 = this.string_adapter;
                                    if (yVarH25 == null) {
                                        yVarH25 = this.gson.h(String.class);
                                        this.string_adapter = yVarH25;
                                    }
                                    builderSBuilder.mInvoiceNumber((String) yVarH25.read(aVar));
                                    break;
                                case "trace_number_label":
                                    y yVarH26 = this.string_adapter;
                                    if (yVarH26 == null) {
                                        yVarH26 = this.gson.h(String.class);
                                        this.string_adapter = yVarH26;
                                    }
                                    builderSBuilder.mTraceNumberLabel((String) yVarH26.read(aVar));
                                    break;
                                case "invoice_number_label":
                                    y yVarH27 = this.string_adapter;
                                    if (yVarH27 == null) {
                                        yVarH27 = this.gson.h(String.class);
                                        this.string_adapter = yVarH27;
                                    }
                                    builderSBuilder.mInvoiceNumberLabel((String) yVarH27.read(aVar));
                                    break;
                                case "recipient":
                                    y yVarH28 = this.string_adapter;
                                    if (yVarH28 == null) {
                                        yVarH28 = this.gson.h(String.class);
                                        this.string_adapter = yVarH28;
                                    }
                                    builderSBuilder.mRecipient((String) yVarH28.read(aVar));
                                    break;
                                case "biller_slug":
                                    y yVarH29 = this.string_adapter;
                                    if (yVarH29 == null) {
                                        yVarH29 = this.gson.h(String.class);
                                        this.string_adapter = yVarH29;
                                    }
                                    builderSBuilder.mBillerslug((String) yVarH29.read(aVar));
                                    break;
                                case "message":
                                    y yVarH30 = this.string_adapter;
                                    if (yVarH30 == null) {
                                        yVarH30 = this.gson.h(String.class);
                                        this.string_adapter = yVarH30;
                                    }
                                    builderSBuilder.mMessage((String) yVarH30.read(aVar));
                                    break;
                                case "biller_other_fields":
                                    y yVarG = this.list__billerDynamicField_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(List.class, BillerDynamicField.class));
                                        this.list__billerDynamicField_adapter = yVarG;
                                    }
                                    builderSBuilder.mOtherFields((List) yVarG.read(aVar));
                                    break;
                                case "auth_timestamp":
                                    y yVarH31 = this.string_adapter;
                                    if (yVarH31 == null) {
                                        yVarH31 = this.gson.h(String.class);
                                        this.string_adapter = yVarH31;
                                    }
                                    builderSBuilder.mAuthTimestamp((String) yVarH31.read(aVar));
                                    break;
                                case "product_name":
                                    y yVarH32 = this.string_adapter;
                                    if (yVarH32 == null) {
                                        yVarH32 = this.gson.h(String.class);
                                        this.string_adapter = yVarH32;
                                    }
                                    builderSBuilder.mProductName((String) yVarH32.read(aVar));
                                    break;
                                case "payment_id":
                                    y yVarH33 = this.string_adapter;
                                    if (yVarH33 == null) {
                                        yVarH33 = this.gson.h(String.class);
                                        this.string_adapter = yVarH33;
                                    }
                                    builderSBuilder.mPaymentId((String) yVarH33.read(aVar));
                                    break;
                                case "account_last_four":
                                    y yVarH34 = this.string_adapter;
                                    if (yVarH34 == null) {
                                        yVarH34 = this.gson.h(String.class);
                                        this.string_adapter = yVarH34;
                                    }
                                    builderSBuilder.mAccountLastFour((String) yVarH34.read(aVar));
                                    break;
                                case "display":
                                    y yVarH35 = this.string_adapter;
                                    if (yVarH35 == null) {
                                        yVarH35 = this.gson.h(String.class);
                                        this.string_adapter = yVarH35;
                                    }
                                    builderSBuilder.mDisplay((String) yVarH35.read(aVar));
                                    break;
                                case "biller_receipt_no":
                                    y yVarH36 = this.string_adapter;
                                    if (yVarH36 == null) {
                                        yVarH36 = this.gson.h(String.class);
                                        this.string_adapter = yVarH36;
                                    }
                                    builderSBuilder.mBillerReceiptNo((String) yVarH36.read(aVar));
                                    break;
                                default:
                                    if ("mDecoration".equals(strE)) {
                                        y yVarH37 = this.decoration_adapter;
                                        if (yVarH37 == null) {
                                            yVarH37 = this.gson.h(Decoration.class);
                                            this.decoration_adapter = yVarH37;
                                        }
                                        builderSBuilder.mDecoration((Decoration) yVarH37.read(aVar));
                                        break;
                                    } else {
                                        if ("mProvider".equals(strE)) {
                                            y yVarH38 = this.string_adapter;
                                            if (yVarH38 == null) {
                                                yVarH38 = this.gson.h(String.class);
                                                this.string_adapter = yVarH38;
                                            }
                                            builderSBuilder.mProvider((String) yVarH38.read(aVar));
                                        } else if ("mTransferPersonalizationMeta".equals(strE)) {
                                            y yVarH39 = this.transferPersonalizationMeta_adapter;
                                            if (yVarH39 == null) {
                                                yVarH39 = this.gson.h(TransferPersonalizationMeta.class);
                                                this.transferPersonalizationMeta_adapter = yVarH39;
                                            }
                                            builderSBuilder.mTransferPersonalizationMeta((TransferPersonalizationMeta) yVarH39.read(aVar));
                                        } else if (!"mIsAmountVisible".equals(strE)) {
                                            aVar.Q();
                                        } else {
                                            y yVarH40 = this.boolean__adapter;
                                            if (yVarH40 == null) {
                                                yVarH40 = this.gson.h(Boolean.class);
                                                this.boolean__adapter = yVarH40;
                                            }
                                            builderSBuilder.mIsAmountVisible((Boolean) yVarH40.read(aVar));
                                        }
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            aVar.G();
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, UserActivity userActivity) throws IOException {
                    if (userActivity == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (userActivity.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, userActivity.mId());
                    }
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (userActivity.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, userActivity.mType());
                    }
                    bVar.m(Constants.METHOD);
                    if (userActivity.mMethod() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, userActivity.mMethod());
                    }
                    bVar.m("status");
                    if (userActivity.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, userActivity.mStatus());
                    }
                    bVar.m("status_display");
                    if (userActivity.mStatusDisplay() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, userActivity.mStatusDisplay());
                    }
                    bVar.m("description");
                    if (userActivity.mDescription() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.activityDescription_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(ActivityDescription.class);
                            this.activityDescription_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, userActivity.mDescription());
                    }
                    bVar.m("amount");
                    if (userActivity.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.amount_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, userActivity.mAmount());
                    }
                    bVar.m("timestamp");
                    if (userActivity.mTimestamp() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.string_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(String.class);
                            this.string_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, userActivity.mTimestamp());
                    }
                    bVar.m("display");
                    if (userActivity.mDisplay() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.string_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(String.class);
                            this.string_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, userActivity.mDisplay());
                    }
                    bVar.m("item");
                    if (userActivity.mItem() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.string_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(String.class);
                            this.string_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, userActivity.mItem());
                    }
                    bVar.m("message");
                    if (userActivity.mMessage() == null) {
                        bVar.r();
                    } else {
                        y yVarH11 = this.string_adapter;
                        if (yVarH11 == null) {
                            yVarH11 = this.gson.h(String.class);
                            this.string_adapter = yVarH11;
                        }
                        yVarH11.write(bVar, userActivity.mMessage());
                    }
                    bVar.m("recipient");
                    if (userActivity.mRecipient() == null) {
                        bVar.r();
                    } else {
                        y yVarH12 = this.string_adapter;
                        if (yVarH12 == null) {
                            yVarH12 = this.gson.h(String.class);
                            this.string_adapter = yVarH12;
                        }
                        yVarH12.write(bVar, userActivity.mRecipient());
                    }
                    bVar.m("request_reference_no");
                    if (userActivity.mRequestReferenceNo() == null) {
                        bVar.r();
                    } else {
                        y yVarH13 = this.string_adapter;
                        if (yVarH13 == null) {
                            yVarH13 = this.gson.h(String.class);
                            this.string_adapter = yVarH13;
                        }
                        yVarH13.write(bVar, userActivity.mRequestReferenceNo());
                    }
                    bVar.m("payment_reference_no");
                    if (userActivity.mPaymentReferenceNo() == null) {
                        bVar.r();
                    } else {
                        y yVarH14 = this.string_adapter;
                        if (yVarH14 == null) {
                            yVarH14 = this.gson.h(String.class);
                            this.string_adapter = yVarH14;
                        }
                        yVarH14.write(bVar, userActivity.mPaymentReferenceNo());
                    }
                    bVar.m("auth_timestamp");
                    if (userActivity.mAuthTimestamp() == null) {
                        bVar.r();
                    } else {
                        y yVarH15 = this.string_adapter;
                        if (yVarH15 == null) {
                            yVarH15 = this.gson.h(String.class);
                            this.string_adapter = yVarH15;
                        }
                        yVarH15.write(bVar, userActivity.mAuthTimestamp());
                    }
                    bVar.m("auth_amount");
                    if (userActivity.mAuthAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH16 = this.amount_adapter;
                        if (yVarH16 == null) {
                            yVarH16 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH16;
                        }
                        yVarH16.write(bVar, userActivity.mAuthAmount());
                    }
                    bVar.m("fund_source_id");
                    if (userActivity.mFundSourceId() == null) {
                        bVar.r();
                    } else {
                        y yVarH17 = this.string_adapter;
                        if (yVarH17 == null) {
                            yVarH17 = this.gson.h(String.class);
                            this.string_adapter = yVarH17;
                        }
                        yVarH17.write(bVar, userActivity.mFundSourceId());
                    }
                    bVar.m("biller_slug");
                    if (userActivity.mBillerslug() == null) {
                        bVar.r();
                    } else {
                        y yVarH18 = this.string_adapter;
                        if (yVarH18 == null) {
                            yVarH18 = this.gson.h(String.class);
                            this.string_adapter = yVarH18;
                        }
                        yVarH18.write(bVar, userActivity.mBillerslug());
                    }
                    bVar.m("biller_receipt_no");
                    if (userActivity.mBillerReceiptNo() == null) {
                        bVar.r();
                    } else {
                        y yVarH19 = this.string_adapter;
                        if (yVarH19 == null) {
                            yVarH19 = this.gson.h(String.class);
                            this.string_adapter = yVarH19;
                        }
                        yVarH19.write(bVar, userActivity.mBillerReceiptNo());
                    }
                    bVar.m("biller_reason");
                    if (userActivity.mBillerReason() == null) {
                        bVar.r();
                    } else {
                        y yVarH20 = this.string_adapter;
                        if (yVarH20 == null) {
                            yVarH20 = this.gson.h(String.class);
                            this.string_adapter = yVarH20;
                        }
                        yVarH20.write(bVar, userActivity.mBillerReason());
                    }
                    bVar.m("account_no");
                    if (userActivity.mAccountNo() == null) {
                        bVar.r();
                    } else {
                        y yVarH21 = this.string_adapter;
                        if (yVarH21 == null) {
                            yVarH21 = this.gson.h(String.class);
                            this.string_adapter = yVarH21;
                        }
                        yVarH21.write(bVar, userActivity.mAccountNo());
                    }
                    bVar.m("p2p_target");
                    if (userActivity.mP2PTarget() == null) {
                        bVar.r();
                    } else {
                        y yVarH22 = this.string_adapter;
                        if (yVarH22 == null) {
                            yVarH22 = this.gson.h(String.class);
                            this.string_adapter = yVarH22;
                        }
                        yVarH22.write(bVar, userActivity.mP2PTarget());
                    }
                    bVar.m("account");
                    if (userActivity.mInstapayAccount() == null) {
                        bVar.r();
                    } else {
                        y yVarH23 = this.instapayAccount_adapter;
                        if (yVarH23 == null) {
                            yVarH23 = this.gson.h(InstapayAccount.class);
                            this.instapayAccount_adapter = yVarH23;
                        }
                        yVarH23.write(bVar, userActivity.mInstapayAccount());
                    }
                    bVar.m("fee");
                    if (userActivity.mFee() == null) {
                        bVar.r();
                    } else {
                        y yVarH24 = this.fee_adapter;
                        if (yVarH24 == null) {
                            yVarH24 = this.gson.h(Fee.class);
                            this.fee_adapter = yVarH24;
                        }
                        yVarH24.write(bVar, userActivity.mFee());
                    }
                    bVar.m("biller_other_fields");
                    if (userActivity.mOtherFields() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__billerDynamicField_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, BillerDynamicField.class));
                            this.list__billerDynamicField_adapter = yVarG;
                        }
                        yVarG.write(bVar, userActivity.mOtherFields());
                    }
                    bVar.m("account_last_four");
                    if (userActivity.mAccountLastFour() == null) {
                        bVar.r();
                    } else {
                        y yVarH25 = this.string_adapter;
                        if (yVarH25 == null) {
                            yVarH25 = this.gson.h(String.class);
                            this.string_adapter = yVarH25;
                        }
                        yVarH25.write(bVar, userActivity.mAccountLastFour());
                    }
                    bVar.m("payment_id");
                    if (userActivity.mPaymentId() == null) {
                        bVar.r();
                    } else {
                        y yVarH26 = this.string_adapter;
                        if (yVarH26 == null) {
                            yVarH26 = this.gson.h(String.class);
                            this.string_adapter = yVarH26;
                        }
                        yVarH26.write(bVar, userActivity.mPaymentId());
                    }
                    bVar.m("merchant_id");
                    if (userActivity.mMerchantId() == null) {
                        bVar.r();
                    } else {
                        y yVarH27 = this.string_adapter;
                        if (yVarH27 == null) {
                            yVarH27 = this.gson.h(String.class);
                            this.string_adapter = yVarH27;
                        }
                        yVarH27.write(bVar, userActivity.mMerchantId());
                    }
                    bVar.m("bank_name");
                    if (userActivity.mBankName() == null) {
                        bVar.r();
                    } else {
                        y yVarH28 = this.string_adapter;
                        if (yVarH28 == null) {
                            yVarH28 = this.gson.h(String.class);
                            this.string_adapter = yVarH28;
                        }
                        yVarH28.write(bVar, userActivity.mBankName());
                    }
                    bVar.m("trace_number");
                    if (userActivity.mTraceNumber() == null) {
                        bVar.r();
                    } else {
                        y yVarH29 = this.string_adapter;
                        if (yVarH29 == null) {
                            yVarH29 = this.gson.h(String.class);
                            this.string_adapter = yVarH29;
                        }
                        yVarH29.write(bVar, userActivity.mTraceNumber());
                    }
                    bVar.m("trace_number_label");
                    if (userActivity.mTraceNumberLabel() == null) {
                        bVar.r();
                    } else {
                        y yVarH30 = this.string_adapter;
                        if (yVarH30 == null) {
                            yVarH30 = this.gson.h(String.class);
                            this.string_adapter = yVarH30;
                        }
                        yVarH30.write(bVar, userActivity.mTraceNumberLabel());
                    }
                    bVar.m("invoice_number");
                    if (userActivity.mInvoiceNumber() == null) {
                        bVar.r();
                    } else {
                        y yVarH31 = this.string_adapter;
                        if (yVarH31 == null) {
                            yVarH31 = this.gson.h(String.class);
                            this.string_adapter = yVarH31;
                        }
                        yVarH31.write(bVar, userActivity.mInvoiceNumber());
                    }
                    bVar.m("invoice_number_label");
                    if (userActivity.mInvoiceNumberLabel() == null) {
                        bVar.r();
                    } else {
                        y yVarH32 = this.string_adapter;
                        if (yVarH32 == null) {
                            yVarH32 = this.gson.h(String.class);
                            this.string_adapter = yVarH32;
                        }
                        yVarH32.write(bVar, userActivity.mInvoiceNumberLabel());
                    }
                    bVar.m("total_amount");
                    if (userActivity.mTotalAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH33 = this.totalAmount_adapter;
                        if (yVarH33 == null) {
                            yVarH33 = this.gson.h(TotalAmount.class);
                            this.totalAmount_adapter = yVarH33;
                        }
                        yVarH33.write(bVar, userActivity.mTotalAmount());
                    }
                    bVar.m("product_name");
                    if (userActivity.mProductName() == null) {
                        bVar.r();
                    } else {
                        y yVarH34 = this.string_adapter;
                        if (yVarH34 == null) {
                            yVarH34 = this.gson.h(String.class);
                            this.string_adapter = yVarH34;
                        }
                        yVarH34.write(bVar, userActivity.mProductName());
                    }
                    bVar.m("scheme_type");
                    if (userActivity.mSchemeType() == null) {
                        bVar.r();
                    } else {
                        y yVarH35 = this.string_adapter;
                        if (yVarH35 == null) {
                            yVarH35 = this.gson.h(String.class);
                            this.string_adapter = yVarH35;
                        }
                        yVarH35.write(bVar, userActivity.mSchemeType());
                    }
                    bVar.m("merchant_reference_number");
                    if (userActivity.mMerchantReferenceNumber() == null) {
                        bVar.r();
                    } else {
                        y yVarH36 = this.string_adapter;
                        if (yVarH36 == null) {
                            yVarH36 = this.gson.h(String.class);
                            this.string_adapter = yVarH36;
                        }
                        yVarH36.write(bVar, userActivity.mMerchantReferenceNumber());
                    }
                    bVar.m("mDecoration");
                    if (userActivity.mDecoration() == null) {
                        bVar.r();
                    } else {
                        y yVarH37 = this.decoration_adapter;
                        if (yVarH37 == null) {
                            yVarH37 = this.gson.h(Decoration.class);
                            this.decoration_adapter = yVarH37;
                        }
                        yVarH37.write(bVar, userActivity.mDecoration());
                    }
                    bVar.m("mProvider");
                    if (userActivity.mProvider() == null) {
                        bVar.r();
                    } else {
                        y yVarH38 = this.string_adapter;
                        if (yVarH38 == null) {
                            yVarH38 = this.gson.h(String.class);
                            this.string_adapter = yVarH38;
                        }
                        yVarH38.write(bVar, userActivity.mProvider());
                    }
                    bVar.m("mTransferPersonalizationMeta");
                    if (userActivity.mTransferPersonalizationMeta() == null) {
                        bVar.r();
                    } else {
                        y yVarH39 = this.transferPersonalizationMeta_adapter;
                        if (yVarH39 == null) {
                            yVarH39 = this.gson.h(TransferPersonalizationMeta.class);
                            this.transferPersonalizationMeta_adapter = yVarH39;
                        }
                        yVarH39.write(bVar, userActivity.mTransferPersonalizationMeta());
                    }
                    bVar.m("mIsAmountVisible");
                    if (userActivity.mIsAmountVisible() == null) {
                        bVar.r();
                    } else {
                        y yVarH40 = this.boolean__adapter;
                        if (yVarH40 == null) {
                            yVarH40 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH40;
                        }
                        yVarH40.write(bVar, userActivity.mIsAmountVisible());
                    }
                    bVar.k();
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (mId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mId());
        }
        if (mType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mType());
        }
        if (mMethod() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMethod());
        }
        if (mStatus() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mStatus());
        }
        if (mStatusDisplay() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mStatusDisplay());
        }
        parcel.writeParcelable(mDescription(), i);
        parcel.writeParcelable(mAmount(), i);
        if (mTimestamp() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mTimestamp());
        }
        if (mDisplay() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mDisplay());
        }
        if (mItem() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mItem());
        }
        if (mMessage() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMessage());
        }
        if (mRecipient() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRecipient());
        }
        if (mRequestReferenceNo() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRequestReferenceNo());
        }
        if (mPaymentReferenceNo() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mPaymentReferenceNo());
        }
        if (mAuthTimestamp() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mAuthTimestamp());
        }
        parcel.writeParcelable(mAuthAmount(), i);
        if (mFundSourceId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mFundSourceId());
        }
        if (mBillerslug() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBillerslug());
        }
        if (mBillerReceiptNo() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBillerReceiptNo());
        }
        if (mBillerReason() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBillerReason());
        }
        if (mAccountNo() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mAccountNo());
        }
        if (mP2PTarget() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mP2PTarget());
        }
        parcel.writeParcelable(mInstapayAccount(), i);
        parcel.writeParcelable(mFee(), i);
        parcel.writeList(mOtherFields());
        if (mAccountLastFour() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mAccountLastFour());
        }
        if (mPaymentId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mPaymentId());
        }
        if (mMerchantId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMerchantId());
        }
        if (mBankName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBankName());
        }
        if (mTraceNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mTraceNumber());
        }
        if (mTraceNumberLabel() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mTraceNumberLabel());
        }
        if (mInvoiceNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mInvoiceNumber());
        }
        if (mInvoiceNumberLabel() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mInvoiceNumberLabel());
        }
        parcel.writeParcelable(mTotalAmount(), i);
        if (mProductName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mProductName());
        }
        if (mSchemeType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mSchemeType());
        }
        if (mMerchantReferenceNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMerchantReferenceNumber());
        }
        parcel.writeParcelable(mDecoration(), i);
        if (mProvider() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mProvider());
        }
        parcel.writeParcelable(mTransferPersonalizationMeta(), i);
        if (mIsAmountVisible() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mIsAmountVisible().booleanValue() ? 1 : 0);
        }
    }
}
