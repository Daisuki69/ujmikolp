package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.BillsPayRequestDetails;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BillsPayRequestDetails extends C$AutoValue_BillsPayRequestDetails {
    public static final Parcelable.Creator<AutoValue_BillsPayRequestDetails> CREATOR = new Parcelable.Creator<AutoValue_BillsPayRequestDetails>() { // from class: com.paymaya.domain.model.AutoValue_BillsPayRequestDetails.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillsPayRequestDetails createFromParcel(Parcel parcel) {
            return new AutoValue_BillsPayRequestDetails(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillsPayRequestDetails[] newArray(int i) {
            return new AutoValue_BillsPayRequestDetails[i];
        }
    };

    public AutoValue_BillsPayRequestDetails(@Nullable final String str, @Nullable final String str2) {
        new C$$AutoValue_BillsPayRequestDetails(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_BillsPayRequestDetails

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BillsPayRequestDetails$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(BillsPayRequestDetails)";
                }

                @Override // com.google.gson.y
                public BillsPayRequestDetails read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    BillsPayRequestDetails.Builder builderSBuilder = BillsPayRequestDetails.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("slug")) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mSlug((String) yVarH.read(aVar));
                            } else if (strE.equals("account_number")) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mAccountNumber((String) yVarH2.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, BillsPayRequestDetails billsPayRequestDetails) throws IOException {
                    if (billsPayRequestDetails == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("slug");
                    if (billsPayRequestDetails.mSlug() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, billsPayRequestDetails.mSlug());
                    }
                    bVar.m("account_number");
                    if (billsPayRequestDetails.mAccountNumber() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, billsPayRequestDetails.mAccountNumber());
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
        if (mSlug() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mSlug());
        }
        if (mAccountNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mAccountNumber());
        }
    }
}
