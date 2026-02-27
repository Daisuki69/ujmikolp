package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_InboxMessage;
import com.paymaya.domain.model.C$AutoValue_InboxMessage;
import com.paymaya.domain.model.InboxItem;
import g3.InterfaceC1498b;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InboxMessage implements InboxItem, Parcelable {

    public static abstract class Builder {
        public abstract InboxMessage build();

        public abstract Builder isRead(boolean z4);

        public abstract Builder mActionLink(String str);

        public abstract Builder mActionText(String str);

        public abstract Builder mDate(DateTime dateTime);

        public abstract Builder mDateString(String str);

        public abstract Builder mId(String str);

        public abstract Builder mMediaLink(String str);

        public abstract Builder mMessage(String str);

        public abstract Builder mTag(String str);

        public abstract Builder mTitle(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_InboxMessage.Builder().mDate(new DateTime()).isRead(false);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_InboxMessage.GsonTypeAdapter(jVar);
    }

    @Override // com.paymaya.domain.model.InboxItem
    public InboxItem.VIEW_TYPE getViewType() {
        return InboxItem.VIEW_TYPE.VIEW_TYPE_ITEM;
    }

    @InterfaceC1498b("read")
    public abstract boolean isRead();

    @Nullable
    @InterfaceC1498b("action_link")
    public abstract String mActionLink();

    @Nullable
    @InterfaceC1498b("action_text")
    public abstract String mActionText();

    public abstract DateTime mDate();

    @Nullable
    @InterfaceC1498b("date")
    public abstract String mDateString();

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @Nullable
    @InterfaceC1498b("media")
    public abstract String mMediaLink();

    @InterfaceC1498b("message")
    public abstract String mMessage();

    @Nullable
    @InterfaceC1498b("tag")
    public abstract String mTag();

    @InterfaceC1498b("title")
    public abstract String mTitle();

    public abstract Builder toBuilder();
}
