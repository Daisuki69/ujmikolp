package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.Ekyc;
import j3.a;
import j3.b;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Ekyc extends C$AutoValue_Ekyc {
    public static final Parcelable.Creator<AutoValue_Ekyc> CREATOR = new Parcelable.Creator<AutoValue_Ekyc>() { // from class: com.paymaya.domain.model.AutoValue_Ekyc.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Ekyc createFromParcel(Parcel parcel) {
            return new AutoValue_Ekyc(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (BirthPlace) parcel.readParcelable(Ekyc.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Address) parcel.readParcelable(Ekyc.class.getClassLoader()), (Address) parcel.readParcelable(Ekyc.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(Ekyc.class.getClassLoader()), parcel.readArrayList(Ekyc.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? (File) parcel.readSerializable() : null, parcel.readInt() == 0 ? (File) parcel.readSerializable() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (EDD) parcel.readParcelable(Ekyc.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (GovernmentIdentification) parcel.readParcelable(Ekyc.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? (File) parcel.readSerializable() : null, parcel.readInt() == 1, parcel.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Ekyc[] newArray(int i) {
            return new AutoValue_Ekyc[i];
        }
    };

    public AutoValue_Ekyc(final String str, final String str2, @Nullable final String str3, final String str4, @Nullable final String str5, @Nullable final BirthPlace birthPlace, @Nullable final String str6, @Nullable final String str7, @Nullable final String str8, @Nullable final Address address, @Nullable final Address address2, @Nullable final String str9, @Nullable final String str10, @Nullable final List<EkycIdentification> list, @Nullable final List<EkycAdditionalDocument> list2, @Nullable final String str11, @Nullable final File file, @Nullable final File file2, @Nullable final String str12, @Nullable final String str13, @Nullable final EDD edd, @Nullable final String str14, @Nullable final String str15, @Nullable final String str16, @Nullable final GovernmentIdentification governmentIdentification, @Nullable final String str17, @Nullable final String str18, @Nullable final String str19, @Nullable final File file3, final boolean z4, final boolean z5) {
        new C$$AutoValue_Ekyc(str, str2, str3, str4, str5, birthPlace, str6, str7, str8, address, address2, str9, str10, list, list2, str11, file, file2, str12, str13, edd, str14, str15, str16, governmentIdentification, str17, str18, str19, file3, z4, z5) { // from class: com.paymaya.domain.model.$AutoValue_Ekyc

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Ekyc$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y address_adapter;
                private volatile y birthPlace_adapter;
                private volatile y boolean__adapter;
                private volatile y eDD_adapter;
                private volatile y file_adapter;
                private volatile y governmentIdentification_adapter;
                private final j gson;
                private volatile y list__ekycAdditionalDocument_adapter;
                private volatile y list__ekycIdentification_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(Ekyc)";
                }

                @Override // com.google.gson.y
                public Ekyc read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    Ekyc.Builder builderSBuilder = Ekyc.sBuilder();
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
                                    builderSBuilder.mMsisdn((String) yVarH2.read(aVar));
                                    break;
                                case "status":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mStatus((String) yVarH3.read(aVar));
                                    break;
                                case "reference_id":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mReferenceId((String) yVarH4.read(aVar));
                                    break;
                                case "submission_type":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mSubmissionType((String) yVarH5.read(aVar));
                                    break;
                                case "liveness_video_url":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mLivenessVideoUrl((String) yVarH6.read(aVar));
                                    break;
                                case "first_name":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mFirstName((String) yVarH7.read(aVar));
                                    break;
                                case "work_nature":
                                    y yVarH8 = this.string_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(String.class);
                                        this.string_adapter = yVarH8;
                                    }
                                    builderSBuilder.mWorkNature((String) yVarH8.read(aVar));
                                    break;
                                case "additional_docs":
                                    y yVarG = this.list__ekycAdditionalDocument_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(List.class, EkycAdditionalDocument.class));
                                        this.list__ekycAdditionalDocument_adapter = yVarG;
                                    }
                                    builderSBuilder.mAdditionalDocuments((List) yVarG.read(aVar));
                                    break;
                                case "ids":
                                    y yVarG2 = this.list__ekycIdentification_adapter;
                                    if (yVarG2 == null) {
                                        yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, EkycIdentification.class));
                                        this.list__ekycIdentification_adapter = yVarG2;
                                    }
                                    builderSBuilder.mIdList((List) yVarG2.read(aVar));
                                    break;
                                case "tin":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.mTin((String) yVarH9.read(aVar));
                                    break;
                                case "nationality":
                                    y yVarH10 = this.string_adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(String.class);
                                        this.string_adapter = yVarH10;
                                    }
                                    builderSBuilder.mNationalityCode((String) yVarH10.read(aVar));
                                    break;
                                case "middle_name":
                                    y yVarH11 = this.string_adapter;
                                    if (yVarH11 == null) {
                                        yVarH11 = this.gson.h(String.class);
                                        this.string_adapter = yVarH11;
                                    }
                                    builderSBuilder.mMiddleName((String) yVarH11.read(aVar));
                                    break;
                                case "edd_information":
                                    y yVarH12 = this.eDD_adapter;
                                    if (yVarH12 == null) {
                                        yVarH12 = this.gson.h(EDD.class);
                                        this.eDD_adapter = yVarH12;
                                    }
                                    builderSBuilder.mEDDInformation((EDD) yVarH12.read(aVar));
                                    break;
                                case "income_source":
                                    y yVarH13 = this.string_adapter;
                                    if (yVarH13 == null) {
                                        yVarH13 = this.gson.h(String.class);
                                        this.string_adapter = yVarH13;
                                    }
                                    builderSBuilder.mIncomeSource((String) yVarH13.read(aVar));
                                    break;
                                case "government_id":
                                    y yVarH14 = this.governmentIdentification_adapter;
                                    if (yVarH14 == null) {
                                        yVarH14 = this.gson.h(GovernmentIdentification.class);
                                        this.governmentIdentification_adapter = yVarH14;
                                    }
                                    builderSBuilder.mGovernmentIdentification((GovernmentIdentification) yVarH14.read(aVar));
                                    break;
                                case "government_id_url":
                                    y yVarH15 = this.string_adapter;
                                    if (yVarH15 == null) {
                                        yVarH15 = this.gson.h(String.class);
                                        this.string_adapter = yVarH15;
                                    }
                                    builderSBuilder.mGovernmentIdUrl((String) yVarH15.read(aVar));
                                    break;
                                case "live_data_url":
                                    y yVarH16 = this.string_adapter;
                                    if (yVarH16 == null) {
                                        yVarH16 = this.gson.h(String.class);
                                        this.string_adapter = yVarH16;
                                    }
                                    builderSBuilder.mLiveDataUrl((String) yVarH16.read(aVar));
                                    break;
                                case "birth_date":
                                    y yVarH17 = this.string_adapter;
                                    if (yVarH17 == null) {
                                        yVarH17 = this.gson.h(String.class);
                                        this.string_adapter = yVarH17;
                                    }
                                    builderSBuilder.mDateOfBirth((String) yVarH17.read(aVar));
                                    break;
                                case "permanent_address":
                                    y yVarH18 = this.address_adapter;
                                    if (yVarH18 == null) {
                                        yVarH18 = this.gson.h(Address.class);
                                        this.address_adapter = yVarH18;
                                    }
                                    builderSBuilder.mPermanentAddress((Address) yVarH18.read(aVar));
                                    break;
                                case "employment_detail":
                                    y yVarH19 = this.string_adapter;
                                    if (yVarH19 == null) {
                                        yVarH19 = this.gson.h(String.class);
                                        this.string_adapter = yVarH19;
                                    }
                                    builderSBuilder.mEmploymentDetail((String) yVarH19.read(aVar));
                                    break;
                                case "social_security":
                                    y yVarH20 = this.string_adapter;
                                    if (yVarH20 == null) {
                                        yVarH20 = this.gson.h(String.class);
                                        this.string_adapter = yVarH20;
                                    }
                                    builderSBuilder.mSocialSecurityOrGsis((String) yVarH20.read(aVar));
                                    break;
                                case "birth_place":
                                    y yVarH21 = this.birthPlace_adapter;
                                    if (yVarH21 == null) {
                                        yVarH21 = this.gson.h(BirthPlace.class);
                                        this.birthPlace_adapter = yVarH21;
                                    }
                                    builderSBuilder.mBirthPlace((BirthPlace) yVarH21.read(aVar));
                                    break;
                                case "last_name":
                                    y yVarH22 = this.string_adapter;
                                    if (yVarH22 == null) {
                                        yVarH22 = this.gson.h(String.class);
                                        this.string_adapter = yVarH22;
                                    }
                                    builderSBuilder.mLastName((String) yVarH22.read(aVar));
                                    break;
                                default:
                                    if ("mLivenessVideoFile".equals(strE)) {
                                        y yVarH23 = this.file_adapter;
                                        if (yVarH23 == null) {
                                            yVarH23 = this.gson.h(File.class);
                                            this.file_adapter = yVarH23;
                                        }
                                        builderSBuilder.mLivenessVideoFile((File) yVarH23.read(aVar));
                                        break;
                                    } else {
                                        if ("mLiveDataFile".equals(strE)) {
                                            y yVarH24 = this.file_adapter;
                                            if (yVarH24 == null) {
                                                yVarH24 = this.gson.h(File.class);
                                                this.file_adapter = yVarH24;
                                            }
                                            builderSBuilder.mLiveDataFile((File) yVarH24.read(aVar));
                                        } else if ("mOcrId".equals(strE)) {
                                            y yVarH25 = this.string_adapter;
                                            if (yVarH25 == null) {
                                                yVarH25 = this.gson.h(String.class);
                                                this.string_adapter = yVarH25;
                                            }
                                            builderSBuilder.mOcrId((String) yVarH25.read(aVar));
                                        } else if ("mUserType".equals(strE)) {
                                            y yVarH26 = this.string_adapter;
                                            if (yVarH26 == null) {
                                                yVarH26 = this.gson.h(String.class);
                                                this.string_adapter = yVarH26;
                                            }
                                            builderSBuilder.mUserType((String) yVarH26.read(aVar));
                                        } else if ("mGovernmentIdImage".equals(strE)) {
                                            y yVarH27 = this.file_adapter;
                                            if (yVarH27 == null) {
                                                yVarH27 = this.gson.h(File.class);
                                                this.file_adapter = yVarH27;
                                            }
                                            builderSBuilder.mGovernmentIdImage((File) yVarH27.read(aVar));
                                        } else if ("isSocialSecurity".equals(strE)) {
                                            y yVarH28 = this.boolean__adapter;
                                            if (yVarH28 == null) {
                                                yVarH28 = this.gson.h(Boolean.class);
                                                this.boolean__adapter = yVarH28;
                                            }
                                            builderSBuilder.isSocialSecurity(((Boolean) yVarH28.read(aVar)).booleanValue());
                                        } else if (!"isPermanentSameWithPresentAddress".equals(strE)) {
                                            aVar.Q();
                                        } else {
                                            y yVarH29 = this.boolean__adapter;
                                            if (yVarH29 == null) {
                                                yVarH29 = this.gson.h(Boolean.class);
                                                this.boolean__adapter = yVarH29;
                                            }
                                            builderSBuilder.isPermanentSameWithPresentAddress(((Boolean) yVarH29.read(aVar)).booleanValue());
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
                public void write(b bVar, Ekyc ekyc) throws IOException {
                    if (ekyc == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("msisdn");
                    if (ekyc.mMsisdn() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, ekyc.mMsisdn());
                    }
                    bVar.m("first_name");
                    if (ekyc.mFirstName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, ekyc.mFirstName());
                    }
                    bVar.m("middle_name");
                    if (ekyc.mMiddleName() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, ekyc.mMiddleName());
                    }
                    bVar.m("last_name");
                    if (ekyc.mLastName() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, ekyc.mLastName());
                    }
                    bVar.m("birth_date");
                    if (ekyc.mDateOfBirth() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, ekyc.mDateOfBirth());
                    }
                    bVar.m("birth_place");
                    if (ekyc.mBirthPlace() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.birthPlace_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(BirthPlace.class);
                            this.birthPlace_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, ekyc.mBirthPlace());
                    }
                    bVar.m("nationality");
                    if (ekyc.mNationalityCode() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.string_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(String.class);
                            this.string_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, ekyc.mNationalityCode());
                    }
                    bVar.m("income_source");
                    if (ekyc.mIncomeSource() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.string_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(String.class);
                            this.string_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, ekyc.mIncomeSource());
                    }
                    bVar.m("work_nature");
                    if (ekyc.mWorkNature() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.string_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(String.class);
                            this.string_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, ekyc.mWorkNature());
                    }
                    bVar.m("present_address");
                    if (ekyc.mPresentAddress() == null) {
                        bVar.r();
                    } else {
                        y yVarH10 = this.address_adapter;
                        if (yVarH10 == null) {
                            yVarH10 = this.gson.h(Address.class);
                            this.address_adapter = yVarH10;
                        }
                        yVarH10.write(bVar, ekyc.mPresentAddress());
                    }
                    bVar.m("permanent_address");
                    if (ekyc.mPermanentAddress() == null) {
                        bVar.r();
                    } else {
                        y yVarH11 = this.address_adapter;
                        if (yVarH11 == null) {
                            yVarH11 = this.gson.h(Address.class);
                            this.address_adapter = yVarH11;
                        }
                        yVarH11.write(bVar, ekyc.mPermanentAddress());
                    }
                    bVar.m("liveness_video_url");
                    if (ekyc.mLivenessVideoUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH12 = this.string_adapter;
                        if (yVarH12 == null) {
                            yVarH12 = this.gson.h(String.class);
                            this.string_adapter = yVarH12;
                        }
                        yVarH12.write(bVar, ekyc.mLivenessVideoUrl());
                    }
                    bVar.m("live_data_url");
                    if (ekyc.mLiveDataUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH13 = this.string_adapter;
                        if (yVarH13 == null) {
                            yVarH13 = this.gson.h(String.class);
                            this.string_adapter = yVarH13;
                        }
                        yVarH13.write(bVar, ekyc.mLiveDataUrl());
                    }
                    bVar.m("ids");
                    if (ekyc.mIdList() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__ekycIdentification_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, EkycIdentification.class));
                            this.list__ekycIdentification_adapter = yVarG;
                        }
                        yVarG.write(bVar, ekyc.mIdList());
                    }
                    bVar.m("additional_docs");
                    if (ekyc.mAdditionalDocuments() == null) {
                        bVar.r();
                    } else {
                        y yVarG2 = this.list__ekycAdditionalDocument_adapter;
                        if (yVarG2 == null) {
                            yVarG2 = this.gson.g(TypeToken.getParameterized(List.class, EkycAdditionalDocument.class));
                            this.list__ekycAdditionalDocument_adapter = yVarG2;
                        }
                        yVarG2.write(bVar, ekyc.mAdditionalDocuments());
                    }
                    bVar.m("status");
                    if (ekyc.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH14 = this.string_adapter;
                        if (yVarH14 == null) {
                            yVarH14 = this.gson.h(String.class);
                            this.string_adapter = yVarH14;
                        }
                        yVarH14.write(bVar, ekyc.mStatus());
                    }
                    bVar.m("mLivenessVideoFile");
                    if (ekyc.mLivenessVideoFile() == null) {
                        bVar.r();
                    } else {
                        y yVarH15 = this.file_adapter;
                        if (yVarH15 == null) {
                            yVarH15 = this.gson.h(File.class);
                            this.file_adapter = yVarH15;
                        }
                        yVarH15.write(bVar, ekyc.mLivenessVideoFile());
                    }
                    bVar.m("mLiveDataFile");
                    if (ekyc.mLiveDataFile() == null) {
                        bVar.r();
                    } else {
                        y yVarH16 = this.file_adapter;
                        if (yVarH16 == null) {
                            yVarH16 = this.gson.h(File.class);
                            this.file_adapter = yVarH16;
                        }
                        yVarH16.write(bVar, ekyc.mLiveDataFile());
                    }
                    bVar.m("mOcrId");
                    if (ekyc.mOcrId() == null) {
                        bVar.r();
                    } else {
                        y yVarH17 = this.string_adapter;
                        if (yVarH17 == null) {
                            yVarH17 = this.gson.h(String.class);
                            this.string_adapter = yVarH17;
                        }
                        yVarH17.write(bVar, ekyc.mOcrId());
                    }
                    bVar.m("submission_type");
                    if (ekyc.mSubmissionType() == null) {
                        bVar.r();
                    } else {
                        y yVarH18 = this.string_adapter;
                        if (yVarH18 == null) {
                            yVarH18 = this.gson.h(String.class);
                            this.string_adapter = yVarH18;
                        }
                        yVarH18.write(bVar, ekyc.mSubmissionType());
                    }
                    bVar.m("edd_information");
                    if (ekyc.mEDDInformation() == null) {
                        bVar.r();
                    } else {
                        y yVarH19 = this.eDD_adapter;
                        if (yVarH19 == null) {
                            yVarH19 = this.gson.h(EDD.class);
                            this.eDD_adapter = yVarH19;
                        }
                        yVarH19.write(bVar, ekyc.mEDDInformation());
                    }
                    bVar.m("social_security");
                    if (ekyc.mSocialSecurityOrGsis() == null) {
                        bVar.r();
                    } else {
                        y yVarH20 = this.string_adapter;
                        if (yVarH20 == null) {
                            yVarH20 = this.gson.h(String.class);
                            this.string_adapter = yVarH20;
                        }
                        yVarH20.write(bVar, ekyc.mSocialSecurityOrGsis());
                    }
                    bVar.m("tin");
                    if (ekyc.mTin() == null) {
                        bVar.r();
                    } else {
                        y yVarH21 = this.string_adapter;
                        if (yVarH21 == null) {
                            yVarH21 = this.gson.h(String.class);
                            this.string_adapter = yVarH21;
                        }
                        yVarH21.write(bVar, ekyc.mTin());
                    }
                    bVar.m("employment_detail");
                    if (ekyc.mEmploymentDetail() == null) {
                        bVar.r();
                    } else {
                        y yVarH22 = this.string_adapter;
                        if (yVarH22 == null) {
                            yVarH22 = this.gson.h(String.class);
                            this.string_adapter = yVarH22;
                        }
                        yVarH22.write(bVar, ekyc.mEmploymentDetail());
                    }
                    bVar.m("government_id");
                    if (ekyc.mGovernmentIdentification() == null) {
                        bVar.r();
                    } else {
                        y yVarH23 = this.governmentIdentification_adapter;
                        if (yVarH23 == null) {
                            yVarH23 = this.gson.h(GovernmentIdentification.class);
                            this.governmentIdentification_adapter = yVarH23;
                        }
                        yVarH23.write(bVar, ekyc.mGovernmentIdentification());
                    }
                    bVar.m("government_id_url");
                    if (ekyc.mGovernmentIdUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH24 = this.string_adapter;
                        if (yVarH24 == null) {
                            yVarH24 = this.gson.h(String.class);
                            this.string_adapter = yVarH24;
                        }
                        yVarH24.write(bVar, ekyc.mGovernmentIdUrl());
                    }
                    bVar.m("reference_id");
                    if (ekyc.mReferenceId() == null) {
                        bVar.r();
                    } else {
                        y yVarH25 = this.string_adapter;
                        if (yVarH25 == null) {
                            yVarH25 = this.gson.h(String.class);
                            this.string_adapter = yVarH25;
                        }
                        yVarH25.write(bVar, ekyc.mReferenceId());
                    }
                    bVar.m("mUserType");
                    if (ekyc.mUserType() == null) {
                        bVar.r();
                    } else {
                        y yVarH26 = this.string_adapter;
                        if (yVarH26 == null) {
                            yVarH26 = this.gson.h(String.class);
                            this.string_adapter = yVarH26;
                        }
                        yVarH26.write(bVar, ekyc.mUserType());
                    }
                    bVar.m("mGovernmentIdImage");
                    if (ekyc.mGovernmentIdImage() == null) {
                        bVar.r();
                    } else {
                        y yVarH27 = this.file_adapter;
                        if (yVarH27 == null) {
                            yVarH27 = this.gson.h(File.class);
                            this.file_adapter = yVarH27;
                        }
                        yVarH27.write(bVar, ekyc.mGovernmentIdImage());
                    }
                    bVar.m("isSocialSecurity");
                    y yVarH28 = this.boolean__adapter;
                    if (yVarH28 == null) {
                        yVarH28 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH28;
                    }
                    yVarH28.write(bVar, Boolean.valueOf(ekyc.isSocialSecurity()));
                    bVar.m("isPermanentSameWithPresentAddress");
                    y yVarH29 = this.boolean__adapter;
                    if (yVarH29 == null) {
                        yVarH29 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH29;
                    }
                    yVarH29.write(bVar, Boolean.valueOf(ekyc.isPermanentSameWithPresentAddress()));
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
        parcel.writeString(mMsisdn());
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
        parcel.writeParcelable(mPresentAddress(), i);
        parcel.writeParcelable(mPermanentAddress(), i);
        if (mLivenessVideoUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mLivenessVideoUrl());
        }
        if (mLiveDataUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mLiveDataUrl());
        }
        parcel.writeList(mIdList());
        parcel.writeList(mAdditionalDocuments());
        if (mStatus() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mStatus());
        }
        if (mLivenessVideoFile() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(mLivenessVideoFile());
        }
        if (mLiveDataFile() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(mLiveDataFile());
        }
        if (mOcrId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mOcrId());
        }
        if (mSubmissionType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mSubmissionType());
        }
        parcel.writeParcelable(mEDDInformation(), i);
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
        if (mReferenceId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mReferenceId());
        }
        if (mUserType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mUserType());
        }
        if (mGovernmentIdImage() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(mGovernmentIdImage());
        }
        parcel.writeInt(isSocialSecurity() ? 1 : 0);
        parcel.writeInt(isPermanentSameWithPresentAddress() ? 1 : 0);
    }
}
