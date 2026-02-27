package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.BillerDetails;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BillerDetails extends C$AutoValue_BillerDetails {
    public static final Parcelable.Creator<AutoValue_BillerDetails> CREATOR = new Parcelable.Creator<AutoValue_BillerDetails>() { // from class: com.paymaya.domain.model.AutoValue_BillerDetails.1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillerDetails createFromParcel(Parcel parcel) {
            String string;
            String string2;
            Object objValueOf;
            Object objValueOf2;
            if (parcel.readInt() == 0) {
                string = parcel.readString();
                string2 = null;
            } else {
                string = null;
                string2 = null;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                objValueOf = string2;
            }
            ArrayList arrayList = parcel.readArrayList(BillerDetails.class.getClassLoader());
            String string4 = parcel.readInt() == 0 ? parcel.readString() : string2;
            String string5 = parcel.readInt() == 0 ? parcel.readString() : string2;
            if (parcel.readInt() == 0) {
                objValueOf2 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                objValueOf2 = string2;
            }
            ImageUrlUnfiltered imageUrlUnfiltered = (ImageUrlUnfiltered) parcel.readParcelable(BillerDetails.class.getClassLoader());
            ImageUrlUnfiltered imageUrlUnfiltered2 = (ImageUrlUnfiltered) parcel.readParcelable(BillerDetails.class.getClassLoader());
            ImageUrlUnfiltered imageUrlUnfiltered3 = (ImageUrlUnfiltered) parcel.readParcelable(BillerDetails.class.getClassLoader());
            if (parcel.readInt() == 0) {
                string2 = parcel.readString();
            }
            return new AutoValue_BillerDetails(string, string3, objValueOf, arrayList, string4, string5, objValueOf2, imageUrlUnfiltered, imageUrlUnfiltered2, imageUrlUnfiltered3, string2, parcel.readArrayList(BillerDetails.class.getClassLoader()), (BillerMetadata) parcel.readParcelable(BillerDetails.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillerDetails[] newArray(int i) {
            return new AutoValue_BillerDetails[i];
        }
    };

    public AutoValue_BillerDetails(@Nullable String str, String str2, @Nullable Boolean bool, @Nullable List<UIComponent> list, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool2, @Nullable ImageUrlUnfiltered imageUrlUnfiltered, @Nullable ImageUrlUnfiltered imageUrlUnfiltered2, @Nullable ImageUrlUnfiltered imageUrlUnfiltered3, @Nullable String str5, @Nullable List<BillerDynamicField> list2, @Nullable BillerMetadata billerMetadata) {
        new C$$AutoValue_BillerDetails(str, str2, bool, list, str3, str4, bool2, imageUrlUnfiltered, imageUrlUnfiltered2, imageUrlUnfiltered3, str5, list2, billerMetadata) { // from class: com.paymaya.domain.model.$AutoValue_BillerDetails

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BillerDetails$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y billerMetadata_adapter;
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y imageUrlUnfiltered_adapter;
                private volatile y list__billerDynamicField_adapter;
                private volatile y list__uIComponent_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(BillerDetails)";
                }

                @Override // com.google.gson.y
                public BillerDetails read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    BillerDetails.Builder builderSBuilder = BillerDetails.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "otherFields":
                                    y yVarG = this.list__uIComponent_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(List.class, UIComponent.class));
                                        this.list__uIComponent_adapter = yVarG;
                                    }
                                    builderSBuilder.mOtherFields((List) yVarG.read(aVar));
                                    break;
                                case "hasOtherCharges":
                                    y yVarH = this.boolean__adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH;
                                    }
                                    builderSBuilder.mHasOtherCharges((Boolean) yVarH.read(aVar));
                                    break;
                                case "active":
                                    y yVarH2 = this.boolean__adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH2;
                                    }
                                    builderSBuilder.mActive((Boolean) yVarH2.read(aVar));
                                    break;
                                case "metadata":
                                    y yVarH3 = this.billerMetadata_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(BillerMetadata.class);
                                        this.billerMetadata_adapter = yVarH3;
                                    }
                                    builderSBuilder.mMetadata((BillerMetadata) yVarH3.read(aVar));
                                    break;
                                case "name":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mName((String) yVarH4.read(aVar));
                                    break;
                                case "slug":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mSlug((String) yVarH5.read(aVar));
                                    break;
                                case "category":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mCategory((String) yVarH6.read(aVar));
                                    break;
                                case "listUrl":
                                    y yVarH7 = this.imageUrlUnfiltered_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(ImageUrlUnfiltered.class);
                                        this.imageUrlUnfiltered_adapter = yVarH7;
                                    }
                                    builderSBuilder.mListUrl((ImageUrlUnfiltered) yVarH7.read(aVar));
                                    break;
                                case "categorySlug":
                                    y yVarH8 = this.string_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(String.class);
                                        this.string_adapter = yVarH8;
                                    }
                                    builderSBuilder.mCategorySlug((String) yVarH8.read(aVar));
                                    break;
                                case "other_fields":
                                    y yVarG2 = this.list__billerDynamicField_adapter;
                                    if (yVarG2 == null) {
                                        yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, BillerDynamicField.class));
                                        this.list__billerDynamicField_adapter = yVarG2;
                                    }
                                    builderSBuilder.mDynamicFields((List) yVarG2.read(aVar));
                                    break;
                                case "account_number":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.mAccountNumber((String) yVarH9.read(aVar));
                                    break;
                                case "confirmationUrl":
                                    y yVarH10 = this.imageUrlUnfiltered_adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(ImageUrlUnfiltered.class);
                                        this.imageUrlUnfiltered_adapter = yVarH10;
                                    }
                                    builderSBuilder.mConfirmationUrl((ImageUrlUnfiltered) yVarH10.read(aVar));
                                    break;
                                case "iconUrl":
                                    y yVarH11 = this.imageUrlUnfiltered_adapter;
                                    if (yVarH11 == null) {
                                        yVarH11 = this.gson.h(ImageUrlUnfiltered.class);
                                        this.imageUrlUnfiltered_adapter = yVarH11;
                                    }
                                    builderSBuilder.mIconUrl((ImageUrlUnfiltered) yVarH11.read(aVar));
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
                public void write(b bVar, BillerDetails billerDetails) throws IOException {
                    if (billerDetails == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (billerDetails.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, billerDetails.mName());
                    }
                    bVar.m("slug");
                    if (billerDetails.mSlug() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, billerDetails.mSlug());
                    }
                    bVar.m("hasOtherCharges");
                    if (billerDetails.mHasOtherCharges() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.boolean__adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH3;
                        }
                        yVarH3.write(bVar, billerDetails.mHasOtherCharges());
                    }
                    bVar.m("otherFields");
                    if (billerDetails.mOtherFields() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__uIComponent_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, UIComponent.class));
                            this.list__uIComponent_adapter = yVarG;
                        }
                        yVarG.write(bVar, billerDetails.mOtherFields());
                    }
                    bVar.m("category");
                    if (billerDetails.mCategory() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, billerDetails.mCategory());
                    }
                    bVar.m("categorySlug");
                    if (billerDetails.mCategorySlug() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, billerDetails.mCategorySlug());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
                    if (billerDetails.mActive() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.boolean__adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH6;
                        }
                        yVarH6.write(bVar, billerDetails.mActive());
                    }
                    bVar.m("listUrl");
                    if (billerDetails.mListUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.imageUrlUnfiltered_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(ImageUrlUnfiltered.class);
                            this.imageUrlUnfiltered_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, billerDetails.mListUrl());
                    }
                    bVar.m("iconUrl");
                    if (billerDetails.mIconUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.imageUrlUnfiltered_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(ImageUrlUnfiltered.class);
                            this.imageUrlUnfiltered_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, billerDetails.mIconUrl());
                    }
                    bVar.m("confirmationUrl");
                    if (billerDetails.mConfirmationUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.imageUrlUnfiltered_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(ImageUrlUnfiltered.class);
                            this.imageUrlUnfiltered_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, billerDetails.mConfirmationUrl());
                    }
                    bVar.m("account_number");
                    if (billerDetails.mAccountNumber() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.string_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(String.class);
                            this.string_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, billerDetails.mAccountNumber());
                    }
                    bVar.m("other_fields");
                    if (billerDetails.mDynamicFields() == null) {
                        bVar.r();
                    } else {
                        y yVarG2 = this.list__billerDynamicField_adapter;
                        if (yVarG2 == null) {
                            yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, BillerDynamicField.class));
                            this.list__billerDynamicField_adapter = yVarG2;
                        }
                        yVarG2.write(bVar, billerDetails.mDynamicFields());
                    }
                    bVar.m(TtmlNode.TAG_METADATA);
                    if (billerDetails.mMetadata() == null) {
                        bVar.r();
                    } else {
                        y yVarH11 = this.billerMetadata_adapter;
                        if (yVarH11 == null) {
                            yVarH11 = this.gson.h(BillerMetadata.class);
                            this.billerMetadata_adapter = yVarH11;
                        }
                        yVarH11.write(bVar, billerDetails.mMetadata());
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
        if (mName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mName());
        }
        parcel.writeString(mSlug());
        if (mHasOtherCharges() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mHasOtherCharges().booleanValue() ? 1 : 0);
        }
        parcel.writeList(mOtherFields());
        if (mCategory() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mCategory());
        }
        if (mCategorySlug() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mCategorySlug());
        }
        if (mActive() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mActive().booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(mListUrl(), i);
        parcel.writeParcelable(mIconUrl(), i);
        parcel.writeParcelable(mConfirmationUrl(), i);
        if (mAccountNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mAccountNumber());
        }
        parcel.writeList(mDynamicFields());
        parcel.writeParcelable(mMetadata(), i);
    }
}
