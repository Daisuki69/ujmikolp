package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.UpgradePlus;
import j3.a;
import j3.b;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_UpgradePlus extends C$AutoValue_UpgradePlus {
    public static final Parcelable.Creator<AutoValue_UpgradePlus> CREATOR = new Parcelable.Creator<AutoValue_UpgradePlus>() { // from class: com.paymaya.domain.model.AutoValue_UpgradePlus.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UpgradePlus createFromParcel(Parcel parcel) {
            String string;
            File file;
            String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string3 = parcel.readString();
            String string4 = parcel.readInt() == 0 ? parcel.readString() : null;
            String str = string2;
            String string5 = parcel.readString();
            String string6 = parcel.readInt() == 0 ? parcel.readString() : null;
            BirthPlace birthPlace = (BirthPlace) parcel.readParcelable(UpgradePlus.class.getClassLoader());
            String string7 = parcel.readInt() == 0 ? parcel.readString() : null;
            Address address = (Address) parcel.readParcelable(UpgradePlus.class.getClassLoader());
            Address address2 = (Address) parcel.readParcelable(UpgradePlus.class.getClassLoader());
            String string8 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string9 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string10 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string11 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string12 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string13 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string14 = parcel.readInt() == 0 ? parcel.readString() : null;
            GovernmentIdentification governmentIdentification = (GovernmentIdentification) parcel.readParcelable(UpgradePlus.class.getClassLoader());
            if (parcel.readInt() == 0) {
                string = parcel.readString();
                file = null;
            } else {
                string = null;
                file = null;
            }
            String str2 = string4;
            String str3 = string6;
            String str4 = string7;
            String str5 = string8;
            String str6 = string11;
            String str7 = string14;
            String string15 = parcel.readString();
            File file2 = parcel.readInt() == 0 ? (File) parcel.readSerializable() : file;
            if (parcel.readInt() == 0) {
                file = (File) parcel.readSerializable();
            }
            return new AutoValue_UpgradePlus(str, string3, str2, string5, str3, birthPlace, str4, address, address2, str5, string9, string10, str6, string12, string13, str7, governmentIdentification, string, string15, file2, file, parcel.readInt() == 1, parcel.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UpgradePlus[] newArray(int i) {
            return new AutoValue_UpgradePlus[i];
        }
    };

    public AutoValue_UpgradePlus(@Nullable final String str, final String str2, @Nullable final String str3, final String str4, @Nullable final String str5, @Nullable final BirthPlace birthPlace, @Nullable final String str6, @Nullable final Address address, @Nullable final Address address2, @Nullable final String str7, @Nullable final String str8, @Nullable final String str9, @Nullable final String str10, @Nullable final String str11, @Nullable final String str12, @Nullable final String str13, @Nullable final GovernmentIdentification governmentIdentification, @Nullable final String str14, final String str15, @Nullable final File file, @Nullable final File file2, final boolean z4, final boolean z5) {
        new C$$AutoValue_UpgradePlus(str, str2, str3, str4, str5, birthPlace, str6, address, address2, str7, str8, str9, str10, str11, str12, str13, governmentIdentification, str14, str15, file, file2, z4, z5) { // from class: com.paymaya.domain.model.$AutoValue_UpgradePlus

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_UpgradePlus$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y address_adapter;
                private volatile y birthPlace_adapter;
                private volatile y boolean__adapter;
                private volatile y file_adapter;
                private volatile y governmentIdentification_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(UpgradePlus)";
                }

                @Override // com.google.gson.y
                public UpgradePlus read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    UpgradePlus.Builder builderSBuilder = UpgradePlus.sBuilder();
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
                                    builderSBuilder.mPresentAddress((Address) yVarH.read(aVar));
                                    break;
                                case "msisdn":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mMobileNumber((String) yVarH2.read(aVar));
                                    break;
                                case "reference_id":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mReferenceId((String) yVarH3.read(aVar));
                                    break;
                                case "first_name":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mFirstName((String) yVarH4.read(aVar));
                                    break;
                                case "work_nature":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mWorkNature((String) yVarH5.read(aVar));
                                    break;
                                case "tin":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mTin((String) yVarH6.read(aVar));
                                    break;
                                case "nationality":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mNationalityCode((String) yVarH7.read(aVar));
                                    break;
                                case "middle_name":
                                    y yVarH8 = this.string_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(String.class);
                                        this.string_adapter = yVarH8;
                                    }
                                    builderSBuilder.mMiddleName((String) yVarH8.read(aVar));
                                    break;
                                case "income_source":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.mIncomeSource((String) yVarH9.read(aVar));
                                    break;
                                case "government_id":
                                    y yVarH10 = this.governmentIdentification_adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(GovernmentIdentification.class);
                                        this.governmentIdentification_adapter = yVarH10;
                                    }
                                    builderSBuilder.mGovernmentIdentification((GovernmentIdentification) yVarH10.read(aVar));
                                    break;
                                case "government_id_url":
                                    y yVarH11 = this.string_adapter;
                                    if (yVarH11 == null) {
                                        yVarH11 = this.gson.h(String.class);
                                        this.string_adapter = yVarH11;
                                    }
                                    builderSBuilder.mGovernmentIdUrl((String) yVarH11.read(aVar));
                                    break;
                                case "birth_date":
                                    y yVarH12 = this.string_adapter;
                                    if (yVarH12 == null) {
                                        yVarH12 = this.gson.h(String.class);
                                        this.string_adapter = yVarH12;
                                    }
                                    builderSBuilder.mDateOfBirth((String) yVarH12.read(aVar));
                                    break;
                                case "permanent_address":
                                    y yVarH13 = this.address_adapter;
                                    if (yVarH13 == null) {
                                        yVarH13 = this.gson.h(Address.class);
                                        this.address_adapter = yVarH13;
                                    }
                                    builderSBuilder.mPermanentAddress((Address) yVarH13.read(aVar));
                                    break;
                                case "employment_detail":
                                    y yVarH14 = this.string_adapter;
                                    if (yVarH14 == null) {
                                        yVarH14 = this.gson.h(String.class);
                                        this.string_adapter = yVarH14;
                                    }
                                    builderSBuilder.mEmploymentDetail((String) yVarH14.read(aVar));
                                    break;
                                case "social_security":
                                    y yVarH15 = this.string_adapter;
                                    if (yVarH15 == null) {
                                        yVarH15 = this.gson.h(String.class);
                                        this.string_adapter = yVarH15;
                                    }
                                    builderSBuilder.mSocialSecurityOrGsis((String) yVarH15.read(aVar));
                                    break;
                                case "birth_place":
                                    y yVarH16 = this.birthPlace_adapter;
                                    if (yVarH16 == null) {
                                        yVarH16 = this.gson.h(BirthPlace.class);
                                        this.birthPlace_adapter = yVarH16;
                                    }
                                    builderSBuilder.mBirthPlace((BirthPlace) yVarH16.read(aVar));
                                    break;
                                case "last_name":
                                    y yVarH17 = this.string_adapter;
                                    if (yVarH17 == null) {
                                        yVarH17 = this.gson.h(String.class);
                                        this.string_adapter = yVarH17;
                                    }
                                    builderSBuilder.mLastName((String) yVarH17.read(aVar));
                                    break;
                                default:
                                    if ("mAdditionalIncomeSource".equals(strE)) {
                                        y yVarH18 = this.string_adapter;
                                        if (yVarH18 == null) {
                                            yVarH18 = this.gson.h(String.class);
                                            this.string_adapter = yVarH18;
                                        }
                                        builderSBuilder.mAdditionalIncomeSource((String) yVarH18.read(aVar));
                                        break;
                                    } else {
                                        if ("mAdditionalWorkNature".equals(strE)) {
                                            y yVarH19 = this.string_adapter;
                                            if (yVarH19 == null) {
                                                yVarH19 = this.gson.h(String.class);
                                                this.string_adapter = yVarH19;
                                            }
                                            builderSBuilder.mAdditionalWorkNature((String) yVarH19.read(aVar));
                                        } else if ("mGovernmentIdImage".equals(strE)) {
                                            y yVarH20 = this.file_adapter;
                                            if (yVarH20 == null) {
                                                yVarH20 = this.gson.h(File.class);
                                                this.file_adapter = yVarH20;
                                            }
                                            builderSBuilder.mGovernmentIdImage((File) yVarH20.read(aVar));
                                        } else if ("mCustomerPhoto".equals(strE)) {
                                            y yVarH21 = this.file_adapter;
                                            if (yVarH21 == null) {
                                                yVarH21 = this.gson.h(File.class);
                                                this.file_adapter = yVarH21;
                                            }
                                            builderSBuilder.mCustomerPhoto((File) yVarH21.read(aVar));
                                        } else if ("isSocialSecurity".equals(strE)) {
                                            y yVarH22 = this.boolean__adapter;
                                            if (yVarH22 == null) {
                                                yVarH22 = this.gson.h(Boolean.class);
                                                this.boolean__adapter = yVarH22;
                                            }
                                            builderSBuilder.isSocialSecurity(((Boolean) yVarH22.read(aVar)).booleanValue());
                                        } else if (!"isPermanentSameWithPresentAddress".equals(strE)) {
                                            aVar.Q();
                                        } else {
                                            y yVarH23 = this.boolean__adapter;
                                            if (yVarH23 == null) {
                                                yVarH23 = this.gson.h(Boolean.class);
                                                this.boolean__adapter = yVarH23;
                                            }
                                            builderSBuilder.isPermanentSameWithPresentAddress(((Boolean) yVarH23.read(aVar)).booleanValue());
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
                public void write(b bVar, UpgradePlus upgradePlus) throws IOException {
                    if (upgradePlus == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("msisdn");
                    if (upgradePlus.mMobileNumber() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, upgradePlus.mMobileNumber());
                    }
                    bVar.m("first_name");
                    if (upgradePlus.mFirstName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, upgradePlus.mFirstName());
                    }
                    bVar.m("middle_name");
                    if (upgradePlus.mMiddleName() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, upgradePlus.mMiddleName());
                    }
                    bVar.m("last_name");
                    if (upgradePlus.mLastName() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, upgradePlus.mLastName());
                    }
                    bVar.m("birth_date");
                    if (upgradePlus.mDateOfBirth() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, upgradePlus.mDateOfBirth());
                    }
                    bVar.m("birth_place");
                    if (upgradePlus.mBirthPlace() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.birthPlace_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(BirthPlace.class);
                            this.birthPlace_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, upgradePlus.mBirthPlace());
                    }
                    bVar.m("nationality");
                    if (upgradePlus.mNationalityCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.string_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(String.class);
                            this.string_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, upgradePlus.mNationalityCode());
                    }
                    bVar.m("present_address");
                    if (upgradePlus.mPresentAddress() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.address_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(Address.class);
                            this.address_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, upgradePlus.mPresentAddress());
                    }
                    bVar.m("permanent_address");
                    if (upgradePlus.mPermanentAddress() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.address_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(Address.class);
                            this.address_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, upgradePlus.mPermanentAddress());
                    }
                    bVar.m("social_security");
                    if (upgradePlus.mSocialSecurityOrGsis() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.string_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(String.class);
                            this.string_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, upgradePlus.mSocialSecurityOrGsis());
                    }
                    bVar.m("tin");
                    if (upgradePlus.mTin() == null) {
                        bVar.r();
                    } else {
                        y yVarH11 = this.string_adapter;
                        if (yVarH11 == null) {
                            yVarH11 = this.gson.h(String.class);
                            this.string_adapter = yVarH11;
                        }
                        yVarH11.write(bVar, upgradePlus.mTin());
                    }
                    bVar.m("income_source");
                    if (upgradePlus.mIncomeSource() == null) {
                        bVar.r();
                    } else {
                        y yVarH12 = this.string_adapter;
                        if (yVarH12 == null) {
                            yVarH12 = this.gson.h(String.class);
                            this.string_adapter = yVarH12;
                        }
                        yVarH12.write(bVar, upgradePlus.mIncomeSource());
                    }
                    bVar.m("work_nature");
                    if (upgradePlus.mWorkNature() == null) {
                        bVar.r();
                    } else {
                        y yVarH13 = this.string_adapter;
                        if (yVarH13 == null) {
                            yVarH13 = this.gson.h(String.class);
                            this.string_adapter = yVarH13;
                        }
                        yVarH13.write(bVar, upgradePlus.mWorkNature());
                    }
                    bVar.m("mAdditionalIncomeSource");
                    if (upgradePlus.mAdditionalIncomeSource() == null) {
                        bVar.r();
                    } else {
                        y yVarH14 = this.string_adapter;
                        if (yVarH14 == null) {
                            yVarH14 = this.gson.h(String.class);
                            this.string_adapter = yVarH14;
                        }
                        yVarH14.write(bVar, upgradePlus.mAdditionalIncomeSource());
                    }
                    bVar.m("mAdditionalWorkNature");
                    if (upgradePlus.mAdditionalWorkNature() == null) {
                        bVar.r();
                    } else {
                        y yVarH15 = this.string_adapter;
                        if (yVarH15 == null) {
                            yVarH15 = this.gson.h(String.class);
                            this.string_adapter = yVarH15;
                        }
                        yVarH15.write(bVar, upgradePlus.mAdditionalWorkNature());
                    }
                    bVar.m("employment_detail");
                    if (upgradePlus.mEmploymentDetail() == null) {
                        bVar.r();
                    } else {
                        y yVarH16 = this.string_adapter;
                        if (yVarH16 == null) {
                            yVarH16 = this.gson.h(String.class);
                            this.string_adapter = yVarH16;
                        }
                        yVarH16.write(bVar, upgradePlus.mEmploymentDetail());
                    }
                    bVar.m("government_id");
                    if (upgradePlus.mGovernmentIdentification() == null) {
                        bVar.r();
                    } else {
                        y yVarH17 = this.governmentIdentification_adapter;
                        if (yVarH17 == null) {
                            yVarH17 = this.gson.h(GovernmentIdentification.class);
                            this.governmentIdentification_adapter = yVarH17;
                        }
                        yVarH17.write(bVar, upgradePlus.mGovernmentIdentification());
                    }
                    bVar.m("government_id_url");
                    if (upgradePlus.mGovernmentIdUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH18 = this.string_adapter;
                        if (yVarH18 == null) {
                            yVarH18 = this.gson.h(String.class);
                            this.string_adapter = yVarH18;
                        }
                        yVarH18.write(bVar, upgradePlus.mGovernmentIdUrl());
                    }
                    bVar.m("reference_id");
                    if (upgradePlus.mReferenceId() == null) {
                        bVar.r();
                    } else {
                        y yVarH19 = this.string_adapter;
                        if (yVarH19 == null) {
                            yVarH19 = this.gson.h(String.class);
                            this.string_adapter = yVarH19;
                        }
                        yVarH19.write(bVar, upgradePlus.mReferenceId());
                    }
                    bVar.m("mGovernmentIdImage");
                    if (upgradePlus.mGovernmentIdImage() == null) {
                        bVar.r();
                    } else {
                        y yVarH20 = this.file_adapter;
                        if (yVarH20 == null) {
                            yVarH20 = this.gson.h(File.class);
                            this.file_adapter = yVarH20;
                        }
                        yVarH20.write(bVar, upgradePlus.mGovernmentIdImage());
                    }
                    bVar.m("mCustomerPhoto");
                    if (upgradePlus.mCustomerPhoto() == null) {
                        bVar.r();
                    } else {
                        y yVarH21 = this.file_adapter;
                        if (yVarH21 == null) {
                            yVarH21 = this.gson.h(File.class);
                            this.file_adapter = yVarH21;
                        }
                        yVarH21.write(bVar, upgradePlus.mCustomerPhoto());
                    }
                    bVar.m("isSocialSecurity");
                    y yVarH22 = this.boolean__adapter;
                    if (yVarH22 == null) {
                        yVarH22 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH22;
                    }
                    yVarH22.write(bVar, Boolean.valueOf(upgradePlus.isSocialSecurity()));
                    bVar.m("isPermanentSameWithPresentAddress");
                    y yVarH23 = this.boolean__adapter;
                    if (yVarH23 == null) {
                        yVarH23 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH23;
                    }
                    yVarH23.write(bVar, Boolean.valueOf(upgradePlus.isPermanentSameWithPresentAddress()));
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
        if (mMobileNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMobileNumber());
        }
        parcel.writeString(mFirstName());
        if (mMiddleName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMiddleName());
        }
        parcel.writeString(mLastName());
        if (mDateOfBirth() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mDateOfBirth());
        }
        parcel.writeParcelable(mBirthPlace(), i);
        if (mNationalityCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mNationalityCode());
        }
        parcel.writeParcelable(mPresentAddress(), i);
        parcel.writeParcelable(mPermanentAddress(), i);
        if (mSocialSecurityOrGsis() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mSocialSecurityOrGsis());
        }
        if (mTin() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mTin());
        }
        if (mIncomeSource() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mIncomeSource());
        }
        if (mWorkNature() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mWorkNature());
        }
        if (mAdditionalIncomeSource() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mAdditionalIncomeSource());
        }
        if (mAdditionalWorkNature() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mAdditionalWorkNature());
        }
        if (mEmploymentDetail() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mEmploymentDetail());
        }
        parcel.writeParcelable(mGovernmentIdentification(), i);
        if (mGovernmentIdUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mGovernmentIdUrl());
        }
        parcel.writeString(mReferenceId());
        if (mGovernmentIdImage() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(mGovernmentIdImage());
        }
        if (mCustomerPhoto() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(mCustomerPhoto());
        }
        parcel.writeInt(isSocialSecurity() ? 1 : 0);
        parcel.writeInt(isPermanentSameWithPresentAddress() ? 1 : 0);
    }
}
