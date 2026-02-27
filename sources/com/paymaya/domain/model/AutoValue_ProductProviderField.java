package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ProductProviderField;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ProductProviderField extends C$AutoValue_ProductProviderField {
    public static final Parcelable.Creator<AutoValue_ProductProviderField> CREATOR = new Parcelable.Creator<AutoValue_ProductProviderField>() { // from class: com.paymaya.domain.model.AutoValue_ProductProviderField.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ProductProviderField createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                boolValueOf = null;
            }
            return new AutoValue_ProductProviderField(string, string2, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ProductProviderField[] newArray(int i) {
            return new AutoValue_ProductProviderField[i];
        }
    };

    public AutoValue_ProductProviderField(final String str, final String str2, @Nullable final Boolean bool) {
        new C$$AutoValue_ProductProviderField(str, str2, bool) { // from class: com.paymaya.domain.model.$AutoValue_ProductProviderField

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ProductProviderField$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(ProductProviderField)";
                }

                @Override // com.google.gson.y
                public ProductProviderField read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    ProductProviderField.Builder builderSBuilder = ProductProviderField.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "hidden":
                                    y yVarH = this.boolean__adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH;
                                    }
                                    builderSBuilder.mIsHidden((Boolean) yVarH.read(aVar));
                                    break;
                                case "code":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mCode((String) yVarH2.read(aVar));
                                    break;
                                case "name":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mName((String) yVarH3.read(aVar));
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
                public void write(b bVar, ProductProviderField productProviderField) throws IOException {
                    if (productProviderField == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("code");
                    if (productProviderField.mCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, productProviderField.mCode());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (productProviderField.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, productProviderField.mName());
                    }
                    bVar.m("hidden");
                    if (productProviderField.mIsHidden() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.boolean__adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH3;
                        }
                        yVarH3.write(bVar, productProviderField.mIsHidden());
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
        parcel.writeString(mCode());
        parcel.writeString(mName());
        if (mIsHidden() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mIsHidden().booleanValue() ? 1 : 0);
        }
    }
}
