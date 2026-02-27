package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.User;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_User extends C$AutoValue_User {
    public static final Parcelable.Creator<AutoValue_User> CREATOR = new Parcelable.Creator<AutoValue_User>() { // from class: com.paymaya.domain.model.AutoValue_User.1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public AutoValue_User createFromParcel(Parcel parcel) {
            String string;
            String str;
            Boolean boolValueOf;
            String str2;
            String str3;
            Address address;
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                string = parcel.readString();
                str = null;
            } else {
                string = null;
                str = null;
            }
            String string3 = parcel.readString();
            String string4 = parcel.readInt() == 0 ? parcel.readString() : str;
            String string5 = parcel.readInt() == 0 ? parcel.readString() : str;
            Address address2 = (Address) parcel.readParcelable(User.class.getClassLoader());
            if (parcel.readInt() == 0) {
                str2 = string4;
                str3 = string5;
                address = address2;
                boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                boolValueOf = str;
                str2 = string4;
                str3 = string5;
                address = address2;
            }
            return new AutoValue_User(string2, string, string3, str2, str3, address, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_User[] newArray(int i) {
            return new AutoValue_User[i];
        }
    };

    public AutoValue_User(final String str, @Nullable final String str2, final String str3, @Nullable final String str4, @Nullable final String str5, @Nullable final Address address, @Nullable final Boolean bool) {
        new C$$AutoValue_User(str, str2, str3, str4, str5, address, bool) { // from class: com.paymaya.domain.model.$AutoValue_User

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_User$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y address_adapter;
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(User)";
                }

                @Override // com.google.gson.y
                public User read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    User.Builder builderSBuilder = User.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "present_address":
                                    y yVarH = this.address_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(Address.class);
                                        this.address_adapter = yVarH;
                                    }
                                    builderSBuilder.mAddress((Address) yVarH.read(aVar));
                                    break;
                                case "no_middle_name_flag":
                                    y yVarH2 = this.boolean__adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH2;
                                    }
                                    builderSBuilder.mHasNoMiddleName((Boolean) yVarH2.read(aVar));
                                    break;
                                case "first_name":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mFirstName((String) yVarH3.read(aVar));
                                    break;
                                case "middle_name":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mMiddleName((String) yVarH4.read(aVar));
                                    break;
                                case "birth_date":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mBirthDate((String) yVarH5.read(aVar));
                                    break;
                                case "password":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mPassword((String) yVarH6.read(aVar));
                                    break;
                                case "last_name":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mLastName((String) yVarH7.read(aVar));
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
                public void write(b bVar, User user) throws IOException {
                    if (user == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("first_name");
                    if (user.mFirstName() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, user.mFirstName());
                    }
                    bVar.m("middle_name");
                    if (user.mMiddleName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, user.mMiddleName());
                    }
                    bVar.m("last_name");
                    if (user.mLastName() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, user.mLastName());
                    }
                    bVar.m("birth_date");
                    if (user.mBirthDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, user.mBirthDate());
                    }
                    bVar.m("password");
                    if (user.mPassword() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, user.mPassword());
                    }
                    bVar.m("present_address");
                    if (user.mAddress() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.address_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(Address.class);
                            this.address_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, user.mAddress());
                    }
                    bVar.m("no_middle_name_flag");
                    if (user.mHasNoMiddleName() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.boolean__adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH7;
                        }
                        yVarH7.write(bVar, user.mHasNoMiddleName());
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
        parcel.writeString(mFirstName());
        if (mMiddleName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMiddleName());
        }
        parcel.writeString(mLastName());
        if (mBirthDate() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mBirthDate());
        }
        if (mPassword() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mPassword());
        }
        parcel.writeParcelable(mAddress(), i);
        if (mHasNoMiddleName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mHasNoMiddleName().booleanValue() ? 1 : 0);
        }
    }
}
