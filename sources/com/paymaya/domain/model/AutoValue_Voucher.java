package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.Voucher;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Voucher extends C$AutoValue_Voucher {
    public static final Parcelable.Creator<AutoValue_Voucher> CREATOR = new Parcelable.Creator<AutoValue_Voucher>() { // from class: com.paymaya.domain.model.AutoValue_Voucher.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Voucher createFromParcel(Parcel parcel) {
            return new AutoValue_Voucher(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (VoucherDenomination) parcel.readParcelable(Voucher.class.getClassLoader()), (VoucherNotificationSettings) parcel.readParcelable(Voucher.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt(), parcel.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Voucher[] newArray(int i) {
            return new AutoValue_Voucher[i];
        }
    };

    public AutoValue_Voucher(int i, String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, String str6, String str7, String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable VoucherDenomination voucherDenomination, @Nullable VoucherNotificationSettings voucherNotificationSettings, @Nullable String str14, int i4, boolean z4) {
        new C$$AutoValue_Voucher(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, voucherDenomination, voucherNotificationSettings, str14, i4, z4) { // from class: com.paymaya.domain.model.$AutoValue_Voucher

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Voucher$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y int__adapter;
                private volatile y string_adapter;
                private volatile y voucherDenomination_adapter;
                private volatile y voucherNotificationSettings_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(Voucher)";
                }

                @Override // com.google.gson.y
                public Voucher read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    Voucher.Builder builderSBuilder = Voucher.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "startDate":
                                case "start_date":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mStartDate((String) yVarH.read(aVar));
                                    break;
                                case "bannerUrl":
                                case "banner_url":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mBannerUrl((String) yVarH2.read(aVar));
                                    break;
                                case "endDate":
                                case "end_date":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mEndDate((String) yVarH3.read(aVar));
                                    break;
                                case "assignmentId":
                                case "assignment_id":
                                    y yVarH4 = this.int__adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(Integer.class);
                                        this.int__adapter = yVarH4;
                                    }
                                    builderSBuilder.mAssignmentId(((Integer) yVarH4.read(aVar)).intValue());
                                    break;
                                case "denomination":
                                    y yVarH5 = this.voucherDenomination_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(VoucherDenomination.class);
                                        this.voucherDenomination_adapter = yVarH5;
                                    }
                                    builderSBuilder.mDenomination((VoucherDenomination) yVarH5.read(aVar));
                                    break;
                                case "notification_settings":
                                case "notificationSettings":
                                    y yVarH6 = this.voucherNotificationSettings_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(VoucherNotificationSettings.class);
                                        this.voucherNotificationSettings_adapter = yVarH6;
                                    }
                                    builderSBuilder.mNotificationSettings((VoucherNotificationSettings) yVarH6.read(aVar));
                                    break;
                                case "sender":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mSender((String) yVarH7.read(aVar));
                                    break;
                                case "status":
                                    y yVarH8 = this.string_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(String.class);
                                        this.string_adapter = yVarH8;
                                    }
                                    builderSBuilder.mStatus((String) yVarH8.read(aVar));
                                    break;
                                case "icon_url":
                                case "iconUrl":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.mIconUrl((String) yVarH9.read(aVar));
                                    break;
                                case "faq":
                                    y yVarH10 = this.string_adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(String.class);
                                        this.string_adapter = yVarH10;
                                    }
                                    builderSBuilder.mFaq((String) yVarH10.read(aVar));
                                    break;
                                case "code":
                                    y yVarH11 = this.string_adapter;
                                    if (yVarH11 == null) {
                                        yVarH11 = this.gson.h(String.class);
                                        this.string_adapter = yVarH11;
                                    }
                                    builderSBuilder.mCode((String) yVarH11.read(aVar));
                                    break;
                                case "external_partner_code":
                                    y yVarH12 = this.string_adapter;
                                    if (yVarH12 == null) {
                                        yVarH12 = this.gson.h(String.class);
                                        this.string_adapter = yVarH12;
                                    }
                                    builderSBuilder.mExternalPartnerCode((String) yVarH12.read(aVar));
                                    break;
                                case "campaignName":
                                case "campaign_name":
                                    y yVarH13 = this.string_adapter;
                                    if (yVarH13 == null) {
                                        yVarH13 = this.gson.h(String.class);
                                        this.string_adapter = yVarH13;
                                    }
                                    builderSBuilder.mCampaignName((String) yVarH13.read(aVar));
                                    break;
                                case "redeemed_date":
                                    y yVarH14 = this.string_adapter;
                                    if (yVarH14 == null) {
                                        yVarH14 = this.gson.h(String.class);
                                        this.string_adapter = yVarH14;
                                    }
                                    builderSBuilder.mRedeemedDate((String) yVarH14.read(aVar));
                                    break;
                                case "recipient":
                                    y yVarH15 = this.string_adapter;
                                    if (yVarH15 == null) {
                                        yVarH15 = this.gson.h(String.class);
                                        this.string_adapter = yVarH15;
                                    }
                                    builderSBuilder.mRecipient((String) yVarH15.read(aVar));
                                    break;
                                case "accountName":
                                case "account_name":
                                    y yVarH16 = this.string_adapter;
                                    if (yVarH16 == null) {
                                        yVarH16 = this.gson.h(String.class);
                                        this.string_adapter = yVarH16;
                                    }
                                    builderSBuilder.mAccountName((String) yVarH16.read(aVar));
                                    break;
                                case "mechanics":
                                    y yVarH17 = this.string_adapter;
                                    if (yVarH17 == null) {
                                        yVarH17 = this.gson.h(String.class);
                                        this.string_adapter = yVarH17;
                                    }
                                    builderSBuilder.mMechanics((String) yVarH17.read(aVar));
                                    break;
                                default:
                                    if ("mPage".equals(strE)) {
                                        y yVarH18 = this.int__adapter;
                                        if (yVarH18 == null) {
                                            yVarH18 = this.gson.h(Integer.class);
                                            this.int__adapter = yVarH18;
                                        }
                                        builderSBuilder.mPage(((Integer) yVarH18.read(aVar)).intValue());
                                        break;
                                    } else {
                                        if (!"mHasReminder".equals(strE)) {
                                            aVar.Q();
                                        } else {
                                            y yVarH19 = this.boolean__adapter;
                                            if (yVarH19 == null) {
                                                yVarH19 = this.gson.h(Boolean.class);
                                                this.boolean__adapter = yVarH19;
                                            }
                                            builderSBuilder.mHasReminder(((Boolean) yVarH19.read(aVar)).booleanValue());
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
                public void write(b bVar, Voucher voucher) throws IOException {
                    if (voucher == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("assignment_id");
                    y yVarH = this.int__adapter;
                    if (yVarH == null) {
                        yVarH = this.gson.h(Integer.class);
                        this.int__adapter = yVarH;
                    }
                    yVarH.write(bVar, Integer.valueOf(voucher.mAssignmentId()));
                    bVar.m("account_name");
                    if (voucher.mAccountName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, voucher.mAccountName());
                    }
                    bVar.m("campaign_name");
                    if (voucher.mCampaignName() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, voucher.mCampaignName());
                    }
                    bVar.m("code");
                    if (voucher.mCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, voucher.mCode());
                    }
                    bVar.m("sender");
                    if (voucher.mSender() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, voucher.mSender());
                    }
                    bVar.m("recipient");
                    if (voucher.mRecipient() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, voucher.mRecipient());
                    }
                    bVar.m("status");
                    if (voucher.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.string_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(String.class);
                            this.string_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, voucher.mStatus());
                    }
                    bVar.m("start_date");
                    if (voucher.mStartDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.string_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(String.class);
                            this.string_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, voucher.mStartDate());
                    }
                    bVar.m("end_date");
                    if (voucher.mEndDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.string_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(String.class);
                            this.string_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, voucher.mEndDate());
                    }
                    bVar.m("icon_url");
                    if (voucher.mIconUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.string_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(String.class);
                            this.string_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, voucher.mIconUrl());
                    }
                    bVar.m("banner_url");
                    if (voucher.mBannerUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH11 = this.string_adapter;
                        if (yVarH11 == null) {
                            yVarH11 = this.gson.h(String.class);
                            this.string_adapter = yVarH11;
                        }
                        yVarH11.write(bVar, voucher.mBannerUrl());
                    }
                    bVar.m("faq");
                    if (voucher.mFaq() == null) {
                        bVar.r();
                    } else {
                        y yVarH12 = this.string_adapter;
                        if (yVarH12 == null) {
                            yVarH12 = this.gson.h(String.class);
                            this.string_adapter = yVarH12;
                        }
                        yVarH12.write(bVar, voucher.mFaq());
                    }
                    bVar.m("mechanics");
                    if (voucher.mMechanics() == null) {
                        bVar.r();
                    } else {
                        y yVarH13 = this.string_adapter;
                        if (yVarH13 == null) {
                            yVarH13 = this.gson.h(String.class);
                            this.string_adapter = yVarH13;
                        }
                        yVarH13.write(bVar, voucher.mMechanics());
                    }
                    bVar.m("external_partner_code");
                    if (voucher.mExternalPartnerCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH14 = this.string_adapter;
                        if (yVarH14 == null) {
                            yVarH14 = this.gson.h(String.class);
                            this.string_adapter = yVarH14;
                        }
                        yVarH14.write(bVar, voucher.mExternalPartnerCode());
                    }
                    bVar.m("denomination");
                    if (voucher.mDenomination() == null) {
                        bVar.r();
                    } else {
                        y yVarH15 = this.voucherDenomination_adapter;
                        if (yVarH15 == null) {
                            yVarH15 = this.gson.h(VoucherDenomination.class);
                            this.voucherDenomination_adapter = yVarH15;
                        }
                        yVarH15.write(bVar, voucher.mDenomination());
                    }
                    bVar.m("notification_settings");
                    if (voucher.mNotificationSettings() == null) {
                        bVar.r();
                    } else {
                        y yVarH16 = this.voucherNotificationSettings_adapter;
                        if (yVarH16 == null) {
                            yVarH16 = this.gson.h(VoucherNotificationSettings.class);
                            this.voucherNotificationSettings_adapter = yVarH16;
                        }
                        yVarH16.write(bVar, voucher.mNotificationSettings());
                    }
                    bVar.m("redeemed_date");
                    if (voucher.mRedeemedDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH17 = this.string_adapter;
                        if (yVarH17 == null) {
                            yVarH17 = this.gson.h(String.class);
                            this.string_adapter = yVarH17;
                        }
                        yVarH17.write(bVar, voucher.mRedeemedDate());
                    }
                    bVar.m("mPage");
                    y yVarH18 = this.int__adapter;
                    if (yVarH18 == null) {
                        yVarH18 = this.gson.h(Integer.class);
                        this.int__adapter = yVarH18;
                    }
                    yVarH18.write(bVar, Integer.valueOf(voucher.mPage()));
                    bVar.m("mHasReminder");
                    y yVarH19 = this.boolean__adapter;
                    if (yVarH19 == null) {
                        yVarH19 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH19;
                    }
                    yVarH19.write(bVar, Boolean.valueOf(voucher.mHasReminder()));
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
        parcel.writeInt(mAssignmentId());
        parcel.writeString(mAccountName());
        parcel.writeString(mCampaignName());
        if (mCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mCode());
        }
        if (mSender() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mSender());
        }
        if (mRecipient() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRecipient());
        }
        parcel.writeString(mStatus());
        parcel.writeString(mStartDate());
        parcel.writeString(mEndDate());
        if (mIconUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mIconUrl());
        }
        if (mBannerUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBannerUrl());
        }
        if (mFaq() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mFaq());
        }
        if (mMechanics() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMechanics());
        }
        if (mExternalPartnerCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mExternalPartnerCode());
        }
        parcel.writeParcelable(mDenomination(), i);
        parcel.writeParcelable(mNotificationSettings(), i);
        if (mRedeemedDate() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRedeemedDate());
        }
        parcel.writeInt(mPage());
        parcel.writeInt(mHasReminder() ? 1 : 0);
    }
}
