package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.InboxMessage;
import g3.InterfaceC1498b;
import org.joda.time.DateTime;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_InboxMessage, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_InboxMessage extends InboxMessage {
    private final boolean isRead;
    private final String mActionLink;
    private final String mActionText;
    private final DateTime mDate;
    private final String mDateString;
    private final String mId;
    private final String mMediaLink;
    private final String mMessage;
    private final String mTag;
    private final String mTitle;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_InboxMessage$Builder */
    public static class Builder extends InboxMessage.Builder {
        private Boolean isRead;
        private String mActionLink;
        private String mActionText;
        private DateTime mDate;
        private String mDateString;
        private String mId;
        private String mMediaLink;
        private String mMessage;
        private String mTag;
        private String mTitle;

        public /* synthetic */ Builder(InboxMessage inboxMessage, int i) {
            this(inboxMessage);
        }

        @Override // com.paymaya.domain.model.InboxMessage.Builder
        public InboxMessage build() {
            String strI = this.mId == null ? " mId" : "";
            if (this.mMessage == null) {
                strI = s.i(strI, " mMessage");
            }
            if (this.mTitle == null) {
                strI = s.i(strI, " mTitle");
            }
            if (this.mDate == null) {
                strI = s.i(strI, " mDate");
            }
            if (this.isRead == null) {
                strI = s.i(strI, " isRead");
            }
            if (strI.isEmpty()) {
                return new AutoValue_InboxMessage(this.mId, this.mMessage, this.mTitle, this.mDate, this.mDateString, this.mTag, this.mMediaLink, this.mActionText, this.mActionLink, this.isRead.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.InboxMessage.Builder
        public InboxMessage.Builder isRead(boolean z4) {
            this.isRead = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.InboxMessage.Builder
        public InboxMessage.Builder mActionLink(String str) {
            this.mActionLink = str;
            return this;
        }

        @Override // com.paymaya.domain.model.InboxMessage.Builder
        public InboxMessage.Builder mActionText(String str) {
            this.mActionText = str;
            return this;
        }

        @Override // com.paymaya.domain.model.InboxMessage.Builder
        public InboxMessage.Builder mDate(DateTime dateTime) {
            if (dateTime == null) {
                throw new NullPointerException("Null mDate");
            }
            this.mDate = dateTime;
            return this;
        }

        @Override // com.paymaya.domain.model.InboxMessage.Builder
        public InboxMessage.Builder mDateString(String str) {
            this.mDateString = str;
            return this;
        }

        @Override // com.paymaya.domain.model.InboxMessage.Builder
        public InboxMessage.Builder mId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mId");
            }
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.InboxMessage.Builder
        public InboxMessage.Builder mMediaLink(String str) {
            this.mMediaLink = str;
            return this;
        }

        @Override // com.paymaya.domain.model.InboxMessage.Builder
        public InboxMessage.Builder mMessage(String str) {
            if (str == null) {
                throw new NullPointerException("Null mMessage");
            }
            this.mMessage = str;
            return this;
        }

        @Override // com.paymaya.domain.model.InboxMessage.Builder
        public InboxMessage.Builder mTag(String str) {
            this.mTag = str;
            return this;
        }

        @Override // com.paymaya.domain.model.InboxMessage.Builder
        public InboxMessage.Builder mTitle(String str) {
            if (str == null) {
                throw new NullPointerException("Null mTitle");
            }
            this.mTitle = str;
            return this;
        }

        public Builder() {
        }

        private Builder(InboxMessage inboxMessage) {
            this.mId = inboxMessage.mId();
            this.mMessage = inboxMessage.mMessage();
            this.mTitle = inboxMessage.mTitle();
            this.mDate = inboxMessage.mDate();
            this.mDateString = inboxMessage.mDateString();
            this.mTag = inboxMessage.mTag();
            this.mMediaLink = inboxMessage.mMediaLink();
            this.mActionText = inboxMessage.mActionText();
            this.mActionLink = inboxMessage.mActionLink();
            this.isRead = Boolean.valueOf(inboxMessage.isRead());
        }
    }

    public C$$AutoValue_InboxMessage(String str, String str2, String str3, DateTime dateTime, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, boolean z4) {
        if (str == null) {
            throw new NullPointerException("Null mId");
        }
        this.mId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mMessage");
        }
        this.mMessage = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mTitle");
        }
        this.mTitle = str3;
        if (dateTime == null) {
            throw new NullPointerException("Null mDate");
        }
        this.mDate = dateTime;
        this.mDateString = str4;
        this.mTag = str5;
        this.mMediaLink = str6;
        this.mActionText = str7;
        this.mActionLink = str8;
        this.isRead = z4;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InboxMessage) {
            InboxMessage inboxMessage = (InboxMessage) obj;
            if (this.mId.equals(inboxMessage.mId()) && this.mMessage.equals(inboxMessage.mMessage()) && this.mTitle.equals(inboxMessage.mTitle()) && this.mDate.equals(inboxMessage.mDate()) && ((str = this.mDateString) != null ? str.equals(inboxMessage.mDateString()) : inboxMessage.mDateString() == null) && ((str2 = this.mTag) != null ? str2.equals(inboxMessage.mTag()) : inboxMessage.mTag() == null) && ((str3 = this.mMediaLink) != null ? str3.equals(inboxMessage.mMediaLink()) : inboxMessage.mMediaLink() == null) && ((str4 = this.mActionText) != null ? str4.equals(inboxMessage.mActionText()) : inboxMessage.mActionText() == null) && ((str5 = this.mActionLink) != null ? str5.equals(inboxMessage.mActionLink()) : inboxMessage.mActionLink() == null) && this.isRead == inboxMessage.isRead()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mMessage.hashCode()) * 1000003) ^ this.mTitle.hashCode()) * 1000003) ^ this.mDate.hashCode()) * 1000003;
        String str = this.mDateString;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mTag;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mMediaLink;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mActionText;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mActionLink;
        return ((iHashCode5 ^ (str5 != null ? str5.hashCode() : 0)) * 1000003) ^ (this.isRead ? 1231 : 1237);
    }

    @Override // com.paymaya.domain.model.InboxMessage
    @InterfaceC1498b("read")
    public boolean isRead() {
        return this.isRead;
    }

    @Override // com.paymaya.domain.model.InboxMessage
    @Nullable
    @InterfaceC1498b("action_link")
    public String mActionLink() {
        return this.mActionLink;
    }

    @Override // com.paymaya.domain.model.InboxMessage
    @Nullable
    @InterfaceC1498b("action_text")
    public String mActionText() {
        return this.mActionText;
    }

    @Override // com.paymaya.domain.model.InboxMessage
    public DateTime mDate() {
        return this.mDate;
    }

    @Override // com.paymaya.domain.model.InboxMessage
    @Nullable
    @InterfaceC1498b("date")
    public String mDateString() {
        return this.mDateString;
    }

    @Override // com.paymaya.domain.model.InboxMessage
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.InboxMessage
    @Nullable
    @InterfaceC1498b("media")
    public String mMediaLink() {
        return this.mMediaLink;
    }

    @Override // com.paymaya.domain.model.InboxMessage
    @InterfaceC1498b("message")
    public String mMessage() {
        return this.mMessage;
    }

    @Override // com.paymaya.domain.model.InboxMessage
    @Nullable
    @InterfaceC1498b("tag")
    public String mTag() {
        return this.mTag;
    }

    @Override // com.paymaya.domain.model.InboxMessage
    @InterfaceC1498b("title")
    public String mTitle() {
        return this.mTitle;
    }

    @Override // com.paymaya.domain.model.InboxMessage
    public InboxMessage.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InboxMessage{mId=");
        sb2.append(this.mId);
        sb2.append(", mMessage=");
        sb2.append(this.mMessage);
        sb2.append(", mTitle=");
        sb2.append(this.mTitle);
        sb2.append(", mDate=");
        sb2.append(this.mDate);
        sb2.append(", mDateString=");
        sb2.append(this.mDateString);
        sb2.append(", mTag=");
        sb2.append(this.mTag);
        sb2.append(", mMediaLink=");
        sb2.append(this.mMediaLink);
        sb2.append(", mActionText=");
        sb2.append(this.mActionText);
        sb2.append(", mActionLink=");
        sb2.append(this.mActionLink);
        sb2.append(", isRead=");
        return s.s(sb2, this.isRead, "}");
    }
}
