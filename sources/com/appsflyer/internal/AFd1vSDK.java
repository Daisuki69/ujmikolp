package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1vSDK implements Runnable {
    final ExecutorService AFInAppEventType;
    public Executor values = Executors.newSingleThreadExecutor();
    private Timer afInfoLog = new Timer(true);
    public final List<AFd1xSDK> AFKeystoreWrapper = new CopyOnWriteArrayList();
    final Set<AFd1uSDK> AFInAppEventParameterName = new CopyOnWriteArraySet();
    final Set<AFd1uSDK> valueOf = Collections.newSetFromMap(new ConcurrentHashMap());
    final NavigableSet<AFd1wSDK<?>> afErrorLog = new ConcurrentSkipListSet();
    final NavigableSet<AFd1wSDK<?>> afDebugLog = new ConcurrentSkipListSet();
    final List<AFd1wSDK<?>> afRDLog = new ArrayList();
    final Set<AFd1wSDK<?>> AFLogger = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1vSDK$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        private /* synthetic */ AFd1wSDK values;

        public AnonymousClass2(AFd1wSDK aFd1wSDK) {
            this.values = aFd1wSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zAdd;
            synchronized (AFd1vSDK.this.afErrorLog) {
                try {
                    if (AFd1vSDK.this.AFLogger.contains(this.values)) {
                        StringBuilder sb2 = new StringBuilder("QUEUE: tried to add already running task: ");
                        sb2.append(this.values);
                        AFLogger.afDebugLog(sb2.toString());
                        return;
                    }
                    if (!AFd1vSDK.this.afErrorLog.contains(this.values) && !AFd1vSDK.this.afDebugLog.contains(this.values)) {
                        AFd1vSDK aFd1vSDK = AFd1vSDK.this;
                        AFd1wSDK aFd1wSDK = this.values;
                        for (AFd1uSDK aFd1uSDK : aFd1wSDK.AFInAppEventType) {
                            if (aFd1vSDK.valueOf.contains(aFd1uSDK)) {
                                aFd1wSDK.AFInAppEventParameterName.add(aFd1uSDK);
                            }
                        }
                        if (AFd1vSDK.this.AFInAppEventParameterName(this.values)) {
                            zAdd = AFd1vSDK.this.afErrorLog.add(this.values);
                        } else {
                            zAdd = AFd1vSDK.this.afDebugLog.add(this.values);
                            if (zAdd) {
                                StringBuilder sb3 = new StringBuilder("QUEUE: new task was blocked: ");
                                sb3.append(this.values);
                                AFLogger.afDebugLog(sb3.toString());
                                this.values.AFKeystoreWrapper();
                            }
                        }
                        if (zAdd) {
                            AFd1vSDK aFd1vSDK2 = AFd1vSDK.this;
                            aFd1vSDK2.afErrorLog.addAll(aFd1vSDK2.afRDLog);
                            AFd1vSDK.this.afRDLog.clear();
                        } else {
                            StringBuilder sb4 = new StringBuilder("QUEUE: task not added, it's already in the queue: ");
                            sb4.append(this.values);
                            AFLogger.afDebugLog(sb4.toString());
                        }
                        if (!zAdd) {
                            StringBuilder sb5 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb5.append(this.values);
                            AFLogger.afWarnLog(sb5.toString());
                            return;
                        }
                        AFd1vSDK.this.valueOf.add(this.values.AFKeystoreWrapper);
                        StringBuilder sb6 = new StringBuilder("QUEUE: new task added: ");
                        sb6.append(this.values);
                        AFLogger.afDebugLog(sb6.toString());
                        for (AFd1xSDK aFd1xSDK : AFd1vSDK.this.AFKeystoreWrapper) {
                        }
                        AFd1vSDK aFd1vSDK3 = AFd1vSDK.this;
                        aFd1vSDK3.AFInAppEventType.submit(aFd1vSDK3);
                        AFd1vSDK aFd1vSDK4 = AFd1vSDK.this;
                        synchronized (aFd1vSDK4.afErrorLog) {
                            try {
                                for (int size = (aFd1vSDK4.afErrorLog.size() + aFd1vSDK4.afDebugLog.size()) - 40; size > 0; size--) {
                                    boolean zIsEmpty = aFd1vSDK4.afDebugLog.isEmpty();
                                    boolean zIsEmpty2 = aFd1vSDK4.afErrorLog.isEmpty();
                                    if (zIsEmpty2 || zIsEmpty) {
                                        if (!zIsEmpty2) {
                                            aFd1vSDK4.values(aFd1vSDK4.afErrorLog);
                                        } else if (!zIsEmpty) {
                                            aFd1vSDK4.values(aFd1vSDK4.afDebugLog);
                                        }
                                    } else if (aFd1vSDK4.afErrorLog.first().compareTo(aFd1vSDK4.afDebugLog.first()) > 0) {
                                        aFd1vSDK4.values(aFd1vSDK4.afErrorLog);
                                    } else {
                                        aFd1vSDK4.values(aFd1vSDK4.afDebugLog);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder("QUEUE: tried to add already scheduled task: ");
                    sb7.append(this.values);
                    AFLogger.afDebugLog(sb7.toString());
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public AFd1vSDK(ExecutorService executorService) {
        this.AFInAppEventType = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean AFInAppEventParameterName(AFd1wSDK<?> aFd1wSDK) {
        return this.AFInAppEventParameterName.containsAll(aFd1wSDK.AFInAppEventParameterName);
    }

    public static /* synthetic */ void AFInAppEventType(AFd1vSDK aFd1vSDK) {
        synchronized (aFd1vSDK.afErrorLog) {
            try {
                Iterator<AFd1wSDK<?>> it = aFd1vSDK.afDebugLog.iterator();
                boolean z4 = false;
                while (it.hasNext()) {
                    AFd1wSDK<?> next = it.next();
                    if (aFd1vSDK.AFInAppEventParameterName(next)) {
                        it.remove();
                        aFd1vSDK.afErrorLog.add(next);
                        z4 = true;
                    }
                }
                if (z4) {
                    aFd1vSDK.AFInAppEventType.submit(aFd1vSDK);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.afErrorLog) {
            try {
                final AFd1wSDK<?> aFd1wSDKPollFirst = this.afErrorLog.pollFirst();
                if (aFd1wSDKPollFirst == null) {
                    return;
                }
                this.AFLogger.add(aFd1wSDKPollFirst);
                long jValueOf = aFd1wSDKPollFirst.valueOf();
                AFd1pSDK aFd1pSDK = new AFd1pSDK(Thread.currentThread());
                if (jValueOf > 0) {
                    this.afInfoLog.schedule(aFd1pSDK, jValueOf);
                }
                this.values.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1vSDK.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator<AFd1xSDK> it = AFd1vSDK.this.AFKeystoreWrapper.iterator();
                        while (it.hasNext()) {
                            it.next().valueOf(aFd1wSDKPollFirst);
                        }
                    }
                });
                if (!this.afErrorLog.isEmpty()) {
                    this.AFInAppEventType.submit(this);
                }
                try {
                    AFLogger.afDebugLog("QUEUE: starting task execution: ".concat(String.valueOf(aFd1wSDKPollFirst)));
                    final AFd1tSDK aFd1tSDKCall = aFd1wSDKPollFirst.call();
                    aFd1pSDK.cancel();
                    this.values.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1vSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb2 = new StringBuilder("QUEUE: execution finished for ");
                            sb2.append(aFd1wSDKPollFirst);
                            sb2.append(", result: ");
                            sb2.append(aFd1tSDKCall);
                            AFLogger.afDebugLog(sb2.toString());
                            AFd1vSDK.this.AFLogger.remove(aFd1wSDKPollFirst);
                            Iterator<AFd1xSDK> it = AFd1vSDK.this.AFKeystoreWrapper.iterator();
                            while (it.hasNext()) {
                                it.next().AFInAppEventType(aFd1wSDKPollFirst, aFd1tSDKCall);
                            }
                            if (aFd1tSDKCall == AFd1tSDK.SUCCESS) {
                                AFd1vSDK.this.AFInAppEventParameterName.add(aFd1wSDKPollFirst.AFKeystoreWrapper);
                                AFd1vSDK.AFInAppEventType(AFd1vSDK.this);
                                return;
                            }
                            if (!aFd1wSDKPollFirst.AFInAppEventParameterName()) {
                                AFd1vSDK.this.AFInAppEventParameterName.add(aFd1wSDKPollFirst.AFKeystoreWrapper);
                                AFd1vSDK.AFInAppEventType(AFd1vSDK.this);
                                return;
                            }
                            synchronized (AFd1vSDK.this.afErrorLog) {
                                try {
                                    AFd1vSDK.this.afRDLog.add(aFd1wSDKPollFirst);
                                    for (AFd1xSDK aFd1xSDK : AFd1vSDK.this.AFKeystoreWrapper) {
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.afDebugLog("QUEUE: task was interrupted: ".concat(String.valueOf(aFd1wSDKPollFirst)));
                    final AFd1tSDK aFd1tSDK = AFd1tSDK.TIMEOUT;
                    aFd1wSDKPollFirst.values = aFd1tSDK;
                    this.values.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1vSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb2 = new StringBuilder("QUEUE: execution finished for ");
                            sb2.append(aFd1wSDKPollFirst);
                            sb2.append(", result: ");
                            sb2.append(aFd1tSDK);
                            AFLogger.afDebugLog(sb2.toString());
                            AFd1vSDK.this.AFLogger.remove(aFd1wSDKPollFirst);
                            Iterator<AFd1xSDK> it = AFd1vSDK.this.AFKeystoreWrapper.iterator();
                            while (it.hasNext()) {
                                it.next().AFInAppEventType(aFd1wSDKPollFirst, aFd1tSDK);
                            }
                            if (aFd1tSDK == AFd1tSDK.SUCCESS) {
                                AFd1vSDK.this.AFInAppEventParameterName.add(aFd1wSDKPollFirst.AFKeystoreWrapper);
                                AFd1vSDK.AFInAppEventType(AFd1vSDK.this);
                                return;
                            }
                            if (!aFd1wSDKPollFirst.AFInAppEventParameterName()) {
                                AFd1vSDK.this.AFInAppEventParameterName.add(aFd1wSDKPollFirst.AFKeystoreWrapper);
                                AFd1vSDK.AFInAppEventType(AFd1vSDK.this);
                                return;
                            }
                            synchronized (AFd1vSDK.this.afErrorLog) {
                                try {
                                    AFd1vSDK.this.afRDLog.add(aFd1wSDKPollFirst);
                                    for (AFd1xSDK aFd1xSDK : AFd1vSDK.this.AFKeystoreWrapper) {
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    });
                } catch (Throwable unused2) {
                    aFd1pSDK.cancel();
                    final AFd1tSDK aFd1tSDK2 = AFd1tSDK.FAILURE;
                    this.values.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1vSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb2 = new StringBuilder("QUEUE: execution finished for ");
                            sb2.append(aFd1wSDKPollFirst);
                            sb2.append(", result: ");
                            sb2.append(aFd1tSDK2);
                            AFLogger.afDebugLog(sb2.toString());
                            AFd1vSDK.this.AFLogger.remove(aFd1wSDKPollFirst);
                            Iterator<AFd1xSDK> it = AFd1vSDK.this.AFKeystoreWrapper.iterator();
                            while (it.hasNext()) {
                                it.next().AFInAppEventType(aFd1wSDKPollFirst, aFd1tSDK2);
                            }
                            if (aFd1tSDK2 == AFd1tSDK.SUCCESS) {
                                AFd1vSDK.this.AFInAppEventParameterName.add(aFd1wSDKPollFirst.AFKeystoreWrapper);
                                AFd1vSDK.AFInAppEventType(AFd1vSDK.this);
                                return;
                            }
                            if (!aFd1wSDKPollFirst.AFInAppEventParameterName()) {
                                AFd1vSDK.this.AFInAppEventParameterName.add(aFd1wSDKPollFirst.AFKeystoreWrapper);
                                AFd1vSDK.AFInAppEventType(AFd1vSDK.this);
                                return;
                            }
                            synchronized (AFd1vSDK.this.afErrorLog) {
                                try {
                                    AFd1vSDK.this.afRDLog.add(aFd1wSDKPollFirst);
                                    for (AFd1xSDK aFd1xSDK : AFd1vSDK.this.AFKeystoreWrapper) {
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void values(NavigableSet<AFd1wSDK<?>> navigableSet) {
        AFd1wSDK<?> aFd1wSDKPollFirst = navigableSet.pollFirst();
        this.AFInAppEventParameterName.add(aFd1wSDKPollFirst.AFKeystoreWrapper);
        Iterator<AFd1xSDK> it = this.AFKeystoreWrapper.iterator();
        while (it.hasNext()) {
            it.next().AFInAppEventType(aFd1wSDKPollFirst);
        }
    }
}
