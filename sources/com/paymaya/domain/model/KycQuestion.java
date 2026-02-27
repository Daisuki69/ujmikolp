package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycQuestion implements Parcelable {
    public static final Parcelable.Creator<KycQuestion> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("main_question")
    private final String mainQuestion;

    @InterfaceC1497a
    @InterfaceC1498b("options")
    private final List<KycOption> options;

    @InterfaceC1497a
    @InterfaceC1498b("sub_question")
    private final List<String> subQuestions;

    public static final class Creator implements Parcelable.Creator<KycQuestion> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycQuestion createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(KycOption.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new KycQuestion(numValueOf, string, arrayListCreateStringArrayList, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycQuestion[] newArray(int i) {
            return new KycQuestion[i];
        }
    }

    public KycQuestion() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycQuestion copy$default(KycQuestion kycQuestion, Integer num, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycQuestion.id;
        }
        if ((i & 2) != 0) {
            str = kycQuestion.mainQuestion;
        }
        if ((i & 4) != 0) {
            list = kycQuestion.subQuestions;
        }
        if ((i & 8) != 0) {
            list2 = kycQuestion.options;
        }
        return kycQuestion.copy(num, str, list, list2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.mainQuestion;
    }

    public final List<String> component3() {
        return this.subQuestions;
    }

    public final List<KycOption> component4() {
        return this.options;
    }

    public final KycQuestion copy(Integer num, String str, List<String> list, List<KycOption> list2) {
        return new KycQuestion(num, str, list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycQuestion)) {
            return false;
        }
        KycQuestion kycQuestion = (KycQuestion) obj;
        return j.b(this.id, kycQuestion.id) && j.b(this.mainQuestion, kycQuestion.mainQuestion) && j.b(this.subQuestions, kycQuestion.subQuestions) && j.b(this.options, kycQuestion.options);
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getMainQuestion() {
        return this.mainQuestion;
    }

    public final List<KycOption> getOptions() {
        return this.options;
    }

    public final List<String> getSubQuestions() {
        return this.subQuestions;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.mainQuestion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.subQuestions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<KycOption> list2 = this.options;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.mainQuestion;
        List<String> list = this.subQuestions;
        List<KycOption> list2 = this.options;
        StringBuilder sbO = AbstractC1213b.O(num, "KycQuestion(id=", ", mainQuestion=", str, ", subQuestions=");
        sbO.append(list);
        sbO.append(", options=");
        sbO.append(list2);
        sbO.append(")");
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeString(this.mainQuestion);
        dest.writeStringList(this.subQuestions);
        List<KycOption> list = this.options;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((KycOption) itP.next()).writeToParcel(dest, i);
        }
    }

    public KycQuestion(Integer num, String str, List<String> list, List<KycOption> list2) {
        this.id = num;
        this.mainQuestion = str;
        this.subQuestions = list;
        this.options = list2;
    }

    public KycQuestion(Integer num, String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C1112C.f9377a : list, (i & 8) != 0 ? C1112C.f9377a : list2);
    }
}
