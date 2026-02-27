package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class UpdateProfileSelectionItem implements Parcelable {
    private static final String UNDEFINED_CODE = "-1";
    private final String code;
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UpdateProfileSelectionItem> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UpdateProfileSelectionItem toSelectionItem(Gender gender) {
            j.g(gender, "<this>");
            String code = gender.getCode();
            if (code == null) {
                code = UpdateProfileSelectionItem.UNDEFINED_CODE;
            }
            String name = gender.getName();
            if (name == null) {
                name = "";
            }
            return new UpdateProfileSelectionItem(code, name);
        }

        private Companion() {
        }

        public final UpdateProfileSelectionItem toSelectionItem(MaritalStatus maritalStatus) {
            j.g(maritalStatus, "<this>");
            String code = maritalStatus.getCode();
            if (code == null) {
                code = UpdateProfileSelectionItem.UNDEFINED_CODE;
            }
            String name = maritalStatus.getName();
            if (name == null) {
                name = "";
            }
            return new UpdateProfileSelectionItem(code, name);
        }

        public final UpdateProfileSelectionItem toSelectionItem(EducationalAttainment educationalAttainment) {
            j.g(educationalAttainment, "<this>");
            String code = educationalAttainment.getCode();
            if (code == null) {
                code = UpdateProfileSelectionItem.UNDEFINED_CODE;
            }
            String name = educationalAttainment.getName();
            if (name == null) {
                name = "";
            }
            return new UpdateProfileSelectionItem(code, name);
        }

        public final UpdateProfileSelectionItem toSelectionItem(UpdateProfileWorkNature updateProfileWorkNature) {
            j.g(updateProfileWorkNature, "<this>");
            String code = updateProfileWorkNature.getCode();
            if (code == null) {
                code = UpdateProfileSelectionItem.UNDEFINED_CODE;
            }
            String name = updateProfileWorkNature.getName();
            if (name == null) {
                name = "";
            }
            return new UpdateProfileSelectionItem(code, name);
        }

        public final UpdateProfileSelectionItem toSelectionItem(JobTitle jobTitle) {
            j.g(jobTitle, "<this>");
            String code = jobTitle.getCode();
            if (code == null) {
                code = UpdateProfileSelectionItem.UNDEFINED_CODE;
            }
            String name = jobTitle.getName();
            if (name == null) {
                name = "";
            }
            return new UpdateProfileSelectionItem(code, name);
        }

        public final UpdateProfileSelectionItem toSelectionItem(UpdateProfileIncomeSource updateProfileIncomeSource) {
            j.g(updateProfileIncomeSource, "<this>");
            String code = updateProfileIncomeSource.getCode();
            if (code == null) {
                code = UpdateProfileSelectionItem.UNDEFINED_CODE;
            }
            String name = updateProfileIncomeSource.getName();
            if (name == null) {
                name = "";
            }
            return new UpdateProfileSelectionItem(code, name);
        }

        public final UpdateProfileSelectionItem toSelectionItem(ContactReferenceRelationship contactReferenceRelationship) {
            j.g(contactReferenceRelationship, "<this>");
            String code = contactReferenceRelationship.getCode();
            if (code == null) {
                code = UpdateProfileSelectionItem.UNDEFINED_CODE;
            }
            String name = contactReferenceRelationship.getName();
            if (name == null) {
                name = "";
            }
            return new UpdateProfileSelectionItem(code, name);
        }
    }

    public static final class Creator implements Parcelable.Creator<UpdateProfileSelectionItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateProfileSelectionItem createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new UpdateProfileSelectionItem(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateProfileSelectionItem[] newArray(int i) {
            return new UpdateProfileSelectionItem[i];
        }
    }

    public UpdateProfileSelectionItem(String code, String text) {
        j.g(code, "code");
        j.g(text, "text");
        this.code = code;
        this.text = text;
    }

    public static /* synthetic */ UpdateProfileSelectionItem copy$default(UpdateProfileSelectionItem updateProfileSelectionItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateProfileSelectionItem.code;
        }
        if ((i & 2) != 0) {
            str2 = updateProfileSelectionItem.text;
        }
        return updateProfileSelectionItem.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.text;
    }

    public final UpdateProfileSelectionItem copy(String code, String text) {
        j.g(code, "code");
        j.g(text, "text");
        return new UpdateProfileSelectionItem(code, text);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateProfileSelectionItem)) {
            return false;
        }
        UpdateProfileSelectionItem updateProfileSelectionItem = (UpdateProfileSelectionItem) obj;
        return j.b(this.code, updateProfileSelectionItem.code) && j.b(this.text, updateProfileSelectionItem.text);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.code.hashCode() * 31);
    }

    public String toString() {
        return s.l("UpdateProfileSelectionItem(code=", this.code, ", text=", this.text, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.text);
    }
}
