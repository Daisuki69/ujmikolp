package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.Bank;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Bank extends C$AutoValue_Bank {
    public static final Parcelable.Creator<AutoValue_Bank> CREATOR = new Parcelable.Creator<AutoValue_Bank>() { // from class: com.paymaya.domain.model.AutoValue_Bank.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Bank createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readInt() == 0 ? parcel.readString() : null;
            String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                boolValueOf = null;
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                boolValueOf2 = null;
            }
            return new AutoValue_Bank(string, string2, boolValueOf, boolValueOf2, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Bank[] newArray(int i) {
            return new AutoValue_Bank[i];
        }
    };

    public AutoValue_Bank(@Nullable final String str, @Nullable final String str2, @Nullable final Boolean bool, @Nullable final Boolean bool2, @Nullable final String str3, @Nullable final String str4) {
        new C$$AutoValue_Bank(str, str2, bool, bool2, str3, str4) { // from class: com.paymaya.domain.model.$AutoValue_Bank

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Bank$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(Bank)";
                }

                @Override // com.google.gson.y
                public Bank read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    Bank.Builder builderSBuilder = Bank.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "bank_code":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mBankCode((String) yVarH.read(aVar));
                                    break;
                                case "bank_name":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mBankName((String) yVarH2.read(aVar));
                                    break;
                                case "is_maintenance":
                                    y yVarH3 = this.boolean__adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH3;
                                    }
                                    builderSBuilder.mIsMaintenance((Boolean) yVarH3.read(aVar));
                                    break;
                                case "is_active":
                                    y yVarH4 = this.boolean__adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH4;
                                    }
                                    builderSBuilder.mIsActive((Boolean) yVarH4.read(aVar));
                                    break;
                                case "bank_ic":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mBankIC((String) yVarH5.read(aVar));
                                    break;
                                case "fee":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mFee((String) yVarH6.read(aVar));
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
                public void write(b bVar, Bank bank) throws IOException {
                    if (bank == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("bank_code");
                    if (bank.mBankCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, bank.mBankCode());
                    }
                    bVar.m("bank_name");
                    if (bank.mBankName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, bank.mBankName());
                    }
                    bVar.m("is_active");
                    if (bank.mIsActive() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.boolean__adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH3;
                        }
                        yVarH3.write(bVar, bank.mIsActive());
                    }
                    bVar.m("is_maintenance");
                    if (bank.mIsMaintenance() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.boolean__adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH4;
                        }
                        yVarH4.write(bVar, bank.mIsMaintenance());
                    }
                    bVar.m("fee");
                    if (bank.mFee() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, bank.mFee());
                    }
                    bVar.m("bank_ic");
                    if (bank.mBankIC() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, bank.mBankIC());
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
        if (mBankCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBankCode());
        }
        if (mBankName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBankName());
        }
        if (mIsActive() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mIsActive().booleanValue() ? 1 : 0);
        }
        if (mIsMaintenance() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mIsMaintenance().booleanValue() ? 1 : 0);
        }
        if (mFee() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mFee());
        }
        if (mBankIC() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBankIC());
        }
    }
}
