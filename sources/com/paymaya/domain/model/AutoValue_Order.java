package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.Order;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Order extends C$AutoValue_Order {
    public static final Parcelable.Creator<AutoValue_Order> CREATOR = new Parcelable.Creator<AutoValue_Order>() { // from class: com.paymaya.domain.model.AutoValue_Order.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Order createFromParcel(Parcel parcel) {
            return new AutoValue_Order(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(Order.class.getClassLoader()), (Amount) parcel.readParcelable(Order.class.getClassLoader()), (Amount) parcel.readParcelable(Order.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Order[] newArray(int i) {
            return new AutoValue_Order[i];
        }
    };

    public AutoValue_Order(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable List<OrderProviderField> list, @Nullable Amount amount, @Nullable Amount amount2) {
        new C$$AutoValue_Order(str, str2, str3, str4, list, amount, amount2) { // from class: com.paymaya.domain.model.$AutoValue_Order

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Order$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y amount_adapter;
                private final j gson;
                private volatile y list__orderProviderField_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(Order)";
                }

                @Override // com.google.gson.y
                public Order read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    Order.Builder builderSBuilder = Order.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "status":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mStatus((String) yVarH.read(aVar));
                                    break;
                                case "id":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mId((String) yVarH2.read(aVar));
                                    break;
                                case "code":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mCode((String) yVarH3.read(aVar));
                                    break;
                                case "other_fields":
                                    y yVarG = this.list__orderProviderField_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(List.class, OrderProviderField.class));
                                        this.list__orderProviderField_adapter = yVarG;
                                    }
                                    builderSBuilder.mOtherFields((List) yVarG.read(aVar));
                                    break;
                                case "payment_id":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mPaymentId((String) yVarH4.read(aVar));
                                    break;
                                default:
                                    if ("mCurrentBalance".equals(strE)) {
                                        y yVarH5 = this.amount_adapter;
                                        if (yVarH5 == null) {
                                            yVarH5 = this.gson.h(Amount.class);
                                            this.amount_adapter = yVarH5;
                                        }
                                        builderSBuilder.mCurrentBalance((Amount) yVarH5.read(aVar));
                                        break;
                                    } else {
                                        if (!"mAvailableBalance".equals(strE)) {
                                            aVar.Q();
                                        } else {
                                            y yVarH6 = this.amount_adapter;
                                            if (yVarH6 == null) {
                                                yVarH6 = this.gson.h(Amount.class);
                                                this.amount_adapter = yVarH6;
                                            }
                                            builderSBuilder.mAvailableBalance((Amount) yVarH6.read(aVar));
                                        }
                                        break;
                                    }
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
                public void write(b bVar, Order order) throws IOException {
                    if (order == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (order.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, order.mId());
                    }
                    bVar.m("status");
                    if (order.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, order.mStatus());
                    }
                    bVar.m("code");
                    if (order.mCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, order.mCode());
                    }
                    bVar.m("payment_id");
                    if (order.mPaymentId() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, order.mPaymentId());
                    }
                    bVar.m("other_fields");
                    if (order.mOtherFields() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__orderProviderField_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, OrderProviderField.class));
                            this.list__orderProviderField_adapter = yVarG;
                        }
                        yVarG.write(bVar, order.mOtherFields());
                    }
                    bVar.m("mCurrentBalance");
                    if (order.mCurrentBalance() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.amount_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, order.mCurrentBalance());
                    }
                    bVar.m("mAvailableBalance");
                    if (order.mAvailableBalance() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.amount_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(Amount.class);
                            this.amount_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, order.mAvailableBalance());
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
        parcel.writeString(mId());
        parcel.writeString(mStatus());
        if (mCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mCode());
        }
        if (mPaymentId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mPaymentId());
        }
        parcel.writeList(mOtherFields());
        parcel.writeParcelable(mCurrentBalance(), i);
        parcel.writeParcelable(mAvailableBalance(), i);
    }
}
