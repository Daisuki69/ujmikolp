package com.dynatrace.android.agent.db;

import We.s;
import android.content.Context;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class DataAccessObject {
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "DataAccessObject");
    private final EventsDbHelper eventsHelper;

    public DataAccessObject(Context context) {
        this(new EventsDbHelper(context));
    }

    public boolean deleteAllEvents() {
        try {
            return this.eventsHelper.deleteAllEvents();
        } catch (Exception e) {
            if (!Global.DEBUG) {
                return false;
            }
            Utility.zlogE(TAG, Global.DB_ERROR, e);
            return false;
        }
    }

    public synchronized void deleteEventsFromVisit(long j, int i) {
        try {
            this.eventsHelper.deleteEventsFromVisit(j, i);
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, Global.DB_ERROR, e);
            }
        }
    }

    public synchronized void deleteEventsWithMismatchAppId(String str) {
        try {
            this.eventsHelper.deleteEventsWithMismatchAppId(str);
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, Global.DB_ERROR, e);
            }
        }
    }

    public synchronized void deleteOldCrashes(int i) {
        try {
            this.eventsHelper.deleteEventsByEventId(EventsDbHelper.CRASH_EVENT_ID, i);
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogE(TAG, Global.DB_ERROR, e);
            }
        }
    }

    public synchronized void deleteOldEvents(long j, boolean z4) {
        try {
            this.eventsHelper.deleteEventsByDate(j - 540000, z4);
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogE(TAG, Global.DB_ERROR, e);
            }
        }
    }

    public synchronized void deleteSentEvents(MonitoringDataEntity monitoringDataEntity) {
        try {
            this.eventsHelper.deleteSentEvents(monitoringDataEntity.visitorId, monitoringDataEntity.sessionId, monitoringDataEntity.sequenceNumber, monitoringDataEntity.serverId, monitoringDataEntity.lastRowId);
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, Global.DB_ERROR, e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x013d, code lost:
    
        r41 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.dynatrace.android.agent.db.MonitoringDataEntity fetchEvents(long r43, com.dynatrace.android.agent.BasicSegment.UpdatableDataGenerator r45, long r46) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.db.DataAccessObject.fetchEvents(long, com.dynatrace.android.agent.BasicSegment$UpdatableDataGenerator, long):com.dynatrace.android.agent.db.MonitoringDataEntity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r3.eventsHelper.deleteEventsByEventId(r2, r5.getMaxCachedCrashesCount());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void insertBatchEvents(java.util.LinkedList<com.dynatrace.android.agent.db.DatabaseWriteQueue.DatabaseRecord> r4, com.dynatrace.android.agent.conf.ServerConfiguration r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.dynatrace.android.agent.db.EventsDbHelper r0 = r3.eventsHelper     // Catch: java.lang.Throwable -> L29
            r0.insertBatch(r4)     // Catch: java.lang.Throwable -> L29
            boolean r0 = r5.isCachingCrashes()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L3b
            r0 = 0
        Ld:
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L29
            if (r0 >= r1) goto L3b
            java.lang.Object r1 = r4.get(r0)     // Catch: java.lang.Throwable -> L29
            com.dynatrace.android.agent.db.DatabaseWriteQueue$DatabaseRecord r1 = (com.dynatrace.android.agent.db.DatabaseWriteQueue.DatabaseRecord) r1     // Catch: java.lang.Throwable -> L29
            int r1 = r1.eventId     // Catch: java.lang.Throwable -> L29
            int r2 = com.dynatrace.android.agent.db.EventsDbHelper.CRASH_EVENT_ID     // Catch: java.lang.Throwable -> L29
            if (r1 != r2) goto L38
            com.dynatrace.android.agent.db.EventsDbHelper r4 = r3.eventsHelper     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            int r5 = r5.getMaxCachedCrashesCount()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r4.deleteEventsByEventId(r2, r5)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            goto L3b
        L29:
            r4 = move-exception
            goto L3d
        L2b:
            r4 = move-exception
            boolean r5 = com.dynatrace.android.agent.Global.DEBUG     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L3b
            java.lang.String r5 = com.dynatrace.android.agent.db.DataAccessObject.TAG     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "Database error."
            com.dynatrace.android.agent.util.Utility.zlogD(r5, r0, r4)     // Catch: java.lang.Throwable -> L29
            goto L3b
        L38:
            int r0 = r0 + 1
            goto Ld
        L3b:
            monitor-exit(r3)
            return
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.db.DataAccessObject.insertBatchEvents(java.util.LinkedList, com.dynatrace.android.agent.conf.ServerConfiguration):void");
    }

    public synchronized boolean updateSessionProperties(Session session) {
        try {
        } catch (Exception e) {
            if (!Global.DEBUG) {
                return false;
            }
            Utility.zlogE(TAG, "can't update multiplicity", e);
            return false;
        }
        return this.eventsHelper.updateSrAndMultiplicity(session);
    }

    public DataAccessObject(EventsDbHelper eventsDbHelper) {
        this.eventsHelper = eventsDbHelper;
    }
}
