package com.paymaya.domain.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_Transaction;
import com.paymaya.domain.model.C$AutoValue_Transaction;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Transaction {

    public static abstract class Builder {
        public abstract Transaction build();

        public abstract Builder mAmount(Amount amount);

        public abstract Builder mDescription(ActivityDescription activityDescription);

        public abstract Builder mId(String str);

        public abstract Builder mItem(String str);

        public abstract Builder mMessage(String str);

        public abstract Builder mMethod(String str);

        public abstract Builder mRequestReferenceNo(String str);

        public abstract Builder mSource(TransactionDetail transactionDetail);

        public abstract Builder mTarget(TransactionDetail transactionDetail);

        public abstract Builder mTimestamp(String str);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_Transaction.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_Transaction.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("amount")
    public abstract Amount mAmount();

    @InterfaceC1498b("description")
    public abstract ActivityDescription mDescription();

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b("item")
    public abstract String mItem();

    @InterfaceC1498b("message")
    public abstract String mMessage();

    @InterfaceC1498b(Constants.METHOD)
    public abstract String mMethod();

    @InterfaceC1498b("request_reference_no")
    public abstract String mRequestReferenceNo();

    @InterfaceC1498b("source")
    public abstract TransactionDetail mSource();

    @InterfaceC1498b(TypedValues.AttributesType.S_TARGET)
    public abstract TransactionDetail mTarget();

    @InterfaceC1498b("timestamp")
    public abstract String mTimestamp();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();
}
