package com.dynatrace.android.agent.crash;

import We.s;
import android.os.Process;
import com.dynatrace.android.agent.CrashReporter;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class CrashCatcher {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "CrashCatcher");
    public static volatile boolean registered = false;
    private static List<CrashListener> listeners = new CopyOnWriteArrayList();
    private static Thread.UncaughtExceptionHandler uncotExHandlers = null;
    private static Throwable theLastEx = null;

    public static class DTXAgentUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        private static DTXAgentUncaughtExceptionHandler theInstance = new DTXAgentUncaughtExceptionHandler();

        private DTXAgentUncaughtExceptionHandler() {
        }

        public static DTXAgentUncaughtExceptionHandler getInstance() {
            return theInstance;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            if (Global.DEBUG) {
                Utility.zlogI(CrashCatcher.LOGTAG, String.format("Uncaught exception occurred in %s[name=%s, id=%d, pid=%d]", thread.getClass().getName(), thread.getName(), Long.valueOf(Utility.getThreadId(thread)), Integer.valueOf(Process.myPid())));
            }
            if (CrashCatcher.theLastEx != th2) {
                Throwable unused = CrashCatcher.theLastEx = th2;
                CrashCatcher.notifyListeners(thread, th2);
            }
            if (CrashCatcher.uncotExHandlers != null) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = CrashCatcher.uncotExHandlers;
                if (Global.DEBUG) {
                    Utility.zlogI(CrashCatcher.LOGTAG, "Passing exception to ".concat(uncaughtExceptionHandler.getClass().getName()));
                }
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            }
        }
    }

    public static void installUncaughtExceptionHandler() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null && (defaultUncaughtExceptionHandler instanceof DTXAgentUncaughtExceptionHandler)) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "The agent crash handler is already registered.");
            }
        } else {
            uncotExHandlers = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(DTXAgentUncaughtExceptionHandler.getInstance());
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "Registered agent crash handler");
            }
            registered = true;
        }
    }

    public static void notifyListeners(Thread thread, Throwable th2) {
        CrashReporter.hasCrashed = true;
        if (!Dynatrace.getCaptureStatus()) {
            if (Global.DEBUG) {
                Utility.zlogI(LOGTAG, "Not reporting uncaught exception due to capturing state is off");
                return;
            }
            return;
        }
        for (CrashListener crashListener : listeners) {
            try {
                crashListener.notifyJavaCrash(thread, th2);
            } catch (Throwable th3) {
                if (Global.DEBUG) {
                    Utility.zlogE(LOGTAG, "Failed to process an uncaught exception by " + crashListener.toString(), th3);
                }
            }
        }
    }

    public static void registerUncaughtExceptionListener(CrashListener crashListener) {
        if (crashListener != null) {
            listeners.add(crashListener);
        }
    }

    public static void uninstallUncaughtExceptionHandler() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null && (defaultUncaughtExceptionHandler instanceof DTXAgentUncaughtExceptionHandler)) {
            Thread.setDefaultUncaughtExceptionHandler(uncotExHandlers);
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "Unregistered agent crash handler");
            }
        } else if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "There is no agent crash handler to be unregistered.");
        }
        registered = false;
    }

    public static void unregisterUncaughtExceptionListener(CrashListener crashListener) {
        if (crashListener != null) {
            listeners.remove(crashListener);
        }
    }

    public static void notifyListeners(String str, String str2, String str3, String str4) {
        if (!Dynatrace.getCaptureStatus()) {
            if (Global.DEBUG) {
                Utility.zlogI(LOGTAG, "Not reporting uncaught exception due to capturing state is off");
                return;
            }
            return;
        }
        for (CrashListener crashListener : listeners) {
            try {
                crashListener.notifyCustomCrash(str, str2, str3, str4);
            } catch (Throwable th2) {
                if (Global.DEBUG) {
                    Utility.zlogE(LOGTAG, "Failed to process an uncaught exception by " + crashListener.toString(), th2);
                }
            }
        }
    }
}
