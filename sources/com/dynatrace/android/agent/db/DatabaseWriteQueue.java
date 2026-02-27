package com.dynatrace.android.agent.db;

import We.s;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class DatabaseWriteQueue extends Thread {
    private static final long POLL_BATCH_TIME = 250;
    private static final int STOP_THREAD_WAIT_TIME = 1000;
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "DatabaseWriteQueue");
    private static AtomicBoolean active = new AtomicBoolean(false);
    private static volatile DatabaseWriteQueue theInstance;
    private BlockingQueue<DatabaseRecord> queue = new LinkedBlockingQueue();

    public static class DatabaseRecord {
        public String appId;
        public int eventId;
        public long eventStart;
        public String sOa;
        public String sObvc;
        public int serverId;
        public Session session;

        public DatabaseRecord(String str, String str2, Session session, int i, long j, int i4, String str3) {
            this.sObvc = str;
            this.sOa = str2;
            this.session = session;
            this.eventId = i;
            this.eventStart = j;
            this.serverId = i4;
            this.appId = str3;
        }
    }

    private DatabaseWriteQueue() {
        setName(TAG);
    }

    public static DatabaseWriteQueue getInstance() {
        if (theInstance == null) {
            synchronized (DatabaseWriteQueue.class) {
                try {
                    if (theInstance == null) {
                        theInstance = new DatabaseWriteQueue();
                    }
                } finally {
                }
            }
        }
        return theInstance;
    }

    public void accept(DatabaseRecord databaseRecord) {
        this.queue.add(databaseRecord);
    }

    public synchronized void flushQueue() {
        try {
            LinkedList<DatabaseRecord> linkedList = new LinkedList<>();
            DatabaseRecord databaseRecordPoll = this.queue.poll();
            while (databaseRecordPoll != null) {
                linkedList.add(databaseRecordPoll);
                databaseRecordPoll = this.queue.poll();
            }
            if (!linkedList.isEmpty()) {
                Core.dao.insertBatchEvents(linkedList, AdkSettings.getInstance().getServerConfiguration());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "Database write queue running ...");
        }
        while (active.get()) {
            try {
                Thread.sleep(POLL_BATCH_TIME);
                flushQueue();
            } catch (Exception e) {
                if (Global.DEBUG) {
                    Utility.zlogE(TAG, e.toString(), e);
                    return;
                }
                return;
            }
        }
    }

    @Override // java.lang.Thread
    public void start() {
        if (active.get()) {
            return;
        }
        active.set(true);
        super.start();
    }

    public void stopThread() {
        active.set(false);
        synchronized (DatabaseWriteQueue.class) {
            theInstance = null;
        }
        if (isAlive()) {
            try {
                join(1000L);
            } catch (InterruptedException e) {
                if (Global.DEBUG) {
                    Utility.zlogE(TAG, e.toString());
                }
            }
            if (isAlive() && Global.DEBUG) {
                Utility.zlogD(TAG, "could not stop thread " + getName());
            }
        }
    }
}
