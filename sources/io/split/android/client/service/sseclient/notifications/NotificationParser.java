package io.split.android.client.service.sseclient.notifications;

import Ri.a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import defpackage.AbstractC1414e;
import io.split.android.client.utils.b;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class NotificationParser {
    private static final String EVENT_TYPE_ERROR = "error";
    private static final String EVENT_TYPE_FIELD = "event";

    @Nullable
    public String extractUserKeyHashFromChannel(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(Global.UNDERSCORE);
        if (strArrSplit.length > 2) {
            return strArrSplit[2];
        }
        return null;
    }

    public boolean isError(Map<String, String> map) {
        return map != null && "error".equals(map.get("event"));
    }

    public ControlNotification parseControl(String str) throws JsonSyntaxException {
        return (ControlNotification) b.f17635a.e(str, ControlNotification.class);
    }

    public StreamingError parseError(String str) throws JsonSyntaxException {
        return (StreamingError) b.f17635a.e(str, StreamingError.class);
    }

    public IncomingNotification parseIncoming(String str) throws JsonSyntaxException {
        try {
            j jVar = b.f17635a;
            RawNotification rawNotification = (RawNotification) jVar.e(str, RawNotification.class);
            try {
                NotificationType type = ((IncomingNotificationType) jVar.e(rawNotification.getData(), IncomingNotificationType.class)).getType();
                if (type == null) {
                    type = NotificationType.OCCUPANCY;
                }
                return new IncomingNotification(type, rawNotification.getChannel(), rawNotification.getData(), rawNotification.getTimestamp());
            } catch (JsonSyntaxException e) {
                a.g("Error parsing notification: " + e.getLocalizedMessage());
                return null;
            } catch (Exception e7) {
                AbstractC1414e.o(e7, new StringBuilder("Unexpected error while parsing incoming notification: "));
                return null;
            }
        } catch (JsonSyntaxException e10) {
            a.g("Unexpected error while parsing raw notification: " + e10.getLocalizedMessage());
            return null;
        }
    }

    public KeyList parseKeyList(String str) throws JsonSyntaxException {
        return (KeyList) b.f17635a.e(str, KeyList.class);
    }

    @Nullable
    public MembershipNotification parseMembershipNotification(String str) {
        try {
            return (MembershipNotification) b.f17635a.e(str, MembershipNotification.class);
        } catch (Exception unused) {
            a.q("Failed to parse membership notification");
            return null;
        }
    }

    public OccupancyNotification parseOccupancy(String str) throws JsonSyntaxException {
        return (OccupancyNotification) b.f17635a.e(str, OccupancyNotification.class);
    }

    @NonNull
    public RuleBasedSegmentChangeNotification parseRuleBasedSegmentUpdate(String str) {
        return (RuleBasedSegmentChangeNotification) b.f17635a.e(str, RuleBasedSegmentChangeNotification.class);
    }

    @NonNull
    public SplitKillNotification parseSplitKill(String str) throws JsonSyntaxException {
        return (SplitKillNotification) b.f17635a.e(str, SplitKillNotification.class);
    }

    @NonNull
    public SplitsChangeNotification parseSplitUpdate(String str) throws JsonSyntaxException {
        return (SplitsChangeNotification) b.f17635a.e(str, SplitsChangeNotification.class);
    }
}
