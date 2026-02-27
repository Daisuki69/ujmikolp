package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.BankTransferRecipient;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BankTransferRecipient extends C$AutoValue_BankTransferRecipient {
    public static final Parcelable.Creator<AutoValue_BankTransferRecipient> CREATOR = new Parcelable.Creator<AutoValue_BankTransferRecipient>() { // from class: com.paymaya.domain.model.AutoValue_BankTransferRecipient.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BankTransferRecipient createFromParcel(Parcel parcel) {
            return new AutoValue_BankTransferRecipient(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BankTransferRecipient[] newArray(int i) {
            return new AutoValue_BankTransferRecipient[i];
        }
    };

    public AutoValue_BankTransferRecipient(final String str, final String str2) {
        new C$$AutoValue_BankTransferRecipient(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_BankTransferRecipient

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BankTransferRecipient$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(BankTransferRecipient)";
                }

                @Override // com.google.gson.y
                public BankTransferRecipient read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    BankTransferRecipient.Builder builderSBuilder = BankTransferRecipient.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals(SessionDescription.ATTR_TYPE)) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mType((String) yVarH.read(aVar));
                            } else if (strE.equals("value")) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mValue((String) yVarH2.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, BankTransferRecipient bankTransferRecipient) throws IOException {
                    if (bankTransferRecipient == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (bankTransferRecipient.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, bankTransferRecipient.mType());
                    }
                    bVar.m("value");
                    if (bankTransferRecipient.mValue() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, bankTransferRecipient.mValue());
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
        parcel.writeString(mType());
        parcel.writeString(mValue());
    }
}
