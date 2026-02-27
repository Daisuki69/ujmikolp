package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.OrderProviderField;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_OrderProviderField extends C$AutoValue_OrderProviderField {
    public static final Parcelable.Creator<AutoValue_OrderProviderField> CREATOR = new Parcelable.Creator<AutoValue_OrderProviderField>() { // from class: com.paymaya.domain.model.AutoValue_OrderProviderField.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_OrderProviderField createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                boolValueOf = null;
            }
            return new AutoValue_OrderProviderField(string, string2, string3, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_OrderProviderField[] newArray(int i) {
            return new AutoValue_OrderProviderField[i];
        }
    };

    public AutoValue_OrderProviderField(final String str, final String str2, final String str3, @Nullable final Boolean bool) {
        new C$$AutoValue_OrderProviderField(str, str2, str3, bool) { // from class: com.paymaya.domain.model.$AutoValue_OrderProviderField

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_OrderProviderField$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(OrderProviderField)";
                }

                @Override // com.google.gson.y
                public OrderProviderField read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    OrderProviderField.Builder builderSBuilder = OrderProviderField.sBuilder();
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
                                case "value":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mValue((String) yVarH4.read(aVar));
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
                public void write(b bVar, OrderProviderField orderProviderField) throws IOException {
                    if (orderProviderField == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("code");
                    if (orderProviderField.mCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, orderProviderField.mCode());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (orderProviderField.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, orderProviderField.mName());
                    }
                    bVar.m("value");
                    if (orderProviderField.mValue() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, orderProviderField.mValue());
                    }
                    bVar.m("hidden");
                    if (orderProviderField.mIsHidden() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.boolean__adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH4;
                        }
                        yVarH4.write(bVar, orderProviderField.mIsHidden());
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
        parcel.writeString(mValue());
        if (mIsHidden() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mIsHidden().booleanValue() ? 1 : 0);
        }
    }
}
