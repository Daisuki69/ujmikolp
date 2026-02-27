package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.InboxMessage;
import j3.a;
import j3.b;
import java.io.IOException;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_InboxMessage extends C$AutoValue_InboxMessage {
    public static final Parcelable.Creator<AutoValue_InboxMessage> CREATOR = new Parcelable.Creator<AutoValue_InboxMessage>() { // from class: com.paymaya.domain.model.AutoValue_InboxMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InboxMessage createFromParcel(Parcel parcel) {
            return new AutoValue_InboxMessage(parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InboxMessage[] newArray(int i) {
            return new AutoValue_InboxMessage[i];
        }
    };

    public AutoValue_InboxMessage(final String str, final String str2, final String str3, final DateTime dateTime, @Nullable final String str4, @Nullable final String str5, @Nullable final String str6, @Nullable final String str7, @Nullable final String str8, final boolean z4) {
        new C$$AutoValue_InboxMessage(str, str2, str3, dateTime, str4, str5, str6, str7, str8, z4) { // from class: com.paymaya.domain.model.$AutoValue_InboxMessage

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_InboxMessage$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private volatile y dateTime_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(InboxMessage)";
                }

                @Override // com.google.gson.y
                public InboxMessage read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    InboxMessage.Builder builderSBuilder = InboxMessage.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "id":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mId((String) yVarH.read(aVar));
                                    break;
                                case "tag":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mTag((String) yVarH2.read(aVar));
                                    break;
                                case "date":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mDateString((String) yVarH3.read(aVar));
                                    break;
                                case "read":
                                    y yVarH4 = this.boolean__adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH4;
                                    }
                                    builderSBuilder.isRead(((Boolean) yVarH4.read(aVar)).booleanValue());
                                    break;
                                case "media":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mMediaLink((String) yVarH5.read(aVar));
                                    break;
                                case "title":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mTitle((String) yVarH6.read(aVar));
                                    break;
                                case "message":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.mMessage((String) yVarH7.read(aVar));
                                    break;
                                case "action_link":
                                    y yVarH8 = this.string_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(String.class);
                                        this.string_adapter = yVarH8;
                                    }
                                    builderSBuilder.mActionLink((String) yVarH8.read(aVar));
                                    break;
                                case "action_text":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.mActionText((String) yVarH9.read(aVar));
                                    break;
                                default:
                                    if (!"mDate".equals(strE)) {
                                        aVar.Q();
                                        break;
                                    } else {
                                        y yVarH10 = this.dateTime_adapter;
                                        if (yVarH10 == null) {
                                            yVarH10 = this.gson.h(DateTime.class);
                                            this.dateTime_adapter = yVarH10;
                                        }
                                        builderSBuilder.mDate((DateTime) yVarH10.read(aVar));
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
                public void write(b bVar, InboxMessage inboxMessage) throws IOException {
                    if (inboxMessage == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (inboxMessage.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, inboxMessage.mId());
                    }
                    bVar.m("message");
                    if (inboxMessage.mMessage() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, inboxMessage.mMessage());
                    }
                    bVar.m("title");
                    if (inboxMessage.mTitle() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, inboxMessage.mTitle());
                    }
                    bVar.m("mDate");
                    if (inboxMessage.mDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.dateTime_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(DateTime.class);
                            this.dateTime_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, inboxMessage.mDate());
                    }
                    bVar.m("date");
                    if (inboxMessage.mDateString() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, inboxMessage.mDateString());
                    }
                    bVar.m("tag");
                    if (inboxMessage.mTag() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, inboxMessage.mTag());
                    }
                    bVar.m("media");
                    if (inboxMessage.mMediaLink() == null) {
                        bVar.r();
                    } else {
                        y yVarH7 = this.string_adapter;
                        if (yVarH7 == null) {
                            yVarH7 = this.gson.h(String.class);
                            this.string_adapter = yVarH7;
                        }
                        yVarH7.write(bVar, inboxMessage.mMediaLink());
                    }
                    bVar.m("action_text");
                    if (inboxMessage.mActionText() == null) {
                        bVar.r();
                    } else {
                        y yVarH8 = this.string_adapter;
                        if (yVarH8 == null) {
                            yVarH8 = this.gson.h(String.class);
                            this.string_adapter = yVarH8;
                        }
                        yVarH8.write(bVar, inboxMessage.mActionText());
                    }
                    bVar.m("action_link");
                    if (inboxMessage.mActionLink() == null) {
                        bVar.r();
                    } else {
                        y yVarH9 = this.string_adapter;
                        if (yVarH9 == null) {
                            yVarH9 = this.gson.h(String.class);
                            this.string_adapter = yVarH9;
                        }
                        yVarH9.write(bVar, inboxMessage.mActionLink());
                    }
                    bVar.m("read");
                    y yVarH10 = this.boolean__adapter;
                    if (yVarH10 == null) {
                        yVarH10 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH10;
                    }
                    yVarH10.write(bVar, Boolean.valueOf(inboxMessage.isRead()));
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
        parcel.writeString(mId());
        parcel.writeString(mMessage());
        parcel.writeString(mTitle());
        parcel.writeSerializable(mDate());
        if (mDateString() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mDateString());
        }
        if (mTag() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mTag());
        }
        if (mMediaLink() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMediaLink());
        }
        if (mActionText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mActionText());
        }
        if (mActionLink() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mActionLink());
        }
        parcel.writeInt(isRead() ? 1 : 0);
    }
}
