package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.ProductProviderDetails;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ProductProviderDetails extends C$AutoValue_ProductProviderDetails {
    public static final Parcelable.Creator<AutoValue_ProductProviderDetails> CREATOR = new Parcelable.Creator<AutoValue_ProductProviderDetails>() { // from class: com.paymaya.domain.model.AutoValue_ProductProviderDetails.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ProductProviderDetails createFromParcel(Parcel parcel) {
            return new AutoValue_ProductProviderDetails(parcel.readArrayList(ProductProviderDetails.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ProductProviderDetails[] newArray(int i) {
            return new AutoValue_ProductProviderDetails[i];
        }
    };

    public AutoValue_ProductProviderDetails(@Nullable final List<ProductProviderField> list) {
        new C$$AutoValue_ProductProviderDetails(list) { // from class: com.paymaya.domain.model.$AutoValue_ProductProviderDetails

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ProductProviderDetails$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y list__productProviderField_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(ProductProviderDetails)";
                }

                @Override // com.google.gson.y
                public ProductProviderDetails read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    ProductProviderDetails.Builder builderSBuilder = ProductProviderDetails.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("fields")) {
                                y yVarG = this.list__productProviderField_adapter;
                                if (yVarG == null) {
                                    yVarG = this.gson.g(TypeToken.getParameterized(List.class, ProductProviderField.class));
                                    this.list__productProviderField_adapter = yVarG;
                                }
                                builderSBuilder.mProductProviderFields((List) yVarG.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, ProductProviderDetails productProviderDetails) throws IOException {
                    if (productProviderDetails == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("fields");
                    if (productProviderDetails.mProductProviderFields() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__productProviderField_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, ProductProviderField.class));
                            this.list__productProviderField_adapter = yVarG;
                        }
                        yVarG.write(bVar, productProviderDetails.mProductProviderFields());
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
        parcel.writeList(mProductProviderFields());
    }
}
