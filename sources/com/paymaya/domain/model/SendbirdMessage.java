package com.paymaya.domain.model;

import Ke.d;
import M8.T2;
import cj.M;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.internal.k;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class SendbirdMessage {
    private static final String CHANNEL_KEY = "channel";
    private static final String CHANNEL_URL_KEY = "channel_url";
    private static final String CUSTOM_PUSH_TITLE_KEY = "push_title";
    private static final String CUSTOM_TYPE_KEY = "custom_type";
    public static final Companion Companion = new Companion(null);
    private static final String INBOX_SUPPORT_ROUTE = "support";
    private static final String MAYARI_SUPPORT_CHANNEL_CUSTOM_TYPE = "MAYARI_SUPPORT_CHAT_CHANNEL";
    private static final String MESSAGE_ID_KEY = "message_id";
    private static final String MESSAGE_KEY = "message";
    private static final String MESSAGE_TIMESTAMP_KEY = "created_at";
    private static final String NAME_KEY = "name";
    private static final String NOTIFICATION_PUSH_DATA_CASE_ID_KEY = "case_id";
    private static final String NOTIFICATION_PUSH_DATA_KEY = "notification_push_data";
    private static final String NOTIFICATION_PUSH_DATA_TYPE_KEY = "type";
    private static final String SUPPORT_CHANNEL_CUSTOM_TYPE = "SALESFORCE_SUPPORT_CHAT_CHANNEL";
    private final Map<String, o> channel;
    private final String channelCustomType;
    private final String channelName;
    private final String channelUrl;
    private final o customTitle;
    private final RemoteMessage message;
    private final String messageBody;
    private final String messageId;
    private final String messageTimestamp;
    private final Map<String, o> notificationPushData;
    private final String notificationPushDataCaseId;
    private final String notificationPushDataType;
    private final String processedRoute;
    private final String pushTitle;
    private final q sendbird;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SendbirdMessage(RemoteMessage message) {
        String strO;
        String lowerCase;
        j.g(message, "message");
        this.message = message;
        q qVarG = T2.x((String) message.getData().get("sendbird")).g();
        this.sendbird = qVarG;
        k kVar = qVarG.m("channel").g().f10034a;
        j.f(kVar, "asMap(...)");
        this.channel = kVar;
        this.channelUrl = C2576A.O(String.valueOf(kVar.get(CHANNEL_URL_KEY)));
        String strValueOf = String.valueOf(kVar.get("name"));
        zj.o oVar = d.f2649a;
        String strO2 = C2576A.O(strValueOf);
        this.channelName = strO2;
        String strO3 = C2576A.O(String.valueOf(kVar.get(CUSTOM_TYPE_KEY)));
        this.channelCustomType = strO3;
        String string = qVarG.m("created_at").toString();
        j.f(string, "toString(...)");
        this.messageTimestamp = C2576A.O(string);
        String string2 = qVarG.m(MESSAGE_ID_KEY).toString();
        j.f(string2, "toString(...)");
        this.messageId = C2576A.O(string2);
        this.messageBody = String.valueOf(message.getData().get("message"));
        o oVarM = qVarG.m(CUSTOM_PUSH_TITLE_KEY);
        j.f(oVarM, "get(...)");
        this.customTitle = oVarM;
        if (oVarM instanceof p) {
            strO = strO2;
        } else {
            String string3 = oVarM.toString();
            j.f(string3, "toString(...)");
            strO = C2576A.O(string3);
        }
        this.pushTitle = strO;
        if (strO3.equals(SUPPORT_CHANNEL_CUSTOM_TYPE) || strO3.equals(MAYARI_SUPPORT_CHANNEL_CUSTOM_TYPE)) {
            lowerCase = INBOX_SUPPORT_ROUTE;
        } else {
            lowerCase = strO2.toLowerCase(Locale.ROOT);
            j.f(lowerCase, "toLowerCase(...)");
        }
        this.processedRoute = lowerCase;
        o oVarM2 = qVarG.m(NOTIFICATION_PUSH_DATA_KEY);
        Map<String, o> mapE = (oVarM2 == null || (mapE = oVarM2.g().f10034a) == null) ? M.e() : mapE;
        this.notificationPushData = mapE;
        this.notificationPushDataType = C2576A.O(String.valueOf(mapE.get("type")));
        this.notificationPushDataCaseId = C2576A.O(String.valueOf(mapE.get(NOTIFICATION_PUSH_DATA_CASE_ID_KEY)));
    }

    public static /* synthetic */ SendbirdMessage copy$default(SendbirdMessage sendbirdMessage, RemoteMessage remoteMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            remoteMessage = sendbirdMessage.message;
        }
        return sendbirdMessage.copy(remoteMessage);
    }

    public final RemoteMessage component1() {
        return this.message;
    }

    public final SendbirdMessage copy(RemoteMessage message) {
        j.g(message, "message");
        return new SendbirdMessage(message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SendbirdMessage) && j.b(this.message, ((SendbirdMessage) obj).message);
    }

    public final Map<String, o> getChannel() {
        return this.channel;
    }

    public final String getChannelUrl() {
        return this.channelUrl;
    }

    public final RemoteMessage getMessage() {
        return this.message;
    }

    public final String getMessageBody() {
        return this.messageBody;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getMessageTimestamp() {
        return this.messageTimestamp;
    }

    public final String getNotificationPushDataCaseId() {
        return this.notificationPushDataCaseId;
    }

    public final String getNotificationPushDataType() {
        return this.notificationPushDataType;
    }

    public final String getProcessedRoute() {
        return this.processedRoute;
    }

    public final String getPushTitle() {
        return this.pushTitle;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        return "SendbirdMessage(message=" + this.message + ")";
    }
}
