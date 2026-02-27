package com.dynatrace.android.agent;

import We.s;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CalloutTable {
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "CalloutTable");
    private long mSendTimeout;
    private List<CTElement> mTable = new ArrayList();
    private long mCurrentTimeout = 0;

    public class CTElement {
        private String actionId;
        private long timeout;

        public CTElement(CustomSegment customSegment, long j) {
            this.actionId = customSegment.getName() + customSegment.hashCode();
            this.timeout = j;
        }

        public static /* synthetic */ long access$006(CTElement cTElement) {
            long j = cTElement.timeout - 1;
            cTElement.timeout = j;
            return j;
        }

        public static /* synthetic */ long access$014(CTElement cTElement, long j) {
            long j6 = cTElement.timeout + j;
            cTElement.timeout = j6;
            return j6;
        }

        public static /* synthetic */ long access$022(CTElement cTElement, long j) {
            long j6 = cTElement.timeout - j;
            cTElement.timeout = j6;
            return j6;
        }
    }

    public CalloutTable(int i) {
        this.mSendTimeout = i;
    }

    public void addActionEvent(CustomSegment customSegment) {
        if (customSegment == null) {
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(TAG, String.format("Add segment %s (id=%d pid=%d) currTimeout=%s", customSegment.getName() + customSegment.hashCode(), Long.valueOf(customSegment.getTagId()), Long.valueOf(customSegment.getParentTagId()), Long.valueOf(this.mCurrentTimeout)));
        }
        synchronized (this.mTable) {
            try {
                long j = this.mSendTimeout - this.mCurrentTimeout;
                for (int i = 0; i < this.mTable.size(); i++) {
                    if (this.mTable.get(i).timeout >= j) {
                        CTElement.access$022(this.mTable.get(i), j);
                        this.mTable.add(i, new CTElement(customSegment, j));
                        return;
                    }
                    j -= this.mTable.get(i).timeout;
                }
                this.mTable.add(new CTElement(customSegment, j));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addOtherEvent() {
        synchronized (this.mTable) {
            try {
                if (this.mTable.size() > 0) {
                    return;
                }
                if (this.mCurrentTimeout == 0) {
                    this.mCurrentTimeout = this.mSendTimeout;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void changeSendEventTimeout(long j) {
        synchronized (this.mTable) {
            try {
                if (j == this.mSendTimeout) {
                    return;
                }
                this.mSendTimeout = j;
                if (this.mCurrentTimeout > j) {
                    if (this.mTable.size() > 0) {
                        CTElement.access$014(this.mTable.get(0), this.mCurrentTimeout - j);
                    }
                    this.mCurrentTimeout = j;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isItTimeToSend() {
        synchronized (this.mTable) {
            try {
                long j = this.mCurrentTimeout;
                boolean z4 = true;
                if (j > 0) {
                    long j6 = j - 1;
                    this.mCurrentTimeout = j6;
                    if (j6 != 0) {
                        z4 = false;
                    }
                    return z4;
                }
                if (this.mTable.size() <= 0 || CTElement.access$006(this.mTable.get(0)) != 0) {
                    return false;
                }
                do {
                    this.mTable.remove(0);
                    if (this.mTable.size() <= 0) {
                        break;
                    }
                } while (this.mTable.get(0).timeout == 0);
                return true;
            } finally {
            }
        }
    }

    public void purge() {
        synchronized (this.mTable) {
            this.mTable.clear();
            this.mCurrentTimeout = 0L;
        }
    }

    public boolean removeActionSendEvent(CustomSegment customSegment) {
        if (customSegment == null) {
            return false;
        }
        String str = customSegment.getName() + customSegment.hashCode();
        synchronized (this.mTable) {
            for (int i = 0; i < this.mTable.size(); i++) {
                try {
                    if (this.mTable.get(i).actionId.equals(str)) {
                        int i4 = i + 1;
                        if (i4 < this.mTable.size()) {
                            CTElement.access$014(this.mTable.get(i4), this.mTable.get(i).timeout);
                        } else if (this.mCurrentTimeout == 0) {
                            this.mCurrentTimeout = this.mTable.get(i).timeout;
                        }
                        return this.mTable.remove(i) != null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return false;
        }
    }

    public String toString() {
        String strH = s.h(this.mCurrentTimeout, Global.SEMICOLON, new StringBuilder());
        for (int i = 0; i < this.mTable.size(); i++) {
            strH = s.h(this.mTable.get(i).timeout, Global.SEMICOLON, androidx.camera.core.impl.a.w(strH));
        }
        return strH;
    }
}
