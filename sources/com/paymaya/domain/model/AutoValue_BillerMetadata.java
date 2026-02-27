package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.BillerMetadata;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BillerMetadata extends C$AutoValue_BillerMetadata {
    public static final Parcelable.Creator<AutoValue_BillerMetadata> CREATOR = new Parcelable.Creator<AutoValue_BillerMetadata>() { // from class: com.paymaya.domain.model.AutoValue_BillerMetadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillerMetadata createFromParcel(Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(BillerMetadata.class.getClassLoader());
            Boolean boolValueOf = null;
            String string = parcel.readInt() == 0 ? parcel.readString() : null;
            String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
            }
            return new AutoValue_BillerMetadata(arrayList, string, string2, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillerMetadata[] newArray(int i) {
            return new AutoValue_BillerMetadata[i];
        }
    };

    public AutoValue_BillerMetadata(final List<String> list, final String str, final String str2, final Boolean bool) {
        new C$$AutoValue_BillerMetadata(list, str, str2, bool) { // from class: com.paymaya.domain.model.$AutoValue_BillerMetadata

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BillerMetadata$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y list__string_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(BillerMetadata)";
                }

                @Override // com.google.gson.y
                public BillerMetadata read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    BillerMetadata.Builder builderSBuilder = BillerMetadata.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "notes":
                                    y yVarG = this.list__string_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                                        this.list__string_adapter = yVarG;
                                    }
                                    builderSBuilder.mNotes((List) yVarG.read(aVar));
                                    break;
                                case "amountPlaceholder":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mAmountPlaceHolder((String) yVarH.read(aVar));
                                    break;
                                case "accountNumberPlaceholder":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mAccountNumberPlaceHolder((String) yVarH2.read(aVar));
                                    break;
                                case "isAccountNumberDisabled":
                                    y yVarH3 = this.boolean__adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH3;
                                    }
                                    builderSBuilder.mIsAccountNumberDisabled((Boolean) yVarH3.read(aVar));
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
                public void write(b bVar, BillerMetadata billerMetadata) throws IOException {
                    if (billerMetadata == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("notes");
                    if (billerMetadata.mNotes() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__string_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                            this.list__string_adapter = yVarG;
                        }
                        yVarG.write(bVar, billerMetadata.mNotes());
                    }
                    bVar.m("accountNumberPlaceholder");
                    if (billerMetadata.mAccountNumberPlaceHolder() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, billerMetadata.mAccountNumberPlaceHolder());
                    }
                    bVar.m("amountPlaceholder");
                    if (billerMetadata.mAmountPlaceHolder() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, billerMetadata.mAmountPlaceHolder());
                    }
                    bVar.m("isAccountNumberDisabled");
                    if (billerMetadata.mIsAccountNumberDisabled() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.boolean__adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH3;
                        }
                        yVarH3.write(bVar, billerMetadata.mIsAccountNumberDisabled());
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
        parcel.writeList(mNotes());
        if (mAccountNumberPlaceHolder() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mAccountNumberPlaceHolder());
        }
        if (mAmountPlaceHolder() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mAmountPlaceHolder());
        }
        if (mIsAccountNumberDisabled() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mIsAccountNumberDisabled().booleanValue() ? 1 : 0);
        }
    }
}
