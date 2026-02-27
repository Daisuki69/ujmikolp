package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.BillerInput;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BillerInput extends C$AutoValue_BillerInput {
    public static final Parcelable.Creator<AutoValue_BillerInput> CREATOR = new Parcelable.Creator<AutoValue_BillerInput>() { // from class: com.paymaya.domain.model.AutoValue_BillerInput.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillerInput createFromParcel(Parcel parcel) {
            return new AutoValue_BillerInput(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Amount) parcel.readParcelable(BillerInput.class.getClassLoader()), parcel.readHashMap(BillerInput.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillerInput[] newArray(int i) {
            return new AutoValue_BillerInput[i];
        }
    };

    public AutoValue_BillerInput(@Nullable final String str, @Nullable final String str2, @Nullable final Amount amount, final Map<String, BillerField> map) {
        new C$$AutoValue_BillerInput(str, str2, amount, map) { // from class: com.paymaya.domain.model.$AutoValue_BillerInput

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BillerInput$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private final j gson;
                private volatile y map__string_billerField_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(BillerInput)";
                }

                @Override // com.google.gson.y
                public BillerInput read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    BillerInput.Builder builderSBuilder = BillerInput.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if ("mSlug".equals(strE)) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mSlug((String) yVarH.read(aVar));
                            } else if ("mAccountNumber".equals(strE)) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mAccountNumber((String) yVarH2.read(aVar));
                            } else if ("mAmount".equals(strE)) {
                                y yVarH3 = this.amount_adapter;
                                if (yVarH3 == null) {
                                    yVarH3 = this.gson.h(Amount.class);
                                    this.amount_adapter = yVarH3;
                                }
                                builderSBuilder.mAmount((Amount) yVarH3.read(aVar));
                            } else if ("mBillerFields".equals(strE)) {
                                y yVarG = this.map__string_billerField_adapter;
                                if (yVarG == null) {
                                    yVarG = this.gson.g(TypeToken.getParameterized(Map.class, String.class, BillerField.class));
                                    this.map__string_billerField_adapter = yVarG;
                                }
                                builderSBuilder.mBillerFields((Map) yVarG.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, BillerInput billerInput) throws IOException {
                    if (billerInput == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("mSlug");
                    if (billerInput.mSlug() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, billerInput.mSlug());
                    }
                    bVar.m("mAccountNumber");
                    if (billerInput.mAccountNumber() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, billerInput.mAccountNumber());
                    }
                    bVar.m("mAmount");
                    if (billerInput.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.amount_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, billerInput.mAmount());
                    }
                    bVar.m("mBillerFields");
                    if (billerInput.mBillerFields() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.map__string_billerField_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(Map.class, String.class, BillerField.class));
                            this.map__string_billerField_adapter = yVarG;
                        }
                        yVarG.write(bVar, billerInput.mBillerFields());
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
        parcel.writeParcelable(mAmount(), i);
        parcel.writeMap(mBillerFields());
    }
}
