package com.paymaya.domain.model;

import We.s;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.Transaction;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Transaction extends C$AutoValue_Transaction {

    public static final class GsonTypeAdapter extends y {
        private volatile y activityDescription_adapter;
        private volatile y amount_adapter;
        private final j gson;
        private volatile y string_adapter;
        private volatile y transactionDetail_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(Transaction)";
        }

        @Override // com.google.gson.y
        public Transaction read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            Transaction.Builder builderSBuilder = Transaction.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "description":
                            y yVarH = this.activityDescription_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(ActivityDescription.class);
                                this.activityDescription_adapter = yVarH;
                            }
                            builderSBuilder.mDescription((ActivityDescription) yVarH.read(aVar));
                            break;
                        case "amount":
                            y yVarH2 = this.amount_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(Amount.class);
                                this.amount_adapter = yVarH2;
                            }
                            builderSBuilder.mAmount((Amount) yVarH2.read(aVar));
                            break;
                        case "method":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mMethod((String) yVarH3.read(aVar));
                            break;
                        case "source":
                            y yVarH4 = this.transactionDetail_adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(TransactionDetail.class);
                                this.transactionDetail_adapter = yVarH4;
                            }
                            builderSBuilder.mSource((TransactionDetail) yVarH4.read(aVar));
                            break;
                        case "target":
                            y yVarH5 = this.transactionDetail_adapter;
                            if (yVarH5 == null) {
                                yVarH5 = this.gson.h(TransactionDetail.class);
                                this.transactionDetail_adapter = yVarH5;
                            }
                            builderSBuilder.mTarget((TransactionDetail) yVarH5.read(aVar));
                            break;
                        case "id":
                            y yVarH6 = this.string_adapter;
                            if (yVarH6 == null) {
                                yVarH6 = this.gson.h(String.class);
                                this.string_adapter = yVarH6;
                            }
                            builderSBuilder.mId((String) yVarH6.read(aVar));
                            break;
                        case "item":
                            y yVarH7 = this.string_adapter;
                            if (yVarH7 == null) {
                                yVarH7 = this.gson.h(String.class);
                                this.string_adapter = yVarH7;
                            }
                            builderSBuilder.mItem((String) yVarH7.read(aVar));
                            break;
                        case "type":
                            y yVarH8 = this.string_adapter;
                            if (yVarH8 == null) {
                                yVarH8 = this.gson.h(String.class);
                                this.string_adapter = yVarH8;
                            }
                            builderSBuilder.mType((String) yVarH8.read(aVar));
                            break;
                        case "timestamp":
                            y yVarH9 = this.string_adapter;
                            if (yVarH9 == null) {
                                yVarH9 = this.gson.h(String.class);
                                this.string_adapter = yVarH9;
                            }
                            builderSBuilder.mTimestamp((String) yVarH9.read(aVar));
                            break;
                        case "request_reference_no":
                            y yVarH10 = this.string_adapter;
                            if (yVarH10 == null) {
                                yVarH10 = this.gson.h(String.class);
                                this.string_adapter = yVarH10;
                            }
                            builderSBuilder.mRequestReferenceNo((String) yVarH10.read(aVar));
                            break;
                        case "message":
                            y yVarH11 = this.string_adapter;
                            if (yVarH11 == null) {
                                yVarH11 = this.gson.h(String.class);
                                this.string_adapter = yVarH11;
                            }
                            builderSBuilder.mMessage((String) yVarH11.read(aVar));
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
        public void write(b bVar, Transaction transaction) throws IOException {
            if (transaction == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(TtmlNode.ATTR_ID);
            if (transaction.mId() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, transaction.mId());
            }
            bVar.m("amount");
            if (transaction.mAmount() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.amount_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(Amount.class);
                    this.amount_adapter = yVarH2;
                }
                yVarH2.write(bVar, transaction.mAmount());
            }
            bVar.m(Constants.METHOD);
            if (transaction.mMethod() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, transaction.mMethod());
            }
            bVar.m(SessionDescription.ATTR_TYPE);
            if (transaction.mType() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.string_adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(String.class);
                    this.string_adapter = yVarH4;
                }
                yVarH4.write(bVar, transaction.mType());
            }
            bVar.m("description");
            if (transaction.mDescription() == null) {
                bVar.r();
            } else {
                y yVarH5 = this.activityDescription_adapter;
                if (yVarH5 == null) {
                    yVarH5 = this.gson.h(ActivityDescription.class);
                    this.activityDescription_adapter = yVarH5;
                }
                yVarH5.write(bVar, transaction.mDescription());
            }
            bVar.m("source");
            if (transaction.mSource() == null) {
                bVar.r();
            } else {
                y yVarH6 = this.transactionDetail_adapter;
                if (yVarH6 == null) {
                    yVarH6 = this.gson.h(TransactionDetail.class);
                    this.transactionDetail_adapter = yVarH6;
                }
                yVarH6.write(bVar, transaction.mSource());
            }
            bVar.m(TypedValues.AttributesType.S_TARGET);
            if (transaction.mTarget() == null) {
                bVar.r();
            } else {
                y yVarH7 = this.transactionDetail_adapter;
                if (yVarH7 == null) {
                    yVarH7 = this.gson.h(TransactionDetail.class);
                    this.transactionDetail_adapter = yVarH7;
                }
                yVarH7.write(bVar, transaction.mTarget());
            }
            bVar.m("timestamp");
            if (transaction.mTimestamp() == null) {
                bVar.r();
            } else {
                y yVarH8 = this.string_adapter;
                if (yVarH8 == null) {
                    yVarH8 = this.gson.h(String.class);
                    this.string_adapter = yVarH8;
                }
                yVarH8.write(bVar, transaction.mTimestamp());
            }
            bVar.m("message");
            if (transaction.mMessage() == null) {
                bVar.r();
            } else {
                y yVarH9 = this.string_adapter;
                if (yVarH9 == null) {
                    yVarH9 = this.gson.h(String.class);
                    this.string_adapter = yVarH9;
                }
                yVarH9.write(bVar, transaction.mMessage());
            }
            bVar.m("item");
            if (transaction.mItem() == null) {
                bVar.r();
            } else {
                y yVarH10 = this.string_adapter;
                if (yVarH10 == null) {
                    yVarH10 = this.gson.h(String.class);
                    this.string_adapter = yVarH10;
                }
                yVarH10.write(bVar, transaction.mItem());
            }
            bVar.m("request_reference_no");
            if (transaction.mRequestReferenceNo() == null) {
                bVar.r();
            } else {
                y yVarH11 = this.string_adapter;
                if (yVarH11 == null) {
                    yVarH11 = this.gson.h(String.class);
                    this.string_adapter = yVarH11;
                }
                yVarH11.write(bVar, transaction.mRequestReferenceNo());
            }
            bVar.k();
        }
    }

    public AutoValue_Transaction(final String str, final Amount amount, final String str2, final String str3, final ActivityDescription activityDescription, final TransactionDetail transactionDetail, final TransactionDetail transactionDetail2, final String str4, final String str5, final String str6, final String str7) {
        new Transaction(str, amount, str2, str3, activityDescription, transactionDetail, transactionDetail2, str4, str5, str6, str7) { // from class: com.paymaya.domain.model.$AutoValue_Transaction
            private final Amount mAmount;
            private final ActivityDescription mDescription;
            private final String mId;
            private final String mItem;
            private final String mMessage;
            private final String mMethod;
            private final String mRequestReferenceNo;
            private final TransactionDetail mSource;
            private final TransactionDetail mTarget;
            private final String mTimestamp;
            private final String mType;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Transaction$Builder */
            public static class Builder extends Transaction.Builder {
                private Amount mAmount;
                private ActivityDescription mDescription;
                private String mId;
                private String mItem;
                private String mMessage;
                private String mMethod;
                private String mRequestReferenceNo;
                private TransactionDetail mSource;
                private TransactionDetail mTarget;
                private String mTimestamp;
                private String mType;

                @Override // com.paymaya.domain.model.Transaction.Builder
                public Transaction build() {
                    String strI = this.mId == null ? " mId" : "";
                    if (this.mAmount == null) {
                        strI = s.i(strI, " mAmount");
                    }
                    if (this.mMethod == null) {
                        strI = s.i(strI, " mMethod");
                    }
                    if (this.mType == null) {
                        strI = s.i(strI, " mType");
                    }
                    if (this.mDescription == null) {
                        strI = s.i(strI, " mDescription");
                    }
                    if (this.mSource == null) {
                        strI = s.i(strI, " mSource");
                    }
                    if (this.mTarget == null) {
                        strI = s.i(strI, " mTarget");
                    }
                    if (this.mTimestamp == null) {
                        strI = s.i(strI, " mTimestamp");
                    }
                    if (this.mMessage == null) {
                        strI = s.i(strI, " mMessage");
                    }
                    if (this.mItem == null) {
                        strI = s.i(strI, " mItem");
                    }
                    if (this.mRequestReferenceNo == null) {
                        strI = s.i(strI, " mRequestReferenceNo");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_Transaction(this.mId, this.mAmount, this.mMethod, this.mType, this.mDescription, this.mSource, this.mTarget, this.mTimestamp, this.mMessage, this.mItem, this.mRequestReferenceNo);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.Transaction.Builder
                public Transaction.Builder mAmount(Amount amount) {
                    if (amount == null) {
                        throw new NullPointerException("Null mAmount");
                    }
                    this.mAmount = amount;
                    return this;
                }

                @Override // com.paymaya.domain.model.Transaction.Builder
                public Transaction.Builder mDescription(ActivityDescription activityDescription) {
                    if (activityDescription == null) {
                        throw new NullPointerException("Null mDescription");
                    }
                    this.mDescription = activityDescription;
                    return this;
                }

                @Override // com.paymaya.domain.model.Transaction.Builder
                public Transaction.Builder mId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mId");
                    }
                    this.mId = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Transaction.Builder
                public Transaction.Builder mItem(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mItem");
                    }
                    this.mItem = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Transaction.Builder
                public Transaction.Builder mMessage(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mMessage");
                    }
                    this.mMessage = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Transaction.Builder
                public Transaction.Builder mMethod(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mMethod");
                    }
                    this.mMethod = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Transaction.Builder
                public Transaction.Builder mRequestReferenceNo(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mRequestReferenceNo");
                    }
                    this.mRequestReferenceNo = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Transaction.Builder
                public Transaction.Builder mSource(TransactionDetail transactionDetail) {
                    if (transactionDetail == null) {
                        throw new NullPointerException("Null mSource");
                    }
                    this.mSource = transactionDetail;
                    return this;
                }

                @Override // com.paymaya.domain.model.Transaction.Builder
                public Transaction.Builder mTarget(TransactionDetail transactionDetail) {
                    if (transactionDetail == null) {
                        throw new NullPointerException("Null mTarget");
                    }
                    this.mTarget = transactionDetail;
                    return this;
                }

                @Override // com.paymaya.domain.model.Transaction.Builder
                public Transaction.Builder mTimestamp(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mTimestamp");
                    }
                    this.mTimestamp = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.Transaction.Builder
                public Transaction.Builder mType(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mType");
                    }
                    this.mType = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mId");
                }
                this.mId = str;
                if (amount == null) {
                    throw new NullPointerException("Null mAmount");
                }
                this.mAmount = amount;
                if (str2 == null) {
                    throw new NullPointerException("Null mMethod");
                }
                this.mMethod = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null mType");
                }
                this.mType = str3;
                if (activityDescription == null) {
                    throw new NullPointerException("Null mDescription");
                }
                this.mDescription = activityDescription;
                if (transactionDetail == null) {
                    throw new NullPointerException("Null mSource");
                }
                this.mSource = transactionDetail;
                if (transactionDetail2 == null) {
                    throw new NullPointerException("Null mTarget");
                }
                this.mTarget = transactionDetail2;
                if (str4 == null) {
                    throw new NullPointerException("Null mTimestamp");
                }
                this.mTimestamp = str4;
                if (str5 == null) {
                    throw new NullPointerException("Null mMessage");
                }
                this.mMessage = str5;
                if (str6 == null) {
                    throw new NullPointerException("Null mItem");
                }
                this.mItem = str6;
                if (str7 == null) {
                    throw new NullPointerException("Null mRequestReferenceNo");
                }
                this.mRequestReferenceNo = str7;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Transaction) {
                    Transaction transaction = (Transaction) obj;
                    if (this.mId.equals(transaction.mId()) && this.mAmount.equals(transaction.mAmount()) && this.mMethod.equals(transaction.mMethod()) && this.mType.equals(transaction.mType()) && this.mDescription.equals(transaction.mDescription()) && this.mSource.equals(transaction.mSource()) && this.mTarget.equals(transaction.mTarget()) && this.mTimestamp.equals(transaction.mTimestamp()) && this.mMessage.equals(transaction.mMessage()) && this.mItem.equals(transaction.mItem()) && this.mRequestReferenceNo.equals(transaction.mRequestReferenceNo())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((((((((((((((((((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mAmount.hashCode()) * 1000003) ^ this.mMethod.hashCode()) * 1000003) ^ this.mType.hashCode()) * 1000003) ^ this.mDescription.hashCode()) * 1000003) ^ this.mSource.hashCode()) * 1000003) ^ this.mTarget.hashCode()) * 1000003) ^ this.mTimestamp.hashCode()) * 1000003) ^ this.mMessage.hashCode()) * 1000003) ^ this.mItem.hashCode()) * 1000003) ^ this.mRequestReferenceNo.hashCode();
            }

            @Override // com.paymaya.domain.model.Transaction
            @InterfaceC1498b("amount")
            public Amount mAmount() {
                return this.mAmount;
            }

            @Override // com.paymaya.domain.model.Transaction
            @InterfaceC1498b("description")
            public ActivityDescription mDescription() {
                return this.mDescription;
            }

            @Override // com.paymaya.domain.model.Transaction
            @InterfaceC1498b(TtmlNode.ATTR_ID)
            public String mId() {
                return this.mId;
            }

            @Override // com.paymaya.domain.model.Transaction
            @InterfaceC1498b("item")
            public String mItem() {
                return this.mItem;
            }

            @Override // com.paymaya.domain.model.Transaction
            @InterfaceC1498b("message")
            public String mMessage() {
                return this.mMessage;
            }

            @Override // com.paymaya.domain.model.Transaction
            @InterfaceC1498b(Constants.METHOD)
            public String mMethod() {
                return this.mMethod;
            }

            @Override // com.paymaya.domain.model.Transaction
            @InterfaceC1498b("request_reference_no")
            public String mRequestReferenceNo() {
                return this.mRequestReferenceNo;
            }

            @Override // com.paymaya.domain.model.Transaction
            @InterfaceC1498b("source")
            public TransactionDetail mSource() {
                return this.mSource;
            }

            @Override // com.paymaya.domain.model.Transaction
            @InterfaceC1498b(TypedValues.AttributesType.S_TARGET)
            public TransactionDetail mTarget() {
                return this.mTarget;
            }

            @Override // com.paymaya.domain.model.Transaction
            @InterfaceC1498b("timestamp")
            public String mTimestamp() {
                return this.mTimestamp;
            }

            @Override // com.paymaya.domain.model.Transaction
            @InterfaceC1498b(SessionDescription.ATTR_TYPE)
            public String mType() {
                return this.mType;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Transaction{mId=");
                sb2.append(this.mId);
                sb2.append(", mAmount=");
                sb2.append(this.mAmount);
                sb2.append(", mMethod=");
                sb2.append(this.mMethod);
                sb2.append(", mType=");
                sb2.append(this.mType);
                sb2.append(", mDescription=");
                sb2.append(this.mDescription);
                sb2.append(", mSource=");
                sb2.append(this.mSource);
                sb2.append(", mTarget=");
                sb2.append(this.mTarget);
                sb2.append(", mTimestamp=");
                sb2.append(this.mTimestamp);
                sb2.append(", mMessage=");
                sb2.append(this.mMessage);
                sb2.append(", mItem=");
                sb2.append(this.mItem);
                sb2.append(", mRequestReferenceNo=");
                return s.p(sb2, this.mRequestReferenceNo, "}");
            }
        };
    }
}
