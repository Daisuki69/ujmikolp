package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.VoucherRedeemTransaction;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_VoucherRedeemTransaction extends C$AutoValue_VoucherRedeemTransaction {
    public static final Parcelable.Creator<AutoValue_VoucherRedeemTransaction> CREATOR = new Parcelable.Creator<AutoValue_VoucherRedeemTransaction>() { // from class: com.paymaya.domain.model.AutoValue_VoucherRedeemTransaction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoucherRedeemTransaction createFromParcel(Parcel parcel) {
            return new AutoValue_VoucherRedeemTransaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoucherRedeemTransaction[] newArray(int i) {
            return new AutoValue_VoucherRedeemTransaction[i];
        }
    };

    public AutoValue_VoucherRedeemTransaction(final String str, final String str2, final String str3, @Nullable final String str4, @Nullable final String str5, @Nullable final String str6, @Nullable final String str7, final double d10) {
        new C$$AutoValue_VoucherRedeemTransaction(str, str2, str3, str4, str5, str6, str7, d10) { // from class: com.paymaya.domain.model.$AutoValue_VoucherRedeemTransaction

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_VoucherRedeemTransaction$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y double__adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(VoucherRedeemTransaction)";
                }

                @Override // com.google.gson.y
                public VoucherRedeemTransaction read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    VoucherRedeemTransaction.Builder builderSBuilder = VoucherRedeemTransaction.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "amount":
                                    y yVarH = this.double__adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(Double.class);
                                        this.double__adapter = yVarH;
                                    }
                                    builderSBuilder.mAmount(((Double) yVarH.read(aVar)).doubleValue());
                                    break;
                                case "status":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mStatus((String) yVarH2.read(aVar));
                                    break;
                                case "redeemVoucherId":
                                case "redeem_voucher_id":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mRedeemVoucherId((String) yVarH3.read(aVar));
                                    break;
                                case "mi3ReferenceId":
                                case "mi3_reference_id":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mMi3ReferenceId((String) yVarH4.read(aVar));
                                    break;
                                case "voucher_type":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mVoucherType((String) yVarH5.read(aVar));
                                    break;
                                case "external_partner_code":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mExternalPartnerCode((String) yVarH6.read(aVar));
                                    break;
                                case "campaignName":
                                case "campaign_name":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mCampaignName((String) yVarH7.read(aVar));
                                    break;
                                case "redeem_date":
                                case "redeemDate":
                                    y yVarH8 = this.string_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(String.class);
                                        this.string_adapter = yVarH8;
                                    }
                                    builderSBuilder.mRedeemDate((String) yVarH8.read(aVar));
                                    break;
                                default:
                                    aVar.Q();
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
                public void write(b bVar, VoucherRedeemTransaction voucherRedeemTransaction) throws IOException {
                    if (voucherRedeemTransaction == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("redeem_voucher_id");
                    if (voucherRedeemTransaction.mRedeemVoucherId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, voucherRedeemTransaction.mRedeemVoucherId());
                    }
                    bVar.m("campaign_name");
                    if (voucherRedeemTransaction.mCampaignName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, voucherRedeemTransaction.mCampaignName());
                    }
                    bVar.m("status");
                    if (voucherRedeemTransaction.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, voucherRedeemTransaction.mStatus());
                    }
                    bVar.m("mi3_reference_id");
                    if (voucherRedeemTransaction.mMi3ReferenceId() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, voucherRedeemTransaction.mMi3ReferenceId());
                    }
                    bVar.m("redeem_date");
                    if (voucherRedeemTransaction.mRedeemDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, voucherRedeemTransaction.mRedeemDate());
                    }
                    bVar.m("external_partner_code");
                    if (voucherRedeemTransaction.mExternalPartnerCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, voucherRedeemTransaction.mExternalPartnerCode());
                    }
                    bVar.m("voucher_type");
                    if (voucherRedeemTransaction.mVoucherType() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.string_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(String.class);
                            this.string_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, voucherRedeemTransaction.mVoucherType());
                    }
                    bVar.m("amount");
                    y yVarH8 = this.double__adapter;
                    if (yVarH8 == null) {
                        yVarH8 = this.gson.h(Double.class);
                        this.double__adapter = yVarH8;
                    }
                    yVarH8.write(bVar, Double.valueOf(voucherRedeemTransaction.mAmount()));
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
        parcel.writeString(mRedeemVoucherId());
        parcel.writeString(mCampaignName());
        parcel.writeString(mStatus());
        if (mMi3ReferenceId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMi3ReferenceId());
        }
        if (mRedeemDate() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRedeemDate());
        }
        if (mExternalPartnerCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mExternalPartnerCode());
        }
        if (mVoucherType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mVoucherType());
        }
        parcel.writeDouble(mAmount());
    }
}
