package com.dynatrace.android.agent;

import We.s;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.ConfigurationPreset;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.useraction.AppStartPlaceholderSegment;
import com.dynatrace.android.useraction.LifecyclePlaceholderSegment;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public class DTXAutoAction extends DTXActionImpl {
    private static final int INTERVAL = 100;
    private static volatile DTXAutoAction theAutoAction;
    private boolean abandonThis;
    private volatile int actionCount;
    private volatile long adjustedEndTime;
    private volatile boolean graceTimeOver;
    private volatile boolean hasDiscardedAppStart;
    private volatile boolean hasEvents;
    private volatile boolean haveAction;
    private volatile boolean haveWebReq;
    private boolean modifiedName;
    private volatile Timer theTimer;
    private volatile boolean waitTimeStarted;
    private volatile int webReqCount;
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "DTXAutoAction");
    static int graceTime = ConfigurationPreset.generateImproperConfiguration().graceTime;
    static int waitTime = ConfigurationPreset.generateImproperConfiguration().waitTime;
    static boolean sendEmptyActions = true;
    static UserActionModifier autoUserActionModifier = null;
    private static List<DTXAutoAction> outstandingGaua = Collections.synchronizedList(new ArrayList(5));

    /* JADX INFO: renamed from: com.dynatrace.android.agent.DTXAutoAction$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$dynatrace$android$agent$EventType;

        static {
            int[] iArr = new int[EventType.values().length];
            $SwitchMap$com$dynatrace$android$agent$EventType = iArr;
            try {
                iArr[EventType.VALUE_INT64.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.VALUE_DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.VALUE_STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.ERROR_INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.ERROR_EXCEPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$EventType[EventType.NAMED_EVENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public DTXAutoAction(String str, Session session, int i, boolean z4) {
        super(str, EventType.ACTION_AUTO, 0L, session, i, z4, null);
        this.adjustedEndTime = 0L;
        this.webReqCount = 0;
        this.actionCount = 0;
        this.haveWebReq = false;
        this.haveAction = false;
        this.hasEvents = false;
        this.hasDiscardedAppStart = false;
        this.waitTimeStarted = false;
        this.abandonThis = false;
        this.theTimer = null;
        this.modifiedName = false;
        Core.addEvent(str, 1, getParentTagId(), this, session, i, new String[0]);
    }

    private synchronized void bootGauaOff(DTXAutoAction dTXAutoAction, boolean z4) {
        if (theAutoAction == dTXAutoAction) {
            theAutoAction = null;
            if (z4 && dTXAutoAction != null) {
                outstandingGaua.add(dTXAutoAction);
            }
        }
    }

    public static void closeAll() {
        ArrayList arrayList;
        swapGaua(null);
        synchronized (outstandingGaua) {
            arrayList = new ArrayList(outstandingGaua);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((DTXAutoAction) it.next()).leaveAction();
            } catch (Exception e) {
                if (Global.DEBUG) {
                    Utility.zlogE(LOGTAG, "GAUA close all internal errors", e);
                }
            }
        }
    }

    public static DTXAutoAction createAutoAction(String str, Session session, int i) {
        return createAutoAction(str, session, i, true);
    }

    public static DTXAutoAction getAutoAction() {
        return theAutoAction;
    }

    private synchronized Timer getTimer(boolean z4) {
        Timer timer;
        try {
            if (z4) {
                if (this.theTimer != null) {
                    cancelTimer(this.theTimer);
                }
                timer = new Timer(LOGTAG);
                this.theTimer = timer;
            } else {
                timer = this.theTimer;
                this.theTimer = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return timer;
    }

    private boolean isAnEvent(CustomSegment customSegment) {
        switch (AnonymousClass2.$SwitchMap$com$dynatrace$android$agent$EventType[customSegment.getEventType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    private boolean isLoadingApplicationAction() {
        return getName().equals(Global.LOADING + AdkSettings.applName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTimerPop(int i) {
        int i4;
        boolean z4 = false;
        this.graceTimeOver = true;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA: onTimerPop for %s intv=%d WR=%d action=%d", getName(), Integer.valueOf(i), Integer.valueOf(this.webReqCount), Integer.valueOf(this.actionCount)));
        }
        if (!this.waitTimeStarted) {
            bootGauaOff(this, true);
        }
        if (this.webReqCount > 0 || this.actionCount > 0) {
            if (!this.waitTimeStarted) {
                this.waitTimeStarted = true;
                if (isLoadingApplicationAction() && this.actionCount > 0) {
                    AppStartPlaceholderSegment appStartPlaceholderSegment = null;
                    for (CustomSegment customSegment : getChildEventVector()) {
                        if (customSegment instanceof LifecyclePlaceholderSegment) {
                            z4 = true;
                        } else if (customSegment instanceof AppStartPlaceholderSegment) {
                            appStartPlaceholderSegment = (AppStartPlaceholderSegment) customSegment;
                        }
                    }
                    if (!z4 && appStartPlaceholderSegment != null) {
                        if (Global.DEBUG) {
                            Utility.zlogD(LOGTAG, "onUA: detected pending AppStart action after grace period; dropping AppStart action");
                        }
                        removeChildEvent(appStartPlaceholderSegment.getName());
                        this.hasDiscardedAppStart = true;
                        appStartPlaceholderSegment.discardAction();
                    }
                }
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, "onUA: starting waiting period for " + getName());
                }
                long sessionRunningTime = ((long) waitTime) - (getSessionRunningTime() - getStartTime());
                if (sessionRunningTime > 1000) {
                    i4 = 1000;
                } else if (sessionRunningTime < 0) {
                    i4 = 100;
                    sessionRunningTime = 0;
                } else {
                    i4 = 100;
                }
                long j = i4;
                startTimer(j, j, Math.round(sessionRunningTime / i4) - 1, true);
                return;
            }
            if (i > 0) {
                return;
            }
        }
        cancelTimer();
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "onUA: closing " + getName());
        }
        leaveAction();
    }

    public static void setAutoInstrProperties(Configuration configuration) {
        graceTime = configuration.graceTime;
        waitTime = configuration.waitTime;
        sendEmptyActions = configuration.sendEmptyAction;
        autoUserActionModifier = configuration.autoUserActionModifier;
    }

    private static synchronized DTXAutoAction swapGaua(DTXAutoAction dTXAutoAction) {
        DTXAutoAction dTXAutoAction2;
        dTXAutoAction2 = theAutoAction;
        theAutoAction = dTXAutoAction;
        if (dTXAutoAction2 != null) {
            outstandingGaua.add(dTXAutoAction2);
        }
        return dTXAutoAction2;
    }

    public void cancelGracefully() {
        this.abandonThis = true;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "AutoAction '" + getName() + "' was canceled by the developer");
        }
    }

    public void cancelTimer() {
        cancelTimer(getTimer(false));
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl, com.dynatrace.android.agent.CustomSegment, com.dynatrace.android.agent.Segment
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
        sbW.append("&mo=");
        sbW.append(this.modifiedName ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        sbW.append("&fw=");
        sbW.append(((DTXActionImpl) this).forwardToGrail ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        return sbW;
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public void discardAction() {
        this.abandonThis = true;
        leaveAction();
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public WebReqTag getInternalRequestTag() {
        if (this.graceTimeOver) {
            return null;
        }
        return super.getInternalRequestTag();
    }

    @Override // com.dynatrace.android.agent.CustomSegment
    public long getOverrideEndTime() {
        if (this.haveWebReq || this.haveAction) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, String.format("onUA: use adjusted eT=%d dur=%d", Long.valueOf(this.adjustedEndTime), Long.valueOf(this.adjustedEndTime - getStartTime())));
            }
            return this.adjustedEndTime;
        }
        if (this.adjustedEndTime <= 0) {
            return super.getOverrideEndTime();
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA (empty): use adjusted eT=%d dur=%d", Long.valueOf(this.adjustedEndTime), Long.valueOf(this.adjustedEndTime - getStartTime())));
        }
        return this.adjustedEndTime;
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public boolean getPreconditions() {
        return super.getPreconditions();
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl, com.dynatrace.android.agent.DTXAction
    public String getRequestTag() {
        return this.graceTimeOver ? Dynatrace.getRequestTag() : super.getRequestTag();
    }

    public boolean isAbandoned() {
        return this.abandonThis;
    }

    public boolean isGraceTimeOver() {
        return this.graceTimeOver;
    }

    public boolean isNameModified() {
        return this.modifiedName;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    @Override // com.dynatrace.android.agent.DTXActionImpl, com.dynatrace.android.agent.DTXAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void leaveAction() {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.DTXAutoAction.leaveAction():void");
    }

    public synchronized void markOverrideEndTime() {
        if (isFinalized()) {
            return;
        }
        this.adjustedEndTime = getSessionRunningTime();
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA: new eT=%d dur=%d", Long.valueOf(this.adjustedEndTime), Long.valueOf(this.adjustedEndTime - getStartTime())));
        }
    }

    public void modifyName(String str) {
        String name = getName();
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, s.l("changing the action name from '", name, "' to '", str, "'"));
        }
        setName(str);
        if (getName().equals(name)) {
            return;
        }
        this.modifiedName = true;
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public void notifyChildAdded(CustomSegment customSegment) {
        if (customSegment == null) {
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "onUA: add child " + customSegment.getName() + " to " + getName());
        }
        int type = customSegment.getType();
        if (type == 5) {
            this.actionCount++;
            this.haveAction = true;
        } else if (type != 100 && type != 110) {
            this.hasEvents = isAnEvent(customSegment);
        } else {
            this.webReqCount++;
            this.haveWebReq = true;
        }
    }

    public void onLeaveAction(DTXActionImpl dTXActionImpl) {
        if (getChildEventVector().contains(dTXActionImpl)) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, s.l("onUA: child ", dTXActionImpl.getName(), " of ", getName(), " done"));
            }
            markOverrideEndTime();
            this.actionCount--;
        }
    }

    public int onWrFinished(long j) {
        if (isFinalized()) {
            return this.webReqCount;
        }
        if (this.webReqCount > 0 && j == getTagId()) {
            markOverrideEndTime();
            this.webReqCount--;
        }
        return this.webReqCount;
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public void removeChildEvent(String str) {
        if (str.startsWith(WebReqTag.getTagPrefix())) {
            this.webReqCount--;
        } else {
            this.actionCount--;
        }
        super.removeChildEvent(str);
    }

    public void startTimer() {
        startTimer(graceTime);
        markOverrideEndTime();
    }

    public void startTimerIfNeeded() {
        if (this.theTimer == null) {
            startTimer(graceTime);
        }
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl, com.dynatrace.android.agent.DTXAction
    public void tagRequest(HttpURLConnection httpURLConnection) {
        if (this.graceTimeOver) {
            return;
        }
        super.tagRequest(httpURLConnection);
    }

    private void cancelTimer(Timer timer) {
        this.graceTimeOver = this.waitTimeStarted;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "onUA: cancel timer=" + timer + " graceTimeOver=" + this.graceTimeOver);
        }
        if (timer != null) {
            timer.cancel();
            timer.purge();
        }
    }

    public static DTXAutoAction createAutoAction(String str, Session session, int i, boolean z4) {
        DTXAutoAction dTXAutoAction = new DTXAutoAction(str, session, i, z4);
        swapGaua(dTXAutoAction);
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA: new GAUA %s @ %d", str, Long.valueOf(dTXAutoAction.getStartTime())));
        }
        if (autoUserActionModifier != null) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "invoking the AUA modifier on the current auto action");
            }
            autoUserActionModifier.modify(new ExposedUserAction(dTXAutoAction));
        }
        return dTXAutoAction;
    }

    public void startTimer(int i) {
        cancelTimer();
        if (i <= 0) {
            onTimerPop(0);
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "onUA: start grace period for " + getName());
        }
        long j = i;
        startTimer(j, j, 0, false);
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public String tagRequest() {
        if (this.graceTimeOver) {
            return Dynatrace.getRequestTag();
        }
        return super.tagRequest();
    }

    private void startTimer(long j, long j6, int i, boolean z4) {
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("onUA: startTimer for %s delay=%dms period=%dms #period=%d", getName(), Long.valueOf(j), Long.valueOf(j6), Integer.valueOf(i)));
        }
        TimerTask timerTask = new TimerTask(i, z4) { // from class: com.dynatrace.android.agent.DTXAutoAction.1
            int intervals;
            final /* synthetic */ boolean val$execOnEachInterval;
            final /* synthetic */ int val$numPeriods;

            {
                this.val$numPeriods = i;
                this.val$execOnEachInterval = z4;
                this.intervals = i;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                int i4 = this.intervals;
                if (i4 > 0) {
                    this.intervals = i4 - 1;
                    if (!this.val$execOnEachInterval) {
                        return;
                    }
                } else {
                    DTXAutoAction.this.cancelTimer();
                }
                DTXAutoAction.this.onTimerPop(this.intervals);
            }
        };
        for (int i4 = 3; i4 > 0; i4--) {
            try {
                getTimer(true).schedule(timerTask, j, j6);
                return;
            } catch (IllegalArgumentException unused) {
                return;
            } catch (IllegalStateException unused2) {
            }
        }
    }
}
