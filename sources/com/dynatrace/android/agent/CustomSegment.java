package com.dynatrace.android.agent;

import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.crash.PlatformType;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.internal.api.SelfMonitoring;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class CustomSegment implements Segment {
    static final int ORPHAN_PLACEHOLDER = 100;
    static final int REPORT_ACTION = 5;
    static final int REPORT_ACTION_BEGIN = 1;
    static final int REPORT_ACTION_END = 2;
    static final int REPORT_CRASH_EVENT = 11;
    static final int REPORT_CRASH_EVENT_CROSS_PLATFORM = 21;
    static final int REPORT_CUSTOM_DBL_EVENT = 7;
    static final int REPORT_CUSTOM_INT_EVENT = 6;
    static final int REPORT_CUSTOM_STR_EVENT = 8;
    static final int REPORT_ERROR_INT_EVENT = 9;
    static final int REPORT_ERROR_STR_EVENT = 10;
    static final int REPORT_ERROR_STR_EVENT_CROSS_PLATFORM = 20;
    public static final int REPORT_EVENT_API = 17;
    public static final int REPORT_LIFECYCLE_EVENT = 15;
    static final int REPORT_NAMED_EVENT = 4;
    public static final int REPORT_RAGE_TAP = 16;
    public static final int REPORT_SELF_MONITORING_EVENT = 13;
    static final int REPORT_USER_EVENT = 12;
    static final int WEBREQ_PLACEHOLDER = 110;
    private final AtomicInteger childEvents;
    private final AtomicInteger droppedEvents;
    protected boolean enabled;
    protected EventType eventType;
    private boolean forwardToGrail;
    protected int lcSeqNum;
    private long mCurrentTagId;
    protected long mEventEndTime;
    protected long mEventStartTime;
    protected boolean mFinalized;
    private String mName;
    protected long mParentTagId;
    private int mType;
    protected String mValue;
    protected CustomSegment parentAction;
    protected CustomSegment rootAction;
    protected int serverId;
    protected Session session;
    static AtomicInteger firstSendOccurred = new AtomicInteger(0);
    public static int NUMBER_OF_ALLOWED_USER_ACTIONS = 100;

    /* JADX INFO: renamed from: com.dynatrace.android.agent.CustomSegment$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$dynatrace$android$agent$EventType;

        static {
            int[] iArr = new int[EventType.values().length];
            $SwitchMap$com$dynatrace$android$agent$EventType = iArr;
            try {
                iArr[EventType.VALUE_DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.VALUE_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.VALUE_INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.NAMED_EVENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.IDENTIFY_USER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.ERROR_INT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.SELF_MONITORING_EVENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public CustomSegment(String str, int i, EventType eventType, long j, int i4, long j6, long j7, Session session, int i6, boolean z4) {
        this.mEventStartTime = -1L;
        this.mEventEndTime = -1L;
        this.mParentTagId = 0L;
        this.mFinalized = false;
        this.enabled = true;
        this.parentAction = null;
        this.rootAction = null;
        this.droppedEvents = new AtomicInteger(0);
        this.childEvents = new AtomicInteger(1);
        this.mName = "";
        this.session = session;
        this.mType = i;
        this.eventType = eventType;
        this.mEventStartTime = j6;
        this.mEventEndTime = j7;
        this.mParentTagId = j;
        this.mCurrentTagId = 0L;
        this.lcSeqNum = i4;
        this.serverId = i6;
        this.mFinalized = true;
        setName(str);
        if (j == 0) {
            session.updateLastInteractionTime(TimeLineProvider.getSystemTime());
        }
        this.forwardToGrail = z4;
    }

    private void generateCustomMessage(StringBuilder sb2) {
        sb2.append("&na=");
        sb2.append(Utility.urlEncode(getName()));
        sb2.append("&it=");
        sb2.append(Utility.getCurrentThreadId());
        sb2.append("&pa=");
        sb2.append(getParentTagId());
        sb2.append("&s0=");
        sb2.append(getLcSeqNum());
        sb2.append("&t0=");
        sb2.append(getStartTime());
    }

    private int totalEventsInTree() {
        return this.rootAction.childEvents.get();
    }

    public void appendOptionalValue(StringBuilder sb2, String str, String str2) {
        if (str2 != null) {
            sb2.append(str);
            if (str2.isEmpty()) {
                return;
            }
            sb2.append(str2);
        }
    }

    @Override // com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        StringBuilder sbW = androidx.camera.core.impl.a.w(SegmentConstants.E_ET);
        sbW.append(this.eventType.getProtocolId());
        switch (AnonymousClass1.$SwitchMap$com$dynatrace$android$agent$EventType[this.eventType.ordinal()]) {
            case 1:
                generateCustomMessage(sbW);
                sbW.append("&vl=");
                sbW.append(Utility.urlEncode(this.mValue));
                break;
            case 2:
                generateCustomMessage(sbW);
                appendOptionalValue(sbW, "&vl=", Utility.urlEncode(this.mValue));
                break;
            case 3:
                generateCustomMessage(sbW);
                sbW.append("&vl=");
                sbW.append(Utility.urlEncode(this.mValue));
                break;
            case 4:
                generateCustomMessage(sbW);
                break;
            case 5:
                generateCustomMessage(sbW);
                break;
            case 6:
                generateCustomMessage(sbW);
                sbW.append("&ev=");
                sbW.append(Utility.urlEncode(this.mValue));
                sbW.append("&tt=");
                sbW.append(PlatformType.CUSTOM.getProtocolValue());
                break;
            case 7:
                sbW.append("&na=");
                sbW.append(Utility.urlEncode(getName()));
                appendOptionalValue(sbW, "&pl=", Utility.urlEncode(this.mValue));
                sbW.append("&t0=");
                sbW.append(getStartTime());
                break;
        }
        sbW.append("&fw=");
        sbW.append(this.forwardToGrail ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        return sbW;
    }

    public void disable() {
        this.enabled = false;
        this.mFinalized = true;
    }

    public long getEndTime() {
        return this.mEventEndTime;
    }

    public EventType getEventType() {
        return this.eventType;
    }

    public int getLcSeqNum() {
        return this.lcSeqNum;
    }

    public String getName() {
        return this.mName;
    }

    public long getOverrideEndTime() {
        return 0L;
    }

    public long getParentTagId() {
        return this.mParentTagId;
    }

    public int getServerId() {
        return this.serverId;
    }

    public Session getSession() {
        return this.session;
    }

    public long getSessionRunningTime() {
        return this.session.getRunningTime();
    }

    public long getStartTime() {
        return this.mEventStartTime;
    }

    public long getTagId() {
        return this.mCurrentTagId;
    }

    public int getType() {
        return this.mType;
    }

    public int incrementAndGetDroppedEvents() {
        return this.rootAction.droppedEvents.incrementAndGet();
    }

    public void incrementChildEvents() {
        this.rootAction.childEvents.incrementAndGet();
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isFinalized() {
        return this.mFinalized;
    }

    public boolean isLimitNumberOfAllowedUserEventsExceed() {
        return totalEventsInTree() >= NUMBER_OF_ALLOWED_USER_ACTIONS;
    }

    public boolean nameMissing() {
        String str = this.mName;
        return str == null || str.isEmpty();
    }

    public void sendSfmForDroppedEventsIfNeeded() {
        if (this.parentAction != null || this.droppedEvents.get() == 0) {
            return;
        }
        Locale locale = Locale.US;
        SelfMonitoring.reportLogEvent("EventThrottlingActionTreeSizeLimit", "The root action with id " + this.mCurrentTagId + " has exceeded child limitation of " + NUMBER_OF_ALLOWED_USER_ACTIONS + ", discarded " + this.droppedEvents.get() + " child events");
    }

    public void setLcSeqNum(int i) {
        this.lcSeqNum = i;
    }

    public void setName(String str) {
        if (str == null) {
            this.mName = "";
        } else {
            this.mName = Utility.truncateString(str, 250);
        }
    }

    public void setParentTagId(long j) {
        this.mParentTagId = j;
    }

    public void setStartTime(long j) {
        this.mEventStartTime = j;
    }

    public void updateEndTime(long j) {
        if (this.mFinalized) {
            return;
        }
        this.mEventEndTime = j;
        this.mFinalized = true;
        if (this.mParentTagId == 0) {
            this.session.updateLastInteractionTime(TimeLineProvider.getSystemTime());
        }
    }

    public void updateEndTime() {
        long overrideEndTime = getOverrideEndTime();
        if (overrideEndTime > 0) {
            updateEndTime(overrideEndTime);
        } else {
            updateEndTime(getSessionRunningTime());
        }
    }

    public CustomSegment(String str, int i, EventType eventType, long j, Session session, int i4, boolean z4) {
        this.mEventStartTime = -1L;
        this.mEventEndTime = -1L;
        this.mParentTagId = 0L;
        this.mFinalized = false;
        this.enabled = true;
        this.parentAction = null;
        this.rootAction = null;
        this.droppedEvents = new AtomicInteger(0);
        this.childEvents = new AtomicInteger(1);
        this.mName = "";
        this.mCurrentTagId = 0L;
        this.session = session;
        this.mType = i;
        this.eventType = eventType;
        long runningTime = session.getRunningTime();
        this.mEventStartTime = runningTime;
        this.mEventEndTime = runningTime;
        this.mParentTagId = j;
        this.mCurrentTagId = Utility.getNextTagId();
        this.lcSeqNum = Utility.getEventSeqNum();
        this.serverId = i4;
        this.mFinalized = i != 5;
        setName(str);
        if (j == 0) {
            session.updateLastInteractionTime(TimeLineProvider.getSystemTime());
        }
        this.forwardToGrail = z4;
    }

    public CustomSegment(String str, int i, Session session, int i4, boolean z4) {
        this.mEventStartTime = -1L;
        this.mEventEndTime = -1L;
        this.mParentTagId = 0L;
        this.mFinalized = false;
        this.enabled = true;
        this.parentAction = null;
        this.rootAction = null;
        this.droppedEvents = new AtomicInteger(0);
        this.childEvents = new AtomicInteger(1);
        this.mName = "";
        this.mCurrentTagId = 0L;
        this.mType = i;
        this.mCurrentTagId = Utility.getNextTagId();
        this.session = session;
        this.serverId = i4;
        setName(str);
        this.forwardToGrail = z4;
    }
}
