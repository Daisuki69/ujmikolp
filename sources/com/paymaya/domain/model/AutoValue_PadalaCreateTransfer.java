package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.PadalaCreateTransfer;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PadalaCreateTransfer extends C$AutoValue_PadalaCreateTransfer {
    public static final Parcelable.Creator<AutoValue_PadalaCreateTransfer> CREATOR = new Parcelable.Creator<AutoValue_PadalaCreateTransfer>() { // from class: com.paymaya.domain.model.AutoValue_PadalaCreateTransfer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PadalaCreateTransfer createFromParcel(Parcel parcel) {
            return new AutoValue_PadalaCreateTransfer((TransferTarget) parcel.readParcelable(PadalaCreateTransfer.class.getClassLoader()), (Amount) parcel.readParcelable(PadalaCreateTransfer.class.getClassLoader()), (TransferEntity) parcel.readParcelable(PadalaCreateTransfer.class.getClassLoader()), (TransferEntity) parcel.readParcelable(PadalaCreateTransfer.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PadalaCreateTransfer[] newArray(int i) {
            return new AutoValue_PadalaCreateTransfer[i];
        }
    };

    public AutoValue_PadalaCreateTransfer(final TransferTarget transferTarget, final Amount amount, @Nullable final TransferEntity transferEntity, @Nullable final TransferEntity transferEntity2) {
        new C$$AutoValue_PadalaCreateTransfer(transferTarget, amount, transferEntity, transferEntity2) { // from class: com.paymaya.domain.model.$AutoValue_PadalaCreateTransfer

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PadalaCreateTransfer$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private final j gson;
                private volatile y transferEntity_adapter;
                private volatile y transferTarget_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(PadalaCreateTransfer)";
                }

                @Override // com.google.gson.y
                public PadalaCreateTransfer read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    PadalaCreateTransfer.Builder builderSBuilder = PadalaCreateTransfer.sBuilder();
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
                                case "sender":
                                    y yVarH2 = this.transferEntity_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(TransferEntity.class);
                                        this.transferEntity_adapter = yVarH2;
                                    }
                                    builderSBuilder.mSender((TransferEntity) yVarH2.read(aVar));
                                    break;
                                case "target":
                                    y yVarH3 = this.transferTarget_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(TransferTarget.class);
                                        this.transferTarget_adapter = yVarH3;
                                    }
                                    builderSBuilder.mTarget((TransferTarget) yVarH3.read(aVar));
                                    break;
                                case "beneficiary":
                                    y yVarH4 = this.transferEntity_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(TransferEntity.class);
                                        this.transferEntity_adapter = yVarH4;
                                    }
                                    builderSBuilder.mBeneficiary((TransferEntity) yVarH4.read(aVar));
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
                public void write(b bVar, PadalaCreateTransfer padalaCreateTransfer) throws IOException {
                    if (padalaCreateTransfer == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TypedValues.AttributesType.S_TARGET);
                    if (padalaCreateTransfer.mTarget() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.transferTarget_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(TransferTarget.class);
                            this.transferTarget_adapter = yVarH;
                        }
                        yVarH.write(bVar, padalaCreateTransfer.mTarget());
                    }
                    bVar.m("amount");
                    if (padalaCreateTransfer.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.amount_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, padalaCreateTransfer.mAmount());
                    }
                    bVar.m("sender");
                    if (padalaCreateTransfer.mSender() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.transferEntity_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(TransferEntity.class);
                            this.transferEntity_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, padalaCreateTransfer.mSender());
                    }
                    bVar.m("beneficiary");
                    if (padalaCreateTransfer.mBeneficiary() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.transferEntity_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(TransferEntity.class);
                            this.transferEntity_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, padalaCreateTransfer.mBeneficiary());
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
        parcel.writeParcelable(mTarget(), i);
        parcel.writeParcelable(mAmount(), i);
        parcel.writeParcelable(mSender(), i);
        parcel.writeParcelable(mBeneficiary(), i);
    }
}
