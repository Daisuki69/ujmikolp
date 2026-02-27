package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.VoucherBase;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_VoucherBase extends C$AutoValue_VoucherBase {
    public static final Parcelable.Creator<AutoValue_VoucherBase> CREATOR = new Parcelable.Creator<AutoValue_VoucherBase>() { // from class: com.paymaya.domain.model.AutoValue_VoucherBase.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoucherBase createFromParcel(Parcel parcel) {
            return new AutoValue_VoucherBase(parcel.readArrayList(VoucherBase.class.getClassLoader()), (Meta) parcel.readParcelable(VoucherBase.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoucherBase[] newArray(int i) {
            return new AutoValue_VoucherBase[i];
        }
    };

    public AutoValue_VoucherBase(final List<Voucher> list, final Meta meta) {
        new C$$AutoValue_VoucherBase(list, meta) { // from class: com.paymaya.domain.model.$AutoValue_VoucherBase

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_VoucherBase$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y list__voucher_adapter;
                private volatile y meta_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(VoucherBase)";
                }

                @Override // com.google.gson.y
                public VoucherBase read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    VoucherBase.Builder builderSBuilder = VoucherBase.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("data")) {
                                y yVarG = this.list__voucher_adapter;
                                if (yVarG == null) {
                                    yVarG = this.gson.g(TypeToken.getParameterized(List.class, Voucher.class));
                                    this.list__voucher_adapter = yVarG;
                                }
                                builderSBuilder.mData((List) yVarG.read(aVar));
                            } else if (strE.equals("meta")) {
                                y yVarH = this.meta_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(Meta.class);
                                    this.meta_adapter = yVarH;
                                }
                                builderSBuilder.mMeta((Meta) yVarH.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, VoucherBase voucherBase) throws IOException {
                    if (voucherBase == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("data");
                    if (voucherBase.mData() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__voucher_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, Voucher.class));
                            this.list__voucher_adapter = yVarG;
                        }
                        yVarG.write(bVar, voucherBase.mData());
                    }
                    bVar.m("meta");
                    if (voucherBase.mMeta() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.meta_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Meta.class);
                            this.meta_adapter = yVarH;
                        }
                        yVarH.write(bVar, voucherBase.mMeta());
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
        parcel.writeList(mData());
        parcel.writeParcelable(mMeta(), i);
    }
}
