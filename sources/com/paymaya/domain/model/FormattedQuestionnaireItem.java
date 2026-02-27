package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FormattedQuestionnaireItem implements Parcelable {
    public static final Parcelable.Creator<FormattedQuestionnaireItem> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("answer")
    private final String answer;

    @InterfaceC1497a
    @InterfaceC1498b("mainQuestion")
    private final String mainQuestion;

    @InterfaceC1497a
    @InterfaceC1498b("subQuestion")
    private final List<String> subQuestion;

    public static final class Creator implements Parcelable.Creator<FormattedQuestionnaireItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormattedQuestionnaireItem createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new FormattedQuestionnaireItem(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormattedQuestionnaireItem[] newArray(int i) {
            return new FormattedQuestionnaireItem[i];
        }
    }

    public FormattedQuestionnaireItem(String str, List<String> list, String answer) {
        j.g(answer, "answer");
        this.mainQuestion = str;
        this.subQuestion = list;
        this.answer = answer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormattedQuestionnaireItem copy$default(FormattedQuestionnaireItem formattedQuestionnaireItem, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formattedQuestionnaireItem.mainQuestion;
        }
        if ((i & 2) != 0) {
            list = formattedQuestionnaireItem.subQuestion;
        }
        if ((i & 4) != 0) {
            str2 = formattedQuestionnaireItem.answer;
        }
        return formattedQuestionnaireItem.copy(str, list, str2);
    }

    public final String component1() {
        return this.mainQuestion;
    }

    public final List<String> component2() {
        return this.subQuestion;
    }

    public final String component3() {
        return this.answer;
    }

    public final FormattedQuestionnaireItem copy(String str, List<String> list, String answer) {
        j.g(answer, "answer");
        return new FormattedQuestionnaireItem(str, list, answer);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormattedQuestionnaireItem)) {
            return false;
        }
        FormattedQuestionnaireItem formattedQuestionnaireItem = (FormattedQuestionnaireItem) obj;
        return j.b(this.mainQuestion, formattedQuestionnaireItem.mainQuestion) && j.b(this.subQuestion, formattedQuestionnaireItem.subQuestion) && j.b(this.answer, formattedQuestionnaireItem.answer);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final String getMainQuestion() {
        return this.mainQuestion;
    }

    public final List<String> getSubQuestion() {
        return this.subQuestion;
    }

    public int hashCode() {
        String str = this.mainQuestion;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.subQuestion;
        return this.answer.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.mainQuestion;
        List<String> list = this.subQuestion;
        String str2 = this.answer;
        StringBuilder sb2 = new StringBuilder("FormattedQuestionnaireItem(mainQuestion=");
        sb2.append(str);
        sb2.append(", subQuestion=");
        sb2.append(list);
        sb2.append(", answer=");
        return s.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.mainQuestion);
        dest.writeStringList(this.subQuestion);
        dest.writeString(this.answer);
    }
}
