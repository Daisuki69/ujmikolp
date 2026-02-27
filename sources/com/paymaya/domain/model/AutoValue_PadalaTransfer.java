package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.PadalaTransfer;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PadalaTransfer extends C$AutoValue_PadalaTransfer {
    public static final Parcelable.Creator<AutoValue_PadalaTransfer> CREATOR = new Parcelable.Creator<AutoValue_PadalaTransfer>() { // from class: com.paymaya.domain.model.AutoValue_PadalaTransfer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PadalaTransfer createFromParcel(Parcel parcel) {
            return new AutoValue_PadalaTransfer((TransferToken) parcel.readParcelable(PadalaTransfer.class.getClassLoader()), (TransferSender) parcel.readParcelable(PadalaTransfer.class.getClassLoader()), (TransferTarget) parcel.readParcelable(PadalaTransfer.class.getClassLoader()), (Amount) parcel.readParcelable(PadalaTransfer.class.getClassLoader()), (Amount) parcel.readParcelable(PadalaTransfer.class.getClassLoader()), (Amount) parcel.readParcelable(PadalaTransfer.class.getClassLoader()), (Amount) parcel.readParcelable(PadalaTransfer.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, (AccountBalance) parcel.readParcelable(PadalaTransfer.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PadalaTransfer[] newArray(int i) {
            return new AutoValue_PadalaTransfer[i];
        }
    };

    public AutoValue_PadalaTransfer(final TransferToken transferToken, @Nullable final TransferSender transferSender, @Nullable final TransferTarget transferTarget, @Nullable final Amount amount, final Amount amount2, @Nullable final Amount amount3, @Nullable final Amount amount4, @Nullable final String str, @Nullable final AccountBalance accountBalance) {
        new C$$AutoValue_PadalaTransfer(transferToken, transferSender, transferTarget, amount, amount2, amount3, amount4, str, accountBalance) { // from class: com.paymaya.domain.model.$AutoValue_PadalaTransfer

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PadalaTransfer$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y accountBalance_adapter;
                private volatile y amount_adapter;
                private final j gson;
                private volatile y string_adapter;
                private volatile y transferSender_adapter;
                private volatile y transferTarget_adapter;
                private volatile y transferToken_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(PadalaTransfer)";
                }

                @Override // com.google.gson.y
                public PadalaTransfer read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    PadalaTransfer.Builder builderSBuilder = PadalaTransfer.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "amount":
                                    y yVarH = this.amount_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH;
                                    }
                                    builderSBuilder.mAmount((Amount) yVarH.read(aVar));
                                    break;
                                case "source":
                                    y yVarH2 = this.transferSender_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(TransferSender.class);
                                        this.transferSender_adapter = yVarH2;
                                    }
                                    builderSBuilder.mSource((TransferSender) yVarH2.read(aVar));
                                    break;
                                case "target":
                                    y yVarH3 = this.transferTarget_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(TransferTarget.class);
                                        this.transferTarget_adapter = yVarH3;
                                    }
                                    builderSBuilder.mTarget((TransferTarget) yVarH3.read(aVar));
                                    break;
                                case "balance":
                                    y yVarH4 = this.accountBalance_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(AccountBalance.class);
                                        this.accountBalance_adapter = yVarH4;
                                    }
                                    builderSBuilder.mBalance((AccountBalance) yVarH4.read(aVar));
                                    break;
                                case "fees":
                                    y yVarH5 = this.amount_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH5;
                                    }
                                    builderSBuilder.mFees((Amount) yVarH5.read(aVar));
                                    break;
                                case "request_reference_no":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mRequestReferenceNo((String) yVarH6.read(aVar));
                                    break;
                                case "commission":
                                    y yVarH7 = this.amount_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH7;
                                    }
                                    builderSBuilder.mCommission((Amount) yVarH7.read(aVar));
                                    break;
                                case "revenue":
                                    y yVarH8 = this.amount_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(Amount.class);
                                        this.amount_adapter = yVarH8;
                                    }
                                    builderSBuilder.mRevenue((Amount) yVarH8.read(aVar));
                                    break;
                                case "transfer_token":
                                    y yVarH9 = this.transferToken_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(TransferToken.class);
                                        this.transferToken_adapter = yVarH9;
                                    }
                                    builderSBuilder.mTransferToken((TransferToken) yVarH9.read(aVar));
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
                public void write(b bVar, PadalaTransfer padalaTransfer) throws IOException {
                    if (padalaTransfer == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("transfer_token");
                    if (padalaTransfer.mTransferToken() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.transferToken_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(TransferToken.class);
                            this.transferToken_adapter = yVarH;
                        }
                        yVarH.write(bVar, padalaTransfer.mTransferToken());
                    }
                    bVar.m("source");
                    if (padalaTransfer.mSource() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.transferSender_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(TransferSender.class);
                            this.transferSender_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, padalaTransfer.mSource());
                    }
                    bVar.m(TypedValues.AttributesType.S_TARGET);
                    if (padalaTransfer.mTarget() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.transferTarget_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(TransferTarget.class);
                            this.transferTarget_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, padalaTransfer.mTarget());
                    }
                    bVar.m("amount");
                    if (padalaTransfer.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.amount_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, padalaTransfer.mAmount());
                    }
                    bVar.m("fees");
                    if (padalaTransfer.mFees() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.amount_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, padalaTransfer.mFees());
                    }
                    bVar.m("revenue");
                    if (padalaTransfer.mRevenue() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.amount_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, padalaTransfer.mRevenue());
                    }
                    bVar.m("commission");
                    if (padalaTransfer.mCommission() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.amount_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, padalaTransfer.mCommission());
                    }
                    bVar.m("request_reference_no");
                    if (padalaTransfer.mRequestReferenceNo() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.string_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(String.class);
                            this.string_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, padalaTransfer.mRequestReferenceNo());
                    }
                    bVar.m("balance");
                    if (padalaTransfer.mBalance() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.accountBalance_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(AccountBalance.class);
                            this.accountBalance_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, padalaTransfer.mBalance());
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
        parcel.writeParcelable(mTransferToken(), i);
        parcel.writeParcelable(mSource(), i);
        parcel.writeParcelable(mTarget(), i);
        parcel.writeParcelable(mAmount(), i);
        parcel.writeParcelable(mFees(), i);
        parcel.writeParcelable(mRevenue(), i);
        parcel.writeParcelable(mCommission(), i);
        if (mRequestReferenceNo() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRequestReferenceNo());
        }
        parcel.writeParcelable(mBalance(), i);
    }
}
