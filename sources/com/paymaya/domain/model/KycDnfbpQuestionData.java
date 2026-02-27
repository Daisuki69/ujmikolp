package com.paymaya.domain.model;

import We.s;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycDnfbpQuestionData {
    private final KycQuestion question;
    private final String questionId;
    private final String source;

    public KycDnfbpQuestionData(String questionId, KycQuestion question, String source) {
        j.g(questionId, "questionId");
        j.g(question, "question");
        j.g(source, "source");
        this.questionId = questionId;
        this.question = question;
        this.source = source;
    }

    public static /* synthetic */ KycDnfbpQuestionData copy$default(KycDnfbpQuestionData kycDnfbpQuestionData, String str, KycQuestion kycQuestion, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycDnfbpQuestionData.questionId;
        }
        if ((i & 2) != 0) {
            kycQuestion = kycDnfbpQuestionData.question;
        }
        if ((i & 4) != 0) {
            str2 = kycDnfbpQuestionData.source;
        }
        return kycDnfbpQuestionData.copy(str, kycQuestion, str2);
    }

    public final String component1() {
        return this.questionId;
    }

    public final KycQuestion component2() {
        return this.question;
    }

    public final String component3() {
        return this.source;
    }

    public final KycDnfbpQuestionData copy(String questionId, KycQuestion question, String source) {
        j.g(questionId, "questionId");
        j.g(question, "question");
        j.g(source, "source");
        return new KycDnfbpQuestionData(questionId, question, source);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycDnfbpQuestionData)) {
            return false;
        }
        KycDnfbpQuestionData kycDnfbpQuestionData = (KycDnfbpQuestionData) obj;
        return j.b(this.questionId, kycDnfbpQuestionData.questionId) && j.b(this.question, kycDnfbpQuestionData.question) && j.b(this.source, kycDnfbpQuestionData.source);
    }

    public final KycQuestion getQuestion() {
        return this.question;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.source.hashCode() + ((this.question.hashCode() + (this.questionId.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.questionId;
        KycQuestion kycQuestion = this.question;
        String str2 = this.source;
        StringBuilder sb2 = new StringBuilder("KycDnfbpQuestionData(questionId=");
        sb2.append(str);
        sb2.append(", question=");
        sb2.append(kycQuestion);
        sb2.append(", source=");
        return s.p(sb2, str2, ")");
    }
}
