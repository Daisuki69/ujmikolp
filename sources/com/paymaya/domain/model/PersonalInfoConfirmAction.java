package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import jj.InterfaceC1685a;
import k2.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PersonalInfoConfirmAction implements Parcelable {

    public static final class Edit extends PersonalInfoConfirmAction {
        public static final Parcelable.Creator<Edit> CREATOR = new Creator();
        private final Section section;

        public static final class Creator implements Parcelable.Creator<Edit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Edit createFromParcel(Parcel parcel) {
                j.g(parcel, "parcel");
                return new Edit(Section.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Edit[] newArray(int i) {
                return new Edit[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Edit(Section section) {
            super(null);
            j.g(section, "section");
            this.section = section;
        }

        public static /* synthetic */ Edit copy$default(Edit edit, Section section, int i, Object obj) {
            if ((i & 1) != 0) {
                section = edit.section;
            }
            return edit.copy(section);
        }

        public final Section component1() {
            return this.section;
        }

        public final Edit copy(Section section) {
            j.g(section, "section");
            return new Edit(section);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Edit) && this.section == ((Edit) obj).section;
        }

        public final Section getSection() {
            return this.section;
        }

        public int hashCode() {
            return this.section.hashCode();
        }

        public String toString() {
            return "Edit(section=" + this.section + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            j.g(dest, "dest");
            dest.writeString(this.section.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Section {
        private static final /* synthetic */ InterfaceC1685a $ENTRIES;
        private static final /* synthetic */ Section[] $VALUES;
        public static final Section WORK = new Section("WORK", 0);
        public static final Section FULL_NAME = new Section("FULL_NAME", 1);
        public static final Section CURRENT_ADDRESS = new Section("CURRENT_ADDRESS", 2);
        public static final Section PERMANENT_ADDRESS = new Section("PERMANENT_ADDRESS", 3);
        public static final Section PERMANENT_TOGGLE = new Section("PERMANENT_TOGGLE", 4);
        public static final Section ID_DETAILS = new Section("ID_DETAILS", 5);

        private static final /* synthetic */ Section[] $values() {
            return new Section[]{WORK, FULL_NAME, CURRENT_ADDRESS, PERMANENT_ADDRESS, PERMANENT_TOGGLE, ID_DETAILS};
        }

        static {
            Section[] sectionArr$values = $values();
            $VALUES = sectionArr$values;
            $ENTRIES = v0.h(sectionArr$values);
        }

        private Section(String str, int i) {
        }

        public static InterfaceC1685a getEntries() {
            return $ENTRIES;
        }

        public static Section valueOf(String str) {
            return (Section) Enum.valueOf(Section.class, str);
        }

        public static Section[] values() {
            return (Section[]) $VALUES.clone();
        }
    }

    public static final class Submit extends PersonalInfoConfirmAction {
        public static final Submit INSTANCE = new Submit();
        public static final Parcelable.Creator<Submit> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Submit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Submit createFromParcel(Parcel parcel) {
                j.g(parcel, "parcel");
                parcel.readInt();
                return Submit.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Submit[] newArray(int i) {
                return new Submit[i];
            }
        }

        private Submit() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            j.g(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ PersonalInfoConfirmAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PersonalInfoConfirmAction() {
    }
}
