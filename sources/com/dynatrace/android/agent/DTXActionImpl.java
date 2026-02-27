package com.dynatrace.android.agent;

import We.s;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.events.error.ErrorEvent;
import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.PrivacyRules;
import com.dynatrace.android.agent.crash.JavaStacktraceProcessor;
import com.dynatrace.android.agent.crash.PlatformType;
import com.dynatrace.android.agent.crash.StacktraceData;
import com.dynatrace.android.agent.crash.StacktraceProcessorFactory;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.mixed.SessionInformationGenerator;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.net.HttpURLConnection;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DTXActionImpl extends CustomSegment implements DTXAction {
    private static final String DEPTH_WARNING = "Maximum depth of actions reached (10). Discarding creation of '%s'";
    public static final int MAX_DEPTH = 10;
    protected Vector<CustomSegment> childEventVector;
    protected int endActionSequenceNum;
    protected boolean forwardToGrail;
    int numberOfParentActions;
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "DTXActionImpl");
    private static ConcurrentHashMap<Long, Vector<CustomSegment>> orphanEvents = new ConcurrentHashMap<>();

    public DTXActionImpl(String str, EventType eventType, long j, Session session, int i, boolean z4, DTXActionImpl dTXActionImpl) {
        super(str, 5, eventType, j, session, i, z4);
        this.endActionSequenceNum = -1;
        this.childEventVector = new Vector<>();
        this.numberOfParentActions = 0;
        this.parentAction = dTXActionImpl;
        if (dTXActionImpl == null) {
            this.rootAction = this;
        } else {
            this.rootAction = dTXActionImpl.rootAction;
        }
        this.forwardToGrail = z4;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "New action " + str);
        }
        if (nameMissing()) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "The action name is null or empty hence this action will be deactivated");
            }
            disable();
        }
    }

    @Deprecated
    public static void addOrphanEvent(CustomSegment customSegment) {
        Configuration configuration = AdkSettings.getInstance().getConfiguration();
        if (configuration == null || configuration.mode != AgentMode.SAAS) {
            Vector<CustomSegment> vector = orphanEvents.get(Long.valueOf(Utility.getCurrentThreadId()));
            if (vector == null) {
                vector = new Vector<>();
                orphanEvents.put(Long.valueOf(Utility.getCurrentThreadId()), vector);
            }
            vector.add(customSegment);
        }
    }

    public static DTXAction createAction(String str, DTXAction dTXAction) {
        Session sessionDetermineActiveSession;
        int i;
        long j;
        DTXActionImpl dTXActionImpl = dTXAction instanceof DTXActionImpl ? (DTXActionImpl) dTXAction : null;
        if (dTXActionImpl != null) {
            long tagId = dTXActionImpl.getTagId();
            sessionDetermineActiveSession = dTXActionImpl.session;
            i = dTXActionImpl.serverId;
            j = tagId;
        } else {
            sessionDetermineActiveSession = Session.determineActiveSession(false);
            i = AdkSettings.getInstance().serverId;
            j = 0;
        }
        Session session = sessionDetermineActiveSession;
        int i4 = i;
        DTXActionImpl dTXActionImpl2 = new DTXActionImpl(str, EventType.ACTION_MANUAL, j, session, i4, true, dTXActionImpl);
        if (dTXActionImpl != null && dTXActionImpl.isFinished()) {
            dTXActionImpl2.disable();
        }
        if (j != 0) {
            int i6 = dTXActionImpl.numberOfParentActions + 1;
            dTXActionImpl2.numberOfParentActions = i6;
            if (i6 >= 10) {
                if (Global.DEBUG) {
                    Utility.zlogW(LOGTAG, "Maximum depth of actions reached (10). Discarding creation of '" + dTXActionImpl2.getName() + "'");
                }
                return dTXActionImpl2;
            }
            if (dTXActionImpl2.isLimitNumberOfAllowedUserEventsExceed()) {
                int iIncrementAndGetDroppedEvents = dTXActionImpl2.incrementAndGetDroppedEvents();
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, "Limit of actions is reached for user actions, dropped events: " + iIncrementAndGetDroppedEvents);
                }
                dTXActionImpl2.disable();
                return dTXActionImpl2;
            }
            dTXActionImpl.addChildEvent(dTXActionImpl2);
        }
        ActionThreadLocal.addAction(dTXActionImpl2);
        Core.addEvent(str, 1, j, dTXActionImpl2, session, i4, new String[0]);
        return dTXActionImpl2;
    }

    @Deprecated
    public static Vector<CustomSegment> getOrphanEvents() {
        Configuration configuration = AdkSettings.getInstance().getConfiguration();
        if (configuration == null || configuration.mode != AgentMode.SAAS) {
            return orphanEvents.remove(Long.valueOf(Utility.getCurrentThreadId()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reportError$0(String str, int i, RumEventDispatcher rumEventDispatcher) {
        PrivacyRules privacyRules = this.session.getPrivacyRules();
        EventType eventType = EventType.EVENT_API;
        if (!privacyRules.shouldCollectEvent(eventType)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "action reportError eventType shouldn't be collected, because of data collection level: " + eventType);
        } else {
            JSONObject jSONObjectGenerateErrorEvent = ErrorEvent.generateErrorEvent(str, i, true);
            if (jSONObjectGenerateErrorEvent != null) {
                rumEventDispatcher.dispatchEvent(jSONObjectGenerateErrorEvent, TimeLineProvider.getSystemTime(), 0L, SessionInformationGenerator.generate(this.session), true, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reportError$1(Throwable th2, String str, RumEventDispatcher rumEventDispatcher) {
        PrivacyRules privacyRules = this.session.getPrivacyRules();
        EventType eventType = EventType.EVENT_API;
        if (!privacyRules.shouldCollectEvent(eventType)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "action reportError eventType shouldn't be collected, because of data collection level: " + eventType);
        } else {
            JSONObject jSONObjectErrorExceptionEvent = ErrorEvent.errorExceptionEvent(th2, str, true);
            if (jSONObjectErrorExceptionEvent != null) {
                rumEventDispatcher.dispatchEvent(jSONObjectErrorExceptionEvent, TimeLineProvider.getSystemTime(), 0L, SessionInformationGenerator.generate(this.session), true, null);
            }
        }
    }

    public final void addChildEvent(CustomSegment customSegment) {
        if (customSegment == null || !customSegment.isEnabled()) {
            return;
        }
        incrementChildEvents();
        this.childEventVector.add(customSegment);
        notifyChildAdded(customSegment);
    }

    @Deprecated
    public void adoptOrphans() {
        Vector<CustomSegment> orphanEvents2 = getOrphanEvents();
        if (orphanEvents2 == null) {
            return;
        }
        for (CustomSegment customSegment : orphanEvents2) {
            if (customSegment.getStartTime() > getStartTime() && customSegment.getStartTime() < getEndTime()) {
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, getName() + " adopting " + customSegment.getName() + " tagId=" + customSegment.getTagId());
                }
                customSegment.setParentTagId(getTagId());
                addChildEvent(customSegment);
            } else if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, getName() + " not adopting " + customSegment.getName() + " tagId=" + customSegment.getTagId());
            }
        }
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void cancel() {
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Action '" + getName() + "' was canceled by the developer");
        }
        discardAction();
    }

    @Override // com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
    public StringBuilder createEventData() {
        StringBuilder sbW = androidx.camera.core.impl.a.w(SegmentConstants.E_ET);
        sbW.append(this.eventType.getProtocolId());
        sbW.append("&na=");
        sbW.append(Utility.urlEncode(getName()));
        sbW.append("&it=");
        sbW.append(Utility.getCurrentThreadId());
        sbW.append("&ca=");
        sbW.append(getTagId());
        sbW.append("&pa=");
        sbW.append(getParentTagId());
        sbW.append("&s0=");
        sbW.append(getLcSeqNum());
        sbW.append("&t0=");
        sbW.append(getStartTime());
        sbW.append("&s1=");
        sbW.append(this.endActionSequenceNum);
        sbW.append("&t1=");
        sbW.append(getEndTime() - getStartTime());
        sbW.append("&fw=");
        sbW.append(this.forwardToGrail ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        return sbW;
    }

    public void discardAction() {
        leaveAction(false);
    }

    public Vector<CustomSegment> getChildEventVector() {
        Vector<CustomSegment> vector;
        synchronized (this.childEventVector) {
            vector = new Vector<>(this.childEventVector);
        }
        return vector;
    }

    public WebReqTag getInternalRequestTag() {
        if (!getPreconditions() || !this.session.getPrivacyRules().shouldCollectEvent(EventType.WEB_REQUEST)) {
            return null;
        }
        if (!isLimitNumberOfAllowedUserEventsExceed()) {
            return new WebReqTag(getTagId(), this.serverId, this.session);
        }
        int iIncrementAndGetDroppedEvents = incrementAndGetDroppedEvents();
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Limit of actions is reached for web requests, dropped events: " + iIncrementAndGetDroppedEvents);
        }
        return null;
    }

    public int getNumberOfParentActions() {
        return this.numberOfParentActions;
    }

    public boolean getPreconditions() {
        if (isFinalized()) {
            return false;
        }
        if (this.numberOfParentActions < 10) {
            return Dynatrace.getCaptureStatus();
        }
        if (Global.DEBUG) {
            Utility.zlogW(LOGTAG, "Maximum depth of actions reached (10). Discarding creation of '" + getName() + "'");
        }
        return false;
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public String getRequestTag() {
        return WebReqTag.tagToString(getInternalRequestTag());
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final String getRequestTagHeader() {
        return Dynatrace.getRequestTagHeader();
    }

    public WebReqTag internalTagRequest(HttpURLConnection httpURLConnection) {
        WebReqTag webReqTagInternalTagRequest;
        if (httpURLConnection == null || (webReqTagInternalTagRequest = internalTagRequest()) == null) {
            return null;
        }
        try {
            httpURLConnection.setRequestProperty(Dynatrace.getRequestTagHeader(), webReqTagInternalTagRequest.toString());
            return webReqTagInternalTagRequest;
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogE(LOGTAG, e.toString());
            }
            return webReqTagInternalTagRequest;
        }
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final boolean isFinished() {
        return isFinalized();
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public void leaveAction() {
        leaveAction(true);
        sendSfmForDroppedEventsIfNeeded();
    }

    public void leaveInnerActions(boolean z4) {
        Vector<CustomSegment> vector = this.childEventVector;
        if (vector == null) {
            return;
        }
        synchronized (vector) {
            try {
                for (int size = this.childEventVector.size() - 1; size >= 0; size--) {
                    CustomSegment customSegment = this.childEventVector.get(size);
                    if (customSegment.getType() == 5) {
                        ((DTXActionImpl) customSegment).leaveAction(z4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void notifyChildAdded(CustomSegment customSegment) {
    }

    public void removeChildEvent(String str) {
        if (str == null) {
            return;
        }
        for (CustomSegment customSegment : getChildEventVector()) {
            if (customSegment.getName().equals(str)) {
                this.childEventVector.remove(customSegment);
                Core.removeFromCalloutTable(customSegment);
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, "Removing child: ".concat(str));
                    return;
                }
                return;
            }
        }
    }

    @Deprecated
    public void reportCrash(PlatformType platformType, String str, String str2, String str3) {
        Dynatrace.reportCrash(platformType, str, str2, str3);
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportError(String str, int i) {
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "reportError within action context, errorName: " + str + ", errorCode: " + i);
        if (str != null && getPreconditions()) {
            Core.GUARDED_EVENT_DISPATCHER.executeWithVerification(this.session, new G6.b(this, str, i, 5));
            addChildEvent(str, 9, String.valueOf(i));
        }
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportEvent(String str) {
        addChildEvent(str, 4, new String[0]);
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportValue(String str, int i) {
        addChildEvent(str, 6, String.valueOf(i));
    }

    @Override // com.dynatrace.android.agent.DTXAction
    @Deprecated
    public void tagRequest(HttpURLConnection httpURLConnection) {
        internalTagRequest(httpURLConnection);
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportValue(String str, long j) {
        addChildEvent(str, 6, String.valueOf(j));
    }

    public String tagRequest() {
        return WebReqTag.tagToString(internalTagRequest());
    }

    public void leaveAction(boolean z4) {
        DTXActionImpl dTXActionImpl;
        if (isFinalized()) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "Action " + getName() + " is already closed");
                return;
            }
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Action " + getName() + " closing ... saving=" + z4);
        }
        ActionThreadLocal.removeAction(this);
        boolean preconditions = getPreconditions();
        if (preconditions) {
            this.mEventEndTime = this.session.getRunningTime();
            adoptOrphans();
            leaveInnerActions(z4);
            this.endActionSequenceNum = Utility.getEventSeqNum();
            if (z4) {
                dTXActionImpl = this;
                Core.addEvent(getName(), 2, getParentTagId(), dTXActionImpl, this.session, this.serverId, new String[0]);
            } else {
                dTXActionImpl = this;
                updateEndTime();
                Core.removeFromCalloutTable(this);
            }
        } else {
            dTXActionImpl = this;
            leaveInnerActions(false);
            updateEndTime();
            Core.removeFromCalloutTable(this);
        }
        CustomSegment customSegment = dTXActionImpl.parentAction;
        if (customSegment != null && (customSegment instanceof DTXAutoAction)) {
            ((DTXAutoAction) customSegment).onLeaveAction(this);
        }
        if (Global.DEBUG) {
            String str = LOGTAG;
            Utility.zlogD(str, "Action " + getName() + " closed: shouldSave=" + z4 + " rc=" + preconditions);
            if (preconditions) {
                return;
            }
            Utility.zlogW(str, String.format("Discard %s tagId=%d capture state=%b", getName(), Long.valueOf(getTagId()), Boolean.valueOf(preconditions)));
        }
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportValue(String str, double d10) {
        addChildEvent(str, 7, String.valueOf(d10));
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportValue(String str, String str2) {
        addChildEvent(str, 8, str2);
    }

    private void addChildEvent(String str, int i, String... strArr) {
        if (getPreconditions()) {
            if (isLimitNumberOfAllowedUserEventsExceed()) {
                int iIncrementAndGetDroppedEvents = incrementAndGetDroppedEvents();
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, "Limit of actions is reached for reporting values, dropped events: " + iIncrementAndGetDroppedEvents);
                    return;
                }
                return;
            }
            CustomSegment customSegmentAddEvent = Core.addEvent(str, i, getTagId(), null, this.session, this.serverId, strArr);
            if (customSegmentAddEvent != null) {
                addChildEvent(customSegmentAddEvent);
            }
        }
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void reportError(String str, Throwable th2) {
        StacktraceData stacktraceDataProcess;
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "reportError within action context, errorName: " + str + ", throwable: " + th2);
        if (str != null && getPreconditions()) {
            if (th2 != null) {
                Core.GUARDED_EVENT_DISPATCHER.executeWithVerification(this.session, new Bb.c(20, this, th2, str));
            }
            int i = AdkSettings.getInstance().getConfiguration().mode == AgentMode.APP_MON ? 10 : Integer.MAX_VALUE;
            if (th2 == null) {
                stacktraceDataProcess = new StacktraceData(null, null, null, PlatformType.JAVA);
            } else {
                stacktraceDataProcess = new JavaStacktraceProcessor(th2, i).process();
            }
            addChildEvent(str, 10, stacktraceDataProcess.getName(), stacktraceDataProcess.getReason(), stacktraceDataProcess.getStacktrace(), stacktraceDataProcess.getType().getProtocolValue());
        }
    }

    public WebReqTag internalTagRequest() {
        WebReqTag internalRequestTag = getInternalRequestTag();
        if (internalRequestTag == null) {
            return null;
        }
        addChildEvent(new CustomSegment(internalRequestTag.toString(), 110, EventType.PLACEHOLDER, getTagId(), this.session, this.serverId, this.forwardToGrail));
        return internalRequestTag;
    }

    public void reportError(PlatformType platformType, String str, String str2, String str3, String str4) {
        if (platformType == null || str == null) {
            return;
        }
        addChildEvent(str, 20, Utility.truncateString(str2, 250), Utility.truncateString(str3, 1000), Utility.truncateString(str4, StacktraceProcessorFactory.MAX_STACKTRACE_LENGTH), platformType.getProtocolValue());
    }
}
