package com.dynatrace.android.agent;

import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class WebReqTag {
    private static final String TAG_PREFIX = "MT_3_";
    private String applId;
    private long parentTagId;
    private int seqNumber;
    private int serverId;
    private Session session;
    private long threadId;

    public WebReqTag(long j, int i, Session session) {
        this(i, session, AdkSettings.appIdEncoded, j, Utility.getCurrentThreadId(), Utility.getEventSeqNum());
    }

    public static String fetchWebReqTag(URLConnection uRLConnection, String str) {
        if (uRLConnection == null) {
            return null;
        }
        try {
            return uRLConnection.getRequestProperty(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getTagPrefix() {
        return TAG_PREFIX;
    }

    public static WebReqTag parseTag(String str, Session session) {
        if (str != null && str.length() >= 1) {
            String[] strArrSplit = str.split(Global.UNDERSCORE);
            if (strArrSplit.length != 9) {
                return null;
            }
            try {
                long j = Long.parseLong(strArrSplit[3]);
                int iIndexOf = strArrSplit[4].indexOf(45);
                int i = Integer.parseInt(strArrSplit[4].substring(0, iIndexOf));
                int i4 = Integer.parseInt(strArrSplit[4].substring(iIndexOf + 1));
                if (session.visitorId == j && session.sessionId == i && session.sequenceNumber == i4) {
                    return new WebReqTag(Integer.parseInt(strArrSplit[2]), session, strArrSplit[5], Long.parseLong(strArrSplit[6]), Long.parseLong(strArrSplit[7]), Integer.parseInt(strArrSplit[8]));
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String tagToString(WebReqTag webReqTag) {
        return webReqTag == null ? "" : webReqTag.toString();
    }

    public long getParentTagId() {
        return this.parentTagId;
    }

    public int getSeqNumber() {
        return this.seqNumber;
    }

    public int getServerId() {
        return this.serverId;
    }

    public Session getSession() {
        return this.session;
    }

    public boolean sameAs(WebReqTag webReqTag) {
        if (webReqTag == null) {
            return false;
        }
        return sameAs(webReqTag.toString());
    }

    public String toString() {
        return TAG_PREFIX + this.serverId + Global.UNDERSCORE + this.session.visitorId + Global.UNDERSCORE + this.session.sessionId + Global.HYPHEN + this.session.sequenceNumber + Global.UNDERSCORE + this.applId + Global.UNDERSCORE + this.parentTagId + Global.UNDERSCORE + this.threadId + Global.UNDERSCORE + this.seqNumber;
    }

    public boolean sameAs(String str) {
        if (str == null) {
            return false;
        }
        return toString().equals(str);
    }

    public WebReqTag(int i, Session session, String str, long j, long j6, int i4) {
        this.serverId = i;
        this.session = session;
        this.applId = str;
        this.parentTagId = j;
        this.threadId = j6;
        this.seqNumber = i4;
    }
}
