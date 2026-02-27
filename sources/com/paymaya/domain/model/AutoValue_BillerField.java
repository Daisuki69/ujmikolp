package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.BillerField;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BillerField extends C$AutoValue_BillerField {
    public static final Parcelable.Creator<AutoValue_BillerField> CREATOR = new Parcelable.Creator<AutoValue_BillerField>() { // from class: com.paymaya.domain.model.AutoValue_BillerField.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillerField createFromParcel(Parcel parcel) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean z4;
            String string;
            boolean z5;
            String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string3 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string4 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string5 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string6 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 1) {
                str = null;
                str2 = string3;
                str3 = string4;
                str4 = string5;
                str5 = string6;
                z4 = true;
            } else {
                str = null;
                str2 = string3;
                str3 = string4;
                str4 = string5;
                str5 = string6;
                z4 = false;
            }
            boolean z8 = parcel.readInt() == 1;
            if (parcel.readInt() == 0) {
                z5 = z8;
                string = parcel.readString();
            } else {
                boolean z9 = z8;
                string = str;
                z5 = z9;
            }
            return new AutoValue_BillerField(string2, str2, str3, str4, str5, z4, z5, string);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_BillerField[] newArray(int i) {
            return new AutoValue_BillerField[i];
        }
    };

    public AutoValue_BillerField(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable final String str5, final boolean z4, final boolean z5, @Nullable final String str6) {
        new C$$AutoValue_BillerField(str, str2, str3, str4, str5, z4, z5, str6) { // from class: com.paymaya.domain.model.$AutoValue_BillerField

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BillerField$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(BillerField)";
                }

                @Override // com.google.gson.y
                public BillerField read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    BillerField.Builder builderSBuilder = BillerField.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if ("mValue".equals(strE)) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mValue((String) yVarH.read(aVar));
                            } else if ("mType".equals(strE)) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mType((String) yVarH2.read(aVar));
                            } else if ("mDisplayValue".equals(strE)) {
                                y yVarH3 = this.string_adapter;
                                if (yVarH3 == null) {
                                    yVarH3 = this.gson.h(String.class);
                                    this.string_adapter = yVarH3;
                                }
                                builderSBuilder.mDisplayValue((String) yVarH3.read(aVar));
                            } else if ("mParameter".equals(strE)) {
                                y yVarH4 = this.string_adapter;
                                if (yVarH4 == null) {
                                    yVarH4 = this.gson.h(String.class);
                                    this.string_adapter = yVarH4;
                                }
                                builderSBuilder.mParameter((String) yVarH4.read(aVar));
                            } else if ("mPlaceholder".equals(strE)) {
                                y yVarH5 = this.string_adapter;
                                if (yVarH5 == null) {
                                    yVarH5 = this.gson.h(String.class);
                                    this.string_adapter = yVarH5;
                                }
                                builderSBuilder.mPlaceholder((String) yVarH5.read(aVar));
                            } else if ("mIsRequired".equals(strE)) {
                                y yVarH6 = this.boolean__adapter;
                                if (yVarH6 == null) {
                                    yVarH6 = this.gson.h(Boolean.class);
                                    this.boolean__adapter = yVarH6;
                                }
                                builderSBuilder.mIsRequired(((Boolean) yVarH6.read(aVar)).booleanValue());
                            } else if ("mIsHidden".equals(strE)) {
                                y yVarH7 = this.boolean__adapter;
                                if (yVarH7 == null) {
                                    yVarH7 = this.gson.h(Boolean.class);
                                    this.boolean__adapter = yVarH7;
                                }
                                builderSBuilder.mIsHidden(((Boolean) yVarH7.read(aVar)).booleanValue());
                            } else if ("mRegex".equals(strE)) {
                                y yVarH8 = this.string_adapter;
                                if (yVarH8 == null) {
                                    yVarH8 = this.gson.h(String.class);
                                    this.string_adapter = yVarH8;
                                }
                                builderSBuilder.mRegex((String) yVarH8.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, BillerField billerField) throws IOException {
                    if (billerField == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("mValue");
                    if (billerField.mValue() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, billerField.mValue());
                    }
                    bVar.m("mType");
                    if (billerField.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, billerField.mType());
                    }
                    bVar.m("mDisplayValue");
                    if (billerField.mDisplayValue() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, billerField.mDisplayValue());
                    }
                    bVar.m("mParameter");
                    if (billerField.mParameter() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, billerField.mParameter());
                    }
                    bVar.m("mPlaceholder");
                    if (billerField.mPlaceholder() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, billerField.mPlaceholder());
                    }
                    bVar.m("mIsRequired");
                    y yVarH6 = this.boolean__adapter;
                    if (yVarH6 == null) {
                        yVarH6 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH6;
                    }
                    yVarH6.write(bVar, Boolean.valueOf(billerField.mIsRequired()));
                    bVar.m("mIsHidden");
                    y yVarH7 = this.boolean__adapter;
                    if (yVarH7 == null) {
                        yVarH7 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH7;
                    }
                    yVarH7.write(bVar, Boolean.valueOf(billerField.mIsHidden()));
                    bVar.m("mRegex");
                    if (billerField.mRegex() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.string_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(String.class);
                            this.string_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, billerField.mRegex());
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
        if (mValue() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mValue());
        }
        if (mType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mType());
        }
        if (mDisplayValue() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mDisplayValue());
        }
        if (mParameter() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mParameter());
        }
        if (mPlaceholder() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mPlaceholder());
        }
        parcel.writeInt(mIsRequired() ? 1 : 0);
        parcel.writeInt(mIsHidden() ? 1 : 0);
        if (mRegex() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRegex());
        }
    }
}
