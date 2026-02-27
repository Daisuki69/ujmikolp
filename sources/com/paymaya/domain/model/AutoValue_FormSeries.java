package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.FormSeries;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_FormSeries extends C$AutoValue_FormSeries {
    public static final Parcelable.Creator<AutoValue_FormSeries> CREATOR = new Parcelable.Creator<AutoValue_FormSeries>() { // from class: com.paymaya.domain.model.AutoValue_FormSeries.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FormSeries createFromParcel(Parcel parcel) {
            return new AutoValue_FormSeries(parcel.readString(), parcel.readString(), parcel.readArrayList(FormSeries.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FormSeries[] newArray(int i) {
            return new AutoValue_FormSeries[i];
        }
    };

    public AutoValue_FormSeries(final String str, final String str2, final List<String> list) {
        new C$$AutoValue_FormSeries(str, str2, list) { // from class: com.paymaya.domain.model.$AutoValue_FormSeries

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_FormSeries$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y list__string_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(FormSeries)";
                }

                @Override // com.google.gson.y
                public FormSeries read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    FormSeries.Builder builderSBuilder = FormSeries.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "form_series":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mFormSeries((String) yVarH.read(aVar));
                                    break;
                                case "tax_type":
                                    y yVarG = this.list__string_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                                        this.list__string_adapter = yVarG;
                                    }
                                    builderSBuilder.mTaxTypeList((List) yVarG.read(aVar));
                                    break;
                                case "form_type":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mFormType((String) yVarH2.read(aVar));
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
                public void write(b bVar, FormSeries formSeries) throws IOException {
                    if (formSeries == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("form_type");
                    if (formSeries.mFormType() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, formSeries.mFormType());
                    }
                    bVar.m("form_series");
                    if (formSeries.mFormSeries() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, formSeries.mFormSeries());
                    }
                    bVar.m("tax_type");
                    if (formSeries.mTaxTypeList() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__string_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                            this.list__string_adapter = yVarG;
                        }
                        yVarG.write(bVar, formSeries.mTaxTypeList());
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
        parcel.writeString(mFormType());
        parcel.writeString(mFormSeries());
        parcel.writeList(mTaxTypeList());
    }
}
